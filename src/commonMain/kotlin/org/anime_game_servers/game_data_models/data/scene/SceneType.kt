package org.anime_game_servers.game_data_models.data.scene

import org.anime_game_servers.game_data_models.data.interfaces.IntKey

enum class SceneType(val id: Int) : IntKey {
    SCENE_NONE(0),
    SCENE_WORLD(1),
    SCENE_DUNGEON(2),
    SCENE_ROOM(3),
    SCENE_HOME_WORLD(4),
    SCENE_HOME_ROOM(5),
    SCENE_ACTIVITY(6),
    SCENE_UNKNOWN(9999);

    override fun getIntKey() = id
}