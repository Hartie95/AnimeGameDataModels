package org.anime_game_servers.game_data_models.data.quest

import org.anime_game_servers.game_data_models.data.interfaces.IntKey

enum class QuestContentType(val id: Int) : IntKey {
    QUEST_CONTENT_NONE(0),

    /**
     * TODO document specifics
     * (currently unused on official)
     */
    QUEST_CONTENT_KILL_MONSTER(1),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_COMPLETE_TALK(2),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_MONSTER_DIE(3),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_FINISH_PLOT(4),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_OBTAIN_ITEM(5),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_TRIGGER_FIRE(6),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_CLEAR_GROUP_MONSTER(7),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_NOT_FINISH_PLOT(8),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_ENTER_DUNGEON(9),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_ENTER_MY_WORLD(10),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_FINISH_DUNGEON(11),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_DESTROY_GADGET(12),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_OBTAIN_MATERIAL_WITH_SUBTYPE(13),

    /**
     * TODO document specifics
     * (currently unused on official)
     */
    QUEST_CONTENT_NICK_NAME(14),

    /**
     * TODO document specifics
     * (currently unused on official)
     */
    QUEST_CONTENT_WORKTOP_SELECT(15),

    /**
     * TODO document specifics
     * (currently unused on official)
     */
    QUEST_CONTENT_SEAL_BATTLE_RESULT(16),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_ENTER_ROOM(17),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_GAME_TIME_TICK(18),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_FAIL_DUNGEON(19),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_LUA_NOTIFY(20),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_TEAM_DEAD(21),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_COMPLETE_ANY_TALK(22),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_UNLOCK_TRANS_POINT(23),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_ADD_QUEST_PROGRESS(24),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_INTERACT_GADGET(25),

    /**
     * TODO document specifics
     * (currently unused on official)
     */
    QUEST_CONTENT_DAILY_TASK_COMP_FINISH(26),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_FINISH_ITEM_GIVING(27),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_SKILL(107),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_CITY_LEVEL_UP(109),

    /**
     * TODO document specifics
     * (currently used in random quests on official)
     */
    QUEST_CONTENT_PATTERN_GROUP_CLEAR_MONSTER(110),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_ITEM_LESS_THAN(111),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_PLAYER_LEVEL_UP(112),

    /**
     * TODO document specifics
     * (currently unused on official)
     */
    QUEST_CONTENT_DUNGEON_OPEN_STATUE(113),

    /**
     * TODO document specifics
     * (currently unused on official)
     */
    QUEST_CONTENT_UNLOCK_AREA(114),

    /**
     * TODO document specifics
     * (currently unused on official)
     */
    QUEST_CONTENT_OPEN_CHEST_WITH_GADGET_ID(115),

    /**
     * TODO document specifics
     * (currently unused on official)
     */
    QUEST_CONTENT_UNLOCK_TRANS_POINT_WITH_TYPE(116),

    /**
     * TODO document specifics
     * (currently unused on official)
     */
    QUEST_CONTENT_FINISH_DAILY_DUNGEON(117),

    /**
     * TODO document specifics
     * (currently unused on official)
     */
    QUEST_CONTENT_FINISH_WEEKLY_DUNGEON(118),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_QUEST_VAR_EQUAL(119),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_QUEST_VAR_GREATER(120),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_QUEST_VAR_LESS(121),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_OBTAIN_VARIOUS_ITEM(122),

    /**
     * TODO document specifics
     * (currently unused on official)
     */
    QUEST_CONTENT_FINISH_TOWER_LEVEL(123),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_BARGAIN_SUCC(124),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_BARGAIN_FAIL(125),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_ITEM_LESS_THAN_BARGAIN(126),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_ACTIVITY_TRIGGER_FAILED(127),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_MAIN_COOP_ENTER_SAVE_POINT(128),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_ANY_MANUAL_TRANSPORT(129),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_USE_ITEM(130),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_MAIN_COOP_ENTER_ANY_SAVE_POINT(131),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_ENTER_MY_HOME_WORLD(132),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_ENTER_MY_WORLD_SCENE(133),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_TIME_VAR_GT_EQ(134),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_TIME_VAR_PASS_DAY(135),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_QUEST_STATE_EQUAL(136),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_QUEST_STATE_NOT_EQUAL(137),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_UNLOCKED_RECIPE(138),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_NOT_UNLOCKED_RECIPE(139),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_FISHING_SUCC(140),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_ENTER_ROGUE_DUNGEON(141),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_USE_WIDGET(142),

    /**
     * TODO document specifics
     * (currently unused on official)
     */
    QUEST_CONTENT_CAPTURE_SUCC(143),

    /**
     * TODO document specifics
     * (currently unused on official)
     */
    QUEST_CONTENT_CAPTURE_USE_CAPTURETAG_LIST(144),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_CAPTURE_USE_MATERIAL_LIST(145),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_ENTER_VEHICLE(147),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_SCENE_LEVEL_TAG_EQ(148),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_LEAVE_SCENE(149),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_LEAVE_SCENE_RANGE(150),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_IRODORI_FINISH_FLOWER_COMBINATION(151),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_IRODORI_POETRY_REACH_MIN_PROGRESS(152),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_IRODORI_POETRY_FINISH_FILL_POETRY(153),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_ACTIVITY_TRIGGER_UPDATE(154),

    /**
     * TODO document specifics
     */
    QUEST_CONTENT_GADGET_STATE_CHANGE(155),

    /**
     * An unknown condition type, check the representation string to get the missing enum values name
     */
    QUEST_CONTENT_UNKNOWN(9999);

    override fun getIntKey() = id
}