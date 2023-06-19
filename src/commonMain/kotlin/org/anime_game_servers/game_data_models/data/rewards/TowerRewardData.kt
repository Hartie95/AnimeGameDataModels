package org.anime_game_servers.game_data_models.data.rewards

import kotlinx.serialization.Serializable
import org.anime_game_servers.game_data_models.data.interfaces.IntKey

/**
 * This Contains the reward references for different levels of success in the spiral abyss (tower)
 * The rewardsId referenced in this class is found in [RewardData]
 * These are known names for files handled by this class:
 * ExcelBinOutput/TowerRewardExcelConfigData.json
 * txt/TowerRewardData.txt (with an appropriate parser)
 * @property rewardGroupId id of the reward found in [RewardData]
 * @property layerCount the level the  of the tower the player did. 1-8 are the abyss corridor and normally stay the same.
 * 9-12 are the moon spire and change every from time to time
 * @property threeStarReward the rewardId in [RewardData] for getting 3 stars on the floor
 * @property sixStarReward the rewardId in [RewardData] for getting 6 stars on the floor
 * @property nineStarReward the rewardId in [RewardData] for getting 9 stars on the floor
 * @property levelReward the rewardId in [RewardData] for completing each chamber. e.g. index 0 is for chamber 1
 */
@Serializable
data class TowerRewardData(
    val rewardGroupId: Int,
    val layerCount: Int,
    val threeStarReward: Int,
    val sixStarReward: Int,
    val nineStarReward: Int,
    val levelReward: List<Int>
) : IntKey {
    override fun getIntKey() = (rewardGroupId shl 8) + layerCount
}
