// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FeedbackResponseSchemaTest {

    @Test
    fun createFeedbackResponseSchema() {
      val feedbackResponseSchema = FeedbackResponseSchema.builder()
          .status(FeedbackResponseSchema.Status.SUCCESS)
          .build()
      assertThat(feedbackResponseSchema).isNotNull
      assertThat(feedbackResponseSchema.status()).isEqualTo(FeedbackResponseSchema.Status.SUCCESS)
    }
}
