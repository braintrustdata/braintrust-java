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
import com.braintrustdata.api.models.ProjectLogInsertParams
import com.braintrustdata.api.models.ProjectLogInsertParams.ProjectLogInsertBody

class ProjectLogInsertParamsTest {

    @Test
    fun createProjectLogInsertParams() {
      ProjectLogInsertParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .events(listOf(ProjectLogInsertParams.Event.ofInsertProjectLogsEventReplace(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.builder()
              .id("id")
              ._isMerge(true)
              ._objectDelete(true)
              ._parentId("_parent_id")
              .context(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Context.builder()
                  .callerFilename("caller_filename")
                  .callerFunctionname("caller_functionname")
                  .callerLineno(123L)
                  .build())
              .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .expected(JsonValue.from(mapOf<String, Any>()))
              .input(JsonValue.from(mapOf<String, Any>()))
              .metadata(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Metadata.builder().build())
              .metrics(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Metrics.builder()
                  .completionTokens(123L)
                  .end(42.23)
                  .promptTokens(123L)
                  .start(42.23)
                  .tokens(123L)
                  .build())
              .output(JsonValue.from(mapOf<String, Any>()))
              .scores(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Scores.builder().build())
              .spanAttributes(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.SpanAttributes.builder()
                  .name("name")
                  .type(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.SpanAttributes.Type.LLM)
                  .build())
              .tags(listOf("string"))
              .build())))
          .build()
    }

    @Test
    fun getBody() {
      val params = ProjectLogInsertParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .events(listOf(ProjectLogInsertParams.Event.ofInsertProjectLogsEventReplace(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.builder()
              .id("id")
              ._isMerge(true)
              ._objectDelete(true)
              ._parentId("_parent_id")
              .context(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Context.builder()
                  .callerFilename("caller_filename")
                  .callerFunctionname("caller_functionname")
                  .callerLineno(123L)
                  .build())
              .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .expected(JsonValue.from(mapOf<String, Any>()))
              .input(JsonValue.from(mapOf<String, Any>()))
              .metadata(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Metadata.builder().build())
              .metrics(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Metrics.builder()
                  .completionTokens(123L)
                  .end(42.23)
                  .promptTokens(123L)
                  .start(42.23)
                  .tokens(123L)
                  .build())
              .output(JsonValue.from(mapOf<String, Any>()))
              .scores(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Scores.builder().build())
              .spanAttributes(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.SpanAttributes.builder()
                  .name("name")
                  .type(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.SpanAttributes.Type.LLM)
                  .build())
              .tags(listOf("string"))
              .build())))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.events()).isEqualTo(listOf(ProjectLogInsertParams.Event.ofInsertProjectLogsEventReplace(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.builder()
          .id("id")
          ._isMerge(true)
          ._objectDelete(true)
          ._parentId("_parent_id")
          .context(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Context.builder()
              .callerFilename("caller_filename")
              .callerFunctionname("caller_functionname")
              .callerLineno(123L)
              .build())
          .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .expected(JsonValue.from(mapOf<String, Any>()))
          .input(JsonValue.from(mapOf<String, Any>()))
          .metadata(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Metadata.builder().build())
          .metrics(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Metrics.builder()
              .completionTokens(123L)
              .end(42.23)
              .promptTokens(123L)
              .start(42.23)
              .tokens(123L)
              .build())
          .output(JsonValue.from(mapOf<String, Any>()))
          .scores(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Scores.builder().build())
          .spanAttributes(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.SpanAttributes.builder()
              .name("name")
              .type(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.SpanAttributes.Type.LLM)
              .build())
          .tags(listOf("string"))
          .build())))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = ProjectLogInsertParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .events(listOf(ProjectLogInsertParams.Event.ofInsertProjectLogsEventReplace(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.builder().build())))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.events()).isEqualTo(listOf(ProjectLogInsertParams.Event.ofInsertProjectLogsEventReplace(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.builder().build())))
    }

    @Test
    fun getPathParam() {
      val params = ProjectLogInsertParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .events(listOf(ProjectLogInsertParams.Event.ofInsertProjectLogsEventReplace(ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.builder().build())))
          .build()
      assertThat(params).isNotNull
      // path param "projectId"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
