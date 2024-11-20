// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonNull
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
                .error(JsonNull.of())
                .expected(JsonNull.of())
                .input(JsonNull.of())
                .isRoot(true)
                .metadata(ExperimentEvent.Metadata.builder().build())
                .metrics(
                    ExperimentEvent.Metrics.builder()
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
                .origin(
                    ExperimentEvent.Origin.builder()
                        .id("id")
                        ._xactId("_xact_id")
                        .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .objectType(ExperimentEvent.Origin.ObjectType.EXPERIMENT)
                        .build()
                )
                .output(JsonNull.of())
                .scores(ExperimentEvent.Scores.builder().build())
                .spanAttributes(
                    SpanAttributes.builder().name("name").type(SpanAttributes.Type.LLM).build()
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
        assertThat(experimentEvent._error()).isEqualTo(JsonNull.of())
        assertThat(experimentEvent._expected()).isEqualTo(JsonNull.of())
        assertThat(experimentEvent._input()).isEqualTo(JsonNull.of())
        assertThat(experimentEvent.isRoot()).contains(true)
        assertThat(experimentEvent.metadata()).contains(ExperimentEvent.Metadata.builder().build())
        assertThat(experimentEvent.metrics())
            .contains(
                ExperimentEvent.Metrics.builder()
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
        assertThat(experimentEvent.origin())
            .contains(
                ExperimentEvent.Origin.builder()
                    .id("id")
                    ._xactId("_xact_id")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(ExperimentEvent.Origin.ObjectType.EXPERIMENT)
                    .build()
            )
        assertThat(experimentEvent._output()).isEqualTo(JsonNull.of())
        assertThat(experimentEvent.scores()).contains(ExperimentEvent.Scores.builder().build())
        assertThat(experimentEvent.spanAttributes())
            .contains(SpanAttributes.builder().name("name").type(SpanAttributes.Type.LLM).build())
        assertThat(experimentEvent.spanParents().get()).containsExactly("string")
        assertThat(experimentEvent.tags().get()).containsExactly("string")
    }
}
