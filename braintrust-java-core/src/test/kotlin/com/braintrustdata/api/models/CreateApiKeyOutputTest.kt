// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateApiKeyOutputTest {

    @Test
    fun create() {
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

        assertThat(createApiKeyOutput.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(createApiKeyOutput.key()).isEqualTo("key")
        assertThat(createApiKeyOutput.name()).isEqualTo("name")
        assertThat(createApiKeyOutput.previewName()).isEqualTo("preview_name")
        assertThat(createApiKeyOutput.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(createApiKeyOutput.orgId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(createApiKeyOutput.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedCreateApiKeyOutput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createApiKeyOutput),
                jacksonTypeRef<CreateApiKeyOutput>(),
            )

        assertThat(roundtrippedCreateApiKeyOutput).isEqualTo(createApiKeyOutput)
    }
}
