// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetUpdateParamsTest {

    @Test
    fun create() {
      DatasetUpdateParams.builder()
          .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .description("description")
          .metadata(DatasetUpdateParams.Metadata.builder()
              .putAdditionalProperty("foo", JsonValue.from("bar"))
              .build())
          .name("name")
          .build()
    }

    @Test
    fun body() {
      val params = DatasetUpdateParams.builder()
          .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .description("description")
          .metadata(DatasetUpdateParams.Metadata.builder()
              .putAdditionalProperty("foo", JsonValue.from("bar"))
              .build())
          .name("name")
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.description()).contains("description")
      assertThat(body.metadata()).contains(DatasetUpdateParams.Metadata.builder()
          .putAdditionalProperty("foo", JsonValue.from("bar"))
          .build())
      assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = DatasetUpdateParams.builder()
          .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()

      val body = params._body()

      assertNotNull(body)
    }

    @Test
    fun getPathParam() {
      val params = DatasetUpdateParams.builder()
          .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      assertThat(params).isNotNull
      // path param "datasetId"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
