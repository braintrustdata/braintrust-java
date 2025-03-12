// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetCreateParamsTest {

    @Test
    fun create() {
      DatasetCreateParams.builder()
          .name("x")
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .description("description")
          .metadata(DatasetCreateParams.Metadata.builder()
              .putAdditionalProperty("foo", JsonValue.from("bar"))
              .build())
          .build()
    }

    @Test
    fun body() {
      val params = DatasetCreateParams.builder()
          .name("x")
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .description("description")
          .metadata(DatasetCreateParams.Metadata.builder()
              .putAdditionalProperty("foo", JsonValue.from("bar"))
              .build())
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.name()).isEqualTo("x")
      assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(body.description()).contains("description")
      assertThat(body.metadata()).contains(DatasetCreateParams.Metadata.builder()
          .putAdditionalProperty("foo", JsonValue.from("bar"))
          .build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = DatasetCreateParams.builder()
          .name("x")
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.name()).isEqualTo("x")
      assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
