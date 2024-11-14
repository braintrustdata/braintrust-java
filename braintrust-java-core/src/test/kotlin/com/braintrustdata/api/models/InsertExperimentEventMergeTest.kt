// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonNull
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InsertExperimentEventMergeTest {

    @Test
    fun createInsertExperimentEventMerge() {
        val insertExperimentEventMerge =
            InsertExperimentEventMerge.builder()
                ._isMerge(true)
                .id("id")
                ._mergePaths(listOf(listOf("string")))
                ._objectDelete(true)
                .context(
                    InsertExperimentEventMerge.Context.builder()
                        .callerFilename("caller_filename")
                        .callerFunctionname("caller_functionname")
                        .callerLineno(123L)
                        .build()
                )
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .datasetRecordId("dataset_record_id")
                .error(JsonNull.of())
                .expected(JsonNull.of())
                .input(JsonNull.of())
                .metadata(InsertExperimentEventMerge.Metadata.builder().build())
                .metrics(
                    InsertExperimentEventMerge.Metrics.builder()
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
                .scores(InsertExperimentEventMerge.Scores.builder().build())
                .spanAttributes(
                    InsertExperimentEventMerge.SpanAttributes.builder()
                        .name("name")
                        .type(InsertExperimentEventMerge.SpanAttributes.Type.LLM)
                        .build()
                )
                .tags(listOf("string"))
                .build()
        assertThat(insertExperimentEventMerge).isNotNull
        assertThat(insertExperimentEventMerge._isMerge()).isEqualTo(true)
        assertThat(insertExperimentEventMerge.id()).contains("id")
        assertThat(insertExperimentEventMerge._mergePaths().get()).containsExactly(listOf("string"))
        assertThat(insertExperimentEventMerge._objectDelete()).contains(true)
        assertThat(insertExperimentEventMerge.context())
            .contains(
                InsertExperimentEventMerge.Context.builder()
                    .callerFilename("caller_filename")
                    .callerFunctionname("caller_functionname")
                    .callerLineno(123L)
                    .build()
            )
        assertThat(insertExperimentEventMerge.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(insertExperimentEventMerge.datasetRecordId()).contains("dataset_record_id")
        assertThat(insertExperimentEventMerge._error()).isEqualTo(JsonNull.of())
        assertThat(insertExperimentEventMerge._expected()).isEqualTo(JsonNull.of())
        assertThat(insertExperimentEventMerge._input()).isEqualTo(JsonNull.of())
        assertThat(insertExperimentEventMerge.metadata())
            .contains(InsertExperimentEventMerge.Metadata.builder().build())
        assertThat(insertExperimentEventMerge.metrics())
            .contains(
                InsertExperimentEventMerge.Metrics.builder()
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
        assertThat(insertExperimentEventMerge._output()).isEqualTo(JsonNull.of())
        assertThat(insertExperimentEventMerge.scores())
            .contains(InsertExperimentEventMerge.Scores.builder().build())
        assertThat(insertExperimentEventMerge.spanAttributes())
            .contains(
                InsertExperimentEventMerge.SpanAttributes.builder()
                    .name("name")
                    .type(InsertExperimentEventMerge.SpanAttributes.Type.LLM)
                    .build()
            )
        assertThat(insertExperimentEventMerge.tags().get()).containsExactly("string")
    }
}
