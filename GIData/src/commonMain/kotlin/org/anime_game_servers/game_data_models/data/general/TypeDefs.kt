package org.anime_game_servers.game_data_models.data.general

import org.anime_game_servers.game_data_models.data.helpers.getTextHash

/**
 * Client only type. Maps to a string in the clients text map.
 */
typealias TextMapHash = Long
/**
 * Hash of a text String. This can be recreated by hashing the string via [getTextHash].
 */
typealias TextHash = ULong
