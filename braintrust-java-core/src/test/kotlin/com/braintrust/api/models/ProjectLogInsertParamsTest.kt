// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.core.JsonValue
import com.braintrust.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectLogInsertParamsTest {

    @Test
    fun createProjectLogInsertParams() {
        ProjectLogInsertParams.builder()
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .events(
                listOf(
                    ProjectLogInsertParams.Event.ofInsertProjectLogsEventReplace(
                        ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.builder()
                            .id("string")
                            ._isMerge(true)
                            ._objectDelete(true)
                            ._parentId("string")
                            .context(
                                ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Context
                                    .builder()
                                    .callerFilename("string")
                                    .callerFunctionname("string")
                                    .callerLineno(123L)
                                    .build()
                            )
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .input(JsonValue.from(mapOf<String, Any>()))
                            .metadata(
                                ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Metadata
                                    .builder()
                                    .build()
                            )
                            .metrics(
                                ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Metrics
                                    .builder()
                                    .completionTokens(123L)
                                    .end(42.23)
                                    .promptTokens(123L)
                                    .start(42.23)
                                    .tokens(123L)
                                    .build()
                            )
                            .output(JsonValue.from(mapOf<String, Any>()))
                            .scores(
                                ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Scores
                                    .builder()
                                    .build()
                            )
                            .spanAttributes(
                                ProjectLogInsertParams.Event.InsertProjectLogsEventReplace
                                    .SpanAttributes
                                    .builder()
                                    .name("string")
                                    .type(
                                        ProjectLogInsertParams.Event.InsertProjectLogsEventReplace
                                            .SpanAttributes
                                            .Type
                                            .LLM
                                    )
                                    .build()
                            )
                            .tags(listOf("string"))
                            .build()
                    )
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ProjectLogInsertParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .events(
                    listOf(
                        ProjectLogInsertParams.Event.ofInsertProjectLogsEventReplace(
                            ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.builder()
                                .id("string")
                                ._isMerge(true)
                                ._objectDelete(true)
                                ._parentId("string")
                                .context(
                                    ProjectLogInsertParams.Event.InsertProjectLogsEventReplace
                                        .Context
                                        .builder()
                                        .callerFilename("string")
                                        .callerFunctionname("string")
                                        .callerLineno(123L)
                                        .build()
                                )
                                .expected(JsonValue.from(mapOf<String, Any>()))
                                .input(JsonValue.from(mapOf<String, Any>()))
                                .metadata(
                                    ProjectLogInsertParams.Event.InsertProjectLogsEventReplace
                                        .Metadata
                                        .builder()
                                        .build()
                                )
                                .metrics(
                                    ProjectLogInsertParams.Event.InsertProjectLogsEventReplace
                                        .Metrics
                                        .builder()
                                        .completionTokens(123L)
                                        .end(42.23)
                                        .promptTokens(123L)
                                        .start(42.23)
                                        .tokens(123L)
                                        .build()
                                )
                                .output(JsonValue.from(mapOf<String, Any>()))
                                .scores(
                                    ProjectLogInsertParams.Event.InsertProjectLogsEventReplace
                                        .Scores
                                        .builder()
                                        .build()
                                )
                                .spanAttributes(
                                    ProjectLogInsertParams.Event.InsertProjectLogsEventReplace
                                        .SpanAttributes
                                        .builder()
                                        .name("string")
                                        .type(
                                            ProjectLogInsertParams.Event
                                                .InsertProjectLogsEventReplace
                                                .SpanAttributes
                                                .Type
                                                .LLM
                                        )
                                        .build()
                                )
                                .tags(listOf("string"))
                                .build()
                        )
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.events())
            .isEqualTo(
                listOf(
                    ProjectLogInsertParams.Event.ofInsertProjectLogsEventReplace(
                        ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.builder()
                            .id("string")
                            ._isMerge(true)
                            ._objectDelete(true)
                            ._parentId("string")
                            .context(
                                ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Context
                                    .builder()
                                    .callerFilename("string")
                                    .callerFunctionname("string")
                                    .callerLineno(123L)
                                    .build()
                            )
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .input(JsonValue.from(mapOf<String, Any>()))
                            .metadata(
                                ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Metadata
                                    .builder()
                                    .build()
                            )
                            .metrics(
                                ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Metrics
                                    .builder()
                                    .completionTokens(123L)
                                    .end(42.23)
                                    .promptTokens(123L)
                                    .start(42.23)
                                    .tokens(123L)
                                    .build()
                            )
                            .output(JsonValue.from(mapOf<String, Any>()))
                            .scores(
                                ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.Scores
                                    .builder()
                                    .build()
                            )
                            .spanAttributes(
                                ProjectLogInsertParams.Event.InsertProjectLogsEventReplace
                                    .SpanAttributes
                                    .builder()
                                    .name("string")
                                    .type(
                                        ProjectLogInsertParams.Event.InsertProjectLogsEventReplace
                                            .SpanAttributes
                                            .Type
                                            .LLM
                                    )
                                    .build()
                            )
                            .tags(listOf("string"))
                            .build()
                    )
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ProjectLogInsertParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .events(
                    listOf(
                        ProjectLogInsertParams.Event.ofInsertProjectLogsEventReplace(
                            ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.builder()
                                .build()
                        )
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.events())
            .isEqualTo(
                listOf(
                    ProjectLogInsertParams.Event.ofInsertProjectLogsEventReplace(
                        ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.builder().build()
                    )
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            ProjectLogInsertParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .events(
                    listOf(
                        ProjectLogInsertParams.Event.ofInsertProjectLogsEventReplace(
                            ProjectLogInsertParams.Event.InsertProjectLogsEventReplace.builder()
                                .build()
                        )
                    )
                )
                .build()
        assertThat(params).isNotNull
        // path param "projectId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
