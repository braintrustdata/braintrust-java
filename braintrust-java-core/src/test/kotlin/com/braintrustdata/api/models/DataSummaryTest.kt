// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DataSummaryTest {

    @Test
    fun createDataSummary() {
        val dataSummary = DataSummary.builder().totalRecords(123L).build()
        assertThat(dataSummary).isNotNull
        assertThat(dataSummary.totalRecords()).isEqualTo(123L)
    }
}
