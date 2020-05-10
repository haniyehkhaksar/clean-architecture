plugins {
    id(GradlePluginId.ANDROID_APPLICATION)
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(AndroidConfig.COMPILE_SDK_VERSION)
    buildToolsVersion(AndroidConfig.BUILD_TOOLS_VERSION)
    defaultConfig {
        applicationId = AndroidConfig.APP_ID
        minSdkVersion(AndroidConfig.MIN_SDK_VERSION)
        targetSdkVersion(AndroidConfig.TARGET_SDK_VERSION)
        versionCode = AndroidConfig.VERSION_CODE
        versionName = AndroidConfig.VERSION_NAME
        testInstrumentationRunner = AndroidConfig.TEST_INSTRUMENTATION_RUNNER
    }
    buildTypes {
        getByName(BuildType.RELEASE) {
            isMinifyEnabled = BuildTypeRelease.isMinifyEnabled
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName(BuildType.DEBUG) {
            isMinifyEnabled = BuildTypeDebug.isMinifyEnabled
            isDebuggable = BuildTypeDebug.isDebuggable
        }
    }

    dataBinding.isEnabled = true

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        val options = this as? org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
        options?.jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(LibraryDependency.KOTLIN)
    implementation(LibraryDependency.APP_COMPACT)
    implementation(LibraryDependency.CORE_KTX)
    implementation(LibraryDependency.SUPPORT_CONSTRAINT_LAYOUT)
    testImplementation(TestLibraryDependency.JUNIT)
    implementation(LibraryDependency.KODEIN)
    implementation(LibraryDependency.KODEIN_ANDROID_X)
    implementation(LibraryDependency.FRAGMENT_KTX)
    implementation(LibraryDependency.LIFECYCLE_EXTENSIONS)
    implementation(LibraryDependency.LIFECYCLE_VIEW_MODEL_KTX)
    implementation(kotlin("reflect"))
}
