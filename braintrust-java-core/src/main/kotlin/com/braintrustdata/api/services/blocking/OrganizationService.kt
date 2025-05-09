// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.Organization
import com.braintrustdata.api.models.OrganizationDeleteParams
import com.braintrustdata.api.models.OrganizationListPage
import com.braintrustdata.api.models.OrganizationListParams
import com.braintrustdata.api.models.OrganizationRetrieveParams
import com.braintrustdata.api.models.OrganizationUpdateParams
import com.braintrustdata.api.services.blocking.organizations.MemberService
import com.google.errorprone.annotations.MustBeClosed

interface OrganizationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun members(): MemberService

    /** Get an organization object by its id */
    fun retrieve(organizationId: String): Organization =
        retrieve(organizationId, OrganizationRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        organizationId: String,
        params: OrganizationRetrieveParams = OrganizationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Organization =
        retrieve(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        organizationId: String,
        params: OrganizationRetrieveParams = OrganizationRetrieveParams.none(),
    ): Organization = retrieve(organizationId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: OrganizationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Organization

    /** @see [retrieve] */
    fun retrieve(params: OrganizationRetrieveParams): Organization =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(organizationId: String, requestOptions: RequestOptions): Organization =
        retrieve(organizationId, OrganizationRetrieveParams.none(), requestOptions)

    /**
     * Partially update an organization object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    fun update(organizationId: String): Organization =
        update(organizationId, OrganizationUpdateParams.none())

    /** @see [update] */
    fun update(
        organizationId: String,
        params: OrganizationUpdateParams = OrganizationUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Organization =
        update(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see [update] */
    fun update(
        organizationId: String,
        params: OrganizationUpdateParams = OrganizationUpdateParams.none(),
    ): Organization = update(organizationId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: OrganizationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Organization

    /** @see [update] */
    fun update(params: OrganizationUpdateParams): Organization =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(organizationId: String, requestOptions: RequestOptions): Organization =
        update(organizationId, OrganizationUpdateParams.none(), requestOptions)

    /**
     * List out all organizations. The organizations are sorted by creation date, with the most
     * recently-created organizations coming first
     */
    fun list(): OrganizationListPage = list(OrganizationListParams.none())

    /** @see [list] */
    fun list(
        params: OrganizationListParams = OrganizationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationListPage

    /** @see [list] */
    fun list(params: OrganizationListParams = OrganizationListParams.none()): OrganizationListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): OrganizationListPage =
        list(OrganizationListParams.none(), requestOptions)

    /** Delete an organization object by its id */
    fun delete(organizationId: String): Organization =
        delete(organizationId, OrganizationDeleteParams.none())

    /** @see [delete] */
    fun delete(
        organizationId: String,
        params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Organization =
        delete(params.toBuilder().organizationId(organizationId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        organizationId: String,
        params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
    ): Organization = delete(organizationId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: OrganizationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Organization

    /** @see [delete] */
    fun delete(params: OrganizationDeleteParams): Organization =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(organizationId: String, requestOptions: RequestOptions): Organization =
        delete(organizationId, OrganizationDeleteParams.none(), requestOptions)

    /**
     * A view of [OrganizationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun members(): MemberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/organization/{organization_id}`, but is
         * otherwise the same as [OrganizationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(organizationId: String): HttpResponseFor<Organization> =
            retrieve(organizationId, OrganizationRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            organizationId: String,
            params: OrganizationRetrieveParams = OrganizationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Organization> =
            retrieve(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            organizationId: String,
            params: OrganizationRetrieveParams = OrganizationRetrieveParams.none(),
        ): HttpResponseFor<Organization> = retrieve(organizationId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: OrganizationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Organization>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: OrganizationRetrieveParams): HttpResponseFor<Organization> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            organizationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Organization> =
            retrieve(organizationId, OrganizationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/organization/{organization_id}`, but is
         * otherwise the same as [OrganizationService.update].
         */
        @MustBeClosed
        fun update(organizationId: String): HttpResponseFor<Organization> =
            update(organizationId, OrganizationUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            organizationId: String,
            params: OrganizationUpdateParams = OrganizationUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Organization> =
            update(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            organizationId: String,
            params: OrganizationUpdateParams = OrganizationUpdateParams.none(),
        ): HttpResponseFor<Organization> = update(organizationId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: OrganizationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Organization>

        /** @see [update] */
        @MustBeClosed
        fun update(params: OrganizationUpdateParams): HttpResponseFor<Organization> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            organizationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Organization> =
            update(organizationId, OrganizationUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/organization`, but is otherwise the same as
         * [OrganizationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<OrganizationListPage> = list(OrganizationListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: OrganizationListParams = OrganizationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: OrganizationListParams = OrganizationListParams.none()
        ): HttpResponseFor<OrganizationListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OrganizationListPage> =
            list(OrganizationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/organization/{organization_id}`, but is
         * otherwise the same as [OrganizationService.delete].
         */
        @MustBeClosed
        fun delete(organizationId: String): HttpResponseFor<Organization> =
            delete(organizationId, OrganizationDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            organizationId: String,
            params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Organization> =
            delete(params.toBuilder().organizationId(organizationId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            organizationId: String,
            params: OrganizationDeleteParams = OrganizationDeleteParams.none(),
        ): HttpResponseFor<Organization> = delete(organizationId, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: OrganizationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Organization>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: OrganizationDeleteParams): HttpResponseFor<Organization> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            organizationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Organization> =
            delete(organizationId, OrganizationDeleteParams.none(), requestOptions)
    }
}
