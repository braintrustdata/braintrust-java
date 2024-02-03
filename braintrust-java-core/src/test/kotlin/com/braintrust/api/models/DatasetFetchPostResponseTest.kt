// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetFetchPostResponseTest {

    @Test
    fun createDatasetFetchPostResponse() {
        val datasetFetchPostResponse =
            DatasetFetchPostResponse.builder()
                .events(
                    listOf(
                        DatasetFetchPostResponse.Event.builder()
                            .id("string")
                            ._xactId(123L)
                            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .rootSpanId("string")
                            .spanId("string")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .input(JsonValue.from(mapOf<String, Any>()))
                            .metadata(DatasetFetchPostResponse.Event.Metadata.builder().build())
                            .output(JsonValue.from(mapOf<String, Any>()))
                            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                )
                .build()
        assertThat(datasetFetchPostResponse).isNotNull
        assertThat(datasetFetchPostResponse.events())
            .containsExactly(
                DatasetFetchPostResponse.Event.builder()
                    .id("string")
                    ._xactId(123L)
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .rootSpanId("string")
                    .spanId("string")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .input(JsonValue.from(mapOf<String, Any>()))
                    .metadata(DatasetFetchPostResponse.Event.Metadata.builder().build())
                    .output(JsonValue.from(mapOf<String, Any>()))
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
