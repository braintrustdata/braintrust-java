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

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<EnvVar> =
        jsonHandler<EnvVar>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new env_var. If there is an existing env_var with the same name as the one specified
     * in the request, will return the existing env_var unmodified
     */
    override fun create(
        params: EnvVarCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvVar> {
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
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<EnvVar> =
        jsonHandler<EnvVar>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an env_var object by its id */
    override fun retrieve(
        params: EnvVarRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvVar> {
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
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<EnvVar> =
        jsonHandler<EnvVar>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Partially update an env_var object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    override fun update(
        params: EnvVarUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvVar> {
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
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<EnvVarListResponse> =
        jsonHandler<EnvVarListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * List out all env_vars. The env_vars are sorted by creation date, with the most
     * recently-created env_vars coming first
     */
    override fun list(
        params: EnvVarListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvVarListResponse> {
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
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val deleteHandler: Handler<EnvVar> =
        jsonHandler<EnvVar>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete an env_var object by its id */
    override fun delete(
        params: EnvVarDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvVar> {
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
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val replaceHandler: Handler<EnvVar> =
        jsonHandler<EnvVar>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create or replace env_var. If there is an existing env_var with the same name as the one
     * specified in the request, will replace the existing env_var with the provided fields
     */
    override fun replace(
        params: EnvVarReplaceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvVar> {
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
