package org.anime_game_servers.game_data_models.data.entities.avatar

import org.anime_game_servers.core.base.interfaces.IntKey

/**
 * This defines the body type of the avatar/character.
 * @property id The identifier for the body type
 */
enum class BodyType(val id: Int): IntKey {
    /**
     * No body type specified
     */
    BODY_NONE(0),

    /**
     * Male teen/medium-sized body type
     */
    BODY_BOY(1),

    /**
     * female teen/medium-sized body type
     */
    BODY_GIRL(2),

    /**
     * Women/tall-sized female body type
     */
    BODY_LADY(3),

    /**
     * Man/tall-sized male body type
     */
    BODY_MALE(4),

    /**
     * Young girl/short-sized female body type
     */
    BODY_LOLI(5),

    /**
     * Unknown body type, check the string version of the field for more information
     */
    BODY_UNKNOWN(99999);

    override fun getIntKey() = id
}