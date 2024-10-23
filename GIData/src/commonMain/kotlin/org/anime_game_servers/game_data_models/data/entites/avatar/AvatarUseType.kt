package org.anime_game_servers.game_data_models.data.entites.avatar

import org.anime_game_servers.core.base.interfaces.IntKey

enum class AvatarUseType(val id: Int): IntKey {
    AVATAR_TEST(0),
    AVATAR_SYNC_TEST(1),
    AVATAR_FORMAL(2),
    AVATAR_ABANDON(3),
    AVATAR_UNKNOWN(99999);

    override fun getIntKey() = id
}