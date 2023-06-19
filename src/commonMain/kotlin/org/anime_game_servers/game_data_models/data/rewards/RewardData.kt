package org.anime_game_servers.game_data_models.data.rewards

import kotlinx.serialization.Serializable
import org.anime_game_servers.game_data_models.data.interfaces.IntKey
import org.anime_game_servers.game_data_models.data.quest.GainItem

/**
 * This Contains all information about item rewards gained though multiple means.
 * Some example of models making use of this class are [TransPointRewardData], [org.anime_game_servers.game_data_models.data.quest.MainQuestData].
 * [org.anime_game_servers.game_data_models.data.watcher.ReunionWatcherData] and [org.anime_game_servers.game_data_models.data.watcher.ActivityWatcherData].
 * These are known names for files handled by this class:
 * ExcelBinOutput/RewardExcelConfigData.json
 * txt/RewardData.txt (with an appropriate parser)
 * @property rewardId id of this object
 * @property hcoin amoung of hcoin (priogems) to reward
 * @property scoin amoung of scoin (mora) to reward
 * @property playerExp amount of player/adventure rank exp to reward
 * @property rewardItemList list of items to reward
 * @property characterExp amount of character exp to reward
 * @property friendshipExp amount of friendship exp to reward
 * @property resin amount of resin to reward
 * @property outputSourceType TODO what is this
 * @property dailyLimit limit of how much the player can get per day
 * @property totalLimit limit of how much the player can get over the lifetime of the account
 * @property activityLimit limit of how much the player can get during a specific event schedule
 */
@Serializable
data class RewardData(
    val rewardId: Int,
    val hcoin: Int,
    val scoin: Int,
    val playerExp: Int,
    val rewardItemList: List<GainItem>,
    // custom
    val characterExp: Int,
    val friendshipExp: Int,
    val resin: Int,
    val outputSourceType: Int, //TODO what is this
    val dailyLimit: Int,
    val totalLimit: Int,
    val activityLimit: Int,
) : IntKey {
    override fun getIntKey() = rewardId
}
