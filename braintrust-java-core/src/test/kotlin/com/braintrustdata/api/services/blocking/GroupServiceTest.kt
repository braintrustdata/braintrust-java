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
internal class GroupServiceTest {

    @Test
    fun create() {
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

        group.validate()
    }

    @Test
    fun retrieve() {
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

        group.validate()
    }

    @Test
    fun update() {
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

        group.validate()
    }

    @Test
    fun list() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val groupService = client.groups()

        val page = groupService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
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

        group.validate()
    }

    @Test
    fun replace() {
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

        group.validate()
    }
}
