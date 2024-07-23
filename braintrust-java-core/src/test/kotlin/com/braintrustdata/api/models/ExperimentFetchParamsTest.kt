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
import com.braintrustdata.api.models.ExperimentFetchParams

class ExperimentFetchParamsTest {

    @Test
    fun createExperimentFetchParams() {
      ExperimentFetchParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .limit(123L)
          .maxRootSpanId("max_root_span_id")
          .maxXactId("max_xact_id")
          .version("version")
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = ExperimentFetchParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .limit(123L)
          .maxRootSpanId("max_root_span_id")
          .maxXactId("max_xact_id")
          .version("version")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("limit", listOf("123"))
      expected.put("max_root_span_id", listOf("max_root_span_id"))
      expected.put("max_xact_id", listOf("max_xact_id"))
      expected.put("version", listOf("version"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = ExperimentFetchParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
      val params = ExperimentFetchParams.builder()
          .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .build()
      assertThat(params).isNotNull
      // path param "experimentId"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
