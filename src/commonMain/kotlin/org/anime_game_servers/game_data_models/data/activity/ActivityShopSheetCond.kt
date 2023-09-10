package org.anime_game_servers.game_data_models.data.activity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import org.anime_game_servers.game_data_models.data.helpers.nullableEnumValueOfOrDefault

@Serializable
data class ActivityShopSheetCond(
    @SerialName("type")
    val typeString : String? = null,
    @Transient
    val type: ActivityShopSheetCondType? = nullableEnumValueOfOrDefault(typeString, ActivityShopSheetCondType.ACTIVITY_SHOP_SHEET_COND_UNKNOWN),
    val param: List<Int>? = null
)
