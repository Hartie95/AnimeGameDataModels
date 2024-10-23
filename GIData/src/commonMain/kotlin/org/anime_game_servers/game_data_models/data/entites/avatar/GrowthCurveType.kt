@file:OptIn(ExperimentalSerializationApi::class)

package org.anime_game_servers.game_data_models.data.entites.avatar

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.core.base.interfaces.IntKey

/**
 * TODO documentation
 */
enum class GrowthCurveType(val id: Int): IntKey {
    GROW_CURVE_NONE(0),
    GROW_CURVE_HP(1),
    GROW_CURVE_ATTACK(2),
    GROW_CURVE_STAMINA(3),
    GROW_CURVE_STRIKE(4),
    GROW_CURVE_ANTI_STRIKE(5),
    GROW_CURVE_ANTI_STRIKE1(6),
    GROW_CURVE_ANTI_STRIKE2(7),
    GROW_CURVE_ANTI_STRIKE3(8),
    GROW_CURVE_STRIKE_HURT(9),
    GROW_CURVE_ELEMENT(10),
    GROW_CURVE_KILL_EXP(11),
    GROW_CURVE_DEFENSE(12),
    GROW_CURVE_ATTACK_BOMB(13),
    @JsonNames("GROW_CURVE_HP_LITTLEMONSTER")
    GROW_CURVE_HP_LITTLE_MONSTER(14),
    GROW_CURVE_ELEMENT_MASTERY(15),
    GROW_CURVE_PROGRESSION(16),
    GROW_CURVE_DEFENDING(17),
    GROW_CURVE_MHP(18),
    GROW_CURVE_MATK(19),
    GROW_CURVE_TOWERATK(20),
    GROW_CURVE_HP_S5(21),
    GROW_CURVE_HP_S4(22),
    GROW_CURVE_HP_2(23),
    GROW_CURVE_ATTACK_2(24),
    GROW_CURVE_HP_ENVIRONMENT(25),
    GROW_CURVE_ATTACK_S5(31),
    GROW_CURVE_ATTACK_S4(32),
    GROW_CURVE_ATTACK_S3(33),
    GROW_CURVE_STRIKE_S5(34),
    GROW_CURVE_DEFENSE_S5(41),
    GROW_CURVE_DEFENSE_S4(42),
    GROW_CURVE_ATTACK_101(1101),
    GROW_CURVE_ATTACK_102(1102),
    GROW_CURVE_ATTACK_103(1103),
    GROW_CURVE_ATTACK_104(1104),
    GROW_CURVE_ATTACK_105(1105),
    GROW_CURVE_ATTACK_201(1201),
    GROW_CURVE_ATTACK_202(1202),
    GROW_CURVE_ATTACK_203(1203),
    GROW_CURVE_ATTACK_204(1204),
    GROW_CURVE_ATTACK_205(1205),
    GROW_CURVE_ATTACK_301(1301),
    GROW_CURVE_ATTACK_302(1302),
    GROW_CURVE_ATTACK_303(1303),
    GROW_CURVE_ATTACK_304(1304),
    GROW_CURVE_ATTACK_305(1305),
    GROW_CURVE_CRITICAL_101(2101),
    GROW_CURVE_CRITICAL_102(2102),
    GROW_CURVE_CRITICAL_103(2103),
    GROW_CURVE_CRITICAL_104(2104),
    GROW_CURVE_CRITICAL_105(2105),
    GROW_CURVE_CRITICAL_201(2201),
    GROW_CURVE_CRITICAL_202(2202),
    GROW_CURVE_CRITICAL_203(2203),
    GROW_CURVE_CRITICAL_204(2204),
    GROW_CURVE_CRITICAL_205(2205),
    GROW_CURVE_CRITICAL_301(2301),
    GROW_CURVE_CRITICAL_302(2302),
    GROW_CURVE_CRITICAL_303(2303),
    GROW_CURVE_CRITICAL_304(2304),
    GROW_CURVE_CRITICAL_305(2305),
    GROW_CURVE_ACTIVITY_ATTACK_1(5201),
    GROW_CURVE_ACTIVITY_HP_1(5202),
    GROW_CURVE_UNKNOWN(99999);

    override fun getIntKey() = id
}