package org.anime_game_servers.game_data_models.data.talks

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.game_data_models.data.interfaces.IntKey

@Serializable
@OptIn(ExperimentalSerializationApi::class)
data class TalkData(
    @JsonNames("id", "_id")
    val id: Int,
    @JsonNames("beginWay", "_beginWay")
    val beginWay: String? = null,
    @JsonNames("beginCondComb", "_beginCondComb")
    val beginCondComb: String? = null,
    @JsonNames("beginCond", "_beginCond")
    val beginCond: List<BeginCond>? = null,
    @JsonNames("heroTalk", "_heroTalk")
    val heroTalk: String? = null,
    @JsonNames("loadType", "_loadType")
    val loadType: String? = null,
    @JsonNames("activeMode", "_activeMode")
    val activeMode: String? = null,
    @JsonNames("nextTalks", "_nextTalks") // TODO check
    val nextTalks: List<Int>? = null,
    @JsonNames("priority", "_priority")
    val priority: Int = -1,
    @JsonNames("initDialog", "_initDialog")
    val initDialog: Int = -1,
    @JsonNames("npcIds", "_npcId", "npcId")
    val npcIds: List<Int>? = null,
    @JsonNames("performCfg", "_performCfg")
    val performCfg: String? = null,
    @JsonNames("prePerformCfg", "_prePerformCfg")
    val prePerformCfg: String? = null,
    @JsonNames("questId", "_questId")
    val questId: Int = -1,
    @JsonNames("decoratorId", "_decoratorID") // E.g. EJHGBAPGFHG
    val decoratorID: Int = -1,

    @JsonNames("crowdLOD0List", "_crowdLOD0List") // E.g. DGOJPEGIFOC
    val crowdLOD0List: List<Int>? = null,
    @JsonNames("participantId", "_participantId")
    val participantId: List<Int>? = null,
    @JsonNames("nextRandomTalks", "_nextRandomTalks") // E.g. NECBIIDHGOA
    val nextRandomTalks: List<Int>? = null,
    @JsonNames("showRandomTalkCount", "_showRandomTalkCount") // E.g. PBJHILLACIA
    val showRandomTalkCount: Int = -1,
    @JsonNames("lockGameTime", "_lockGameTime")
    val lockGameTime: Boolean? = null,
    @JsonNames("finishExec", "_finishExec")
    val finishExec: List<TalkExec>? = null,

    @JsonNames("talkMarkType", "_talkMarkType")
    val talkMarkType: String? = null,
    @JsonNames("enableCameraDisplacement", "_enableCameraDisplacement")
    val enableCameraDisplacement: Boolean? = null,
    @JsonNames("stayFreeStyle", "_stayFreeStyle")
    val stayFreeStyle: Boolean? = null,
    @JsonNames("questIdleTalk", "_questIdleTalk")
    val questIdleTalk: Boolean? = null,
    @JsonNames("lowPriority", "_lowPriority")
    val lowPriority: Boolean? = null,
    @JsonNames("dontBlockDaily", "_dontBlockDaily")
    val dontBlockDaily: Boolean? = null,

    // binout only:
    val assetIndex: Long = -1,

    // binout unknown (3.2)
    //val CIAAAKHILBD: List<Int>? = null,

    // excel only
    @JsonNames("talkMarkHideList", "_talkMarkHideList") // quests in talks with this set don't exist in binout
    val talkMarkHideList: List<Int>? = null,
    @JsonNames("extraLoadMarkId", "_extraLoadMarkId") // talks  don't appear in the referenced quests in binout
    val extraLoadMarkId: List<Int>? = null,
    ) : IntKey {
    override fun getIntKey() = id
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class BeginCond(
    @JsonNames("type", "_type")
    val type: String? = null,
    @JsonNames("params", "_params", "_param")
    val params: List<String>? = null
)
