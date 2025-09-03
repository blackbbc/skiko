val kspVersion: String by project

plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

repositories {
    maven {
        url = uri("https://mirrors.tencent.com/nexus/repository/maven-public")
    }
    mavenCentral()
}

kotlin {
    jvm()
    sourceSets {
        val jvmMain by getting {
            dependencies {
                compileOnly(kotlin("compiler-embeddable"))
            }
        }
    }
}