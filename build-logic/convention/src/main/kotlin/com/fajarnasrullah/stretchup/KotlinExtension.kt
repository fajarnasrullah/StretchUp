package com.fajarnasrullah.stretchup

import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

internal fun KotlinAndroidProjectExtension.configureKotlin() {

    compilerOptions {

        jvmTarget.set(JvmTarget.JVM_21)

    }

}