package org.anime_game_servers.game_data_models.data.world

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.game_data_models.data.helpers.nullableEnumValueOfOrDefault
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * This contains information about the main scenes for a world
 * @param id The id of the world instance
 * @param typeString The string representation of the world type, check this if [type] is [WorldType.WORLD_UNKNOWN]
 * @param type The type of the world instance
 * @param mainSceneId The id of the main scene of the world
 * @param subSceneIdVec A list of scenes that are sub scenes to the main scene
 */
@DataFile("ExcelBinOutput/WorldExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/WorldData.txt", FileType.TSV, FolderType.EXCEL)
@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class WorldData(
    val id: Int,
    @SerialName("type")
    val typeString: String,
    @Transient
    val type: WorldType? = nullableEnumValueOfOrDefault(typeString, WorldType.WORLD_UNKNOWN),
    @JsonNames("main_scene_id")
    val mainSceneId: Int,
    @JsonNames("sub_scene_id_vec")
    val subSceneIdVec: List<Int>,
)
