package org.anime_game_servers.game_data_models.data.world

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.game_data_models.data.interfaces.IntKey
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * This is used to determine the base levels of monsters, based on the world level of the player
 * @param level the world level of the player
 * @param monsterLevel the base level of monsters in his world
 */
@DataFile("ExcelBinOutput/WorldLevelExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/WorldLevelData.txt", FileType.TSV, FolderType.EXCEL)
@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class WorldLevelData(
    val level: Int,
    @JsonNames("monster_level")
    val monsterLevel: Int
) : IntKey {
    override fun getIntKey() = level
}
