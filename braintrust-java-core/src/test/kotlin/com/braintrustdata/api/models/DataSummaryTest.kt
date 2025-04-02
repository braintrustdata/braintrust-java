// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataSummaryTest {

    @Test
    fun create() {
        val dataSummary = DataSummary.builder().totalRecords(0L).build()

        assertThat(dataSummary.totalRecords()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataSummary = DataSummary.builder().totalRecords(0L).build()

        val roundtrippedDataSummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataSummary),
                jacksonTypeRef<DataSummary>(),
            )

        assertThat(roundtrippedDataSummary).isEqualTo(dataSummary)
    }
}
