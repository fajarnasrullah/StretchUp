plugins {
    id("stretchup.android.library.compose")
}

android {
    namespace = "com.fajarnasrullah.stretchup.core.designsystem"



}

dependencies {
    implementation(platform(libs.androidx.compose.bom))

    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.material3)

    debugImplementation(libs.androidx.compose.ui.tooling)
}