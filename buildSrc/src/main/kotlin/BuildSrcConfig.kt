import org.gradle.api.JavaVersion

object BuildSrcConfig {
    const val COMPILE_SDK_VERSION = 34
    const val TARGET_SDK_VERSION = 34
    const val MIN_SDK_VERSION = 24
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0.0"

    val JAVA_VERSION = JavaVersion.VERSION_17
}