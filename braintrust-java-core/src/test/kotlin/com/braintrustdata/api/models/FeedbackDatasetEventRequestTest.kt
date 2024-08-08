// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FeedbackDatasetEventRequestTest {

    @Test
    fun createFeedbackDatasetEventRequest() {
        val feedbackDatasetEventRequest =
            FeedbackDatasetEventRequest.builder()
                .feedback(
                    listOf(
                        FeedbackDatasetItem.builder()
                            .id("id")
                            .comment("comment")
                            .metadata(FeedbackDatasetItem.Metadata.builder().build())
                            .source(FeedbackDatasetItem.Source.APP)
                            .build()
                    )
                )
                .build()
        assertThat(feedbackDatasetEventRequest).isNotNull
        assertThat(feedbackDatasetEventRequest.feedback())
            .containsExactly(
                FeedbackDatasetItem.builder()
                    .id("id")
                    .comment("comment")
                    .metadata(FeedbackDatasetItem.Metadata.builder().build())
                    .source(FeedbackDatasetItem.Source.APP)
                    .build()
            )
    }
}
