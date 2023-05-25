import org.gradle.kotlin.dsl.dependencies

@Suppress("UnstableApiUsage")
dependencies {
    val testImplementation by configurations
    testImplementation(libs.libTestJunitApi)
    testImplementation(libs.libTestJunitEngine)
    testImplementation(libs.libTestJunitParams)
    testImplementation(libs.libTestMockk)
}

tasks.withType<Test> {
    useJUnitPlatform()
}