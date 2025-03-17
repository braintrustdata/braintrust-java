// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataSummaryTest {

    @Test
    fun createDataSummary() {
        val dataSummary = DataSummary.builder().totalRecords(0L).build()
        assertThat(dataSummary).isNotNull
        assertThat(dataSummary.totalRecords()).isEqualTo(0L)
    }
}
