package org.anime_game_servers.game_data_models.data.watcher

import org.anime_game_servers.game_data_models.data.interfaces.IntKey

// TODO
enum class PredicateType(val id: Int) : IntKey {
    PREDICATE_QUEST_FINISH(-1),
    PREDICATE_UNKNOWN(9999);

    override fun getIntKey() = id
}