plugins {
    kotlin("jvm") version "1.9.0"
    id("org.openjfx.javafxplugin") version "0.0.10"
    id("maven-publish")
    id("signing")
}

group = "com.sokoni"
version = "0.0.1"

repositories {
    mavenCentral()
}

javafx {
    version = "17"
    modules = listOf("javafx.controls", "javafx.fxml")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])

            groupId = "com.sokoni"
            artifactId = "sokoni"
            version = "0.0.1"

            pom {
                name.set("Sokoni")
                description.set("A POS system in Kotlin.")
                url.set("https://github.com/allyelvis/sokoni")

                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }

                developers {
                    developer {
                        id.set("allyelvis")
                        name.set("ally elvis nzeyimana")
                        email.set("allyelvis6569@gmail.com")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/allyelvis/sokoni.git")
                    developerConnection.set("scm:git:ssh://allyelvis@github.com:allyelvis/sokoni.git")
                    url.set("https://github.com/allyelvis/sokoni")
                }
            }
        }
    }

    repositories {
        maven {
            name = "mavenCentral"
            url = uri("https://oss.sonatype.org/service/local/staging/deploy/maven2/")

            credentials {
                username = project.findProperty("ossrhUsername") as String? ?: System.getenv("OSSRH_USERNAME")
                password = project.findProperty("ossrhPassword") as String? ?: System.getenv("OSSRH_PASSWORD")
            }
        }
    }
}

signing {
    sign(publishing.publications["mavenJava"])
}
