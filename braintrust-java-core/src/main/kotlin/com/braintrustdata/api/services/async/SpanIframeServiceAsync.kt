// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.models.SpanIFrame
import com.braintrustdata.api.models.SpanIframeCreateParams
import com.braintrustdata.api.models.SpanIframeDeleteParams
import com.braintrustdata.api.models.SpanIframeListPageAsync
import com.braintrustdata.api.models.SpanIframeListParams
import com.braintrustdata.api.models.SpanIframeReplaceParams
import com.braintrustdata.api.models.SpanIframeRetrieveParams
import com.braintrustdata.api.models.SpanIframeUpdateParams
import java.util.concurrent.CompletableFuture

interface SpanIframeServiceAsync {

    /**
     * Create a new span_iframe. If there is an existing span_iframe with the same name as the one
     * specified in the request, will return the existing span_iframe unmodified
     */
    @JvmOverloads
    fun create(
        params: SpanIframeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpanIFrame>

    /** Get a span_iframe object by its id */
    @JvmOverloads
    fun retrieve(
        params: SpanIframeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpanIFrame>

    /**
     * Partially update a span_iframe object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(
        params: SpanIframeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpanIFrame>

    /**
     * List out all span_iframes. The span_iframes are sorted by creation date, with the most
     * recently-created span_iframes coming first
     */
    @JvmOverloads
    fun list(
        params: SpanIframeListParams = SpanIframeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpanIframeListPageAsync>

    /**
     * List out all span_iframes. The span_iframes are sorted by creation date, with the most
     * recently-created span_iframes coming first
     */
    fun list(requestOptions: RequestOptions): CompletableFuture<SpanIframeListPageAsync> =
        list(SpanIframeListParams.none(), requestOptions)

    /** Delete a span_iframe object by its id */
    @JvmOverloads
    fun delete(
        params: SpanIframeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpanIFrame>

    /**
     * Create or replace span_iframe. If there is an existing span_iframe with the same name as the
     * one specified in the request, will replace the existing span_iframe with the provided fields
     */
    @JvmOverloads
    fun replace(
        params: SpanIframeReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpanIFrame>
}
