// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.blocking.organizations

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.models.OrganizationMemberUpdateParams
import com.braintrustdata.api.models.PatchOrganizationMembersOutput

interface MemberService {

    /** Modify organization membership */
    @JvmOverloads
    fun update(
        params: OrganizationMemberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PatchOrganizationMembersOutput
}
