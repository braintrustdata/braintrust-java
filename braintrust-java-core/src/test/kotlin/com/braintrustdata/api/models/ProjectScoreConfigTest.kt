// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectScoreConfigTest {

    @Test
    fun create() {
        val projectScoreConfig =
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

        assertThat(projectScoreConfig.destination()).contains("destination")
        assertThat(projectScoreConfig.multiSelect()).contains(true)
        assertThat(projectScoreConfig.online())
            .contains(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val projectScoreConfig =
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

        val roundtrippedProjectScoreConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(projectScoreConfig),
                jacksonTypeRef<ProjectScoreConfig>(),
            )

        assertThat(roundtrippedProjectScoreConfig).isEqualTo(projectScoreConfig)
    }
}
