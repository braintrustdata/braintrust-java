// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SpanIframeReplaceParamsTest {

    @Test
    fun create() {
        SpanIframeReplaceParams.builder()
            .name("name")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .url("url")
            .description("description")
            .postMessage(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            SpanIframeReplaceParams.builder()
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .url("url")
                .description("description")
                .postMessage(true)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.url()).isEqualTo("url")
        assertThat(body.description()).contains("description")
        assertThat(body.postMessage()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SpanIframeReplaceParams.builder()
                .name("name")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .url("url")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.projectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.url()).isEqualTo("url")
    }
}
