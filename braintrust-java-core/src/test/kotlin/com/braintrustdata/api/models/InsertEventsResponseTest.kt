// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InsertEventsResponseTest {

    @Test
    fun createInsertEventsResponse() {
      val insertEventsResponse = InsertEventsResponse.builder()
          .addRowId("string")
          .build()
      assertThat(insertEventsResponse).isNotNull
      assertThat(insertEventsResponse.rowIds()).containsExactly("string")
    }
}
