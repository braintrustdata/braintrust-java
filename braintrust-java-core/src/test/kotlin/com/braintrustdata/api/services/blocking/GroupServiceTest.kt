// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.models.GroupCreateParams
import com.braintrustdata.api.models.GroupDeleteParams
import com.braintrustdata.api.models.GroupReplaceParams
import com.braintrustdata.api.models.GroupRetrieveParams
import com.braintrustdata.api.models.GroupUpdateParams
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
        val groupService = client.groups()
        val group =
            groupService.create(
                GroupCreateParams.builder()
                    .name("x")
                    .description("description")
                    .addMemberGroup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addMemberUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .orgName("org_name")
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
        val groupService = client.groups()
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
        val groupService = client.groups()
        val group =
            groupService.update(
                GroupUpdateParams.builder()
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addAddMemberGroup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addAddMemberUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .name("x")
                    .addRemoveMemberGroup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addRemoveMemberUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
        val groupService = client.groups()
        val response = groupService.list()
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
        val groupService = client.groups()
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
        val groupService = client.groups()
        val group =
            groupService.replace(
                GroupReplaceParams.builder()
                    .name("x")
                    .description("description")
                    .addMemberGroup("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addMemberUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .orgName("org_name")
                    .build()
            )
        println(group)
        group.validate()
    }
}
