// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.services.blocking

import com.braintrust.api.TestServerExtension
import com.braintrust.api.client.okhttp.BraintrustOkHttpClient
import com.braintrust.api.models.*
import com.braintrust.api.models.GroupListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class GroupServiceTest {

    @Test
    fun callCreate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val groupService = client.group()
        val group =
            groupService.create(
                GroupCreateParams.builder()
                    .name("string")
                    .description("string")
                    .memberGroups(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .memberUsers(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .orgName("string")
                    .build()
            )
        println(group)
        group.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val groupService = client.group()
        val group =
            groupService.retrieve(
                GroupRetrieveParams.builder()
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(group)
        group.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val groupService = client.group()
        val group =
            groupService.update(
                GroupUpdateParams.builder()
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("string")
                    .memberGroups(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .memberUsers(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .name("string")
                    .build()
            )
        println(group)
        group.validate()
    }

    @Test
    fun callList() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val groupService = client.group()
        val response = groupService.list(GroupListParams.builder().build())
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
        val groupService = client.group()
        val group =
            groupService.delete(
                GroupDeleteParams.builder().groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
        println(group)
        group.validate()
    }

    @Test
    fun callReplace() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val groupService = client.group()
        val group =
            groupService.replace(
                GroupReplaceParams.builder()
                    .name("string")
                    .description("string")
                    .memberGroups(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .memberUsers(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .orgName("string")
                    .build()
            )
        println(group)
        group.validate()
    }
}
