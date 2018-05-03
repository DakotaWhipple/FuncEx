import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

//plugins {
//    base
//    kotlin("jvm") version "1.2.41" apply false
    //id("com.application.android") version "3.2.0-alpha13"
    //kotlin("android") version "1.2.41"
//}

buildscript {
    repositories {
        gradlePluginPortal()
        google()
        jcenter()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.2.0-alpha13")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.41")
    }

}

apply {
    plugin("idea")
}

allprojects {

    group = "io.github.dakotawhipple.funcex"
    version = "0.1-SNAPSHOT"

  repositories {
      gradlePluginPortal()
      google()
      jcenter()
  }
}

// Configure all KotlinCompile tasks on each sub-project
subprojects {
    tasks.withType<KotlinCompile> {
        println("Configuring $name in project ${project.name}...")
        kotlinOptions {
            suppressWarnings = true
        }
    }
}

/*buildscript {
    ext.kotlin_version = '1.2.41'
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath 
        classpath 
    }
}
task clean(type: Delete) {
    delete rootProject.buildDir
}*/

/*allprojects {

//    group = "org.gradle.kotlin.dsl.samples.multiprojectci"
    group = "com.dakotawhipple.github.funcex"

    version = "1.0"

    repositories {
        google()
        jcenter()
    }
}*/



/*dependencies {
    // Make the root project archives configuration depend on every subproject
    subprojects.forEach {
        archives(it)
    }
}*/

