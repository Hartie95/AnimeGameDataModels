package org.anime_game_servers.game_data_models.gi.data.dungeon

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.gi.data.general.Element
import org.anime_game_servers.game_data_models.gi.data.general.TextMapHash
import org.anime_game_servers.game_data_models.gi.data.general.UnsetInt
import org.anime_game_servers.game_data_models.gi.data.general.UnsetTextMap
import org.anime_game_servers.game_data_models.gi.data.rewards.RewardData
import org.anime_game_servers.game_data_models.gi.data.rewards.RewardPreviewData
import org.anime_game_servers.game_data_models.gi.helpers.nullableEnumValueOfOrDefault
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * This contains info about dungeons
 * @property isDynamicLevel also known as dynamic difficulty TODO
 * @property passRewardId id for an entry in [RewardData] that contains the data awarded on first pass. Not included in the client data
 * @property passRewardPreviewId id for an entry in [RewardPreviewData]. Might or might not be the same as the RewardData content. Client only
 */
@DataFile("ExcelBinOutput/DungeonExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/DungeonData.txt", FileType.TSV, FolderType.EXCEL)
@Serializable
data class DungeonData(
    val id: Int,
    @SerialName("type")
    val typeString: String? = null,
    @Transient
    val type: DungeonType? = nullableEnumValueOfOrDefault(typeString, DungeonType.DUNGEON_UNKNOWN),
    @SerialName("subType")
    val subTypeString: String? = null,
    @Transient
    val subType: DungeonSubType? = nullableEnumValueOfOrDefault(subTypeString, DungeonSubType.DUNGEON_SUB_UNKNOWN),
    @SerialName("playType")
    val playTypeString: String? = null,
    @Transient
    val playType: DungeonPlayType? = nullableEnumValueOfOrDefault(playTypeString, DungeonPlayType.DUNGEON_PLAY_TYPE_UNKNOWN),
    @SerialName("involveType")
    val involveTypeString: String? = null, //  Online Type?
    @Transient
    val involveType: InvolveType? = nullableEnumValueOfOrDefault(involveTypeString, InvolveType.INVOLVE_UNKNOWN),

    val serialId: Int = UnsetInt, //sequens id?
    val eventInterval: Int = UnsetInt, // Script timing event interval?
    val sceneId: Int = UnsetInt,
    val showLevel: Int = UnsetInt,
    val avatarLimitType: Int = UnsetInt,
    val limitLevel: Int = UnsetInt,
    val levelRevise: Int = UnsetInt,
    val isDynamicLevel: Boolean? = null,
    val passCond: Int = UnsetInt,
    val passRewardId: Int = UnsetInt, // server only
    val passRewardPreviewId: Int = UnsetInt, //client only
    val passJumpDungeon: Int = UnsetInt,
    val reviveMaxCount: Int = UnsetInt,
    val dayEnterCount: Int = UnsetInt,
    val settleCountdownTime: Int = UnsetInt,
    val failSettleCountdownTime: Int = UnsetInt,
    val quitSettleCountdownTime: Int = UnsetInt,
    @SerialName("settleShows")
    val settleShowStrings: List<String>? = null,
    @Transient
    val settleShows: List<SettleShowType>? = settleShowStrings?.mapNotNull { nullableEnumValueOfOrDefault(it, SettleShowType.SETTLE_SHOW_UNKNOWN) },
    val interceptReviveAfterSettle: Boolean? = null,
    val statueCostId: Int = UnsetInt,
    val statueCostCount: Int = UnsetInt,
    val statueDrop: Int = UnsetInt,
    val levelConfigMap: Map<String, Int>? = null, //Challenge factor combination?
    val cityId: Int = UnsetInt,
    @SerialName("stateType")
    val stateTypeString: String? = null,
    @Transient
    val stateType: DungeonStateType? = nullableEnumValueOfOrDefault(stateTypeString, DungeonStateType.DUNGEON_STATE_UNKNOWN),

    // Client only
    val forbiddenRestart: Boolean? = null,
    val settleUITypeString: String? = null,
    @Transient
    val settleUIType: SettleUIType? = nullableEnumValueOfOrDefault(settleUITypeString, SettleUIType.SETTLE_UI_UNKNOWN),
    @SerialName("recommendElementTypes")
    val recommendElementTypeStrings: List<String>? = null,
    @Transient
    val recommendElementTypes: List<Element>? = recommendElementTypeStrings?.mapNotNull { nullableEnumValueOfOrDefault(it, Element.DEFAULT) },
    val enterCostItems: List<Int> ? = null,
    val entryPicPath: String? = null,
    val dungeonEntryRecommendTips: List<String>? = null,// TODO enum? exists?

    //textMaps
    val nameTextMapHash: TextMapHash = UnsetTextMap,
    val displayNameTextMapHash: TextMapHash = UnsetTextMap,
    val descTextMapHash: TextMapHash = UnsetTextMap,
) : IntKey {
    override fun getIntKey() = id
}
//EIJDIFIEHGK: String (Art path)
//HJNOICGKCEN: String (Art path)
