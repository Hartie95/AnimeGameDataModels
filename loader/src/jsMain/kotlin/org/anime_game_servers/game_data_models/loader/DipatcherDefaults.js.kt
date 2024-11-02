package org.anime_game_servers.game_data_models.loader

import kotlinx.coroutines.CoroutineDispatcher

actual object DipatcherDefaults {
    actual val defaultIoDispatcher: CoroutineDispatcher
        get() = kotlinx.coroutines.Dispatchers.Unconfined
}