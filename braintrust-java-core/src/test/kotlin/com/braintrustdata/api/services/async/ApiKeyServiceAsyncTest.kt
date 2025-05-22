// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClientAsync
import com.braintrustdata.api.models.ApiKeyCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ApiKeyServiceAsyncTest {

    @Test
    fun create() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val apiKeyServiceAsync = client.apiKeys()

        val createApiKeyOutputFuture =
            apiKeyServiceAsync.create(
                ApiKeyCreateParams.builder().name("name").orgName("org_name").build()
            )

        val createApiKeyOutput = createApiKeyOutputFuture.get()
        createApiKeyOutput.validate()
    }

    @Test
    fun retrieve() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val apiKeyServiceAsync = client.apiKeys()

        val apiKeyFuture = apiKeyServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val apiKey = apiKeyFuture.get()
        apiKey.validate()
    }

    @Test
    fun list() {
        val client =
            BraintrustOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val apiKeyServiceAsync = client.apiKeys()

        val pageFuture = apiKeyServiceAsync.list()

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
        val apiKeyServiceAsync = client.apiKeys()

        val apiKeyFuture = apiKeyServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val apiKey = apiKeyFuture.get()
        apiKey.validate()
    }
}
