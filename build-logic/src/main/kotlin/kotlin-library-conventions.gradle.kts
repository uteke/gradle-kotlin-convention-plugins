plugins {
    `java-library`
    kotlin("jvm")
}

kotlin {
    jvmToolchain(jdkVersion = 11)
}

task("testUnitTest") {
    dependsOn("test")
}
