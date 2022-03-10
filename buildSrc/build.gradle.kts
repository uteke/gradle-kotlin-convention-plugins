plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    @Suppress("UnstableApiUsage") gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    implementation("com.android.tools.build:gradle:7.1.2")
}

tasks.test {
    @Suppress("UnstableApiUsage") useJUnitPlatform()
}