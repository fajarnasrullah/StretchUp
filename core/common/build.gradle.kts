plugins {
    id("stretchup.android.library")
    id("stretchup.android.library.compose")
    id("stretchup.hilt")
}

android {
    namespace = "com.fajarnasrullah.stretchup.core.common"
}

dependencies {

    implementation(libs.kotlinx.coroutines.android)

    implementation(libs.timber)

    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
}