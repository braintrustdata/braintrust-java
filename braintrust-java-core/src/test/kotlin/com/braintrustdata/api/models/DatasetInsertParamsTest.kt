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
import com.braintrustdata.api.models.DatasetInsertParams
import com.braintrustdata.api.models.DatasetInsertParams.DatasetInsertBody

class DatasetInsertParamsTest {

    @Test
    fun createDatasetInsertParams() {
      DatasetInsertParams.builder()
          .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .events(listOf(DatasetInsertParams.Event.ofInsertDatasetEventReplace(DatasetInsertParams.Event.InsertDatasetEventReplace.builder()
              .id("string")
              ._isMerge(true)
              ._objectDelete(true)
              ._parentId("string")
              .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .expected(JsonValue.from(mapOf<String, Any>()))
              .input(JsonValue.from(mapOf<String, Any>()))
              .metadata(DatasetInsertParams.Event.InsertDatasetEventReplace.Metadata.builder().build())
              .tags(listOf("string"))
              .build())))
          .build()
    }

    @Test
    fun getBody() {
      val params = DatasetInsertParams.builder()
          .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .events(listOf(DatasetInsertParams.Event.ofInsertDatasetEventReplace(DatasetInsertParams.Event.InsertDatasetEventReplace.builder()
              .id("string")
              ._isMerge(true)
              ._objectDelete(true)
              ._parentId("string")
              .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .expected(JsonValue.from(mapOf<String, Any>()))
              .input(JsonValue.from(mapOf<String, Any>()))
              .metadata(DatasetInsertParams.Event.InsertDatasetEventReplace.Metadata.builder().build())
              .tags(listOf("string"))
              .build())))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.events()).isEqualTo(listOf(DatasetInsertParams.Event.ofInsertDatasetEventReplace(DatasetInsertParams.Event.InsertDatasetEventReplace.builder()
          .id("string")
          ._isMerge(true)
          ._objectDelete(true)
          ._parentId("string")
          .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .expected(JsonValue.from(mapOf<String, Any>()))
          .input(JsonValue.from(mapOf<String, Any>()))
          .metadata(DatasetInsertParams.Event.InsertDatasetEventReplace.Metadata.builder().build())
          .tags(listOf("string"))
          .build())))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = DatasetInsertParams.builder()
          .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .events(listOf(DatasetInsertParams.Event.ofInsertDatasetEventReplace(DatasetInsertParams.Event.InsertDatasetEventReplace.builder().build())))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.events()).isEqualTo(listOf(DatasetInsertParams.Event.ofInsertDatasetEventReplace(DatasetInsertParams.Event.InsertDatasetEventReplace.builder().build())))
    }

    @Test
    fun getPathParam() {
      val params = DatasetInsertParams.builder()
          .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .events(listOf(DatasetInsertParams.Event.ofInsertDatasetEventReplace(DatasetInsertParams.Event.InsertDatasetEventReplace.builder().build())))
          .build()
      assertThat(params).isNotNull
      // path param "datasetId"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
