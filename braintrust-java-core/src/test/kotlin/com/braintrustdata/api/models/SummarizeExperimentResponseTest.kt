// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
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
                .metrics(
                    SummarizeExperimentResponse.Metrics.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "improvements" to 0,
                                    "metric" to 0,
                                    "name" to "name",
                                    "regressions" to 0,
                                    "unit" to "unit",
                                    "diff" to 0,
                                )
                            ),
                        )
                        .build()
                )
                .scores(
                    SummarizeExperimentResponse.Scores.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "improvements" to 0,
                                    "name" to "name",
                                    "regressions" to 0,
                                    "score" to 0,
                                    "diff" to -1,
                                )
                            ),
                        )
                        .build()
                )
                .build()
        assertThat(summarizeExperimentResponse).isNotNull
        assertThat(summarizeExperimentResponse.experimentName()).isEqualTo("experiment_name")
        assertThat(summarizeExperimentResponse.experimentUrl()).isEqualTo("https://example.com")
        assertThat(summarizeExperimentResponse.projectName()).isEqualTo("project_name")
        assertThat(summarizeExperimentResponse.projectUrl()).isEqualTo("https://example.com")
        assertThat(summarizeExperimentResponse.comparisonExperimentName())
            .contains("comparison_experiment_name")
        assertThat(summarizeExperimentResponse.metrics())
            .contains(
                SummarizeExperimentResponse.Metrics.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "improvements" to 0,
                                "metric" to 0,
                                "name" to "name",
                                "regressions" to 0,
                                "unit" to "unit",
                                "diff" to 0,
                            )
                        ),
                    )
                    .build()
            )
        assertThat(summarizeExperimentResponse.scores())
            .contains(
                SummarizeExperimentResponse.Scores.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "improvements" to 0,
                                "name" to "name",
                                "regressions" to 0,
                                "score" to 0,
                                "diff" to -1,
                            )
                        ),
                    )
                    .build()
            )
    }
}
