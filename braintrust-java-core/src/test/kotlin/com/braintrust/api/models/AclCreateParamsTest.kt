// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.models

import com.braintrust.api.models.*
import org.junit.jupiter.api.Test

class AclCreateParamsTest {

    @Test
    fun createAclCreateParams() {
        AclCreateParams.builder()
            .forCreateUserPermissionAcl(
                AclCreateParams.CreateUserPermissionAcl.builder()
                    .objectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .objectType(AclCreateParams.CreateUserPermissionAcl.ObjectType.ORGANIZATION)
                    .permission(AclCreateParams.CreateUserPermissionAcl.Permission.CREATE)
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .restrictObjectType(
                        AclCreateParams.CreateUserPermissionAcl.RestrictObjectType.ofUnionMember0(
                            AclCreateParams.CreateUserPermissionAcl.RestrictObjectType.UnionMember0
                                .ORGANIZATION
                        )
                    )
                    .build()
            )
            .build()
    }
}
