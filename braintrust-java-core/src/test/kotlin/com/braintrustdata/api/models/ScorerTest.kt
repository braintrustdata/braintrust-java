// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScorerTest {

    @Test
    fun createScorer() {
        val scorer = Scorer.builder().index(123L).type(Scorer.Type.SCORER).build()
        assertThat(scorer).isNotNull
        assertThat(scorer.index()).isEqualTo(123L)
        assertThat(scorer.type()).isEqualTo(Scorer.Type.SCORER)
    }
}
