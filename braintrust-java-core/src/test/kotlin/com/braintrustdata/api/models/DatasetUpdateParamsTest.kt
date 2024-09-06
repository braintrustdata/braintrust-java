// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetUpdateParamsTest {

    @Test
    fun createDatasetUpdateParams() {
        DatasetUpdateParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .metadata(DatasetUpdateParams.Metadata.builder().build())
            .name("name")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DatasetUpdateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .metadata(DatasetUpdateParams.Metadata.builder().build())
                .name("name")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.metadata()).isEqualTo(DatasetUpdateParams.Metadata.builder().build())
        assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DatasetUpdateParams.builder().datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            DatasetUpdateParams.builder().datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        assertThat(params).isNotNull
        // path param "datasetId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
