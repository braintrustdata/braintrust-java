// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FunctionToolChoiceTest {

    @Test
    fun createFunctionToolChoice() {
        val functionToolChoice = FunctionToolChoice.builder().name("name").build()
        assertThat(functionToolChoice).isNotNull
        assertThat(functionToolChoice.name()).isEqualTo("name")
    }
}
