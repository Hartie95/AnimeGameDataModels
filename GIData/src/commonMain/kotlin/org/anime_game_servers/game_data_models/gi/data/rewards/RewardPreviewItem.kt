package org.anime_game_servers.game_data_models.gi.data.rewards

import kotlinx.serialization.Serializable

/**
 * TODO document
 * @param id item id to be rewarded
 * @param count con be either a static number, or a range like x to y in this format "x;y"
 */
@Serializable
data class RewardPreviewItem(
    val id: Int,
    val count: String
)
