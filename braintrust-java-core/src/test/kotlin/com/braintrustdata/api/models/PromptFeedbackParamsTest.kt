// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.braintrustdata.api.core.ContentTypes
import com.braintrustdata.api.core.JsonNull
import com.braintrustdata.api.core.JsonString
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.MultipartFormValue
import com.braintrustdata.api.models.*
import com.braintrustdata.api.models.PromptFeedbackParams
import com.braintrustdata.api.models.PromptFeedbackParams.PromptFeedbackBody

class PromptFeedbackParamsTest {

    @Test
    fun createPromptFeedbackParams() {
      PromptFeedbackParams.builder()
          .promptId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .feedback(listOf(PromptFeedbackParams.Feedback.builder()
              .id("string")
              .comment("string")
              .metadata(PromptFeedbackParams.Feedback.Metadata.builder().build())
              .source(PromptFeedbackParams.Feedback.Source.APP)
              .build()))
          .build()
    }

    @Test
    fun getBody() {
      val params = PromptFeedbackParams.builder()
          .promptId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .feedback(listOf(PromptFeedbackParams.Feedback.builder()
              .id("string")
              .comment("string")
              .metadata(PromptFeedbackParams.Feedback.Metadata.builder().build())
              .source(PromptFeedbackParams.Feedback.Source.APP)
              .build()))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.feedback()).isEqualTo(listOf(PromptFeedbackParams.Feedback.builder()
          .id("string")
          .comment("string")
          .metadata(PromptFeedbackParams.Feedback.Metadata.builder().build())
          .source(PromptFeedbackParams.Feedback.Source.APP)
          .build()))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = PromptFeedbackParams.builder()
          .promptId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .feedback(listOf(PromptFeedbackParams.Feedback.builder()
              .id("string")
              .build()))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.feedback()).isEqualTo(listOf(PromptFeedbackParams.Feedback.builder()
          .id("string")
          .build()))
    }

    @Test
    fun getPathParam() {
      val params = PromptFeedbackParams.builder()
          .promptId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .feedback(listOf(PromptFeedbackParams.Feedback.builder()
              .id("string")
              .build()))
          .build()
      assertThat(params).isNotNull
      // path param "promptId"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
