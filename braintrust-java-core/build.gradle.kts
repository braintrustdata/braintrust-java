plugins {
    id("braintrust.kotlin")
    id("braintrust.publish")
}

dependencies {
    api("com.fasterxml.jackson.core:jackson-core:2.14.1")
    api("com.fasterxml.jackson.core:jackson-databind:2.14.1")
    api("com.google.guava:guava:31.1-jre")

    implementation("com.fasterxml.jackson.core:jackson-annotations:2.14.1")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jdk8:2.14.1")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.14.1")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.1")
    implementation("org.apache.httpcomponents.core5:httpcore5:5.2.1")
    implementation("org.apache.httpcomponents.client5:httpclient5:5.2.1")

    testImplementation(kotlin("test"))
    testImplementation(project(":braintrust-java-client-okhttp"))
    testImplementation("com.github.tomakehurst:wiremock-jre8:2.33.2")
    testImplementation("org.assertj:assertj-core:3.23.1")
    testImplementation("org.assertj:assertj-guava:3.5.0")
    testImplementation("org.slf4j:slf4j-simple:1.7.29")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.1")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.1")
}
