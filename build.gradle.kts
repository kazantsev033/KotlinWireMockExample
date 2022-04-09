plugins {
    kotlin("jvm") version "1.6.20"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.marcinziolo:kotlin-wiremock:1.0.3")
    implementation("io.rest-assured:rest-assured:5.0.1")

    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
}

tasks.test {
    useJUnitPlatform()
}