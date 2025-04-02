// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnlineScoreConfigTest {

    @Test
    fun create() {
        val onlineScoreConfig =
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

        assertThat(onlineScoreConfig.samplingRate()).isEqualTo(0.0)
        assertThat(onlineScoreConfig.scorers())
            .containsExactly(
                OnlineScoreConfig.Scorer.ofFunction(
                    OnlineScoreConfig.Scorer.Function.builder()
                        .id("id")
                        .type(OnlineScoreConfig.Scorer.Function.Type.FUNCTION)
                        .build()
                )
            )
        assertThat(onlineScoreConfig.applyToRootSpan()).contains(true)
        assertThat(onlineScoreConfig.applyToSpanNames().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onlineScoreConfig =
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

        val roundtrippedOnlineScoreConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onlineScoreConfig),
                jacksonTypeRef<OnlineScoreConfig>(),
            )

        assertThat(roundtrippedOnlineScoreConfig).isEqualTo(onlineScoreConfig)
    }
}
