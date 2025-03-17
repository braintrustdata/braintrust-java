// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectSettingsTest {

    @Test
    fun createProjectSettings() {
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
        assertThat(projectSettings).isNotNull
        assertThat(projectSettings.baselineExperimentId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(projectSettings.comparisonKey()).contains("comparison_key")
        assertThat(projectSettings.spanFieldOrder().get())
            .containsExactly(
                ProjectSettings.SpanFieldOrder.builder()
                    .columnId("column_id")
                    .objectType("object_type")
                    .position("position")
                    .layout(ProjectSettings.SpanFieldOrder.Layout.FULL)
                    .build()
            )
    }
}
