rootProject.name = "sqliter"

include(":sqliter-driver")

pluginManagement {
  val KOTLIN_VERSION: String by settings
  plugins {
    kotlin("multiplatform") version KOTLIN_VERSION
  }
  repositories {
    mavenLocal()
    google()
    gradlePluginPortal()
    mavenCentral()
  }
}

dependencyResolutionManagement {
  repositories {
    mavenLocal()
    mavenCentral()
    google()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
  }
}
