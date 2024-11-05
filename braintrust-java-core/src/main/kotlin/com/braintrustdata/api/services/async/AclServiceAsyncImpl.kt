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

class AclServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : AclServiceAsync {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Acl> =
        jsonHandler<Acl>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new acl. If there is an existing acl with the same contents as the one specified in
     * the request, will return the existing acl unmodified
     */
    override fun create(
        params: AclCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Acl> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "acl")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<Acl> =
        jsonHandler<Acl>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an acl object by its id */
    override fun retrieve(
        params: AclRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Acl> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "acl", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<AclListPageAsync.Response> =
        jsonHandler<AclListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List out all acls. The acls are sorted by creation date, with the most recently-created acls
     * coming first
     */
    override fun list(
        params: AclListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AclListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "acl")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { AclListPageAsync.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<Acl> =
        jsonHandler<Acl>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete an acl object by its id */
    override fun delete(
        params: AclDeleteParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Acl> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "acl", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { deleteHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val batchUpdateHandler: Handler<AclBatchUpdateResponse> =
        jsonHandler<AclBatchUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Batch update acls. This operation is idempotent, so adding acls which already exist will have
     * no effect, and removing acls which do not exist will have no effect.
     */
    override fun batchUpdate(
        params: AclBatchUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AclBatchUpdateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "acl", "batch-update")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { batchUpdateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val findAndDeleteHandler: Handler<Acl> =
        jsonHandler<Acl>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a single acl */
    override fun findAndDelete(
        params: AclFindAndDeleteParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Acl> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "acl")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { findAndDeleteHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
