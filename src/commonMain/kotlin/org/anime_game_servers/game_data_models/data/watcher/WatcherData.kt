package org.anime_game_servers.game_data_models.data.watcher

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.game_data_models.data.interfaces.IntKey

@OptIn(ExperimentalSerializationApi::class)
sealed interface WatcherData : IntKey {

    val id: Int
    val triggerConfig: WatcherTriggerConfig?
    val progress: Int
    @JsonNames("is_disuse", "isDisuse")
    val isObsolete: Boolean?

    override fun getIntKey() = id
}