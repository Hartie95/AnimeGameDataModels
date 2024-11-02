package org.anime_game_servers.game_data_models.gi.data.scene.level_tag

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * TODO verify use of this excel file
 * These are known names for files handled by this class:
 * ExcelBinOutput/LevelTagResetExcelConfigData.json
 * txt/LevelTagResetData.txt (with an appropriate parser)
 * @property id TODO
 * @property dungeonId TODO
 * @property seriesIdList TODO
 */
@DataFile("ExcelBinOutput/LevelTagResetExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/LevelTagResetData.txt", FileType.TSV, FolderType.EXCEL)
@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class LevelTagResetData(
    @JsonNames("ID")
    val id: Int,
    @JsonNames("dungeon_id")
    val dungeonId: Int,
    @JsonNames("series_id_list")
    val seriesIdList: List<Int>,
) : IntKey {
    override fun getIntKey() = id
}