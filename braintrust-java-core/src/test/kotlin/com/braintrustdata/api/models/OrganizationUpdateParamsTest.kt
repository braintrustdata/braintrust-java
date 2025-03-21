// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationUpdateParamsTest {

    @Test
    fun create() {
        OrganizationUpdateParams.builder()
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .apiUrl("api_url")
            .isUniversalApi(true)
            .name("name")
            .proxyUrl("proxy_url")
            .realtimeUrl("realtime_url")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            OrganizationUpdateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            OrganizationUpdateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .apiUrl("api_url")
                .isUniversalApi(true)
                .name("name")
                .proxyUrl("proxy_url")
                .realtimeUrl("realtime_url")
                .build()

        val body = params._body()

        assertThat(body.apiUrl()).contains("api_url")
        assertThat(body.isUniversalApi()).contains(true)
        assertThat(body.name()).contains("name")
        assertThat(body.proxyUrl()).contains("proxy_url")
        assertThat(body.realtimeUrl()).contains("realtime_url")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OrganizationUpdateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
