// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackProjectLogsItemTest {

    @Test
    fun create() {
        val feedbackProjectLogsItem =
            FeedbackProjectLogsItem.builder()
                .id("id")
                .comment("comment")
                .expected(JsonValue.from(mapOf<String, Any>()))
                .metadata(
                    FeedbackProjectLogsItem.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .scores(
                    FeedbackProjectLogsItem.Scores.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .source(FeedbackProjectLogsItem.Source.APP)
                .addTag("string")
                .build()

        assertThat(feedbackProjectLogsItem.id()).isEqualTo("id")
        assertThat(feedbackProjectLogsItem.comment()).contains("comment")
        assertThat(feedbackProjectLogsItem._expected())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(feedbackProjectLogsItem.metadata())
            .contains(
                FeedbackProjectLogsItem.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(feedbackProjectLogsItem.scores())
            .contains(
                FeedbackProjectLogsItem.Scores.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(feedbackProjectLogsItem.source()).contains(FeedbackProjectLogsItem.Source.APP)
        assertThat(feedbackProjectLogsItem.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feedbackProjectLogsItem =
            FeedbackProjectLogsItem.builder()
                .id("id")
                .comment("comment")
                .expected(JsonValue.from(mapOf<String, Any>()))
                .metadata(
                    FeedbackProjectLogsItem.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .scores(
                    FeedbackProjectLogsItem.Scores.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .source(FeedbackProjectLogsItem.Source.APP)
                .addTag("string")
                .build()

        val roundtrippedFeedbackProjectLogsItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(feedbackProjectLogsItem),
                jacksonTypeRef<FeedbackProjectLogsItem>(),
            )

        assertThat(roundtrippedFeedbackProjectLogsItem).isEqualTo(feedbackProjectLogsItem)
    }
}
