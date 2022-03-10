plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-conventions")
    id("test-conventions")
}

android {
    compileSdk = AppConfig.compileSdk
    buildToolsVersion = AppConfig.buildTools

    defaultConfig {
        applicationId = AppConfig.default.applicationId
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName
    }

    flavorDimensions.add("flavorName")
    productFlavors {
        create(AppConfig.default.name) {
            dimension = "flavorName"
            applicationId = AppConfig.default.applicationId
        }
        create(AppConfig.flavor1.name) {
            dimension = "flavorName"
            applicationId = AppConfig.flavor1.applicationId
        }
        create(AppConfig.flavor2.name) {
            dimension = "flavorName"
            applicationId = AppConfig.flavor2.applicationId
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures.viewBinding = true
}

dependencies {
    implementation(Libraries.androidX.coreKtx)
    implementation(Libraries.androidX.appCompat)
    implementation(Libraries.androidX.constraintLayout)
    implementation(Libraries.androidX.navigation.fragment)
    implementation(Libraries.androidX.navigation.ui)
    implementation(Libraries.androidX.navigation.ui)
    implementation(Libraries.google.material)
}