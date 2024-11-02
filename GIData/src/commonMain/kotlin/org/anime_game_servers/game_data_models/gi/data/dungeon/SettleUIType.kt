package org.anime_game_servers.game_data_models.gi.data.dungeon

import org.anime_game_servers.core.base.interfaces.IntKey

enum class SettleUIType(val id: Int) : IntKey {
    SETTLE_UI_AlWAYS_SHOW(0),
    SETTLE_UI_ON_SUCCESS(1),
    SETTLE_UI_ON_FAIL(2),
    SETTLE_UI_NEVER_SHOW(3),
    SETTLE_UI_UNKNOWN(9999);

    override fun getIntKey() = id
}