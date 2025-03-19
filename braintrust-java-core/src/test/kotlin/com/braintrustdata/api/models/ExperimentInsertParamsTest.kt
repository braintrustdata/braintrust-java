// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExperimentInsertParamsTest {

    @Test
    fun create() {
        ExperimentInsertParams.builder()
            .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addEvent(
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
                    .spanAttributes(
                        SpanAttributes.builder().name("name").type(SpanType.LLM).build()
                    )
                    .spanId("span_id")
                    .addSpanParent("string")
                    .addTag("string")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExperimentInsertParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addEvent(InsertExperimentEvent.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExperimentInsertParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addEvent(
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
                        .spanAttributes(
                            SpanAttributes.builder().name("name").type(SpanType.LLM).build()
                        )
                        .spanId("span_id")
                        .addSpanParent("string")
                        .addTag("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.events())
            .containsExactly(
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
                    .spanAttributes(
                        SpanAttributes.builder().name("name").type(SpanType.LLM).build()
                    )
                    .spanId("span_id")
                    .addSpanParent("string")
                    .addTag("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExperimentInsertParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addEvent(InsertExperimentEvent.builder().build())
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.events()).containsExactly(InsertExperimentEvent.builder().build())
    }
}
