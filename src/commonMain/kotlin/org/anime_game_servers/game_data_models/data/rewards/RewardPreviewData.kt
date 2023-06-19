package org.anime_game_servers.game_data_models.data.rewards

import kotlinx.serialization.Serializable
import org.anime_game_servers.game_data_models.data.interfaces.StringKey

/**
 * TODO document
 * This file is only part of the client data and not used on the server side.
 * These are known names for files handled by this class:
 * ExcelBinOutput/EchoShellPreviewExcelConfigData.json
 */
@Serializable
data class RewardPreviewData(
    val desc:String,
    val id: Int = 0,
    val previewItems: List<RewardPreviewItem>,
): StringKey {
    override fun getStringKey() = id.toString()+desc
}
