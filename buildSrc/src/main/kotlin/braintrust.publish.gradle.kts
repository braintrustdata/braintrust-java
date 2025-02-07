import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    signAllPublications()
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    coordinates(project.group.toString(), project.name, project.version.toString())

    pom {
        name.set("Braintrust API")
        description.set("API specification for the backend data server. The API is hosted globally at\nhttps://api.braintrust.dev or in your own environment.\n\nYou can access the OpenAPI spec for this API at\nhttps://github.com/braintrustdata/braintrust-openapi.")
        url.set("https://www.braintrustdata.com/docs/api/spec")

        licenses {
            license {
                name.set("Apache-2.0")
            }
        }

        developers {
            developer {
                name.set("Braintrust")
                email.set("info@braintrustdata.com")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/braintrustdata/braintrust-java.git")
            developerConnection.set("scm:git:git://github.com/braintrustdata/braintrust-java.git")
            url.set("https://github.com/braintrustdata/braintrust-java")
        }
    }
}
