// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InsertProjectLogsEventRequestTest {

    @Test
    fun createInsertProjectLogsEventRequest() {
        val insertProjectLogsEventRequest =
            InsertProjectLogsEventRequest.builder()
                .events(
                    listOf(
                        InsertProjectLogsEvent.ofInsertProjectLogsEventReplace(
                            InsertProjectLogsEventReplace.builder()
                                .id("id")
                                ._isMerge(true)
                                ._objectDelete(true)
                                ._parentId("_parent_id")
                                .context(
                                    InsertProjectLogsEventReplace.Context.builder()
                                        .callerFilename("caller_filename")
                                        .callerFunctionname("caller_functionname")
                                        .callerLineno(123L)
                                        .build()
                                )
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .error(JsonValue.from(mapOf<String, Any>()))
                                .expected(JsonValue.from(mapOf<String, Any>()))
                                .input(JsonValue.from(mapOf<String, Any>()))
                                .metadata(InsertProjectLogsEventReplace.Metadata.builder().build())
                                .metrics(
                                    InsertProjectLogsEventReplace.Metrics.builder()
                                        .completionTokens(123L)
                                        .end(42.23)
                                        .promptTokens(123L)
                                        .start(42.23)
                                        .tokens(123L)
                                        .build()
                                )
                                .output(JsonValue.from(mapOf<String, Any>()))
                                .scores(InsertProjectLogsEventReplace.Scores.builder().build())
                                .spanAttributes(
                                    InsertProjectLogsEventReplace.SpanAttributes.builder()
                                        .name("name")
                                        .type(InsertProjectLogsEventReplace.SpanAttributes.Type.LLM)
                                        .build()
                                )
                                .tags(listOf("string"))
                                .build()
                        )
                    )
                )
                .build()
        assertThat(insertProjectLogsEventRequest).isNotNull
        assertThat(insertProjectLogsEventRequest.events())
            .containsExactly(
                InsertProjectLogsEvent.ofInsertProjectLogsEventReplace(
                    InsertProjectLogsEventReplace.builder()
                        .id("id")
                        ._isMerge(true)
                        ._objectDelete(true)
                        ._parentId("_parent_id")
                        .context(
                            InsertProjectLogsEventReplace.Context.builder()
                                .callerFilename("caller_filename")
                                .callerFunctionname("caller_functionname")
                                .callerLineno(123L)
                                .build()
                        )
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .error(JsonValue.from(mapOf<String, Any>()))
                        .expected(JsonValue.from(mapOf<String, Any>()))
                        .input(JsonValue.from(mapOf<String, Any>()))
                        .metadata(InsertProjectLogsEventReplace.Metadata.builder().build())
                        .metrics(
                            InsertProjectLogsEventReplace.Metrics.builder()
                                .completionTokens(123L)
                                .end(42.23)
                                .promptTokens(123L)
                                .start(42.23)
                                .tokens(123L)
                                .build()
                        )
                        .output(JsonValue.from(mapOf<String, Any>()))
                        .scores(InsertProjectLogsEventReplace.Scores.builder().build())
                        .spanAttributes(
                            InsertProjectLogsEventReplace.SpanAttributes.builder()
                                .name("name")
                                .type(InsertProjectLogsEventReplace.SpanAttributes.Type.LLM)
                                .build()
                        )
                        .tags(listOf("string"))
                        .build()
                )
            )
    }
}
