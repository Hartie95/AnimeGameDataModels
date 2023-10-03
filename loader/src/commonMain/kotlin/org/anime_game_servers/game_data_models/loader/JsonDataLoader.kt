@file:OptIn(ExperimentalSerializationApi::class)

package org.anime_game_servers.game_data_models.loader

import korlibs.io.async.CIO
import korlibs.io.async.launch
import korlibs.io.compression.zip.ZipFile
import korlibs.io.file.Vfs
import korlibs.io.file.VfsFile
import korlibs.io.file.baseName
import korlibs.io.file.std.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json
import kotlin.jvm.JvmOverloads

@OptIn(ExperimentalSerializationApi::class)
open class JsonDataLoader(val serializer: Json, val basePaths: Map<VfsFile, FolderType>) : DataLoader() {
    /*@JvmOverloads
    constructor(
        ignoreUnknownKeys: Boolean = true, isLenient: Boolean = false
    ) :
            this(Json { this.ignoreUnknownKeys = ignoreUnknownKeys })*/

    //constructor(serializer: Json, basePaths: Map<String, FolderType>) : this(serializer, basePaths.mapKeys { korlibs.io.file.std.applicationVfs[it.key] })

    /*override fun <T> loadFolderObjectsMap(path: Path, deserializer: KSerializer<T>): Map<String, T> {
        if (!fileSystem.exists(path)) {
            throw IllegalArgumentException("File $path does not exist")
        }
        val files = fileSystem.listOrNull(path)
        val map = mutableMapOf<String, T>()
        if (files != null) {
            for (file in files) {
                fileSystem.read(file) {
                    val obj = serializer.decodeFromBufferedSource(deserializer, this)
                    map[file.name] = obj
                }
            }
        }
        return map
    }*/

    /**
     * Throws:
     * SerializationException - if the given JSON input cannot be deserialized to the value of type T.
     * okio.IOException - If an I/O error occurs and source can't be read from.
     * IllegalArgumentException - if the given path does not exist.
     */
    /*override fun <T> loadFolderObjectList(path: Path, deserializer: KSerializer<T>): List<T> {
        if (!fileSystem.exists(path)) {
            throw IllegalArgumentException("File $path does not exist")
        }
        val files = fileSystem.listOrNull(path)
        val list = mutableListOf<T>()
        if (files != null) {
            for (file in files) {
                fileSystem.read(file) {
                    list += serializer.decodeFromBufferedSource(deserializer, this)
                }
            }
        }
        return list
    }


    override fun <T> loadFileObject(path: Path, deserializer: KSerializer<T>): T {
        if (!fileSystem.exists(path)) {
            throw IllegalArgumentException("File $path does not exist")
        }
        fileSystem.read(path) {
            return serializer.decodeFromBufferedSource(deserializer, this)
        }
    }*/
    interface FileSource {
        suspend fun getFile(path: String): AGDMFile
        suspend fun exists(path: String): Boolean
    }

    interface AGDMFile{
        suspend fun readBytes(): ByteArray
        suspend fun readString(): String

    }

    data class VFSFileSource(val vfs: VfsFile) : FileSource{
        constructor(path: String) : this(applicationVfs[path])

        override suspend fun getFile(path: String): AGDMFile {
            return VFSFile(vfs[path])
        }
        override suspend fun exists(path: String): Boolean {
            return vfs[path].exists()
        }
    }

    data class VFSFile(val file:VfsFile) : AGDMFile{
        override suspend fun readBytes(): ByteArray {
            return file.readBytes()
        }

        override suspend fun readString(): String {
            return file.readString()
        }
    }

    class ZipFileSource : FileSource{
        lateinit var zipFile: VfsFile
        suspend fun constructor(path: String){
            launch(Dispatchers.CIO) {
                zipFile = applicationVfs[path].openAsZip()
            }
        }

        override suspend fun getFile(path: String): AGDMFile {
            return VFSFile(zipFile[path])
        }
        override suspend fun exists(path: String): Boolean {
            return zipFile[path].exists()
        }

        /*override suspend fun listOrNull(path: String): List<String>? {
            return zipFile[path].list().toList().map { it.path }
        }*/
    }

    private fun getFile(path:String, vfs: Vfs?): VfsFile {
        return vfs?.file(path) ?: applicationVfs[path]
        ZipFile
    }

    suspend fun <T> loadFolderObjectsMap(path: String, deserializer: KSerializer<T>, vfs: Vfs? = null): Map<String, T> {
        val file = getFile(path, vfs)
        if (!file.exists() || !file.isDirectory()) {
            throw IllegalArgumentException("File $path does not exist")
        }
        val map = mutableMapOf<String, T>()
        file.list().collect {
            val string = it.readString()
            map[it.baseName] = serializer.decodeFromString(deserializer, string)
        }
        return map
    }

    /**
     * Throws:
     * SerializationException - if the given JSON input cannot be deserialized to the value of type T.
     * okio.IOException - If an I/O error occurs and source can't be read from.
     * IllegalArgumentException - if the given path does not exist.
     */
    suspend fun <T> loadFolderObjectList(path: String, deserializer: KSerializer<T>, vfs: Vfs? = null): List<T> {
        val file = getFile(path, vfs)
        if (!file.exists() || !file.isDirectory()) {
            throw IllegalArgumentException("File $path does not exist")
        }

        val list = mutableListOf<T>()
        file.list().collect {
            val string = it.readString()
            list += serializer.decodeFromString(deserializer, string)
        }
        return list
    }
    suspend fun <T> loadFileObject(path: String, deserializer: KSerializer<T>, vfs: Vfs? = null): T {
        val file = getFile(path, vfs)

        if(!file.exists() || !file.isFile()) {
            throw IllegalArgumentException("File $path does not exist")
        }
        val string = file.readString()
        return serializer.decodeFromString(deserializer, string)
    }

    @JvmOverloads
    suspend fun <T> loadFileList(path: String, deserializer: KSerializer<T>, vfs: Vfs? = null): List<T> {
        return loadFileObject(path, ListSerializer(deserializer), vfs)
    }
}