// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OrgSecretTest {

    @Test
    fun createOrgSecret() {
        val orgSecret =
            OrgSecret.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(OrgSecret.Metadata.builder().build())
                .previewSecret("preview_secret")
                .type("type")
                .build()
        assertThat(orgSecret).isNotNull
        assertThat(orgSecret.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(orgSecret.name()).isEqualTo("name")
        assertThat(orgSecret.orgId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(orgSecret.created()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(orgSecret.metadata()).contains(OrgSecret.Metadata.builder().build())
        assertThat(orgSecret.previewSecret()).contains("preview_secret")
        assertThat(orgSecret.type()).contains("type")
    }
}
