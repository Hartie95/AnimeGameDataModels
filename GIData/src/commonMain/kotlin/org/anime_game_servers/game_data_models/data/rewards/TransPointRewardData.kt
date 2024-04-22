package org.anime_game_servers.game_data_models.data.rewards

import kotlinx.serialization.Serializable
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType
import kotlin.jvm.JvmStatic

/**
 * These are the rewards for unlocking specific scene points in the game.
 * These are known names for files handled by this class:
 * ExcelBinOutput/TransPointRewardConfigData.json
 * txt/TransPointRewardData.txt (with an appropriate parser)
 * @property sceneId id of the scene in which the point got unlocked, and in which the area will be unlocked
 * @property pointId id of the point in scene [sceneId] to unlock
 * @property rewardId id of the reward found in [RewardData]
 * @property unlockAreaId id of the area to unlock
 * @property notificationGroupId TODO what is this
 */
@DataFile("ExcelBinOutput/TransPointRewardConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/TransPointRewardData.txt", FileType.TSV, FolderType.EXCEL)
@Serializable
data class TransPointRewardData(
    val sceneId: Int,
    val pointId: Int,
    val rewardId: Int,
    val unlockAreaId: List<Int>,
    val notificationGroupId: List<Int>,
) : IntKey {
    override fun getIntKey() = getKey(sceneId, pointId)
    companion object {
        @JvmStatic
        fun getKey(sceneId: Int, pointId: Int) = (pointId shl 8) + sceneId
    }
}
