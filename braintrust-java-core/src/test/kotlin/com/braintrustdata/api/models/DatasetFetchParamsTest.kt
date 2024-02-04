// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetFetchParamsTest {

    @Test
    fun createDatasetFetchParams() {
        DatasetFetchParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .limit(123L)
            .maxRootSpanId("string")
            .maxXactId(123L)
            .version(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            DatasetFetchParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(123L)
                .maxRootSpanId("string")
                .maxXactId(123L)
                .version(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("limit", listOf("123"))
        expected.put("max_root_span_id", listOf("string"))
        expected.put("max_xact_id", listOf("123"))
        expected.put("version", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            DatasetFetchParams.builder().datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            DatasetFetchParams.builder().datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        assertThat(params).isNotNull
        // path param "datasetId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
