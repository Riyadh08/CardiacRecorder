plugins {
    id("com.android.application")
<<<<<<< HEAD
=======
    id("com.google.gms.google-services")
>>>>>>> b4c00cbf72a16c513b1ecf81249068ef6ad90259
}

android {
    namespace = "com.example.cardiacrecorder"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.cardiacrecorder"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
<<<<<<< HEAD
        viewBinding= true
    }
=======
    this.viewBinding= true
}
>>>>>>> b4c00cbf72a16c513b1ecf81249068ef6ad90259

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
<<<<<<< HEAD
=======

>>>>>>> b4c00cbf72a16c513b1ecf81249068ef6ad90259
}

dependencies {

    implementation ("com.google.firebase:firebase-database:20.1.0")
    implementation ("com.google.firebase:firebase-auth:21.0.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Room Database
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
    implementation("androidx.room:room-runtime:2.5.1")
    annotationProcessor("androidx.room:room-compiler:2.5.1")
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")

    // Gson
    implementation("com.google.code.gson:gson:2.9.1")

    // Core Library Desugaring for supporting Java 8 features
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:1.1.5")

    // Lottie Animation
    implementation("com.airbnb.android:lottie:3.4.0")

    // Browser for showing Captcha
    implementation("androidx.browser:browser:1.5.0")
<<<<<<< HEAD
=======


>>>>>>> b4c00cbf72a16c513b1ecf81249068ef6ad90259
}