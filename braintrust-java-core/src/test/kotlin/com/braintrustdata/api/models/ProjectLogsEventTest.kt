// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectLogsEventTest {

    @Test
    fun create() {
        val projectLogsEvent =
            ProjectLogsEvent.builder()
                .id("id")
                ._xactId("_xact_id")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .logId(ProjectLogsEvent.LogId.G)
                .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .rootSpanId("root_span_id")
                .spanId("span_id")
                .context(
                    ProjectLogsEvent.Context.builder()
                        .callerFilename("caller_filename")
                        .callerFunctionname("caller_functionname")
                        .callerLineno(0L)
                        .build()
                )
                .error(JsonValue.from(mapOf<String, Any>()))
                .expected(JsonValue.from(mapOf<String, Any>()))
                .input(JsonValue.from(mapOf<String, Any>()))
                .isRoot(true)
                .metadata(ProjectLogsEvent.Metadata.builder().model("model").build())
                .metrics(
                    ProjectLogsEvent.Metrics.builder()
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
                    ProjectLogsEvent.Scores.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .spanAttributes(SpanAttributes.builder().name("name").type(SpanType.LLM).build())
                .addSpanParent("string")
                .addTag("string")
                .build()

        assertThat(projectLogsEvent.id()).isEqualTo("id")
        assertThat(projectLogsEvent._xactId()).isEqualTo("_xact_id")
        assertThat(projectLogsEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(projectLogsEvent.logId()).isEqualTo(ProjectLogsEvent.LogId.G)
        assertThat(projectLogsEvent.orgId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(projectLogsEvent.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(projectLogsEvent.rootSpanId()).isEqualTo("root_span_id")
        assertThat(projectLogsEvent.spanId()).isEqualTo("span_id")
        assertThat(projectLogsEvent.context())
            .contains(
                ProjectLogsEvent.Context.builder()
                    .callerFilename("caller_filename")
                    .callerFunctionname("caller_functionname")
                    .callerLineno(0L)
                    .build()
            )
        assertThat(projectLogsEvent._error()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(projectLogsEvent._expected()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(projectLogsEvent._input()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(projectLogsEvent.isRoot()).contains(true)
        assertThat(projectLogsEvent.metadata())
            .contains(ProjectLogsEvent.Metadata.builder().model("model").build())
        assertThat(projectLogsEvent.metrics())
            .contains(
                ProjectLogsEvent.Metrics.builder()
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
        assertThat(projectLogsEvent.origin())
            .contains(
                ObjectReference.builder()
                    .id("id")
                    ._xactId("_xact_id")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(ObjectReference.ObjectType.EXPERIMENT)
                    .created("created")
                    .build()
            )
        assertThat(projectLogsEvent._output()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(projectLogsEvent.scores())
            .contains(
                ProjectLogsEvent.Scores.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(projectLogsEvent.spanAttributes())
            .contains(SpanAttributes.builder().name("name").type(SpanType.LLM).build())
        assertThat(projectLogsEvent.spanParents().getOrNull()).containsExactly("string")
        assertThat(projectLogsEvent.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val projectLogsEvent =
            ProjectLogsEvent.builder()
                .id("id")
                ._xactId("_xact_id")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .logId(ProjectLogsEvent.LogId.G)
                .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .rootSpanId("root_span_id")
                .spanId("span_id")
                .context(
                    ProjectLogsEvent.Context.builder()
                        .callerFilename("caller_filename")
                        .callerFunctionname("caller_functionname")
                        .callerLineno(0L)
                        .build()
                )
                .error(JsonValue.from(mapOf<String, Any>()))
                .expected(JsonValue.from(mapOf<String, Any>()))
                .input(JsonValue.from(mapOf<String, Any>()))
                .isRoot(true)
                .metadata(ProjectLogsEvent.Metadata.builder().model("model").build())
                .metrics(
                    ProjectLogsEvent.Metrics.builder()
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
                    ProjectLogsEvent.Scores.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .spanAttributes(SpanAttributes.builder().name("name").type(SpanType.LLM).build())
                .addSpanParent("string")
                .addTag("string")
                .build()

        val roundtrippedProjectLogsEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(projectLogsEvent),
                jacksonTypeRef<ProjectLogsEvent>(),
            )

        assertThat(roundtrippedProjectLogsEvent).isEqualTo(projectLogsEvent)
    }
}
