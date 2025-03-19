// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExperimentEventTest {

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
                        .callerLineno(0L)
                        .build()
                )
                .error(JsonValue.from(mapOf<String, Any>()))
                .expected(JsonValue.from(mapOf<String, Any>()))
                .input(JsonValue.from(mapOf<String, Any>()))
                .isRoot(true)
                .metadata(ExperimentEvent.Metadata.builder().model("model").build())
                .metrics(
                    ExperimentEvent.Metrics.builder()
                        .callerFilename(JsonValue.from(mapOf<String, Any>()))
                        .callerFunctionname(JsonValue.from(mapOf<String, Any>()))
                        .callerLineno(JsonValue.from(mapOf<String, Any>()))
                        .completionTokens(0L)
                        .end(0.0)
                        .promptTokens(0L)
                        .start(0.0)
                        .tokens(0L)
                        .build()
                )
                .origin(
                    ObjectReference.builder()
                        .id("id")
                        ._xactId("_xact_id")
                        .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .objectType(ObjectReference.ObjectType.EXPERIMENT)
                        .created("created")
                        .build()
                )
                .output(JsonValue.from(mapOf<String, Any>()))
                .scores(
                    ExperimentEvent.Scores.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .spanAttributes(SpanAttributes.builder().name("name").type(SpanType.LLM).build())
                .addSpanParent("string")
                .addTag("string")
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
                    .callerLineno(0L)
                    .build()
            )
        assertThat(experimentEvent._error()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(experimentEvent._expected()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(experimentEvent._input()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(experimentEvent.isRoot()).contains(true)
        assertThat(experimentEvent.metadata())
            .contains(ExperimentEvent.Metadata.builder().model("model").build())
        assertThat(experimentEvent.metrics())
            .contains(
                ExperimentEvent.Metrics.builder()
                    .callerFilename(JsonValue.from(mapOf<String, Any>()))
                    .callerFunctionname(JsonValue.from(mapOf<String, Any>()))
                    .callerLineno(JsonValue.from(mapOf<String, Any>()))
                    .completionTokens(0L)
                    .end(0.0)
                    .promptTokens(0L)
                    .start(0.0)
                    .tokens(0L)
                    .build()
            )
        assertThat(experimentEvent.origin())
            .contains(
                ObjectReference.builder()
                    .id("id")
                    ._xactId("_xact_id")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(ObjectReference.ObjectType.EXPERIMENT)
                    .created("created")
                    .build()
            )
        assertThat(experimentEvent._output()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(experimentEvent.scores())
            .contains(
                ExperimentEvent.Scores.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(experimentEvent.spanAttributes())
            .contains(SpanAttributes.builder().name("name").type(SpanType.LLM).build())
        assertThat(experimentEvent.spanParents().getOrNull()).containsExactly("string")
        assertThat(experimentEvent.tags().getOrNull()).containsExactly("string")
    }
}
