// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectTest {

    @Test
    fun create() {
        val project =
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

        assertThat(project.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(project.name()).isEqualTo("name")
        assertThat(project.orgId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(project.created()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(project.deletedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(project.settings())
            .contains(
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
        assertThat(project.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val project =
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

        val roundtrippedProject =
            jsonMapper.readValue(jsonMapper.writeValueAsString(project), jacksonTypeRef<Project>())

        assertThat(roundtrippedProject).isEqualTo(project)
    }
}
