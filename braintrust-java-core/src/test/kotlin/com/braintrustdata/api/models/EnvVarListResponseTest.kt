// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnvVarListResponseTest {

    @Test
    fun create() {
        val envVarListResponse =
            EnvVarListResponse.builder()
                .addObject(
                    EnvVar.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .objectType(EnvVar.ObjectType.ORGANIZATION)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .used(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(envVarListResponse.objects())
            .containsExactly(
                EnvVar.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(EnvVar.ObjectType.ORGANIZATION)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .used(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val envVarListResponse =
            EnvVarListResponse.builder()
                .addObject(
                    EnvVar.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .objectType(EnvVar.ObjectType.ORGANIZATION)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .used(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedEnvVarListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(envVarListResponse),
                jacksonTypeRef<EnvVarListResponse>(),
            )

        assertThat(roundtrippedEnvVarListResponse).isEqualTo(envVarListResponse)
    }
}
