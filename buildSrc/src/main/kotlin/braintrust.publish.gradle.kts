import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.get
import com.vanniktech.maven.publish.JavaLibrary
import com.vanniktech.maven.publish.JavadocJar
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

    this.coordinates(project.group.toString(), project.name, project.version.toString())

    pom {
        name.set("Braintrust Data API")
        description.set("API specification for the backend data server. The API is hosted globally at\nhttps://api.braintrustdata.com or in your own environment. The v1 API is\ncurrently in preview mode and unstable until June 1, 2024. We may make backwards\nincompatible changes before then, as we learn from our users.")
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
