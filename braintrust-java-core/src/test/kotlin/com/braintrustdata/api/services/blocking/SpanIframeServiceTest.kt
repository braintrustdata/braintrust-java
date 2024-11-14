// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.models.*
import com.braintrustdata.api.models.SpanIframeListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SpanIframeServiceTest {

    @Test
    fun callCreate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spanIframeService = client.spanIframes()
        val spanIFrame =
            spanIframeService.create(
                SpanIframeCreateParams.builder()
                    .name("name")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .url("url")
                    .description("description")
                    .postMessage(true)
                    .build()
            )
        println(spanIFrame)
        spanIFrame.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spanIframeService = client.spanIframes()
        val spanIFrame =
            spanIframeService.retrieve(
                SpanIframeRetrieveParams.builder()
                    .spanIframeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(spanIFrame)
        spanIFrame.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spanIframeService = client.spanIframes()
        val spanIFrame =
            spanIframeService.update(
                SpanIframeUpdateParams.builder()
                    .spanIframeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .postMessage(true)
                    .url("url")
                    .build()
            )
        println(spanIFrame)
        spanIFrame.validate()
    }

    @Test
    fun callList() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spanIframeService = client.spanIframes()
        val response = spanIframeService.list(SpanIframeListParams.builder().build())
        println(response)
        response.objects().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spanIframeService = client.spanIframes()
        val spanIFrame =
            spanIframeService.delete(
                SpanIframeDeleteParams.builder()
                    .spanIframeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(spanIFrame)
        spanIFrame.validate()
    }

    @Test
    fun callReplace() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val spanIframeService = client.spanIframes()
        val spanIFrame =
            spanIframeService.replace(
                SpanIframeReplaceParams.builder()
                    .name("name")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .url("url")
                    .description("description")
                    .postMessage(true)
                    .build()
            )
        println(spanIFrame)
        spanIFrame.validate()
    }
}
