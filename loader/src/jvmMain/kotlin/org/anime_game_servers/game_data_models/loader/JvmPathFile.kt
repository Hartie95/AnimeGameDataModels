package org.anime_game_servers.game_data_models.loader

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import kotlinx.io.*
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.exists
import kotlin.io.path.isDirectory
import kotlin.io.path.nameWithoutExtension

class JvmPathFile(val path: Path) : AGDMFile {
    override suspend fun exists() = path.exists()

    override suspend fun isFile() = path.exists() && !path.isDirectory()

    override suspend fun getBaseName() = path.nameWithoutExtension

    override suspend fun isDirectory() = path.isDirectory()

    override suspend fun getFile(targetPath: String): AGDMFile {
        val jvmPath = path.resolve(targetPath)
        return JvmPathFile(jvmPath)
    }

    override suspend fun listFiles(): List<AGDMFile> {
        if(!path.isDirectory()){
            return emptyList()
        }
        return path.toFile().listFiles()?.map { JvmPathFile(it.toPath()) } ?: emptyList()
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
        // Nothing to do here
    }
}