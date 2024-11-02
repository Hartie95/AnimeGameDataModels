package org.anime_game_servers.game_data_models.gi.data.scene

import org.anime_game_servers.core.base.interfaces.IntKey

enum class SceneSubType(val id: Int) : IntKey {
    SCENE_SUB_TYPE_NONE(0),
    SCENE_SUB_TYPE_PERSISTENT_DUNGEON(1),
    SCENE_SUB_TYPE_UGC_PLAY(2),
    SCENE_SUB_TYPE_UNKNOWN(9999);

    override fun getIntKey() = id
}