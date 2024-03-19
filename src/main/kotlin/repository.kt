import org.gradle.api.artifacts.dsl.RepositoryHandler
import java.net.URI

const val KOTLIN_VERSION = "1.8.20"
fun RepositoryHandler.aliYun() {
    val aliyunMavenUrl = "https://maven.aliyun.com/repository/public"
    maven { url = URI(aliyunMavenUrl) }
}

fun RepositoryHandler.nexus() {
    maven {
        name = "nexus"
        url = URI("http://192.168.1.4:7081/repository/maven-releases/")
        isAllowInsecureProtocol = true
        credentials {
            username = "admin"
            password = "123394"
        }
    }
}


/**
 * 添加三个仓库
 * 1. 阿里云
 * 2. nexus
 * 3. 本地
 */
fun RepositoryHandler.aliYunAndNexus() {
    aliYun()
    nexus()
}
