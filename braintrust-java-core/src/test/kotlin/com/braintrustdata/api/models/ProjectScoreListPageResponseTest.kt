// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectScoreListPageResponseTest {

    @Test
    fun create() {
        val projectScoreListPageResponse =
            ProjectScoreListPageResponse.builder()
                .addObject(
                    ProjectScore.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .scoreType(ProjectScoreType.SLIDER)
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .categoriesOfCategorical(
                            listOf(ProjectScoreCategory.builder().name("name").value(0.0).build())
                        )
                        .config(
                            ProjectScoreConfig.builder()
                                .destination("destination")
                                .multiSelect(true)
                                .online(
                                    OnlineScoreConfig.builder()
                                        .samplingRate(0.0)
                                        .addScorer(
                                            OnlineScoreConfig.Scorer.Function.builder()
                                                .id("id")
                                                .type(
                                                    OnlineScoreConfig.Scorer.Function.Type.FUNCTION
                                                )
                                                .build()
                                        )
                                        .applyToRootSpan(true)
                                        .addApplyToSpanName("string")
                                        .build()
                                )
                                .build()
                        )
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .position("position")
                        .build()
                )
                .build()

        assertThat(projectScoreListPageResponse.objects())
            .containsExactly(
                ProjectScore.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .scoreType(ProjectScoreType.SLIDER)
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .categoriesOfCategorical(
                        listOf(ProjectScoreCategory.builder().name("name").value(0.0).build())
                    )
                    .config(
                        ProjectScoreConfig.builder()
                            .destination("destination")
                            .multiSelect(true)
                            .online(
                                OnlineScoreConfig.builder()
                                    .samplingRate(0.0)
                                    .addScorer(
                                        OnlineScoreConfig.Scorer.Function.builder()
                                            .id("id")
                                            .type(OnlineScoreConfig.Scorer.Function.Type.FUNCTION)
                                            .build()
                                    )
                                    .applyToRootSpan(true)
                                    .addApplyToSpanName("string")
                                    .build()
                            )
                            .build()
                    )
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .position("position")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val projectScoreListPageResponse =
            ProjectScoreListPageResponse.builder()
                .addObject(
                    ProjectScore.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .scoreType(ProjectScoreType.SLIDER)
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .categoriesOfCategorical(
                            listOf(ProjectScoreCategory.builder().name("name").value(0.0).build())
                        )
                        .config(
                            ProjectScoreConfig.builder()
                                .destination("destination")
                                .multiSelect(true)
                                .online(
                                    OnlineScoreConfig.builder()
                                        .samplingRate(0.0)
                                        .addScorer(
                                            OnlineScoreConfig.Scorer.Function.builder()
                                                .id("id")
                                                .type(
                                                    OnlineScoreConfig.Scorer.Function.Type.FUNCTION
                                                )
                                                .build()
                                        )
                                        .applyToRootSpan(true)
                                        .addApplyToSpanName("string")
                                        .build()
                                )
                                .build()
                        )
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .position("position")
                        .build()
                )
                .build()

        val roundtrippedProjectScoreListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(projectScoreListPageResponse),
                jacksonTypeRef<ProjectScoreListPageResponse>(),
            )

        assertThat(roundtrippedProjectScoreListPageResponse).isEqualTo(projectScoreListPageResponse)
    }
}
