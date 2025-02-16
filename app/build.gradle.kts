plugins {
    alias(libs.plugins.android.application)
}

android {
     HEAD

      HEAD

    namespace = "com.example.womenssafety"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.womenssafety"

    namespace = "com.example.home"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.home"
     main
      0c74e7ad17046f4e1807426bf580e637d14be914
    namespace = "com.example.womansafetyapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.womansafetyapp"
      HEAD

 d197538 (Initial commit)
 0c74e7ad17046f4e1807426bf580e637d14be914
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