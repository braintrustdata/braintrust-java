// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnvVarUpdateParamsTest {

    @Test
    fun create() {
        EnvVarUpdateParams.builder()
            .envVarId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("name")
            .value("value")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EnvVarUpdateParams.builder()
                .envVarId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EnvVarUpdateParams.builder()
                .envVarId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .value("value")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.value()).contains("value")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EnvVarUpdateParams.builder()
                .envVarId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
