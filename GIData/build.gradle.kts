plugins {
    kotlin("multiplatform")
    alias(libs.plugins.kotlinx.serialization)
    alias(libs.plugins.dokka)
    alias(libs.plugins.ksp)
}

group = "org.anime_game_servers.data_models"
version = libs.versions.anime.game.data.models.get()

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
        val commonMain by getting {
            dependencies {
                api(project(":base"))
                api(libs.bundles.common.ags.base)
                api(libs.bundles.common.models.serialization)
                implementation(libs.ags.core.gi)
                implementation(libs.bundles.common.crypto)
            }
            kotlin.srcDir("build/generated/ksp/metadata/commonMain/kotlin/")

            ksp{
                arg("type", "common")
                arg("module", project.name)
                arg("package_root", "org.anime_game_servers.game_data_models.gi")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting
        val jvmTest by getting
        val jsMain by getting
        val jsTest by getting
    }
}

dependencies {
    add("kspCommonMainMetadata", project(":processor"))
}

tasks{

    sourcesJar{
        dependsOn("kspCommonMainKotlinMetadata")
    }
    getTasksByName("jvmSourcesJar", false).forEach {
        it.dependsOn("kspCommonMainKotlinMetadata")
    }
    getTasksByName("jsSourcesJar", false).forEach {
        it.dependsOn("kspCommonMainKotlinMetadata")
    }
    getTasksByName("nativeSourcesJar", false).forEach {
        it.dependsOn("kspCommonMainKotlinMetadata")
    }
    getTasksByName("linuxArm64SourcesJar", false).forEach {
        it.dependsOn("kspCommonMainKotlinMetadata")
    }
    getTasksByName("linuxArm64SourcesJar", false).forEach {
        it.dependsOn("kspCommonMainKotlinMetadata")
    }
    getTasksByName("linuxX64SourcesJar", false).forEach {
        it.dependsOn("kspCommonMainKotlinMetadata")
    }
    getTasksByName("mingwX64SourcesJar", false).forEach {
        it.dependsOn("kspCommonMainKotlinMetadata")
    }
    withType<org.jetbrains.kotlin.gradle.dsl.KotlinCompile<*>> {
        if (name != "kspCommonMainKotlinMetadata")
            dependsOn("kspCommonMainKotlinMetadata")
    }
}
