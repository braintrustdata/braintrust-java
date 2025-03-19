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
import com.braintrustdata.api.models.Experiment
import com.braintrustdata.api.models.ExperimentCreateParams
import com.braintrustdata.api.models.ExperimentDeleteParams
import com.braintrustdata.api.models.ExperimentFeedbackParams
import com.braintrustdata.api.models.ExperimentFetchParams
import com.braintrustdata.api.models.ExperimentFetchPostParams
import com.braintrustdata.api.models.ExperimentInsertParams
import com.braintrustdata.api.models.ExperimentListPageAsync
import com.braintrustdata.api.models.ExperimentListParams
import com.braintrustdata.api.models.ExperimentRetrieveParams
import com.braintrustdata.api.models.ExperimentSummarizeParams
import com.braintrustdata.api.models.ExperimentUpdateParams
import com.braintrustdata.api.models.FeedbackResponseSchema
import com.braintrustdata.api.models.FetchExperimentEventsResponse
import com.braintrustdata.api.models.InsertEventsResponse
import com.braintrustdata.api.models.SummarizeExperimentResponse
import java.util.concurrent.CompletableFuture

class ExperimentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ExperimentServiceAsync {

    private val withRawResponse: ExperimentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExperimentServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: ExperimentCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Experiment> =
        // post /v1/experiment
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ExperimentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Experiment> =
        // get /v1/experiment/{experiment_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ExperimentUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Experiment> =
        // patch /v1/experiment/{experiment_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ExperimentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExperimentListPageAsync> =
        // get /v1/experiment
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ExperimentDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Experiment> =
        // delete /v1/experiment/{experiment_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun feedback(
        params: ExperimentFeedbackParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackResponseSchema> =
        // post /v1/experiment/{experiment_id}/feedback
        withRawResponse().feedback(params, requestOptions).thenApply { it.parse() }

    override fun fetch(
        params: ExperimentFetchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FetchExperimentEventsResponse> =
        // get /v1/experiment/{experiment_id}/fetch
        withRawResponse().fetch(params, requestOptions).thenApply { it.parse() }

    override fun fetchPost(
        params: ExperimentFetchPostParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FetchExperimentEventsResponse> =
        // post /v1/experiment/{experiment_id}/fetch
        withRawResponse().fetchPost(params, requestOptions).thenApply { it.parse() }

    override fun insert(
        params: ExperimentInsertParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsertEventsResponse> =
        // post /v1/experiment/{experiment_id}/insert
        withRawResponse().insert(params, requestOptions).thenApply { it.parse() }

    override fun summarize(
        params: ExperimentSummarizeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SummarizeExperimentResponse> =
        // get /v1/experiment/{experiment_id}/summarize
        withRawResponse().summarize(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExperimentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Experiment> =
            jsonHandler<Experiment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: ExperimentCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Experiment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "experiment")
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

        private val retrieveHandler: Handler<Experiment> =
            jsonHandler<Experiment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ExperimentRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Experiment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "experiment", params._pathParam(0))
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

        private val updateHandler: Handler<Experiment> =
            jsonHandler<Experiment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: ExperimentUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Experiment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "experiment", params._pathParam(0))
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

        private val listHandler: Handler<ExperimentListPageAsync.Response> =
            jsonHandler<ExperimentListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ExperimentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExperimentListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "experiment")
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
                                ExperimentListPageAsync.of(
                                    ExperimentServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Experiment> =
            jsonHandler<Experiment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: ExperimentDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Experiment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "experiment", params._pathParam(0))
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
            params: ExperimentFeedbackParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackResponseSchema>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "experiment", params._pathParam(0), "feedback")
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

        private val fetchHandler: Handler<FetchExperimentEventsResponse> =
            jsonHandler<FetchExperimentEventsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun fetch(
            params: ExperimentFetchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FetchExperimentEventsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "experiment", params._pathParam(0), "fetch")
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

        private val fetchPostHandler: Handler<FetchExperimentEventsResponse> =
            jsonHandler<FetchExperimentEventsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun fetchPost(
            params: ExperimentFetchPostParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FetchExperimentEventsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "experiment", params._pathParam(0), "fetch")
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
            params: ExperimentInsertParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsertEventsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "experiment", params._pathParam(0), "insert")
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

        private val summarizeHandler: Handler<SummarizeExperimentResponse> =
            jsonHandler<SummarizeExperimentResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun summarize(
            params: ExperimentSummarizeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SummarizeExperimentResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "experiment", params._pathParam(0), "summarize")
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
