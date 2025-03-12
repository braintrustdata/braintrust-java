// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.Acl
import com.braintrustdata.api.models.AclBatchUpdateParams
import com.braintrustdata.api.models.AclBatchUpdateResponse
import com.braintrustdata.api.models.AclCreateParams
import com.braintrustdata.api.models.AclDeleteParams
import com.braintrustdata.api.models.AclFindAndDeleteParams
import com.braintrustdata.api.models.AclListPageAsync
import com.braintrustdata.api.models.AclListParams
import com.braintrustdata.api.models.AclRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface AclServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new acl. If there is an existing acl with the same contents as the one
     * specified in the request, will return the existing acl unmodified
     */
    fun create(params: AclCreateParams): CompletableFuture<Acl> =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: AclCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Acl>

    /** Get an acl object by its id */
    fun retrieve(params: AclRetrieveParams): CompletableFuture<Acl> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: AclRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Acl>

    /**
     * List out all acls. The acls are sorted by creation date, with the most
     * recently-created acls coming first
     */
    fun list(params: AclListParams): CompletableFuture<AclListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(params: AclListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AclListPageAsync>

    /** Delete an acl object by its id */
    fun delete(params: AclDeleteParams): CompletableFuture<Acl> =
        delete(
          params, RequestOptions.none()
        )

    /** @see [delete] */
    fun delete(params: AclDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Acl>

    /**
     * Batch update acls. This operation is idempotent, so adding acls which already
     * exist will have no effect, and removing acls which do not exist will have no
     * effect.
     */
    fun batchUpdate(): CompletableFuture<AclBatchUpdateResponse> = batchUpdate(AclBatchUpdateParams.none())

    /** @see [batchUpdate] */
    fun batchUpdate(params: AclBatchUpdateParams = AclBatchUpdateParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AclBatchUpdateResponse>

    /** @see [batchUpdate] */
    fun batchUpdate(params: AclBatchUpdateParams = AclBatchUpdateParams.none()): CompletableFuture<AclBatchUpdateResponse> =
        batchUpdate(
          params, RequestOptions.none()
        )

    /** @see [batchUpdate] */
    fun batchUpdate(requestOptions: RequestOptions): CompletableFuture<AclBatchUpdateResponse> = batchUpdate(AclBatchUpdateParams.none(), requestOptions)

    /** Delete a single acl */
    fun findAndDelete(params: AclFindAndDeleteParams): CompletableFuture<Acl> =
        findAndDelete(
          params, RequestOptions.none()
        )

    /** @see [findAndDelete] */
    fun findAndDelete(params: AclFindAndDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Acl>

    /**
     * A view of [AclServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/acl`, but is otherwise the same as
         * [AclServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: AclCreateParams): CompletableFuture<HttpResponseFor<Acl>> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: AclCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Acl>>

        /**
         * Returns a raw HTTP response for `get /v1/acl/{acl_id}`, but is otherwise the
         * same as [AclServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: AclRetrieveParams): CompletableFuture<HttpResponseFor<Acl>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: AclRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Acl>>

        /**
         * Returns a raw HTTP response for `get /v1/acl`, but is otherwise the same as
         * [AclServiceAsync.list].
         */
        @MustBeClosed
        fun list(params: AclListParams): CompletableFuture<HttpResponseFor<AclListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(params: AclListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AclListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /v1/acl/{acl_id}`, but is otherwise the
         * same as [AclServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: AclDeleteParams): CompletableFuture<HttpResponseFor<Acl>> =
            delete(
              params, RequestOptions.none()
            )

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: AclDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Acl>>

        /**
         * Returns a raw HTTP response for `post /v1/acl/batch-update`, but is otherwise
         * the same as [AclServiceAsync.batchUpdate].
         */
        @MustBeClosed
        fun batchUpdate(): CompletableFuture<HttpResponseFor<AclBatchUpdateResponse>> = batchUpdate(AclBatchUpdateParams.none())

        /** @see [batchUpdate] */
        @MustBeClosed
        fun batchUpdate(params: AclBatchUpdateParams = AclBatchUpdateParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<AclBatchUpdateResponse>>

        /** @see [batchUpdate] */
        @MustBeClosed
        fun batchUpdate(params: AclBatchUpdateParams = AclBatchUpdateParams.none()): CompletableFuture<HttpResponseFor<AclBatchUpdateResponse>> =
            batchUpdate(
              params, RequestOptions.none()
            )

        /** @see [batchUpdate] */
        @MustBeClosed
        fun batchUpdate(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<AclBatchUpdateResponse>> = batchUpdate(AclBatchUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/acl`, but is otherwise the same as
         * [AclServiceAsync.findAndDelete].
         */
        @MustBeClosed
        fun findAndDelete(params: AclFindAndDeleteParams): CompletableFuture<HttpResponseFor<Acl>> =
            findAndDelete(
              params, RequestOptions.none()
            )

        /** @see [findAndDelete] */
        @MustBeClosed
        fun findAndDelete(params: AclFindAndDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Acl>>
    }
}
