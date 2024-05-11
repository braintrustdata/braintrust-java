// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.core.JsonValue
import com.braintrust.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExperimentFetchPostParamsTest {

    @Test
    fun createExperimentFetchPostParams() {
        ExperimentFetchPostParams.builder()
            .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .cursor("string")
            .filters(
                listOf(
                    ExperimentFetchPostParams.Filter.builder()
                        .path(listOf("string"))
                        .type(ExperimentFetchPostParams.Filter.Type.PATH_LOOKUP)
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
            ExperimentFetchPostParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cursor("string")
                .filters(
                    listOf(
                        ExperimentFetchPostParams.Filter.builder()
                            .path(listOf("string"))
                            .type(ExperimentFetchPostParams.Filter.Type.PATH_LOOKUP)
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
                    ExperimentFetchPostParams.Filter.builder()
                        .path(listOf("string"))
                        .type(ExperimentFetchPostParams.Filter.Type.PATH_LOOKUP)
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
            ExperimentFetchPostParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            ExperimentFetchPostParams.builder()
                .experimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "experimentId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
