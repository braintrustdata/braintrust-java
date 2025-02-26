// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.models.AiSecretCreateParams
import com.braintrustdata.api.models.AiSecretDeleteParams
import com.braintrustdata.api.models.AiSecretFindAndDeleteParams
import com.braintrustdata.api.models.AiSecretReplaceParams
import com.braintrustdata.api.models.AiSecretRetrieveParams
import com.braintrustdata.api.models.AiSecretUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AiSecretServiceTest {

    @Test
    fun callCreate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val aiSecretService = client.aiSecrets()
        val aISecret =
            aiSecretService.create(
                AiSecretCreateParams.builder()
                    .name("name")
                    .metadata(
                        AiSecretCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .orgName("org_name")
                    .secret("secret")
                    .type("type")
                    .build()
            )
        println(aISecret)
        aISecret.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val aiSecretService = client.aiSecrets()
        val aISecret =
            aiSecretService.retrieve(
                AiSecretRetrieveParams.builder()
                    .aiSecretId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(aISecret)
        aISecret.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val aiSecretService = client.aiSecrets()
        val aISecret =
            aiSecretService.update(
                AiSecretUpdateParams.builder()
                    .aiSecretId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(
                        AiSecretUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .name("name")
                    .secret("secret")
                    .type("type")
                    .build()
            )
        println(aISecret)
        aISecret.validate()
    }

    @Test
    fun callList() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val aiSecretService = client.aiSecrets()
        val response = aiSecretService.list()
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
        val aiSecretService = client.aiSecrets()
        val aISecret =
            aiSecretService.delete(
                AiSecretDeleteParams.builder()
                    .aiSecretId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(aISecret)
        aISecret.validate()
    }

    @Test
    fun callFindAndDelete() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val aiSecretService = client.aiSecrets()
        val aISecret =
            aiSecretService.findAndDelete(
                AiSecretFindAndDeleteParams.builder().name("name").orgName("org_name").build()
            )
        println(aISecret)
        aISecret.validate()
    }

    @Test
    fun callReplace() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val aiSecretService = client.aiSecrets()
        val aISecret =
            aiSecretService.replace(
                AiSecretReplaceParams.builder()
                    .name("name")
                    .metadata(
                        AiSecretReplaceParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .orgName("org_name")
                    .secret("secret")
                    .type("type")
                    .build()
            )
        println(aISecret)
        aISecret.validate()
    }
}
