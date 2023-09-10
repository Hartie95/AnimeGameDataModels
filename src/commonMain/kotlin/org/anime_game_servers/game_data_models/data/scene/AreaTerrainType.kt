package org.anime_game_servers.game_data_models.data.scene

import kotlinx.serialization.Serializable
import org.anime_game_servers.game_data_models.data.interfaces.IntKey

@Serializable
enum class AreaTerrainType(val id: Int) : IntKey {
    AREA_TERRAIN_NONE(0),
    AREA_TERRAIN_CITY(1),
    AREA_TERRAIN_OUTDOOR(2),
    AREA_TERRAIN_UNKNOWN(9999);

    override fun getIntKey() = id
}