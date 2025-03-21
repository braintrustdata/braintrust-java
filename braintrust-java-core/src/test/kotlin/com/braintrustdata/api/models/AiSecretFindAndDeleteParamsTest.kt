// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiSecretFindAndDeleteParamsTest {

    @Test
    fun create() {
        AiSecretFindAndDeleteParams.builder().name("name").orgName("org_name").build()
    }

    @Test
    fun body() {
        val params = AiSecretFindAndDeleteParams.builder().name("name").orgName("org_name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.orgName()).contains("org_name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AiSecretFindAndDeleteParams.builder().name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
