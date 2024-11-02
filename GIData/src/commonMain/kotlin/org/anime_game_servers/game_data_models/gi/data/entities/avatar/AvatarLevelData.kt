package org.anime_game_servers.game_data_models.gi.data.entities.avatar

import kotlinx.serialization.Serializable
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * This defines the amount of character experience required to level up an avatar/character.
 * These are known names for files handled by this class:
 * ExcelBinOutput/AvatarLevelExcelConfigData.json
 * txt/AvatarLevelData.txt
 * @property level The level of the character to apply this experience requirement to and main identifier
 * @property exp The amount of experience required to level up the character to the next level
 */
@DataFile("ExcelBinOutput/AvatarLevelExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/AvatarLevelData.txt", FileType.TSV, FolderType.EXCEL)
@Serializable
data class AvatarLevelData(
    val level: Int,
    val exp: Int,
): IntKey {
    override fun getIntKey() = level
}
