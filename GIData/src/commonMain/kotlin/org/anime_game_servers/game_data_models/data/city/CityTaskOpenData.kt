@file:OptIn(ExperimentalSerializationApi::class)

package org.anime_game_servers.game_data_models.data.city

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.data.general.*
import org.anime_game_servers.game_data_models.data.helpers.nullableEnumValueOfOrDefault
import org.anime_game_servers.game_data_models.data.quest.GainItem
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * TODO
 */
@DataFile("ExcelBinOutput/CityTaskOpenExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/CityTaskOpenData.txt", FileType.TSV, FolderType.EXCEL)
@Serializable
data class CityTaskOpenData(
    val cityId: Int,
    val questId: Int,
    val unk: List<Int>? = null,
    ) : IntKey {
    override fun getIntKey() = cityId

}
