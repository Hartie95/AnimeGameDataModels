package org.anime_game_servers.game_data_models.gi.data.entities.avatar

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.gi.data.general.ArithType
import org.anime_game_servers.game_data_models.gi.helpers.nullableEnumValueOfOrDefault
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * This contains information about the stats growth with each level for characters/avatars.
 * These are known names for files handled by this class:
 * ExcelBinOutput/AvatarCurveExcelConfigData.json
 * txt/AvatarExtraPropertyData.txt
 * @property level The level of the character to apply this growth curve to
 * @property curveInfos The growth curve information for the character at this level
 */
@DataFile("ExcelBinOutput/AvatarCurveExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/AvatarCirveData.txt", FileType.TSV, FolderType.EXCEL)
@Serializable
data class AvatarCurveData(
    val level: Int,
    val curveInfos: List<GrowCurveInfo>? = null,
): IntKey {
    override fun getIntKey() = level

    fun getCurveInfosNonNull() = curveInfos ?: emptyList()

    /**
     * Contains information about the growth curve of a character at a certain level
     * @property typeString The type of curve/stat to change
     * @property type The enum representation of typeString. [GrowthCurveType.GROW_CURVE_UNKNOWN] if set to something not in the enum
     * @property arithString The type of arithmetic to use for changing this stat
     * @property arith The enum representation of arithString. [ArithType.ARITH_UNKNOWN] if set to something not in the enum
     * @property value The value of the growth curve
     */
    @Serializable
    data class GrowCurveInfo(
        @SerialName("type")
        val typeString: String? = null,
        @Transient
        val type: GrowthCurveType? = nullableEnumValueOfOrDefault(typeString, GrowthCurveType.GROW_CURVE_UNKNOWN),
        @SerialName("arith")
        val arithString: String? = null,
        @Transient
        val arith: ArithType? = nullableEnumValueOfOrDefault(arithString, ArithType.ARITH_UNKNOWN),
        val value: Float
    )
}
