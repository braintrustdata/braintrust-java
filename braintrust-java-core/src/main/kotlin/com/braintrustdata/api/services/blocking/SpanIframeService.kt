// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.SpanIFrame
import com.braintrustdata.api.models.SpanIframeCreateParams
import com.braintrustdata.api.models.SpanIframeDeleteParams
import com.braintrustdata.api.models.SpanIframeListPage
import com.braintrustdata.api.models.SpanIframeListParams
import com.braintrustdata.api.models.SpanIframeReplaceParams
import com.braintrustdata.api.models.SpanIframeRetrieveParams
import com.braintrustdata.api.models.SpanIframeUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface SpanIframeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new span_iframe. If there is an existing span_iframe with the same name as the one
     * specified in the request, will return the existing span_iframe unmodified
     */
    fun create(params: SpanIframeCreateParams): SpanIFrame = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: SpanIframeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpanIFrame

    /** Get a span_iframe object by its id */
    fun retrieve(spanIframeId: String): SpanIFrame =
        retrieve(spanIframeId, SpanIframeRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        spanIframeId: String,
        params: SpanIframeRetrieveParams = SpanIframeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpanIFrame = retrieve(params.toBuilder().spanIframeId(spanIframeId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        spanIframeId: String,
        params: SpanIframeRetrieveParams = SpanIframeRetrieveParams.none(),
    ): SpanIFrame = retrieve(spanIframeId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: SpanIframeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpanIFrame

    /** @see [retrieve] */
    fun retrieve(params: SpanIframeRetrieveParams): SpanIFrame =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(spanIframeId: String, requestOptions: RequestOptions): SpanIFrame =
        retrieve(spanIframeId, SpanIframeRetrieveParams.none(), requestOptions)

    /**
     * Partially update a span_iframe object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    fun update(spanIframeId: String): SpanIFrame =
        update(spanIframeId, SpanIframeUpdateParams.none())

    /** @see [update] */
    fun update(
        spanIframeId: String,
        params: SpanIframeUpdateParams = SpanIframeUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpanIFrame = update(params.toBuilder().spanIframeId(spanIframeId).build(), requestOptions)

    /** @see [update] */
    fun update(
        spanIframeId: String,
        params: SpanIframeUpdateParams = SpanIframeUpdateParams.none(),
    ): SpanIFrame = update(spanIframeId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: SpanIframeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpanIFrame

    /** @see [update] */
    fun update(params: SpanIframeUpdateParams): SpanIFrame = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(spanIframeId: String, requestOptions: RequestOptions): SpanIFrame =
        update(spanIframeId, SpanIframeUpdateParams.none(), requestOptions)

    /**
     * List out all span_iframes. The span_iframes are sorted by creation date, with the most
     * recently-created span_iframes coming first
     */
    fun list(): SpanIframeListPage = list(SpanIframeListParams.none())

    /** @see [list] */
    fun list(
        params: SpanIframeListParams = SpanIframeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpanIframeListPage

    /** @see [list] */
    fun list(params: SpanIframeListParams = SpanIframeListParams.none()): SpanIframeListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): SpanIframeListPage =
        list(SpanIframeListParams.none(), requestOptions)

    /** Delete a span_iframe object by its id */
    fun delete(spanIframeId: String): SpanIFrame =
        delete(spanIframeId, SpanIframeDeleteParams.none())

    /** @see [delete] */
    fun delete(
        spanIframeId: String,
        params: SpanIframeDeleteParams = SpanIframeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpanIFrame = delete(params.toBuilder().spanIframeId(spanIframeId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        spanIframeId: String,
        params: SpanIframeDeleteParams = SpanIframeDeleteParams.none(),
    ): SpanIFrame = delete(spanIframeId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: SpanIframeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpanIFrame

    /** @see [delete] */
    fun delete(params: SpanIframeDeleteParams): SpanIFrame = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(spanIframeId: String, requestOptions: RequestOptions): SpanIFrame =
        delete(spanIframeId, SpanIframeDeleteParams.none(), requestOptions)

    /**
     * Create or replace span_iframe. If there is an existing span_iframe with the same name as the
     * one specified in the request, will replace the existing span_iframe with the provided fields
     */
    fun replace(params: SpanIframeReplaceParams): SpanIFrame =
        replace(params, RequestOptions.none())

    /** @see [replace] */
    fun replace(
        params: SpanIframeReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpanIFrame

    /** A view of [SpanIframeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/span_iframe`, but is otherwise the same as
         * [SpanIframeService.create].
         */
        @MustBeClosed
        fun create(params: SpanIframeCreateParams): HttpResponseFor<SpanIFrame> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SpanIframeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpanIFrame>

        /**
         * Returns a raw HTTP response for `get /v1/span_iframe/{span_iframe_id}`, but is otherwise
         * the same as [SpanIframeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(spanIframeId: String): HttpResponseFor<SpanIFrame> =
            retrieve(spanIframeId, SpanIframeRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            spanIframeId: String,
            params: SpanIframeRetrieveParams = SpanIframeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpanIFrame> =
            retrieve(params.toBuilder().spanIframeId(spanIframeId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            spanIframeId: String,
            params: SpanIframeRetrieveParams = SpanIframeRetrieveParams.none(),
        ): HttpResponseFor<SpanIFrame> = retrieve(spanIframeId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SpanIframeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpanIFrame>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: SpanIframeRetrieveParams): HttpResponseFor<SpanIFrame> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            spanIframeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SpanIFrame> =
            retrieve(spanIframeId, SpanIframeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/span_iframe/{span_iframe_id}`, but is
         * otherwise the same as [SpanIframeService.update].
         */
        @MustBeClosed
        fun update(spanIframeId: String): HttpResponseFor<SpanIFrame> =
            update(spanIframeId, SpanIframeUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            spanIframeId: String,
            params: SpanIframeUpdateParams = SpanIframeUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpanIFrame> =
            update(params.toBuilder().spanIframeId(spanIframeId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            spanIframeId: String,
            params: SpanIframeUpdateParams = SpanIframeUpdateParams.none(),
        ): HttpResponseFor<SpanIFrame> = update(spanIframeId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: SpanIframeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpanIFrame>

        /** @see [update] */
        @MustBeClosed
        fun update(params: SpanIframeUpdateParams): HttpResponseFor<SpanIFrame> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            spanIframeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SpanIFrame> =
            update(spanIframeId, SpanIframeUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/span_iframe`, but is otherwise the same as
         * [SpanIframeService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SpanIframeListPage> = list(SpanIframeListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SpanIframeListParams = SpanIframeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpanIframeListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SpanIframeListParams = SpanIframeListParams.none()
        ): HttpResponseFor<SpanIframeListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SpanIframeListPage> =
            list(SpanIframeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/span_iframe/{span_iframe_id}`, but is
         * otherwise the same as [SpanIframeService.delete].
         */
        @MustBeClosed
        fun delete(spanIframeId: String): HttpResponseFor<SpanIFrame> =
            delete(spanIframeId, SpanIframeDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            spanIframeId: String,
            params: SpanIframeDeleteParams = SpanIframeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpanIFrame> =
            delete(params.toBuilder().spanIframeId(spanIframeId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            spanIframeId: String,
            params: SpanIframeDeleteParams = SpanIframeDeleteParams.none(),
        ): HttpResponseFor<SpanIFrame> = delete(spanIframeId, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: SpanIframeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpanIFrame>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: SpanIframeDeleteParams): HttpResponseFor<SpanIFrame> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            spanIframeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SpanIFrame> =
            delete(spanIframeId, SpanIframeDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/span_iframe`, but is otherwise the same as
         * [SpanIframeService.replace].
         */
        @MustBeClosed
        fun replace(params: SpanIframeReplaceParams): HttpResponseFor<SpanIFrame> =
            replace(params, RequestOptions.none())

        /** @see [replace] */
        @MustBeClosed
        fun replace(
            params: SpanIframeReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpanIFrame>
    }
}
