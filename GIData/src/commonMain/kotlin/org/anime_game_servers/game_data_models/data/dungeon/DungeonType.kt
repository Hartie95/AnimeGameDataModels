package org.anime_game_servers.game_data_models.data.dungeon

import org.anime_game_servers.game_data_models.data.interfaces.IntKey

enum class DungeonType(val id: Int) : IntKey {
    DUNGEON_NONE(0),
    DUNGEON_PLOT(1),
    DUNGEON_FIGHT(2),
    DUNGEON_DAILY_FIGHT(3),
    DUNGEON_WEEKLY_FIGHT(4),
    DUNGEON_DISCARDED(5),
    DUNGEON_TOWER(6),
    DUNGEON_BOSS(7),
    DUNGEON_ACTIVITY(8),
    DUNGEON_EFFIGY(9),
    DUNGEON_ELEMENT_CHALLENGE(10),
    DUNGEON_THEATRE_MECHANICUS(11),
    DUNGEON_FLEUR_FAIR(12),
    DUNGEON_CHANNELLER_SLAB_LOOP(13),
    DUNGEON_CHANNELLER_SLAB_ONE_OFF(14),
    DUNGEON_BLITZ_RUSH(15),
    DUNGEON_CHESS(16),
    DUNGEON_SUMO_COMBAT(17),
    DUNGEON_ROGUELIKE(18),
    DUNGEON_HACHI(19),
    DUNGEON_POTION(20),
    DUNGEON_MINI_ELDRITCH(21),
    DUNGEON_UGC(22),
    DUNGEON_GCG(23),
    DUNGEON_CRYSTAL_LINK(24),
    DUNGEON_IRODORI_CHESS(25),
    DUNGEON_ROGUE_DIARY(26),
    DUNGEON_DREAMLAND(27),
    DUNGEON_SUMMER_V2(28),
    DUNGEON_MUQADAS_POTION(29),
    DUNGEON_INSTABLE_SPRAY(30),
    DUNGEON_WIND_FIELD(31),
    DUNGEON_BIGWORLD_MIRROR(32),
    DUNGEON_FUNGUS_FIGHTER_TRAINING(33),
    DUNGEON_FUNGUS_FIGHTER_PLOT(34),
    DUNGEON_EFFIGY_CHALLENGE_V2(35),
    DUNGEON_CHAR_AMUSEMENT(36),
    DUNGEON_UNKNOWN(9999);

    override fun getIntKey() = id
}