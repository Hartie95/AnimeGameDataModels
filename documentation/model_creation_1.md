
Recommended IDE: [IntelliJ IDEA](https://www.jetbrains.com/idea/)

First lets look at a simple Excel json file from the game resources, the  `WorldLevelExcelConfigData.json`:
```json
[
  {
    "level": 1,
    "monsterLevel": 26
  },
  {
    "level": 2,
    "monsterLevel": 34
  },
  {
    "level": 3,
    "monsterLevel": 47
  },
  {
    "level": 4,
    "monsterLevel": 59
  },
  {
    "level": 5,
    "monsterLevel": 69
  },
  {
    "level": 6,
    "monsterLevel": 80
  },
  {
    "level": 7,
    "monsterLevel": 88
  },
  {
    "level": 8,
    "monsterLevel": 90
  }
]
```
This file is used to determine the base levels of monsters, based on the world level of the player, so lets look at the elements and then create the data class for it.

This file contains two fields, `level` and `monsterLevel`, which are both numbers.
The `level` field in this case represents the world level of the player, and the `monsterLevel` represents the base level of monsters in his world.
Because of what it's used for, we can determine that we want to normally access an entry  by the `level` field, so we note this down for use later.

Now lets look at the txt version of this file, `WorldLevelData.txt`:
```csv
level	monster_level
1	26
2	34
3	47
4	59
5	69
6	80
7	88
8	90
```
As we can see here, the values are the same, and the field names are only slightly different.
So we note us down that an alternative name for `monsterLevel` is `monster_level`, and we are finished with this file, so lets shortly summarise what we noted down. 

1. We have the following fields:
  * `level` - the world level of the player
  * `monsterLevel` - the base level of monsters in his world
    * This field can also be named `monster_level` in other cases
2. Both fields are whole numbers
3. People will most likely try to access it via the `level` field, so that will be our main/primary key


So lets move over to the data class for the library.

First we create the representation as kotlin data class and name it `WorldLevelData`. In this example I created the file in the path "org/anime_game_servers/game_data_models/data/scene"
The resulting file should look something like this:
```kt
package org.anime_game_servers.game_data_models.data.scene

data class WorldLevelData() 
```

Next we add the `@Serializable` annotation to the class. This annotation will tell the code, that this can be read and written to file format, giving us this:
```kt
package org.anime_game_servers.game_data_models.data.scene

import kotlinx.serialization.Serializable

@Serializable
data class WorldLevelData() 
```

With this very basic data class definition lets add the fields we need. Since both are simple whole numbers, lets use integers (`Int` in kotlin) for both.
```kt
package org.anime_game_servers.game_data_models.data.scene

import kotlinx.serialization.Serializable

@Serializable
data class WorldLevelData(
    val level: Int,
    val monsterLevel: Int
) 
```

Now we use `@JsonNames` to add the alternative name for `monsterLevel` when reading files. Since the features of specifying alternative names is marked as experimental, 
we also need to add `@OptIn(ExperimentalSerializationApi::class)` to the class, which gives use this:
```kt
package org.anime_game_servers.game_data_models.data.scene

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class WorldLevelData(
    val level: Int,
    @JsonNames("monster_level")
    val monsterLevel: Int
) 
```

Next we add the info that the main unique key to identify these objects is the `level` field. Since it's an integer, we add the `IntKey` interface to the class.
Then we make int keys getIntKey function return the `level` field, which gives us this:
```kt 
package org.anime_game_servers.game_data_models.data.scene

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.core.base.interfaces.IntKey

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class WorldLevelData(
    val level: Int,
    @JsonNames("monster_level")
    val monsterLevel: Int
) : IntKey {
    override fun getIntKey() = level
}
```

With this the basic data model definition is done, so next add some extra information.
First lets start with the files this data model represents. For this we use the `@DataFile` annotation.
This annotation takes three parameters, the first one is the path to the file in resources, the second one is the file type of the file, 
and the third one what type of resource it is.
In this case we have two files, one json file (`ExcelBinOutput/WorldLevelExcelConfigData.json`) and one tsv file(`txt/WorldLevelData.txt`).
Both of these are files in the anime games excel structure format, so we add two annotations, one for each file:
```kt 
package org.anime_game_servers.game_data_models.data.scene

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

@DataFile("ExcelBinOutput/WorldLevelExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/WorldLevelData.txt", FileType.TSV, FolderType.EXCEL)
@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class WorldLevelData(
    val level: Int,
    @JsonNames("monster_level")
    val monsterLevel: Int
) : IntKey {
    override fun getIntKey() = level
}
```

Finally, we add some documentation to the class, to describe what each field represents and what the whole object represents, which gives us the final result:
```kt
package org.anime_game_servers.game_data_models.data.scene

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames
import org.anime_game_servers.core.base.interfaces.IntKey
import org.anime_game_servers.game_data_models.loader.DataFile
import org.anime_game_servers.game_data_models.loader.FileType
import org.anime_game_servers.game_data_models.loader.FolderType

/**
 * This is used to determine the base levels of monsters, based on the world level of the player
 * @param level the world level of the player
 * @param monsterLevel the base level of monsters in his world
 */
@DataFile("ExcelBinOutput/WorldLevelExcelConfigData.json", FileType.JSON, FolderType.EXCEL)
@DataFile("txt/WorldLevelData.txt", FileType.TSV, FolderType.EXCEL)
@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class WorldLevelData(
    val level: Int,
    @JsonNames("monster_level")
    val monsterLevel: Int
) : IntKey {
    override fun getIntKey() = level
}
```
