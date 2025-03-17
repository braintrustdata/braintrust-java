// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpanAttributesTest {

    @Test
    fun createSpanAttributes() {
        val spanAttributes = SpanAttributes.builder().name("name").type(SpanType.LLM).build()
        assertThat(spanAttributes).isNotNull
        assertThat(spanAttributes.name()).contains("name")
        assertThat(spanAttributes.type()).contains(SpanType.LLM)
    }
}
