package org.anime_game_servers.game_data_models.data.entities

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import org.anime_game_servers.game_data_models.data.entities.avatar.GrowthCurveType
import org.anime_game_servers.game_data_models.data.general.TextHash
import org.anime_game_servers.game_data_models.data.helpers.nullableEnumValueOfOrDefault

interface CreatureExcelConfig {
    val hpBase: Float
    val attackBase: Float
    val defenseBase: Float
    val critical: Float
    val antiCritical: Float
    val criticalHurt: Float
    val fireSubHurt: Float
    val grassSubHurt: Float
    val waterSubHurt: Float
    val elecSubHurt: Float
    val windSubHurt: Float
    val iceSubHurt: Float
    val rockSubHurt: Float
    val fireAddHurt: Float
    val grassAddHurt: Float
    val waterAddHurt: Float
    val elecAddHurt: Float
    val windAddHurt: Float
    val iceAddHurt: Float
    val rockAddHurt: Float
    val propGrowCurves: List<FightPropGrowConfig>?
    val elementMastery: Float
    val physicalSubHurt: Float
    val physicalAddHurt: Float
    val prefabPathRagdollHash: TextHash

    @Serializable
    data class FightPropGrowConfig(
        @SerialName("type")
        val typeString: String? = null,
        @Transient
        val type: FightPropType? = nullableEnumValueOfOrDefault(typeString, FightPropType.FIGHT_PROP_UNKNOWN),
        @SerialName("growCurve")
        val growCurveString: String? = null,
        @Transient
        val growCurve: GrowthCurveType? = nullableEnumValueOfOrDefault(growCurveString, GrowthCurveType.GROW_CURVE_UNKNOWN),
    )
}