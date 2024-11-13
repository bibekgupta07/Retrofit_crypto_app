//plugins {
//    alias(libs.plugins.android.application)
//    alias(libs.plugins.kotlin.android)
//    id("kotlin-kapt")
//    id("com.google.dagger.hilt.android")
//
//}
//
//android {
//    namespace = "com.bibekgupta.cryptocurrencyapp"
//    compileSdk = 35
//
//    defaultConfig {
//        applicationId = "com.bibekgupta.cryptocurrencyapp"
//        minSdk = 28
//        targetSdk = 35
//        versionCode = 1
//        versionName = "1.0"
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//        vectorDrawables {
//            useSupportLibrary = true
//        }
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_1_8
//        targetCompatibility = JavaVersion.VERSION_1_8
//    }
//    kotlinOptions {
//        jvmTarget = "1.8"
//    }
//    buildFeatures {
//        compose = true
//    }
//    composeOptions {
//        kotlinCompilerExtensionVersion = "1.5.1"
//    }
//    packaging {
//        resources {
//            excludes += "/META-INF/{AL2.0,LGPL2.1}"
//        }
//    }
//}
//
//dependencies {
//
//    implementation(libs.androidx.core.ktx)
//    implementation(libs.androidx.lifecycle.runtime.ktx)
//    implementation(libs.androidx.activity.compose)
//    implementation(platform(libs.androidx.compose.bom))
//    implementation(libs.androidx.ui)
//    implementation(libs.androidx.ui.graphics)
//    implementation(libs.androidx.ui.tooling.preview)
//    implementation(libs.androidx.material3)
//    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.junit)
//    androidTestImplementation(libs.androidx.espresso.core)
//    androidTestImplementation(platform(libs.androidx.compose.bom))
//    androidTestImplementation(libs.androidx.ui.test.junit4)
//    debugImplementation(libs.androidx.ui.tooling)
//    debugImplementation(libs.androidx.ui.test.manifest)
//
////    // Retrofit
////    implementation("com.squareup.retrofit2:retrofit:2.11.0")
////    implementation("com.squareup.retrofit2:converter-gson:2.11.0")
////    implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.2")
////    implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2")
////
////    //dagger-hilt
////    implementation("com.google.dagger:hilt-android:2.51.1")
////    kapt("com.google.dagger:hilt-android-compiler:2.51.1")
////    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
////    kapt("androidx.hilt:hilt-compiler:1.0.0")
////    implementation("androidx.hilt:hilt-navigation-compose:1.0.0-alpha03")
////
////    // Compose dependencies
////    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07")
////    implementation("androidx.navigation:navigation-compose:2.4.0-alpha08")
////    implementation("com.google.accompanist:accompanist-flowlayout:0.17.0")
////
////    // Coroutines
////    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
////    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.1")
////
////    // Coroutine Lifecycle Scopes
////    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
////    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
//
//
//
//
//    // Compose dependencies
//    implementation(platform(libs.androidx.compose.bom))
//    implementation(libs.androidx.ui)
//    implementation(libs.androidx.material3)
//    implementation(libs.androidx.activity.compose)
//
//    // Retrofit
//    implementation("com.squareup.retrofit2:retrofit:2.9.0")  // Ensure you are using a stable version
//    implementation("com.squareup.retrofit2:converter-gson:2.9.0")  // Same for the converter
//    implementation("com.squareup.okhttp3:okhttp:4.9.3")  // Use stable OkHttp version
//    implementation("com.squareup.okhttp3:logging-interceptor:4.9.3")
//
//    // Hilt
//    implementation("com.google.dagger:hilt-android:2.51.1")
//    kapt("com.google.dagger:hilt-android-compiler:2.51.1")
//    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
//    kapt("androidx.hilt:hilt-compiler:1.0.0")
//
//    // Coroutines and lifecycle
//    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
//    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.1")
//    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
//
//}
//
//// Allow references to generated code
//kapt {
//    correctErrorTypes = true
//}

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.bibekgupta.cryptocurrencyapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.bibekgupta.cryptocurrencyapp"
        minSdk = 28
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Core Android libraries
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    // Compose BOM and libraries
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)

    // Retrofit for networking
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.9.3")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.3")

    // Hilt for Dependency Injection
    implementation("com.google.dagger:hilt-android:2.51.1")
    kapt("com.google.dagger:hilt-android-compiler:2.51.1")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")

    // Navigation Component
    implementation("androidx.navigation:navigation-compose:2.5.3")

    // Coroutines and lifecycle
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}
