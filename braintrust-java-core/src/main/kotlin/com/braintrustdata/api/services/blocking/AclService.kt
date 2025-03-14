// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.Acl
import com.braintrustdata.api.models.AclBatchUpdateParams
import com.braintrustdata.api.models.AclBatchUpdateResponse
import com.braintrustdata.api.models.AclCreateParams
import com.braintrustdata.api.models.AclDeleteParams
import com.braintrustdata.api.models.AclFindAndDeleteParams
import com.braintrustdata.api.models.AclListPage
import com.braintrustdata.api.models.AclListParams
import com.braintrustdata.api.models.AclRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface AclService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new acl. If there is an existing acl with the same contents as the one specified in
     * the request, will return the existing acl unmodified
     */
    fun create(params: AclCreateParams): Acl = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(params: AclCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Acl

    /** Get an acl object by its id */
    fun retrieve(params: AclRetrieveParams): Acl = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AclRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Acl

    /**
     * List out all acls. The acls are sorted by creation date, with the most recently-created acls
     * coming first
     */
    fun list(params: AclListParams): AclListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: AclListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AclListPage

    /** Delete an acl object by its id */
    fun delete(params: AclDeleteParams): Acl = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(params: AclDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): Acl

    /**
     * Batch update acls. This operation is idempotent, so adding acls which already exist will have
     * no effect, and removing acls which do not exist will have no effect.
     */
    fun batchUpdate(): AclBatchUpdateResponse = batchUpdate(AclBatchUpdateParams.none())

    /** @see [batchUpdate] */
    fun batchUpdate(
        params: AclBatchUpdateParams = AclBatchUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AclBatchUpdateResponse

    /** @see [batchUpdate] */
    fun batchUpdate(
        params: AclBatchUpdateParams = AclBatchUpdateParams.none()
    ): AclBatchUpdateResponse = batchUpdate(params, RequestOptions.none())

    /** @see [batchUpdate] */
    fun batchUpdate(requestOptions: RequestOptions): AclBatchUpdateResponse =
        batchUpdate(AclBatchUpdateParams.none(), requestOptions)

    /** Delete a single acl */
    fun findAndDelete(params: AclFindAndDeleteParams): Acl =
        findAndDelete(params, RequestOptions.none())

    /** @see [findAndDelete] */
    fun findAndDelete(
        params: AclFindAndDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Acl

    /** A view of [AclService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/acl`, but is otherwise the same as
         * [AclService.create].
         */
        @MustBeClosed
        fun create(params: AclCreateParams): HttpResponseFor<Acl> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AclCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Acl>

        /**
         * Returns a raw HTTP response for `get /v1/acl/{acl_id}`, but is otherwise the same as
         * [AclService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: AclRetrieveParams): HttpResponseFor<Acl> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AclRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Acl>

        /**
         * Returns a raw HTTP response for `get /v1/acl`, but is otherwise the same as
         * [AclService.list].
         */
        @MustBeClosed
        fun list(params: AclListParams): HttpResponseFor<AclListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AclListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AclListPage>

        /**
         * Returns a raw HTTP response for `delete /v1/acl/{acl_id}`, but is otherwise the same as
         * [AclService.delete].
         */
        @MustBeClosed
        fun delete(params: AclDeleteParams): HttpResponseFor<Acl> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: AclDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Acl>

        /**
         * Returns a raw HTTP response for `post /v1/acl/batch_update`, but is otherwise the same as
         * [AclService.batchUpdate].
         */
        @MustBeClosed
        fun batchUpdate(): HttpResponseFor<AclBatchUpdateResponse> =
            batchUpdate(AclBatchUpdateParams.none())

        /** @see [batchUpdate] */
        @MustBeClosed
        fun batchUpdate(
            params: AclBatchUpdateParams = AclBatchUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AclBatchUpdateResponse>

        /** @see [batchUpdate] */
        @MustBeClosed
        fun batchUpdate(
            params: AclBatchUpdateParams = AclBatchUpdateParams.none()
        ): HttpResponseFor<AclBatchUpdateResponse> = batchUpdate(params, RequestOptions.none())

        /** @see [batchUpdate] */
        @MustBeClosed
        fun batchUpdate(requestOptions: RequestOptions): HttpResponseFor<AclBatchUpdateResponse> =
            batchUpdate(AclBatchUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/acl`, but is otherwise the same as
         * [AclService.findAndDelete].
         */
        @MustBeClosed
        fun findAndDelete(params: AclFindAndDeleteParams): HttpResponseFor<Acl> =
            findAndDelete(params, RequestOptions.none())

        /** @see [findAndDelete] */
        @MustBeClosed
        fun findAndDelete(
            params: AclFindAndDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Acl>
    }
}
