// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExperimentFeedbackParamsTest {

    @Test
    fun create() {
        ExperimentFeedbackParams.builder()
            .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addFeedback(
                FeedbackExperimentItem.builder()
                    .id("id")
                    .comment("comment")
                    .expected(JsonValue.from(mapOf<String, Any>()))
                    .metadata(
                        FeedbackExperimentItem.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .scores(
                        FeedbackExperimentItem.Scores.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .source(FeedbackExperimentItem.Source.APP)
                    .addTag("string")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ExperimentFeedbackParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addFeedback(
                    FeedbackExperimentItem.builder()
                        .id("id")
                        .comment("comment")
                        .expected(JsonValue.from(mapOf<String, Any>()))
                        .metadata(
                            FeedbackExperimentItem.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .scores(
                            FeedbackExperimentItem.Scores.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .source(FeedbackExperimentItem.Source.APP)
                        .addTag("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.feedback())
            .isEqualTo(
                listOf(
                    FeedbackExperimentItem.builder()
                        .id("id")
                        .comment("comment")
                        .expected(JsonValue.from(mapOf<String, Any>()))
                        .metadata(
                            FeedbackExperimentItem.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .scores(
                            FeedbackExperimentItem.Scores.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .source(FeedbackExperimentItem.Source.APP)
                        .addTag("string")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExperimentFeedbackParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addFeedback(FeedbackExperimentItem.builder().id("id").build())
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.feedback())
            .isEqualTo(listOf(FeedbackExperimentItem.builder().id("id").build()))
    }

    @Test
    fun getPathParam() {
        val params =
            ExperimentFeedbackParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addFeedback(FeedbackExperimentItem.builder().id("id").build())
                .build()
        assertThat(params).isNotNull
        // path param "experimentId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
