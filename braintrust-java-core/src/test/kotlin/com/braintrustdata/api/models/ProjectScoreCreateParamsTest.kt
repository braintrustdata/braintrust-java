// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectScoreCreateParamsTest {

    @Test
    fun createProjectScoreCreateParams() {
        ProjectScoreCreateParams.builder()
            .name("name")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .scoreType(ProjectScoreCreateParams.ScoreType.SLIDER)
            .categories(
                ProjectScoreCreateParams.Categories.ofList<ProjectScoreCategory>(
                    listOf(ProjectScoreCategory.builder().name("name").value(42.23).build())
                )
            )
            .description("description")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ProjectScoreCreateParams.builder()
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .scoreType(ProjectScoreCreateParams.ScoreType.SLIDER)
                .categories(
                    ProjectScoreCreateParams.Categories.ofList<ProjectScoreCategory>(
                        listOf(ProjectScoreCategory.builder().name("name").value(42.23).build())
                    )
                )
                .description("description")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.scoreType()).isEqualTo(ProjectScoreCreateParams.ScoreType.SLIDER)
        assertThat(body.categories())
            .isEqualTo(
                ProjectScoreCreateParams.Categories.ofList<ProjectScoreCategory>(
                    listOf(ProjectScoreCategory.builder().name("name").value(42.23).build())
                )
            )
        assertThat(body.description()).isEqualTo("description")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ProjectScoreCreateParams.builder()
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .scoreType(ProjectScoreCreateParams.ScoreType.SLIDER)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.scoreType()).isEqualTo(ProjectScoreCreateParams.ScoreType.SLIDER)
    }
}
