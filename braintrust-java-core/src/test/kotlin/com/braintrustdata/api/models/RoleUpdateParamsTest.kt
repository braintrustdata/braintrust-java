// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoleUpdateParamsTest {

    @Test
    fun create() {
        RoleUpdateParams.builder()
            .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addAddMemberPermission(
                RoleUpdateParams.AddMemberPermission.builder()
                    .permission(RoleUpdateParams.AddMemberPermission.Permission.CREATE)
                    .restrictObjectType(
                        RoleUpdateParams.AddMemberPermission.RestrictObjectType.ORGANIZATION
                    )
                    .build()
            )
            .addAddMemberRole("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .name("x")
            .addRemoveMemberPermission(
                RoleUpdateParams.RemoveMemberPermission.builder()
                    .permission(RoleUpdateParams.RemoveMemberPermission.Permission.CREATE)
                    .restrictObjectType(
                        RoleUpdateParams.RemoveMemberPermission.RestrictObjectType.ORGANIZATION
                    )
                    .build()
            )
            .addRemoveMemberRole("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            RoleUpdateParams.builder()
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAddMemberPermission(
                    RoleUpdateParams.AddMemberPermission.builder()
                        .permission(RoleUpdateParams.AddMemberPermission.Permission.CREATE)
                        .restrictObjectType(
                            RoleUpdateParams.AddMemberPermission.RestrictObjectType.ORGANIZATION
                        )
                        .build()
                )
                .addAddMemberRole("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .name("x")
                .addRemoveMemberPermission(
                    RoleUpdateParams.RemoveMemberPermission.builder()
                        .permission(RoleUpdateParams.RemoveMemberPermission.Permission.CREATE)
                        .restrictObjectType(
                            RoleUpdateParams.RemoveMemberPermission.RestrictObjectType.ORGANIZATION
                        )
                        .build()
                )
                .addRemoveMemberRole("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.addMemberPermissions())
            .contains(
                listOf(
                    RoleUpdateParams.AddMemberPermission.builder()
                        .permission(RoleUpdateParams.AddMemberPermission.Permission.CREATE)
                        .restrictObjectType(
                            RoleUpdateParams.AddMemberPermission.RestrictObjectType.ORGANIZATION
                        )
                        .build()
                )
            )
        assertThat(body.addMemberRoles()).contains(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("x")
        assertThat(body.removeMemberPermissions())
            .contains(
                listOf(
                    RoleUpdateParams.RemoveMemberPermission.builder()
                        .permission(RoleUpdateParams.RemoveMemberPermission.Permission.CREATE)
                        .restrictObjectType(
                            RoleUpdateParams.RemoveMemberPermission.RestrictObjectType.ORGANIZATION
                        )
                        .build()
                )
            )
        assertThat(body.removeMemberRoles())
            .contains(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RoleUpdateParams.builder().roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        val body = params._body()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            RoleUpdateParams.builder().roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
        assertThat(params).isNotNull
        // path param "roleId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
