import org.gradle.kotlin.dsl.dependencies

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-conventions")
}

@Suppress("UnstableApiUsage")
android {
    compileSdk = AppConfig.compileSdk
    buildToolsVersion = AppConfig.buildTools
    defaultConfig {
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        vectorDrawables.useSupportLibrary = true
    }
    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        targetCompatibility = JavaVersion.VERSION_11
        sourceCompatibility = JavaVersion.VERSION_11
    }
    sourceSets {
        map {
            it.java.srcDir("src/${it.name}/kotlin")
        }
    }
    buildFeatures.viewBinding = true
}

dependencies {
    coreLibraryDesugaring(libs.desugar)
}