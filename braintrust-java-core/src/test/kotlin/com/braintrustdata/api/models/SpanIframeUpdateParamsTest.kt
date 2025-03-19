// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpanIframeUpdateParamsTest {

    @Test
    fun create() {
        SpanIframeUpdateParams.builder()
            .spanIframeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .name("name")
            .postMessage(true)
            .url("url")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SpanIframeUpdateParams.builder()
                .spanIframeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SpanIframeUpdateParams.builder()
                .spanIframeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .name("name")
                .postMessage(true)
                .url("url")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("name")
        assertThat(body.postMessage()).contains(true)
        assertThat(body.url()).contains("url")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SpanIframeUpdateParams.builder()
                .spanIframeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertNotNull(body)
    }
}
