// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OnlineScoreConfigTest {

    @Test
    fun createOnlineScoreConfig() {
        val onlineScoreConfig =
            OnlineScoreConfig.builder()
                .samplingRate(1.0)
                .scorers(
                    listOf(
                        OnlineScoreConfig.Scorer.ofFunction(
                            OnlineScoreConfig.Scorer.Function.builder()
                                .id("id")
                                .type(OnlineScoreConfig.Scorer.Function.Type.FUNCTION)
                                .build()
                        )
                    )
                )
                .applyToRootSpan(true)
                .applyToSpanNames(listOf("string"))
                .build()
        assertThat(onlineScoreConfig).isNotNull
        assertThat(onlineScoreConfig.samplingRate()).isEqualTo(1.0)
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
        assertThat(onlineScoreConfig.applyToSpanNames().get()).containsExactly("string")
    }
}
