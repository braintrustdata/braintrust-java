plugins {
    id("braintrust.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":braintrust-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "com.braintrustdata.api.example.Main"
}
