plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "buzz.sonne"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "buzz.sonne"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
}

// Hilt
dependencies {
    implementation("com.google.dagger:hilt-android:2.57.2")
    ksp("com.google.dagger:hilt-android-compiler:2.57.2")
    implementation("androidx.hilt:hilt-navigation-compose:1.3.0")
}

/* ----------------Test-------------------- */

/* Unit Test core

    + JUnit4        -- testing framework
    + Google Truth  -- testing Assertion framework
    + Turbine       -- a testing library for kotlin flow
    + kotlin coroutines testing -- official kotlin coroutines testing library
*/
dependencies {
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.10.2")
    testImplementation("com.google.truth:truth:1.4.5")
    testImplementation("app.cash.turbine:turbine:1.2.1")
}

/* androidTest && ComposeUI-Test

    + 集成测试(Android术语仪器化测试)
        + androidx.test.ext:junit   -- AndroidJUnit4扩展
        + androidx.test:core        -- AndroidX test core
        + androidx.test:runner      -- AndroidX test 执行器
        + androidx.test.rules       -- AndroidX test 规则集
    + Compose UI测试
        + androidx.compose.ui-test-junit4  -- compose UI test
    + Compose UI调试
        + androidx.compose.ui-test-manifest -- compose UI debug
 */
dependencies {
    // Instrumented tests (AndroidX Test + JUnit 4 扩展)
    androidTestImplementation("androidx.test.ext:junit:1.3.0")
    androidTestImplementation("androidx.test:core:1.6.1")
    androidTestImplementation("androidx.test:runner:1.7.0")
    androidTestImplementation("androidx.test:rules:1.7.0")
    // Compose UI 测试
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.10.0")
    // UI调试用
    androidTestImplementation("androidx.compose.ui:ui-test-manifest:1.10.0")
}

// Hilt test support
dependencies {
    // TODO
}
