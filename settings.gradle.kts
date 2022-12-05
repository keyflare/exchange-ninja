pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "exchange"

include(":app")
include(":currency-rates")
include(":entities")
include(":design-system")
include(":currency-chooser")
include(":redux")
include(":navigation")
include(":main-screen")
include(":navigation:core")
include(":navigation:internal")
include(":common")
