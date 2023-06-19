package org.anime_game_servers.game_data_models.data.activity.echo_shell

import kotlinx.serialization.Serializable

/**
 * TODO document
 * These are known names for files handled by this class:
 * ExcelBinOutput/EchoShellPreviewExcelConfigData.json
 * txt/EchoShellPreview.txt (with an appropriate parser)
 */
@Serializable
data class EchoShellPreviewData(
    val id: Int,
    val activityId: Int,
)
