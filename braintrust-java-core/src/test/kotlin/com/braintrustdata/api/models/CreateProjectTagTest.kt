// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreateProjectTagTest {

    @Test
    fun createCreateProjectTag() {
        val createProjectTag =
            CreateProjectTag.builder()
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .color("color")
                .description("description")
                .build()
        assertThat(createProjectTag).isNotNull
        assertThat(createProjectTag.name()).isEqualTo("name")
        assertThat(createProjectTag.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(createProjectTag.color()).contains("color")
        assertThat(createProjectTag.description()).contains("description")
    }
}
