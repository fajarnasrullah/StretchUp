plugins {
    id("stretchup.android.application.compose")
    id("stretchup.hilt")
}

android {
    namespace = "com.fajarnasrullah.stretchup"

    defaultConfig {
        applicationId = "com.fajarnasrullah.stretchup"
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(project(":core:designsystem"))
    implementation(project(":feature:home"))
    implementation(project(":feature:auth"))
}