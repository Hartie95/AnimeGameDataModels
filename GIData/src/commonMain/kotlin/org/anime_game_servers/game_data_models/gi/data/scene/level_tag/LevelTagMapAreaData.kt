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
 * ExcelBinOutput/LevelTagMapAreaConfigData.json
 * txt/LevelTagMapAreaData.txt (with an appropriate parser)
 * @property levelTagID the tag id this maps from [LevelTagData]
 * @property mapAreaID TODO
 * @property index TODO
 */
@DataFile("ExcelBinOutput/LevelTagMapAreaConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/LevelTagMapAreaData.txt", FileType.TSV, FolderType.EXCEL)
@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class LevelTagMapAreaData(
    @JsonNames("LevelTagID")
    val levelTagID: Int,
    @JsonNames("MapAreaID")
    val mapAreaID: Int,
    @JsonNames("Index")
    val index: Int = 0,
) : IntKey {
    override fun getIntKey() = levelTagID
}