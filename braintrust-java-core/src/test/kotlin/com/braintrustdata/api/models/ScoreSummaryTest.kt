// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScoreSummaryTest {

    @Test
    fun create() {
        val scoreSummary =
            ScoreSummary.builder()
                .improvements(0L)
                .name("name")
                .regressions(0L)
                .score(0.0)
                .diff(-1.0)
                .build()

        assertThat(scoreSummary.improvements()).isEqualTo(0L)
        assertThat(scoreSummary.name()).isEqualTo("name")
        assertThat(scoreSummary.regressions()).isEqualTo(0L)
        assertThat(scoreSummary.score()).isEqualTo(0.0)
        assertThat(scoreSummary.diff()).contains(-1.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scoreSummary =
            ScoreSummary.builder()
                .improvements(0L)
                .name("name")
                .regressions(0L)
                .score(0.0)
                .diff(-1.0)
                .build()

        val roundtrippedScoreSummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scoreSummary),
                jacksonTypeRef<ScoreSummary>(),
            )

        assertThat(roundtrippedScoreSummary).isEqualTo(scoreSummary)
    }
}
