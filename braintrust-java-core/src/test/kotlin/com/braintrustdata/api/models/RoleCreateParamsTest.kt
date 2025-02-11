// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoleCreateParamsTest {

    @Test
    fun create() {
        RoleCreateParams.builder()
            .name("x")
            .description("description")
            .addMemberPermission(
                RoleCreateParams.MemberPermission.builder()
                    .permission(RoleCreateParams.MemberPermission.Permission.CREATE)
                    .restrictObjectType(
                        RoleCreateParams.MemberPermission.RestrictObjectType.ORGANIZATION
                    )
                    .build()
            )
            .addMemberRole("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .orgName("org_name")
            .build()
    }

    @Test
    fun body() {
        val params =
            RoleCreateParams.builder()
                .name("x")
                .description("description")
                .addMemberPermission(
                    RoleCreateParams.MemberPermission.builder()
                        .permission(RoleCreateParams.MemberPermission.Permission.CREATE)
                        .restrictObjectType(
                            RoleCreateParams.MemberPermission.RestrictObjectType.ORGANIZATION
                        )
                        .build()
                )
                .addMemberRole("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .orgName("org_name")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.description()).contains("description")
        assertThat(body.memberPermissions())
            .contains(
                listOf(
                    RoleCreateParams.MemberPermission.builder()
                        .permission(RoleCreateParams.MemberPermission.Permission.CREATE)
                        .restrictObjectType(
                            RoleCreateParams.MemberPermission.RestrictObjectType.ORGANIZATION
                        )
                        .build()
                )
            )
        assertThat(body.memberRoles()).contains(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.orgName()).contains("org_name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RoleCreateParams.builder().name("x").build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("x")
    }
}
