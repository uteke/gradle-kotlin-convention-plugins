import org.gradle.kotlin.dsl.dependencies

@Suppress("UnstableApiUsage")
dependencies {
    val testImplementation by configurations
    testImplementation(libs.testJunitApi)
    testImplementation(libs.testJunitEngine)
    testImplementation(libs.testJunitParams)
    testImplementation(libs.testMockitoCore)
    testImplementation(libs.testMockitoJunit)
}

tasks.withType<Test> {
    useJUnitPlatform()
}