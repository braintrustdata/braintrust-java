// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ViewDataSearchTest {

    @Test
    fun create() {
        val viewDataSearch =
            ViewDataSearch.builder()
                .addFilter(JsonValue.from(mapOf<String, Any>()))
                .addMatch(JsonValue.from(mapOf<String, Any>()))
                .addSort(JsonValue.from(mapOf<String, Any>()))
                .addTag(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(viewDataSearch.filter().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(viewDataSearch.match().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(viewDataSearch.sort().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(viewDataSearch.tag().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
    }
}
