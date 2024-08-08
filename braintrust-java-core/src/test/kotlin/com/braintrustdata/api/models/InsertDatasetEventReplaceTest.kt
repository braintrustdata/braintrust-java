// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InsertDatasetEventReplaceTest {

    @Test
    fun createInsertDatasetEventReplace() {
        val insertDatasetEventReplace =
            InsertDatasetEventReplace.builder()
                .id("id")
                ._isMerge(true)
                ._objectDelete(true)
                ._parentId("_parent_id")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expected(JsonValue.from(mapOf<String, Any>()))
                .input(JsonValue.from(mapOf<String, Any>()))
                .metadata(InsertDatasetEventReplace.Metadata.builder().build())
                .tags(listOf("string"))
                .build()
        assertThat(insertDatasetEventReplace).isNotNull
        assertThat(insertDatasetEventReplace.id()).contains("id")
        assertThat(insertDatasetEventReplace._isMerge()).contains(true)
        assertThat(insertDatasetEventReplace._objectDelete()).contains(true)
        assertThat(insertDatasetEventReplace._parentId()).contains("_parent_id")
        assertThat(insertDatasetEventReplace.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(insertDatasetEventReplace._expected())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(insertDatasetEventReplace._input())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(insertDatasetEventReplace.metadata())
            .contains(InsertDatasetEventReplace.Metadata.builder().build())
        assertThat(insertDatasetEventReplace.tags().get()).containsExactly("string")
    }
}
