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
import com.braintrustdata.api.models.Acl
import com.braintrustdata.api.models.AclBatchUpdateParams
import com.braintrustdata.api.models.AclBatchUpdateResponse
import com.braintrustdata.api.models.AclCreateParams
import com.braintrustdata.api.models.AclDeleteParams
import com.braintrustdata.api.models.AclFindAndDeleteParams
import com.braintrustdata.api.models.AclListPageAsync
import com.braintrustdata.api.models.AclListParams
import com.braintrustdata.api.models.AclRetrieveParams
import java.util.concurrent.CompletableFuture

class AclServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AclServiceAsync {

    private val withRawResponse: AclServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AclServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: AclCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Acl> =
        // post /v1/acl
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AclRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Acl> =
        // get /v1/acl/{acl_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AclListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AclListPageAsync> =
        // get /v1/acl
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AclDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Acl> =
        // delete /v1/acl/{acl_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun batchUpdate(
        params: AclBatchUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AclBatchUpdateResponse> =
        // post /v1/acl/batch-update
        withRawResponse().batchUpdate(params, requestOptions).thenApply { it.parse() }

    override fun findAndDelete(
        params: AclFindAndDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Acl> =
        // delete /v1/acl
        withRawResponse().findAndDelete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AclServiceAsync.WithRawResponse {

        private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Acl> =
            jsonHandler<Acl>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: AclCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Acl>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "acl")
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

        private val retrieveHandler: Handler<Acl> =
            jsonHandler<Acl>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AclRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Acl>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "acl", params.getPathParam(0))
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

        private val listHandler: Handler<AclListPageAsync.Response> =
            jsonHandler<AclListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AclListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AclListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "acl")
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
                                AclListPageAsync.of(AclServiceAsyncImpl(clientOptions), params, it)
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Acl> =
            jsonHandler<Acl>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: AclDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Acl>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "acl", params.getPathParam(0))
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

        private val batchUpdateHandler: Handler<AclBatchUpdateResponse> =
            jsonHandler<AclBatchUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun batchUpdate(
            params: AclBatchUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AclBatchUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "acl", "batch-update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { batchUpdateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val findAndDeleteHandler: Handler<Acl> =
            jsonHandler<Acl>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun findAndDelete(
            params: AclFindAndDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Acl>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "acl")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { findAndDeleteHandler.handle(it) }
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
