// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.models.*
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
                .build()
        val topLevelService = client.topLevel()
        val topLevelHelloWorldResponse =
            topLevelService.helloWorld(TopLevelHelloWorldParams.builder().build())
        println(topLevelHelloWorldResponse)
        assertThat(topLevelHelloWorldResponse).isNotBlank()
    }
}
