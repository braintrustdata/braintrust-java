// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnvVarTest {

    @Test
    fun create() {
        val envVar =
            EnvVar.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(EnvVar.ObjectType.ORGANIZATION)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .used(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(envVar.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(envVar.name()).isEqualTo("name")
        assertThat(envVar.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(envVar.objectType()).isEqualTo(EnvVar.ObjectType.ORGANIZATION)
        assertThat(envVar.created()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(envVar.used()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
