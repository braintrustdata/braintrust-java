// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonNull
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InsertExperimentEventTest {

    @Test
    fun createInsertExperimentEvent() {
        val insertExperimentEvent =
            InsertExperimentEvent.builder()
                .id("id")
                ._isMerge(true)
                ._mergePaths(listOf(listOf("string")))
                ._objectDelete(true)
                ._parentId("_parent_id")
                .context(
                    InsertExperimentEvent.Context.builder()
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
                .metadata(InsertExperimentEvent.Metadata.builder().build())
                .metrics(
                    InsertExperimentEvent.Metrics.builder()
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
                .scores(InsertExperimentEvent.Scores.builder().build())
                .spanAttributes(
                    SpanAttributes.builder().name("name").type(SpanAttributes.Type.LLM).build()
                )
                .spanId("span_id")
                .spanParents(listOf("string"))
                .tags(listOf("string"))
                .build()
        assertThat(insertExperimentEvent).isNotNull
        assertThat(insertExperimentEvent.id()).contains("id")
        assertThat(insertExperimentEvent._isMerge()).contains(true)
        assertThat(insertExperimentEvent._mergePaths().get()).containsExactly(listOf("string"))
        assertThat(insertExperimentEvent._objectDelete()).contains(true)
        assertThat(insertExperimentEvent._parentId()).contains("_parent_id")
        assertThat(insertExperimentEvent.context())
            .contains(
                InsertExperimentEvent.Context.builder()
                    .callerFilename("caller_filename")
                    .callerFunctionname("caller_functionname")
                    .callerLineno(123L)
                    .build()
            )
        assertThat(insertExperimentEvent.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(insertExperimentEvent.datasetRecordId()).contains("dataset_record_id")
        assertThat(insertExperimentEvent._error()).isEqualTo(JsonNull.of())
        assertThat(insertExperimentEvent._expected()).isEqualTo(JsonNull.of())
        assertThat(insertExperimentEvent._input()).isEqualTo(JsonNull.of())
        assertThat(insertExperimentEvent.metadata())
            .contains(InsertExperimentEvent.Metadata.builder().build())
        assertThat(insertExperimentEvent.metrics())
            .contains(
                InsertExperimentEvent.Metrics.builder()
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
        assertThat(insertExperimentEvent._output()).isEqualTo(JsonNull.of())
        assertThat(insertExperimentEvent.rootSpanId()).contains("root_span_id")
        assertThat(insertExperimentEvent.scores())
            .contains(InsertExperimentEvent.Scores.builder().build())
        assertThat(insertExperimentEvent.spanAttributes())
            .contains(SpanAttributes.builder().name("name").type(SpanAttributes.Type.LLM).build())
        assertThat(insertExperimentEvent.spanId()).contains("span_id")
        assertThat(insertExperimentEvent.spanParents().get()).containsExactly("string")
        assertThat(insertExperimentEvent.tags().get()).containsExactly("string")
    }
}
