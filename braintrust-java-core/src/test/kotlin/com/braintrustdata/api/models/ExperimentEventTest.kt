// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExperimentEventTest {

    @Test
    fun createExperimentEvent() {
        val experimentEvent =
            ExperimentEvent.builder()
                .id("id")
                ._xactId("_xact_id")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .rootSpanId("root_span_id")
                .spanId("span_id")
                .context(
                    ExperimentEvent.Context.builder()
                        .callerFilename("caller_filename")
                        .callerFunctionname("caller_functionname")
                        .callerLineno(123L)
                        .build()
                )
                .datasetRecordId("dataset_record_id")
                .error(JsonValue.from(mapOf<String, Any>()))
                .expected(JsonValue.from(mapOf<String, Any>()))
                .input(JsonValue.from(mapOf<String, Any>()))
                .metadata(ExperimentEvent.Metadata.builder().build())
                .metrics(
                    ExperimentEvent.Metrics.builder()
                        .completionTokens(123L)
                        .end(42.23)
                        .promptTokens(123L)
                        .start(42.23)
                        .tokens(123L)
                        .build()
                )
                .output(JsonValue.from(mapOf<String, Any>()))
                .scores(ExperimentEvent.Scores.builder().build())
                .spanAttributes(
                    ExperimentEvent.SpanAttributes.builder()
                        .name("name")
                        .type(ExperimentEvent.SpanAttributes.Type.LLM)
                        .build()
                )
                .spanParents(listOf("string"))
                .tags(listOf("string"))
                .build()
        assertThat(experimentEvent).isNotNull
        assertThat(experimentEvent.id()).isEqualTo("id")
        assertThat(experimentEvent._xactId()).isEqualTo("_xact_id")
        assertThat(experimentEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(experimentEvent.experimentId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(experimentEvent.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(experimentEvent.rootSpanId()).isEqualTo("root_span_id")
        assertThat(experimentEvent.spanId()).isEqualTo("span_id")
        assertThat(experimentEvent.context())
            .contains(
                ExperimentEvent.Context.builder()
                    .callerFilename("caller_filename")
                    .callerFunctionname("caller_functionname")
                    .callerLineno(123L)
                    .build()
            )
        assertThat(experimentEvent.datasetRecordId()).contains("dataset_record_id")
        assertThat(experimentEvent._error()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(experimentEvent._expected()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(experimentEvent._input()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(experimentEvent.metadata()).contains(ExperimentEvent.Metadata.builder().build())
        assertThat(experimentEvent.metrics())
            .contains(
                ExperimentEvent.Metrics.builder()
                    .completionTokens(123L)
                    .end(42.23)
                    .promptTokens(123L)
                    .start(42.23)
                    .tokens(123L)
                    .build()
            )
        assertThat(experimentEvent._output()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(experimentEvent.scores()).contains(ExperimentEvent.Scores.builder().build())
        assertThat(experimentEvent.spanAttributes())
            .contains(
                ExperimentEvent.SpanAttributes.builder()
                    .name("name")
                    .type(ExperimentEvent.SpanAttributes.Type.LLM)
                    .build()
            )
        assertThat(experimentEvent.spanParents().get()).containsExactly("string")
        assertThat(experimentEvent.tags().get()).containsExactly("string")
    }
}
