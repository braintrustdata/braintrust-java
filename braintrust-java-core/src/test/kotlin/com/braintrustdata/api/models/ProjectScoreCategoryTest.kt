// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectScoreCategoryTest {

    @Test
    fun create() {
        val projectScoreCategory = ProjectScoreCategory.builder().name("name").value(0.0).build()

        assertThat(projectScoreCategory.name()).isEqualTo("name")
        assertThat(projectScoreCategory.value()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val projectScoreCategory = ProjectScoreCategory.builder().name("name").value(0.0).build()

        val roundtrippedProjectScoreCategory =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(projectScoreCategory),
                jacksonTypeRef<ProjectScoreCategory>(),
            )

        assertThat(roundtrippedProjectScoreCategory).isEqualTo(projectScoreCategory)
    }
}
