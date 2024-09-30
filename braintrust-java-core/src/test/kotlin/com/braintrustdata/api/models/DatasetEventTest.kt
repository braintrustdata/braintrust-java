// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonNull
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
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .rootSpanId("root_span_id")
                .spanId("span_id")
                .expected(JsonNull.of())
                .input(JsonNull.of())
                .metadata(DatasetEvent.Metadata.builder().build())
                .tags(listOf("string"))
                .build()
        assertThat(datasetEvent).isNotNull
        assertThat(datasetEvent.id()).isEqualTo("id")
        assertThat(datasetEvent._xactId()).isEqualTo("_xact_id")
        assertThat(datasetEvent.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(datasetEvent.datasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(datasetEvent.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(datasetEvent.rootSpanId()).isEqualTo("root_span_id")
        assertThat(datasetEvent.spanId()).isEqualTo("span_id")
        assertThat(datasetEvent._expected()).isEqualTo(JsonNull.of())
        assertThat(datasetEvent._input()).isEqualTo(JsonNull.of())
        assertThat(datasetEvent.metadata()).contains(DatasetEvent.Metadata.builder().build())
        assertThat(datasetEvent.tags().get()).containsExactly("string")
    }
}
