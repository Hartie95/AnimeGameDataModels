package org.anime_game_servers.game_data_models.data.activity

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.data.general.LogicType
import org.anime_game_servers.game_data_models.data.general.TextMapHash
import org.anime_game_servers.game_data_models.data.general.UnsetTextMap
import org.anime_game_servers.game_data_models.data.helpers.nullableEnumValueOfOrDefault
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * This contains information about the availability and conditions to access shop sheets defined by [ActivityShopSheetData].
 * @param id The ID of the shop sheet.
 * @param isAheadPreview Whether the shop sheet is available for preview before the conditions are meet.
 * @param condCombString The string representation of the logic type from [condComb]. Check this if [condComb] is [LogicType.LOGIC_UNKNOWN].
 * @param condComb The enum representation of the logic type. This is used to identify how to combine the conditions, if there are multiple.
 * @param cond The list of conditions that must be met for this shop sheet to be accessible by the user.
 */
@DataFile("ExcelBinOutput/ActivityShopSheetExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/ActivityShopSheetData.txt", FileType.TSV, FolderType.EXCEL)
@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class ActivityShopSheetData(
    val id:Int,
    @JsonNames("is_ahead_preview")
    val isAheadPreview: Boolean? = null,
    @SerialName("condComb") @JsonNames("cond_comb")
    val condCombString: String? = null,
    @Transient
    val condComb: LogicType? = nullableEnumValueOfOrDefault(condCombString, LogicType.LOGIC_UNKNOWN),
    val cond: List<ActivityShopSheetCond>? = null,

    // Text maps, client only
    val sheetNameTextMapHash: TextMapHash = UnsetTextMap
    ) : IntKey {
    override fun getIntKey() = id
}
