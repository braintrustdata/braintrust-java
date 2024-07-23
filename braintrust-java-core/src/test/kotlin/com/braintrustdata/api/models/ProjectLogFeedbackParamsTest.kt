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
import com.braintrustdata.api.models.ProjectLogFeedbackParams
import com.braintrustdata.api.models.ProjectLogFeedbackParams.ProjectLogFeedbackBody

class ProjectLogFeedbackParamsTest {

    @Test
    fun createProjectLogFeedbackParams() {
      ProjectLogFeedbackParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .feedback(listOf(ProjectLogFeedbackParams.Feedback.builder()
              .id("id")
              .comment("comment")
              .expected(JsonValue.from(mapOf<String, Any>()))
              .metadata(ProjectLogFeedbackParams.Feedback.Metadata.builder().build())
              .scores(ProjectLogFeedbackParams.Feedback.Scores.builder().build())
              .source(ProjectLogFeedbackParams.Feedback.Source.APP)
              .build()))
          .build()
    }

    @Test
    fun getBody() {
      val params = ProjectLogFeedbackParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .feedback(listOf(ProjectLogFeedbackParams.Feedback.builder()
              .id("id")
              .comment("comment")
              .expected(JsonValue.from(mapOf<String, Any>()))
              .metadata(ProjectLogFeedbackParams.Feedback.Metadata.builder().build())
              .scores(ProjectLogFeedbackParams.Feedback.Scores.builder().build())
              .source(ProjectLogFeedbackParams.Feedback.Source.APP)
              .build()))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.feedback()).isEqualTo(listOf(ProjectLogFeedbackParams.Feedback.builder()
          .id("id")
          .comment("comment")
          .expected(JsonValue.from(mapOf<String, Any>()))
          .metadata(ProjectLogFeedbackParams.Feedback.Metadata.builder().build())
          .scores(ProjectLogFeedbackParams.Feedback.Scores.builder().build())
          .source(ProjectLogFeedbackParams.Feedback.Source.APP)
          .build()))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = ProjectLogFeedbackParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .feedback(listOf(ProjectLogFeedbackParams.Feedback.builder()
              .id("id")
              .build()))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.feedback()).isEqualTo(listOf(ProjectLogFeedbackParams.Feedback.builder()
          .id("id")
          .build()))
    }

    @Test
    fun getPathParam() {
      val params = ProjectLogFeedbackParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .feedback(listOf(ProjectLogFeedbackParams.Feedback.builder()
              .id("id")
              .build()))
          .build()
      assertThat(params).isNotNull
      // path param "projectId"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
