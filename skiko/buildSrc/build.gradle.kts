plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://mirrors.tencent.com/nexus/repository/maven-public")
    }

    gradlePluginPortal()
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly(gradleApi())
    implementation(kotlin("gradle-plugin", "2.0.21-KBA-001"))
    implementation("de.undercouch:gradle-download-task:5.5.0")
}
