plugins {
    id("java")

    id("com.liferay.xsd.builder") version "1.0.13"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.apache.xmlbeans:xmlbeans:5.0.3")
    implementation("org.apache.logging.log4j:log4j-core:2.17.1")

    xsdBuilder(group = "org.apache.xmlbeans", name = "xmlbeans", version = "5.0.3")
}

buildscript {
    repositories {
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
    dependencies {
        classpath("gradle.plugin.com.liferay:gradle-plugins-xsd-builder:1.0.13")
    }
}
apply(plugin = "com.liferay.xsd.builder")

tasks.test {
    useJUnitPlatform()
}

