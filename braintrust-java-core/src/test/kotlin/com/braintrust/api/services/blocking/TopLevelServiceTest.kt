// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.services.blocking

import com.braintrust.api.TestServerExtension
import com.braintrust.api.client.okhttp.BraintrustOkHttpClient
import com.braintrust.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TopLevelServiceTest {

    @Test
    fun callHelloWorld() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .baseUrl("My Base URL")
                .build()
        val topLevelService = client.topLevel()
        val topLevelHelloWorldResponse =
            topLevelService.helloWorld(TopLevelHelloWorldParams.builder().build())
        println(topLevelHelloWorldResponse)
        assertThat(topLevelHelloWorldResponse).isNotBlank()
    }
}
