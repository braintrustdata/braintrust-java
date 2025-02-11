// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FeedbackDatasetItemTest {

    @Test
    fun createFeedbackDatasetItem() {
        val feedbackDatasetItem =
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
        assertThat(feedbackDatasetItem).isNotNull
        assertThat(feedbackDatasetItem.id()).isEqualTo("id")
        assertThat(feedbackDatasetItem.comment()).contains("comment")
        assertThat(feedbackDatasetItem.metadata())
            .contains(
                FeedbackDatasetItem.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(feedbackDatasetItem.source()).contains(FeedbackDatasetItem.Source.APP)
        assertThat(feedbackDatasetItem.tags().get()).containsExactly("string")
    }
}
