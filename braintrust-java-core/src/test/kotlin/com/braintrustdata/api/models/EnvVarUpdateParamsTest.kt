// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EnvVarUpdateParamsTest {

    @Test
    fun createEnvVarUpdateParams() {
        EnvVarUpdateParams.builder()
            .envVarId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("name")
            .value("value")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EnvVarUpdateParams.builder()
                .envVarId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .value("value")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.value()).isEqualTo("value")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EnvVarUpdateParams.builder()
                .envVarId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun getPathParam() {
        val params =
            EnvVarUpdateParams.builder()
                .envVarId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .build()
        assertThat(params).isNotNull
        // path param "envVarId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
