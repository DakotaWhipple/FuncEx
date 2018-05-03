plugins {
    id("com.android.application")
    //id("com.android.tools.build:gradle")
    //kotlin("android")
    "kotlin-android"
    "kotlin-android-extensions"
}

android {
    //buildToolsVersion("27.0.1")
    compileSdkVersion(27)

    defaultConfig {
        minSdkVersion(27)
        targetSdkVersion(27)

        applicationId = "io.github.dakotawhipple.funcex"
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles("proguard-rules.pro")
        }
    }
}

//kotlin {
//    androidExtensions.experimental = true
//}


dependencies {
    implementation("com.android.support:appcompat-v7:27.1.0")
    implementation("com.android.support.constraint:constraint-layout:1.1.0")
    implementation(kotlin("stdlib", "1.2.41"))

    implementation("androidx.core:core-ktx:0.3")

    testImplementation("junit:junit:4.12")
    androidTestImplementation("com.android.support.test:runner:1.0.2")
    androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.2")
}

/*repositories {
    jcenter()
    google()
}*/

/*apply plugin: 'com.android.application'

apply plugin: 'kotlin-android'

apply plugin: 'kotlin-android-extensions'

android {
    compileSdkVersion 27
    defaultConfig {
        applicationId "io.github.dakotawhipple.funcex"
        minSdkVersion 27
        targetSdkVersion 27
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
}

dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation"org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version"
    implementation 'com.android.support.constraint:constraint-layout:1.1.0'
}*/



