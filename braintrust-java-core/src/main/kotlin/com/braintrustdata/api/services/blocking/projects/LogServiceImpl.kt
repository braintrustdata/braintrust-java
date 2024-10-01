// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking.projects

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpMethod
import com.braintrustdata.api.core.http.HttpRequest
import com.braintrustdata.api.core.http.HttpResponse.Handler
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.FeedbackResponseSchema
import com.braintrustdata.api.models.FetchProjectLogsEventsResponse
import com.braintrustdata.api.models.InsertEventsResponse
import com.braintrustdata.api.models.ProjectLogFeedbackParams
import com.braintrustdata.api.models.ProjectLogFetchParams
import com.braintrustdata.api.models.ProjectLogFetchPostParams
import com.braintrustdata.api.models.ProjectLogInsertParams
import com.braintrustdata.api.services.errorHandler
import com.braintrustdata.api.services.json
import com.braintrustdata.api.services.jsonHandler
import com.braintrustdata.api.services.withErrorHandler

class LogServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : LogService {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val feedbackHandler: Handler<FeedbackResponseSchema> =
        jsonHandler<FeedbackResponseSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Log feedback for a set of project logs events */
    override fun feedback(
        params: ProjectLogFeedbackParams,
        requestOptions: RequestOptions
    ): FeedbackResponseSchema {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "project_logs", params.getPathParam(0), "feedback")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { feedbackHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val fetchHandler: Handler<FetchProjectLogsEventsResponse> =
        jsonHandler<FetchProjectLogsEventsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch the events in a project logs. Equivalent to the POST form of the same path, but with
     * the parameters in the URL query rather than in the request body
     */
    override fun fetch(
        params: ProjectLogFetchParams,
        requestOptions: RequestOptions
    ): FetchProjectLogsEventsResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "project_logs", params.getPathParam(0), "fetch")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { fetchHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val fetchPostHandler: Handler<FetchProjectLogsEventsResponse> =
        jsonHandler<FetchProjectLogsEventsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch the events in a project logs. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query
     */
    override fun fetchPost(
        params: ProjectLogFetchPostParams,
        requestOptions: RequestOptions
    ): FetchProjectLogsEventsResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "project_logs", params.getPathParam(0), "fetch")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { fetchPostHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val insertHandler: Handler<InsertEventsResponse> =
        jsonHandler<InsertEventsResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Insert a set of events into the project logs */
    override fun insert(
        params: ProjectLogInsertParams,
        requestOptions: RequestOptions
    ): InsertEventsResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "project_logs", params.getPathParam(0), "insert")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { insertHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
