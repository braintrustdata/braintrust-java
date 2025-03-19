// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationTest {

    @Test
    fun create() {
        val organization =
            Organization.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .apiUrl("api_url")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isUniversalApi(true)
                .proxyUrl("proxy_url")
                .realtimeUrl("realtime_url")
                .build()

        assertThat(organization.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(organization.name()).isEqualTo("name")
        assertThat(organization.apiUrl()).contains("api_url")
        assertThat(organization.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(organization.isUniversalApi()).contains(true)
        assertThat(organization.proxyUrl()).contains("proxy_url")
        assertThat(organization.realtimeUrl()).contains("realtime_url")
    }
}
