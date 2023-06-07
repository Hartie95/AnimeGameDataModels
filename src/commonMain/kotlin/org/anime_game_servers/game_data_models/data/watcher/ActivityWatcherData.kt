package org.anime_game_servers.game_data_models.data.watcher

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.game_data_models.data.general.TextMapHash
import org.anime_game_servers.game_data_models.data.general.UnsetInt
import org.anime_game_servers.game_data_models.data.general.UnsetTextMap

/**
 * TODO Add documentation
 * These are known names for files handled by this class:
 * ExcelBinOutput/ActivityWatcherConfigData.json
 * ExcelBinOutput/NewActivityWatcherConfigData.json
 * txt/NewActivityWatcherData.txt (with an appropriate parser)
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class ActivityWatcherData(
    @JsonNames("id", "Id")
    override val id: Int,
    @JsonNames("triggerConfig", "TriggerConfig")
    override val triggerConfig: WatcherTriggerConfig? = null,
    @JsonNames("progress", "Progress")
    override val progress: Int = UnsetInt,
    @JsonNames("isObsolete", "isDisuse")
    override val isObsolete: Boolean? = null,

    @JsonNames("rewardId", "RewardId")
    val rewardId: Int = UnsetInt,
    @JsonNames("rewardPreview", "RewardPreview")
    val rewardPreview: Int = UnsetInt,
    val isAutoGrant: Boolean? = null,

    @JsonNames("activitychallengetipsTextMapHash", "ActivitychallengetipsTextMapHash")
    val activitychallengetipsTextMapHash: TextMapHash = UnsetTextMap,
    @JsonNames("extraActivitychallengetipsTextMapHash", "ExtraActivitychallengetipsTextMapHash")
    val extraActivitychallengetipsTextMapHash: TextMapHash = UnsetTextMap,
) : WatcherData
