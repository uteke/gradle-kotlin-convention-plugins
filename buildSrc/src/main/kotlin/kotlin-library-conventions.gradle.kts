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

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}