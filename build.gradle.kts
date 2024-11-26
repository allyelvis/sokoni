plugins {
    kotlin("jvm") version "1.8.0"
    application
}

repositories {
    mavenCentral()
} 

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.exposed:exposed-core:0.41.1")
    implementation("org.jetbrains.exposed:exposed-dao:0.41.1")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.41.1")
    implementation("org.postgresql:postgresql:42.5.0")
    implementation("org.springframework.boot:spring-boot-starter-web:3.2.4")
    testImplementation(kotlin("test"))
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.1")
}

application {
    mainClass.set("com.aenz.sokoni.ApplicationKt")
}id("com.google.gms.google-services") version "4.4.2" apply false

