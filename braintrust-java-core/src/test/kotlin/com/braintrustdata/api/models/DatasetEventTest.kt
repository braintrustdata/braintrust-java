// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetEventTest {

    @Test
    fun createDatasetEvent() {
        val datasetEvent =
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
        assertThat(datasetEvent).isNotNull
        assertThat(datasetEvent.id()).isEqualTo("id")
        assertThat(datasetEvent._xactId()).isEqualTo("_xact_id")
        assertThat(datasetEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(datasetEvent.datasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(datasetEvent.rootSpanId()).isEqualTo("root_span_id")
        assertThat(datasetEvent.spanId()).isEqualTo("span_id")
        assertThat(datasetEvent._expected()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(datasetEvent._input()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(datasetEvent.metadata()).contains(DatasetEvent.Metadata.builder().build())
        assertThat(datasetEvent.projectId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(datasetEvent.tags().get()).containsExactly("string")
    }
}
