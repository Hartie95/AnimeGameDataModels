package org.anime_game_servers.game_data_models.data.scene

import org.anime_game_servers.game_data_models.data.interfaces.IntKey

enum class SceneSubType(val id: Int) : IntKey {
    SCENE_SUB_TYPE_NONE(0),
    SCENE_SUB_TYPE_PERSISTENT_DUNGEON(1),
    SCENE_SUB_TYPE_UNKNOWN(9999);

    override fun getIntKey() = id
}