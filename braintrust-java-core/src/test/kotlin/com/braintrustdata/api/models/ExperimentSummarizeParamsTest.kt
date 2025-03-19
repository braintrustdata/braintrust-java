// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExperimentSummarizeParamsTest {

    @Test
    fun create() {
        ExperimentSummarizeParams.builder()
            .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .comparisonExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .summarizeScores(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExperimentSummarizeParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ExperimentSummarizeParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comparisonExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .summarizeScores(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("comparison_experiment_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("summarize_scores", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ExperimentSummarizeParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
