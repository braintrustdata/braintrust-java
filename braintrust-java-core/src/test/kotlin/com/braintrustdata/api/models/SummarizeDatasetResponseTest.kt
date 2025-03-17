// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SummarizeDatasetResponseTest {

    @Test
    fun createSummarizeDatasetResponse() {
        val summarizeDatasetResponse =
            SummarizeDatasetResponse.builder()
                .datasetName("dataset_name")
                .datasetUrl("https://example.com")
                .projectName("project_name")
                .projectUrl("https://example.com")
                .dataSummary(DataSummary.builder().totalRecords(0L).build())
                .build()
        assertThat(summarizeDatasetResponse).isNotNull
        assertThat(summarizeDatasetResponse.datasetName()).isEqualTo("dataset_name")
        assertThat(summarizeDatasetResponse.datasetUrl()).isEqualTo("https://example.com")
        assertThat(summarizeDatasetResponse.projectName()).isEqualTo("project_name")
        assertThat(summarizeDatasetResponse.projectUrl()).isEqualTo("https://example.com")
        assertThat(summarizeDatasetResponse.dataSummary())
            .contains(DataSummary.builder().totalRecords(0L).build())
    }
}
