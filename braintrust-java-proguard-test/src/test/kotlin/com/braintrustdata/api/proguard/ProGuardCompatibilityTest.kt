// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.proguard

import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.core.jsonMapper
import com.braintrustdata.api.models.AclObjectType
import com.braintrustdata.api.models.Project
import com.braintrustdata.api.models.ProjectListPageResponse
import com.braintrustdata.api.models.ProjectSettings
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/braintrust-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = BraintrustOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.topLevel()).isNotNull()
        assertThat(client.projects()).isNotNull()
        assertThat(client.experiments()).isNotNull()
        assertThat(client.datasets()).isNotNull()
        assertThat(client.prompts()).isNotNull()
        assertThat(client.roles()).isNotNull()
        assertThat(client.groups()).isNotNull()
        assertThat(client.acls()).isNotNull()
        assertThat(client.users()).isNotNull()
        assertThat(client.projectScores()).isNotNull()
        assertThat(client.projectTags()).isNotNull()
        assertThat(client.spanIframes()).isNotNull()
        assertThat(client.functions()).isNotNull()
        assertThat(client.views()).isNotNull()
        assertThat(client.organizations()).isNotNull()
        assertThat(client.apiKeys()).isNotNull()
        assertThat(client.aiSecrets()).isNotNull()
        assertThat(client.envVars()).isNotNull()
        assertThat(client.evals()).isNotNull()
    }

    @Test
    fun projectListPageResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val projectListPageResponse =
            ProjectListPageResponse.builder()
                .addObject(
                    Project.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .settings(
                            ProjectSettings.builder()
                                .baselineExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .comparisonKey("comparison_key")
                                .addSpanFieldOrder(
                                    ProjectSettings.SpanFieldOrder.builder()
                                        .columnId("column_id")
                                        .objectType("object_type")
                                        .position("position")
                                        .layout(ProjectSettings.SpanFieldOrder.Layout.FULL)
                                        .build()
                                )
                                .build()
                        )
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedProjectListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(projectListPageResponse),
                jacksonTypeRef<ProjectListPageResponse>(),
            )

        assertThat(roundtrippedProjectListPageResponse).isEqualTo(projectListPageResponse)
    }

    @Test
    fun aclObjectTypeRoundtrip() {
        val jsonMapper = jsonMapper()
        val aclObjectType = AclObjectType.ORGANIZATION

        val roundtrippedAclObjectType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aclObjectType),
                jacksonTypeRef<AclObjectType>(),
            )

        assertThat(roundtrippedAclObjectType).isEqualTo(aclObjectType)
    }
}
