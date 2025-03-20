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
import com.braintrustdata.api.models.Dataset
import com.braintrustdata.api.models.DatasetCreateParams
import com.braintrustdata.api.models.DatasetDeleteParams
import com.braintrustdata.api.models.DatasetFeedbackParams
import com.braintrustdata.api.models.DatasetFetchParams
import com.braintrustdata.api.models.DatasetFetchPostParams
import com.braintrustdata.api.models.DatasetInsertParams
import com.braintrustdata.api.models.DatasetListPage
import com.braintrustdata.api.models.DatasetListParams
import com.braintrustdata.api.models.DatasetRetrieveParams
import com.braintrustdata.api.models.DatasetSummarizeParams
import com.braintrustdata.api.models.DatasetUpdateParams
import com.braintrustdata.api.models.FeedbackResponseSchema
import com.braintrustdata.api.models.FetchDatasetEventsResponse
import com.braintrustdata.api.models.InsertEventsResponse
import com.braintrustdata.api.models.SummarizeDatasetResponse

class DatasetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DatasetService {

    private val withRawResponse: DatasetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DatasetService.WithRawResponse = withRawResponse

    override fun create(params: DatasetCreateParams, requestOptions: RequestOptions): Dataset =
        // post /v1/dataset
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: DatasetRetrieveParams, requestOptions: RequestOptions): Dataset =
        // get /v1/dataset/{dataset_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: DatasetUpdateParams, requestOptions: RequestOptions): Dataset =
        // patch /v1/dataset/{dataset_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: DatasetListParams, requestOptions: RequestOptions): DatasetListPage =
        // get /v1/dataset
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: DatasetDeleteParams, requestOptions: RequestOptions): Dataset =
        // delete /v1/dataset/{dataset_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun feedback(
        params: DatasetFeedbackParams,
        requestOptions: RequestOptions,
    ): FeedbackResponseSchema =
        // post /v1/dataset/{dataset_id}/feedback
        withRawResponse().feedback(params, requestOptions).parse()

    override fun fetch(
        params: DatasetFetchParams,
        requestOptions: RequestOptions,
    ): FetchDatasetEventsResponse =
        // get /v1/dataset/{dataset_id}/fetch
        withRawResponse().fetch(params, requestOptions).parse()

    override fun fetchPost(
        params: DatasetFetchPostParams,
        requestOptions: RequestOptions,
    ): FetchDatasetEventsResponse =
        // post /v1/dataset/{dataset_id}/fetch
        withRawResponse().fetchPost(params, requestOptions).parse()

    override fun insert(
        params: DatasetInsertParams,
        requestOptions: RequestOptions,
    ): InsertEventsResponse =
        // post /v1/dataset/{dataset_id}/insert
        withRawResponse().insert(params, requestOptions).parse()

    override fun summarize(
        params: DatasetSummarizeParams,
        requestOptions: RequestOptions,
    ): SummarizeDatasetResponse =
        // get /v1/dataset/{dataset_id}/summarize
        withRawResponse().summarize(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DatasetService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Dataset> =
            jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: DatasetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Dataset> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "dataset")
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

        private val retrieveHandler: Handler<Dataset> =
            jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: DatasetRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Dataset> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "dataset", params._pathParam(0))
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

        private val updateHandler: Handler<Dataset> =
            jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: DatasetUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Dataset> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "dataset", params._pathParam(0))
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

        private val listHandler: Handler<DatasetListPage.Response> =
            jsonHandler<DatasetListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DatasetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "dataset")
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
                    .let { DatasetListPage.of(DatasetServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<Dataset> =
            jsonHandler<Dataset>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: DatasetDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Dataset> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "dataset", params._pathParam(0))
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
            params: DatasetFeedbackParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeedbackResponseSchema> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "dataset", params._pathParam(0), "feedback")
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

        private val fetchHandler: Handler<FetchDatasetEventsResponse> =
            jsonHandler<FetchDatasetEventsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun fetch(
            params: DatasetFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FetchDatasetEventsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "dataset", params._pathParam(0), "fetch")
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

        private val fetchPostHandler: Handler<FetchDatasetEventsResponse> =
            jsonHandler<FetchDatasetEventsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun fetchPost(
            params: DatasetFetchPostParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FetchDatasetEventsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "dataset", params._pathParam(0), "fetch")
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
            params: DatasetInsertParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsertEventsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "dataset", params._pathParam(0), "insert")
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

        private val summarizeHandler: Handler<SummarizeDatasetResponse> =
            jsonHandler<SummarizeDatasetResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun summarize(
            params: DatasetSummarizeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SummarizeDatasetResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "dataset", params._pathParam(0), "summarize")
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
