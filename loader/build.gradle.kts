plugins {
    kotlin("multiplatform")
}

group = "org.anime_game_servers.data_models"
version = "0.1"

kotlin {
    jvmToolchain(17)
    jvm {
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
        val korioVersion = "4.0.10"
        val commonMain by getting {
            dependencies {
                api(libs.bundles.common.ags.base)
                api(libs.bundles.common.models.serialization)
                implementation("com.soywiz.korlibs.korio:korio:$korioVersion")
            }
        }
        val commonTest by getting
        val jvmMain by getting
        val jvmTest by getting
        val jsMain by getting
        val jsTest by getting
    }
}