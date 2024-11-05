// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async.projects

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
import com.braintrustdata.api.models.FeedbackResponseSchema
import com.braintrustdata.api.models.FetchProjectLogsEventsResponse
import com.braintrustdata.api.models.InsertEventsResponse
import com.braintrustdata.api.models.ProjectLogFeedbackParams
import com.braintrustdata.api.models.ProjectLogFetchParams
import com.braintrustdata.api.models.ProjectLogFetchPostParams
import com.braintrustdata.api.models.ProjectLogInsertParams
import java.util.concurrent.CompletableFuture

class LogServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : LogServiceAsync {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val feedbackHandler: Handler<FeedbackResponseSchema> =
        jsonHandler<FeedbackResponseSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Log feedback for a set of project logs events */
    override fun feedback(
        params: ProjectLogFeedbackParams,
        requestOptions: RequestOptions
    ): CompletableFuture<FeedbackResponseSchema> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "project_logs", params.getPathParam(0), "feedback")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
    ): CompletableFuture<FetchProjectLogsEventsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "project_logs", params.getPathParam(0), "fetch")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
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
    ): CompletableFuture<FetchProjectLogsEventsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "project_logs", params.getPathParam(0), "fetch")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
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

    private val insertHandler: Handler<InsertEventsResponse> =
        jsonHandler<InsertEventsResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Insert a set of events into the project logs */
    override fun insert(
        params: ProjectLogInsertParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InsertEventsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "project_logs", params.getPathParam(0), "insert")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
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
}
