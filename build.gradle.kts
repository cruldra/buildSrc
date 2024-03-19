plugins {
    kotlin("jvm") version "1.9.10"
    `kotlin-dsl`
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
