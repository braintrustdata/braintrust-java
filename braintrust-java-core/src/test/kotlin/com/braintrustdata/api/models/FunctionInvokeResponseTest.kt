// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionInvokeResponseTest {

    @Test
    fun create() {
        val functionInvokeResponse = FunctionInvokeResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val functionInvokeResponse = FunctionInvokeResponse.builder().build()

        val roundtrippedFunctionInvokeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(functionInvokeResponse),
                jacksonTypeRef<FunctionInvokeResponse>(),
            )

        assertThat(roundtrippedFunctionInvokeResponse).isEqualTo(functionInvokeResponse)
    }
}
