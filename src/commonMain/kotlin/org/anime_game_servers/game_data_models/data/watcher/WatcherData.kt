package org.anime_game_servers.game_data_models.data.watcher

import org.anime_game_servers.game_data_models.data.interfaces.IntKey

sealed interface WatcherData : IntKey {

    val id: Int
    val triggerConfig: WatcherTriggerConfig?
    val progress: Int
    val isObsolete: Boolean?

    override fun getIntKey() = id
}