package org.anime_game_servers.game_data_models.data.activity.echo_shell

import kotlinx.serialization.Serializable
import org.anime_game_servers.game_data_models.data.interfaces.IntKey

/**
 * TODO document
 */
@Serializable
enum class EchoShellType(val id: Int) : IntKey {
    ECHO_SHELL_TYPE_NORMAL_ECHO(0),
    ECHO_SHELL_TYPE_SPECIAL_ECHO(1),
    ECHO_SHELL_TYPE_NORMAL_IMAGE(2),
    ECHO_SHELL_TYPE_SPECIAL_IMAGE(3),
    ECHO_SHELL_TYPE_NORMAL_INTERACT(4),
    ECHO_SHELL_TYPE_NORMAL_UNKNOWN(9999);

    override fun getIntKey() = id
}