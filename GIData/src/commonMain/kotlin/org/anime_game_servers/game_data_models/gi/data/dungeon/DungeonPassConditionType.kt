package org.anime_game_servers.game_data_models.gi.data.dungeon

import org.anime_game_servers.core.base.interfaces.IntKey

/**
 * TODO document
 */
enum class DungeonPassConditionType(val id: Int): IntKey {

    DUNGEON_COND_NONE(0),
    DUNGEON_COND_KILL_MONSTER(3),
    DUNGEON_COND_KILL_GROUP_MONSTER(5),
    DUNGEON_COND_KILL_TYPE_MONSTER(7),
    DUNGEON_COND_FINISH_QUEST(9),
    DUNGEON_COND_KILL_MONSTER_COUNT(11),
    DUNGEON_COND_IN_TIME(13),
    DUNGEON_COND_FINISH_CHALLENGE(14),
    DUNGEON_COND_END_MULTISTAGE_PLAY(15),
    DUNGEON_COND_UNKNOWN(9999);

    override fun getIntKey() = id
}