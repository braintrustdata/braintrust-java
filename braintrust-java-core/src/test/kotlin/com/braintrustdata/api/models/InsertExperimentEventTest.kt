// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsertExperimentEventTest {

    @Test
    fun createInsertExperimentEvent() {
        val insertExperimentEvent =
            InsertExperimentEvent.builder()
                .id("id")
                ._isMerge(true)
                .addMergePath(listOf("string"))
                ._objectDelete(true)
                ._parentId("_parent_id")
                .context(
                    InsertExperimentEvent.Context.builder()
                        .callerFilename("caller_filename")
                        .callerFunctionname("caller_functionname")
                        .callerLineno(0L)
                        .build()
                )
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error(JsonValue.from(mapOf<String, Any>()))
                .expected(JsonValue.from(mapOf<String, Any>()))
                .input(JsonValue.from(mapOf<String, Any>()))
                .metadata(InsertExperimentEvent.Metadata.builder().model("model").build())
                .metrics(
                    InsertExperimentEvent.Metrics.builder()
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
                .rootSpanId("root_span_id")
                .scores(
                    InsertExperimentEvent.Scores.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .spanAttributes(SpanAttributes.builder().name("name").type(SpanType.LLM).build())
                .spanId("span_id")
                .addSpanParent("string")
                .addTag("string")
                .build()
        assertThat(insertExperimentEvent).isNotNull
        assertThat(insertExperimentEvent.id()).contains("id")
        assertThat(insertExperimentEvent._isMerge()).contains(true)
        assertThat(insertExperimentEvent._mergePaths().getOrNull())
            .containsExactly(listOf("string"))
        assertThat(insertExperimentEvent._objectDelete()).contains(true)
        assertThat(insertExperimentEvent._parentId()).contains("_parent_id")
        assertThat(insertExperimentEvent.context())
            .contains(
                InsertExperimentEvent.Context.builder()
                    .callerFilename("caller_filename")
                    .callerFunctionname("caller_functionname")
                    .callerLineno(0L)
                    .build()
            )
        assertThat(insertExperimentEvent.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(insertExperimentEvent._error()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(insertExperimentEvent._expected())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(insertExperimentEvent._input()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(insertExperimentEvent.metadata())
            .contains(InsertExperimentEvent.Metadata.builder().model("model").build())
        assertThat(insertExperimentEvent.metrics())
            .contains(
                InsertExperimentEvent.Metrics.builder()
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
        assertThat(insertExperimentEvent.origin())
            .contains(
                ObjectReference.builder()
                    .id("id")
                    ._xactId("_xact_id")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(ObjectReference.ObjectType.EXPERIMENT)
                    .created("created")
                    .build()
            )
        assertThat(insertExperimentEvent._output()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(insertExperimentEvent.rootSpanId()).contains("root_span_id")
        assertThat(insertExperimentEvent.scores())
            .contains(
                InsertExperimentEvent.Scores.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(insertExperimentEvent.spanAttributes())
            .contains(SpanAttributes.builder().name("name").type(SpanType.LLM).build())
        assertThat(insertExperimentEvent.spanId()).contains("span_id")
        assertThat(insertExperimentEvent.spanParents().getOrNull()).containsExactly("string")
        assertThat(insertExperimentEvent.tags().getOrNull()).containsExactly("string")
    }
}
