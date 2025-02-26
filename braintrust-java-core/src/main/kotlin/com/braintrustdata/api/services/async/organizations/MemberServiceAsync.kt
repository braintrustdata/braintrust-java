// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.async.organizations

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.models.OrganizationMemberUpdateParams
import com.braintrustdata.api.models.PatchOrganizationMembersOutput
import java.util.concurrent.CompletableFuture

interface MemberServiceAsync {

    /** Modify organization membership */
    @JvmOverloads
    fun update(
        params: OrganizationMemberUpdateParams = OrganizationMemberUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PatchOrganizationMembersOutput>

    /** Modify organization membership */
    fun update(requestOptions: RequestOptions): CompletableFuture<PatchOrganizationMembersOutput> =
        update(OrganizationMemberUpdateParams.none(), requestOptions)
}
