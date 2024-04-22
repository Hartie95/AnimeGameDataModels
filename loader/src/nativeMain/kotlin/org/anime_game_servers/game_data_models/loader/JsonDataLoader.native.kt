package org.anime_game_servers.game_data_models.loader

import kotlinx.coroutines.IO
import kotlinx.serialization.json.Json

actual val defaultIoDispatcher = kotlinx.coroutines.Dispatchers.IO

actual class JsonDataLoader(override val serializer: Json, override val basePaths: Map<AGDMFile, FolderType>) : BaseJsonDataLoader {
    override suspend fun getFile(path: String, vfs: AGDMFile?): AGDMFile {
        TODO("Not yet implemented")
    }
}