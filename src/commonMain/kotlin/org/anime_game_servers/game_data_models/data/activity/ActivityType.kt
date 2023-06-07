package org.anime_game_servers.game_data_models.data.activity

import org.anime_game_servers.game_data_models.data.interfaces.IntKey

// TODO 
enum class ActivityType(val id: Int) : IntKey {

    NONE(0),
    NEW_ACTIVITY_TRIAL_AVATAR(4),
    NEW_ACTIVITY_PERSONAL_LIINE(8),
    NEW_ACTIVITY_SALESMAN_MP(1205),
    NEW_ACTIVITY_SUMMER_TIME(1600),
    NEW_ACTIVITY_GENERAL_BANNER(2100),
    NEW_ACTIVITY_MUSIC_GAME(2202),
    NEW_ACTIVITY_PHOTO(2603),
    NEW_ACTIVITY_FUNGUS_FIGHTER(3201),
    NEW_ACTIVITY_EFFIGY_CHALLENGE_V2(3203),
    NEW_ACTIVITY_UNKNOWN(999999);

    override fun getIntKey() = id
}