// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EnvVarListResponseTest {

    @Test
    fun createEnvVarListResponse() {
      val envVarListResponse = EnvVarListResponse.builder()
          .addObject(EnvVar.builder()
              .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .name("name")
              .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .objectType(EnvVar.ObjectType.ORGANIZATION)
              .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .used(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .build()
      assertThat(envVarListResponse).isNotNull
      assertThat(envVarListResponse.objects()).containsExactly(EnvVar.builder()
          .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .name("name")
          .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .objectType(EnvVar.ObjectType.ORGANIZATION)
          .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .used(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())
    }
}
