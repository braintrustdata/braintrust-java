// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AclTest {

    @Test
    fun createAcl() {
        val acl =
            Acl.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                ._objectOrgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .objectType(Acl.ObjectType.ORGANIZATION)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .groupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .permission(Acl.Permission.CREATE)
                .restrictObjectType(Acl.RestrictObjectType.ORGANIZATION)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(acl).isNotNull
        assertThat(acl.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(acl._objectOrgId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(acl.objectId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(acl.objectType()).isEqualTo(Acl.ObjectType.ORGANIZATION)
        assertThat(acl.created()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(acl.groupId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(acl.permission()).contains(Acl.Permission.CREATE)
        assertThat(acl.restrictObjectType()).contains(Acl.RestrictObjectType.ORGANIZATION)
        assertThat(acl.roleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(acl.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
