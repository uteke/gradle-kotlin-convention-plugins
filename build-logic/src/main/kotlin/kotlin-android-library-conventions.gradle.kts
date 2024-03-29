plugins {
    id("com.android.library")
    kotlin("android")
    id("kotlin-conventions")
}

android {
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        minSdk = AppConfig.minSdk
        vectorDrawables.useSupportLibrary = true
    }

    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        targetCompatibility = JavaVersion.VERSION_17
        sourceCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures.viewBinding = true
}

dependencies {
    coreLibraryDesugaring(libs.libDesugar)
}