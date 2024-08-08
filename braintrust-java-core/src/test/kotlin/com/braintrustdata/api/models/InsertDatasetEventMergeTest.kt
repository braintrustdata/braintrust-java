// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InsertDatasetEventMergeTest {

    @Test
    fun createInsertDatasetEventMerge() {
        val insertDatasetEventMerge =
            InsertDatasetEventMerge.builder()
                ._isMerge(true)
                .id("id")
                ._mergePaths(listOf(listOf("string")))
                ._objectDelete(true)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expected(JsonValue.from(mapOf<String, Any>()))
                .input(JsonValue.from(mapOf<String, Any>()))
                .metadata(InsertDatasetEventMerge.Metadata.builder().build())
                .tags(listOf("string"))
                .build()
        assertThat(insertDatasetEventMerge).isNotNull
        assertThat(insertDatasetEventMerge._isMerge()).isEqualTo(true)
        assertThat(insertDatasetEventMerge.id()).contains("id")
        assertThat(insertDatasetEventMerge._mergePaths().get()).containsExactly(listOf("string"))
        assertThat(insertDatasetEventMerge._objectDelete()).contains(true)
        assertThat(insertDatasetEventMerge.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(insertDatasetEventMerge._expected())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(insertDatasetEventMerge._input()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(insertDatasetEventMerge.metadata())
            .contains(InsertDatasetEventMerge.Metadata.builder().build())
        assertThat(insertDatasetEventMerge.tags().get()).containsExactly("string")
    }
}
