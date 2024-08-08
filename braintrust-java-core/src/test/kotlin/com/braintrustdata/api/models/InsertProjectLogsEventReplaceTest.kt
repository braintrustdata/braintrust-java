// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InsertProjectLogsEventReplaceTest {

    @Test
    fun createInsertProjectLogsEventReplace() {
        val insertProjectLogsEventReplace =
            InsertProjectLogsEventReplace.builder()
                .id("id")
                ._isMerge(true)
                ._objectDelete(true)
                ._parentId("_parent_id")
                .context(
                    InsertProjectLogsEventReplace.Context.builder()
                        .callerFilename("caller_filename")
                        .callerFunctionname("caller_functionname")
                        .callerLineno(123L)
                        .build()
                )
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error(JsonValue.from(mapOf<String, Any>()))
                .expected(JsonValue.from(mapOf<String, Any>()))
                .input(JsonValue.from(mapOf<String, Any>()))
                .metadata(InsertProjectLogsEventReplace.Metadata.builder().build())
                .metrics(
                    InsertProjectLogsEventReplace.Metrics.builder()
                        .completionTokens(123L)
                        .end(42.23)
                        .promptTokens(123L)
                        .start(42.23)
                        .tokens(123L)
                        .build()
                )
                .output(JsonValue.from(mapOf<String, Any>()))
                .scores(InsertProjectLogsEventReplace.Scores.builder().build())
                .spanAttributes(
                    InsertProjectLogsEventReplace.SpanAttributes.builder()
                        .name("name")
                        .type(InsertProjectLogsEventReplace.SpanAttributes.Type.LLM)
                        .build()
                )
                .tags(listOf("string"))
                .build()
        assertThat(insertProjectLogsEventReplace).isNotNull
        assertThat(insertProjectLogsEventReplace.id()).contains("id")
        assertThat(insertProjectLogsEventReplace._isMerge()).contains(true)
        assertThat(insertProjectLogsEventReplace._objectDelete()).contains(true)
        assertThat(insertProjectLogsEventReplace._parentId()).contains("_parent_id")
        assertThat(insertProjectLogsEventReplace.context())
            .contains(
                InsertProjectLogsEventReplace.Context.builder()
                    .callerFilename("caller_filename")
                    .callerFunctionname("caller_functionname")
                    .callerLineno(123L)
                    .build()
            )
        assertThat(insertProjectLogsEventReplace.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(insertProjectLogsEventReplace._error())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(insertProjectLogsEventReplace._expected())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(insertProjectLogsEventReplace._input())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(insertProjectLogsEventReplace.metadata())
            .contains(InsertProjectLogsEventReplace.Metadata.builder().build())
        assertThat(insertProjectLogsEventReplace.metrics())
            .contains(
                InsertProjectLogsEventReplace.Metrics.builder()
                    .completionTokens(123L)
                    .end(42.23)
                    .promptTokens(123L)
                    .start(42.23)
                    .tokens(123L)
                    .build()
            )
        assertThat(insertProjectLogsEventReplace._output())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(insertProjectLogsEventReplace.scores())
            .contains(InsertProjectLogsEventReplace.Scores.builder().build())
        assertThat(insertProjectLogsEventReplace.spanAttributes())
            .contains(
                InsertProjectLogsEventReplace.SpanAttributes.builder()
                    .name("name")
                    .type(InsertProjectLogsEventReplace.SpanAttributes.Type.LLM)
                    .build()
            )
        assertThat(insertProjectLogsEventReplace.tags().get()).containsExactly("string")
    }
}
