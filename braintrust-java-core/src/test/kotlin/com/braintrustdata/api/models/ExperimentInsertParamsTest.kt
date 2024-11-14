// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonNull
import com.braintrustdata.api.models.*
import java.time.OffsetDateTime
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
                        InsertExperimentEventReplace.builder()
                            .id("id")
                            ._isMerge(true)
                            ._objectDelete(true)
                            ._parentId("_parent_id")
                            .context(
                                InsertExperimentEventReplace.Context.builder()
                                    .callerFilename("caller_filename")
                                    .callerFunctionname("caller_functionname")
                                    .callerLineno(123L)
                                    .build()
                            )
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .datasetRecordId("dataset_record_id")
                            .error(JsonNull.of())
                            .expected(JsonNull.of())
                            .input(JsonNull.of())
                            .metadata(InsertExperimentEventReplace.Metadata.builder().build())
                            .metrics(
                                InsertExperimentEventReplace.Metrics.builder()
                                    .callerFilename(JsonNull.of())
                                    .callerFunctionname(JsonNull.of())
                                    .callerLineno(JsonNull.of())
                                    .completionTokens(123L)
                                    .end(42.23)
                                    .promptTokens(123L)
                                    .start(42.23)
                                    .tokens(123L)
                                    .build()
                            )
                            .output(JsonNull.of())
                            .scores(InsertExperimentEventReplace.Scores.builder().build())
                            .spanAttributes(
                                InsertExperimentEventReplace.SpanAttributes.builder()
                                    .name("name")
                                    .type(InsertExperimentEventReplace.SpanAttributes.Type.LLM)
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
            ExperimentInsertParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .events(
                    listOf(
                        ExperimentInsertParams.Event.ofInsertExperimentEventReplace(
                            InsertExperimentEventReplace.builder()
                                .id("id")
                                ._isMerge(true)
                                ._objectDelete(true)
                                ._parentId("_parent_id")
                                .context(
                                    InsertExperimentEventReplace.Context.builder()
                                        .callerFilename("caller_filename")
                                        .callerFunctionname("caller_functionname")
                                        .callerLineno(123L)
                                        .build()
                                )
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .datasetRecordId("dataset_record_id")
                                .error(JsonNull.of())
                                .expected(JsonNull.of())
                                .input(JsonNull.of())
                                .metadata(InsertExperimentEventReplace.Metadata.builder().build())
                                .metrics(
                                    InsertExperimentEventReplace.Metrics.builder()
                                        .callerFilename(JsonNull.of())
                                        .callerFunctionname(JsonNull.of())
                                        .callerLineno(JsonNull.of())
                                        .completionTokens(123L)
                                        .end(42.23)
                                        .promptTokens(123L)
                                        .start(42.23)
                                        .tokens(123L)
                                        .build()
                                )
                                .output(JsonNull.of())
                                .scores(InsertExperimentEventReplace.Scores.builder().build())
                                .spanAttributes(
                                    InsertExperimentEventReplace.SpanAttributes.builder()
                                        .name("name")
                                        .type(InsertExperimentEventReplace.SpanAttributes.Type.LLM)
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
                    ExperimentInsertParams.Event.ofInsertExperimentEventReplace(
                        InsertExperimentEventReplace.builder()
                            .id("id")
                            ._isMerge(true)
                            ._objectDelete(true)
                            ._parentId("_parent_id")
                            .context(
                                InsertExperimentEventReplace.Context.builder()
                                    .callerFilename("caller_filename")
                                    .callerFunctionname("caller_functionname")
                                    .callerLineno(123L)
                                    .build()
                            )
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .datasetRecordId("dataset_record_id")
                            .error(JsonNull.of())
                            .expected(JsonNull.of())
                            .input(JsonNull.of())
                            .metadata(InsertExperimentEventReplace.Metadata.builder().build())
                            .metrics(
                                InsertExperimentEventReplace.Metrics.builder()
                                    .callerFilename(JsonNull.of())
                                    .callerFunctionname(JsonNull.of())
                                    .callerLineno(JsonNull.of())
                                    .completionTokens(123L)
                                    .end(42.23)
                                    .promptTokens(123L)
                                    .start(42.23)
                                    .tokens(123L)
                                    .build()
                            )
                            .output(JsonNull.of())
                            .scores(InsertExperimentEventReplace.Scores.builder().build())
                            .spanAttributes(
                                InsertExperimentEventReplace.SpanAttributes.builder()
                                    .name("name")
                                    .type(InsertExperimentEventReplace.SpanAttributes.Type.LLM)
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
            ExperimentInsertParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .events(
                    listOf(
                        ExperimentInsertParams.Event.ofInsertExperimentEventReplace(
                            InsertExperimentEventReplace.builder().build()
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
                        InsertExperimentEventReplace.builder().build()
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
                            InsertExperimentEventReplace.builder().build()
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
