package org.anime_game_servers.game_data_models.loader

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.serializer
import java.nio.file.Path

actual val defaultIoDispatcher = Dispatchers.IO

actual class JsonDataLoader @JvmOverloads constructor(
    override val serializer: Json,
    override val basePaths: Map<AGDMFile, FolderType> = emptyMap()
) : BaseJsonDataLoader {

    fun <T> loadFileListJvm(path: String, deserializer: KSerializer<T>): List<T> {
        return runBlocking {
            loadFileList(path, deserializer)
        }
    }

    fun <T> getSerializer(jClass:Class<T>): KSerializer<T>? {
        return serializer(jClass) as? KSerializer<T>
    }

    override suspend fun getFile(path: String, vfs: AGDMFile?): AGDMFile {
        val jmvPath = Path.of(path)
        return JvmPathFile(jmvPath)
    }
}