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
                    listOf(
                        ProjectScoreUpdateParams.Categories.ProjectScoreCategory.builder()
                            .name("name")
                            .value(42.23)
                            .build()
                    )
                )
            )
            .description("description")
            .name("name")
            .scoreType(ProjectScoreUpdateParams.ScoreType.SLIDER)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ProjectScoreUpdateParams.builder()
                .projectScoreId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .categories(
                    ProjectScoreUpdateParams.Categories.ofList<ProjectScoreCategory>(
                        listOf(
                            ProjectScoreUpdateParams.Categories.ProjectScoreCategory.builder()
                                .name("name")
                                .value(42.23)
                                .build()
                        )
                    )
                )
                .description("description")
                .name("name")
                .scoreType(ProjectScoreUpdateParams.ScoreType.SLIDER)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.categories())
            .isEqualTo(
                ProjectScoreUpdateParams.Categories.ofList<ProjectScoreCategory>(
                    listOf(
                        ProjectScoreUpdateParams.Categories.ProjectScoreCategory.builder()
                            .name("name")
                            .value(42.23)
                            .build()
                    )
                )
            )
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.scoreType()).isEqualTo(ProjectScoreUpdateParams.ScoreType.SLIDER)
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
