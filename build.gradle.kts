plugins {
    `version-catalog`
    id("maven-publish")
    alias(libs.plugins.kotlin.multiplatform) apply false
}

group = "org.anime_game_servers.data_models"
version = libs.versions.anime.game.data.models

repositories {
    mavenCentral()
}

allprojects {
    apply(plugin ="maven-publish")

    repositories {
        mavenLocal()
        mavenCentral()
        maven {
            name = "ags-mvn-Releases"
            url = uri("https://mvn.animegameservers.org/releases")
        }
    }

    dependencies {
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }

    publishing {
        repositories {
            maven {
                name = "agsmvnrelease"
                url = uri("https://mvn.animegameservers.org/releases")
                credentials(PasswordCredentials::class)
                authentication {
                    create<BasicAuthentication>("basic")
                }
            }
        }
    }
}
