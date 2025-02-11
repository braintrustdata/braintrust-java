// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectLogFetchPostParamsTest {

    @Test
    fun create() {
        ProjectLogFetchPostParams.builder()
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .cursor("cursor")
            .limit(0L)
            .maxRootSpanId("max_root_span_id")
            .maxXactId("max_xact_id")
            .version("version")
            .build()
    }

    @Test
    fun body() {
        val params =
            ProjectLogFetchPostParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cursor("cursor")
                .limit(0L)
                .maxRootSpanId("max_root_span_id")
                .maxXactId("max_xact_id")
                .version("version")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.cursor()).contains("cursor")
        assertThat(body.limit()).contains(0L)
        assertThat(body.maxRootSpanId()).contains("max_root_span_id")
        assertThat(body.maxXactId()).contains("max_xact_id")
        assertThat(body.version()).contains("version")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProjectLogFetchPostParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            ProjectLogFetchPostParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "projectId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
