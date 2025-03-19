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
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.core.http.json
import com.braintrustdata.api.core.http.parseable
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

    private val withRawResponse: SpanIframeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SpanIframeServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: SpanIframeCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpanIFrame> =
        // post /v1/span_iframe
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: SpanIframeRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpanIFrame> =
        // get /v1/span_iframe/{span_iframe_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: SpanIframeUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpanIFrame> =
        // patch /v1/span_iframe/{span_iframe_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SpanIframeListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpanIframeListPageAsync> =
        // get /v1/span_iframe
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SpanIframeDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpanIFrame> =
        // delete /v1/span_iframe/{span_iframe_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun replace(
        params: SpanIframeReplaceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpanIFrame> =
        // put /v1/span_iframe
        withRawResponse().replace(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SpanIframeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<SpanIFrame> =
            jsonHandler<SpanIFrame>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: SpanIframeCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SpanIFrame>> {
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
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<SpanIFrame> =
            jsonHandler<SpanIFrame>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: SpanIframeRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SpanIFrame>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "span_iframe", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<SpanIFrame> =
            jsonHandler<SpanIFrame>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: SpanIframeUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SpanIFrame>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "span_iframe", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<SpanIframeListPageAsync.Response> =
            jsonHandler<SpanIframeListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: SpanIframeListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SpanIframeListPageAsync>> {
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
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                SpanIframeListPageAsync.of(
                                    SpanIframeServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<SpanIFrame> =
            jsonHandler<SpanIFrame>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: SpanIframeDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SpanIFrame>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "span_iframe", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val replaceHandler: Handler<SpanIFrame> =
            jsonHandler<SpanIFrame>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun replace(
            params: SpanIframeReplaceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SpanIFrame>> {
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
                    response.parseable {
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
    }
}
