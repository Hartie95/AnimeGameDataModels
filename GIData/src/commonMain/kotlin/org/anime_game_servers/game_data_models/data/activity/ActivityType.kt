package org.anime_game_servers.game_data_models.data.activity

import org.anime_game_servers.core.base.interfaces.IntKey

/**
 * Only one activity per type is allowed to be active at the same time
 * TODO fully document
 */
enum class ActivityType(val id: Int) : IntKey {
    NEW_ACTIVITY_GENERAL(0),

    /**
     * Closed beta (CB2) lantern rite has its own activity specific packages.
     * This event also uses special activity groups in `Activity/1001/`
     * TODO document used models
     */
    NEW_ACTIVITY_SEA_LAMP(1),

    /**
     * The elemental crucible event: [see here](https://genshin-impact.fandom.com/wiki/Elemental_Crucible)
     * From here on the normal activity info packages are used.
     * Some instances of this event use special activity groups in `Activity/5001/`
     * TODO document used models
     */
    NEW_ACTIVITY_CRUCIBLE(2),

    /**
     * The Marvelous Merchandise event: [first occurrence see here](https://genshin-impact.fandom.com/wiki/Marvelous_Merchandise/2020-10-26)
     * This event also uses special activity groups in `Activity/5003/`
     * TODO document used models
     */
    NEW_ACTIVITY_SALESMAN(3),

    /**
     * This is the Character Trial Event: [see here](https://genshin-impact.fandom.com/wiki/Test_Run_-_Character_Trial_Event)
     * This event also uses special activity groups in `Activity/5002/`
     * TODO document used models
     */
    NEW_ACTIVITY_TRIAL_AVATAR(4),

    /**
     * TODO identify this activity, it doesn't have an entry in NewActivityExcelConfigData
     * TODO document used models
     */
    NEW_ACTIVITY_SIGNIN(5),

    /**
     * TODO identify this activity, it doesn't have an entry in NewActivityExcelConfigData
     * TODO document used models
     */
    NEW_ACTIVITY_BONUS(6),

    /**
     * TODO identify this activity, it doesn't have an entry in NewActivityExcelConfigData
     * TODO document used models
     */
    NEW_ACTIVITY_NEWBEEBONUS(7),

    /**
     * This is used for showing activity/event banners for new storylines
     * TODO document used models
     */
    NEW_ACTIVITY_PERSONAL_LIINE(8),

    /**
     * This is the "[While It's Watm](https://genshin-impact.fandom.com/wiki/While_It%27s_Warm)" Event from version 1.1
     * TODO document used models
     */
    NEW_ACTIVITY_DELIVERY(9),

    /**
     * This is the "[Gliding Challenge](https://genshin-impact.fandom.com/wiki/Gliding_Challenge)" Event from version 1.1
     * This event also uses special activity groups in `Activity/5007/`
     * TODO document used models
     */
    NEW_ACTIVITY_FLIGHT(10),

    /**
     * TODO identify this activity, it doesn't have an entry in NewActivityExcelConfigData, probably some type of placeholder
     * TODO document used models
     */
    NEW_ACTIVITY_TEMP(99),

    /**
     * This is the [Unreconciled Stars](https://genshin-impact.fandom.com/wiki/Unreconciled_Stars) Event.
     * This event also uses special activity groups in `Activity/2001/`
     * TODO document used models
     */
    NEW_ACTIVITY_ASTER(1100),

    /**
     * The "[The Chalk Prince and the Dragon](https://genshin-impact.fandom.com/wiki/The_Chalk_Prince_and_the_Dragon)" event was
     * a dragon spine event.
     * This event also uses special activity groups in `Activity/3001/`
     * TODO document used models
     */
    NEW_ACTIVITY_DRAGONSPINE(1200),

    /**
     * TODO identify this activity, it doesn't have an entry in NewActivityExcelConfigData
     * TODO document used models
     */
    NEW_ACTIVITY_REUNION(1201),

    /**
     * This is the "[Hypostatic Symphony](https://genshin-impact.fandom.com/wiki/Hypostatic_Symphony/2021-01-16)" Event
     * TODO document used models
     */
    NEW_ACTIVITY_EFFIGY(1202),

    /**
     * TODO identify this activity, it doesn't have an entry in NewActivityExcelConfigData, likely to show the Tower schedule has changed
     * TODO document used models
     */
    NEW_ACTIVITY_TOWER_RESET(1203),

    /**
     * This is the "[Lost Riches](https://genshin-impact.fandom.com/wiki/Lost_Riches)" Event, first run during 1.2
     * Some instances of this event also use special activity groups in `Activity/5011/`
     * TODO document used models
     */
    NEW_ACTIVITY_TREASURE_MAP(1204),

    /**
     * This is a newer version of "[Marvelous Merchandise](https://genshin-impact.fandom.com/wiki/Marvelous_Merchandise)"
     * This event also uses special activity groups in `Activity/5012/`
     * TODO identify the differences  between both salesman activities
     * TODO document used models
     */
    NEW_ACTIVITY_SALESMAN_MP(1205),

