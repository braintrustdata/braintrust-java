// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.services.blocking.project

import com.braintrust.api.core.ClientOptions
import com.braintrust.api.core.RequestOptions
import com.braintrust.api.core.http.HttpMethod
import com.braintrust.api.core.http.HttpRequest
import com.braintrust.api.core.http.HttpResponse.Handler
import com.braintrust.api.errors.BraintrustError
import com.braintrust.api.models.ProjectLogFeedbackParams
import com.braintrust.api.models.ProjectLogFetchParams
import com.braintrust.api.models.ProjectLogFetchPostParams
import com.braintrust.api.models.ProjectLogFetchPostResponse
import com.braintrust.api.models.ProjectLogFetchResponse
import com.braintrust.api.models.ProjectLogInsertParams
import com.braintrust.api.models.ProjectLogInsertResponse
import com.braintrust.api.services.emptyHandler
import com.braintrust.api.services.errorHandler
import com.braintrust.api.services.json
import com.braintrust.api.services.jsonHandler
import com.braintrust.api.services.withErrorHandler

class LogServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : LogService {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val feedbackHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Log feedback for a set of project logs events */
    override fun feedback(params: ProjectLogFeedbackParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "project_logs", params.getPathParam(0), "feedback")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { feedbackHandler.handle(it) }
        }
    }

    private val fetchHandler: Handler<ProjectLogFetchResponse> =
        jsonHandler<ProjectLogFetchResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch the events in a project logs. Equivalent to the POST form of the same path, but with
     * the parameters in the URL query rather than in the request body
     */
    override fun fetch(
        params: ProjectLogFetchParams,
        requestOptions: RequestOptions
    ): ProjectLogFetchResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "project_logs", params.getPathParam(0), "fetch")
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

    private val fetchPostHandler: Handler<ProjectLogFetchPostResponse> =
        jsonHandler<ProjectLogFetchPostResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch the events in a project logs. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query
     */
    override fun fetchPost(
        params: ProjectLogFetchPostParams,
        requestOptions: RequestOptions
    ): ProjectLogFetchPostResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "project_logs", params.getPathParam(0), "fetch")
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

    private val insertHandler: Handler<ProjectLogInsertResponse> =
        jsonHandler<ProjectLogInsertResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Insert a set of events into the project logs */
    override fun insert(
        params: ProjectLogInsertParams,
        requestOptions: RequestOptions
    ): ProjectLogInsertResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "project_logs", params.getPathParam(0), "insert")
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
