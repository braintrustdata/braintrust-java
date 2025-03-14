// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClientAsync
import com.braintrustdata.api.models.SpanIframeCreateParams
import com.braintrustdata.api.models.SpanIframeDeleteParams
import com.braintrustdata.api.models.SpanIframeReplaceParams
import com.braintrustdata.api.models.SpanIframeRetrieveParams
import com.braintrustdata.api.models.SpanIframeUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SpanIframeServiceAsyncTest {

    @Test
    fun create() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spanIframeServiceAsync = client.spanIframes()

        val spanIFrameFuture =
            spanIframeServiceAsync.create(
                SpanIframeCreateParams.builder()
                    .name("name")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .url("url")
                    .description("description")
                    .postMessage(true)
                    .build()
            )

        val spanIFrame = spanIFrameFuture.get()
        spanIFrame.validate()
    }

    @Test
    fun retrieve() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spanIframeServiceAsync = client.spanIframes()

        val spanIFrameFuture =
            spanIframeServiceAsync.retrieve(
                SpanIframeRetrieveParams.builder()
                    .spanIframeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val spanIFrame = spanIFrameFuture.get()
        spanIFrame.validate()
    }

    @Test
    fun update() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spanIframeServiceAsync = client.spanIframes()

        val spanIFrameFuture =
            spanIframeServiceAsync.update(
                SpanIframeUpdateParams.builder()
                    .spanIframeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .name("name")
                    .postMessage(true)
                    .url("url")
                    .build()
            )

        val spanIFrame = spanIFrameFuture.get()
        spanIFrame.validate()
    }

    @Test
    fun list() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spanIframeServiceAsync = client.spanIframes()

        val pageFuture = spanIframeServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spanIframeServiceAsync = client.spanIframes()

        val spanIFrameFuture =
            spanIframeServiceAsync.delete(
                SpanIframeDeleteParams.builder()
                    .spanIframeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val spanIFrame = spanIFrameFuture.get()
        spanIFrame.validate()
    }

    @Test
    fun replace() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spanIframeServiceAsync = client.spanIframes()

        val spanIFrameFuture =
            spanIframeServiceAsync.replace(
                SpanIframeReplaceParams.builder()
                    .name("name")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .url("url")
                    .description("description")
                    .postMessage(true)
                    .build()
            )

        val spanIFrame = spanIFrameFuture.get()
        spanIFrame.validate()
    }
}
