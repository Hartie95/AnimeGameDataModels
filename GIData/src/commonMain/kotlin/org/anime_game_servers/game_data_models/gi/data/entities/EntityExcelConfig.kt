package org.anime_game_servers.game_data_models.gi.data.entities

import org.anime_game_servers.game_data_models.gi.data.general.TextHash
import org.anime_game_servers.game_data_models.gi.data.general.TextMapHash

interface EntityExcelConfig {
    val id: Int
    val camp: Int
    val lodPatternName: String?

    //TextHashMap
    val nameTextMapHash: TextMapHash

    //TextHash
    val prefabPathHash: TextHash
    val prefabPathRemoteHash: TextHash
    val controllerPathHash: TextHash
    val controllerPathRemoteHash: TextHash
}