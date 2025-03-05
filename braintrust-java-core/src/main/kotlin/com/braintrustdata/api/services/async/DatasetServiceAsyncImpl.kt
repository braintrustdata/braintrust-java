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
import com.braintrustdata.api.core.http.parseable
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

    private val withRawResponse: DatasetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DatasetServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: DatasetCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Dataset> =
        // post /v1/dataset
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Dataset> =
        // get /v1/dataset/{dataset_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: DatasetUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Dataset> =
        // patch /v1/dataset/{dataset_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetListPageAsync> =
        // get /v1/dataset
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: DatasetDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Dataset> =
        // delete /v1/dataset/{dataset_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun feedback(
        params: DatasetFeedbackParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackResponseSchema> =
        // post /v1/dataset/{dataset_id}/feedback
        withRawResponse().feedback(params, requestOptions).thenApply { it.parse() }

    override fun fetch(
        params: DatasetFetchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FetchDatasetEventsResponse> =
        // get /v1/dataset/{dataset_id}/fetch
        withRawResponse().fetch(params, requestOptions).thenApply { it.parse() }

    override fun fetchPost(
        params: DatasetFetchPostParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FetchDatasetEventsResponse> =
        // post /v1/dataset/{dataset_id}/fetch
        withRawResponse().fetchPost(params, requestOptions).thenApply { it.parse() }

    override fun insert(
        params: DatasetInsertParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsertEventsResponse> =
        // post /v1/dataset/{dataset_id}/insert
        withRawResponse().insert(params, requestOptions).thenApply { it.parse() }

    override fun summarize(
        params: DatasetSummarizeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SummarizeDatasetResponse> =
        // get /v1/dataset/{dataset_id}/summarize
        withRawResponse().summarize(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DatasetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Dataset> =
            jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: DatasetCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Dataset>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "dataset")
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

        private val retrieveHandler: Handler<Dataset> =
            jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: DatasetRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Dataset>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "dataset", params.getPathParam(0))
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

        private val updateHandler: Handler<Dataset> =
            jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: DatasetUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Dataset>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "dataset", params.getPathParam(0))
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

        private val listHandler: Handler<DatasetListPageAsync.Response> =
            jsonHandler<DatasetListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DatasetListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "dataset")
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
                                DatasetListPageAsync.of(
                                    DatasetServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Dataset> =
            jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: DatasetDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Dataset>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "dataset", params.getPathParam(0))
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

        private val feedbackHandler: Handler<FeedbackResponseSchema> =
            jsonHandler<FeedbackResponseSchema>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun feedback(
            params: DatasetFeedbackParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackResponseSchema>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "dataset", params.getPathParam(0), "feedback")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { feedbackHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val fetchHandler: Handler<FetchDatasetEventsResponse> =
            jsonHandler<FetchDatasetEventsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun fetch(
            params: DatasetFetchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FetchDatasetEventsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "dataset", params.getPathParam(0), "fetch")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { fetchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val fetchPostHandler: Handler<FetchDatasetEventsResponse> =
            jsonHandler<FetchDatasetEventsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun fetchPost(
            params: DatasetFetchPostParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FetchDatasetEventsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "dataset", params.getPathParam(0), "fetch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { fetchPostHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val insertHandler: Handler<InsertEventsResponse> =
            jsonHandler<InsertEventsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun insert(
            params: DatasetInsertParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsertEventsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "dataset", params.getPathParam(0), "insert")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { insertHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val summarizeHandler: Handler<SummarizeDatasetResponse> =
            jsonHandler<SummarizeDatasetResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun summarize(
            params: DatasetSummarizeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SummarizeDatasetResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "dataset", params.getPathParam(0), "summarize")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { summarizeHandler.handle(it) }
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
