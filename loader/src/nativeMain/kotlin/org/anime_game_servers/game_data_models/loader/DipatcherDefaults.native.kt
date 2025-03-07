package org.anime_game_servers.game_data_models.loader

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO

actual object DipatcherDefaults {
    actual val defaultIoDispatcher: CoroutineDispatcher
        get() = Dispatchers.IO
}