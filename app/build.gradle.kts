plugins {
    alias(libs.plugins.android.application)
}

android {
<<<<<<< HEAD
 sharoobini
    namespace = "com.example.womenssafety"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.womenssafety"

    namespace = "com.example.home"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.home"
     main
=======
    namespace = "com.example.womansafetyapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.womansafetyapp"
>>>>>>> d197538 (Initial commit)
        minSdk = 35
        targetSdk = 35
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}