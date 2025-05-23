// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FetchExperimentEventsResponseTest {

    @Test
    fun create() {
        val fetchExperimentEventsResponse =
            FetchExperimentEventsResponse.builder()
                .addEvent(
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
                        .spanAttributes(
                            SpanAttributes.builder().name("name").type(SpanType.LLM).build()
                        )
                        .addSpanParent("string")
                        .addTag("string")
                        .build()
                )
                .cursor("cursor")
                .build()

        assertThat(fetchExperimentEventsResponse.events())
            .containsExactly(
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
                    .spanAttributes(
                        SpanAttributes.builder().name("name").type(SpanType.LLM).build()
                    )
                    .addSpanParent("string")
                    .addTag("string")
                    .build()
            )
        assertThat(fetchExperimentEventsResponse.cursor()).contains("cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fetchExperimentEventsResponse =
            FetchExperimentEventsResponse.builder()
                .addEvent(
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
                        .spanAttributes(
                            SpanAttributes.builder().name("name").type(SpanType.LLM).build()
                        )
                        .addSpanParent("string")
                        .addTag("string")
                        .build()
                )
                .cursor("cursor")
                .build()

        val roundtrippedFetchExperimentEventsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fetchExperimentEventsResponse),
                jacksonTypeRef<FetchExperimentEventsResponse>(),
            )

        assertThat(roundtrippedFetchExperimentEventsResponse)
            .isEqualTo(fetchExperimentEventsResponse)
    }
}
