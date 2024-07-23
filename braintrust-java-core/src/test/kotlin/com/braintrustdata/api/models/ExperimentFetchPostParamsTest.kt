// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.braintrustdata.api.core.ContentTypes
import com.braintrustdata.api.core.JsonNull
import com.braintrustdata.api.core.JsonString
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.MultipartFormValue
import com.braintrustdata.api.models.*
import com.braintrustdata.api.models.ExperimentFetchPostParams
import com.braintrustdata.api.models.ExperimentFetchPostParams.ExperimentFetchPostBody

class ExperimentFetchPostParamsTest {

    @Test
    fun createExperimentFetchPostParams() {
      ExperimentFetchPostParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .cursor("cursor")
          .filters(listOf(ExperimentFetchPostParams.Filter.builder()
              .path(listOf("string"))
              .type(ExperimentFetchPostParams.Filter.Type.PATH_LOOKUP)
              .value(JsonValue.from(mapOf<String, Any>()))
              .build()))
          .limit(123L)
          .maxRootSpanId("max_root_span_id")
          .maxXactId("max_xact_id")
          .version("version")
          .build()
    }

    @Test
    fun getBody() {
      val params = ExperimentFetchPostParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .cursor("cursor")
          .filters(listOf(ExperimentFetchPostParams.Filter.builder()
              .path(listOf("string"))
              .type(ExperimentFetchPostParams.Filter.Type.PATH_LOOKUP)
              .value(JsonValue.from(mapOf<String, Any>()))
              .build()))
          .limit(123L)
          .maxRootSpanId("max_root_span_id")
          .maxXactId("max_xact_id")
          .version("version")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.cursor()).isEqualTo("cursor")
      assertThat(body.filters()).isEqualTo(listOf(ExperimentFetchPostParams.Filter.builder()
          .path(listOf("string"))
          .type(ExperimentFetchPostParams.Filter.Type.PATH_LOOKUP)
          .value(JsonValue.from(mapOf<String, Any>()))
          .build()))
      assertThat(body.limit()).isEqualTo(123L)
      assertThat(body.maxRootSpanId()).isEqualTo("max_root_span_id")
      assertThat(body.maxXactId()).isEqualTo("max_xact_id")
      assertThat(body.version()).isEqualTo("version")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = ExperimentFetchPostParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = ExperimentFetchPostParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      assertThat(params).isNotNull
      // path param "experimentId"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
