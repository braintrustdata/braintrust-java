// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetSummarizeResponseTest {

    @Test
    fun createDatasetSummarizeResponse() {
        val datasetSummarizeResponse =
            DatasetSummarizeResponse.builder()
                .datasetName("string")
                .datasetUrl("https://example.com")
                .projectName("string")
                .projectUrl("https://example.com")
                .dataSummary(
                    DatasetSummarizeResponse.DataSummary.builder().totalRecords(123L).build()
                )
                .build()
        assertThat(datasetSummarizeResponse).isNotNull
        assertThat(datasetSummarizeResponse.datasetName()).isEqualTo("string")
        assertThat(datasetSummarizeResponse.datasetUrl()).isEqualTo("https://example.com")
        assertThat(datasetSummarizeResponse.projectName()).isEqualTo("string")
        assertThat(datasetSummarizeResponse.projectUrl()).isEqualTo("https://example.com")
        assertThat(datasetSummarizeResponse.dataSummary())
            .contains(DatasetSummarizeResponse.DataSummary.builder().totalRecords(123L).build())
    }
}
