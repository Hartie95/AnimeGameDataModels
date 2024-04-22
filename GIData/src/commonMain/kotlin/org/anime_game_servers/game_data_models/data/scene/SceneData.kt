package org.anime_game_servers.game_data_models.data.scene

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.game_data_models.data.helpers.nullableEnumValueOfOrDefault
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * This file contains information about scenes, that the server should use to manage and set up scenes the player joins.
 *
 */
@DataFile("ExcelBinOutput/SceneExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/SceneData.txt", FileType.TSV, FolderType.EXCEL)
@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class SceneData(
    val id: Int,
    @SerialName("type")
    val typeString: String? = null,
    @Transient
    val type: SceneType? = nullableEnumValueOfOrDefault(typeString, SceneType.SCENE_UNKNOWN),
    @SerialName("subtype")
    val subtypeString: String? = null,
    @Transient
    val subType: SceneSubType? = nullableEnumValueOfOrDefault(subtypeString, SceneSubType.SCENE_SUB_TYPE_UNKNOWN),
    val scriptData: String? = null, // only in client
    val ignoreNavMesh: Boolean? = null,
    val useToTheMoon: Boolean? = null,
    val navmeshModeString: String? = null, // not in client
    @Transient
    val navmeshMode: NavmeshModeType? = nullableEnumValueOfOrDefault(navmeshModeString, NavmeshModeType.NAVMESH_MODE_UNKNOWN),
    val levelEntityConfig: String? = null,
    val entityAppearSorted: Int? = null,
    val specifiedAvatarList: List<Int>? = null,
    val maxSpecifiedAvatarNum: Int? = null,
    @JsonNames("is_check_output_config")
    val checkLevelOutputConfig: Boolean? = null, // not in client
    val safePoint: Int? = null,
    @SerialName("mpType")
    val mpTypeString: String? = null,
    @Transient
    val mpType: SceneMpType? = nullableEnumValueOfOrDefault(mpTypeString, SceneMpType.SCENE_MP_UNKNOWN),
    val isAllowMapMarkPoint: Boolean? = null,
    val isDeleteMapMarkPoint: Boolean? = null,
    val dungeonEntryPoint: List<Int>? = null,
    val isBlockBinAbandoned: Boolean? = null, // not in client
    val isSceneBinAbandoned: Boolean? = null, // not in client
    val imageSceneId: Int? = null,
) : IntKey {
    override fun getIntKey() = id
}
