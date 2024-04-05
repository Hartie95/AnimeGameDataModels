package org.anime_game_servers.game_data_models.data.dungeon

import org.anime_game_servers.core.base.interfaces.IntKey

enum class DungeonStateType(val id: Int) : IntKey {
    DUNGEON_STATE_NONE(0),
    DUNGEON_STATE_RELEASE(1),
    DUNGEON_STATE_TEST(2),
    DUNGEON_STATE_UNKNOWN(9999);

    override fun getIntKey() = id
}