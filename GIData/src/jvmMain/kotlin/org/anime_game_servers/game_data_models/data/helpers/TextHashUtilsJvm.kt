package org.anime_game_servers.game_data_models.data.helpers

fun getPathHash(basePath: String, vararg args: String): ULong {
    return getTextHash(String.format(basePath, *args))
}