// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.Group
import com.braintrustdata.api.models.GroupCreateParams
import com.braintrustdata.api.models.GroupDeleteParams
import com.braintrustdata.api.models.GroupListPageAsync
import com.braintrustdata.api.models.GroupListParams
import com.braintrustdata.api.models.GroupReplaceParams
import com.braintrustdata.api.models.GroupRetrieveParams
import com.braintrustdata.api.models.GroupUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface GroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new group. If there is an existing group with the same name as the one
     * specified in the request, will return the existing group unmodified
     */
    fun create(params: GroupCreateParams): CompletableFuture<Group> =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: GroupCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Group>

    /** Get a group object by its id */
    fun retrieve(params: GroupRetrieveParams): CompletableFuture<Group> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: GroupRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Group>

    /**
     * Partially update a group object. Specify the fields to update in the payload.
     * Any object-type fields will be deep-merged with existing content. Currently we
     * do not support removing fields or setting them to null.
     */
    fun update(params: GroupUpdateParams): CompletableFuture<Group> =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(params: GroupUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Group>

    /**
     * List out all groups. The groups are sorted by creation date, with the most
     * recently-created groups coming first
     */
    fun list(): CompletableFuture<GroupListPageAsync> = list(GroupListParams.none())

    /** @see [list] */
    fun list(params: GroupListParams = GroupListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<GroupListPageAsync>

    /** @see [list] */
    fun list(params: GroupListParams = GroupListParams.none()): CompletableFuture<GroupListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<GroupListPageAsync> = list(GroupListParams.none(), requestOptions)

    /** Delete a group object by its id */
    fun delete(params: GroupDeleteParams): CompletableFuture<Group> =
        delete(
          params, RequestOptions.none()
        )

    /** @see [delete] */
    fun delete(params: GroupDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Group>

    /**
     * Create or replace group. If there is an existing group with the same name as the
     * one specified in the request, will replace the existing group with the provided
     * fields
     */
    fun replace(params: GroupReplaceParams): CompletableFuture<Group> =
        replace(
          params, RequestOptions.none()
        )

    /** @see [replace] */
    fun replace(params: GroupReplaceParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Group>

    /**
     * A view of [GroupServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/group`, but is otherwise the same as
         * [GroupServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: GroupCreateParams): CompletableFuture<HttpResponseFor<Group>> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: GroupCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Group>>

        /**
         * Returns a raw HTTP response for `get /v1/group/{group_id}`, but is otherwise the
         * same as [GroupServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: GroupRetrieveParams): CompletableFuture<HttpResponseFor<Group>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: GroupRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Group>>

        /**
         * Returns a raw HTTP response for `patch /v1/group/{group_id}`, but is otherwise
         * the same as [GroupServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: GroupUpdateParams): CompletableFuture<HttpResponseFor<Group>> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: GroupUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Group>>

        /**
         * Returns a raw HTTP response for `get /v1/group`, but is otherwise the same as
         * [GroupServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<GroupListPageAsync>> = list(GroupListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: GroupListParams = GroupListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<GroupListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: GroupListParams = GroupListParams.none()): CompletableFuture<HttpResponseFor<GroupListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<GroupListPageAsync>> = list(GroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/group/{group_id}`, but is otherwise
         * the same as [GroupServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: GroupDeleteParams): CompletableFuture<HttpResponseFor<Group>> =
            delete(
              params, RequestOptions.none()
            )

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: GroupDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Group>>

        /**
         * Returns a raw HTTP response for `put /v1/group`, but is otherwise the same as
         * [GroupServiceAsync.replace].
         */
        @MustBeClosed
        fun replace(params: GroupReplaceParams): CompletableFuture<HttpResponseFor<Group>> =
            replace(
              params, RequestOptions.none()
            )

        /** @see [replace] */
        @MustBeClosed
        fun replace(params: GroupReplaceParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Group>>
    }
}
