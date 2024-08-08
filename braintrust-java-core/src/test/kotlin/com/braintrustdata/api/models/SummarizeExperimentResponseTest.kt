// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SummarizeExperimentResponseTest {

    @Test
    fun createSummarizeExperimentResponse() {
        val summarizeExperimentResponse =
            SummarizeExperimentResponse.builder()
                .experimentName("experiment_name")
                .experimentUrl("https://example.com")
                .projectName("project_name")
                .projectUrl("https://example.com")
                .comparisonExperimentName("comparison_experiment_name")
                .metrics(SummarizeExperimentResponse.Metrics.builder().build())
                .scores(SummarizeExperimentResponse.Scores.builder().build())
                .build()
        assertThat(summarizeExperimentResponse).isNotNull
        assertThat(summarizeExperimentResponse.experimentName()).isEqualTo("experiment_name")
        assertThat(summarizeExperimentResponse.experimentUrl()).isEqualTo("https://example.com")
        assertThat(summarizeExperimentResponse.projectName()).isEqualTo("project_name")
        assertThat(summarizeExperimentResponse.projectUrl()).isEqualTo("https://example.com")
        assertThat(summarizeExperimentResponse.comparisonExperimentName())
            .contains("comparison_experiment_name")
        assertThat(summarizeExperimentResponse.metrics())
            .contains(SummarizeExperimentResponse.Metrics.builder().build())
        assertThat(summarizeExperimentResponse.scores())
            .contains(SummarizeExperimentResponse.Scores.builder().build())
    }
}