    /**
     * This should be the the "[May Fortune Find You](https://genshin-impact.fandom.com/wiki/May_Fortune_Find_You/2021-02-11)" Event from version 1.3
     * TODO document used models
     */
    NEW_ACTIVITY_BLESSING(1300),

    /**
     * This events first occurence should be the "[Five Flushes of Fortune](https://genshin-impact.fandom.com/wiki/Five_Flushes_of_Fortune)" event.
     * TODO document used models
     */
    NEW_ACTIVITY_EXPEDITION(1301),

    /**
     * This is the 1.3 "[Lantern Rite](https://genshin-impact.fandom.com/wiki/Lantern_Rite)" event
     * This event also uses special activity groups in `Activity/2002/`
     * TODO document used models
     */
    NEW_ACTIVITY_SEA_LAMP_NEW(1302),

    /**
     * This is the 1.4 "[Invitation of Windlbume](https://genshin-impact.fandom.com/wiki/Invitation_of_Windblume)" Event.
     * This event also uses special activity groups in `Activity/2003/`
     * TODO document used models
     */
    NEW_ACTIVITY_FLEUR_FAIR(1400),

    /**
     * TODO identify this activity, it doesn't have an entry in NewActivityExcelConfigData
     * TODO document used models
     */
    NEW_ACTIVITY_OPERATIONS_BONUS(1401),

    /**
     * This event first occurred during version 1.4. Its likely the "[Contending Tides](https://genshin-impact.fandom.com/wiki/Contending_Tides) event
     * TODO verify this
     * TODO document used models
     */
    NEW_ACTIVITY_ARENA_CHALLENGE(1402),

    /**
     * This should be the "[Wishful Drops](https://genshin-impact.fandom.com/wiki/Wishful_Drops)" Event from version 1.4.
     * TODO document used models
     */
    NEW_ACTIVITY_WATER_SPIRIT_CHALLENGE(1403),

    /**
     * This is likely the 1.4 "[Outland Gastronomy](https://genshin-impact.fandom.com/wiki/Outland_Gastronomy)" event.
     * TODO verify this
     * TODO document used models
     */
    NEW_ACTIVITY_SIGNIN_COMPANION(1404),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_COOP(1405),

    /**
     * TODO identify this activity, probably a boss announcement banner
     * TODO document used models
     */
    NEW_ACTIVITY_MONSTER_BANNER_DRAKE_PRIMO_ROCK(1501),

    /**
     * This is the "[Energy Amplifier](https://genshin-impact.fandom.com/wiki/Energy_Amplifier)" Event, which first occurred during version 1.5
     * TODO document used models
     */
    NEW_ACTIVITY_CHANNELER_SLAB(1502),

    /**
     * This is the "[Battlefront: Misty Dungeon](https://genshin-impact.fandom.com/wiki/Battlefront:_Misty_Dungeon)" Event, which first occurred during version 1.5
     * TODO document used models
     */
    NEW_ACTIVITY_MISTTRIAL(1503),

    /**
     * This is the "[Windtrace](https://genshin-impact.fandom.com/wiki/Windtrace)" Event, which first occurred during version 1.5
     * TODO document used models
     */
    NEW_ACTIVITY_HIDEANDSEEK(1504),

    /**
     * This is the "[Mimi Tomo](https://genshin-impact.fandom.com/wiki/Mimi_Tomo)" Event, which first occurred during version 1.5
     * TODO document used models
     */
    NEW_ACTIVITY_FIND_HILICHURL(1505),

    /**
     * TODO identify this activity, probably some boss announcement banner
     * TODO document used models
     */
    NEW_ACTIVITY_MONSTER_BANNER_EFFIGY_ICE(1506),

    /**
     * TODO identify this activity, probably the Teapot announcement banner
     * TODO document used models
     */
    NEW_ACTIVITY_HOMEWORLD(1507),

    /**
     * TODO identify this activity, it doesn't have an entry in NewActivityExcelConfigData
     * TODO document used models
     */
    NEW_ACTIVITY_H5(1508),

    /**
     * This is the "[Midsummer Island Adventure](https://genshin-impact.fandom.com/wiki/Midsummer_Island_Adventure)" Event from version 1.6.
     * In this event the player gets to visit the Golden Apple Archipelago. The tide level of the sea changes based on the
     * scene tags controlled by [ActivityCondData].
     * TODO document used models
     */
    NEW_ACTIVITY_SUMMER_TIME(1600),

    /**
     * This is the "[Never-Ending Battle](https://genshin-impact.fandom.com/wiki/Never-Ending_Battle)" Event from version 1.6.
     * TODO document used models
     */
    NEW_ACTIVITY_BUOYANT_COMBAT(1601),

