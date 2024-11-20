// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonNull
import com.braintrustdata.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectLogInsertParamsTest {

    @Test
    fun createProjectLogInsertParams() {
        ProjectLogInsertParams.builder()
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .events(
                listOf(
                    InsertProjectLogsEvent.builder()
                        .id("id")
                        ._isMerge(true)
                        ._mergePaths(listOf(listOf("string")))
                        ._objectDelete(true)
                        ._parentId("_parent_id")
                        .context(
                            InsertProjectLogsEvent.Context.builder()
                                .callerFilename("caller_filename")
                                .callerFunctionname("caller_functionname")
                                .callerLineno(123L)
                                .build()
                        )
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .error(JsonNull.of())
                        .expected(JsonNull.of())
                        .input(JsonNull.of())
                        .metadata(InsertProjectLogsEvent.Metadata.builder().build())
                        .metrics(
                            InsertProjectLogsEvent.Metrics.builder()
                                .callerFilename(JsonNull.of())
                                .callerFunctionname(JsonNull.of())
                                .callerLineno(JsonNull.of())
                                .completionTokens(123L)
                                .end(42.23)
                                .promptTokens(123L)
                                .start(42.23)
                                .tokens(123L)
                                .build()
                        )
                        .output(JsonNull.of())
                        .rootSpanId("root_span_id")
                        .scores(InsertProjectLogsEvent.Scores.builder().build())
                        .spanAttributes(
                            SpanAttributes.builder()
                                .name("name")
                                .type(SpanAttributes.Type.LLM)
                                .build()
                        )
                        .spanId("span_id")
                        .spanParents(listOf("string"))
                        .tags(listOf("string"))
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ProjectLogInsertParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .events(
                    listOf(
                        InsertProjectLogsEvent.builder()
                            .id("id")
                            ._isMerge(true)
                            ._mergePaths(listOf(listOf("string")))
                            ._objectDelete(true)
                            ._parentId("_parent_id")
                            .context(
                                InsertProjectLogsEvent.Context.builder()
                                    .callerFilename("caller_filename")
                                    .callerFunctionname("caller_functionname")
                                    .callerLineno(123L)
                                    .build()
                            )
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .error(JsonNull.of())
                            .expected(JsonNull.of())
                            .input(JsonNull.of())
                            .metadata(InsertProjectLogsEvent.Metadata.builder().build())
                            .metrics(
                                InsertProjectLogsEvent.Metrics.builder()
                                    .callerFilename(JsonNull.of())
                                    .callerFunctionname(JsonNull.of())
                                    .callerLineno(JsonNull.of())
                                    .completionTokens(123L)
                                    .end(42.23)
                                    .promptTokens(123L)
                                    .start(42.23)
                                    .tokens(123L)
                                    .build()
                            )
                            .output(JsonNull.of())
                            .rootSpanId("root_span_id")
                            .scores(InsertProjectLogsEvent.Scores.builder().build())
                            .spanAttributes(
                                SpanAttributes.builder()
                                    .name("name")
                                    .type(SpanAttributes.Type.LLM)
                                    .build()
                            )
                            .spanId("span_id")
                            .spanParents(listOf("string"))
                            .tags(listOf("string"))
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.events())
            .isEqualTo(
                listOf(
                    InsertProjectLogsEvent.builder()
                        .id("id")
                        ._isMerge(true)
                        ._mergePaths(listOf(listOf("string")))
                        ._objectDelete(true)
                        ._parentId("_parent_id")
                        .context(
                            InsertProjectLogsEvent.Context.builder()
                                .callerFilename("caller_filename")
                                .callerFunctionname("caller_functionname")
                                .callerLineno(123L)
                                .build()
                        )
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .error(JsonNull.of())
                        .expected(JsonNull.of())
                        .input(JsonNull.of())
                        .metadata(InsertProjectLogsEvent.Metadata.builder().build())
                        .metrics(
                            InsertProjectLogsEvent.Metrics.builder()
                                .callerFilename(JsonNull.of())
                                .callerFunctionname(JsonNull.of())
                                .callerLineno(JsonNull.of())
                                .completionTokens(123L)
                                .end(42.23)
                                .promptTokens(123L)
                                .start(42.23)
                                .tokens(123L)
                                .build()
                        )
                        .output(JsonNull.of())
                        .rootSpanId("root_span_id")
                        .scores(InsertProjectLogsEvent.Scores.builder().build())
                        .spanAttributes(
                            SpanAttributes.builder()
                                .name("name")
                                .type(SpanAttributes.Type.LLM)
                                .build()
                        )
                        .spanId("span_id")
                        .spanParents(listOf("string"))
                        .tags(listOf("string"))
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ProjectLogInsertParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .events(listOf(InsertProjectLogsEvent.builder().build()))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.events()).isEqualTo(listOf(InsertProjectLogsEvent.builder().build()))
    }

    @Test
    fun getPathParam() {
        val params =
            ProjectLogInsertParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .events(listOf(InsertProjectLogsEvent.builder().build()))
                .build()
        assertThat(params).isNotNull
        // path param "projectId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
