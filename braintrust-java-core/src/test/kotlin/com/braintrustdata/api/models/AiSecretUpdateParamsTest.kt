// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AiSecretUpdateParamsTest {

    @Test
    fun createAiSecretUpdateParams() {
        AiSecretUpdateParams.builder()
            .aiSecretId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .metadata(AiSecretUpdateParams.Metadata.builder().build())
            .name("name")
            .secret("secret")
            .type("type")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AiSecretUpdateParams.builder()
                .aiSecretId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(AiSecretUpdateParams.Metadata.builder().build())
                .name("name")
                .secret("secret")
                .type("type")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.metadata()).isEqualTo(AiSecretUpdateParams.Metadata.builder().build())
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.secret()).isEqualTo("secret")
        assertThat(body.type()).isEqualTo("type")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AiSecretUpdateParams.builder()
                .aiSecretId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            AiSecretUpdateParams.builder()
                .aiSecretId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "aiSecretId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
