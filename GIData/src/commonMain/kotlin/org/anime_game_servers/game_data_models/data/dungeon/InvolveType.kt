package org.anime_game_servers.game_data_models.data.dungeon

import org.anime_game_servers.core.base.interfaces.IntKey

enum class InvolveType(val id: Int): IntKey {
    INVOLVE_NONE(0),
    INVOLVE_ONLY_SINGLE(1),
    INVOLVE_SINGLE_MULTIPLE(2),
    INVOLVE_DYNAMIC_MULTIPLE(3),
    INVOLVE_ONLY_MULTIPLE(4),
    INVOLVE_UNKNOWN(9999);

    override fun getIntKey() = id
}