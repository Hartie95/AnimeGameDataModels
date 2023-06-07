package org.anime_game_servers.game_data_models.data.quest

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import org.anime_game_servers.game_data_models.data.general.LogicType
import org.anime_game_servers.game_data_models.data.helpers.nullableEnumValueOfOrDefault
import org.anime_game_servers.game_data_models.data.interfaces.IntKey

@Serializable
data class SubQuestData(
    val subId: Int,
    val mainId: Int,
    val order: Int = -1,
    val subIdSet: Int = -1,
    val isMpBlock: Boolean? = null,
    val showType: String? = null,
    val failParentShow: String? = null,
    val finishParent: Boolean? = null,
    val failParent: Boolean? = null,
    val isRewind: Boolean? = null,

    val luaPath: String? = null, // binout
    val trialAvatarList: List<Int>? = null,

    val versionBegin: String? = null,
    val versionEnd: String? = null,

    // quest conditions
    @SerialName("acceptCondComb")
    val acceptCondCombString: String? = null,
    @Transient
    val acceptCondComb: LogicType? = nullableEnumValueOfOrDefault(acceptCondCombString, LogicType.LOGIC_UNKNOWN),
    val acceptCond: List<QuestCondition>? = null,
    @SerialName("finishCondComb")
    val finishCondCombString: String? = null,
    @Transient
    val finishCondComb: LogicType? = nullableEnumValueOfOrDefault(finishCondCombString, LogicType.LOGIC_UNKNOWN),
    val finishCond: List<QuestContent>? = null,
    @SerialName("failCondComb")
    val failCondCombString: String? = null,
    @Transient
    val failCondComb: LogicType? = nullableEnumValueOfOrDefault(failCondCombString, LogicType.LOGIC_UNKNOWN),
    val failCond: List<QuestContent>? = null,


    // quest execs
    val beginExec: List<QuestExec>? = null,
    val finishExec: List<QuestExec>? = null,
    val failExec: List<QuestExec>? = null,

    val guide: QuestGuide? = null,
    val showGuide: String? = null,
    val banType: String? = null,
    val exclusiveNpcList: List<Int>? = null,
    val exclusiveNpcPriority: Int = -1,
    val sharedNpcList: List<Int>? = null,
    val exclusivePlaceList: List<Int>? = null,

    // Textmaps
    val descTextMapHash: Long = -1,
    val stepDescTextMapHash: Long = -1,
    val guideTipsTextMapHash: Long = -1,

    //custom elements
    var gainItems: List<GainItem>? = null,
    ) : IntKey {
        override fun getIntKey() = subId
    }
