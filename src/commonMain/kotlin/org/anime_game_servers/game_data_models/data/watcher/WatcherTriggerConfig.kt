package org.anime_game_servers.game_data_models.data.watcher

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.game_data_models.data.helpers.nullableEnumValueOfOrDefault

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class WatcherTriggerConfig(
    @SerialName("triggerType") @JsonNames("triggerType","TriggerType")
    val triggerTypeString: String? = null,
    @Transient
    val triggerType: WatcherTriggerType? = nullableEnumValueOfOrDefault(triggerTypeString, WatcherTriggerType.TRIGGER_UNKNOWN),
    @JsonNames("paramList","Param")
    val paramList: List<String>?= null
)
