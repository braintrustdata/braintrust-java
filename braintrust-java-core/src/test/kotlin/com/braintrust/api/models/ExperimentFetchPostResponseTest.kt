// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExperimentFetchPostResponseTest {

    @Test
    fun createExperimentFetchPostResponse() {
        val experimentFetchPostResponse =
            ExperimentFetchPostResponse.builder()
                .events(
                    listOf(
                        ExperimentFetchPostResponse.Event.builder()
                            .id("string")
                            ._xactId(123L)
                            .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .rootSpanId("string")
                            .spanId("string")
                            .context(
                                ExperimentFetchPostResponse.Event.Context.builder()
                                    .callerFilename("string")
                                    .callerFunctionname("string")
                                    .callerLineno(123L)
                                    .build()
                            )
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .datasetRecordId("string")
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .input(JsonValue.from(mapOf<String, Any>()))
                            .metadata(ExperimentFetchPostResponse.Event.Metadata.builder().build())
                            .metrics(
                                ExperimentFetchPostResponse.Event.Metrics.builder()
                                    .end(42.23)
                                    .start(42.23)
                                    .build()
                            )
                            .output(JsonValue.from(mapOf<String, Any>()))
                            .scores(ExperimentFetchPostResponse.Event.Scores.builder().build())
                            .spanAttributes(
                                ExperimentFetchPostResponse.Event.SpanAttributes.builder()
                                    .name("string")
                                    .type(ExperimentFetchPostResponse.Event.SpanAttributes.Type.LLM)
                                    .build()
                            )
                            .spanParents(listOf("string"))
                            .build()
                    )
                )
                .build()
        assertThat(experimentFetchPostResponse).isNotNull
        assertThat(experimentFetchPostResponse.events())
            .containsExactly(
                ExperimentFetchPostResponse.Event.builder()
                    .id("string")
                    ._xactId(123L)
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .rootSpanId("string")
                    .spanId("string")
                    .context(
                        ExperimentFetchPostResponse.Event.Context.builder()
                            .callerFilename("string")
                            .callerFunctionname("string")
                            .callerLineno(123L)
                            .build()
                    )
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .datasetRecordId("string")
                    .expected(JsonValue.from(mapOf<String, Any>()))
                    .input(JsonValue.from(mapOf<String, Any>()))
                    .metadata(ExperimentFetchPostResponse.Event.Metadata.builder().build())
                    .metrics(
                        ExperimentFetchPostResponse.Event.Metrics.builder()
                            .end(42.23)
                            .start(42.23)
                            .build()
                    )
                    .output(JsonValue.from(mapOf<String, Any>()))
                    .scores(ExperimentFetchPostResponse.Event.Scores.builder().build())
                    .spanAttributes(
                        ExperimentFetchPostResponse.Event.SpanAttributes.builder()
                            .name("string")
                            .type(ExperimentFetchPostResponse.Event.SpanAttributes.Type.LLM)
                            .build()
                    )
                    .spanParents(listOf("string"))
                    .build()
            )
    }
}
