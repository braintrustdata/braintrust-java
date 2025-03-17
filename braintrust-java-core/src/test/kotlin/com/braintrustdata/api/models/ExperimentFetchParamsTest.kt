// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExperimentFetchParamsTest {

    @Test
    fun create() {
        ExperimentFetchParams.builder()
            .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .limit(0L)
            .maxRootSpanId("max_root_span_id")
            .maxXactId("max_xact_id")
            .version("version")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ExperimentFetchParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(0L)
                .maxRootSpanId("max_root_span_id")
                .maxXactId("max_xact_id")
                .version("version")
                .build()
        val expected = QueryParams.builder()
        expected.put("limit", "0")
        expected.put("max_root_span_id", "max_root_span_id")
        expected.put("max_xact_id", "max_xact_id")
        expected.put("version", "version")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ExperimentFetchParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            ExperimentFetchParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "experimentId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
