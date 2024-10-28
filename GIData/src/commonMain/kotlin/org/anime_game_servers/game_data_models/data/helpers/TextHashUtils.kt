package org.anime_game_servers.game_data_models.data.helpers

import org.anime_game_servers.game_data_models.data.general.TextHash
import org.kotlincrypto.hash.md.MD5

/**
 * This generates a [TextHash] from a given string.
 */
fun getTextHash(textString: String): ULong {
    var bytes = textString.encodeToByteArray()
    bytes = bytes.copyOf((textString.length shr 8) + 1 shl 8)

    val hash = MD5().digest(bytes)
    var result = 0UL

    hash.take(8).forEachIndexed { index, byte ->
        result += ((byte.toULong() and 0xFFU) shl (8 * index))
    }

    return result
}
