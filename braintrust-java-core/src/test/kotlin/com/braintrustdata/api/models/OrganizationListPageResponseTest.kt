// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationListPageResponseTest {

    @Test
    fun create() {
        val organizationListPageResponse =
            OrganizationListPageResponse.builder()
                .addObject(
                    Organization.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .apiUrl("api_url")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isUniversalApi(true)
                        .proxyUrl("proxy_url")
                        .realtimeUrl("realtime_url")
                        .build()
                )
                .build()

        assertThat(organizationListPageResponse.objects())
            .containsExactly(
                Organization.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .apiUrl("api_url")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isUniversalApi(true)
                    .proxyUrl("proxy_url")
                    .realtimeUrl("realtime_url")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val organizationListPageResponse =
            OrganizationListPageResponse.builder()
                .addObject(
                    Organization.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .apiUrl("api_url")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isUniversalApi(true)
                        .proxyUrl("proxy_url")
                        .realtimeUrl("realtime_url")
                        .build()
                )
                .build()

        val roundtrippedOrganizationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(organizationListPageResponse),
                jacksonTypeRef<OrganizationListPageResponse>(),
            )

        assertThat(roundtrippedOrganizationListPageResponse).isEqualTo(organizationListPageResponse)
    }
}
