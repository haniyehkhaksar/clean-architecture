private object LibraryVersion {
    const val APP_COMPACT = "1.1.0"
    const val CONSTRAINT_LAYOUT = "1.1.3"
    const val CORE_KTX = "1.1.0"
    const val KODEIN = "6.4.0"
    const val FRAGMENT_KTX = "1.1.0"
    const val LIFECYCLE = "1.1.1"
    const val LIFECYCLE_VIEW_MODEL_KTX = "2.1.0"
}

object LibraryDependency {
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${CoreVersion.KOTLIN}"
    const val SUPPORT_CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${LibraryVersion.CONSTRAINT_LAYOUT}"
    const val APP_COMPACT = "androidx.appcompat:appcompat:${LibraryVersion.APP_COMPACT}"
    const val CORE_KTX = "androidx.core:core-ktx:${LibraryVersion.CORE_KTX}"
    const val KODEIN = "org.kodein.di:kodein-di-generic-jvm:${LibraryVersion.KODEIN}"
    const val KODEIN_ANDROID_X =
        "org.kodein.di:kodein-di-framework-android-x:${LibraryVersion.KODEIN}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${LibraryVersion.FRAGMENT_KTX}"
    const val LIFECYCLE_EXTENSIONS = "android.arch.lifecycle:extensions:${LibraryVersion.LIFECYCLE}"
    const val LIFECYCLE_VIEW_MODEL_KTX =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${LibraryVersion.LIFECYCLE_VIEW_MODEL_KTX}"
}
