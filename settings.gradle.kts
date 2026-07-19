pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

    includeBuild("build-logic")

}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "StretchUp"
include(":app")

include(":core:designsystem")
include(":core:common")
include(":core:datastore")
include(":core:database")
include(":core:navigation")
include(":core:network")
include(":core:ui")
include(":core:util")
include(":feature:auth")
include(":feature:community")
include(":feature:course")
include(":feature:event")
include(":feature:home")
include(":feature:profile")
include(":feature:settings")
include(":feature:statistics")
include(":feature:workout")

