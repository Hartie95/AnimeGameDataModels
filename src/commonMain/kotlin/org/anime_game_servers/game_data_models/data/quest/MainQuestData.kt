package org.anime_game_servers.game_data_models.data.quest

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.game_data_models.data.general.TextMapHash
import org.anime_game_servers.game_data_models.data.general.UnsetTextMap
import org.anime_game_servers.game_data_models.data.interfaces.IntKey
import org.anime_game_servers.game_data_models.data.talks.TalkData
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

@DataFile("ExcelBinOutput/MainQuestExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("BinOutput/Quest/*.json", FileType.JSON, FolderType.BINOUT)
@DataFile("txt/MainQuestData*.txt", FileType.TSV, FolderType.EXCEL)
@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class MainQuestData(
    @JsonNames("id", "mainId")
    val id: Int,

    val collectionId: Int = -1,
    val series: Int = -1,
    val chapterId: Int = -1,
    @JsonNames("taskType", "type")
    val taskType: String? = null,


    val luaPath: String? = null,
    @SerialName("recommendLevel")
    val recommendedLevel: Int = -1,
    val showType: String? = null,
    val repeatable: Boolean? = null,
    val suggestTrackOutOfOrder: Boolean? = null,
    val suggestTrackMainQuestList: List<Int>? = null,
    val rewardIdList: List<Int>? = null,
    val activeMode: String? = null,
    val activityId: Int = -1,
    val mainQuestTag: String? = null,
    val showRedPoint: Boolean? = null,
    @JsonNames("taskId", "taskID")
    val taskId: Int = -1,

    // Textmaps
    val titleTextMapHash: TextMapHash = UnsetTextMap,
    val descTextMapHash: TextMapHash = UnsetTextMap,

    // only txt
    val activityType: Int = -1,
    val videoKey: Long = -1,

    // only binout and patched
    val subQuests: List<SubQuestData>? = null,
    val talks: List<TalkData>? = null,
    val preloadLuaList : List<Long>? = null,
    val forcePreloadLuaList : List<Long>? = null,
    val freeStyleDic: Map<String, List<Int>>? = null,

    //TODO find content (3.2) first json value is MainQuestExcel, second is binout/Quest
    /*@JsonNames("KIODJCKJHHB", "EHPHJCINDBL")
    val KIODJCKJHHB: List<Int>? = null,
    @JsonNames("BJOJMLDHIGH", "DJKNKGBBFEH")
    val BJOJMLDHIGH: List<Int>? = null,
    @JsonNames("DDPIINIHIIP", "NNIEFFEDHHH")
    val DDPIINIHIIP: Int = -1,*/
): IntKey{
    override fun getIntKey() = id
}
