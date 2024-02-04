// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetFeedbackParamsTest {

    @Test
    fun createDatasetFeedbackParams() {
        DatasetFeedbackParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .feedback(
                listOf(
                    DatasetFeedbackParams.Feedback.builder()
                        .id("string")
                        .comment("string")
                        .metadata(DatasetFeedbackParams.Feedback.Metadata.builder().build())
                        .source(DatasetFeedbackParams.Feedback.Source.APP)
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DatasetFeedbackParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedback(
                    listOf(
                        DatasetFeedbackParams.Feedback.builder()
                            .id("string")
                            .comment("string")
                            .metadata(DatasetFeedbackParams.Feedback.Metadata.builder().build())
                            .source(DatasetFeedbackParams.Feedback.Source.APP)
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.feedback())
            .isEqualTo(
                listOf(
                    DatasetFeedbackParams.Feedback.builder()
                        .id("string")
                        .comment("string")
                        .metadata(DatasetFeedbackParams.Feedback.Metadata.builder().build())
                        .source(DatasetFeedbackParams.Feedback.Source.APP)
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DatasetFeedbackParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedback(listOf(DatasetFeedbackParams.Feedback.builder().id("string").build()))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.feedback())
            .isEqualTo(listOf(DatasetFeedbackParams.Feedback.builder().id("string").build()))
    }

    @Test
    fun getPathParam() {
        val params =
            DatasetFeedbackParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedback(listOf(DatasetFeedbackParams.Feedback.builder().id("string").build()))
                .build()
        assertThat(params).isNotNull
        // path param "datasetId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
