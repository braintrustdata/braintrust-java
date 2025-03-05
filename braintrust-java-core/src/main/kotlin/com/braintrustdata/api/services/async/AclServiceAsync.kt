// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new acl. If there is an existing acl with the same contents as the one specified in
     * the request, will return the existing acl unmodified
     */
    @JvmOverloads
    fun create(
        params: AclCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Acl>

    /** Get an acl object by its id */
    @JvmOverloads
    fun retrieve(
        params: AclRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Acl>

    /**
     * List out all acls. The acls are sorted by creation date, with the most recently-created acls
     * coming first
     */
    @JvmOverloads
    fun list(
        params: AclListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AclListPageAsync>

    /** Delete an acl object by its id */
    @JvmOverloads
    fun delete(
        params: AclDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Acl>

    /**
     * Batch update acls. This operation is idempotent, so adding acls which already exist will have
     * no effect, and removing acls which do not exist will have no effect.
     */
    @JvmOverloads
    fun batchUpdate(
        params: AclBatchUpdateParams = AclBatchUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AclBatchUpdateResponse>

    /**
     * Batch update acls. This operation is idempotent, so adding acls which already exist will have
     * no effect, and removing acls which do not exist will have no effect.
     */
    fun batchUpdate(requestOptions: RequestOptions): CompletableFuture<AclBatchUpdateResponse> =
        batchUpdate(AclBatchUpdateParams.none(), requestOptions)

    /** Delete a single acl */
    @JvmOverloads
    fun findAndDelete(
        params: AclFindAndDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Acl>

    /** A view of [AclServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/acl`, but is otherwise the same as
         * [AclServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: AclCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Acl>>

        /**
         * Returns a raw HTTP response for `get /v1/acl/{acl_id}`, but is otherwise the same as
         * [AclServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: AclRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Acl>>

        /**
         * Returns a raw HTTP response for `get /v1/acl`, but is otherwise the same as
         * [AclServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: AclListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AclListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /v1/acl/{acl_id}`, but is otherwise the same as
         * [AclServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: AclDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Acl>>

        /**
         * Returns a raw HTTP response for `post /v1/acl/batch-update`, but is otherwise the same as
         * [AclServiceAsync.batchUpdate].
         */
        @JvmOverloads
        @MustBeClosed
        fun batchUpdate(
            params: AclBatchUpdateParams = AclBatchUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AclBatchUpdateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/acl/batch-update`, but is otherwise the same as
         * [AclServiceAsync.batchUpdate].
         */
        @MustBeClosed
        fun batchUpdate(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AclBatchUpdateResponse>> =
            batchUpdate(AclBatchUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/acl`, but is otherwise the same as
         * [AclServiceAsync.findAndDelete].
         */
        @JvmOverloads
        @MustBeClosed
        fun findAndDelete(
            params: AclFindAndDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Acl>>
    }
}
