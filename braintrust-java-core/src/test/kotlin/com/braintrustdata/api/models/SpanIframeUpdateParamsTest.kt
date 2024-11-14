// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SpanIframeUpdateParamsTest {

    @Test
    fun createSpanIframeUpdateParams() {
        SpanIframeUpdateParams.builder()
            .spanIframeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("name")
            .postMessage(true)
            .url("url")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SpanIframeUpdateParams.builder()
                .spanIframeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .postMessage(true)
                .url("url")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.postMessage()).isEqualTo(true)
        assertThat(body.url()).isEqualTo("url")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SpanIframeUpdateParams.builder()
                .spanIframeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            SpanIframeUpdateParams.builder()
                .spanIframeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "spanIframeId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
