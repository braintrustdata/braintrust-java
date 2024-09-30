// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonNull
import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FunctionInvokeParamsTest {

    @Test
    fun createFunctionInvokeParams() {
        FunctionInvokeParams.builder()
            .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .input(JsonNull.of())
            .messages(
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
            .mode(FunctionInvokeParams.Mode.AUTO)
            .parent(
                FunctionInvokeParams.Parent.ofSpanParentStruct(
                    FunctionInvokeParams.Parent.SpanParentStruct.builder()
                        .objectId("object_id")
                        .objectType(
                            FunctionInvokeParams.Parent.SpanParentStruct.ObjectType.PROJECT_LOGS
                        )
                        .propagatedEvent(
                            FunctionInvokeParams.Parent.SpanParentStruct.PropagatedEvent.builder()
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
            .stream(true)
            .version("version")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            FunctionInvokeParams.builder()
                .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .input(JsonNull.of())
                .messages(
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
                .mode(FunctionInvokeParams.Mode.AUTO)
                .parent(
                    FunctionInvokeParams.Parent.ofSpanParentStruct(
                        FunctionInvokeParams.Parent.SpanParentStruct.builder()
                            .objectId("object_id")
                            .objectType(
                                FunctionInvokeParams.Parent.SpanParentStruct.ObjectType.PROJECT_LOGS
                            )
                            .propagatedEvent(
                                FunctionInvokeParams.Parent.SpanParentStruct.PropagatedEvent
                                    .builder()
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
                .stream(true)
                .version("version")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.input()).isEqualTo(JsonNull.of())
        assertThat(body.messages())
            .isEqualTo(
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
        assertThat(body.mode()).isEqualTo(FunctionInvokeParams.Mode.AUTO)
        assertThat(body.parent())
            .isEqualTo(
                FunctionInvokeParams.Parent.ofSpanParentStruct(
                    FunctionInvokeParams.Parent.SpanParentStruct.builder()
                        .objectId("object_id")
                        .objectType(
                            FunctionInvokeParams.Parent.SpanParentStruct.ObjectType.PROJECT_LOGS
                        )
                        .propagatedEvent(
                            FunctionInvokeParams.Parent.SpanParentStruct.PropagatedEvent.builder()
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
        assertThat(body.stream()).isEqualTo(true)
        assertThat(body.version()).isEqualTo("version")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            FunctionInvokeParams.builder()
                .functionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
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
