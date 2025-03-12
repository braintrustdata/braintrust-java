// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async.organizations

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.OrganizationMemberUpdateParams
import com.braintrustdata.api.models.PatchOrganizationMembersOutput
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface MemberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Modify organization membership */
    fun update(): CompletableFuture<PatchOrganizationMembersOutput> = update(OrganizationMemberUpdateParams.none())

    /** @see [update] */
    fun update(params: OrganizationMemberUpdateParams = OrganizationMemberUpdateParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<PatchOrganizationMembersOutput>

    /** @see [update] */
    fun update(params: OrganizationMemberUpdateParams = OrganizationMemberUpdateParams.none()): CompletableFuture<PatchOrganizationMembersOutput> =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(requestOptions: RequestOptions): CompletableFuture<PatchOrganizationMembersOutput> = update(OrganizationMemberUpdateParams.none(), requestOptions)

    /**
     * A view of [MemberServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `patch /v1/organization/members`, but is
         * otherwise the same as [MemberServiceAsync.update].
         */
        @MustBeClosed
        fun update(): CompletableFuture<HttpResponseFor<PatchOrganizationMembersOutput>> = update(OrganizationMemberUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(params: OrganizationMemberUpdateParams = OrganizationMemberUpdateParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<PatchOrganizationMembersOutput>>

        /** @see [update] */
        @MustBeClosed
        fun update(params: OrganizationMemberUpdateParams = OrganizationMemberUpdateParams.none()): CompletableFuture<HttpResponseFor<PatchOrganizationMembersOutput>> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<PatchOrganizationMembersOutput>> = update(OrganizationMemberUpdateParams.none(), requestOptions)
    }
}
