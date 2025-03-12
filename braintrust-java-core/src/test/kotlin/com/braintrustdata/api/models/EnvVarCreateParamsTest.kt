// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EnvVarCreateParamsTest {

    @Test
    fun create() {
      EnvVarCreateParams.builder()
          .name("name")
          .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .objectType(EnvVarCreateParams.ObjectType.ORGANIZATION)
          .value("value")
          .build()
    }

    @Test
    fun body() {
      val params = EnvVarCreateParams.builder()
          .name("name")
          .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .objectType(EnvVarCreateParams.ObjectType.ORGANIZATION)
          .value("value")
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.name()).isEqualTo("name")
      assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(body.objectType()).isEqualTo(EnvVarCreateParams.ObjectType.ORGANIZATION)
      assertThat(body.value()).contains("value")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = EnvVarCreateParams.builder()
          .name("name")
          .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .objectType(EnvVarCreateParams.ObjectType.ORGANIZATION)
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.name()).isEqualTo("name")
      assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(body.objectType()).isEqualTo(EnvVarCreateParams.ObjectType.ORGANIZATION)
    }
}
