// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonNull
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InsertProjectLogsEventMergeTest {

    @Test
    fun createInsertProjectLogsEventMerge() {
        val insertProjectLogsEventMerge =
            InsertProjectLogsEventMerge.builder()
                ._isMerge(true)
                .id("id")
                ._mergePaths(listOf(listOf("string")))
                ._objectDelete(true)
                .context(
                    InsertProjectLogsEventMerge.Context.builder()
                        .callerFilename("caller_filename")
                        .callerFunctionname("caller_functionname")
                        .callerLineno(123L)
                        .build()
                )
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error(JsonNull.of())
                .expected(JsonNull.of())
                .input(JsonNull.of())
                .metadata(InsertProjectLogsEventMerge.Metadata.builder().build())
                .metrics(
                    InsertProjectLogsEventMerge.Metrics.builder()
                        .completionTokens(123L)
                        .end(42.23)
                        .promptTokens(123L)
                        .start(42.23)
                        .tokens(123L)
                        .build()
                )
                .output(JsonNull.of())
                .scores(InsertProjectLogsEventMerge.Scores.builder().build())
                .spanAttributes(
                    InsertProjectLogsEventMerge.SpanAttributes.builder()
                        .name("name")
                        .type(InsertProjectLogsEventMerge.SpanAttributes.Type.LLM)
                        .build()
                )
                .tags(listOf("string"))
                .build()
        assertThat(insertProjectLogsEventMerge).isNotNull
        assertThat(insertProjectLogsEventMerge._isMerge()).isEqualTo(true)
        assertThat(insertProjectLogsEventMerge.id()).contains("id")
        assertThat(insertProjectLogsEventMerge._mergePaths().get())
            .containsExactly(listOf("string"))
        assertThat(insertProjectLogsEventMerge._objectDelete()).contains(true)
        assertThat(insertProjectLogsEventMerge.context())
            .contains(
                InsertProjectLogsEventMerge.Context.builder()
                    .callerFilename("caller_filename")
                    .callerFunctionname("caller_functionname")
                    .callerLineno(123L)
                    .build()
            )
        assertThat(insertProjectLogsEventMerge.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(insertProjectLogsEventMerge._error()).isEqualTo(JsonNull.of())
        assertThat(insertProjectLogsEventMerge._expected()).isEqualTo(JsonNull.of())
        assertThat(insertProjectLogsEventMerge._input()).isEqualTo(JsonNull.of())
        assertThat(insertProjectLogsEventMerge.metadata())
            .contains(InsertProjectLogsEventMerge.Metadata.builder().build())
        assertThat(insertProjectLogsEventMerge.metrics())
            .contains(
                InsertProjectLogsEventMerge.Metrics.builder()
                    .completionTokens(123L)
                    .end(42.23)
                    .promptTokens(123L)
                    .start(42.23)
                    .tokens(123L)
                    .build()
            )
        assertThat(insertProjectLogsEventMerge._output()).isEqualTo(JsonNull.of())
        assertThat(insertProjectLogsEventMerge.scores())
            .contains(InsertProjectLogsEventMerge.Scores.builder().build())
        assertThat(insertProjectLogsEventMerge.spanAttributes())
            .contains(
                InsertProjectLogsEventMerge.SpanAttributes.builder()
                    .name("name")
                    .type(InsertProjectLogsEventMerge.SpanAttributes.Type.LLM)
                    .build()
            )
        assertThat(insertProjectLogsEventMerge.tags().get()).containsExactly("string")
    }
}
