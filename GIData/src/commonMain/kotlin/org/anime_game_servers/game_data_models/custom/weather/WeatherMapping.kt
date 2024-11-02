package org.anime_game_servers.game_data_models.custom.weather

import kotlinx.serialization.Serializable
import org.anime_game_servers.game_data_models.data.general.UnsetInt
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * Simple mapping file to map an area to a weather template.
 * TODO make patchable WeatherData instead
 * @property areaId TODO
 * @property template TODO
 */
@DataFile("Server/WeatherMapping.json", FileType.JSON, FolderType.CUSTOM)
@Serializable
data class WeatherMapping(
    var areaId: Int = UnsetInt,
    val template: String? = null
)
