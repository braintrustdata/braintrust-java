// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiSecretUpdateParamsTest {

    @Test
    fun create() {
        AiSecretUpdateParams.builder()
            .aiSecretId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .metadata(
                AiSecretUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .name("name")
            .secret("secret")
            .type("type")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AiSecretUpdateParams.builder()
                .aiSecretId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AiSecretUpdateParams.builder()
                .aiSecretId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(
                    AiSecretUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .secret("secret")
                .type("type")
                .build()

        val body = params._body()

        assertThat(body.metadata())
            .contains(
                AiSecretUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.name()).contains("name")
        assertThat(body.secret()).contains("secret")
        assertThat(body.type()).contains("type")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AiSecretUpdateParams.builder()
                .aiSecretId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
