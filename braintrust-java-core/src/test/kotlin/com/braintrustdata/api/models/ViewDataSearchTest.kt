// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ViewDataSearchTest {

    @Test
    fun createViewDataSearch() {
        val viewDataSearch =
            ViewDataSearch.builder()
                .filter(listOf(JsonNull.of()))
                .match(listOf(JsonNull.of()))
                .sort(listOf(JsonNull.of()))
                .tag(listOf(JsonNull.of()))
                .build()
        assertThat(viewDataSearch).isNotNull
        assertThat(viewDataSearch.filter().get()).containsExactly(JsonNull.of())
        assertThat(viewDataSearch.match().get()).containsExactly(JsonNull.of())
        assertThat(viewDataSearch.sort().get()).containsExactly(JsonNull.of())
        assertThat(viewDataSearch.tag().get()).containsExactly(JsonNull.of())
    }
}
