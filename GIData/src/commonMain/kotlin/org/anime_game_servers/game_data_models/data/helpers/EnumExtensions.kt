package org.anime_game_servers.game_data_models.data.helpers

import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.core.base.interfaces.IntValueEnum

inline fun <reified T : Enum<T>> enumValueOfOrNull(name: String): T? =
    runCatching { enumValueOf<T>(name) }.getOrNull()

inline fun <reified T : Enum<T>> enumValueOfOrDefault(name: String, default: T): T =
    runCatching { enumValueOf<T>(name) }.getOrNull()?:default

/**
 * return null if not set, so name == null, return fallback if it's an unknown value
 */
inline fun <reified T : Enum<T>> nullableEnumValueOfOrDefault(name: String?, default: T): T? =
    name?.let { runCatching { enumValueOf<T>(name) }.getOrNull()?:default}
/**
 * return null if not set, so name == null, return fallback if it's an unknown value
 */
inline fun <reified T : Enum<T> > nullableEnumValueOfOrDefault(id: Int?, default: T): T? =
    id?.let { runCatching { enumValues<T>().filter {
        return@filter when(it){
            is IntKey -> it.getIntKey() == id
            is IntValueEnum -> it.getValue() == id
            else -> false
        }
    }.getOrNull(0)}.getOrDefault(default)}
