package utils

import org.anime_game_servers.game_data_models.gi.helpers.getPathHash
import org.anime_game_servers.game_data_models.gi.helpers.getTextHash
import org.junit.jupiter.api.Test

class TextHashUtilsTest {
    @Test
    fun testHashGen(){
        val path = "Data/_BinOutput/Avatar/ConfigAvatar_Diona.MiHoYoBinData"
        val expectedResult = 11964792506040055136UL
        val result = getTextHash(path)
        assert(result == expectedResult){"Expected $expectedResult but got $result"}
    }

    @Test
    fun testPathHashGenAvatar(){
        val basePath = "Data/_BinOutput/Avatar/%s.MiHoYoBinData"
        val fileName = "ConfigAvatar_Diona"
        val expectedResult = 11964792506040055136UL
        val result = getPathHash(basePath, fileName)
        assert(result == expectedResult){"Expected $expectedResult but got $result"}
    }
    @Test
    fun testPathHashGenMonster(){
        val basePath = "Data/_BinOutput/Monster/%s.MiHoYoBinData"
        val fileName = "ConfigMonster_Abyss_Electric_01"
        val expectedResult = 6151881626364783727UL
        val result = getPathHash(basePath, fileName)
        assert(result == expectedResult){"Expected $expectedResult but got $result"}
    }
}