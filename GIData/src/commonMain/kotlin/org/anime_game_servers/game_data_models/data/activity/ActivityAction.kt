package org.anime_game_servers.game_data_models.data.activity

import org.anime_game_servers.core.base.interfaces.IntKey

/**
 * This enum contains all action an ActivityCond can trigger. These can be triggered on valid or invalid conditions.
 * @property id The int representation of this enum
 */
enum class ActivityAction(val id: Int) : IntKey {
    ACTIVITY_ACTION_NONE(0),

    /**
     * Unlocks a scene point on the map
     * param [0]: scene point id to unlock
     * param [1]: (optional) the scene id to unlock the point in
     * */
    ACTIVITY_ACTION_UNLOCK_POINT(1),

    /** Locks a scene point on the map
     * param [0]: scene point id to lock
     * param [1]: (optional) the scene id to lock the point in
     */
    ACTIVITY_ACTION_LOCK_POINT(2),

    /**
     * Force accepts a quest
     * param: List of subQuestId to accept
     */
    ACTIVITY_ACTION_ACCEPT_QUEST(3),

    /**
     * Force cancels a quest
     * param: List of mainQuestIds to stop
     */
    ACTIVITY_ACTION_CANCEL_QUEST(4),

    /**
     * Disables scene groups
     * param: list of group ids to block
     */
    ACTIVITY_ACTION_FORBID_GROUP(5),

    /**
     * Activates scene groups
     * param: list of group ids to activate
     */
    ACTIVITY_ACTION_ACTIVE_GROUP(6),
    ACTIVITY_ACTION_OPEN_MP_PLAY(7),
    ACTIVITY_ACTION_CLOSE_MP_PLAY(8),
    ACTIVITY_ACTION_OPEN_ASTER_PHASE(9),
    ACTIVITY_ACTION_ACTIVATE_SCENE_MP_PLAY(10),
    ACTIVITY_ACTION_OPEN_SCENE_MP_PLAY(11),
    ACTIVITY_ACTION_CLOSE_SCENE_MP_PLAY(12),
    ACTIVITY_ACTION_CLOSE_ASTER_PHASE(13),
    ACTIVITY_ACTION_CLOSE_ASTER_CONTENT(14),
    ACTIVITY_ACTION_OPEN_DRAGON_SPINE_PHASE(15),
    ACTIVITY_ACTION_CLOSE_DRAGON_SPINE_CONTENT(16),

    /**
     * Loads dynamic groups
     * param: List of group ids to load
     */
    ACTIVITY_ACTION_LOAD_DYNAMIC_GROUP(17),

