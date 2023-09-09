package org.anime_game_servers.game_data_models.data.activity

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.game_data_models.data.general.TextMapHash
import org.anime_game_servers.game_data_models.data.general.UnsetTextMap
import org.anime_game_servers.game_data_models.data.helpers.nullableEnumValueOfOrDefault
import org.anime_game_servers.game_data_models.data.interfaces.IntKey
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * TODO Add documentation
 * These are known names for files handled by this class:
 * ExcelBinOutput/NewActivityExcelConfigData.json
 * txt/NewActivityData.txt (with an appropriate parser)
 */
@DataFile("ExcelBinOutput/NewActivityExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/NewActivityData.txt", FileType.TSV, FolderType.EXCEL)
@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class ActivityData(
    val activityId: Int,
    @SerialName("activityType")
    val activityTypeString: String? = null,
    @Transient
    val activityType: ActivityType? = nullableEnumValueOfOrDefault(
        activityTypeString,
        ActivityType.NEW_ACTIVITY_UNKNOWN
    ),
    val activitySceneTag: String? = null,
    @JsonNames("condGroupIds", "condGroupId")
    val condGroupIds: List<Int>? = null,
    @JsonNames("watcherIds", "watcherId")
    val watcherIds: List<Int>? = null,
    @JsonNames("dungeonIds", "dungeonIdList")
    val dungeonIds: List<Int>? = null,
    val activityTokens: List<Int>? = null,

    val nameTextMapHash: TextMapHash = UnsetTextMap,

    ) : IntKey {
    override fun getIntKey() = activityId
}
