dependencies {
    val testImplementation by configurations
    testImplementation(TestLibraries.jUnit.api)
    testImplementation(TestLibraries.jUnit.engine)
    testImplementation(TestLibraries.jUnit.params)
    testImplementation(TestLibraries.mockito.core)
    testImplementation(TestLibraries.mockito.jUnit)
}