package org.anime_game_servers.game_data_models.data.activity.echo_shell

import kotlinx.serialization.Serializable
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * TODO document
 * These are known names for files handled by this class:
 * ExcelBinOutput/EchoShellPreviewExcelConfigData.json
 * txt/EchoShellPreview.txt (with an appropriate parser)
 */
@DataFile("ExcelBinOutput/EchoShellPreviewExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/EchoShellPreview.txt", FileType.TSV, FolderType.EXCEL)
@Serializable
data class EchoShellPreviewData(
    val id: Int,
    val activityId: Int,
)
