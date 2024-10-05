package org.anime_game_servers.game_data_models.data.watcher

import org.anime_game_servers.core.base.interfaces.IntKey

// TODO
enum class PredicateType(val id: Int) : IntKey {
    PREDICATE_NONE(0),
    PREDICATE_QUEST_FINISH(1),
    PREDICATE_CURRENT_AVATAR(2),
    PREDICATE_GCG_LEVEL(3),
    PREDICATE_UNKNOWN(9999);

    override fun getIntKey() = id
}