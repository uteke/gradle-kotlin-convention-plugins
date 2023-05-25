plugins {
    id("com.android.application")
    id("kotlin-android")
    id("test-conventions")
}

@Suppress("UnstableApiUsage")
android {
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = "com.uteke.conventionsample"
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        isCoreLibraryDesugaringEnabled = true
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    coreLibraryDesugaring(libs.desugar)
    implementation(libs.androidX.coreKtx)
    implementation(libs.androidX.appCompat)
    implementation(libs.androidX.constraintLayout)
    implementation(libs.androidX.navigation.fragment)
    implementation(libs.androidX.navigation.ui)
    implementation(libs.google.material)
}