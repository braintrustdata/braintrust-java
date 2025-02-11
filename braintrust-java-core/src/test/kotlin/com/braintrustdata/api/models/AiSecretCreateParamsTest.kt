// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AiSecretCreateParamsTest {

    @Test
    fun create() {
        AiSecretCreateParams.builder()
            .name("name")
            .metadata(
                AiSecretCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .orgName("org_name")
            .secret("secret")
            .type("type")
            .build()
    }

    @Test
    fun body() {
        val params =
            AiSecretCreateParams.builder()
                .name("name")
                .metadata(
                    AiSecretCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .orgName("org_name")
                .secret("secret")
                .type("type")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.metadata())
            .contains(
                AiSecretCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.orgName()).contains("org_name")
        assertThat(body.secret()).contains("secret")
        assertThat(body.type()).contains("type")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AiSecretCreateParams.builder().name("name").build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
    }
}
