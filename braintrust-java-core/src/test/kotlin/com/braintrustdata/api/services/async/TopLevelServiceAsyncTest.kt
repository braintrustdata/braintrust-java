// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TopLevelServiceAsyncTest {

    @Test
    fun helloWorld() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val topLevelServiceAsync = client.topLevel()

        val responseFuture = topLevelServiceAsync.helloWorld()

        val response = responseFuture.get()
    }
}
