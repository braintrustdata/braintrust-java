// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.models.*
import com.braintrustdata.api.models.RoleListParams
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
                .build()
        val roleService = client.roles()
        val role =
            roleService.create(
                RoleCreateParams.builder()
                    .name("name")
                    .description("description")
                    .memberPermissions(
                        listOf(
                            RoleCreateParams.MemberPermission.builder()
                                .permission(RoleCreateParams.MemberPermission.Permission.CREATE)
                                .restrictObjectType(
                                    RoleCreateParams.MemberPermission.RestrictObjectType
                                        .ORGANIZATION
                                )
                                .build()
                        )
                    )
                    .memberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .orgName("org_name")
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
                .build()
        val roleService = client.roles()
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
                .build()
        val roleService = client.roles()
        val role =
            roleService.update(
                RoleUpdateParams.builder()
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addMemberPermissions(
                        listOf(
                            RoleUpdateParams.AddMemberPermission.builder()
                                .permission(RoleUpdateParams.AddMemberPermission.Permission.CREATE)
                                .restrictObjectType(
                                    RoleUpdateParams.AddMemberPermission.RestrictObjectType
                                        .ORGANIZATION
                                )
                                .build()
                        )
                    )
                    .addMemberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .description("description")
                    .name("name")
                    .removeMemberPermissions(
                        listOf(
                            RoleUpdateParams.RemoveMemberPermission.builder()
                                .permission(
                                    RoleUpdateParams.RemoveMemberPermission.Permission.CREATE
                                )
                                .restrictObjectType(
                                    RoleUpdateParams.RemoveMemberPermission.RestrictObjectType
                                        .ORGANIZATION
                                )
                                .build()
                        )
                    )
                    .removeMemberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
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
                .build()
        val roleService = client.roles()
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
                .build()
        val roleService = client.roles()
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
                .build()
        val roleService = client.roles()
        val role =
            roleService.replace(
                RoleReplaceParams.builder()
                    .name("name")
                    .description("description")
                    .memberPermissions(
                        listOf(
                            RoleReplaceParams.MemberPermission.builder()
                                .permission(RoleReplaceParams.MemberPermission.Permission.CREATE)
                                .restrictObjectType(
                                    RoleReplaceParams.MemberPermission.RestrictObjectType
                                        .ORGANIZATION
                                )
                                .build()
                        )
                    )
                    .memberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .orgName("org_name")
                    .build()
            )
        println(role)
        role.validate()
    }
}
