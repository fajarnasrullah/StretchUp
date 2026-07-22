plugins {
    id("stretchup.android.library")
    id("stretchup.android.library.compose")
}

android {
    namespace = "com.fajarnasrullah.stretchup.core.model"
}

dependencies {
    implementation(libs.androidx.compose.runtime)
    implementation(libs.androidx.compose.runtime.annotation)
}