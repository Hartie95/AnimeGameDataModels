package org.anime_game_servers.game_data_models.gi.data.rewards

import kotlinx.serialization.Serializable
import org.anime_game_servers.core.base.interfaces.StringKey
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * TODO document
 * This file is only part of the client data and not used on the server side.
 * These are known names for files handled by this class:
 * ExcelBinOutput/RewardPreviewExcelConfigData.json
 */
@DataFile("ExcelBinOutput/RewardPreviewExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@Serializable
data class RewardPreviewData(
    val desc:String,
    val id: Int = 0,
    val previewItems: List<RewardPreviewItem>,
): StringKey {
    override fun getStringKey() = id.toString()+desc
}
