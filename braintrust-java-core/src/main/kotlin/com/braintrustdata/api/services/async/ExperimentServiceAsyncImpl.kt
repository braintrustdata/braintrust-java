// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpMethod
import com.braintrustdata.api.core.http.HttpRequest
import com.braintrustdata.api.core.http.HttpResponse.Handler
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.Experiment
import com.braintrustdata.api.models.ExperimentCreateParams
import com.braintrustdata.api.models.ExperimentDeleteParams
import com.braintrustdata.api.models.ExperimentFeedbackParams
import com.braintrustdata.api.models.ExperimentFetchParams
import com.braintrustdata.api.models.ExperimentFetchPostParams
import com.braintrustdata.api.models.ExperimentFetchPostResponse
import com.braintrustdata.api.models.ExperimentFetchResponse
import com.braintrustdata.api.models.ExperimentInsertParams
import com.braintrustdata.api.models.ExperimentInsertResponse
import com.braintrustdata.api.models.ExperimentListPageAsync
import com.braintrustdata.api.models.ExperimentListParams
import com.braintrustdata.api.models.ExperimentReplaceParams
import com.braintrustdata.api.models.ExperimentRetrieveParams
import com.braintrustdata.api.models.ExperimentSummarizeParams
import com.braintrustdata.api.models.ExperimentSummarizeResponse
import com.braintrustdata.api.models.ExperimentUpdateParams
import com.braintrustdata.api.services.emptyHandler
import com.braintrustdata.api.services.errorHandler
import com.braintrustdata.api.services.json
import com.braintrustdata.api.services.jsonHandler
import com.braintrustdata.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class ExperimentServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ExperimentServiceAsync {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Experiment> =
        jsonHandler<Experiment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new experiment. If there is an existing experiment in the project with the same name
     * as the one specified in the request, will return the existing experiment unmodified
     */
    override fun create(
        params: ExperimentCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Experiment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "experiment")
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

    private val retrieveHandler: Handler<Experiment> =
        jsonHandler<Experiment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an experiment object by its id */
    override fun retrieve(
        params: ExperimentRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Experiment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "experiment", params.getPathParam(0))
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

    private val updateHandler: Handler<Experiment> =
        jsonHandler<Experiment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Partially update an experiment object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    override fun update(
        params: ExperimentUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Experiment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "experiment", params.getPathParam(0))
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

    private val listHandler: Handler<ExperimentListPageAsync.Response> =
        jsonHandler<ExperimentListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List out all experiments. The experiments are sorted by creation date, with the most
     * recently-created experiments coming first
     */
    override fun list(
        params: ExperimentListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExperimentListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "experiment")
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
                .let { ExperimentListPageAsync.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<Experiment> =
        jsonHandler<Experiment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete an experiment object by its id */
    override fun delete(
        params: ExperimentDeleteParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Experiment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "experiment", params.getPathParam(0))
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

    /** Log feedback for a set of experiment events */
    override fun feedback(
        params: ExperimentFeedbackParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Void> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "experiment", params.getPathParam(0), "feedback")
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

    private val fetchHandler: Handler<ExperimentFetchResponse> =
        jsonHandler<ExperimentFetchResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch the events in an experiment. Equivalent to the POST form of the same path, but with the
     * parameters in the URL query rather than in the request body
     */
    override fun fetch(
        params: ExperimentFetchParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExperimentFetchResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "experiment", params.getPathParam(0), "fetch")
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

    private val fetchPostHandler: Handler<ExperimentFetchPostResponse> =
        jsonHandler<ExperimentFetchPostResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch the events in an experiment. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query
     */
    override fun fetchPost(
        params: ExperimentFetchPostParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExperimentFetchPostResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "experiment", params.getPathParam(0), "fetch")
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

    private val insertHandler: Handler<ExperimentInsertResponse> =
        jsonHandler<ExperimentInsertResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Insert a set of events into the experiment */
    override fun insert(
        params: ExperimentInsertParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExperimentInsertResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "experiment", params.getPathParam(0), "insert")
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

    private val replaceHandler: Handler<Experiment> =
        jsonHandler<Experiment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * NOTE: This operation is deprecated and will be removed in a future revision of the API.
     * Create or replace a new experiment. If there is an existing experiment in the project with
     * the same name as the one specified in the request, will return the existing experiment
     * unmodified, will replace the existing experiment with the provided fields
     */
    override fun replace(
        params: ExperimentReplaceParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Experiment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("v1", "experiment")
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

    private val summarizeHandler: Handler<ExperimentSummarizeResponse> =
        jsonHandler<ExperimentSummarizeResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Summarize experiment */
    override fun summarize(
        params: ExperimentSummarizeParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExperimentSummarizeResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "experiment", params.getPathParam(0), "summarize")
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
