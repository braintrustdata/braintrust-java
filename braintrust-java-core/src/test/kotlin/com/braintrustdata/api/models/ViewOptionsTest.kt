// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ViewOptionsTest {

    @Test
    fun createViewOptions() {
      val viewOptions = ViewOptions.builder()
          .addColumnOrder("string")
          .columnSizing(ViewOptions.ColumnSizing.builder()
              .putAdditionalProperty("foo", JsonValue.from(0))
              .build())
          .columnVisibility(ViewOptions.ColumnVisibility.builder()
              .putAdditionalProperty("foo", JsonValue.from(true))
              .build())
          .build()
      assertThat(viewOptions).isNotNull
      assertThat(viewOptions.columnOrder().get()).containsExactly("string")
      assertThat(viewOptions.columnSizing()).contains(ViewOptions.ColumnSizing.builder()
          .putAdditionalProperty("foo", JsonValue.from(0))
          .build())
      assertThat(viewOptions.columnVisibility()).contains(ViewOptions.ColumnVisibility.builder()
          .putAdditionalProperty("foo", JsonValue.from(true))
          .build())
    }
}
