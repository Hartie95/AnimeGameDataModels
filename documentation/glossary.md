## General terms
### Obfuscated
This means that the data or the names are scrabled on some way to not be easily reverse engineered. For the field names in the Anime Game client this is done by using BeeByte.

## Anime Game terms

### Excel file
These are table like files containing information for the game and game server. 

On the official servers they are `tsv` (tab separated values) files with the extension `.txt`, normally inside the txt folder. 
Some unofficial servers also support the data in the tsv format, and this repository will target to support it in the future too.

In the client they are store in a binary format and only with obfuscated names. They are mostly contained in the [TODO].blk file.

At last there is the json representation of these files, which is used by most unofficial servers, and what this repository mainly targets. This is also the format that's preferred for patches by this repository.
Since these normally are based on the client files, they are often partially obfuscated, especially when a new version get freshly released.
They also miss some fields that are only used by the game server, and are not needed for the client, so these need to be crowd sourced via analysis of the server behavior.

### Binout file
These are mainly json files containing more complex information for the client and game server. They are used for example for character and gadget data.

### Activity
These are the in game events. Some notably exaples with their internal names are the following:
* Unreconsiled Stars - `Aster`
* Lantern Rite (1.3) - `Sea_Lamp_New`
* Windblume (1.4) - `FleurFair`
* Midsummer Island Adventure (1.6) - `SummerTime`

For a full list check out the [ActivityType enum](/GIData/src/commonMain/kotlin/org/anime_game_servers/game_data_models/gi/data/activity/ActivityType.kt).

### Gadget
These are a type of in game objects (like monsters or avatars). They are used for a lot of things, from inanimate objects like platforms, lasers, items,
to some objects that would be expected to be alive, like anemo slimes used in bow challenges or seelies.

### Tower
This is the internal name for the Spiral Abyss.

### City level
This is the internal name for the level of the statues of the seven.

### Home world
This is the internal name for the teapot world, where the player can build their own house and areas

### World
A world is a users overall areas, which can be the main world, the teapot. A world can have multiple scenes active, especially while playing in co-op mode.
The main scenes of a world are defined in [WorldData](/GIData/src/commonMain/kotlin/org/anime_game_servers/game_data_models/gi/data/world/WorldData.kt).

### Scene
This can be seen as a full map area in the game, like the whole overworld, or a dungeons map. A scene is normally defined in [SceneData](/GIData/src/commonMain/kotlin/org/anime_game_servers/game_data_models/gi/data/scene/SceneData.kt)
where information like the id and the level config are defined.

Additionally, a scene can contain lua logic many SceneBlocks and SceneGroups that define interactive content, like monster spawn or puzzle logic in a scene.

The scenes scripts are mainly located in the scripts folder in the scripts folder under `scene/[sceneId]/`, with the main entry point for execution being the `scene[sceneId].lua` file.

### Block/SceneBlock
This groups together multiple Scene Groups and also contain some information about its Scene Groups, like how to load the Scene Groups and when to refresh them.

There are two types of blocks, the default scene blocks, which can be found in the scripts folder in `scene/[sceneId]/scene[sceneId]_block[blockId].lua`.
These are always part of a scene based on their path.

Then there are also activity blocks, which are used for older events like the unreconciled stars, which can be found in the scripts folder in `activity/[activityId]/activity[activityId]_block[blockId].lua`.
This get only loaded when the event with the activity id is loaded, and are always part of scene 3.


### Group/SceneGroup
Groups are Lua scripts and the smallest grouping, which are a small grouping of elements, like monsters, gadgets, or regions together with some logic to interact with them. 
Every element inside a group also has a group unique id (cfgId), but they are not guaranteed to be unique across groups.

A group is always only part of one scene and one block, and depending on the type they can be found in the scripts folder under
`scene/[sceneId]/scene[sceneId]_group[groupId].lua` or `activity/[activityId]/activity[activityId]_group[groupId].lua`.

## Anime Game Currencies
* Primogems (hcoin internally)
* Genesis Crystals (mcoin internally)
* Mora (scoin internally)
