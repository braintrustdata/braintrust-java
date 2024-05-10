// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetFetchResponseTest {

    @Test
    fun createDatasetFetchResponse() {
        val datasetFetchResponse =
            DatasetFetchResponse.builder()
                .events(
                    listOf(
                        DatasetFetchResponse.Event.builder()
                            .id("string")
                            ._xactId("string")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .rootSpanId("string")
                            .spanId("string")
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .input(JsonValue.from(mapOf<String, Any>()))
                            .metadata(DatasetFetchResponse.Event.Metadata.builder().build())
                            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .tags(listOf("string"))
                            .build()
                    )
                )
                .cursor("string")
                .build()
        assertThat(datasetFetchResponse).isNotNull
        assertThat(datasetFetchResponse.events())
            .containsExactly(
                DatasetFetchResponse.Event.builder()
                    .id("string")
                    ._xactId("string")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .rootSpanId("string")
                    .spanId("string")
                    .expected(JsonValue.from(mapOf<String, Any>()))
                    .input(JsonValue.from(mapOf<String, Any>()))
                    .metadata(DatasetFetchResponse.Event.Metadata.builder().build())
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tags(listOf("string"))
                    .build()
            )
        assertThat(datasetFetchResponse.cursor()).contains("string")
    }
}
