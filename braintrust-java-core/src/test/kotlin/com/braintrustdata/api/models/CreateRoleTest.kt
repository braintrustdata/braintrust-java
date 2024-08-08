// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CreateRoleTest {

    @Test
    fun createCreateRole() {
        val createRole =
            CreateRole.builder()
                .name("name")
                .description("description")
                .memberPermissions(
                    listOf(
                        CreateRole.MemberPermission.builder()
                            .permission(CreateRole.MemberPermission.Permission.CREATE)
                            .restrictObjectType(
                                CreateRole.MemberPermission.RestrictObjectType.ORGANIZATION
                            )
                            .build()
                    )
                )
                .memberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .orgName("org_name")
                .build()
        assertThat(createRole).isNotNull
        assertThat(createRole.name()).isEqualTo("name")
        assertThat(createRole.description()).contains("description")
        assertThat(createRole.memberPermissions().get())
            .containsExactly(
                CreateRole.MemberPermission.builder()
                    .permission(CreateRole.MemberPermission.Permission.CREATE)
                    .restrictObjectType(CreateRole.MemberPermission.RestrictObjectType.ORGANIZATION)
                    .build()
            )
        assertThat(createRole.memberRoles().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(createRole.orgName()).contains("org_name")
    }
}
