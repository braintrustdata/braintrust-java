// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExperimentFeedbackParamsTest {

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
    fun pathParams() {
        val params =
            ExperimentFeedbackParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addFeedback(FeedbackExperimentItem.builder().id("id").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
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

        assertThat(body.feedback())
            .containsExactly(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExperimentFeedbackParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addFeedback(FeedbackExperimentItem.builder().id("id").build())
                .build()

        val body = params._body()

        assertThat(body.feedback())
            .containsExactly(FeedbackExperimentItem.builder().id("id").build())
    }
}
