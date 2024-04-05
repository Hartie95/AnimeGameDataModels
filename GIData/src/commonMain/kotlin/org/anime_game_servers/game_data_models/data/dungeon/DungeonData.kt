package org.anime_game_servers.game_data_models.data.dungeon

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.data.general.TextMapHash
import org.anime_game_servers.game_data_models.data.helpers.nullableEnumValueOfOrDefault
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * TODO document
 * @property isDynamicLevel also known as dynamic difficulty TODO
 * @property passRewardId id for an entry in [org.anime_game_servers.game_data_models.data.rewards.RewardData] that contains the data awarded on first pass. Not included in the client data
 * @property passRewardPreviewId id for an entry in [org.anime_game_servers.game_data_models.data.rewards.RewardPreviewData]. Might or might not be the same as the RewardData content. Client only
 */
@DataFile("ExcelBinOutput/EchoShellSummerTimeDungeonExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/DungeonExcelConfigData.txt", FileType.TSV, FolderType.EXCEL)
@Serializable
data class DungeonData(
    val id: Int,
    @SerialName("type")
    val typeString: String?,
    @Transient
    val type: DungeonType? = nullableEnumValueOfOrDefault(typeString, DungeonType.DUNGEON_UNKNOWN),
    @SerialName("subType")
    val subTypeString: String?,
    @Transient
    val subType: DungeonSubType? = nullableEnumValueOfOrDefault(subTypeString, DungeonSubType.DUNGEON_SUB_UNKNOWN),
    @SerialName("playType")
    val playTypeString: String?,
    @Transient
    val playType: DungeonPlayType? = nullableEnumValueOfOrDefault(playTypeString, DungeonPlayType.DUNGEON_PLAY_TYPE_UNKNOWN),
    @SerialName("involveType")
    val involveTypeString: String?, //  Online Type?
    @Transient
    val involveType: InvolveType? = nullableEnumValueOfOrDefault(involveTypeString, InvolveType.INVOLVE_UNKNOWN),

    val serialId: Int, //sequens id?
    val eventInterval: Int, // Script timing event interval?
    val sceneId: Int,
    val showLevel: Int,
    val avatarLimitType: Int,
    val limitLevel: Int,
    val levelRevise: Int,
    val isDynamicLevel: Boolean,
    val passCond: Int,
    val passRewardId: Int,
    val passRewardPreviewId: Int, //client only
    val passJumpDungeon: Int,
    val reviveMaxCount: Int,
    val dayEnterCount: Int,
    val settleCountdownTime: Int,
    val failSettleCountdownTime: Int,
    val quitSettleCountdownTime: Int,
    val settleShows: List<String>, // TODO enum
    val interceptReviveAfterSettle: Boolean,
    val statueCostId: Int,
    val statueCostCount: Int,
    val statueDrop: Int,
    val levelConfigMap: Map<String, Int>, //Challenge factor combination?
    val cityId: Int,
    val stateTypeString: String?,
    @Transient
    val stateType: DungeonStateType? = nullableEnumValueOfOrDefault(stateTypeString, DungeonStateType.DUNGEON_STATE_UNKNOWN),

    // Client only
    val forbiddenRestart: Boolean,
    val settleUITypeString: String?,
    @Transient
    val settleUIType: SettleUIType? = nullableEnumValueOfOrDefault(settleUITypeString, SettleUIType.SETTLE_UI_UNKNOWN),
    val recommendElementTypes: List<String>,
    val enterCostItems: List<Int>,
    val entryPicPath: String,
    val dungeonEntryRecommendTips: List<String>,// TODO enum?

    //textMaps
    val nameTextMapHash: TextMapHash,
    val displayNameTextMapHash: TextMapHash,
    val descTextMapHash: TextMapHash,
) : IntKey {
    override fun getIntKey() = id
}
//EIJDIFIEHGK: String (Art path)
//HJNOICGKCEN: String (Art path)
