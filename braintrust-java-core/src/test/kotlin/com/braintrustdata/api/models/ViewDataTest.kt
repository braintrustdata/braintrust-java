// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ViewDataTest {

    @Test
    fun create() {
        val viewData =
            ViewData.builder()
                .search(
                    ViewDataSearch.builder()
                        .addFilter(JsonValue.from(mapOf<String, Any>()))
                        .addMatch(JsonValue.from(mapOf<String, Any>()))
                        .addSort(JsonValue.from(mapOf<String, Any>()))
                        .addTag(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(viewData.search())
            .contains(
                ViewDataSearch.builder()
                    .addFilter(JsonValue.from(mapOf<String, Any>()))
                    .addMatch(JsonValue.from(mapOf<String, Any>()))
                    .addSort(JsonValue.from(mapOf<String, Any>()))
                    .addTag(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }
}
