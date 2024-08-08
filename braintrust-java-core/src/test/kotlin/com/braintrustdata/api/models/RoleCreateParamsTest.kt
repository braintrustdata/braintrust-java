// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoleCreateParamsTest {

    @Test
    fun createRoleCreateParams() {
        RoleCreateParams.builder()
            .name("name")
            .description("description")
            .memberPermissions(
                listOf(
                    RoleCreateParams.MemberPermission.builder()
                        .permission(RoleCreateParams.MemberPermission.Permission.CREATE)
                        .restrictObjectType(
                            RoleCreateParams.MemberPermission.RestrictObjectType.ORGANIZATION
                        )
                        .build()
                )
            )
            .memberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .orgName("org_name")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            RoleCreateParams.builder()
                .name("name")
                .description("description")
                .memberPermissions(
                    listOf(
                        RoleCreateParams.MemberPermission.builder()
                            .permission(RoleCreateParams.MemberPermission.Permission.CREATE)
                            .restrictObjectType(
                                RoleCreateParams.MemberPermission.RestrictObjectType.ORGANIZATION
                            )
                            .build()
                    )
                )
                .memberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .orgName("org_name")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.memberPermissions())
            .isEqualTo(
                listOf(
                    RoleCreateParams.MemberPermission.builder()
                        .permission(RoleCreateParams.MemberPermission.Permission.CREATE)
                        .restrictObjectType(
                            RoleCreateParams.MemberPermission.RestrictObjectType.ORGANIZATION
                        )
                        .build()
                )
            )
        assertThat(body.memberRoles()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.orgName()).isEqualTo("org_name")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = RoleCreateParams.builder().name("name").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
    }
}
