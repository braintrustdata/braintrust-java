// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.blocking.organizations

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.OrganizationMemberUpdateParams
import com.braintrustdata.api.models.PatchOrganizationMembersOutput
import com.google.errorprone.annotations.MustBeClosed

interface MemberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Modify organization membership */
    @JvmOverloads
    fun update(
        params: OrganizationMemberUpdateParams = OrganizationMemberUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PatchOrganizationMembersOutput

    /** Modify organization membership */
    fun update(requestOptions: RequestOptions): PatchOrganizationMembersOutput =
        update(OrganizationMemberUpdateParams.none(), requestOptions)

    /** A view of [MemberService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `patch /v1/organization/members`, but is otherwise the
         * same as [MemberService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: OrganizationMemberUpdateParams = OrganizationMemberUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PatchOrganizationMembersOutput>

        /**
         * Returns a raw HTTP response for `patch /v1/organization/members`, but is otherwise the
         * same as [MemberService.update].
         */
        @MustBeClosed
        fun update(
            requestOptions: RequestOptions
        ): HttpResponseFor<PatchOrganizationMembersOutput> =
            update(OrganizationMemberUpdateParams.none(), requestOptions)
    }
}
