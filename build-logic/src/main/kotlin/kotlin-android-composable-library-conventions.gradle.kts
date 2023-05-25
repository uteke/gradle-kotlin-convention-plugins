plugins {
    id("kotlin-android-library-conventions")
}

@Suppress("UnstableApiUsage")
android {
    buildFeatures.compose = true
    composeOptions.kotlinCompilerExtensionVersion = libs.versionKotlinCompiler
}

dependencies {
    implementation(platform(libs.libAndroidxComposeBom))
    implementation(libs.libAndroidxComposeFoundation)
}