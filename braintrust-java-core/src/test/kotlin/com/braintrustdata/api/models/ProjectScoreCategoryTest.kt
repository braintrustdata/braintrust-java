// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectScoreCategoryTest {

    @Test
    fun createProjectScoreCategory() {
        val projectScoreCategory = ProjectScoreCategory.builder().name("name").value(0.0).build()
        assertThat(projectScoreCategory).isNotNull
        assertThat(projectScoreCategory.name()).isEqualTo("name")
        assertThat(projectScoreCategory.value()).isEqualTo(0.0)
    }
}
