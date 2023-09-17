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

For a full list check out the [ActivityType enum](/src/commonMain/kotlin/org/anime_game_servers/game_data_models/data/activity/ActivityType.kt).

### Gadget
These are a type of in game objects (like monsters or avatars). They are used for a lot of things, from inanimate objects like platforms, lasers, items,
to some objects that would be expected to be alive, like anemo slimes used in bow challenges or seelies.

### Tower
This is the internal name for the Spiral Abyss.

### City level
This is the internal name for the level of the statues of the seven.

