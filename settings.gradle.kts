pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "lottery"
include(":androidApp")
include(":shared")

enableFeaturePreview("VERSION_CATALOGS")