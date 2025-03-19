// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsertEventsResponseTest {

    @Test
    fun create() {
        val insertEventsResponse = InsertEventsResponse.builder().addRowId("string").build()

        assertThat(insertEventsResponse.rowIds()).containsExactly("string")
    }
}
