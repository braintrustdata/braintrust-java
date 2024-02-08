import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.get

plugins {
    `maven-publish`
    `signing`
}

configure<PublishingExtension> {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Braintrust Data API")
                description.set("API specification for the backend data server. The API is hosted globally at\nhttps://api.braintrustdata.com or in your own environment. The v1 API is\ncurrently in preview mode and unstable until March 1, 2024. We may make\nbackwards incompatible changes before then, as we learn from our users.")
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

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

//signing {
//    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
//    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
//    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
//    if (signingKey != null && signingPassword != null) {
//        useInMemoryPgpKeys(
//            signingKeyId,
//            signingKey,
//            signingPassword,
//        )
//        sign(publishing.publications["maven"])
//    }
//}
//
//tasks.publish {
//    dependsOn(":closeAndReleaseSonatypeStagingRepository")
//}

publishing {
  repositories {
    maven {
      name = "GitHubPackages"
      url = uri("https://maven.pkg.github.com/braintrustdata/braintrust-java")
      credentials {
        username = System.getenv("GITHUB_ACTOR")
        password = System.getenv("GITHUB_TOKEN")
      }
    }
  }
}
