// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ViewDataTest {

    @Test
    fun createViewData() {
        val viewData =
            ViewData.builder()
                .search(
                    ViewDataSearch.builder()
                        .filter(listOf(JsonValue.from(mapOf<String, Any>())))
                        .match(listOf(JsonValue.from(mapOf<String, Any>())))
                        .sort(listOf(JsonValue.from(mapOf<String, Any>())))
                        .tag(listOf(JsonValue.from(mapOf<String, Any>())))
                        .build()
                )
                .build()
        assertThat(viewData).isNotNull
        assertThat(viewData.search())
            .contains(
                ViewDataSearch.builder()
                    .filter(listOf(JsonValue.from(mapOf<String, Any>())))
                    .match(listOf(JsonValue.from(mapOf<String, Any>())))
                    .sort(listOf(JsonValue.from(mapOf<String, Any>())))
                    .tag(listOf(JsonValue.from(mapOf<String, Any>())))
                    .build()
            )
    }
}
