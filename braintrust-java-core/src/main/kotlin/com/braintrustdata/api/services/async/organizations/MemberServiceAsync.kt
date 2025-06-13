// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async.organizations

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.OrganizationMemberUpdateParams
import com.braintrustdata.api.models.PatchOrganizationMembersOutput
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MemberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemberServiceAsync

    /** Modify organization membership */
    fun update(): CompletableFuture<PatchOrganizationMembersOutput> =
        update(OrganizationMemberUpdateParams.none())

    /** @see [update] */
    fun update(
        params: OrganizationMemberUpdateParams = OrganizationMemberUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PatchOrganizationMembersOutput>

    /** @see [update] */
    fun update(
        params: OrganizationMemberUpdateParams = OrganizationMemberUpdateParams.none()
    ): CompletableFuture<PatchOrganizationMembersOutput> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(requestOptions: RequestOptions): CompletableFuture<PatchOrganizationMembersOutput> =
        update(OrganizationMemberUpdateParams.none(), requestOptions)

    /**
     * A view of [MemberServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MemberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /v1/organization/members`, but is otherwise the
         * same as [MemberServiceAsync.update].
         */
        fun update(): CompletableFuture<HttpResponseFor<PatchOrganizationMembersOutput>> =
            update(OrganizationMemberUpdateParams.none())

        /** @see [update] */
        fun update(
            params: OrganizationMemberUpdateParams = OrganizationMemberUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PatchOrganizationMembersOutput>>

        /** @see [update] */
        fun update(
            params: OrganizationMemberUpdateParams = OrganizationMemberUpdateParams.none()
        ): CompletableFuture<HttpResponseFor<PatchOrganizationMembersOutput>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PatchOrganizationMembersOutput>> =
            update(OrganizationMemberUpdateParams.none(), requestOptions)
    }
}
