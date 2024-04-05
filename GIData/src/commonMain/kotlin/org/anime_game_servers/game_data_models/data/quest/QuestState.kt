package org.anime_game_servers.game_data_models.data.quest

import org.anime_game_servers.core.base.interfaces.IntKey

enum class QuestState(val id: Int) : IntKey {
    QUEST_STATE_NONE(0),
    QUEST_STATE_UNSTARTED(1),
    QUEST_STATE_UNFINISHED(2),
    QUEST_STATE_FINSHED(3),
    QUEST_STATE_FAILED(4),
    QUEST_STATE_UNKNOWN(9999);

    override fun getIntKey() = id
}