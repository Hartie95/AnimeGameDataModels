package org.anime_game_servers.game_data_models.gi.data.scene

import org.anime_game_servers.core.base.interfaces.IntKey

enum class SceneMpType(val id: Int) : IntKey {
    SCENE_MP_NONE(0),
    SCENE_MP_SINGLE_PLAYER_SINGLE_MODE(1),
    SCENE_MP_UNKNOWN(9999);

    override fun getIntKey() = id
}