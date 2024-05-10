// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.services.blocking

import com.braintrust.api.TestServerExtension
import com.braintrust.api.client.okhttp.BraintrustOkHttpClient
import com.braintrust.api.models.*
import com.braintrust.api.models.RoleListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RoleServiceTest {

    @Test
    fun callCreate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .baseUrl("My Base URL")
                .build()
        val roleService = client.role()
        val role =
            roleService.create(
                RoleCreateParams.builder()
                    .name("string")
                    .description("string")
                    .memberPermissions(listOf(RoleCreateParams.MemberPermission.CREATE))
                    .memberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .orgName("string")
                    .build()
            )
        println(role)
        role.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .baseUrl("My Base URL")
                .build()
        val roleService = client.role()
        val role =
            roleService.retrieve(
                RoleRetrieveParams.builder().roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
        println(role)
        role.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .baseUrl("My Base URL")
                .build()
        val roleService = client.role()
        val role =
            roleService.update(
                RoleUpdateParams.builder()
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("string")
                    .memberPermissions(listOf(RoleUpdateParams.MemberPermission.CREATE))
                    .memberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .name("string")
                    .build()
            )
        println(role)
        role.validate()
    }

    @Test
    fun callList() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .baseUrl("My Base URL")
                .build()
        val roleService = client.role()
        val response = roleService.list(RoleListParams.builder().build())
        println(response)
        response.objects().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .baseUrl("My Base URL")
                .build()
        val roleService = client.role()
        val role =
            roleService.delete(
                RoleDeleteParams.builder().roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
        println(role)
        role.validate()
    }

    @Test
    fun callReplace() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .baseUrl("My Base URL")
                .build()
        val roleService = client.role()
        val role =
            roleService.replace(
                RoleReplaceParams.builder()
                    .name("string")
                    .description("string")
                    .memberPermissions(listOf(RoleReplaceParams.MemberPermission.CREATE))
                    .memberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .orgName("string")
                    .build()
            )
        println(role)
        role.validate()
    }
}
