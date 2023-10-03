package org.anime_game_servers.game_data_models.loader

import kotlinx.coroutines.runBlocking
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.serializer

class JVMJsonDataLoader(serializer: Json) : JsonDataLoader(serializer, mapOf()) {

    fun <T> loadFileListJvm(path: String, deserializer: KSerializer<T>): List<T> {
        return runBlocking {
            loadFileList(path, deserializer)
        }
    }
    fun <T> getSerializer(jClass:Class<T>): KSerializer<T>? {
        return serializer(jClass) as? KSerializer<T>
    }
}