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
import com.braintrustdata.api.models.Prompt
import com.braintrustdata.api.models.PromptCreateParams
import com.braintrustdata.api.models.PromptDeleteParams
import com.braintrustdata.api.models.PromptListPageAsync
import com.braintrustdata.api.models.PromptListParams
import com.braintrustdata.api.models.PromptReplaceParams
import com.braintrustdata.api.models.PromptRetrieveParams
import com.braintrustdata.api.models.PromptUpdateParams
import java.util.concurrent.CompletableFuture

class PromptServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : PromptServiceAsync {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Prompt> =
        jsonHandler<Prompt>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new prompt. If there is an existing prompt in the project with the same slug as the
     * one specified in the request, will return the existing prompt unmodified
     */
    override fun create(
        params: PromptCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Prompt> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "prompt")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<Prompt> =
        jsonHandler<Prompt>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a prompt object by its id */
    override fun retrieve(
        params: PromptRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Prompt> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "prompt", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<Prompt> =
        jsonHandler<Prompt>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Partially update a prompt object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    override fun update(
        params: PromptUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Prompt> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "prompt", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<PromptListPageAsync.Response> =
        jsonHandler<PromptListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List out all prompts. The prompts are sorted by creation date, with the most recently-created
     * prompts coming first
     */
    override fun list(
        params: PromptListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PromptListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "prompt")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { PromptListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<Prompt> =
        jsonHandler<Prompt>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a prompt object by its id */
    override fun delete(
        params: PromptDeleteParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Prompt> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "prompt", params.getPathParam(0))
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val replaceHandler: Handler<Prompt> =
        jsonHandler<Prompt>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create or replace prompt. If there is an existing prompt in the project with the same slug as
     * the one specified in the request, will replace the existing prompt with the provided fields
     */
    override fun replace(
        params: PromptReplaceParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Prompt> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("v1", "prompt")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { replaceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
