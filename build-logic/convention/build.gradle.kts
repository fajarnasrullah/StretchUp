import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

group = "com.fajarnasrullah.stretchup.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

kotlin {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_21)
    }
}
dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)

    compileOnly(libs.hilt.gradle.plugin)
    compileOnly(libs.ksp.gradle.plugin)

}

gradlePlugin {

    plugins {
        register("androidLibrary") {
            id = "stretchup.android.library"
            implementationClass =
                "com.fajarnasrullah.stretchup.AndroidLibraryConventionPlugin"
        }

        register("androidApplication") {
            id = "stretchup.android.application"
            implementationClass =
                "com.fajarnasrullah.stretchup.AndroidApplicationConventionPlugin"
        }

        register("androidLibraryCompose") {
            id = "stretchup.android.library.compose"
            implementationClass =
                "com.fajarnasrullah.stretchup.AndroidLibraryComposeConventionPlugin"
        }

        register("androidApplicationCompose") {
            id = "stretchup.android.application.compose"
            implementationClass =
                "com.fajarnasrullah.stretchup.AndroidApplicationComposeConventionPlugin"
        }

        register("hilt") {
            id = "stretchup.hilt"
            implementationClass =
                "com.fajarnasrullah.stretchup.HiltConventionPlugin"
        }
    }

}

