plugins {
    id("braintrust.kotlin")
    id("braintrust.publish")
}

dependencies {
    api(project(":braintrust-java-core"))

    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.25.3")
}
