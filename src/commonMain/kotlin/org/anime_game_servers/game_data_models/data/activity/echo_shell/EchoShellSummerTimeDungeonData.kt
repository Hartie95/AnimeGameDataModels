package org.anime_game_servers.game_data_models.data.activity.echo_shell

import kotlinx.serialization.Serializable
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * This contains information about the maximum number of chests and echo shells that can be found in a dungeon that's
 * part of the echo shell event, normally run in combination with the summer time event.
 * These are known names for files handled by this class:
 * ExcelBinOutput/EchoShellSummerTimeDungeonExcelConfigData.json
 * txt/EchoShellSummerTimeDungeon.txt (with an appropriate parser)
 * @property dungeonId id of the dungeon associated with this echo shell data. References a dungeon in [org.anime_game_servers.game_data_models.data.dungeon.DungeonData]
 * @property numberOfChests number of chests the player can find in this dungeon
 * @property numberOfEchoShells number of echo shells the player can find in this dungeon
 */
@DataFile("ExcelBinOutput/EchoShellSummerTimeDungeonExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/EchoShellSummerTimeDungeon.txt", FileType.TSV, FolderType.EXCEL)
@Serializable
data class EchoShellSummerTimeDungeonData(
    val dungeonId: Int,
    val numberOfChests: Int,
    val numberOfEchoShells: Int,
)
