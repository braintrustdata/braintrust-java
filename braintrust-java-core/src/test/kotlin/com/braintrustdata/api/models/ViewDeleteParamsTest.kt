// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ViewDeleteParamsTest {

    @Test
    fun create() {
      ViewDeleteParams.builder()
          .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .objectType(ViewDeleteParams.ObjectType.ORGANIZATION)
          .build()
    }

    @Test
    fun body() {
      val params = ViewDeleteParams.builder()
          .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .objectType(ViewDeleteParams.ObjectType.ORGANIZATION)
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(body.objectType()).isEqualTo(ViewDeleteParams.ObjectType.ORGANIZATION)
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = ViewDeleteParams.builder()
          .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .objectType(ViewDeleteParams.ObjectType.ORGANIZATION)
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      assertThat(body.objectType()).isEqualTo(ViewDeleteParams.ObjectType.ORGANIZATION)
    }

    @Test
    fun getPathParam() {
      val params = ViewDeleteParams.builder()
          .viewId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .objectType(ViewDeleteParams.ObjectType.ORGANIZATION)
          .build()
      assertThat(params).isNotNull
      // path param "viewId"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
