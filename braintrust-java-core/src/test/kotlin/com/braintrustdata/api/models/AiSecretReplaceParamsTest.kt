// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AiSecretReplaceParamsTest {

    @Test
    fun create() {
        AiSecretReplaceParams.builder()
            .name("name")
            .metadata(
                AiSecretReplaceParams.Metadata.builder()
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
            AiSecretReplaceParams.builder()
                .name("name")
                .metadata(
                    AiSecretReplaceParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .orgName("org_name")
                .secret("secret")
                .type("type")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.metadata())
            .contains(
                AiSecretReplaceParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.orgName()).contains("org_name")
        assertThat(body.secret()).contains("secret")
        assertThat(body.type()).contains("type")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AiSecretReplaceParams.builder().name("name").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("name")
    }
}
