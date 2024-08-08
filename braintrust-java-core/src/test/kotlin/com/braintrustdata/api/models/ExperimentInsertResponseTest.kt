// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExperimentInsertResponseTest {

    @Test
    fun createExperimentInsertResponse() {
        val experimentInsertResponse =
            ExperimentInsertResponse.builder().rowIds(listOf("string")).build()
        assertThat(experimentInsertResponse).isNotNull
        assertThat(experimentInsertResponse.rowIds()).containsExactly("string")
    }
}
