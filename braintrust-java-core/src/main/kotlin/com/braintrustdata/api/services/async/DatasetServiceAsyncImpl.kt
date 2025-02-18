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
import com.braintrustdata.api.models.Dataset
import com.braintrustdata.api.models.DatasetCreateParams
import com.braintrustdata.api.models.DatasetDeleteParams
import com.braintrustdata.api.models.DatasetFeedbackParams
import com.braintrustdata.api.models.DatasetFetchParams
import com.braintrustdata.api.models.DatasetFetchPostParams
import com.braintrustdata.api.models.DatasetInsertParams
import com.braintrustdata.api.models.DatasetListPageAsync
import com.braintrustdata.api.models.DatasetListParams
import com.braintrustdata.api.models.DatasetRetrieveParams
import com.braintrustdata.api.models.DatasetSummarizeParams
import com.braintrustdata.api.models.DatasetUpdateParams
import com.braintrustdata.api.models.FeedbackResponseSchema
import com.braintrustdata.api.models.FetchDatasetEventsResponse
import com.braintrustdata.api.models.InsertEventsResponse
import com.braintrustdata.api.models.SummarizeDatasetResponse
import java.util.concurrent.CompletableFuture

class DatasetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DatasetServiceAsync {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Dataset> =
        jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new dataset. If there is an existing dataset in the project with the same name as
     * the one specified in the request, will return the existing dataset unmodified
     */
    override fun create(
        params: DatasetCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Dataset> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "dataset")
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

    private val retrieveHandler: Handler<Dataset> =
        jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a dataset object by its id */
    override fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Dataset> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "dataset", params.getPathParam(0))
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

    private val updateHandler: Handler<Dataset> =
        jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Partially update a dataset object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    override fun update(
        params: DatasetUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Dataset> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "dataset", params.getPathParam(0))
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

    private val listHandler: Handler<DatasetListPageAsync.Response> =
        jsonHandler<DatasetListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List out all datasets. The datasets are sorted by creation date, with the most
     * recently-created datasets coming first
     */
    override fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "dataset")
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
                    .let { DatasetListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<Dataset> =
        jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a dataset object by its id */
    override fun delete(
        params: DatasetDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Dataset> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "dataset", params.getPathParam(0))
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

    private val feedbackHandler: Handler<FeedbackResponseSchema> =
        jsonHandler<FeedbackResponseSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Log feedback for a set of dataset events */
    override fun feedback(
        params: DatasetFeedbackParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackResponseSchema> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "dataset", params.getPathParam(0), "feedback")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { feedbackHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val fetchHandler: Handler<FetchDatasetEventsResponse> =
        jsonHandler<FetchDatasetEventsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch the events in a dataset. Equivalent to the POST form of the same path, but with the
     * parameters in the URL query rather than in the request body. For more complex queries, use
     * the `POST /btql` endpoint.
     */
    override fun fetch(
        params: DatasetFetchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FetchDatasetEventsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "dataset", params.getPathParam(0), "fetch")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { fetchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val fetchPostHandler: Handler<FetchDatasetEventsResponse> =
        jsonHandler<FetchDatasetEventsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch the events in a dataset. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query. For more complex queries, use
     * the `POST /btql` endpoint.
     */
    override fun fetchPost(
        params: DatasetFetchPostParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FetchDatasetEventsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "dataset", params.getPathParam(0), "fetch")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { fetchPostHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val insertHandler: Handler<InsertEventsResponse> =
        jsonHandler<InsertEventsResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Insert a set of events into the dataset */
    override fun insert(
        params: DatasetInsertParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsertEventsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "dataset", params.getPathParam(0), "insert")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { insertHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val summarizeHandler: Handler<SummarizeDatasetResponse> =
        jsonHandler<SummarizeDatasetResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Summarize dataset */
    override fun summarize(
        params: DatasetSummarizeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SummarizeDatasetResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "dataset", params.getPathParam(0), "summarize")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { summarizeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
