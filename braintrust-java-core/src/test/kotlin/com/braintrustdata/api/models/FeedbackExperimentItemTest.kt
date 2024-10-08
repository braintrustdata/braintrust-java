// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FeedbackExperimentItemTest {

    @Test
    fun createFeedbackExperimentItem() {
        val feedbackExperimentItem =
            FeedbackExperimentItem.builder()
                .id("id")
                .comment("comment")
                .expected(JsonNull.of())
                .metadata(FeedbackExperimentItem.Metadata.builder().build())
                .scores(FeedbackExperimentItem.Scores.builder().build())
                .source(FeedbackExperimentItem.Source.APP)
                .build()
        assertThat(feedbackExperimentItem).isNotNull
        assertThat(feedbackExperimentItem.id()).isEqualTo("id")
        assertThat(feedbackExperimentItem.comment()).contains("comment")
        assertThat(feedbackExperimentItem._expected()).isEqualTo(JsonNull.of())
        assertThat(feedbackExperimentItem.metadata())
            .contains(FeedbackExperimentItem.Metadata.builder().build())
        assertThat(feedbackExperimentItem.scores())
            .contains(FeedbackExperimentItem.Scores.builder().build())
        assertThat(feedbackExperimentItem.source()).contains(FeedbackExperimentItem.Source.APP)
    }
}
