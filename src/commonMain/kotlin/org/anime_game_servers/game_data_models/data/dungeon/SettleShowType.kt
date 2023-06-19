package org.anime_game_servers.game_data_models.data.dungeon

import org.anime_game_servers.game_data_models.data.interfaces.IntKey

enum class SettleShowType(val id: Int) : IntKey {
    SETTLE_SHOW_NONE(0),
    SETTLE_SHOW_TIME_COST(1),
    SETTLE_SHOW_OPEN_CHEST_COUNT(2),
    SETTLE_SHOW_KILL_MONSTER_COUNT(3),
    SETTLE_SHOW_BLACKSCREEN(4),
    SETTLE_SHOW_UNKNOWN(9999);

    override fun getIntKey() = id
}