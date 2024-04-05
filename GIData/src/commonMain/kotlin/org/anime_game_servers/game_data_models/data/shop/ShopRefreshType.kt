package org.anime_game_servers.game_data_models.data.shop

import kotlinx.serialization.Serializable
import org.anime_game_servers.core.base.interfaces.IntKey

@Serializable
enum class ShopRefreshType(val id: Int) : IntKey {
    SHOP_REFRESH_NONE(0),
    SHOP_REFRESH_MONTHLY(1),
    SHOP_REFRESH_WEEKLY(2),
    SHOP_REFRESH_DAILY(3),
    SHOP_REFRESH_UNKNOWN(9999);

    override fun getIntKey() = id
}