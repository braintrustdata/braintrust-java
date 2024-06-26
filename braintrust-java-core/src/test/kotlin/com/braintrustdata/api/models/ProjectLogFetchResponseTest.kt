// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectLogFetchResponseTest {

    @Test
    fun createProjectLogFetchResponse() {
        val projectLogFetchResponse =
            ProjectLogFetchResponse.builder()
                .events(
                    listOf(
                        ProjectLogFetchResponse.Event.builder()
                            .id("string")
                            ._xactId("string")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .logId(ProjectLogFetchResponse.Event.LogId.G)
                            .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .rootSpanId("string")
                            .spanId("string")
                            .context(
                                ProjectLogFetchResponse.Event.Context.builder()
                                    .callerFilename("string")
                                    .callerFunctionname("string")
                                    .callerLineno(123L)
                                    .build()
                            )
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .input(JsonValue.from(mapOf<String, Any>()))
                            .metadata(ProjectLogFetchResponse.Event.Metadata.builder().build())
                            .metrics(
                                ProjectLogFetchResponse.Event.Metrics.builder()
                                    .completionTokens(123L)
                                    .end(42.23)
                                    .promptTokens(123L)
                                    .start(42.23)
                                    .tokens(123L)
                                    .build()
                            )
                            .output(JsonValue.from(mapOf<String, Any>()))
                            .scores(ProjectLogFetchResponse.Event.Scores.builder().build())
                            .spanAttributes(
                                ProjectLogFetchResponse.Event.SpanAttributes.builder()
                                    .name("string")
                                    .type(ProjectLogFetchResponse.Event.SpanAttributes.Type.LLM)
                                    .build()
                            )
                            .spanParents(listOf("string"))
                            .tags(listOf("string"))
                            .build()
                    )
                )
                .cursor("string")
                .build()
        assertThat(projectLogFetchResponse).isNotNull
        assertThat(projectLogFetchResponse.events())
            .containsExactly(
                ProjectLogFetchResponse.Event.builder()
                    .id("string")
                    ._xactId("string")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .logId(ProjectLogFetchResponse.Event.LogId.G)
                    .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .rootSpanId("string")
                    .spanId("string")
                    .context(
                        ProjectLogFetchResponse.Event.Context.builder()
                            .callerFilename("string")
                            .callerFunctionname("string")
                            .callerLineno(123L)
                            .build()
                    )
                    .expected(JsonValue.from(mapOf<String, Any>()))
                    .input(JsonValue.from(mapOf<String, Any>()))
                    .metadata(ProjectLogFetchResponse.Event.Metadata.builder().build())
                    .metrics(
                        ProjectLogFetchResponse.Event.Metrics.builder()
                            .completionTokens(123L)
                            .end(42.23)
                            .promptTokens(123L)
                            .start(42.23)
                            .tokens(123L)
                            .build()
                    )
                    .output(JsonValue.from(mapOf<String, Any>()))
                    .scores(ProjectLogFetchResponse.Event.Scores.builder().build())
                    .spanAttributes(
                        ProjectLogFetchResponse.Event.SpanAttributes.builder()
                            .name("string")
                            .type(ProjectLogFetchResponse.Event.SpanAttributes.Type.LLM)
                            .build()
                    )
                    .spanParents(listOf("string"))
                    .tags(listOf("string"))
                    .build()
            )
        assertThat(projectLogFetchResponse.cursor()).contains("string")
    }
}
