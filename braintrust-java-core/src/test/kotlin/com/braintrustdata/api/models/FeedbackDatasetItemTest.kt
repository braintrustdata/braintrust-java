// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FeedbackDatasetItemTest {

    @Test
    fun createFeedbackDatasetItem() {
        val feedbackDatasetItem =
            FeedbackDatasetItem.builder()
                .id("id")
                .comment("comment")
                .metadata(FeedbackDatasetItem.Metadata.builder().build())
                .source(FeedbackDatasetItem.Source.APP)
                .build()
        assertThat(feedbackDatasetItem).isNotNull
        assertThat(feedbackDatasetItem.id()).isEqualTo("id")
        assertThat(feedbackDatasetItem.comment()).contains("comment")
        assertThat(feedbackDatasetItem.metadata())
            .contains(FeedbackDatasetItem.Metadata.builder().build())
        assertThat(feedbackDatasetItem.source()).contains(FeedbackDatasetItem.Source.APP)
    }
}
