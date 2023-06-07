package org.anime_game_servers.game_data_models.data.activity

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.game_data_models.data.general.TextMapHash
import org.anime_game_servers.game_data_models.data.general.UnsetTextMap
import org.anime_game_servers.game_data_models.data.helpers.nullableEnumValueOfOrDefault
import org.anime_game_servers.game_data_models.data.interfaces.IntKey

/**
 * TODO Add documentation
 * These are known names for files handled by this class:
 * ExcelBinOutput/NewActivityExcelConfigData.json
 * txt/NewActivityData.txt (with an appropriate parser)
 */
@OptIn(ExperimentalSerializationApi::class)
data class ActivityData(
    val activityId: Int,
    val activityTypeString: String? = null,
    val activityType: ActivityType? = nullableEnumValueOfOrDefault(activityTypeString, ActivityType.NEW_ACTIVITY_UNKNOWN),
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
