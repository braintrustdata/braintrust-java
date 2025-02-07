// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FunctionInvokeParamsTest {

    @Test
    fun create() {
        FunctionInvokeParams.builder()
            .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .input(JsonValue.from(mapOf<String, Any>()))
            .addMessage(
                FunctionInvokeParams.Message.System.builder()
                    .role(FunctionInvokeParams.Message.System.Role.SYSTEM)
                    .content("content")
                    .name("name")
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
    fun body() {
        val params =
            FunctionInvokeParams.builder()
                .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .input(JsonValue.from(mapOf<String, Any>()))
                .addMessage(
                    FunctionInvokeParams.Message.System.builder()
                        .role(FunctionInvokeParams.Message.System.Role.SYSTEM)
                        .content("content")
                        .name("name")
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
        assertThat(body).isNotNull
        assertThat(body._input()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.messages())
            .contains(
                listOf(
                    FunctionInvokeParams.Message.ofSystem(
                        FunctionInvokeParams.Message.System.builder()
                            .role(FunctionInvokeParams.Message.System.Role.SYSTEM)
                            .content("content")
                            .name("name")
                            .build()
                    )
                )
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
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            FunctionInvokeParams.builder()
                .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "functionId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
