package org.anime_game_servers.game_data_models.loader

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import kotlinx.io.*
import java.io.File
import java.nio.file.FileSystem
import java.nio.file.FileSystems
import java.nio.file.Files
import java.nio.file.Path
import java.util.zip.ZipFile
import kotlin.io.path.exists
import kotlin.io.path.isDirectory
import kotlin.io.path.nameWithoutExtension

class JvmZipPathFile(val path: Path, val zipFs: FileSystem) : AGDMFile {
    constructor(path: String, zipFs: FileSystem) : this(zipFs.getPath(path), zipFs)
    override suspend fun exists() = path.exists()

    override suspend fun isFile() = path.exists() && !path.isDirectory()

    override suspend fun getBaseName() = path.nameWithoutExtension

    override suspend fun isDirectory() = path.isDirectory()

    override suspend fun getFile(targetPath: String): AGDMFile {
        val jvmPath = path.resolve(targetPath)
        return JvmZipPathFile(jvmPath, zipFs)
    }

    override suspend fun listFiles(): List<AGDMFile> {
        if(!path.isDirectory()){
            return emptyList()
        }
        // todo implement for zip files
        return path.toFile().listFiles()?.map { JvmZipPathFile(it.toPath(), zipFs) } ?: emptyList()
    }

    override suspend fun getSource(ioDispatcher: CoroutineDispatcher): Source {
        return withContext(ioDispatcher) {
            Files.newInputStream(path)
        }.asSource().buffered()
    }

    override suspend fun getSink(ioDispatcher: CoroutineDispatcher): Sink {
        return withContext(ioDispatcher) {
            Files.newOutputStream(path)
        }.asSink().buffered()
    }

    override fun close() {
        // no-op
    }
}