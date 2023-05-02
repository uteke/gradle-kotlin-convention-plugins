plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-conventions")
    id("test-conventions")
}

android {
    compileSdk = AppConfig.compileSdk

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
    implementation(libs.androidX.coreKtx)
    implementation(libs.androidX.appCompat)
    implementation(libs.androidX.constraintLayout)
    implementation(libs.androidX.navigation.fragment)
    implementation(libs.androidX.navigation.ui)
    implementation(libs.androidX.navigation.ui)
    implementation(libs.google.material)
}