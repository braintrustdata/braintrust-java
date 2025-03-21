// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetFetchPostParamsTest {

    @Test
    fun create() {
        DatasetFetchPostParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .cursor("cursor")
            .limit(0L)
            .maxRootSpanId("max_root_span_id")
            .maxXactId("max_xact_id")
            .version("version")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DatasetFetchPostParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DatasetFetchPostParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cursor("cursor")
                .limit(0L)
                .maxRootSpanId("max_root_span_id")
                .maxXactId("max_xact_id")
                .version("version")
                .build()

        val body = params._body()

        assertThat(body.cursor()).contains("cursor")
        assertThat(body.limit()).contains(0L)
        assertThat(body.maxRootSpanId()).contains("max_root_span_id")
        assertThat(body.maxXactId()).contains("max_xact_id")
        assertThat(body.version()).contains("version")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DatasetFetchPostParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
