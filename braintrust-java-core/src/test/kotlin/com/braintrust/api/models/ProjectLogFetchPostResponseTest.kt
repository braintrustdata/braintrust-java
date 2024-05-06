// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectLogFetchPostResponseTest {

    @Test
    fun createProjectLogFetchPostResponse() {
        val projectLogFetchPostResponse =
            ProjectLogFetchPostResponse.builder()
                .events(
                    listOf(
                        ProjectLogFetchPostResponse.Event.builder()
                            .id("string")
                            ._xactId("string")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .logId(ProjectLogFetchPostResponse.Event.LogId.G)
                            .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .rootSpanId("string")
                            .spanId("string")
                            .context(
                                ProjectLogFetchPostResponse.Event.Context.builder()
                                    .callerFilename("string")
                                    .callerFunctionname("string")
                                    .callerLineno(123L)
                                    .build()
                            )
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .input(JsonValue.from(mapOf<String, Any>()))
                            .metadata(ProjectLogFetchPostResponse.Event.Metadata.builder().build())
                            .metrics(
                                ProjectLogFetchPostResponse.Event.Metrics.builder()
                                    .completionTokens(123L)
                                    .end(42.23)
                                    .promptTokens(123L)
                                    .start(42.23)
                                    .tokens(123L)
                                    .build()
                            )
                            .output(JsonValue.from(mapOf<String, Any>()))
                            .scores(ProjectLogFetchPostResponse.Event.Scores.builder().build())
                            .spanAttributes(
                                ProjectLogFetchPostResponse.Event.SpanAttributes.builder()
                                    .name("string")
                                    .type(ProjectLogFetchPostResponse.Event.SpanAttributes.Type.LLM)
                                    .build()
                            )
                            .spanParents(listOf("string"))
                            .tags(listOf("string"))
                            .build()
                    )
                )
                .build()
        assertThat(projectLogFetchPostResponse).isNotNull
        assertThat(projectLogFetchPostResponse.events())
            .containsExactly(
                ProjectLogFetchPostResponse.Event.builder()
                    .id("string")
                    ._xactId("string")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .logId(ProjectLogFetchPostResponse.Event.LogId.G)
                    .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .rootSpanId("string")
                    .spanId("string")
                    .context(
                        ProjectLogFetchPostResponse.Event.Context.builder()
                            .callerFilename("string")
                            .callerFunctionname("string")
                            .callerLineno(123L)
                            .build()
                    )
                    .expected(JsonValue.from(mapOf<String, Any>()))
                    .input(JsonValue.from(mapOf<String, Any>()))
                    .metadata(ProjectLogFetchPostResponse.Event.Metadata.builder().build())
                    .metrics(
                        ProjectLogFetchPostResponse.Event.Metrics.builder()
                            .completionTokens(123L)
                            .end(42.23)
                            .promptTokens(123L)
                            .start(42.23)
                            .tokens(123L)
                            .build()
                    )
                    .output(JsonValue.from(mapOf<String, Any>()))
                    .scores(ProjectLogFetchPostResponse.Event.Scores.builder().build())
                    .spanAttributes(
                        ProjectLogFetchPostResponse.Event.SpanAttributes.builder()
                            .name("string")
                            .type(ProjectLogFetchPostResponse.Event.SpanAttributes.Type.LLM)
                            .build()
                    )
                    .spanParents(listOf("string"))
                    .tags(listOf("string"))
                    .build()
            )
    }
}
