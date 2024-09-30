// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ViewDataTest {

    @Test
    fun createViewData() {
        val viewData =
            ViewData.builder()
                .search(
                    ViewDataSearch.builder()
                        .filter(listOf(JsonNull.of()))
                        .match(listOf(JsonNull.of()))
                        .sort(listOf(JsonNull.of()))
                        .tag(listOf(JsonNull.of()))
                        .build()
                )
                .build()
        assertThat(viewData).isNotNull
        assertThat(viewData.search())
            .contains(
                ViewDataSearch.builder()
                    .filter(listOf(JsonNull.of()))
                    .match(listOf(JsonNull.of()))
                    .sort(listOf(JsonNull.of()))
                    .tag(listOf(JsonNull.of()))
                    .build()
            )
    }
}
