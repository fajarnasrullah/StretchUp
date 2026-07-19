package com.fajarnasrullah.stretchup

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

class HiltConventionPlugin : Plugin<Project> {

    override fun apply(target: Project): Unit = with(target) {
        pluginManager.apply("com.google.dagger.hilt.android")
        pluginManager.apply("com.google.devtools.ksp")


        val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

        dependencies.add(
            "implementation",
            libs.findLibrary("hilt-android").get()
        )

        dependencies.add(
            "ksp",
            libs.findLibrary("hilt-compiler").get()
        )

    }

}