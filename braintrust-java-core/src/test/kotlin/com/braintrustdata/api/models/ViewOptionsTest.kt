// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ViewOptionsTest {

    @Test
    fun create() {
        val viewOptions =
            ViewOptions.builder()
                .addColumnOrder("string")
                .columnSizing(
                    ViewOptions.ColumnSizing.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .columnVisibility(
                    ViewOptions.ColumnVisibility.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .grouping("grouping")
                .layout("layout")
                .rowHeight("rowHeight")
                .build()

        assertThat(viewOptions.columnOrder().getOrNull()).containsExactly("string")
        assertThat(viewOptions.columnSizing())
            .contains(
                ViewOptions.ColumnSizing.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(viewOptions.columnVisibility())
            .contains(
                ViewOptions.ColumnVisibility.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(viewOptions.grouping()).contains("grouping")
        assertThat(viewOptions.layout()).contains("layout")
        assertThat(viewOptions.rowHeight()).contains("rowHeight")
    }
}
