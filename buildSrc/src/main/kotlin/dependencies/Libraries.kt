object Libraries {
    val kotlin = Kotlin
    val androidX = AndroidX
    val google = Google
}

object Kotlin {
    const val stdlib = "stdlib-jdk7"
    const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    internal object Versions {
        const val kotlin = "1.6.10"
    }
}

object AndroidX {
    private const val root = "androidx"
    const val coreKtx = "$root.core:core-ktx:${Versions.coreKtx}"
    const val appCompat = "$root.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout = "$root.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    val navigation = Navigation

    object Navigation {
        const val fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val ui ="androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    }

    internal object Versions {
        const val coreKtx = "1.2.0"
        const val appCompat = "1.4.1"
        const val constraintLayout = "2.1.3"
        const val navigation = "2.4.1"
    }
}

object Google {
    const val material = "com.google.android.material:material:${Versions.material}"

    internal object Versions {
        const val material = "1.5.0"
    }
}