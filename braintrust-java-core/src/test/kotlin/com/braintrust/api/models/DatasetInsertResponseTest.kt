// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetInsertResponseTest {

    @Test
    fun createDatasetInsertResponse() {
        val datasetInsertResponse = DatasetInsertResponse.builder().rowIds(listOf("string")).build()
        assertThat(datasetInsertResponse).isNotNull
        assertThat(datasetInsertResponse.rowIds()).containsExactly("string")
    }
}
