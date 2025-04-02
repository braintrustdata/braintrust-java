// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectSettingsTest {

    @Test
    fun create() {
        val projectSettings =
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

        assertThat(projectSettings.baselineExperimentId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(projectSettings.comparisonKey()).contains("comparison_key")
        assertThat(projectSettings.spanFieldOrder().getOrNull())
            .containsExactly(
                ProjectSettings.SpanFieldOrder.builder()
                    .columnId("column_id")
                    .objectType("object_type")
                    .position("position")
                    .layout(ProjectSettings.SpanFieldOrder.Layout.FULL)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val projectSettings =
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

        val roundtrippedProjectSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(projectSettings),
                jacksonTypeRef<ProjectSettings>(),
            )

        assertThat(roundtrippedProjectSettings).isEqualTo(projectSettings)
    }
}
