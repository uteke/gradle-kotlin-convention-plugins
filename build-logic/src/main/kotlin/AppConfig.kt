object AppConfig {
    const val buildTools = "30.0.3"
    const val compileSdk = 31
    const val minSdk = 23
    const val targetSdk = 31
    const val versionCode = 1
    const val versionName = "1.0.0"
    val default = Default
    val flavor1 = Flavor1
    val flavor2 = Flavor2

    object Default {
        const val name = "default"
        const val applicationId = "com.uteke.conventions"
    }

    object Flavor1 {
        const val name = "flavor1"
        const val applicationId = "com.uteke.conventions.flavor1"
    }

    object Flavor2 {
        const val name = "flavor2"
        const val applicationId = "com.uteke.conventions.flavor2"
    }
}