plugins {
    kotlin("jvm")
    alias(libs.plugins.ksp)
}

group = "org.anime_game_servers.data_models"
version = libs.versions.anime.game.data.models.get()

repositories {
    mavenCentral()
    google()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(project(":base"))
    implementation(libs.bundles.common.models.serialization)
    implementation(libs.bundles.ksp.processor)
    implementation("com.squareup:kotlinpoet-ksp:1.16.0") //TODO move into toml
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}