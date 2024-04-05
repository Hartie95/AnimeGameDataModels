package org.anime_game_servers.game_data_models.data.activity

import kotlinx.serialization.Serializable
import org.anime_game_servers.core.base.interfaces.IntKey

@Serializable
enum class ActivityShopSheetCondType(val id: Int) : IntKey {
    /**
     * This condition requires no other condition to be met, so it's always active.
     * This is the default if nothing else is set
     */
    ACTIVITY_SHOP_SHEET_COND_NONE(0),

    /**
     * This condition requires the user to have a quest completed before accessing a shop page. This is currently unused
     * param[0]: probably the quest id
     */
    ACTIVITY_SHOP_SHEET_COND_QUEST_FINISH(1),

    /**
     * This condition requires the day of the activity to be at least or more as the parameter.
     * param[0]: day it needs to be at least
     */
    ACTIVITY_SHOP_SHEET_COND_TIME_EQUAL_GREATER(2),

    /**
     * This condition requires the sea lamp/lantern rite event to be in a certain phase
     * param[0]: probably the phase it needs to be in
     */
    ACTIVITY_SHOP_SHEET_COND_SEA_LAMP_PHASE(3),

    /**
     * This represents a condition that's not yet implemented, check the string representation for the actual value that's missing
     */
    ACTIVITY_SHOP_SHEET_COND_UNKNOWN(9999);

    override fun getIntKey() = id
}