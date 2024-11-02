package org.anime_game_servers.game_data_models.loader

interface DataParser {
    val supportedTypes: List<FileType>
    suspend fun <T> parseModel(classInfo: DataClassInfo<T>, source:AGDMFile): T?
    suspend fun <T> parseList(classInfo: DataClassInfo<T>, source:AGDMFile): List<T>?
    suspend fun <T, K> parseMap(classInfo: DataClassInfo<T>, source:AGDMFile): Map<K, T>?
}