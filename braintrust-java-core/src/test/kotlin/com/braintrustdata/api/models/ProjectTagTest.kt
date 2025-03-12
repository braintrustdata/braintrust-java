// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectTagTest {

    @Test
    fun createProjectTag() {
        val projectTag =
            ProjectTag.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .color("color")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .build()
        assertThat(projectTag).isNotNull
        assertThat(projectTag.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(projectTag.name()).isEqualTo("name")
        assertThat(projectTag.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(projectTag.userId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(projectTag.color()).contains("color")
        assertThat(projectTag.created()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(projectTag.description()).contains("description")
    }
}
