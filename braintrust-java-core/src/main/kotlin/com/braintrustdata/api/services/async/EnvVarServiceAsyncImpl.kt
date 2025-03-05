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
import com.braintrustdata.api.models.EnvVar
import com.braintrustdata.api.models.EnvVarCreateParams
import com.braintrustdata.api.models.EnvVarDeleteParams
import com.braintrustdata.api.models.EnvVarListParams
import com.braintrustdata.api.models.EnvVarListResponse
import com.braintrustdata.api.models.EnvVarReplaceParams
import com.braintrustdata.api.models.EnvVarRetrieveParams
import com.braintrustdata.api.models.EnvVarUpdateParams
import java.util.concurrent.CompletableFuture

class EnvVarServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EnvVarServiceAsync {

    private val withRawResponse: EnvVarServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EnvVarServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: EnvVarCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvVar> =
        // post /v1/env_var
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: EnvVarRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvVar> =
        // get /v1/env_var/{env_var_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: EnvVarUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvVar> =
        // patch /v1/env_var/{env_var_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EnvVarListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvVarListResponse> =
        // get /v1/env_var
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: EnvVarDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvVar> =
        // delete /v1/env_var/{env_var_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun replace(
        params: EnvVarReplaceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvVar> =
        // put /v1/env_var
        withRawResponse().replace(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EnvVarServiceAsync.WithRawResponse {

        private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<EnvVar> =
            jsonHandler<EnvVar>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: EnvVarCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnvVar>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "env_var")
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

        private val retrieveHandler: Handler<EnvVar> =
            jsonHandler<EnvVar>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: EnvVarRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnvVar>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "env_var", params.getPathParam(0))
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

        private val updateHandler: Handler<EnvVar> =
            jsonHandler<EnvVar>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: EnvVarUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnvVar>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "env_var", params.getPathParam(0))
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

        private val listHandler: Handler<EnvVarListResponse> =
            jsonHandler<EnvVarListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: EnvVarListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnvVarListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "env_var")
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
                    }
                }
        }

        private val deleteHandler: Handler<EnvVar> =
            jsonHandler<EnvVar>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: EnvVarDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnvVar>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "env_var", params.getPathParam(0))
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

        private val replaceHandler: Handler<EnvVar> =
            jsonHandler<EnvVar>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun replace(
            params: EnvVarReplaceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnvVar>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("v1", "env_var")
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
