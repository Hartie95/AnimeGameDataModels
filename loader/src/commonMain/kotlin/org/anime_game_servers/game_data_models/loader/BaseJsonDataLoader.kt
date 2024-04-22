@file:OptIn(ExperimentalSerializationApi::class)

package org.anime_game_servers.game_data_models.loader

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.io.Source
import kotlinx.io.readString
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json
import org.anime_game_servers.core.base.interfaces.StringKey

expect val defaultIoDispatcher: CoroutineDispatcher

interface AGDMFile{
    suspend fun exists(): Boolean
    suspend fun isFile(): Boolean
    suspend fun getBaseName(): String
    suspend fun isDirectory(): Boolean
    suspend fun getFile(path: String): AGDMFile
    suspend fun listFiles(): List<AGDMFile>
    suspend fun getSource(ioDispatcher: CoroutineDispatcher = defaultIoDispatcher): Source
}

expect class JsonDataLoader : BaseJsonDataLoader

interface BaseJsonDataLoader : DataLoader {

    val serializer: Json
    val basePaths: Map<AGDMFile, FolderType>

    suspend fun getFile(path: String, vfs: AGDMFile?): AGDMFile

    suspend fun <T> loadFolderObjectsMap(path: String, deserializer: KSerializer<T>, vfs: AGDMFile? = null): Map<String, T> {
        val file = getFile(path, vfs)
        if (!file.exists() || !file.isDirectory()) {
            throw IllegalArgumentException("File $path does not exist")
        }
        val map = mutableMapOf<String, T>()
        file.listFiles().forEach {
            val string = it.getSource().readString()
            val result = serializer.decodeFromString(deserializer, string)
            if(result is StringKey) {
                map[result.getStringKey()] = result
            } else{
                map[it.getBaseName()] = result
            }
        }
        return map
    }

    /**
     * Throws:
     * SerializationException - if the given JSON input cannot be deserialized to the value of type T.
     * okio.IOException - If an I/O error occurs and source can't be read from.
     * IllegalArgumentException - if the given path does not exist.
     */
    suspend fun <T> loadFolderObjectList(path: String, deserializer: KSerializer<T>, vfs: AGDMFile? = null): List<T> {
        val file = getFile(path, vfs)
        if (!file.exists() || !file.isDirectory()) {
            throw IllegalArgumentException("File $path does not exist")
        }

        val list = mutableListOf<T>()
        file.listFiles().forEach {
            val string = it.getSource().readString()
            list += serializer.decodeFromString(deserializer, string)
        }
        return list
    }

    suspend fun <T> loadFileObject(path: String, deserializer: KSerializer<T>, vfs: AGDMFile? = null): T {
        val file = getFile(path, vfs)

        if(!file.exists() || !file.isFile()) {
            throw IllegalArgumentException("File $path does not exist")
        }
        val string = file.getSource().readString()
        return serializer.decodeFromString(deserializer, string)
    }

    suspend fun <T> loadFileList(path: String, deserializer: KSerializer<T>, vfs: AGDMFile? = null): List<T> {
        return loadFileObject(path, ListSerializer(deserializer), vfs)
    }
}