package org.anime_game_servers.game_data_models.data.activity

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.data.general.LogicType
import org.anime_game_servers.game_data_models.data.helpers.nullableEnumValueOfOrDefault
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * This contains information about conditions during activities.
 * Changes to these conditions can trigger external events by systems listening to them,and also ActivityActions that
 * are triggered directly internally
 * These are known names for files handled by this class:
 * Patches/Activity/NewActivityCondData.json
 * ExcelBinOutput/NewActivityCondExcelConfigData.json
 * txt/NewActivityCondData.txt (with an appropriate parser)
 * @property id The ID of the condition
 * @property condCombString The type of logic to use when combining the conditions
 * @property condComb The enum representation of the logic type from condCombString
 * @property cond The list of conditions that must be met for this condition to be valid/not be met to be invalid
 * @property onValidExec The list of ActivityActions to execute when the condition is valid
 * @property onInvalidExec The list of ActivityActions to execute when the condition is invalid
 */
@DataFile("ExcelBinOutput/NewActivityCondExcelConfigData.json", FileType.JSON,FolderType.EXCEL)
@DataFile("txt/NewActivityCondData.txt", FileType.TSV, FolderType.EXCEL)
@DataFile("Patches/Activity/NewActivityCondData.json", FileType.JSON, FolderType.PATCH)
@DataFile("Generated/Activity/NewActivityCondData.json", FileType.JSON, FolderType.GENERATED)
@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class ActivityCondData(
    @JsonNames("id", "condId")
    val id: Int,
    @SerialName("condComb")
    val condCombString: String? = null,
    @Transient
    val condComb: LogicType? = nullableEnumValueOfOrDefault(condCombString, LogicType.LOGIC_UNKNOWN),
    val cond: List<ActivityConfigCondition>? = null,

    val onValidExec: List<ActivityConfigExec>? = null,
    val onInvalidExec: List<ActivityConfigExec>? = null,
) : IntKey {
    override fun getIntKey() = id

    /**
     * Defines one condition for an ActivityCondData
     * The params usage depends on the type
     */
    @Serializable
    data class ActivityConfigCondition(
        @SerialName("type")
        val typeString: String? = null,
        @Transient
        val type: ActivityCondition? = nullableEnumValueOfOrDefault(
            typeString,
            ActivityCondition.NEW_ACTIVITY_COND_UNKNOWN
        ),
        val param: List<Int>? = null,
    )

    /**
     * Defines an action to be executed when a condition state changes
     * @param param Contains the parameters for the action. The specific meaning of them depends on the type, for info check the type documentation in [ActivityAction]
     */
    @Serializable
    data class ActivityConfigExec(
        @SerialName("type")
        val typeString: String? = null,
        @Transient
        val type: ActivityAction? = nullableEnumValueOfOrDefault(typeString, ActivityAction.ACTIVITY_ACTION_UNKNOWN),
        val param: List<Int>? = null,
    )
}
