// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonNull
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InsertProjectLogsEventTest {

    @Test
    fun createInsertProjectLogsEvent() {
        val insertProjectLogsEvent =
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
                    SpanAttributes.builder().name("name").type(SpanAttributes.Type.LLM).build()
                )
                .spanId("span_id")
                .spanParents(listOf("string"))
                .tags(listOf("string"))
                .build()
        assertThat(insertProjectLogsEvent).isNotNull
        assertThat(insertProjectLogsEvent.id()).contains("id")
        assertThat(insertProjectLogsEvent._isMerge()).contains(true)
        assertThat(insertProjectLogsEvent._mergePaths().get()).containsExactly(listOf("string"))
        assertThat(insertProjectLogsEvent._objectDelete()).contains(true)
        assertThat(insertProjectLogsEvent._parentId()).contains("_parent_id")
        assertThat(insertProjectLogsEvent.context())
            .contains(
                InsertProjectLogsEvent.Context.builder()
                    .callerFilename("caller_filename")
                    .callerFunctionname("caller_functionname")
                    .callerLineno(123L)
                    .build()
            )
        assertThat(insertProjectLogsEvent.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(insertProjectLogsEvent._error()).isEqualTo(JsonNull.of())
        assertThat(insertProjectLogsEvent._expected()).isEqualTo(JsonNull.of())
        assertThat(insertProjectLogsEvent._input()).isEqualTo(JsonNull.of())
        assertThat(insertProjectLogsEvent.metadata())
            .contains(InsertProjectLogsEvent.Metadata.builder().build())
        assertThat(insertProjectLogsEvent.metrics())
            .contains(
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
        assertThat(insertProjectLogsEvent._output()).isEqualTo(JsonNull.of())
        assertThat(insertProjectLogsEvent.rootSpanId()).contains("root_span_id")
        assertThat(insertProjectLogsEvent.scores())
            .contains(InsertProjectLogsEvent.Scores.builder().build())
        assertThat(insertProjectLogsEvent.spanAttributes())
            .contains(SpanAttributes.builder().name("name").type(SpanAttributes.Type.LLM).build())
        assertThat(insertProjectLogsEvent.spanId()).contains("span_id")
        assertThat(insertProjectLogsEvent.spanParents().get()).containsExactly("string")
        assertThat(insertProjectLogsEvent.tags().get()).containsExactly("string")
    }
}
