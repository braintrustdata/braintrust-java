// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectScoreReplaceParamsTest {

    @Test
    fun create() {
        ProjectScoreReplaceParams.builder()
            .name("name")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .scoreType(ProjectScoreType.SLIDER)
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
            .build()
    }

    @Test
    fun body() {
        val params =
            ProjectScoreReplaceParams.builder()
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .scoreType(ProjectScoreType.SLIDER)
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
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.scoreType()).isEqualTo(ProjectScoreType.SLIDER)
        assertThat(body.categories())
            .contains(
                ProjectScoreReplaceParams.Categories.ofCategorical(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProjectScoreReplaceParams.builder()
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .scoreType(ProjectScoreType.SLIDER)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.scoreType()).isEqualTo(ProjectScoreType.SLIDER)
    }
}
