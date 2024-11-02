package org.anime_game_servers.game_data_models.gi.data.scene

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.game_data_models.gi.data.general.Element
import org.anime_game_servers.game_data_models.gi.data.general.UnsetInt
import org.anime_game_servers.game_data_models.gi.helpers.nullableEnumValueOfOrDefault
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 *
 */
@DataFile("ExcelBinOutput/WorldAreaConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/WorldAreaData*.txt", FileType.TSV, FolderType.EXCEL)
@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class WorldAreaConfigData(
    @JsonNames("ID")
    val id: Int,
    @JsonNames("SceneID", "SceneId", "scene_id")
    val sceneId: Int,
    @SerialName("areaType") @JsonNames("AreaType", "area_type")
    val areaTypeString: String? = null,
    @Transient
    val areaType: WorldAreaType? = nullableEnumValueOfOrDefault(areaTypeString, WorldAreaType.LEVEL_UNKNOWN),
    @JsonNames("AreaID1", "AreaId1", "area_id_1")
    val areaId1: Int,
    @JsonNames("AreaID2", "AreaId2", "area_id_2")
    val areaId2: Int = UnsetInt,
    @JsonNames("AreaDefaultLock", "area_default_lock")
    val areaDefaultLock: Boolean? = null,
    @JsonNames("tower_point_id")
    val towerPointId: Int = UnsetInt,
    @SerialName("elementType") @JsonNames("element_type")
    val elementTypeString: String? = null,
    @Transient
    val elementType: Element? = nullableEnumValueOfOrDefault(elementTypeString, Element.DEFAULT),
    @SerialName("terrainType") @JsonNames("TerrainType", "terrain_type")
    val terrainTypeString: String? = null,
    @Transient
    val terrainType: AreaTerrainType? = nullableEnumValueOfOrDefault(
        terrainTypeString,
        AreaTerrainType.AREA_TERRAIN_UNKNOWN
    ),
    @JsonNames("show_tips")
    val showTips: Boolean? = null,
    @JsonNames("minimap_scale")
    val minimapScale: Float,
) : IntKey {
    override fun getIntKey() = id
}
