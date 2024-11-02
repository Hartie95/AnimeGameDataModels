package org.anime_game_servers.game_data_models.gi.helpers

import org.anime_game_servers.game_data_models.gi.helpers.getTextHash

fun getPathHash(basePath: String, vararg args: String): ULong {
    return getTextHash(String.format(basePath, *args))
}