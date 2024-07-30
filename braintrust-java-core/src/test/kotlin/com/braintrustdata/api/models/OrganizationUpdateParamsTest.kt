// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OrganizationUpdateParamsTest {

    @Test
    fun createOrganizationUpdateParams() {
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
    fun getBody() {
        val params =
            OrganizationUpdateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .apiUrl("api_url")
                .isUniversalApi(true)
                .name("name")
                .proxyUrl("proxy_url")
                .realtimeUrl("realtime_url")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.apiUrl()).isEqualTo("api_url")
        assertThat(body.isUniversalApi()).isEqualTo(true)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.proxyUrl()).isEqualTo("proxy_url")
        assertThat(body.realtimeUrl()).isEqualTo("realtime_url")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            OrganizationUpdateParams.builder()
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
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
