plugins {
    id("braintrust.kotlin")
    id("braintrust.publish")
}

dependencies {
    api(project(":braintrust-java-client-okhttp"))
}
