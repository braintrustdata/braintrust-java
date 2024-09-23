// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.models.*
import com.braintrustdata.api.models.OrgSecretListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class OrgSecretServiceTest {

    @Test
    fun callCreate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orgSecretService = client.orgSecret()
        val orgSecret =
            orgSecretService.create(
                OrgSecretCreateParams.builder()
                    .name("name")
                    .metadata(OrgSecretCreateParams.Metadata.builder().build())
                    .orgName("org_name")
                    .secret("secret")
                    .type("type")
                    .build()
            )
        println(orgSecret)
        orgSecret.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orgSecretService = client.orgSecret()
        val orgSecret =
            orgSecretService.retrieve(
                OrgSecretRetrieveParams.builder()
                    .orgSecretId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(orgSecret)
        orgSecret.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orgSecretService = client.orgSecret()
        val orgSecret =
            orgSecretService.update(
                OrgSecretUpdateParams.builder()
                    .orgSecretId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(OrgSecretUpdateParams.Metadata.builder().build())
                    .name("name")
                    .secret("secret")
                    .type("type")
                    .build()
            )
        println(orgSecret)
        orgSecret.validate()
    }

    @Test
    fun callList() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orgSecretService = client.orgSecret()
        val response = orgSecretService.list(OrgSecretListParams.builder().build())
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
        val orgSecretService = client.orgSecret()
        val orgSecret =
            orgSecretService.delete(
                OrgSecretDeleteParams.builder()
                    .orgSecretId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(orgSecret)
        orgSecret.validate()
    }

    @Test
    fun callFindAndDelete() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orgSecretService = client.orgSecret()
        val orgSecret =
            orgSecretService.findAndDelete(
                OrgSecretFindAndDeleteParams.builder().name("name").orgName("org_name").build()
            )
        println(orgSecret)
        orgSecret.validate()
    }

    @Test
    fun callReplace() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orgSecretService = client.orgSecret()
        val orgSecret =
            orgSecretService.replace(
                OrgSecretReplaceParams.builder()
                    .name("name")
                    .metadata(OrgSecretReplaceParams.Metadata.builder().build())
                    .orgName("org_name")
                    .secret("secret")
                    .type("type")
                    .build()
            )
        println(orgSecret)
        orgSecret.validate()
    }
}
