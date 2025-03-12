// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.SpanIFrame
import com.braintrustdata.api.models.SpanIframeCreateParams
import com.braintrustdata.api.models.SpanIframeDeleteParams
import com.braintrustdata.api.models.SpanIframeListPageAsync
import com.braintrustdata.api.models.SpanIframeListParams
import com.braintrustdata.api.models.SpanIframeReplaceParams
import com.braintrustdata.api.models.SpanIframeRetrieveParams
import com.braintrustdata.api.models.SpanIframeUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface SpanIframeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new span_iframe. If there is an existing span_iframe with the same name
     * as the one specified in the request, will return the existing span_iframe
     * unmodified
     */
    fun create(params: SpanIframeCreateParams): CompletableFuture<SpanIFrame> =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: SpanIframeCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SpanIFrame>

    /** Get a span_iframe object by its id */
    fun retrieve(params: SpanIframeRetrieveParams): CompletableFuture<SpanIFrame> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: SpanIframeRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SpanIFrame>

    /**
     * Partially update a span_iframe object. Specify the fields to update in the
     * payload. Any object-type fields will be deep-merged with existing content.
     * Currently we do not support removing fields or setting them to null.
     */
    fun update(params: SpanIframeUpdateParams): CompletableFuture<SpanIFrame> =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(params: SpanIframeUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SpanIFrame>

    /**
     * List out all span_iframes. The span_iframes are sorted by creation date, with
     * the most recently-created span_iframes coming first
     */
    fun list(): CompletableFuture<SpanIframeListPageAsync> = list(SpanIframeListParams.none())

    /** @see [list] */
    fun list(params: SpanIframeListParams = SpanIframeListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SpanIframeListPageAsync>

    /** @see [list] */
    fun list(params: SpanIframeListParams = SpanIframeListParams.none()): CompletableFuture<SpanIframeListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<SpanIframeListPageAsync> = list(SpanIframeListParams.none(), requestOptions)

    /** Delete a span_iframe object by its id */
    fun delete(params: SpanIframeDeleteParams): CompletableFuture<SpanIFrame> =
        delete(
          params, RequestOptions.none()
        )

    /** @see [delete] */
    fun delete(params: SpanIframeDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SpanIFrame>

    /**
     * Create or replace span_iframe. If there is an existing span_iframe with the same
     * name as the one specified in the request, will replace the existing span_iframe
     * with the provided fields
     */
    fun replace(params: SpanIframeReplaceParams): CompletableFuture<SpanIFrame> =
        replace(
          params, RequestOptions.none()
        )

    /** @see [replace] */
    fun replace(params: SpanIframeReplaceParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SpanIFrame>

    /**
     * A view of [SpanIframeServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/span_iframe`, but is otherwise the
         * same as [SpanIframeServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: SpanIframeCreateParams): CompletableFuture<HttpResponseFor<SpanIFrame>> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: SpanIframeCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SpanIFrame>>

        /**
         * Returns a raw HTTP response for `get /v1/span_iframe/{span_iframe_id}`, but is
         * otherwise the same as [SpanIframeServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: SpanIframeRetrieveParams): CompletableFuture<HttpResponseFor<SpanIFrame>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: SpanIframeRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SpanIFrame>>

        /**
         * Returns a raw HTTP response for `patch /v1/span_iframe/{span_iframe_id}`, but is
         * otherwise the same as [SpanIframeServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: SpanIframeUpdateParams): CompletableFuture<HttpResponseFor<SpanIFrame>> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: SpanIframeUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SpanIFrame>>

        /**
         * Returns a raw HTTP response for `get /v1/span_iframe`, but is otherwise the same
         * as [SpanIframeServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<SpanIframeListPageAsync>> = list(SpanIframeListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: SpanIframeListParams = SpanIframeListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SpanIframeListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: SpanIframeListParams = SpanIframeListParams.none()): CompletableFuture<HttpResponseFor<SpanIframeListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<SpanIframeListPageAsync>> = list(SpanIframeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/span_iframe/{span_iframe_id}`, but
         * is otherwise the same as [SpanIframeServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: SpanIframeDeleteParams): CompletableFuture<HttpResponseFor<SpanIFrame>> =
            delete(
              params, RequestOptions.none()
            )

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: SpanIframeDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SpanIFrame>>

        /**
         * Returns a raw HTTP response for `put /v1/span_iframe`, but is otherwise the same
         * as [SpanIframeServiceAsync.replace].
         */
        @MustBeClosed
        fun replace(params: SpanIframeReplaceParams): CompletableFuture<HttpResponseFor<SpanIFrame>> =
            replace(
              params, RequestOptions.none()
            )

        /** @see [replace] */
        @MustBeClosed
        fun replace(params: SpanIframeReplaceParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SpanIFrame>>
    }
}
