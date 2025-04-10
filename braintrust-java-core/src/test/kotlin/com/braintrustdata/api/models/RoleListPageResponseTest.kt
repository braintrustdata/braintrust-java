// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoleListPageResponseTest {

    @Test
    fun create() {
        val roleListPageResponse =
            RoleListPageResponse.builder()
                .addObject(
                    Role.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .addMemberPermission(
                            Role.MemberPermission.builder()
                                .permission(Permission.CREATE)
                                .restrictObjectType(AclObjectType.ORGANIZATION)
                                .build()
                        )
                        .addMemberRole("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(roleListPageResponse.objects())
            .containsExactly(
                Role.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .addMemberPermission(
                        Role.MemberPermission.builder()
                            .permission(Permission.CREATE)
                            .restrictObjectType(AclObjectType.ORGANIZATION)
                            .build()
                    )
                    .addMemberRole("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val roleListPageResponse =
            RoleListPageResponse.builder()
                .addObject(
                    Role.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .addMemberPermission(
                            Role.MemberPermission.builder()
                                .permission(Permission.CREATE)
                                .restrictObjectType(AclObjectType.ORGANIZATION)
                                .build()
                        )
                        .addMemberRole("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedRoleListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(roleListPageResponse),
                jacksonTypeRef<RoleListPageResponse>(),
            )

        assertThat(roundtrippedRoleListPageResponse).isEqualTo(roleListPageResponse)
    }
}
