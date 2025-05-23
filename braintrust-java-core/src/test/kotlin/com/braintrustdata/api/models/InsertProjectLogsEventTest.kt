// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsertProjectLogsEventTest {

    @Test
    fun create() {
        val insertProjectLogsEvent =
            InsertProjectLogsEvent.builder()
                .id("id")
                ._isMerge(true)
                .addMergePath(listOf("string"))
                ._objectDelete(true)
                ._parentId("_parent_id")
                .context(
                    InsertProjectLogsEvent.Context.builder()
                        .callerFilename("caller_filename")
                        .callerFunctionname("caller_functionname")
                        .callerLineno(0L)
                        .build()
                )
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error(JsonValue.from(mapOf<String, Any>()))
                .expected(JsonValue.from(mapOf<String, Any>()))
                .input(JsonValue.from(mapOf<String, Any>()))
                .metadata(InsertProjectLogsEvent.Metadata.builder().model("model").build())
                .metrics(
                    InsertProjectLogsEvent.Metrics.builder()
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
                    InsertProjectLogsEvent.Scores.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .spanAttributes(SpanAttributes.builder().name("name").type(SpanType.LLM).build())
                .spanId("span_id")
                .addSpanParent("string")
                .addTag("string")
                .build()

        assertThat(insertProjectLogsEvent.id()).contains("id")
        assertThat(insertProjectLogsEvent._isMerge()).contains(true)
        assertThat(insertProjectLogsEvent._mergePaths().getOrNull())
            .containsExactly(listOf("string"))
        assertThat(insertProjectLogsEvent._objectDelete()).contains(true)
        assertThat(insertProjectLogsEvent._parentId()).contains("_parent_id")
        assertThat(insertProjectLogsEvent.context())
            .contains(
                InsertProjectLogsEvent.Context.builder()
                    .callerFilename("caller_filename")
                    .callerFunctionname("caller_functionname")
                    .callerLineno(0L)
                    .build()
            )
        assertThat(insertProjectLogsEvent.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(insertProjectLogsEvent._error()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(insertProjectLogsEvent._expected())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(insertProjectLogsEvent._input()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(insertProjectLogsEvent.metadata())
            .contains(InsertProjectLogsEvent.Metadata.builder().model("model").build())
        assertThat(insertProjectLogsEvent.metrics())
            .contains(
                InsertProjectLogsEvent.Metrics.builder()
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
        assertThat(insertProjectLogsEvent.origin())
            .contains(
                ObjectReference.builder()
                    .id("id")
                    ._xactId("_xact_id")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(ObjectReference.ObjectType.EXPERIMENT)
                    .created("created")
                    .build()
            )
        assertThat(insertProjectLogsEvent._output()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(insertProjectLogsEvent.rootSpanId()).contains("root_span_id")
        assertThat(insertProjectLogsEvent.scores())
            .contains(
                InsertProjectLogsEvent.Scores.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(insertProjectLogsEvent.spanAttributes())
            .contains(SpanAttributes.builder().name("name").type(SpanType.LLM).build())
        assertThat(insertProjectLogsEvent.spanId()).contains("span_id")
        assertThat(insertProjectLogsEvent.spanParents().getOrNull()).containsExactly("string")
        assertThat(insertProjectLogsEvent.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insertProjectLogsEvent =
            InsertProjectLogsEvent.builder()
                .id("id")
                ._isMerge(true)
                .addMergePath(listOf("string"))
                ._objectDelete(true)
                ._parentId("_parent_id")
                .context(
                    InsertProjectLogsEvent.Context.builder()
                        .callerFilename("caller_filename")
                        .callerFunctionname("caller_functionname")
                        .callerLineno(0L)
                        .build()
                )
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error(JsonValue.from(mapOf<String, Any>()))
                .expected(JsonValue.from(mapOf<String, Any>()))
                .input(JsonValue.from(mapOf<String, Any>()))
                .metadata(InsertProjectLogsEvent.Metadata.builder().model("model").build())
                .metrics(
                    InsertProjectLogsEvent.Metrics.builder()
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
                    InsertProjectLogsEvent.Scores.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .spanAttributes(SpanAttributes.builder().name("name").type(SpanType.LLM).build())
                .spanId("span_id")
                .addSpanParent("string")
                .addTag("string")
                .build()

        val roundtrippedInsertProjectLogsEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insertProjectLogsEvent),
                jacksonTypeRef<InsertProjectLogsEvent>(),
            )

        assertThat(roundtrippedInsertProjectLogsEvent).isEqualTo(insertProjectLogsEvent)
    }
}
