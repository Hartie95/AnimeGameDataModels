package org.anime_game_servers.game_data_models.data.entites.avatar

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.data.general.*
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * This contains information about the amount friendship xp required for avatars/characters to level up their friendship level.
 * These are known names for files handled by this class:
 * ExcelBinOutput/AvatarFettersLevelExcelConfigData.json
 * txt/AvatarFettersLevelData.txt
 * @property fetterLevel The level of the friendship to apply this xp requirement to and main identifier
 * @property needExp The amount of friendship xp required to level up the friendship to this level
 */
@DataFile("ExcelBinOutput/AvatarFettersLevelExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/AvatarFettersLevelData.txt", FileType.TSV, FolderType.EXCEL)
@Serializable
@OptIn(ExperimentalSerializationApi::class)
data class AvatarFettersLevelData(
    @JsonNames("fetter_level")
    val fetterLevel: Int,
    val needExp: Int = UnsetInt,

): IntKey {
    override fun getIntKey() = fetterLevel
}
