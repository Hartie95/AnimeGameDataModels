package org.anime_game_servers.game_data_models.data.scene

import org.anime_game_servers.core.base.interfaces.IntKey

enum class NavmeshModeType(val id: Int) : IntKey {
    NAVMESH_MODE_DEFAULT(0),
    NAVMESH_MODE_POLYGON(1),
    NAVMESH_MODE_BOX(2),
    NAVMESH_MODE_UNKNOWN(9999);

    override fun getIntKey() = id
}