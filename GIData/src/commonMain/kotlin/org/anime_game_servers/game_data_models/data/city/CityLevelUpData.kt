@file:OptIn(ExperimentalSerializationApi::class)

package org.anime_game_servers.game_data_models.data.city

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.data.general.UnsetInt
import org.anime_game_servers.game_data_models.data.helpers.nullableEnumValueOfOrDefault
import org.anime_game_servers.game_data_models.data.quest.GainItem
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * This is used to control the city (Statue of the seven) level up system and rewards.
 */
@DataFile("ExcelBinOutput/CityLevelupConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/CityLevelUpData.txt", FileType.TSV, FolderType.EXCEL)
@Serializable
data class CityLevelUpData(
    val sceneId: Int = 3,
    val cityId: Int,
    val level: Int,
    val consumeItem: GainItem? = null,
    @JsonNames("rewardID")
    val rewardId: Int = UnsetInt,
    @JsonNames("actionVec")
    val actions: List<CityLevelUpAction>? = null,
) : IntKey {
    override fun getIntKey() = getKey(cityId, level)

    /*
     * Defines
     */
    @Serializable
    data class CityLevelUpAction(
        @SerialName("type")
        val typeString: String? = null,
        @Transient
        val type: WorldAreaAction? = nullableEnumValueOfOrDefault(
            typeString,
            WorldAreaAction.WORLD_AREA_ACTION_UNKNOWN
        ),
        @JsonNames("param1Vec")
        val param1: List<Int>? = null,
        @JsonNames("param2Vec")
        val param2: List<Int>? = null,
    )

    companion object {
        @JvmStatic @JvmOverloads
        fun getKey(cityId: Int, level:Int) = (cityId shl 4) + level
    }

}