    /**
     * Unloads dynamic groups
     * param: List of group ids to unload
     */
    ACTIVITY_ACTION_UNLOAD_DYNAMIC_GROUP(18),
    ACTIVITY_ACTION_ACTIVATE_SALE(19),
    ACTIVITY_ACTION_DEACTIVATE_SALE(20),
    ACTIVITY_ACTION_SEA_LAMP_OPEN_PHASE(21),
    ACTIVITY_ACTION_SEA_LAMP_CLOSE(22),
    ACTIVITY_ACTION_ACTIVATE_BLESSING(25),
    ACTIVITY_ACTION_CLOSE_BLESSING_CONTENT(26),
    ACTIVITY_ACTION_REFRESH_GROUP_SUITE(27),
    ACTIVITY_ACTION_OPEN_MECHANICUS(28),
    ACTIVITY_ACTION_CLOSE_MECHANICUS(29),
    ACTIVITY_ACTION_OPEN_MECHANICUS_SEQUENCE(30),
    ACTIVITY_ACTION_CLOSE_EXPEDITION_CONTENT(31),
    ACTIVITY_ACTION_FLEUR_FAIR_OPEN_MINIGAME(32),
    ACTIVITY_ACTION_CLOSE_FLEUR_FAIR_CONTENT(33),
    ACTIVITY_ACTION_FLEUR_FAIR_OPEN_DUNGEON_SECTION(34),
    ACTIVITY_ACTION_OPEN_REGION_SEARCH(35),
    ACTIVITY_ACTION_CLOSE_REGION_SEARCH(36),
    ACTIVITY_ACTION_UNLOCK_FLEUR_FAIR_DUNGEON(37),
    ACTIVITY_ACTION_OPEN_WEATHER_AREA(38),
    ACTIVITY_ACTION_CLOSE_WEATHER_AREA(39),
    ACTIVITY_ACTION_SET_SCORE_LIMIT(40),
    ACTIVITY_ACTION_OPEN_CHANNELLER_SLAB_STAGE(41),
    ACTIVITY_ACTION_CLOSE_CHANNELLER_SLAB_STAGE(42),
    ACTIVITY_ACTION_CLOSE_FIND_HILICHURL_STAGE(43),
    ACTIVITY_ACTION_REGISTER_GAME_TIME_DYNAMIC_GROUP(44),
    ACTIVITY_ACTION_UNREGISTER_GAME_TIME_DYNAMIC_GROUP(45),
    ACTIVITY_ACTION_OPEN_MIST_TRIAL_DUNGEON_CHALLENGE(46),
    ACTIVITY_ACTION_SEND_MAIL(47),
    ACTIVITY_ACTION_OPEN_CHANNELLER_SLAB_LOOP_DUNGEON_STAGE(48),
    ACTIVITY_ACTION_CLOSE_CHANNELLER_SLAB_LOOP_DUNGEON_STAGE(49),
    ACTIVITY_ACTION_OPEN_CHANNELLER_SLAB_LOOP_DUNGEON(50),
    ACTIVITY_ACTION_OPEN_HIDE_AND_SEEK(51),
    ACTIVITY_ACTION_CLOSE_HIDE_AND_SEEK(52),
    ACTIVITY_ACTION_OPEN_SUMMER_TIME_STAGE(53),
    ACTIVITY_ACTION_CLOSE_SUMMER_TIME_CONTENT(54),
    ACTIVITY_ACTION_OPEN_BOUNCE_CONJURING_STAGE(55),
    ACTIVITY_ACTION_CLOSE_BOUNCE_CONJURING_STAGE(56),

    /**
     * Unlocks a scene tag for the player
     * param [0]: the scene id to add the tag for
     * param [1]: the tag id to add
     */
    ACTIVITY_ACTION_ADD_SCENE_TAG(57),

