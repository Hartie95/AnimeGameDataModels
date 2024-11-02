package org.anime_game_servers.game_data_models.gi.data.activity.echo_shell

import kotlinx.serialization.Serializable
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType
import org.anime_game_servers.game_data_models.gi.data.rewards.RewardData

/**
 * Rewards for collecting echo shells during the echo shell activity/event.
 * These are known names for files handled by this class:
 * ExcelBinOutput/EchoShellRewardExcelConfigData.json
 * txt/EchoShellRewardData.txt (with an appropriate parser)
 * @property id id of the reward
 * @property rewardId id of the reward found in [RewardData]
 * @property shellCount minimum number of shells the user needs to collect to qualify for this reward
 */
@DataFile("ExcelBinOutput/EchoShellRewardExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/EchoShellRewardData.txt", FileType.TSV, FolderType.EXCEL)
@Serializable
data class EchoShellRewardData(
    val id: Int,
    val rewardId: Int,
    val shellCount: Int
) : IntKey {
    override fun getIntKey() = id
}
