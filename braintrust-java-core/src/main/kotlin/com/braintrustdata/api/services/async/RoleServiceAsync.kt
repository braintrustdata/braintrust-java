// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.Role
import com.braintrustdata.api.models.RoleCreateParams
import com.braintrustdata.api.models.RoleDeleteParams
import com.braintrustdata.api.models.RoleListPageAsync
import com.braintrustdata.api.models.RoleListParams
import com.braintrustdata.api.models.RoleReplaceParams
import com.braintrustdata.api.models.RoleRetrieveParams
import com.braintrustdata.api.models.RoleUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface RoleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new role. If there is an existing role with the same name as the one specified in
     * the request, will return the existing role unmodified
     */
    fun create(params: RoleCreateParams): CompletableFuture<Role> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: RoleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Role>

    /** Get a role object by its id */
    fun retrieve(params: RoleRetrieveParams): CompletableFuture<Role> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: RoleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Role>

    /**
     * Partially update a role object. Specify the fields to update in the payload. Any object-type
     * fields will be deep-merged with existing content. Currently we do not support removing fields
     * or setting them to null.
     */
    fun update(params: RoleUpdateParams): CompletableFuture<Role> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: RoleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Role>

    /**
     * List out all roles. The roles are sorted by creation date, with the most recently-created
     * roles coming first
     */
    fun list(): CompletableFuture<RoleListPageAsync> = list(RoleListParams.none())

    /** @see [list] */
    fun list(
        params: RoleListParams = RoleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoleListPageAsync>

    /** @see [list] */
    fun list(params: RoleListParams = RoleListParams.none()): CompletableFuture<RoleListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<RoleListPageAsync> =
        list(RoleListParams.none(), requestOptions)

    /** Delete a role object by its id */
    fun delete(params: RoleDeleteParams): CompletableFuture<Role> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: RoleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Role>

    /**
     * Create or replace role. If there is an existing role with the same name as the one specified
     * in the request, will replace the existing role with the provided fields
     */
    fun replace(params: RoleReplaceParams): CompletableFuture<Role> =
        replace(params, RequestOptions.none())

    /** @see [replace] */
    fun replace(
        params: RoleReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Role>

    /** A view of [RoleServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/role`, but is otherwise the same as
         * [RoleServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: RoleCreateParams): CompletableFuture<HttpResponseFor<Role>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: RoleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Role>>

        /**
         * Returns a raw HTTP response for `get /v1/role/{role_id}`, but is otherwise the same as
         * [RoleServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: RoleRetrieveParams): CompletableFuture<HttpResponseFor<Role>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: RoleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Role>>

        /**
         * Returns a raw HTTP response for `patch /v1/role/{role_id}`, but is otherwise the same as
         * [RoleServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: RoleUpdateParams): CompletableFuture<HttpResponseFor<Role>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: RoleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Role>>

        /**
         * Returns a raw HTTP response for `get /v1/role`, but is otherwise the same as
         * [RoleServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<RoleListPageAsync>> =
            list(RoleListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RoleListParams = RoleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoleListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RoleListParams = RoleListParams.none()
        ): CompletableFuture<HttpResponseFor<RoleListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RoleListPageAsync>> =
            list(RoleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/role/{role_id}`, but is otherwise the same as
         * [RoleServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: RoleDeleteParams): CompletableFuture<HttpResponseFor<Role>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: RoleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Role>>

        /**
         * Returns a raw HTTP response for `put /v1/role`, but is otherwise the same as
         * [RoleServiceAsync.replace].
         */
        @MustBeClosed
        fun replace(params: RoleReplaceParams): CompletableFuture<HttpResponseFor<Role>> =
            replace(params, RequestOptions.none())

        /** @see [replace] */
        @MustBeClosed
        fun replace(
            params: RoleReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Role>>
    }
}
