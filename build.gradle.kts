plugins {
    kotlin("jvm") version "1.8.20"
    `kotlin-dsl`
    `java-gradle-plugin`
}
repositories {
    mavenLocal()
    maven { url = uri("https://maven.aliyun.com/repository/public") }
}

dependencies{
    // https://mvnrepository.com/artifact/com.android.tools.build/gradle-api
    //implementation("com.android.tools.build:gradle-api:8.3.0")
    implementation(gradleApi())
}
