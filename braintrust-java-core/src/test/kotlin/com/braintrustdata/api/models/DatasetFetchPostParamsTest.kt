// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetFetchPostParamsTest {

    @Test
    fun createDatasetFetchPostParams() {
        DatasetFetchPostParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .cursor("string")
            .filters(
                listOf(
                    DatasetFetchPostParams.Filter.builder()
                        .path(listOf("string"))
                        .type(DatasetFetchPostParams.Filter.Type.PATH_LOOKUP)
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
            )
            .limit(123L)
            .maxRootSpanId("string")
            .maxXactId("string")
            .version("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DatasetFetchPostParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cursor("string")
                .filters(
                    listOf(
                        DatasetFetchPostParams.Filter.builder()
                            .path(listOf("string"))
                            .type(DatasetFetchPostParams.Filter.Type.PATH_LOOKUP)
                            .value(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                )
                .limit(123L)
                .maxRootSpanId("string")
                .maxXactId("string")
                .version("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cursor()).isEqualTo("string")
        assertThat(body.filters())
            .isEqualTo(
                listOf(
                    DatasetFetchPostParams.Filter.builder()
                        .path(listOf("string"))
                        .type(DatasetFetchPostParams.Filter.Type.PATH_LOOKUP)
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
            )
        assertThat(body.limit()).isEqualTo(123L)
        assertThat(body.maxRootSpanId()).isEqualTo("string")
        assertThat(body.maxXactId()).isEqualTo("string")
        assertThat(body.version()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DatasetFetchPostParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            DatasetFetchPostParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "datasetId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
