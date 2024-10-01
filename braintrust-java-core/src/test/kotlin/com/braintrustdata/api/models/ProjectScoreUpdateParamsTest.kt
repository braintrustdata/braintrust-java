// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectScoreUpdateParamsTest {

    @Test
    fun createProjectScoreUpdateParams() {
        ProjectScoreUpdateParams.builder()
            .projectScoreId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .categories(
                ProjectScoreUpdateParams.Categories.ofList<ProjectScoreCategory>(
                    listOf(ProjectScoreCategory.builder().name("name").value(42.23).build())
                )
            )
            .config(
                ProjectScoreConfig.builder()
                    .destination(ProjectScoreConfig.Destination.EXPECTED)
                    .multiSelect(true)
                    .online(
                        OnlineScoreConfig.builder()
                            .samplingRate(1.0)
                            .scorers(
                                listOf(
                                    OnlineScoreConfig.Scorer.ofFunction(
                                        OnlineScoreConfig.Scorer.Function.builder()
                                            .id("id")
                                            .type(OnlineScoreConfig.Scorer.Function.Type.FUNCTION)
                                            .build()
                                    )
                                )
                            )
                            .applyToRootSpan(true)
                            .applyToSpanNames(listOf("string"))
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
    fun getBody() {
        val params =
            ProjectScoreUpdateParams.builder()
                .projectScoreId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .categories(
                    ProjectScoreUpdateParams.Categories.ofList<ProjectScoreCategory>(
                        listOf(ProjectScoreCategory.builder().name("name").value(42.23).build())
                    )
                )
                .config(
                    ProjectScoreConfig.builder()
                        .destination(ProjectScoreConfig.Destination.EXPECTED)
                        .multiSelect(true)
                        .online(
                            OnlineScoreConfig.builder()
                                .samplingRate(1.0)
                                .scorers(
                                    listOf(
                                        OnlineScoreConfig.Scorer.ofFunction(
                                            OnlineScoreConfig.Scorer.Function.builder()
                                                .id("id")
                                                .type(
                                                    OnlineScoreConfig.Scorer.Function.Type.FUNCTION
                                                )
                                                .build()
                                        )
                                    )
                                )
                                .applyToRootSpan(true)
                                .applyToSpanNames(listOf("string"))
                                .build()
                        )
                        .build()
                )
                .description("description")
                .name("name")
                .scoreType(ProjectScoreType.SLIDER)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.categories())
            .isEqualTo(
                ProjectScoreUpdateParams.Categories.ofList<ProjectScoreCategory>(
                    listOf(ProjectScoreCategory.builder().name("name").value(42.23).build())
                )
            )
        assertThat(body.config())
            .isEqualTo(
                ProjectScoreConfig.builder()
                    .destination(ProjectScoreConfig.Destination.EXPECTED)
                    .multiSelect(true)
                    .online(
                        OnlineScoreConfig.builder()
                            .samplingRate(1.0)
                            .scorers(
                                listOf(
                                    OnlineScoreConfig.Scorer.ofFunction(
                                        OnlineScoreConfig.Scorer.Function.builder()
                                            .id("id")
                                            .type(OnlineScoreConfig.Scorer.Function.Type.FUNCTION)
                                            .build()
                                    )
                                )
                            )
                            .applyToRootSpan(true)
                            .applyToSpanNames(listOf("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.scoreType()).isEqualTo(ProjectScoreType.SLIDER)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ProjectScoreUpdateParams.builder()
                .projectScoreId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            ProjectScoreUpdateParams.builder()
                .projectScoreId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "projectScoreId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
