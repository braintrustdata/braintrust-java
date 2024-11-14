// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetCreateParamsTest {

    @Test
    fun createDatasetCreateParams() {
        DatasetCreateParams.builder()
            .name("x")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .metadata(DatasetCreateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DatasetCreateParams.builder()
                .name("x")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .metadata(DatasetCreateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.metadata()).isEqualTo(DatasetCreateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DatasetCreateParams.builder()
                .name("x")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
