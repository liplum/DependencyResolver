plugins {
    kotlin("jvm")
    id("com.google.devtools.ksp")
}
sourceSets {
    main {
        java.srcDir("src")
    }
    test {
        java.srcDir("test")
    }
}
dependencies {
    implementation(project(":annotations"))
    ksp(project(":processor"))
}
tasks.withType<Test>().configureEach {
    useJUnitPlatform {
    }
    testLogging {
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        showStandardStreams = true
    }
}

kotlin.sourceSets.main {
    kotlin.srcDirs(
        file("$buildDir/generated/ksp/main/kotlin")
    )
}

ksp {
    arg("PackageName", "net.liplum")
    arg("FileName", "Contents ")
    arg("GenerateSpec", "Contents")
}