// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionInvokeParamsTest {

    @Test
    fun create() {
        FunctionInvokeParams.builder()
            .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .expected(JsonValue.from(mapOf<String, Any>()))
            .input(JsonValue.from(mapOf<String, Any>()))
            .addMessage(
                FunctionInvokeParams.Message.System.builder()
                    .role(FunctionInvokeParams.Message.System.Role.SYSTEM)
                    .content("content")
                    .name("name")
                    .build()
            )
            .metadata(
                FunctionInvokeParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .mode(FunctionInvokeParams.Mode.AUTO)
            .parent(
                FunctionInvokeParams.Parent.SpanParentStruct.builder()
                    .objectId("object_id")
                    .objectType(
                        FunctionInvokeParams.Parent.SpanParentStruct.ObjectType.PROJECT_LOGS
                    )
                    .propagatedEvent(
                        FunctionInvokeParams.Parent.SpanParentStruct.PropagatedEvent.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .rowIds(
                        FunctionInvokeParams.Parent.SpanParentStruct.RowIds.builder()
                            .id("id")
                            .rootSpanId("root_span_id")
                            .spanId("span_id")
                            .build()
                    )
                    .build()
            )
            .stream(true)
            .version("version")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FunctionInvokeParams.builder()
                .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FunctionInvokeParams.builder()
                .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expected(JsonValue.from(mapOf<String, Any>()))
                .input(JsonValue.from(mapOf<String, Any>()))
                .addMessage(
                    FunctionInvokeParams.Message.System.builder()
                        .role(FunctionInvokeParams.Message.System.Role.SYSTEM)
                        .content("content")
                        .name("name")
                        .build()
                )
                .metadata(
                    FunctionInvokeParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .mode(FunctionInvokeParams.Mode.AUTO)
                .parent(
                    FunctionInvokeParams.Parent.SpanParentStruct.builder()
                        .objectId("object_id")
                        .objectType(
                            FunctionInvokeParams.Parent.SpanParentStruct.ObjectType.PROJECT_LOGS
                        )
                        .propagatedEvent(
                            FunctionInvokeParams.Parent.SpanParentStruct.PropagatedEvent.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .rowIds(
                            FunctionInvokeParams.Parent.SpanParentStruct.RowIds.builder()
                                .id("id")
                                .rootSpanId("root_span_id")
                                .spanId("span_id")
                                .build()
                        )
                        .build()
                )
                .stream(true)
                .version("version")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body._expected()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._input()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.messages().getOrNull())
            .containsExactly(
                FunctionInvokeParams.Message.ofSystem(
                    FunctionInvokeParams.Message.System.builder()
                        .role(FunctionInvokeParams.Message.System.Role.SYSTEM)
                        .content("content")
                        .name("name")
                        .build()
                )
            )
        assertThat(body.metadata())
            .contains(
                FunctionInvokeParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.mode()).contains(FunctionInvokeParams.Mode.AUTO)
        assertThat(body.parent())
            .contains(
                FunctionInvokeParams.Parent.ofSpanParentStruct(
                    FunctionInvokeParams.Parent.SpanParentStruct.builder()
                        .objectId("object_id")
                        .objectType(
                            FunctionInvokeParams.Parent.SpanParentStruct.ObjectType.PROJECT_LOGS
                        )
                        .propagatedEvent(
                            FunctionInvokeParams.Parent.SpanParentStruct.PropagatedEvent.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .rowIds(
                            FunctionInvokeParams.Parent.SpanParentStruct.RowIds.builder()
                                .id("id")
                                .rootSpanId("root_span_id")
                                .spanId("span_id")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.stream()).contains(true)
        assertThat(body.version()).contains("version")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FunctionInvokeParams.builder()
                .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertNotNull(body)
    }
}
