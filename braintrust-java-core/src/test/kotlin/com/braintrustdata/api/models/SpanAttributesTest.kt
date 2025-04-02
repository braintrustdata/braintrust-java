// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpanAttributesTest {

    @Test
    fun create() {
        val spanAttributes = SpanAttributes.builder().name("name").type(SpanType.LLM).build()

        assertThat(spanAttributes.name()).contains("name")
        assertThat(spanAttributes.type()).contains(SpanType.LLM)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val spanAttributes = SpanAttributes.builder().name("name").type(SpanType.LLM).build()

        val roundtrippedSpanAttributes =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(spanAttributes),
                jacksonTypeRef<SpanAttributes>(),
            )

        assertThat(roundtrippedSpanAttributes).isEqualTo(spanAttributes)
    }
}
