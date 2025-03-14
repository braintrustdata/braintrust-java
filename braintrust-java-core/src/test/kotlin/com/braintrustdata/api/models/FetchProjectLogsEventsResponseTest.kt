// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FetchProjectLogsEventsResponseTest {

    @Test
    fun createFetchProjectLogsEventsResponse() {
        val fetchProjectLogsEventsResponse =
            FetchProjectLogsEventsResponse.builder()
                .addEvent(
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
                        .spanAttributes(
                            SpanAttributes.builder().name("name").type(SpanType.LLM).build()
                        )
                        .addSpanParent("string")
                        .addTag("string")
                        .build()
                )
                .cursor("cursor")
                .build()
        assertThat(fetchProjectLogsEventsResponse).isNotNull
        assertThat(fetchProjectLogsEventsResponse.events())
            .containsExactly(
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
                    .spanAttributes(
                        SpanAttributes.builder().name("name").type(SpanType.LLM).build()
                    )
                    .addSpanParent("string")
                    .addTag("string")
                    .build()
            )
        assertThat(fetchProjectLogsEventsResponse.cursor()).contains("cursor")
    }
}
