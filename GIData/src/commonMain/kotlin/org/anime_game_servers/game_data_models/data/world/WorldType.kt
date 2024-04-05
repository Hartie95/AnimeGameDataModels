package org.anime_game_servers.game_data_models.data.world

import kotlinx.serialization.Serializable
import org.anime_game_servers.core.base.interfaces.IntKey

@Serializable
enum class WorldType(val id: Int) : IntKey {
    WORLD_NONE(0),

    /**
     * This a main world for the player, like scene 3
     */
    WORLD_PLAYER(1),

    /**
     * This is the Teapot default world
     */
    WORLD_HOME(2),

    /**
     * This is used when the type is unknown to the library, check the string version of the field to see what it contained
     */
    WORLD_UNKNOWN(9999);

    override fun getIntKey() = id
}