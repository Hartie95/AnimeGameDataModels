package org.anime_game_servers.game_data_models.data.scene

import kotlinx.serialization.Serializable
import org.anime_game_servers.game_data_models.data.interfaces.IntKey

@Serializable
enum class AreaTerrainType(val id: Int) : IntKey {
    /**
     * This is the default that should be used when not specified otherwise
     */
    AREA_TERRAIN_NONE(0),

    /**
     * This is used for city areas like mondstadt and liyue harbor
     */
    AREA_TERRAIN_CITY(1),

    /**
     * This is used for normal outdoor areas
     */
    AREA_TERRAIN_OUTDOOR(2),

    /**
     * This is used when the type is unknown to the library, check the string version of the field to see what it contained
     */
    AREA_TERRAIN_UNKNOWN(9999);

    override fun getIntKey() = id
}