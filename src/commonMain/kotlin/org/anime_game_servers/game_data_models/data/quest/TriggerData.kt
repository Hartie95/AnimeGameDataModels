package org.anime_game_servers.game_data_models.data.quest

import kotlinx.serialization.Serializable
import org.anime_game_servers.game_data_models.data.interfaces.IntKey

/**
 * Lists int representations of lua triggers as int representation,
 * These are known names for files handled by this class:
 * ExcelBinOutput/TriggerExcelConfigData.json
 * txt/TriggerData.txt (with an appropriate parser)
 * @param id The int representation of the trigger
 * @param sceneId The id of the `scene` the group of the trigger is in
 * @param groupId The group id containing the trigger
 * @param triggerName The name of the trigger from the lua group file
 */
@Serializable
data class TriggerData(
    val id:Int,
    val sceneId: Int,
    val groupId: Int,
    val triggerName: String,
    ) : IntKey {
    override fun getIntKey() = id
}