    /**
     * This event ran twice, once as [Echoing Tales](https://genshin-impact.fandom.com/wiki/Echoing_Tales) and once as
     * [Resonating Visions](https://genshin-impact.fandom.com/wiki/Resonating_Visions), both times accompanying the Summer Times events
     * [NEW_ACTIVITY_SUMMER_TIME] and [NEW_ACTIVITY_SUMMER_TIME_2_8].
     * In these events the player needs to collect echo shells to unlock voice lines and rewards.
     * Used Models: [org.anime_game_servers.game_data_models.data.activity.echo_shell.EchoShellData],
     * [org.anime_game_servers.game_data_models.data.activity.echo_shell.EchoShellFloatSignalData]
     * [org.anime_game_servers.game_data_models.data.activity.echo_shell.EchoShellPreviewData],
     * [org.anime_game_servers.game_data_models.data.activity.echo_shell.EchoShellRewardData],
     * [org.anime_game_servers.game_data_models.data.activity.echo_shell.EchoShellSummerTimeDungeonData]
     */
    NEW_ACTIVITY_ECHO_SHELL(1602),

    /**
     * This is the "[Kaboomball Kombat](https://genshin-impact.fandom.com/wiki/Kaboomball_Kombat)" Event from version 1.6.
     * TODO document used models
     */
    NEW_ACTIVITY_BOUNCE_CONJURING(1603),

    /**
     * This might be the "[Legend of the Vagabond Sword](https://genshin-impact.fandom.com/wiki/Legend_of_the_Vagabond_Sword)" Event from version 1.6.
     * TODO verify this
     * TODO document used models
     */
    NEW_ACTIVITY_DAOQI_ADVERTISEMENT(1604),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_BLITZ_RUSH(2001),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_CHESS(2002),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_MONSTER_BANNER_EFFIGY_FIRE(2003),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_MONSTER_BANNER_PERPETUAL(2004),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_PERSONAL_LIINE_2(2005),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_GENERAL_BANNER(2100),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_LUNA_RITE(2101),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_SUMO(2102),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_MOONFIN_TRIAL(2103),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_MONSTER_BANNER_EFFIGY_WATER(2104),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_MONSTER_BANNER_RAIJIN(2105),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_PLANT_FLOWER(2200),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_ROGUELIKE_DUNGEON(2201),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_MUSIC_GAME(2202),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_DIG(2203),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_MOONFIN_BANNER(2204),

    /**
     * This is the "[Shadows Amidst Snowstorms](https://genshin-impact.fandom.com/wiki/Shadows_Amidst_Snowstorms)" Event from version 2.3.
     * TODO document used models
     */
    NEW_ACTIVITY_WINTER_CAMP(2301),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_HACHI(2302),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_POTION(2400),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_TANUKI_TRAVEL(2401),

    /**
     * This is the "[Fleeting Colors in Flight](https://genshin-impact.fandom.com/wiki/Fleeting_Colors_in_Flight)"/Lantern rite Event from version 2.4.
     * TODO document used models
     */
    NEW_ACTIVITY_SEA_LAMP_2_4(2402),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_MICHIAE_MATSURI(2501),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_BARTENDER(2502),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_UGC(2503),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_IRODORI(2600),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_CRYSTAL_LINK(2601),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_SPICE(2602),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_PHOTO(2603),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_LUMINANCE_STONE_CHALLENGE(2702),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_GACHA(2703),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_ROGUE_DIARY(2704),

    /**
     * This is the "[Summertime Odyssey](https://genshin-impact.fandom.com/wiki/Summertime_Odyssey)" Event from version 2.8.
     * TODO document used models
     */
    NEW_ACTIVITY_SUMMER_TIME_2_8(2801),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_GEAR(2802),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_ISLAND_PARTY(2803),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_GRAVEN_INNOCENCE(3000),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_INSTABLE_SPRAY(3001),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_MUQADAS_POTION(3002),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_TREASURE_SEELIE(3003),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_WIND_FIELD(3101),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_ROCK_BOARD_EXPLORE(3102),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_VINTAGE(3103),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_FUNGUS_FIGHTER(3201),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_CHAR_AMUSEMENT(3202),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_EFFIGY_CHALLENGE_V2(3203),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_BRICK_BREAKER(3300),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_COIN_COLLECT(3301),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_DUEL_HEART(3400),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_SEA_LAMP_3_4(3401),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_ELECTROHERCULES_BATTLE(3402),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_TEAM_CHAIN(3403),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_GCG_FESTIVAL(3404),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_SANDY_LAND_BANNER(3405),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_FLEURFAIR_V2(3500),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_FUNGUS_FIGHTER_V2(3501),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_SANDWORM_CANNON(3600),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_AKA_FES(3601),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_SORUSH_TRIAL(3602),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_UGC_V2(3701),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_EFFIGY_CHALLENGE_V4(3702),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_JOURNEY(3703),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_GCG_PVE(3705),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_PENUMBRA_ADVENTURE(3800),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_MULTI_CHARACTER_FIGHT(3801),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_ANIMAL_VIEW(3802),

    /**
     * TODO identify this activity
     * TODO document used models
     */
    NEW_ACTIVITY_GCG_PVE_INFINITE(3803),

    /**
     * This is a placeholder used when the actual activity string can not be identified. Check [org.anime_game_servers.game_data_models.data.activity.ActivityData.activityTypeString] in this case.
     */
    NEW_ACTIVITY_UNKNOWN(999999);

    override fun getIntKey() = id
}