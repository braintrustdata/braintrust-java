// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateApiKeyOutputTest {

    @Test
    fun createCreateApiKeyOutput() {
        val createApiKeyOutput =
            CreateApiKeyOutput.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .key("key")
                .name("name")
                .previewName("preview_name")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(createApiKeyOutput).isNotNull
        assertThat(createApiKeyOutput.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(createApiKeyOutput.key()).isEqualTo("key")
        assertThat(createApiKeyOutput.name()).isEqualTo("name")
        assertThat(createApiKeyOutput.previewName()).isEqualTo("preview_name")
        assertThat(createApiKeyOutput.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(createApiKeyOutput.orgId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(createApiKeyOutput.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
