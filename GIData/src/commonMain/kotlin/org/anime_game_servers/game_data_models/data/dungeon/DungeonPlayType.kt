package org.anime_game_servers.game_data_models.data.dungeon

import org.anime_game_servers.game_data_models.data.interfaces.IntKey

enum class DungeonPlayType(val id: Int): IntKey {

    DUNGEON_PLAY_TYPE_NONE(0),
    DUNGEON_PLAY_TYPE_FOGGY_MAZE(1),
    DUNGEON_PLAY_TYPE_TRIAL_AVATAR(2),
    DUNGEON_PLAY_TYPE_MIST_TRIAL(3),
    DUNGEON_PLAY_TYPE_UNKNOWN(9999);

    override fun getIntKey() = id
}