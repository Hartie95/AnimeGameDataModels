package org.anime_game_servers.game_data_models.loader

import kotlinx.coroutines.CoroutineDispatcher

expect object DipatcherDefaults {
    val defaultIoDispatcher: CoroutineDispatcher
}