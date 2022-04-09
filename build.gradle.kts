plugins {
    kotlin("jvm") version "1.6.20"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("io.rest-assured:rest-assured:5.0.1")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.13.2")

    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
    testImplementation("com.github.tomakehurst:wiremock-jre8:2.33.1")
}

tasks.test {
    useJUnitPlatform()
}