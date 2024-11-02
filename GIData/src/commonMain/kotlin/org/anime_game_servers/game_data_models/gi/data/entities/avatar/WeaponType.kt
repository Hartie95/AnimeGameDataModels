package org.anime_game_servers.game_data_models.gi.data.entities.avatar

import org.anime_game_servers.core.base.interfaces.IntKey

/**
 * TODO documentation
 */
enum class WeaponType(val id: Int): IntKey {
    WEAPON_NONE(0),
    WEAPON_SWORD_ONE_HAND(1),
    WEAPON_CROSSBOW(2),
    WEAPON_STAFF(3),
    WEAPON_DOUBLE_DAGGER(4),
    WEAPON_KATANA(5),
    WEAPON_SHURIKEN(6),
    WEAPON_STICK(7),
    WEAPON_SPEAR(8),
    WEAPON_SHIELD_SMALL(9),
    WEAPON_CATALYST(10),
    WEAPON_CLAYMORE(11),
    WEAPON_BOW(12),
    WEAPON_POLE(13),
    WEAPON_UNKNOWN(99999);

    override fun getIntKey() = id
}