// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackResponseSchemaTest {

    @Test
    fun create() {
        val feedbackResponseSchema =
            FeedbackResponseSchema.builder().status(FeedbackResponseSchema.Status.SUCCESS).build()

        assertThat(feedbackResponseSchema.status()).isEqualTo(FeedbackResponseSchema.Status.SUCCESS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feedbackResponseSchema =
            FeedbackResponseSchema.builder().status(FeedbackResponseSchema.Status.SUCCESS).build()

        val roundtrippedFeedbackResponseSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(feedbackResponseSchema),
                jacksonTypeRef<FeedbackResponseSchema>(),
            )

        assertThat(roundtrippedFeedbackResponseSchema).isEqualTo(feedbackResponseSchema)
    }
}
