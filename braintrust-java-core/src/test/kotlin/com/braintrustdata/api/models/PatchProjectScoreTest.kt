// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PatchProjectScoreTest {

    @Test
    fun createPatchProjectScore() {
        val patchProjectScore =
            PatchProjectScore.builder()
                .categories(
                    PatchProjectScore.Categories.ofList<ProjectScoreCategory>(
                        listOf(ProjectScoreCategory.builder().name("name").value(42.23).build())
                    )
                )
                .description("description")
                .name("name")
                .scoreType(PatchProjectScore.ScoreType.SLIDER)
                .build()
        assertThat(patchProjectScore).isNotNull
        assertThat(patchProjectScore.categories())
            .contains(
                PatchProjectScore.Categories.ofList<ProjectScoreCategory>(
                    listOf(ProjectScoreCategory.builder().name("name").value(42.23).build())
                )
            )
        assertThat(patchProjectScore.description()).contains("description")
        assertThat(patchProjectScore.name()).contains("name")
        assertThat(patchProjectScore.scoreType()).contains(PatchProjectScore.ScoreType.SLIDER)
    }
}
