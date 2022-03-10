object TestLibraries {
    val jUnit = JUnit
    val mockito = Mockito
}

object JUnit {
    const val api = "org.junit.jupiter:junit-jupiter-api:${Versions.jUnit}"
    const val engine = "org.junit.jupiter:junit-jupiter-engine:${Versions.jUnit}"
    const val params = "org.junit.jupiter:junit-jupiter-params:${Versions.jUnit}"

    internal object Versions {
        const val jUnit = "5.8.2"
    }
}

object Mockito {
    const val core = "org.mockito:mockito-core:${Versions.mockito}"
    const val jUnit = "org.mockito:mockito-junit-jupiter:${Versions.mockito}"

    internal object Versions {
        const val mockito = "4.4.0"
    }
}