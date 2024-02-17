package org.anime_game_servers.game_data_models.data.activity.echo_shell

import kotlinx.serialization.Serializable
import org.anime_game_servers.game_data_models.data.interfaces.IntKey
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * TODO document
 * These are known names for files handled by this class:
 * ExcelBinOutput/EchoShellFloatSignalExcelConfigData.json
 * txt/EchoShellFloatSignal.txt (with an appropriate parser)
 */
@DataFile("ExcelBinOutput/EchoShellFloatSignalExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/EchoShellFloatSignal.txt", FileType.TSV, FolderType.EXCEL)
@Serializable
data class EchoShellFloatSignalData(
    val id: Int,
    val groupId: Int,
    val configId: Int,
) : IntKey {
    override fun getIntKey() = id
}
