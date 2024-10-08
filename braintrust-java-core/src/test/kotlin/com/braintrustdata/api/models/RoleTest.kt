// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoleTest {

    @Test
    fun createRole() {
        val role =
            Role.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .memberPermissions(
                    listOf(
                        Role.MemberPermission.builder()
                            .permission(Role.MemberPermission.Permission.CREATE)
                            .restrictObjectType(
                                Role.MemberPermission.RestrictObjectType.ORGANIZATION
                            )
                            .build()
                    )
                )
                .memberRoles(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(role).isNotNull
        assertThat(role.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(role.name()).isEqualTo("name")
        assertThat(role.created()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(role.deletedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(role.description()).contains("description")
        assertThat(role.memberPermissions().get())
            .containsExactly(
                Role.MemberPermission.builder()
                    .permission(Role.MemberPermission.Permission.CREATE)
                    .restrictObjectType(Role.MemberPermission.RestrictObjectType.ORGANIZATION)
                    .build()
            )
        assertThat(role.memberRoles().get()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(role.orgId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(role.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
