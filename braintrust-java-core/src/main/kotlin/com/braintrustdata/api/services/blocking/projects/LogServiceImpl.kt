// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking.projects

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
import com.braintrustdata.api.core.prepare
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.FeedbackResponseSchema
import com.braintrustdata.api.models.FetchProjectLogsEventsResponse
import com.braintrustdata.api.models.InsertEventsResponse
import com.braintrustdata.api.models.ProjectLogFeedbackParams
import com.braintrustdata.api.models.ProjectLogFetchParams
import com.braintrustdata.api.models.ProjectLogFetchPostParams
import com.braintrustdata.api.models.ProjectLogInsertParams

class LogServiceImpl internal constructor(private val clientOptions: ClientOptions) : LogService {

    private val withRawResponse: LogService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LogService.WithRawResponse = withRawResponse

    override fun feedback(
        params: ProjectLogFeedbackParams,
        requestOptions: RequestOptions,
    ): FeedbackResponseSchema =
        // post /v1/project_logs/{project_id}/feedback
        withRawResponse().feedback(params, requestOptions).parse()

    override fun fetch(
        params: ProjectLogFetchParams,
        requestOptions: RequestOptions,
    ): FetchProjectLogsEventsResponse =
        // get /v1/project_logs/{project_id}/fetch
        withRawResponse().fetch(params, requestOptions).parse()

    override fun fetchPost(
        params: ProjectLogFetchPostParams,
        requestOptions: RequestOptions,
    ): FetchProjectLogsEventsResponse =
        // post /v1/project_logs/{project_id}/fetch
        withRawResponse().fetchPost(params, requestOptions).parse()

    override fun insert(
        params: ProjectLogInsertParams,
        requestOptions: RequestOptions,
    ): InsertEventsResponse =
        // post /v1/project_logs/{project_id}/insert
        withRawResponse().insert(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LogService.WithRawResponse {

        private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

        private val feedbackHandler: Handler<FeedbackResponseSchema> =
            jsonHandler<FeedbackResponseSchema>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun feedback(
            params: ProjectLogFeedbackParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeedbackResponseSchema> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "project_logs", params._pathParam(0), "feedback")
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

        private val fetchHandler: Handler<FetchProjectLogsEventsResponse> =
            jsonHandler<FetchProjectLogsEventsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun fetch(
            params: ProjectLogFetchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FetchProjectLogsEventsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "project_logs", params._pathParam(0), "fetch")
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

        private val fetchPostHandler: Handler<FetchProjectLogsEventsResponse> =
            jsonHandler<FetchProjectLogsEventsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun fetchPost(
            params: ProjectLogFetchPostParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FetchProjectLogsEventsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "project_logs", params._pathParam(0), "fetch")
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
            params: ProjectLogInsertParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsertEventsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "project_logs", params._pathParam(0), "insert")
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
    }
}
