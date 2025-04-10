// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.JsonValue
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
import com.braintrustdata.api.core.prepare
import com.braintrustdata.api.models.Experiment
import com.braintrustdata.api.models.ExperimentCreateParams
import com.braintrustdata.api.models.ExperimentDeleteParams
import com.braintrustdata.api.models.ExperimentFeedbackParams
import com.braintrustdata.api.models.ExperimentFetchParams
import com.braintrustdata.api.models.ExperimentFetchPostParams
import com.braintrustdata.api.models.ExperimentInsertParams
import com.braintrustdata.api.models.ExperimentListPage
import com.braintrustdata.api.models.ExperimentListPageResponse
import com.braintrustdata.api.models.ExperimentListParams
import com.braintrustdata.api.models.ExperimentRetrieveParams
import com.braintrustdata.api.models.ExperimentSummarizeParams
import com.braintrustdata.api.models.ExperimentUpdateParams
import com.braintrustdata.api.models.FeedbackResponseSchema
import com.braintrustdata.api.models.FetchExperimentEventsResponse
import com.braintrustdata.api.models.InsertEventsResponse
import com.braintrustdata.api.models.SummarizeExperimentResponse

class ExperimentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExperimentService {

    private val withRawResponse: ExperimentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExperimentService.WithRawResponse = withRawResponse

    override fun create(
        params: ExperimentCreateParams,
        requestOptions: RequestOptions,
    ): Experiment =
        // post /v1/experiment
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ExperimentRetrieveParams,
        requestOptions: RequestOptions,
    ): Experiment =
        // get /v1/experiment/{experiment_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ExperimentUpdateParams,
        requestOptions: RequestOptions,
    ): Experiment =
        // patch /v1/experiment/{experiment_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ExperimentListParams,
        requestOptions: RequestOptions,
    ): ExperimentListPage =
        // get /v1/experiment
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ExperimentDeleteParams,
        requestOptions: RequestOptions,
    ): Experiment =
        // delete /v1/experiment/{experiment_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun feedback(
        params: ExperimentFeedbackParams,
        requestOptions: RequestOptions,
    ): FeedbackResponseSchema =
        // post /v1/experiment/{experiment_id}/feedback
        withRawResponse().feedback(params, requestOptions).parse()

    override fun fetch(
        params: ExperimentFetchParams,
        requestOptions: RequestOptions,
    ): FetchExperimentEventsResponse =
        // get /v1/experiment/{experiment_id}/fetch
        withRawResponse().fetch(params, requestOptions).parse()

    override fun fetchPost(
        params: ExperimentFetchPostParams,
        requestOptions: RequestOptions,
    ): FetchExperimentEventsResponse =
        // post /v1/experiment/{experiment_id}/fetch
        withRawResponse().fetchPost(params, requestOptions).parse()

    override fun insert(
        params: ExperimentInsertParams,
        requestOptions: RequestOptions,
    ): InsertEventsResponse =
        // post /v1/experiment/{experiment_id}/insert
        withRawResponse().insert(params, requestOptions).parse()

    override fun summarize(
        params: ExperimentSummarizeParams,
        requestOptions: RequestOptions,
    ): SummarizeExperimentResponse =
        // get /v1/experiment/{experiment_id}/summarize
        withRawResponse().summarize(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExperimentService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Experiment> =
            jsonHandler<Experiment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: ExperimentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Experiment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "experiment")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Experiment> =
            jsonHandler<Experiment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ExperimentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Experiment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "experiment", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Experiment> =
            jsonHandler<Experiment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: ExperimentUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Experiment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "experiment", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ExperimentListPageResponse> =
            jsonHandler<ExperimentListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ExperimentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExperimentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "experiment")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { ExperimentListPage.of(ExperimentServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<Experiment> =
            jsonHandler<Experiment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: ExperimentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Experiment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "experiment", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<FeedbackResponseSchema> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "experiment", params._pathParam(0), "feedback")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { feedbackHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<FetchExperimentEventsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "experiment", params._pathParam(0), "fetch")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { fetchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<FetchExperimentEventsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "experiment", params._pathParam(0), "fetch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { fetchPostHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<InsertEventsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "experiment", params._pathParam(0), "insert")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { insertHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<SummarizeExperimentResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "experiment", params._pathParam(0), "summarize")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
