plugins {
    kotlin("jvm") version "2.0.20"
    `java-library`
}

group = "dev.eighteentechdev"
version = "0.1.0"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

java {
    withSourcesJar()
}