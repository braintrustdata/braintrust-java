// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PatchOrganizationTest {

    @Test
    fun createPatchOrganization() {
        val patchOrganization =
            PatchOrganization.builder()
                .apiUrl("api_url")
                .isUniversalApi(true)
                .name("name")
                .proxyUrl("proxy_url")
                .realtimeUrl("realtime_url")
                .build()
        assertThat(patchOrganization).isNotNull
        assertThat(patchOrganization.apiUrl()).contains("api_url")
        assertThat(patchOrganization.isUniversalApi()).contains(true)
        assertThat(patchOrganization.name()).contains("name")
        assertThat(patchOrganization.proxyUrl()).contains("proxy_url")
        assertThat(patchOrganization.realtimeUrl()).contains("realtime_url")
    }
}
