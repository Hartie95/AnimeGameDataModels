package org.anime_game_servers.game_data_models.gi.data.dungeon

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.gi.data.general.LogicType
import org.anime_game_servers.game_data_models.gi.helpers.nullableEnumValueOfOrDefault
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * This defines different possible conditions for passing/completing a dungeon. They are referenced by [DungeonData.passCond] via ID.
 * These are known names for files handled by this class:
 * ExcelBinOutput/DungeonPassExcelConfigData.json
 * txt/DungeonPassData.txt (with an appropriate parser)
 * @property id The ID pass info for the dungeon
 * @property logicTypeString The type of logic to use when combining the conditions
 * @property logicType The enum representation of the logic type from logicTypeString. LogicType.LOGIC_UNKNOWN if the string is not a known type
 * @property conds The list of conditions that must be met for the dungeon to be passed
 */
@DataFile("ExcelBinOutput/DungeonPassExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/DungeonPassData.txt", FileType.TSV, FolderType.EXCEL)
@Serializable
data class DungeonPassData(
    val id: Int,
    @SerialName("logicType")
    val logicTypeString: String? = null,
    @Transient
    val logicType: LogicType? = nullableEnumValueOfOrDefault(logicTypeString, LogicType.LOGIC_UNKNOWN),
    val conds: List<DungeonPassCondition>? = null,
) : IntKey {
    override fun getIntKey() = id

    fun getLogicTypeNonNull() = logicType ?: LogicType.LOGIC_NONE

    /**
     * Defines one condition for an DungeonPassData
     * The params usage depends on the type
     * @property condTypeString The type of condition
     * @property condType The enum representation of the condition type from condTypeString. LogicType.LOGIC_UNKNOWN if the string is not a known type
     * @property param The parameters for the condition
     */
    @Serializable
    data class DungeonPassCondition(
        @SerialName("condType")
        val condTypeString: String? = null,
        @Transient
        val condType: DungeonPassConditionType? = nullableEnumValueOfOrDefault(
            condTypeString,
            DungeonPassConditionType.DUNGEON_COND_UNKNOWN
        ),
        val param: List<Int>? = null,
    ) {
        fun getCondTypeNonNull() = condType ?: DungeonPassConditionType.DUNGEON_COND_NONE
    }

}
