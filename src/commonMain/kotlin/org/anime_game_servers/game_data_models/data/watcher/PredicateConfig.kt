package org.anime_game_servers.game_data_models.data.watcher

import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import org.anime_game_servers.game_data_models.data.helpers.nullableEnumValueOfOrDefault

@Serializable
data class PredicateConfig(
    val predicateTypeString: String? = null,
    @Transient
    val predicateType: PredicateType? = nullableEnumValueOfOrDefault(
        predicateTypeString,
        PredicateType.PREDICATE_UNKNOWN
    ),
    val paramList: List<Int>? = null
)
