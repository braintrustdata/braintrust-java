// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExperimentSummarizeResponseTest {

    @Test
    fun createExperimentSummarizeResponse() {
        val experimentSummarizeResponse =
            ExperimentSummarizeResponse.builder()
                .experimentName("string")
                .experimentUrl("https://example.com")
                .projectName("string")
                .projectUrl("https://example.com")
                .comparisonExperimentName("string")
                .metrics(ExperimentSummarizeResponse.Metrics.builder().build())
                .scores(ExperimentSummarizeResponse.Scores.builder().build())
                .build()
        assertThat(experimentSummarizeResponse).isNotNull
        assertThat(experimentSummarizeResponse.experimentName()).isEqualTo("string")
        assertThat(experimentSummarizeResponse.experimentUrl()).isEqualTo("https://example.com")
        assertThat(experimentSummarizeResponse.projectName()).isEqualTo("string")
        assertThat(experimentSummarizeResponse.projectUrl()).isEqualTo("https://example.com")
        assertThat(experimentSummarizeResponse.comparisonExperimentName()).contains("string")
        assertThat(experimentSummarizeResponse.metrics())
            .contains(ExperimentSummarizeResponse.Metrics.builder().build())
        assertThat(experimentSummarizeResponse.scores())
            .contains(ExperimentSummarizeResponse.Scores.builder().build())
    }
}
