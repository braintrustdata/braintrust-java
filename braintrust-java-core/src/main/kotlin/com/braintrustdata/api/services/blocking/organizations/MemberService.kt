// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking.organizations

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.OrganizationMemberUpdateParams
import com.braintrustdata.api.models.PatchOrganizationMembersOutput
import com.google.errorprone.annotations.MustBeClosed

interface MemberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Modify organization membership */
    fun update(): PatchOrganizationMembersOutput = update(OrganizationMemberUpdateParams.none())

    /** @see [update] */
    fun update(params: OrganizationMemberUpdateParams = OrganizationMemberUpdateParams.none(), requestOptions: RequestOptions = RequestOptions.none()): PatchOrganizationMembersOutput

    /** @see [update] */
    fun update(params: OrganizationMemberUpdateParams = OrganizationMemberUpdateParams.none()): PatchOrganizationMembersOutput =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(requestOptions: RequestOptions): PatchOrganizationMembersOutput = update(OrganizationMemberUpdateParams.none(), requestOptions)

    /**
     * A view of [MemberService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `patch /v1/organization/members`, but is
         * otherwise the same as [MemberService.update].
         */
        @MustBeClosed
        fun update(): HttpResponseFor<PatchOrganizationMembersOutput> = update(OrganizationMemberUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(params: OrganizationMemberUpdateParams = OrganizationMemberUpdateParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<PatchOrganizationMembersOutput>

        /** @see [update] */
        @MustBeClosed
        fun update(params: OrganizationMemberUpdateParams = OrganizationMemberUpdateParams.none()): HttpResponseFor<PatchOrganizationMembersOutput> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(requestOptions: RequestOptions): HttpResponseFor<PatchOrganizationMembersOutput> = update(OrganizationMemberUpdateParams.none(), requestOptions)
    }
}
