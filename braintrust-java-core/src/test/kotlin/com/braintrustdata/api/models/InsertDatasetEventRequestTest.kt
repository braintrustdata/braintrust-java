// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InsertDatasetEventRequestTest {

    @Test
    fun createInsertDatasetEventRequest() {
        val insertDatasetEventRequest =
            InsertDatasetEventRequest.builder()
                .events(
                    listOf(
                        InsertDatasetEventRequest.Event.ofInsertDatasetEventReplace(
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
                        )
                    )
                )
                .build()
        assertThat(insertDatasetEventRequest).isNotNull
        assertThat(insertDatasetEventRequest.events())
            .containsExactly(
                InsertDatasetEventRequest.Event.ofInsertDatasetEventReplace(
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
                )
            )
    }
}
