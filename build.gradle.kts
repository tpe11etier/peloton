plugins {
    kotlin("jvm") version "1.3.71"
    kotlin("plugin.serialization") version "1.3.70"
    kotlin("kapt") version "1.3.72"
    `maven-publish`
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    // Use jcenter for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
    mavenCentral()
    maven ( url = "https://jitpack.io" )
    jcenter()

}


dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.3.71")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.20.0") // JVM dependency
    implementation("com.squareup.okhttp3:okhttp:4.4.0")
    implementation("org.json:json:20190722")
    implementation("com.squareup.okhttp3:okhttp-urlconnection:3.8.1")
//    implementation( "com.fasterxml.jackson.module:jackson-module-kotlin:2.10.+")
//    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.10.+")
    implementation("com.squareup.retrofit2:retrofit:2.6.2")
//    implementation("com.squareup.retrofit2:converter-moshi:2.6.2")
    implementation("com.squareup.retrofit2:converter-moshi:2.7.1")
//    implementation("com.squareup.moshi:kotlin:1.9.2")
    implementation("com.squareup.moshi:moshi-kotlin:1.9.2")
//    implementation( "com.fasterxml.jackson.module.kotlin.*")
    kapt("com.squareup.moshi:moshi-kotlin-codegen:1.9.2")
    implementation("com.squareup.okhttp3:logging-interceptor:4.6.0")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.5.0")




}

buildscript {
    repositories { jcenter() }

    dependencies {
        val kotlinVersion = "1.3.70"
        classpath(kotlin("gradle-plugin", version = kotlinVersion))
        classpath(kotlin("serialization", version = kotlinVersion))
    }


}


allprojects {
    repositories {
       jcenter()
       google()
    }
  }

