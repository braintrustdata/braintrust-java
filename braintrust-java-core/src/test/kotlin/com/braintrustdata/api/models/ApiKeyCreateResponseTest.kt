// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ApiKeyCreateResponseTest {

    @Test
    fun createApiKeyCreateResponse() {
        val apiKeyCreateResponse =
            ApiKeyCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .key("key")
                .name("name")
                .previewName("preview_name")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(apiKeyCreateResponse).isNotNull
        assertThat(apiKeyCreateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(apiKeyCreateResponse.key()).isEqualTo("key")
        assertThat(apiKeyCreateResponse.name()).isEqualTo("name")
        assertThat(apiKeyCreateResponse.previewName()).isEqualTo("preview_name")
        assertThat(apiKeyCreateResponse.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyCreateResponse.orgId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(apiKeyCreateResponse.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
