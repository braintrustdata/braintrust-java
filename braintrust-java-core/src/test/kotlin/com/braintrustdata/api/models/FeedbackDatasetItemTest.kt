// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackDatasetItemTest {

    @Test
    fun create() {
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

        assertThat(feedbackDatasetItem.id()).isEqualTo("id")
        assertThat(feedbackDatasetItem.comment()).contains("comment")
        assertThat(feedbackDatasetItem.metadata())
            .contains(
                FeedbackDatasetItem.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(feedbackDatasetItem.source()).contains(FeedbackDatasetItem.Source.APP)
        assertThat(feedbackDatasetItem.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedFeedbackDatasetItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(feedbackDatasetItem),
                jacksonTypeRef<FeedbackDatasetItem>(),
            )

        assertThat(roundtrippedFeedbackDatasetItem).isEqualTo(feedbackDatasetItem)
    }
}
