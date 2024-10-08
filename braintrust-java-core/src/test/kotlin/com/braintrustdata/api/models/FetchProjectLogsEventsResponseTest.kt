// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonNull
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FetchProjectLogsEventsResponseTest {

    @Test
    fun createFetchProjectLogsEventsResponse() {
        val fetchProjectLogsEventsResponse =
            FetchProjectLogsEventsResponse.builder()
                .events(
                    listOf(
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
                                    .callerLineno(123L)
                                    .build()
                            )
                            .error(JsonNull.of())
                            .expected(JsonNull.of())
                            .input(JsonNull.of())
                            .metadata(ProjectLogsEvent.Metadata.builder().build())
                            .metrics(
                                ProjectLogsEvent.Metrics.builder()
                                    .completionTokens(123L)
                                    .end(42.23)
                                    .promptTokens(123L)
                                    .start(42.23)
                                    .tokens(123L)
                                    .build()
                            )
                            .output(JsonNull.of())
                            .scores(ProjectLogsEvent.Scores.builder().build())
                            .spanAttributes(
                                ProjectLogsEvent.SpanAttributes.builder()
                                    .name("name")
                                    .type(ProjectLogsEvent.SpanAttributes.Type.LLM)
                                    .build()
                            )
                            .spanParents(listOf("string"))
                            .tags(listOf("string"))
                            .build()
                    )
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
                            .callerLineno(123L)
                            .build()
                    )
                    .error(JsonNull.of())
                    .expected(JsonNull.of())
                    .input(JsonNull.of())
                    .metadata(ProjectLogsEvent.Metadata.builder().build())
                    .metrics(
                        ProjectLogsEvent.Metrics.builder()
                            .completionTokens(123L)
                            .end(42.23)
                            .promptTokens(123L)
                            .start(42.23)
                            .tokens(123L)
                            .build()
                    )
                    .output(JsonNull.of())
                    .scores(ProjectLogsEvent.Scores.builder().build())
                    .spanAttributes(
                        ProjectLogsEvent.SpanAttributes.builder()
                            .name("name")
                            .type(ProjectLogsEvent.SpanAttributes.Type.LLM)
                            .build()
                    )
                    .spanParents(listOf("string"))
                    .tags(listOf("string"))
                    .build()
            )
        assertThat(fetchProjectLogsEventsResponse.cursor()).contains("cursor")
    }
}
