plugins {
    id("kotlin-android-library-conventions")
}

android {
    buildFeatures.compose = true
    composeOptions.kotlinCompilerExtensionVersion = libs.versionKotlinCompiler
}

dependencies {
    implementation(platform(libs.libAndroidxComposeBom))
    implementation(libs.libAndroidxComposeFoundation)
    implementation(libs.libAndroidxComposeCompiler)
    implementation(libs.libAndroidxComposeMaterial3)
    implementation(libs.libAndroidxComposeUiToolingPreview)

    debugImplementation(libs.libAndroidxComposeUiTooling)
}