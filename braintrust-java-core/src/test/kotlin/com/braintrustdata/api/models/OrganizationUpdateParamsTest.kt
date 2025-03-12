// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OrganizationUpdateParamsTest {

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

        assertNotNull(body)
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

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params =
            OrganizationUpdateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "organizationId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