    /**
     * Removes a scene tag from the players map
     * param [0]: the scene id to remove the tag from
     * param [1]: the tag id to remove
     */
    ACTIVITY_ACTION_DEL_SCENE_TAG(58),
    ACTIVITY_ACTION_MODIFY_ACTIVITY_COND_DEFAULT(59),
    ACTIVITY_ACTION_HIDE_SCENE_POINT(60),
    ACTIVITY_ACTION_SHOW_SCENE_POINT(61),
    ACTIVITY_ACTION_OPEN_BLITZ_RUSH_STAGE(62),
    ACTIVITY_ACTION_CLOSE_BLITZ_RUSH_CONTENT(63),
    ACTIVITY_ACTION_LOCK_PLAYER_WORLD_SCENE(64),
    ACTIVITY_ACTION_UNLOCK_PLAYER_WORLD_SCENE(65),
    ACTIVITY_ACTION_CLOSE_SEA_MIST(66),
    ACTIVITY_ACTION_OPEN_SUMO_STAGE(67),
    ACTIVITY_ACTION_REGISTER_GROUP_BUNDLE(68),
    ACTIVITY_ACTION_UNLOCK_SUMO_DUNGEON(69),
    ACTIVITY_ACTION_CLOSE_CHESS_CONTENT(70),
    ACTIVITY_ACTION_DISABLE_TRANSFER_POINT_INTERACTION(71),
    ACTIVITY_ACTION_ENABLE_TRANSFER_POINT_INTERACTION(72),
    ACTIVITY_ACTION_UNREGISTER_GROUP_BUNDLE(73),
    ACTIVITY_ACTION_OPEN_BLITZ_RUSH_DUNGEON(74),
    ACTIVITY_ACTION_OPEN_DIG_ACITVITY_STAGE(75),
    ACTIVITY_ACTION_UNLOCK_MUSIC_BY_MUSIC_GAME_ACTIVITY(76),
    ACTIVITY_ACTION_CLOSE_PLANT_FLOWER_CONTENT(77),
    ACTIVITY_ACTION_OPEN_ROGUELIKE_DUNGEON_STAGE(78),
    ACTIVITY_ACTION_CLOSE_ROGUELIKE_DUNGEON_CONTENT(79),
    ACTIVITY_ACTION_OPEN_HACHI_STAGE(80),
    ACTIVITY_ACTION_OPEN_WINTER_CAMP_EXPLORE(81),
    ACTIVITY_ACTION_OPEN_WINTER_CAMP_BATTLE(82),
    ACTIVITY_ACTION_OPEN_WINTER_CAMP_RACE(83),
    ACTIVITY_ACTION_CLOSE_WINTER_CAMP_CONTENT(84),
    ACTIVITY_ACTION_DELAY_UNLOAD_DYNAMIC_GROUP(85),
    ACTIVITY_ACTION_UNREGISTER_ALL_GROUP_BUNDLE(86),
    ACTIVITY_ACTION_UNLOAD_GROUP_BUNDLE(87),
    ACTIVITY_ACTION_OPEN_POTION_STAGE(88),
    ACTIVITY_ACTION_LANV2_OPEN_PROJECTION_STAGE(89),
    ACTIVITY_ACTION_LANV2_CLOSE_PROJECTION_CONTENT(90),
    ACTIVITY_ACTION_LANV2_OPEN_SALVAGE_STAGE(91),
    ACTIVITY_ACTION_OPEN_MINI_ELDRITCH(92),
    ACTIVITY_ACTION_UNLOCK_HIDE_AND_SEEK_MAP(93),
    ACTIVITY_ACTION_ACTIVITY_BANNER_NOTIFY(94),
    ACTIVITY_ACTION_LANV2_OPEN_FIREWORKS_STAGE(95),
    ACTIVITY_ACTION_CLOSE_LANTERN_RITE_CONTENT(96),
    ACTIVITY_ACTION_CLOSE_TANUKI_TRAVEL(97),
    ACTIVITY_ACTION_OPEN_MICHIAE_STAGE(98),
    ACTIVITY_ACTION_UNLOCK_BARTENDER_MATERIAL(99),
    ACTIVITY_ACTION_UNLOCK_BARTENDER_STORY_MODULE(100),
    ACTIVITY_ACTION_UNLOCK_BARTENDER_LEVEL(101),
    ACTIVITY_ACTION_UNLOCK_BARTENDER_DEVELOP_MODULE(102),
    ACTIVITY_ACTION_OPEN_CUSTOM_DUNGEON(103),
    ACTIVITY_ACTION_CLOSE_CUSTOM_DUNGEON(104),
    ACTIVITY_ACTION_OPEN_UGC(105),
    ACTIVITY_ACTION_UNLOCK_OFFICIAL_CUSTOM_DUNGEON(106),
    ACTIVITY_ACTION_OPEN_CRYSTAL_LINK_LEVEL(107),
    ACTIVITY_ACTION_CLOSE_PHOTO_CONTENT(108),
    ACTIVITY_ACTION_OPEN_PHOTO_POS_ID(109),
    ACTIVITY_ACTION_OPEN_SPICE_STAGE(110),
    ACTIVITY_ACTION_OPEN_IRODORI_POETRY_STAGE(111),
    ACTIVITY_ACTION_OPEN_IRODORI_CHESS_STAGE(112),
    ACTIVITY_ACTION_OPEN_IRODORI_MASTER_STAGE(113),
    ACTIVITY_ACTION_OPEN_IRODORI_FLOWER_STAGE(114),
    ACTIVITY_ACTION_ACTIVE_ITEM_GIVING(115),
    ACTIVITY_ACTION_DEACTIVE_ITEM_GIVING(116),
    ACTIVITY_ACTION_CLOSE_BARTENDER_CONTENT(117),
    ACTIVITY_ACTION_OPEN_MUSIC_GAME_UGC(118),
    ACTIVITY_ACTION_CLOSE_MUSIC_GAME_UGC(119),
    ACTIVITY_ACTION_OPEN_GACHA_STAGE(120),
    ACTIVITY_ACTION_OPEN_ROGUE_DIARY_STAGE(121),
    ACTIVITY_ACTION_CLOSE_ROGUE_DIARY_CONTENT(122),
    ACTIVITY_ACTION_CLOSE_PHOTO_POS_ID(123),
    ACTIVITY_ACTION_OPEN_SUMMER_V2_DUNGEON_STAGE(124),
    ACTIVITY_ACTION_OPEN_SUMMER_V2_BOAT_STAGE(125),
    ACTIVITY_ACTION_OPEN_ISLAND_PARTY_STAGE(126),
    ACTIVITY_ACTION_OPEN_GEAR_STAGE(127),
    ACTIVITY_ACTION_LOAD_SPECIFY_BUSINESSINFO_DYNAMIC_GROUP(128),
    ACTIVITY_ACTION_UNLOAD_SPECIFY_BUSINESSINFO_DYNAMIC_GROUP(129),
    ACTIVITY_ACTION_OPEN_INSTABLE_SPRAY_STAGE(130),
    ACTIVITY_ACTION_OPEN_GRAVEN_INNOCENCE_CAMP_STAGE(131),
    ACTIVITY_ACTION_OPEN_GRAVEN_INNOCENCE_PHOTO_STAGE(132),
    ACTIVITY_ACTION_OPEN_GRAVEN_INNOCENCE_RACE_LEVEL(133),
    ACTIVITY_ACTION_OPEN_MUQADAS_POTION_LEVEL(134),
    ACTIVITY_ACTION_OPEN_GRAVEN_INNOCENCE_CARVE_STAGE(135),
    ACTIVITY_ACTION_OPEN_TREASURE_SEELIE_REGION(136),
    ACTIVITY_ACTION_CLOSE_GRAVEN_INNOCENCE_CONTENT(137),
    ACTIVITY_ACTION_OPEN_WIND_FIELD_STAGE(138),
    ACTIVITY_ACTION_OPEN_ROCK_BOARD_EXPLORE_STAGE(139),
    ACTIVITY_ACTION_OPEN_VINTAGE_HUNTING_STAGE(140),
    ACTIVITY_ACTION_OPEN_VINTAGE_PRESENT_STAGE(141),
    ACTIVITY_ACTION_OPEN_VINTAGE_CAMP_STAGE(142),
    ACTIVITY_ACTION_OPEN_VINTAGE_OPEN_BOOTH(143),
    ACTIVITY_ACTION_CLOSE_VINTAGE_CONTENT(144),
    ACTIVITY_ACTION_VINTAGE_OPEN_MARKET_CONTENT(145),
    ACTIVITY_ACTION_VINTAGE_OPEN_MARKET_SHOP(146),
    ACTIVITY_ACTION_VINTAGE_CLOSE_MARKET_CONTENT(147),
    ACTIVITY_ACTION_VINTAGE_OPEN_MARKET_SHOP_CONTENT(148),
    ACTIVITY_ACTION_VINTAGE_INTERRUPT_MARKET_SHOP_CONTENT(149),
    ACTIVITY_ACTION_VINTAGE_FINISH_MARKET_SHOP_CONTENT(150),
    ACTIVITY_ACTION_VINTAGE_FINISH_MARKET_CONTENT(151),
    ACTIVITY_ACTION_VINTAGE_SHOP_UNLOCK_STRATEGY_MODULE(152),
    ACTIVITY_ACTION_VINTAGE_SHOP_UNLOCK_HELP_MODULE(153),
    ACTIVITY_ACTION_VINTAGE_SHOP_REFRESH_HELP_CD(154),
    ACTIVITY_ACTION_OPEN_FUNGUS_FIGHTER_FUNGUS_CAMP(155),
    ACTIVITY_ACTION_OPEN_FUNGUS_FIGHTER_FUNGUS_CALTIVATE(156),
    ACTIVITY_ACTION_OPEN_FUNGUS_FIGHTER_FUNGUS_TRAINING(157),
    ACTIVITY_ACTION_CLOSE_FUNGUS_FIGHTER_CONTENT(158),
    ACTIVITY_ACTION_OPEN_FUNGUS_FIGHTER_FUNGUS_PLOT(159),
    ACTIVITY_ACTION_OPEN_CHAR_AMUSEMENT_STAGE(160),
    ACTIVITY_ACTION_OPEN_EFFIGY_CHALLENGE_V2_STAGE(161),
    ACTIVITY_ACTION_COMMON_CLOSE_CONTENT(162),
    ACTIVITY_ACTION_UNKNOWN(9999);

    override fun getIntKey() = id
}