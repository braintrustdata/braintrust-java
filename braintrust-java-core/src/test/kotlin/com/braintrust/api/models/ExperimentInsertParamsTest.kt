// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.core.JsonValue
import com.braintrust.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExperimentInsertParamsTest {

    @Test
    fun createExperimentInsertParams() {
        ExperimentInsertParams.builder()
            .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .events(
                listOf(
                    ExperimentInsertParams.Event.ofInsertExperimentEventReplace(
                        ExperimentInsertParams.Event.InsertExperimentEventReplace.builder()
                            .id("string")
                            ._isMerge(true)
                            ._objectDelete(true)
                            ._parentId("string")
                            .context(
                                ExperimentInsertParams.Event.InsertExperimentEventReplace.Context
                                    .builder()
                                    .callerFilename("string")
                                    .callerFunctionname("string")
                                    .callerLineno(123L)
                                    .build()
                            )
                            .datasetRecordId("string")
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .input(JsonValue.from(mapOf<String, Any>()))
                            .metadata(
                                ExperimentInsertParams.Event.InsertExperimentEventReplace.Metadata
                                    .builder()
                                    .build()
                            )
                            .metrics(
                                ExperimentInsertParams.Event.InsertExperimentEventReplace.Metrics
                                    .builder()
                                    .end(42.23)
                                    .start(42.23)
                                    .build()
                            )
                            .output(JsonValue.from(mapOf<String, Any>()))
                            .scores(
                                ExperimentInsertParams.Event.InsertExperimentEventReplace.Scores
                                    .builder()
                                    .build()
                            )
                            .spanAttributes(
                                ExperimentInsertParams.Event.InsertExperimentEventReplace
                                    .SpanAttributes
                                    .builder()
                                    .name("string")
                                    .type(
                                        ExperimentInsertParams.Event.InsertExperimentEventReplace
                                            .SpanAttributes
                                            .Type
                                            .LLM
                                    )
                                    .build()
                            )
                            .build()
                    )
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExperimentInsertParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .events(
                    listOf(
                        ExperimentInsertParams.Event.ofInsertExperimentEventReplace(
                            ExperimentInsertParams.Event.InsertExperimentEventReplace.builder()
                                .id("string")
                                ._isMerge(true)
                                ._objectDelete(true)
                                ._parentId("string")
                                .context(
                                    ExperimentInsertParams.Event.InsertExperimentEventReplace
                                        .Context
                                        .builder()
                                        .callerFilename("string")
                                        .callerFunctionname("string")
                                        .callerLineno(123L)
                                        .build()
                                )
                                .datasetRecordId("string")
                                .expected(JsonValue.from(mapOf<String, Any>()))
                                .input(JsonValue.from(mapOf<String, Any>()))
                                .metadata(
                                    ExperimentInsertParams.Event.InsertExperimentEventReplace
                                        .Metadata
                                        .builder()
                                        .build()
                                )
                                .metrics(
                                    ExperimentInsertParams.Event.InsertExperimentEventReplace
                                        .Metrics
                                        .builder()
                                        .end(42.23)
                                        .start(42.23)
                                        .build()
                                )
                                .output(JsonValue.from(mapOf<String, Any>()))
                                .scores(
                                    ExperimentInsertParams.Event.InsertExperimentEventReplace.Scores
                                        .builder()
                                        .build()
                                )
                                .spanAttributes(
                                    ExperimentInsertParams.Event.InsertExperimentEventReplace
                                        .SpanAttributes
                                        .builder()
                                        .name("string")
                                        .type(
                                            ExperimentInsertParams.Event
                                                .InsertExperimentEventReplace
                                                .SpanAttributes
                                                .Type
                                                .LLM
                                        )
                                        .build()
                                )
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
                    ExperimentInsertParams.Event.ofInsertExperimentEventReplace(
                        ExperimentInsertParams.Event.InsertExperimentEventReplace.builder()
                            .id("string")
                            ._isMerge(true)
                            ._objectDelete(true)
                            ._parentId("string")
                            .context(
                                ExperimentInsertParams.Event.InsertExperimentEventReplace.Context
                                    .builder()
                                    .callerFilename("string")
                                    .callerFunctionname("string")
                                    .callerLineno(123L)
                                    .build()
                            )
                            .datasetRecordId("string")
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .input(JsonValue.from(mapOf<String, Any>()))
                            .metadata(
                                ExperimentInsertParams.Event.InsertExperimentEventReplace.Metadata
                                    .builder()
                                    .build()
                            )
                            .metrics(
                                ExperimentInsertParams.Event.InsertExperimentEventReplace.Metrics
                                    .builder()
                                    .end(42.23)
                                    .start(42.23)
                                    .build()
                            )
                            .output(JsonValue.from(mapOf<String, Any>()))
                            .scores(
                                ExperimentInsertParams.Event.InsertExperimentEventReplace.Scores
                                    .builder()
                                    .build()
                            )
                            .spanAttributes(
                                ExperimentInsertParams.Event.InsertExperimentEventReplace
                                    .SpanAttributes
                                    .builder()
                                    .name("string")
                                    .type(
                                        ExperimentInsertParams.Event.InsertExperimentEventReplace
                                            .SpanAttributes
                                            .Type
                                            .LLM
                                    )
                                    .build()
                            )
                            .build()
                    )
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ExperimentInsertParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .events(
                    listOf(
                        ExperimentInsertParams.Event.ofInsertExperimentEventReplace(
                            ExperimentInsertParams.Event.InsertExperimentEventReplace.builder()
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
                    ExperimentInsertParams.Event.ofInsertExperimentEventReplace(
                        ExperimentInsertParams.Event.InsertExperimentEventReplace.builder().build()
                    )
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            ExperimentInsertParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .events(
                    listOf(
                        ExperimentInsertParams.Event.ofInsertExperimentEventReplace(
                            ExperimentInsertParams.Event.InsertExperimentEventReplace.builder()
                                .build()
                        )
                    )
                )
                .build()
        assertThat(params).isNotNull
        // path param "experimentId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
