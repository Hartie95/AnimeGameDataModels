plugins {
    kotlin("multiplatform")
}

group = "org.anime_game_servers.data_models"
version = "0.1"

kotlin {
    applyDefaultHierarchyTemplate()
    jvm {
        jvmToolchain(17)
        withJava()
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    js(IR) {
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }
    }
    mingwX64()
    linuxX64()
    linuxArm64()


    sourceSets {
        val commonMain by getting
        val commonTest by getting
        val jvmMain by getting
        val jvmTest by getting
        val jsMain by getting
        val jsTest by getting
    }
}