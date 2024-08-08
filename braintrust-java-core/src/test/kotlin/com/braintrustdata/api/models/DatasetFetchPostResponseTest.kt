// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
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
                            .id("id")
                            ._xactId("_xact_id")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .rootSpanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .spanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .input(JsonValue.from(mapOf<String, Any>()))
                            .metadata(DatasetFetchPostResponse.Event.Metadata.builder().build())
                            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .tags(listOf("string"))
                            .build()
                    )
                )
                .cursor("cursor")
                .build()
        assertThat(datasetFetchPostResponse).isNotNull
        assertThat(datasetFetchPostResponse.events())
            .containsExactly(
                DatasetFetchPostResponse.Event.builder()
                    .id("id")
                    ._xactId("_xact_id")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .rootSpanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .spanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expected(JsonValue.from(mapOf<String, Any>()))
                    .input(JsonValue.from(mapOf<String, Any>()))
                    .metadata(DatasetFetchPostResponse.Event.Metadata.builder().build())
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tags(listOf("string"))
                    .build()
            )
        assertThat(datasetFetchPostResponse.cursor()).contains("cursor")
    }
}
