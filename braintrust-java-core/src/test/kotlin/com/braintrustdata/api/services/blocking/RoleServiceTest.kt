// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.TestServerExtension
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.models.AclObjectType
import com.braintrustdata.api.models.Permission
import com.braintrustdata.api.models.RoleCreateParams
import com.braintrustdata.api.models.RoleReplaceParams
import com.braintrustdata.api.models.RoleUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RoleServiceTest {

    @Test
    fun create() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roleService = client.roles()

        val role =
            roleService.create(
                RoleCreateParams.builder()
                    .name("x")
                    .description("description")
                    .addMemberPermission(
                        RoleCreateParams.MemberPermission.builder()
                            .permission(Permission.CREATE)
                            .restrictObjectType(AclObjectType.ORGANIZATION)
                            .build()
                    )
                    .addMemberRole("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .orgName("org_name")
                    .build()
            )

        role.validate()
    }

    @Test
    fun retrieve() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roleService = client.roles()

        val role = roleService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        role.validate()
    }

    @Test
    fun update() {
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
                    .addAddMemberPermission(
                        RoleUpdateParams.AddMemberPermission.builder()
                            .permission(Permission.CREATE)
                            .restrictObjectType(AclObjectType.ORGANIZATION)
                            .build()
                    )
                    .addAddMemberRole("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .name("x")
                    .addRemoveMemberPermission(
                        RoleUpdateParams.RemoveMemberPermission.builder()
                            .permission(Permission.CREATE)
                            .restrictObjectType(AclObjectType.ORGANIZATION)
                            .build()
                    )
                    .addRemoveMemberRole("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        role.validate()
    }

    @Test
    fun list() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roleService = client.roles()

        val page = roleService.list()

        page.response().validate()
    }

    @Test
    fun delete() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roleService = client.roles()

        val role = roleService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        role.validate()
    }

    @Test
    fun replace() {
        val client =
            BraintrustOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roleService = client.roles()

        val role =
            roleService.replace(
                RoleReplaceParams.builder()
                    .name("x")
                    .description("description")
                    .addMemberPermission(
                        RoleReplaceParams.MemberPermission.builder()
                            .permission(Permission.CREATE)
                            .restrictObjectType(AclObjectType.ORGANIZATION)
                            .build()
                    )
                    .addMemberRole("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .orgName("org_name")
                    .build()
            )

        role.validate()
    }
}
