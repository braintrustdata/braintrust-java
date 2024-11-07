// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExperimentSummarizeParamsTest {

    @Test
    fun createExperimentSummarizeParams() {
        ExperimentSummarizeParams.builder()
            .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .comparisonExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .summarizeScores(true)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ExperimentSummarizeParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .comparisonExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .summarizeScores(true)
                .build()
        val expected = QueryParams.builder()
        expected.put("comparison_experiment_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        expected.put("summarize_scores", "true")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            ExperimentSummarizeParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            ExperimentSummarizeParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "experimentId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
