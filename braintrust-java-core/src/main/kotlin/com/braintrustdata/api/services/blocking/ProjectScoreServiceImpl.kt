// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpMethod
import com.braintrustdata.api.core.http.HttpRequest
import com.braintrustdata.api.core.http.HttpResponse.Handler
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.ProjectScore
import com.braintrustdata.api.models.ProjectScoreCreateParams
import com.braintrustdata.api.models.ProjectScoreDeleteParams
import com.braintrustdata.api.models.ProjectScoreListPage
import com.braintrustdata.api.models.ProjectScoreListParams
import com.braintrustdata.api.models.ProjectScoreReplaceParams
import com.braintrustdata.api.models.ProjectScoreRetrieveParams
import com.braintrustdata.api.models.ProjectScoreUpdateParams
import com.braintrustdata.api.services.errorHandler
import com.braintrustdata.api.services.json
import com.braintrustdata.api.services.jsonHandler
import com.braintrustdata.api.services.withErrorHandler

class ProjectScoreServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ProjectScoreService {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ProjectScore> =
        jsonHandler<ProjectScore>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new project_score. If there is an existing project_score in the project with the
     * same name as the one specified in the request, will return the existing project_score
     * unmodified
     */
    override fun create(
        params: ProjectScoreCreateParams,
        requestOptions: RequestOptions
    ): ProjectScore {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "project_score")
                .putAllQueryParams(clientOptions.queryParams)
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

    private val retrieveHandler: Handler<ProjectScore> =
        jsonHandler<ProjectScore>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a project_score object by its id */
    override fun retrieve(
        params: ProjectScoreRetrieveParams,
        requestOptions: RequestOptions
    ): ProjectScore {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "project_score", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
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

    private val updateHandler: Handler<ProjectScore> =
        jsonHandler<ProjectScore>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Partially update a project_score object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    override fun update(
        params: ProjectScoreUpdateParams,
        requestOptions: RequestOptions
    ): ProjectScore {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "project_score", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
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

    private val listHandler: Handler<ProjectScoreListPage.Response> =
        jsonHandler<ProjectScoreListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List out all project_scores. The project_scores are sorted by creation date, with the most
     * recently-created project_scores coming first
     */
    override fun list(
        params: ProjectScoreListParams,
        requestOptions: RequestOptions
    ): ProjectScoreListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "project_score")
                .putAllQueryParams(clientOptions.queryParams)
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
                .let { ProjectScoreListPage.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<ProjectScore> =
        jsonHandler<ProjectScore>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a project_score object by its id */
    override fun delete(
        params: ProjectScoreDeleteParams,
        requestOptions: RequestOptions
    ): ProjectScore {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "project_score", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
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

    private val replaceHandler: Handler<ProjectScore> =
        jsonHandler<ProjectScore>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create or replace project_score. If there is an existing project_score in the project with
     * the same name as the one specified in the request, will replace the existing project_score
     * with the provided fields
     */
    override fun replace(
        params: ProjectScoreReplaceParams,
        requestOptions: RequestOptions
    ): ProjectScore {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("v1", "project_score")
                .putAllQueryParams(clientOptions.queryParams)
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
