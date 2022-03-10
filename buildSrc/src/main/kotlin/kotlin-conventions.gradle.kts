import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

dependencies {
    val implementation by configurations
    implementation(kotlin(Libraries.kotlin.stdlib))
    implementation(Libraries.androidX.coreKtx)
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()
}