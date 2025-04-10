// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AclListPageResponseTest {

    @Test
    fun create() {
        val aclListPageResponse =
            AclListPageResponse.builder()
                .addObject(
                    Acl.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        ._objectOrgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .objectType(AclObjectType.ORGANIZATION)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .permission(Permission.CREATE)
                        .restrictObjectType(AclObjectType.ORGANIZATION)
                        .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(aclListPageResponse.objects())
            .containsExactly(
                Acl.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    ._objectOrgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(AclObjectType.ORGANIZATION)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .permission(Permission.CREATE)
                    .restrictObjectType(AclObjectType.ORGANIZATION)
                    .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aclListPageResponse =
            AclListPageResponse.builder()
                .addObject(
                    Acl.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        ._objectOrgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .objectType(AclObjectType.ORGANIZATION)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .permission(Permission.CREATE)
                        .restrictObjectType(AclObjectType.ORGANIZATION)
                        .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedAclListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aclListPageResponse),
                jacksonTypeRef<AclListPageResponse>(),
            )

        assertThat(roundtrippedAclListPageResponse).isEqualTo(aclListPageResponse)
    }
}
