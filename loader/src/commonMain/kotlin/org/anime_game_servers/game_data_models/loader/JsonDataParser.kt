package org.anime_game_servers.game_data_models.loader

import kotlinx.io.readString
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json


class JsonDataParser(val serializer: Json): DataParser {
    override val supportedTypes: List<FileType> = listOf(FileType.JSON)

    override suspend fun <T> parseList(classInfo: DataClassInfo<T>, source: AGDMFile): List<T>? {
        return loadFileObject(ListSerializer(classInfo.serializer), source)
    }

    override suspend fun <T, K> parseMap(classInfo: DataClassInfo<T>, source: AGDMFile): Map<K, T>? {
        TODO("Not yet implemented")
    }

    override suspend fun <T> parseModel(classInfo: DataClassInfo<T>, source: AGDMFile): T? {
        return loadFileObject(classInfo.serializer, source)
    }

    suspend fun <T> loadFileObject(deserializer: KSerializer<T>, source: AGDMFile): T {
        val string = source.getSource().readString()
        return serializer.decodeFromString(deserializer, string)
    }
}