// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FeedbackProjectLogsItemTest {

    @Test
    fun createFeedbackProjectLogsItem() {
        val feedbackProjectLogsItem =
            FeedbackProjectLogsItem.builder()
                .id("id")
                .comment("comment")
                .expected(JsonValue.from(mapOf<String, Any>()))
                .metadata(FeedbackProjectLogsItem.Metadata.builder().build())
                .scores(FeedbackProjectLogsItem.Scores.builder().build())
                .source(FeedbackProjectLogsItem.Source.APP)
                .build()
        assertThat(feedbackProjectLogsItem).isNotNull
        assertThat(feedbackProjectLogsItem.id()).isEqualTo("id")
        assertThat(feedbackProjectLogsItem.comment()).contains("comment")
        assertThat(feedbackProjectLogsItem._expected())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(feedbackProjectLogsItem.metadata())
            .contains(FeedbackProjectLogsItem.Metadata.builder().build())
        assertThat(feedbackProjectLogsItem.scores())
            .contains(FeedbackProjectLogsItem.Scores.builder().build())
        assertThat(feedbackProjectLogsItem.source()).contains(FeedbackProjectLogsItem.Source.APP)
    }
}
