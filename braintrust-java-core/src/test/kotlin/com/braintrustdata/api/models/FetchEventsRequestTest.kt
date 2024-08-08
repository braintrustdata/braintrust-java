// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FetchEventsRequestTest {

    @Test
    fun createFetchEventsRequest() {
        val fetchEventsRequest =
            FetchEventsRequest.builder()
                .cursor("cursor")
                .filters(
                    listOf(
                        PathLookupFilter.builder()
                            .path(listOf("string"))
                            .type(PathLookupFilter.Type.PATH_LOOKUP)
                            .value(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                )
                .limit(123L)
                .maxRootSpanId("max_root_span_id")
                .maxXactId("max_xact_id")
                .version("version")
                .build()
        assertThat(fetchEventsRequest).isNotNull
        assertThat(fetchEventsRequest.cursor()).contains("cursor")
        assertThat(fetchEventsRequest.filters().get())
            .containsExactly(
                PathLookupFilter.builder()
                    .path(listOf("string"))
                    .type(PathLookupFilter.Type.PATH_LOOKUP)
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(fetchEventsRequest.limit()).contains(123L)
        assertThat(fetchEventsRequest.maxRootSpanId()).contains("max_root_span_id")
        assertThat(fetchEventsRequest.maxXactId()).contains("max_xact_id")
        assertThat(fetchEventsRequest.version()).contains("version")
    }
}
