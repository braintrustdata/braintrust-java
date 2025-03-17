// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScoreSummaryTest {

    @Test
    fun createScoreSummary() {
        val scoreSummary =
            ScoreSummary.builder()
                .improvements(0L)
                .name("name")
                .regressions(0L)
                .score(0.0)
                .diff(-1.0)
                .build()
        assertThat(scoreSummary).isNotNull
        assertThat(scoreSummary.improvements()).isEqualTo(0L)
        assertThat(scoreSummary.name()).isEqualTo("name")
        assertThat(scoreSummary.regressions()).isEqualTo(0L)
        assertThat(scoreSummary.score()).isEqualTo(0.0)
        assertThat(scoreSummary.diff()).contains(-1.0)
    }
}
