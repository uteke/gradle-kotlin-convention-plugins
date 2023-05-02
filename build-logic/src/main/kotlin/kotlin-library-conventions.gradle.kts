plugins {
    id("java-library")
    id("kotlin")
    id("kotlin-conventions")
}

sourceSets {
    map {
        it.java.srcDir("src/${it.name}/kotlin")
    }
}

task("testUnitTest") {
    dependsOn("test")
}