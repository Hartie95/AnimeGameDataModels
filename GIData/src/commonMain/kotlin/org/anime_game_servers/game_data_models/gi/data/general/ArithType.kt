package org.anime_game_servers.game_data_models.gi.data.general

import org.anime_game_servers.core.base.interfaces.IntKey

/**
 * TODO documentation
 */
enum class ArithType(val id: Int): IntKey {
    ARITH_NONE(0),
    ARITH_ADD(1),
    ARITH_MULTI(2),
    ARITH_SUB(3),
    ARITH_DIVIDE(3),
    ARITH_UNKNOWN(9999);

    override fun getIntKey() = id
}