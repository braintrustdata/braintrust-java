// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.View
import com.braintrustdata.api.models.ViewCreateParams
import com.braintrustdata.api.models.ViewDeleteParams
import com.braintrustdata.api.models.ViewListPageAsync
import com.braintrustdata.api.models.ViewListParams
import com.braintrustdata.api.models.ViewReplaceParams
import com.braintrustdata.api.models.ViewRetrieveParams
import com.braintrustdata.api.models.ViewUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface ViewServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new view. If there is an existing view with the same name as the one
     * specified in the request, will return the existing view unmodified
     */
    fun create(params: ViewCreateParams): CompletableFuture<View> =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: ViewCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<View>

    /** Get a view object by its id */
    fun retrieve(params: ViewRetrieveParams): CompletableFuture<View> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: ViewRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<View>

    /**
     * Partially update a view object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do
     * not support removing fields or setting them to null.
     */
    fun update(params: ViewUpdateParams): CompletableFuture<View> =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(params: ViewUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<View>

    /**
     * List out all views. The views are sorted by creation date, with the most
     * recently-created views coming first
     */
    fun list(params: ViewListParams): CompletableFuture<ViewListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(params: ViewListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ViewListPageAsync>

    /** Delete a view object by its id */
    fun delete(params: ViewDeleteParams): CompletableFuture<View> =
        delete(
          params, RequestOptions.none()
        )

    /** @see [delete] */
    fun delete(params: ViewDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<View>

    /**
     * Create or replace view. If there is an existing view with the same name as the
     * one specified in the request, will replace the existing view with the provided
     * fields
     */
    fun replace(params: ViewReplaceParams): CompletableFuture<View> =
        replace(
          params, RequestOptions.none()
        )

    /** @see [replace] */
    fun replace(params: ViewReplaceParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<View>

    /**
     * A view of [ViewServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/view`, but is otherwise the same as
         * [ViewServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: ViewCreateParams): CompletableFuture<HttpResponseFor<View>> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: ViewCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<View>>

        /**
         * Returns a raw HTTP response for `get /v1/view/{view_id}`, but is otherwise the
         * same as [ViewServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ViewRetrieveParams): CompletableFuture<HttpResponseFor<View>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ViewRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<View>>

        /**
         * Returns a raw HTTP response for `patch /v1/view/{view_id}`, but is otherwise the
         * same as [ViewServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: ViewUpdateParams): CompletableFuture<HttpResponseFor<View>> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: ViewUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<View>>

        /**
         * Returns a raw HTTP response for `get /v1/view`, but is otherwise the same as
         * [ViewServiceAsync.list].
         */
        @MustBeClosed
        fun list(params: ViewListParams): CompletableFuture<HttpResponseFor<ViewListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(params: ViewListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ViewListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /v1/view/{view_id}`, but is otherwise
         * the same as [ViewServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: ViewDeleteParams): CompletableFuture<HttpResponseFor<View>> =
            delete(
              params, RequestOptions.none()
            )

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: ViewDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<View>>

        /**
         * Returns a raw HTTP response for `put /v1/view`, but is otherwise the same as
         * [ViewServiceAsync.replace].
         */
        @MustBeClosed
        fun replace(params: ViewReplaceParams): CompletableFuture<HttpResponseFor<View>> =
            replace(
              params, RequestOptions.none()
            )

        /** @see [replace] */
        @MustBeClosed
        fun replace(params: ViewReplaceParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<View>>
    }
}
