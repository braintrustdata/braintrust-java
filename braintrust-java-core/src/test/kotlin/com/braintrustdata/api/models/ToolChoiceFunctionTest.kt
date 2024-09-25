// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolChoiceFunctionTest {

    @Test
    fun createToolChoiceFunction() {
        val toolChoiceFunction = ToolChoiceFunction.builder().name("name").build()
        assertThat(toolChoiceFunction).isNotNull
        assertThat(toolChoiceFunction.name()).isEqualTo("name")
    }
}
