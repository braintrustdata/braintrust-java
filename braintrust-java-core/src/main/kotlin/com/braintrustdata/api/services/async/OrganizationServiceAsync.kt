// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.Organization
import com.braintrustdata.api.models.OrganizationDeleteParams
import com.braintrustdata.api.models.OrganizationListPageAsync
import com.braintrustdata.api.models.OrganizationListParams
import com.braintrustdata.api.models.OrganizationRetrieveParams
import com.braintrustdata.api.models.OrganizationUpdateParams
import com.braintrustdata.api.services.async.organizations.MemberServiceAsync
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface OrganizationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun members(): MemberServiceAsync

    /** Get an organization object by its id */
    fun retrieve(organizationId: String): CompletableFuture<Organization> =
        retrieve(organizationId, OrganizationRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        organizationId: String,
        params: OrganizationRetrieveParams = OrganizationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Organization> =
        retrieve(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        organizationId: String,
        params: OrganizationRetrieveParams = OrganizationRetrieveParams.none(),
    ): CompletableFuture<Organization> = retrieve(organizationId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: OrganizationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Organization>

    /** @see [retrieve] */
    fun retrieve(params: OrganizationRetrieveParams): CompletableFuture<Organization> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        organizationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Organization> =
        retrieve(organizationId, OrganizationRetrieveParams.none(), requestOptions)

    /**
     * Partially update an organization object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    fun update(organizationId: String): CompletableFuture<Organization> =
        update(organizationId, OrganizationUpdateParams.none())

    /** @see [update] */
    fun update(
        organizationId: String,
        params: OrganizationUpdateParams = OrganizationUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Organization> =
        update(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see [update] */
    fun update(
        organizationId: String,
        params: OrganizationUpdateParams = OrganizationUpdateParams.none(),
    ): CompletableFuture<Organization> = update(organizationId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: OrganizationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Organization>

    /** @see [update] */
    fun update(params: OrganizationUpdateParams): CompletableFuture<Organization> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        organizationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Organization> =
        update(organizationId, OrganizationUpdateParams.none(), requestOptions)

    /**
     * List out all organizations. The organizations are sorted by creation date, with the most
     * recently-created organizations coming first
     */
    fun list(): CompletableFuture<OrganizationListPageAsync> = list(OrganizationListParams.none())

    /** @see [list] */
    fun list(
        params: OrganizationListParams = OrganizationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationListPageAsync>

    /** @see [list] */
    fun list(
        params: OrganizationListParams = OrganizationListParams.none()
    ): CompletableFuture<OrganizationListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<OrganizationListPageAsync> =
        list(OrganizationListParams.none(), requestOptions)

    /** Delete an organization object by its id */
    fun delete(organizationId: String): CompletableFuture<Organization> =
        delete(organizationId, OrganizationDeleteParams.none())

    /** @see [delete] */
    fun delete(
        organizationId: String,
        params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Organization> =
        delete(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        organizationId: String,
        params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
    ): CompletableFuture<Organization> = delete(organizationId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: OrganizationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Organization>

    /** @see [delete] */
    fun delete(params: OrganizationDeleteParams): CompletableFuture<Organization> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        organizationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Organization> =
        delete(organizationId, OrganizationDeleteParams.none(), requestOptions)

    /**
     * A view of [OrganizationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun members(): MemberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/organization/{organization_id}`, but is
         * otherwise the same as [OrganizationServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(organizationId: String): CompletableFuture<HttpResponseFor<Organization>> =
            retrieve(organizationId, OrganizationRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            organizationId: String,
            params: OrganizationRetrieveParams = OrganizationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Organization>> =
            retrieve(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            organizationId: String,
            params: OrganizationRetrieveParams = OrganizationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Organization>> =
            retrieve(organizationId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: OrganizationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Organization>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: OrganizationRetrieveParams
        ): CompletableFuture<HttpResponseFor<Organization>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            organizationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Organization>> =
            retrieve(organizationId, OrganizationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/organization/{organization_id}`, but is
         * otherwise the same as [OrganizationServiceAsync.update].
         */
        @MustBeClosed
        fun update(organizationId: String): CompletableFuture<HttpResponseFor<Organization>> =
            update(organizationId, OrganizationUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            organizationId: String,
            params: OrganizationUpdateParams = OrganizationUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Organization>> =
            update(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            organizationId: String,
            params: OrganizationUpdateParams = OrganizationUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Organization>> =
            update(organizationId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: OrganizationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Organization>>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: OrganizationUpdateParams
        ): CompletableFuture<HttpResponseFor<Organization>> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            organizationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Organization>> =
            update(organizationId, OrganizationUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/organization`, but is otherwise the same as
         * [OrganizationServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<OrganizationListPageAsync>> =
            list(OrganizationListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: OrganizationListParams = OrganizationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: OrganizationListParams = OrganizationListParams.none()
        ): CompletableFuture<HttpResponseFor<OrganizationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OrganizationListPageAsync>> =
            list(OrganizationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/organization/{organization_id}`, but is
         * otherwise the same as [OrganizationServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(organizationId: String): CompletableFuture<HttpResponseFor<Organization>> =
            delete(organizationId, OrganizationDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            organizationId: String,
            params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Organization>> =
            delete(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            organizationId: String,
            params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<Organization>> =
            delete(organizationId, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: OrganizationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Organization>>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: OrganizationDeleteParams
        ): CompletableFuture<HttpResponseFor<Organization>> = delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            organizationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Organization>> =
            delete(organizationId, OrganizationDeleteParams.none(), requestOptions)
    }
}
