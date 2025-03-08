// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AISecretTest {

    @Test
    fun createAISecret() {
        val aiSecret =
            AISecret.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    AISecret.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .previewSecret("preview_secret")
                .type("type")
                .build()
        assertThat(aiSecret).isNotNull
        assertThat(aiSecret.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(aiSecret.name()).isEqualTo("name")
        assertThat(aiSecret.orgId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(aiSecret.created()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(aiSecret.metadata())
            .contains(
                AISecret.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(aiSecret.previewSecret()).contains("preview_secret")
        assertThat(aiSecret.type()).contains("type")
    }
}
