// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.services.blocking

import com.braintrust.api.core.ClientOptions
import com.braintrust.api.core.RequestOptions
import com.braintrust.api.core.http.HttpMethod
import com.braintrust.api.core.http.HttpRequest
import com.braintrust.api.core.http.HttpResponse.Handler
import com.braintrust.api.errors.BraintrustError
import com.braintrust.api.models.Experiment
import com.braintrust.api.models.ExperimentCreateParams
import com.braintrust.api.models.ExperimentDeleteParams
import com.braintrust.api.models.ExperimentFeedbackParams
import com.braintrust.api.models.ExperimentFetchParams
import com.braintrust.api.models.ExperimentFetchPostParams
import com.braintrust.api.models.ExperimentFetchPostResponse
import com.braintrust.api.models.ExperimentFetchResponse
import com.braintrust.api.models.ExperimentInsertParams
import com.braintrust.api.models.ExperimentInsertResponse
import com.braintrust.api.models.ExperimentListPage
import com.braintrust.api.models.ExperimentListParams
import com.braintrust.api.models.ExperimentReplaceParams
import com.braintrust.api.models.ExperimentRetrieveParams
import com.braintrust.api.models.ExperimentUpdateParams
import com.braintrust.api.services.emptyHandler
import com.braintrust.api.services.errorHandler
import com.braintrust.api.services.json
import com.braintrust.api.services.jsonHandler
import com.braintrust.api.services.withErrorHandler

class ExperimentServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ExperimentService {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Experiment> =
        jsonHandler<Experiment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new experiment. If there is an existing experiment in the project with the same name
     * as the one specified in the request, will create a new experiment from `name`, suffixed with
     * a unique identifier
     */
    override fun create(
        params: ExperimentCreateParams,
        requestOptions: RequestOptions
    ): Experiment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "experiment")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    ): Experiment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "experiment", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
     * removing fields or setting them to null. As a workaround, you may retrieve the full object
     * with `GET /experiment/{id}` and then replace it with `PUT /experiment`.
     */
    override fun update(
        params: ExperimentUpdateParams,
        requestOptions: RequestOptions
    ): Experiment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "experiment", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<ExperimentListPage.Response> =
        jsonHandler<ExperimentListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List out all experiments. The experiments are sorted by creation date, with the most
     * recently-created experiments coming first
     */
    override fun list(
        params: ExperimentListParams,
        requestOptions: RequestOptions
    ): ExperimentListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "experiment")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { ExperimentListPage.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<Experiment> =
        jsonHandler<Experiment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete an experiment object by its id */
    override fun delete(
        params: ExperimentDeleteParams,
        requestOptions: RequestOptions
    ): Experiment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "experiment", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    override fun feedback(params: ExperimentFeedbackParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "experiment", params.getPathParam(0), "feedback")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    ): ExperimentFetchResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "experiment", params.getPathParam(0), "fetch")
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
    ): ExperimentFetchPostResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "experiment", params.getPathParam(0), "fetch")
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

    private val insertHandler: Handler<ExperimentInsertResponse> =
        jsonHandler<ExperimentInsertResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Insert a set of events into the experiment */
    override fun insert(
        params: ExperimentInsertParams,
        requestOptions: RequestOptions
    ): ExperimentInsertResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "experiment", params.getPathParam(0), "insert")
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

    private val replaceHandler: Handler<Experiment> =
        jsonHandler<Experiment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create or replace a new experiment. If there is an existing experiment in the project with
     * the same name as the one specified in the request, will replace the existing experiment with
     * the provided fields
     */
    override fun replace(
        params: ExperimentReplaceParams,
        requestOptions: RequestOptions
    ): Experiment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("v1", "experiment")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { replaceHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
