// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.models.UserListParams
import com.braintrustdata.api.models.UserRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class UserServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.users()
        val user =
            userService.retrieve(
                UserRetrieveParams.builder().userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
        println(user)
        user.validate()
    }

    @Test
    fun callList() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.users()
        val response = userService.list(UserListParams.builder().build())
        println(response)
        response.objects().forEach { it.validate() }
    }
}
