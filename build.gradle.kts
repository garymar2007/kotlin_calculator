plugins {
    kotlin("jvm") version "2.0.0"
}

group = "org.gary"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/no.tornado/tornadofx
    implementation("no.tornado:tornadofx:1.7.20")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}