// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectScoreCreateParamsTest {

    @Test
    fun create() {
        ProjectScoreCreateParams.builder()
            .name("name")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .scoreType(ProjectScoreCreateParams.ScoreType.SLIDER)
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
            ProjectScoreCreateParams.builder()
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .scoreType(ProjectScoreCreateParams.ScoreType.SLIDER)
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

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.scoreType()).isEqualTo(ProjectScoreCreateParams.ScoreType.SLIDER)
        assertThat(body.categories())
            .contains(
                ProjectScoreCreateParams.Categories.ofCategorical(
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
            ProjectScoreCreateParams.builder()
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .scoreType(ProjectScoreCreateParams.ScoreType.SLIDER)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.scoreType()).isEqualTo(ProjectScoreCreateParams.ScoreType.SLIDER)
    }
}
