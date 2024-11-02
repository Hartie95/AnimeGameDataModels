package org.anime_game_servers.game_data_models.gi.data.activity

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * This file maps [ActivityData.condGroupIds] entries to [ActivityCondData.id]. Each entry can have multiple condIds mapped to it.
 * @property condGroupId The ID of the condition group
 * @property condIds The list of condition IDs from [ActivityCondData] that are part of this group
 */
@DataFile("txt/NewActivityCondGroupData.txt", FileType.TSV, FolderType.EXCEL)
@DataFile("Server/ActivityCondGroups.json", FileType.JSON, FolderType.CUSTOM)
@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class ActivityCondGroupData(
    @JsonNames("id", "condId")
    val condGroupId: Int,
    val condIds: List<Int>
) : IntKey {
    override fun getIntKey() = condGroupId
}
