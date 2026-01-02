# 现代安卓开发项目模板

个人主要使用如下语言、工具、库:
    
    + IDE
        + Android Studio 2025 2.2 Patch 1
    + Language
        + Kotlin Language
    + MVI Arch
        + Orbit MVI -- Intent
    + Concurrency
        + Kotlin coroutines
    + Serialization
        + Kotlin serialization
    + HTTP client
        + Retrofit(Android首选)
        + Ktor(KMP首选)
    + Annotation processor plugin
        + ksp
    + Image Loading
        + Coil
    + DI
        + Hilt(无脑选这个就行，哈哈)
        + Koin(中小项目首选)
    + Data layer
        + Room
        + Protobuf DataStore
    + UI 
        + Jetpack Compose UI
        + Animation
            + Lottie -- Airbnb开源的UI动画库
            + Konfetti -- 粒子特效/庆祝动画
        + Navigation system
            + voyager.adriel.cafe
            + Appyx -- Model-driven navigation for Jetpack Compose
        + Maps
            + Google Map
            + OpenStreetMap
    + Android permissions
        + Google Accompanist/permissions
    + Payments
        + Stripe
        + Google pay
    + Testing
        + Unit Test
            + JUnit4
            + Google Truth
            + kotlin-coroutines-test
            + turbine     -- kotlin Flow
            + Robolectric -- 无须Android模拟器就可以测试Android API
            + MockK
        + Instrumented Test
            + androidx.test.junit4.ext
            + androidx.test.core
            + androidx.test.runner
            + androidx.test.rules
            + androidx.compose.ui.test     -- UI test
            + androidx.compose.ui.manifest -- UI debug
            + hilt-test
                + com.google.dagger:hilt-android-bom -- bom
                + hilt-android-testing
                + hilt-android-compiler
                + androidx.hilt
            + Roborazzi  -- UI截图测试，像素级对比
            + leakcanary -- 内存泄露检测


## 如何使用

// TODO

## 已添加的依赖

1. ksp、room gradle plugin
2. Hilt
3. Room(version > 2.6.0) -- with Room Gradle Plugin
4. Protobuf DataStore
5. Testing(包括基本的单元测试支持、仪器化测试核心库、compose ui测试、调试依赖)

> 个人喜欢在build.gradle.kts文件中直接写版本号，很清晰 