plugins {
    alias(libs.plugins.androidApplication)
    kotlin("android")
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kotlinKsp)
}

android {
    namespace = "com.example.kmmsocial.android"
    compileSdk = BuildSrcConfig.COMPILE_SDK_VERSION
    defaultConfig {
        applicationId = "com.example.kmmsocial.android"
        minSdk = BuildSrcConfig.MIN_SDK_VERSION
        targetSdk = BuildSrcConfig.TARGET_SDK_VERSION
        versionCode = BuildSrcConfig.VERSION_CODE
        versionName = BuildSrcConfig.VERSION_NAME
    }
    buildFeatures {
        compose = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = BuildSrcConfig.JAVA_VERSION
        targetCompatibility = BuildSrcConfig.JAVA_VERSION
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(projects.shared)
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.material3)
    implementation(libs.androidx.activity.compose)
    debugImplementation(libs.compose.ui.tooling)
    debugImplementation(libs.compose.foundation)

    implementation(libs.androidx.core.splashscreen)
    implementation(libs.androidx.datastore.preferences)
    implementation(libs.koin.android.compose)

    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.lifecycle.runtime.compose)

    implementation(libs.accompanist.systemuicontroller)

    implementation(libs.compose.destinations.core)
    ksp(libs.compose.destinations.ksp)

}