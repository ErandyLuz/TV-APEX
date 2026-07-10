plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.tv1"
    compileSdk = 37   // ← Cambiado a 37

    defaultConfig {
        applicationId = "com.example.tv1"
        minSdk = 36      // ← Puedes mantenerlo en 36 si quieres
        targetSdk = 36   // ← Puedes mantenerlo en 36 si quieres
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.leanback)
    implementation(libs.glide)
}