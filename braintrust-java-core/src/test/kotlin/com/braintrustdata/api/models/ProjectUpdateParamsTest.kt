// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectUpdateParamsTest {

    @Test
    fun create() {
        ProjectUpdateParams.builder()
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("name")
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
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ProjectUpdateParams.builder().projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProjectUpdateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
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
                .build()

        val body = params._body()

        assertThat(body.name()).contains("name")
        assertThat(body.settings())
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProjectUpdateParams.builder().projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
