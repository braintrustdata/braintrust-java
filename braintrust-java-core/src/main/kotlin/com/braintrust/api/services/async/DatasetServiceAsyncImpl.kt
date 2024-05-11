// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.services.async

import com.braintrust.api.core.ClientOptions
import com.braintrust.api.core.RequestOptions
import com.braintrust.api.core.http.HttpMethod
import com.braintrust.api.core.http.HttpRequest
import com.braintrust.api.core.http.HttpResponse.Handler
import com.braintrust.api.errors.BraintrustError
import com.braintrust.api.models.Dataset
import com.braintrust.api.models.DatasetCreateParams
import com.braintrust.api.models.DatasetDeleteParams
import com.braintrust.api.models.DatasetFeedbackParams
import com.braintrust.api.models.DatasetFetchParams
import com.braintrust.api.models.DatasetFetchPostParams
import com.braintrust.api.models.DatasetFetchPostResponse
import com.braintrust.api.models.DatasetFetchResponse
import com.braintrust.api.models.DatasetInsertParams
import com.braintrust.api.models.DatasetInsertResponse
import com.braintrust.api.models.DatasetListPageAsync
import com.braintrust.api.models.DatasetListParams
import com.braintrust.api.models.DatasetReplaceParams
import com.braintrust.api.models.DatasetRetrieveParams
import com.braintrust.api.models.DatasetSummarizeParams
import com.braintrust.api.models.DatasetSummarizeResponse
import com.braintrust.api.models.DatasetUpdateParams
import com.braintrust.api.services.emptyHandler
import com.braintrust.api.services.errorHandler
import com.braintrust.api.services.json
import com.braintrust.api.services.jsonHandler
import com.braintrust.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class DatasetServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : DatasetServiceAsync {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Dataset> =
        jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new dataset. If there is an existing dataset in the project with the same name as
     * the one specified in the request, will return the existing dataset unmodified
     */
    override fun create(
        params: DatasetCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Dataset> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "dataset")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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

    private val retrieveHandler: Handler<Dataset> =
        jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a dataset object by its id */
    override fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Dataset> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "dataset", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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

    private val updateHandler: Handler<Dataset> =
        jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Partially update a dataset object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    override fun update(
        params: DatasetUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Dataset> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "dataset", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<DatasetListPageAsync.Response> =
        jsonHandler<DatasetListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List out all datasets. The datasets are sorted by creation date, with the most
     * recently-created datasets coming first
     */
    override fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DatasetListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "dataset")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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
                .let { DatasetListPageAsync.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<Dataset> =
        jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a dataset object by its id */
    override fun delete(
        params: DatasetDeleteParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Dataset> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "dataset", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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

    private val feedbackHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Log feedback for a set of dataset events */
    override fun feedback(
        params: DatasetFeedbackParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Void> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "dataset", params.getPathParam(0), "feedback")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { feedbackHandler.handle(it) }
        }
    }

    private val fetchHandler: Handler<DatasetFetchResponse> =
        jsonHandler<DatasetFetchResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Fetch the events in a dataset. Equivalent to the POST form of the same path, but with the
     * parameters in the URL query rather than in the request body
     */
    override fun fetch(
        params: DatasetFetchParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DatasetFetchResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "dataset", params.getPathParam(0), "fetch")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { fetchHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val fetchPostHandler: Handler<DatasetFetchPostResponse> =
        jsonHandler<DatasetFetchPostResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch the events in a dataset. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query
     */
    override fun fetchPost(
        params: DatasetFetchPostParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DatasetFetchPostResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "dataset", params.getPathParam(0), "fetch")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { fetchPostHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val insertHandler: Handler<DatasetInsertResponse> =
        jsonHandler<DatasetInsertResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Insert a set of events into the dataset */
    override fun insert(
        params: DatasetInsertParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DatasetInsertResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "dataset", params.getPathParam(0), "insert")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { insertHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val replaceHandler: Handler<Dataset> =
        jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * NOTE: This operation is deprecated and will be removed in a future revision of the API.
     * Create or replace a new dataset. If there is an existing dataset in the project with the same
     * name as the one specified in the request, will return the existing dataset unmodified, will
     * replace the existing dataset with the provided fields
     */
    override fun replace(
        params: DatasetReplaceParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Dataset> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("v1", "dataset")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { replaceHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val summarizeHandler: Handler<DatasetSummarizeResponse> =
        jsonHandler<DatasetSummarizeResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Summarize dataset */
    override fun summarize(
        params: DatasetSummarizeParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DatasetSummarizeResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "dataset", params.getPathParam(0), "summarize")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { summarizeHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}