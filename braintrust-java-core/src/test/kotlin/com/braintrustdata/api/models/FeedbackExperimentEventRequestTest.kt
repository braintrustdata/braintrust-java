// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FeedbackExperimentEventRequestTest {

    @Test
    fun createFeedbackExperimentEventRequest() {
        val feedbackExperimentEventRequest =
            FeedbackExperimentEventRequest.builder()
                .feedback(
                    listOf(
                        FeedbackExperimentItem.builder()
                            .id("id")
                            .comment("comment")
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .metadata(FeedbackExperimentItem.Metadata.builder().build())
                            .scores(FeedbackExperimentItem.Scores.builder().build())
                            .source(FeedbackExperimentItem.Source.APP)
                            .build()
                    )
                )
                .build()
        assertThat(feedbackExperimentEventRequest).isNotNull
        assertThat(feedbackExperimentEventRequest.feedback())
            .containsExactly(
                FeedbackExperimentItem.builder()
                    .id("id")
                    .comment("comment")
                    .expected(JsonValue.from(mapOf<String, Any>()))
                    .metadata(FeedbackExperimentItem.Metadata.builder().build())
                    .scores(FeedbackExperimentItem.Scores.builder().build())
                    .source(FeedbackExperimentItem.Source.APP)
                    .build()
            )
    }
}
