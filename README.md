# AnimeGameDataModels (WIP)
This repo will contain the full defintion, handling and documention of all the binout/Excel data the anime game client and servers are using, together with some custom defintions.
It will also help with reading and writing them from and to the target formats (currently supported: JSON)

## How to build it for the local maven repo
* All:    `gradlew publishToMavenLocal`
* JVM:    `graldew publishJvmPublicationToMavenLocal`
* JS:     `gradlew publishJsPublicationToMavenLocal`
* Native: `gradlew publishNativePublicationToMavenLocal`

## How to include it in a local gradle project
```gradle
implementation("org.anime_game_servers:AnimeGameDataModels-jvm:$version")
```

## How to generate a documetation
You can generate a documention if the models from their kdoc.
This will be output in `build/dokka/html`
```sh
gradlew dokkaHtml
```
