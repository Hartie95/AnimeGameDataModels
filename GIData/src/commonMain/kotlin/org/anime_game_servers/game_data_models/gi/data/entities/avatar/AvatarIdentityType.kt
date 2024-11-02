package org.anime_game_servers.game_data_models.gi.data.entities.avatar

import org.anime_game_servers.core.base.interfaces.IntKey

/**
 * TODO documentation
 */
enum class AvatarIdentityType(val id: Int): IntKey {
    AVATAR_IDENTITY_MASTER(0),
    AVATAR_IDENTITY_NORMAL(1),
    AVATAR_IDENTITY_UNKNOWN(99999);

    override fun getIntKey() = id
}