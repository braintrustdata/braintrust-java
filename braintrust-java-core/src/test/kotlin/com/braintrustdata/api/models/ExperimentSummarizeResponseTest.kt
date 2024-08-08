// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExperimentSummarizeResponseTest {

    @Test
    fun createExperimentSummarizeResponse() {
        val experimentSummarizeResponse =
            ExperimentSummarizeResponse.builder()
                .experimentName("experiment_name")
                .experimentUrl("https://example.com")
                .projectName("project_name")
                .projectUrl("https://example.com")
                .comparisonExperimentName("comparison_experiment_name")
                .metrics(ExperimentSummarizeResponse.Metrics.builder().build())
                .scores(ExperimentSummarizeResponse.Scores.builder().build())
                .build()
        assertThat(experimentSummarizeResponse).isNotNull
        assertThat(experimentSummarizeResponse.experimentName()).isEqualTo("experiment_name")
        assertThat(experimentSummarizeResponse.experimentUrl()).isEqualTo("https://example.com")
        assertThat(experimentSummarizeResponse.projectName()).isEqualTo("project_name")
        assertThat(experimentSummarizeResponse.projectUrl()).isEqualTo("https://example.com")
        assertThat(experimentSummarizeResponse.comparisonExperimentName())
            .contains("comparison_experiment_name")
        assertThat(experimentSummarizeResponse.metrics())
            .contains(ExperimentSummarizeResponse.Metrics.builder().build())
        assertThat(experimentSummarizeResponse.scores())
            .contains(ExperimentSummarizeResponse.Scores.builder().build())
    }
}
