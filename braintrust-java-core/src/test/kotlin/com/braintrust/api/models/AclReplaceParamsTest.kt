// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.models.*
import org.junit.jupiter.api.Test

class AclReplaceParamsTest {

    @Test
    fun createAclReplaceParams() {
        AclReplaceParams.builder()
            .forCreateUserPermissionAcl(
                AclReplaceParams.CreateUserPermissionAcl.builder()
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(AclReplaceParams.CreateUserPermissionAcl.ObjectType.ORGANIZATION)
                    .permission(AclReplaceParams.CreateUserPermissionAcl.Permission.CREATE)
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .restrictObjectType(
                        AclReplaceParams.CreateUserPermissionAcl.RestrictObjectType.ofUnionMember0(
                            AclReplaceParams.CreateUserPermissionAcl.RestrictObjectType.UnionMember0
                                .ORGANIZATION
                        )
                    )
                    .build()
            )
            .build()
    }
}
