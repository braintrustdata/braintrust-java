// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreateProjectScoreTest {

    @Test
    fun createCreateProjectScore() {
        val createProjectScore =
            CreateProjectScore.builder()
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .scoreType(CreateProjectScore.ScoreType.SLIDER)
                .categories(
                    CreateProjectScore.Categories.ofList<ProjectScoreCategory>(
                        listOf(ProjectScoreCategory.builder().name("name").value(42.23).build())
                    )
                )
                .description("description")
                .build()
        assertThat(createProjectScore).isNotNull
        assertThat(createProjectScore.name()).isEqualTo("name")
        assertThat(createProjectScore.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(createProjectScore.scoreType()).contains(CreateProjectScore.ScoreType.SLIDER)
        assertThat(createProjectScore.categories())
            .contains(
                CreateProjectScore.Categories.ofList<ProjectScoreCategory>(
                    listOf(ProjectScoreCategory.builder().name("name").value(42.23).build())
                )
            )
        assertThat(createProjectScore.description()).contains("description")
    }
}
