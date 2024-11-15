// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonNull
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InsertDatasetEventTest {

    @Test
    fun createInsertDatasetEvent() {
        val insertDatasetEvent =
            InsertDatasetEvent.builder()
                .id("id")
                ._isMerge(true)
                ._mergePaths(listOf(listOf("string")))
                ._objectDelete(true)
                ._parentId("_parent_id")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expected(JsonNull.of())
                .input(JsonNull.of())
                .metadata(InsertDatasetEvent.Metadata.builder().build())
                .rootSpanId("root_span_id")
                .spanId("span_id")
                .spanParents(listOf("string"))
                .tags(listOf("string"))
                .build()
        assertThat(insertDatasetEvent).isNotNull
        assertThat(insertDatasetEvent.id()).contains("id")
        assertThat(insertDatasetEvent._isMerge()).contains(true)
        assertThat(insertDatasetEvent._mergePaths().get()).containsExactly(listOf("string"))
        assertThat(insertDatasetEvent._objectDelete()).contains(true)
        assertThat(insertDatasetEvent._parentId()).contains("_parent_id")
        assertThat(insertDatasetEvent.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(insertDatasetEvent._expected()).isEqualTo(JsonNull.of())
        assertThat(insertDatasetEvent._input()).isEqualTo(JsonNull.of())
        assertThat(insertDatasetEvent.metadata())
            .contains(InsertDatasetEvent.Metadata.builder().build())
        assertThat(insertDatasetEvent.rootSpanId()).contains("root_span_id")
        assertThat(insertDatasetEvent.spanId()).contains("span_id")
        assertThat(insertDatasetEvent.spanParents().get()).containsExactly("string")
        assertThat(insertDatasetEvent.tags().get()).containsExactly("string")
    }
}
