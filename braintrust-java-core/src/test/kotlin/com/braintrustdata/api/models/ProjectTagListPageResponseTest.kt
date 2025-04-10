// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectTagListPageResponseTest {

    @Test
    fun create() {
        val projectTagListPageResponse =
            ProjectTagListPageResponse.builder()
                .addObject(
                    ProjectTag.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .color("color")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .build()
                )
                .build()

        assertThat(projectTagListPageResponse.objects())
            .containsExactly(
                ProjectTag.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .color("color")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val projectTagListPageResponse =
            ProjectTagListPageResponse.builder()
                .addObject(
                    ProjectTag.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .color("color")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .build()
                )
                .build()

        val roundtrippedProjectTagListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(projectTagListPageResponse),
                jacksonTypeRef<ProjectTagListPageResponse>(),
            )

        assertThat(roundtrippedProjectTagListPageResponse).isEqualTo(projectTagListPageResponse)
    }
}
