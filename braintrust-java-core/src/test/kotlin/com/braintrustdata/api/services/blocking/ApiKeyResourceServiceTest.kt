// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.models.*
import com.braintrustdata.api.models.ApiKeyResourceListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ApiKeyResourceServiceTest {

    @Test
    fun callCreate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val apiKeyResourceService = client.apiKeyResource()
        val createApiKeyOutput =
            apiKeyResourceService.create(
                ApiKeyResourceCreateParams.builder().name("name").orgName("org_name").build()
            )
        println(createApiKeyOutput)
        createApiKeyOutput.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val apiKeyResourceService = client.apiKeyResource()
        val apiKey =
            apiKeyResourceService.retrieve(
                ApiKeyResourceRetrieveParams.builder()
                    .apiKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(apiKey)
        apiKey.validate()
    }

    @Test
    fun callList() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val apiKeyResourceService = client.apiKeyResource()
        val response = apiKeyResourceService.list(ApiKeyResourceListParams.builder().build())
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
        val apiKeyResourceService = client.apiKeyResource()
        val apiKey =
            apiKeyResourceService.delete(
                ApiKeyResourceDeleteParams.builder()
                    .apiKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(apiKey)
        apiKey.validate()
    }
}
