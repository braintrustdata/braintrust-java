// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.handlers.errorHandler
import com.braintrustdata.api.core.handlers.jsonHandler
import com.braintrustdata.api.core.handlers.withErrorHandler
import com.braintrustdata.api.core.http.HttpMethod
import com.braintrustdata.api.core.http.HttpRequest
import com.braintrustdata.api.core.http.HttpResponse.Handler
import com.braintrustdata.api.core.json
import com.braintrustdata.api.core.prepareAsync
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.SpanIFrame
import com.braintrustdata.api.models.SpanIframeCreateParams
import com.braintrustdata.api.models.SpanIframeDeleteParams
import com.braintrustdata.api.models.SpanIframeListPageAsync
import com.braintrustdata.api.models.SpanIframeListParams
import com.braintrustdata.api.models.SpanIframeReplaceParams
import com.braintrustdata.api.models.SpanIframeRetrieveParams
import com.braintrustdata.api.models.SpanIframeUpdateParams
import java.util.concurrent.CompletableFuture

class SpanIframeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SpanIframeServiceAsync {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<SpanIFrame> =
        jsonHandler<SpanIFrame>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new span_iframe. If there is an existing span_iframe with the same name as the one
     * specified in the request, will return the existing span_iframe unmodified
     */
    override fun create(
        params: SpanIframeCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpanIFrame> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "span_iframe")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<SpanIFrame> =
        jsonHandler<SpanIFrame>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a span_iframe object by its id */
    override fun retrieve(
        params: SpanIframeRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpanIFrame> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "span_iframe", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<SpanIFrame> =
        jsonHandler<SpanIFrame>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Partially update a span_iframe object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    override fun update(
        params: SpanIframeUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpanIFrame> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "span_iframe", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<SpanIframeListPageAsync.Response> =
        jsonHandler<SpanIframeListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List out all span_iframes. The span_iframes are sorted by creation date, with the most
     * recently-created span_iframes coming first
     */
    override fun list(
        params: SpanIframeListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpanIframeListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "span_iframe")
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { SpanIframeListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<SpanIFrame> =
        jsonHandler<SpanIFrame>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a span_iframe object by its id */
    override fun delete(
        params: SpanIframeDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpanIFrame> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "span_iframe", params.getPathParam(0))
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val replaceHandler: Handler<SpanIFrame> =
        jsonHandler<SpanIFrame>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create or replace span_iframe. If there is an existing span_iframe with the same name as the
     * one specified in the request, will replace the existing span_iframe with the provided fields
     */
    override fun replace(
        params: SpanIframeReplaceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpanIFrame> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("v1", "span_iframe")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { replaceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }
}
