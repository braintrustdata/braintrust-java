// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetFeedbackParamsTest {

    @Test
    fun create() {
        DatasetFeedbackParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addFeedback(
                FeedbackDatasetItem.builder()
                    .id("id")
                    .comment("comment")
                    .metadata(
                        FeedbackDatasetItem.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .source(FeedbackDatasetItem.Source.APP)
                    .addTag("string")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DatasetFeedbackParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addFeedback(FeedbackDatasetItem.builder().id("id").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DatasetFeedbackParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addFeedback(
                    FeedbackDatasetItem.builder()
                        .id("id")
                        .comment("comment")
                        .metadata(
                            FeedbackDatasetItem.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .source(FeedbackDatasetItem.Source.APP)
                        .addTag("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.feedback())
            .containsExactly(
                FeedbackDatasetItem.builder()
                    .id("id")
                    .comment("comment")
                    .metadata(
                        FeedbackDatasetItem.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .source(FeedbackDatasetItem.Source.APP)
                    .addTag("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DatasetFeedbackParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addFeedback(FeedbackDatasetItem.builder().id("id").build())
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.feedback()).containsExactly(FeedbackDatasetItem.builder().id("id").build())
    }
}
