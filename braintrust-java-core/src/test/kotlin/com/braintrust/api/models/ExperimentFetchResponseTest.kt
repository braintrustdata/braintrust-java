// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExperimentFetchResponseTest {

    @Test
    fun createExperimentFetchResponse() {
        val experimentFetchResponse =
            ExperimentFetchResponse.builder()
                .events(
                    listOf(
                        ExperimentFetchResponse.Event.builder()
                            .id("string")
                            ._xactId(123L)
                            .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .rootSpanId("string")
                            .spanId("string")
                            .context(
                                ExperimentFetchResponse.Event.Context.builder()
                                    .callerFilename("string")
                                    .callerFunctionname("string")
                                    .callerLineno(123L)
                                    .build()
                            )
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .datasetRecordId("string")
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .input(JsonValue.from(mapOf<String, Any>()))
                            .metadata(ExperimentFetchResponse.Event.Metadata.builder().build())
                            .metrics(
                                ExperimentFetchResponse.Event.Metrics.builder()
                                    .end(42.23)
                                    .start(42.23)
                                    .build()
                            )
                            .output(JsonValue.from(mapOf<String, Any>()))
                            .scores(ExperimentFetchResponse.Event.Scores.builder().build())
                            .spanAttributes(
                                ExperimentFetchResponse.Event.SpanAttributes.builder()
                                    .name("string")
                                    .type(ExperimentFetchResponse.Event.SpanAttributes.Type.LLM)
                                    .build()
                            )
                            .spanParents(listOf("string"))
                            .build()
                    )
                )
                .build()
        assertThat(experimentFetchResponse).isNotNull
        assertThat(experimentFetchResponse.events())
            .containsExactly(
                ExperimentFetchResponse.Event.builder()
                    .id("string")
                    ._xactId(123L)
                    .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .rootSpanId("string")
                    .spanId("string")
                    .context(
                        ExperimentFetchResponse.Event.Context.builder()
                            .callerFilename("string")
                            .callerFunctionname("string")
                            .callerLineno(123L)
                            .build()
                    )
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .datasetRecordId("string")
                    .expected(JsonValue.from(mapOf<String, Any>()))
                    .input(JsonValue.from(mapOf<String, Any>()))
                    .metadata(ExperimentFetchResponse.Event.Metadata.builder().build())
                    .metrics(
                        ExperimentFetchResponse.Event.Metrics.builder()
                            .end(42.23)
                            .start(42.23)
                            .build()
                    )
                    .output(JsonValue.from(mapOf<String, Any>()))
                    .scores(ExperimentFetchResponse.Event.Scores.builder().build())
                    .spanAttributes(
                        ExperimentFetchResponse.Event.SpanAttributes.builder()
                            .name("string")
                            .type(ExperimentFetchResponse.Event.SpanAttributes.Type.LLM)
                            .build()
                    )
                    .spanParents(listOf("string"))
                    .build()
            )
    }
}
