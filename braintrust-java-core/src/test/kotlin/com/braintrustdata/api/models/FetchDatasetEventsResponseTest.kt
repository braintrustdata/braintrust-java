// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FetchDatasetEventsResponseTest {

    @Test
    fun createFetchDatasetEventsResponse() {
        val fetchDatasetEventsResponse =
            FetchDatasetEventsResponse.builder()
                .events(
                    listOf(
                        DatasetEvent.builder()
                            .id("id")
                            ._xactId("_xact_id")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .rootSpanId("root_span_id")
                            .spanId("span_id")
                            .expected(JsonValue.from(mapOf<String, Any>()))
                            .input(JsonValue.from(mapOf<String, Any>()))
                            .metadata(DatasetEvent.Metadata.builder().build())
                            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .tags(listOf("string"))
                            .build()
                    )
                )
                .cursor("cursor")
                .build()
        assertThat(fetchDatasetEventsResponse).isNotNull
        assertThat(fetchDatasetEventsResponse.events())
            .containsExactly(
                DatasetEvent.builder()
                    .id("id")
                    ._xactId("_xact_id")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .rootSpanId("root_span_id")
                    .spanId("span_id")
                    .expected(JsonValue.from(mapOf<String, Any>()))
                    .input(JsonValue.from(mapOf<String, Any>()))
                    .metadata(DatasetEvent.Metadata.builder().build())
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tags(listOf("string"))
                    .build()
            )
        assertThat(fetchDatasetEventsResponse.cursor()).contains("cursor")
    }
}
