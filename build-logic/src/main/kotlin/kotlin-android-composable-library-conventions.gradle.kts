plugins {
    id("kotlin-android-library-conventions")
}

@Suppress("UnstableApiUsage")
android {
    buildFeatures.compose = true
    composeOptions.kotlinCompilerExtensionVersion = libs.kotlinCompilerVersion
}