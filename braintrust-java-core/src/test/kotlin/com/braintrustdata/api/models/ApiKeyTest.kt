// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ApiKeyTest {

    @Test
    fun createApiKey() {
      val apiKey = ApiKey.builder()
          .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .name("name")
          .previewName("preview_name")
          .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      assertThat(apiKey).isNotNull
      assertThat(apiKey.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(apiKey.name()).isEqualTo("name")
      assertThat(apiKey.previewName()).isEqualTo("preview_name")
      assertThat(apiKey.created()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(apiKey.orgId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(apiKey.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
