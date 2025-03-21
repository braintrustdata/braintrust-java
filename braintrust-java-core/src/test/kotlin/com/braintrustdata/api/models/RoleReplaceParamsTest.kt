// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoleReplaceParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
        assertThat(body.description()).contains("description")
        assertThat(body.memberPermissions().getOrNull())
            .containsExactly(
                RoleReplaceParams.MemberPermission.builder()
                    .permission(Permission.CREATE)
                    .restrictObjectType(AclObjectType.ORGANIZATION)
                    .build()
            )
        assertThat(body.memberRoles().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.orgName()).contains("org_name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RoleReplaceParams.builder().name("x").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("x")
    }
}
