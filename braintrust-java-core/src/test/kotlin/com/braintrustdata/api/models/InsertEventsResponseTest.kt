// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsertEventsResponseTest {

    @Test
    fun create() {
        val insertEventsResponse = InsertEventsResponse.builder().addRowId("string").build()

        assertThat(insertEventsResponse.rowIds()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insertEventsResponse = InsertEventsResponse.builder().addRowId("string").build()

        val roundtrippedInsertEventsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insertEventsResponse),
                jacksonTypeRef<InsertEventsResponse>(),
            )

        assertThat(roundtrippedInsertEventsResponse).isEqualTo(insertEventsResponse)
    }
}
