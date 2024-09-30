// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EnvVarServiceTest {

    @Test
    fun callCreate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val envVarService = client.envVars()
        val envVar =
            envVarService.create(
                EnvVarCreateParams.builder()
                    .name("name")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(EnvVarCreateParams.ObjectType.ORGANIZATION)
                    .value("value")
                    .build()
            )
        println(envVar)
        envVar.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val envVarService = client.envVars()
        val envVar =
            envVarService.retrieve(
                EnvVarRetrieveParams.builder()
                    .envVarId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(envVar)
        envVar.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val envVarService = client.envVars()
        val envVar =
            envVarService.update(
                EnvVarUpdateParams.builder()
                    .envVarId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .value("value")
                    .build()
            )
        println(envVar)
        envVar.validate()
    }

    @Test
    fun callList() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val envVarService = client.envVars()
        val envVarListResponse =
            envVarService.list(
                EnvVarListParams.builder()
                    .envVarName("env_var_name")
                    .ids(EnvVarListParams.Ids.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .limit(123L)
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(EnvVarListParams.ObjectType.ORGANIZATION)
                    .build()
            )
        println(envVarListResponse)
        envVarListResponse.validate()
    }

    @Test
    fun callDelete() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val envVarService = client.envVars()
        val envVar =
            envVarService.delete(
                EnvVarDeleteParams.builder()
                    .envVarId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(envVar)
        envVar.validate()
    }

    @Test
    fun callReplace() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val envVarService = client.envVars()
        val envVar =
            envVarService.replace(
                EnvVarReplaceParams.builder()
                    .name("name")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(EnvVarReplaceParams.ObjectType.ORGANIZATION)
                    .value("value")
                    .build()
            )
        println(envVar)
        envVar.validate()
    }
}
