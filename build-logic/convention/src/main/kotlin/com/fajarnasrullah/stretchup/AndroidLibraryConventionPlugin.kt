package com.fajarnasrullah.stretchup


import com.android.build.api.dsl.LibraryExtension

import com.fajarnasrullah.stretchup.configureKotlin
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension

class AndroidLibraryConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) = with(target) {

        val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

        pluginManager.apply("com.android.library")
        if (extensions.findByName("kotlin") == null) {
            pluginManager.apply("org.jetbrains.kotlin.android")
        }

        extensions.configure<LibraryExtension> {

            compileSdk = libs.findVersion("compileSdk").get().toString().toInt()

            defaultConfig {
                minSdk = libs.findVersion("minSdk").get().toString().toInt()
                testInstrumentationRunner =
                    "androidx.test.runner.AndroidJUnitRunner"
            }

            compileOptions {
                sourceCompatibility = JavaVersion.VERSION_21
                targetCompatibility = JavaVersion.VERSION_21
            }

            buildFeatures {
                buildConfig = false
            }
        }

        extensions.configure<KotlinAndroidProjectExtension> {
            configureKotlin()
        }

    }

}