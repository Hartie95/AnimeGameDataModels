package org.anime_game_servers.game_data_models.data.scene

import kotlinx.serialization.Serializable
import org.anime_game_servers.game_data_models.data.interfaces.IntKey

/**
 * TODO find out what this used for
 */
@Serializable
enum class WorldAreaType(val id: Int) : IntKey {
    LEVEL_NONE(0),
    LEVEL_1(1),
    LEVEL_2(2),
    LEVEL_3(3),
    LEVEL_PLAY(10),
    LEVEL_UNKNOWN(9999);

    override fun getIntKey() = id
}