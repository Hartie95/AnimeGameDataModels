package org.anime_game_servers.game_data_models.data.entites.avatar

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.data.general.*
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * This contains information about different wind glider skins for characters/avatars.
 * These are known names for files handled by this class:
 * ExcelBinOutput/AvatarFlycloakExcelConfigData.json
 * txt/AvatarFlycloakData.txt
 * @property flycloakId The id of the wind glider skin and primary identifier
 * @property materialId The material/item id to acquire this wind glider skin
 * @property prefabPath todo document
 * @property jsonName todo document
 * @property icon todo document
 * @property hide This determines if the wind glider skin is hidden in teh UI
 * @property nameTextMapHash The [TextMapHash] of the name of the wind glider skin, that can be shown in the UI
 * @property descTextMapHash The [TextMapHash] of the description of the wind glider skin, that can be shown in the UI
 */
@DataFile("ExcelBinOutput/AvatarFlycloakExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/AvatarFlycloakData.txt", FileType.TSV, FolderType.EXCEL)
@Serializable
@OptIn(ExperimentalSerializationApi::class)
data class AvatarFlycloakData(
    @JsonNames("flycloak_Id", "flycloakID")
    val flycloakId: Int,
    @JsonNames("material_id", "materialID")
    val materialId: Int = UnsetInt,

    // Client only
    @JsonNames("prefab_path")
    val prefabPath: String? = null,
    @JsonNames("json_name")
    val jsonName: String? = null,
    val icon: String? = null,
    val hide: Boolean = false,

    //textMaps
    val nameTextMapHash: TextMapHash = UnsetTextMap,
    val descTextMapHash: TextMapHash = UnsetTextMap,

    ): IntKey {
    override fun getIntKey() = flycloakId
}
