// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FeedbackProjectLogsEventRequestTest {

    @Test
    fun createFeedbackProjectLogsEventRequest() {
        val feedbackProjectLogsEventRequest =
            FeedbackProjectLogsEventRequest.builder()
                .feedback(
                    listOf(
                        FeedbackProjectLogsItem.builder()
                            .id("id")
                            .comment("comment")
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .metadata(FeedbackProjectLogsItem.Metadata.builder().build())
                            .scores(FeedbackProjectLogsItem.Scores.builder().build())
                            .source(FeedbackProjectLogsItem.Source.APP)
                            .build()
                    )
                )
                .build()
        assertThat(feedbackProjectLogsEventRequest).isNotNull
        assertThat(feedbackProjectLogsEventRequest.feedback())
            .containsExactly(
                FeedbackProjectLogsItem.builder()
                    .id("id")
                    .comment("comment")
                    .expected(JsonValue.from(mapOf<String, Any>()))
                    .metadata(FeedbackProjectLogsItem.Metadata.builder().build())
                    .scores(FeedbackProjectLogsItem.Scores.builder().build())
                    .source(FeedbackProjectLogsItem.Source.APP)
                    .build()
            )
    }
}
