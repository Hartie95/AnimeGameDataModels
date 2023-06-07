package org.anime_game_servers.game_data_models.data.general

import org.anime_game_servers.game_data_models.data.interfaces.IntKey

enum class Element(val id:Int) : IntKey {
    ELEMENT_NONE(0),
    ELEMENT_FIRE(1),
    ELEMENT_WATER(2),
    ELEMENT_GRASS(3),
    ELEMENT_ELECTRIC(4),
    ELEMENT_ICE(5),
    ELEMENT_FROZEN(6),
    ELEMENT_WIND(7),
    ELEMENT_ROCK(8),
    ELEMENT_ANTI_FIRE(9),
    DEFAULT(255);

    override fun getIntKey() = id
}