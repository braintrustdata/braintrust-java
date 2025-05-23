// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectScoreUpdateParamsTest {

    @Test
    fun create() {
        ProjectScoreUpdateParams.builder()
            .projectScoreId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .categoriesOfCategorical(
                listOf(ProjectScoreCategory.builder().name("name").value(0.0).build())
            )
            .config(
                ProjectScoreConfig.builder()
                    .destination("destination")
                    .multiSelect(true)
                    .online(
                        OnlineScoreConfig.builder()
                            .samplingRate(0.0)
                            .addScorer(
                                OnlineScoreConfig.Scorer.Function.builder()
                                    .id("id")
                                    .type(OnlineScoreConfig.Scorer.Function.Type.FUNCTION)
                                    .build()
                            )
                            .applyToRootSpan(true)
                            .addApplyToSpanName("string")
                            .build()
                    )
                    .build()
            )
            .description("description")
            .name("name")
            .scoreType(ProjectScoreType.SLIDER)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ProjectScoreUpdateParams.builder()
                .projectScoreId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProjectScoreUpdateParams.builder()
                .projectScoreId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .categoriesOfCategorical(
                    listOf(ProjectScoreCategory.builder().name("name").value(0.0).build())
                )
                .config(
                    ProjectScoreConfig.builder()
                        .destination("destination")
                        .multiSelect(true)
                        .online(
                            OnlineScoreConfig.builder()
                                .samplingRate(0.0)
                                .addScorer(
                                    OnlineScoreConfig.Scorer.Function.builder()
                                        .id("id")
                                        .type(OnlineScoreConfig.Scorer.Function.Type.FUNCTION)
                                        .build()
                                )
                                .applyToRootSpan(true)
                                .addApplyToSpanName("string")
                                .build()
                        )
                        .build()
                )
                .description("description")
                .name("name")
                .scoreType(ProjectScoreType.SLIDER)
                .build()

        val body = params._body()

        assertThat(body.categories())
            .contains(
                ProjectScoreUpdateParams.Categories.ofCategorical(
                    listOf(ProjectScoreCategory.builder().name("name").value(0.0).build())
                )
            )
        assertThat(body.config())
            .contains(
                ProjectScoreConfig.builder()
                    .destination("destination")
                    .multiSelect(true)
                    .online(
                        OnlineScoreConfig.builder()
                            .samplingRate(0.0)
                            .addScorer(
                                OnlineScoreConfig.Scorer.Function.builder()
                                    .id("id")
                                    .type(OnlineScoreConfig.Scorer.Function.Type.FUNCTION)
                                    .build()
                            )
                            .applyToRootSpan(true)
                            .addApplyToSpanName("string")
                            .build()
                    )
                    .build()
            )
        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("name")
        assertThat(body.scoreType()).contains(ProjectScoreType.SLIDER)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProjectScoreUpdateParams.builder()
                .projectScoreId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
