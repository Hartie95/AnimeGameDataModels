package org.anime_game_servers.game_data_models.data.activity

import org.anime_game_servers.game_data_models.data.interfaces.IntKey

/**
 * This enum contains all types of conditions that can be used by an [ActivityCondData.ActivityConfigCondition].
 * They can either return true for valid or false for invalid.
 * @property id The int representation of this enum
 */
enum class ActivityCondition(val id: Int) : IntKey {
    NEW_ACTIVITY_COND_NONE(0),
    /**
     * Checks if the activity is open for more than a certain amount of days already
     * param [0]: number of days since the opening of the activity
     */
    NEW_ACTIVITY_COND_TIME_GREATER(1),
    /**
     * Checks if the activity is open for less than a certain amount of days already
     * param [0]: number of days since the opening of the activity
     */
    NEW_ACTIVITY_COND_TIME_LESS(2),
    /**
     * Checks if the players level/Adventure Rank is greater than a certain amount
     * param [0]: the level to check
     */
    NEW_ACTIVITY_COND_PLAYER_LEVEL_GREATER(3),
    /**
     * Checks if the has already completed a certain quest
     * param [0]: the subQuestId to check
     */
    NEW_ACTIVITY_COND_QUEST_FINISH(4),

    /**
     * Checks if the player has already completed a certain talk (currently unused)
     * param [0]: the talkId to check
     */
    NEW_ACTIVITY_COND_FINISH_TALK(5),
    /**
     * Checks if specific npcs are already active
     * param [%2==0]: the group the npcs is a part of
     * param [%2==1]: the id of the npc
     */
    NEW_ACTIVITY_COND_CREATE_NPC(6),
    /**
     * Checks if the player has not yet completed a certain talk
     * param [0]: the talkId to check
     */
    NEW_ACTIVITY_COND_NOT_FINISH_TALK(7),
    NEW_ACTIVITY_COND_SALESMAN_CAN_DELIVER(8),
    NEW_ACTIVITY_COND_SALESMAN_CAN_GET_REWARD(9),
    NEW_ACTIVITY_COND_ASTER_MID_CAMP_REFRESHABLE(10),
    /**
     * Checks if certain watchers are completed
     * param: list of watcher ids to check
     */
    NEW_ACTIVITY_COND_FINISH_WATCHER(11),
    /**
     * Checks if the amount of days since the start of the day is greater or equal to a certain amount
     * param [0]: days since the start of the day
     */
    NEW_ACTIVITY_COND_DAYS_GREAT_EQUAL(12),
    /**
     * Checks if the amount of days since the start of the day is less than a certain amount
     * param [0]: days since the start of the day
     */
    NEW_ACTIVITY_COND_DAYS_LESS(13),
    /**
     * Checks if the players level/Adventure Rank is at least a certain amount
     * param [0]: the level to check
     */
    NEW_ACTIVITY_COND_PLAYER_LEVEL_GREAT_EQUAL(14),
    NEW_ACTIVITY_COND_SCENE_MP_PLAY_ACTIVATED(15),
    NEW_ACTIVITY_COND_SEA_LAMP_POPULARIT(16),
    NEW_ACTIVITY_COND_SEA_LAMP_PHASE(17),
    NEW_ACTIVITY_COND_MECHANICUS_OPEN(18),
    NEW_ACTIVITY_COND_FINISH_REGION_SEARCH_LOGIC(19),
    NEW_ACTIVITY_COND_FINISH_REGION_SEARCH(20),
    NEW_ACTIVITY_COND_FINISH_WATER_SPIRIT_PHASE(21),
    NEW_ACTIVITY_COND_FINISH_FIND_HILICHURL_LEVEL_EQUAL(22),
    NEW_ACTIVITY_COND_FINISH_FIND_HILICHURL_LEVEL_LESS(23),
    NEW_ACTIVITY_COND_FINISH_CHANNELLER_SLAB_ONEOFF_DUNGEON_IN_STAGE(24),
    NEW_ACTIVITY_COND_FINISH_CHANNELLER_SLAB_ANY_ONEOFF_DUNGEON(25),
    NEW_ACTIVITY_COND_SEPCIFIED_ACTIVITY_END(26),
    /**
     * Checks if the player has unlocked certain scene points
     * param: list of scene point ids to check for
     */
    NEW_ACTIVITY_COND_UNLOCKED_ALL_LISTED_SCENE_POINTS(27),
    NEW_ACTIVITY_COND_TREASURE_MAP_BONUS_SPOT_GOT_ANY_FRAGMENT(28),
    NEW_ACTIVITY_COND_ITEM_COUNT_GREATER(29),
    /**
     * Checks if a global quest variable is greater than a certain amount
     * param [0]: the global variable to check
     * param [1]: the value to check against
     */
    NEW_ACTIVITY_COND_QUEST_GLOBAL_VAR_GREATER(30),
    /**
     * Checks if a global quest variable is less than a certain amount
     * param [0]: the global variable to check
     * param [1]: the value to check against
     */
    NEW_ACTIVITY_COND_QUEST_GLOBAL_VAR_LESS(31),
    /**
     * Checks if a global quest variable is equal to a certain amount
     * param [0]: the global variable to check
     * param [1]: the value to check against
     */
    NEW_ACTIVITY_COND_QUEST_GLOBAL_VAR_EQUAL(32),
    NEW_ACTIVITY_COND_FINISH_DIG_ACTIVITY(33),
    NEW_ACTIVITY_COND_GROUP_BUNDLE_FINISHED(34),
    NEW_ACTIVITY_COND_PLANT_FLOWER_CAN_DELIVER(35),
    NEW_ACTIVITY_COND_LUNA_RITE_ATMOSPHERE(36),
    NEW_ACTIVITY_COND_FINISH_HACHI_STAGE(37),
    NEW_ACTIVITY_COND_FINISH_CHANNELLER_SLAB_ANY_STAGE_ALL_CAMP(38),
    NEW_ACTIVITY_COND_FINISH_CHANNELLER_SLAB_APPOINTED_STAGE_ALL_CAMP(39),
    NEW_ACTIVITY_COND_HACHI_FINISH_STEALTH_STAGE_EQUAL(40),
    NEW_ACTIVITY_COND_HACHI_FINISH_BATTLE_STAGE_EQUAL(41),
    NEW_ACTIVITY_COND_FINISH_SALVAGE_STAGE(42),
    NEW_ACTIVITY_COND_FINISH_BARTENDER_LEVEL(43),
    NEW_ACTIVITY_COND_FINISH_POTION_ANY_LEVEL(44),
    NEW_ACTIVITY_COND_FINISH_CUSTOM_DUNGEON_OFFICIAL(45),
    NEW_ACTIVITY_COND_QUEST_FINISH_ALLOW_QUICK_OPEN(46),
    NEW_ACTIVITY_COND_FINISH_PHOTO_POS_ID(47),
    /**
     * Checks if the player has completed all music game levels from the current activity
     * no params
     */
    NEW_ACTIVITY_COND_FINISH_MUSIC_GAME_ALL_LEVEL(48),
    NEW_ACTIVITY_COND_CURRENT_LUMINANCE_STONE_CHALLENGE_STAGE(49),
    NEW_ACTIVITY_COND_LUMINANCE_STONE_CHALLENGE_FINAL_GALLERY_COMPLETE(50),
    NEW_ACTIVITY_COND_OFFERING_LEVEL_GREAT_EQUAL(51),
    NEW_ACTIVITY_COND_LUMINANCE_STONE_CHALLENGE_STAGE_GREAT_EQUAL(52),
    NEW_ACTIVITY_COND_FINISH_ANY_ARENA_CHALLENGE_LEVEL(53),
    NEW_ACTIVITY_COND_GACHA_CAN_CREATE_ROBOT(54),
    NEW_ACTIVITY_COND_FINISH_ANY_INSTABLE_SPRAY_CHALLENGE_STAGE(55),
    NEW_ACTIVITY_COND_TREASURE_SEELIE_FINISH_REGION(56),
    NEW_ACTIVITY_COND_FINISH_SEEK_PRESENT_STAGE(57),
    NEW_ACTIVITY_COND_FINISH_ROCK_BOARD_EXPLORE_STAGE(58),
    NEW_ACTIVITY_COND_VINTAGE_STORE_ROUND(59),
    NEW_ACTIVITY_COND_VINTAGE_MARKET_COIN_A(60),
    NEW_ACTIVITY_COND_VINTAGE_STORE_ROUND_SETTLE(61),
    NEW_ACTIVITY_COND_FUNGUS_FIGHTER_FINISH_CAMP (62),
    NEW_ACTIVITY_COND_EFFIGY_CHALLENGE_V2_FINISH_LEVEL_DIFFICULTY(63),
    NEW_ACTIVITY_COND_UNKNOWN(9999);

    override fun getIntKey() = id
}