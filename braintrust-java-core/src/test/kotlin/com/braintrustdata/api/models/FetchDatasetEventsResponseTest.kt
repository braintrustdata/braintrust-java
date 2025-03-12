// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FetchDatasetEventsResponseTest {

    @Test
    fun createFetchDatasetEventsResponse() {
      val fetchDatasetEventsResponse = FetchDatasetEventsResponse.builder()
          .addEvent(DatasetEvent.builder()
              .id("id")
              ._xactId("_xact_id")
              .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .rootSpanId("root_span_id")
              .spanId("span_id")
              .expected(JsonValue.from(mapOf<String, Any>()))
              .input(JsonValue.from(mapOf<String, Any>()))
              .isRoot(true)
              .metadata(DatasetEvent.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("bar"))
                  .build())
              .origin(DatasetEvent.Origin.builder()
                  .id("id")
                  ._xactId("_xact_id")
                  .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                  .objectType(DatasetEvent.Origin.ObjectType.EXPERIMENT)
                  .build())
              .addTag("string")
              .build())
          .cursor("cursor")
          .build()
      assertThat(fetchDatasetEventsResponse).isNotNull
      assertThat(fetchDatasetEventsResponse.events()).containsExactly(DatasetEvent.builder()
          .id("id")
          ._xactId("_xact_id")
          .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .rootSpanId("root_span_id")
          .spanId("span_id")
          .expected(JsonValue.from(mapOf<String, Any>()))
          .input(JsonValue.from(mapOf<String, Any>()))
          .isRoot(true)
          .metadata(DatasetEvent.Metadata.builder()
              .putAdditionalProperty("foo", JsonValue.from("bar"))
              .build())
          .origin(DatasetEvent.Origin.builder()
              .id("id")
              ._xactId("_xact_id")
              .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
              .objectType(DatasetEvent.Origin.ObjectType.EXPERIMENT)
              .build())
          .addTag("string")
          .build())
      assertThat(fetchDatasetEventsResponse.cursor()).contains("cursor")
    }
}
