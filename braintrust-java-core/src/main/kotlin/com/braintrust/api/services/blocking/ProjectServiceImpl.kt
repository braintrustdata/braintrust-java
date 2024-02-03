// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.services.blocking

import com.braintrust.api.core.ClientOptions
import com.braintrust.api.core.RequestOptions
import com.braintrust.api.core.http.HttpMethod
import com.braintrust.api.core.http.HttpRequest
import com.braintrust.api.core.http.HttpResponse.Handler
import com.braintrust.api.errors.BraintrustError
import com.braintrust.api.models.Project
import com.braintrust.api.models.ProjectCreateParams
import com.braintrust.api.models.ProjectDeleteParams
import com.braintrust.api.models.ProjectListPage
import com.braintrust.api.models.ProjectListParams
import com.braintrust.api.models.ProjectReplaceParams
import com.braintrust.api.models.ProjectRetrieveParams
import com.braintrust.api.models.ProjectUpdateParams
import com.braintrust.api.services.blocking.project.LogService
import com.braintrust.api.services.blocking.project.LogServiceImpl
import com.braintrust.api.services.errorHandler
import com.braintrust.api.services.json
import com.braintrust.api.services.jsonHandler
import com.braintrust.api.services.withErrorHandler

class ProjectServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ProjectService {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val logs: LogService by lazy { LogServiceImpl(clientOptions) }

    override fun logs(): LogService = logs

    private val createHandler: Handler<Project> =
        jsonHandler<Project>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new project. If there is an existing project with the same name as the one specified
     * in the request, will return the existing project unmodified
     */
    override fun create(params: ProjectCreateParams, requestOptions: RequestOptions): Project {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "project")
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

    private val retrieveHandler: Handler<Project> =
        jsonHandler<Project>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a project object by its id */
    override fun retrieve(params: ProjectRetrieveParams, requestOptions: RequestOptions): Project {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "project", params.getPathParam(0))
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

    private val updateHandler: Handler<Project> =
        jsonHandler<Project>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Partially update a project object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null. As a workaround, you may retrieve the full object
     * with `GET /project/{id}` and then replace it with `PUT /project`.
     */
    override fun update(params: ProjectUpdateParams, requestOptions: RequestOptions): Project {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "project", params.getPathParam(0))
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

    private val listHandler: Handler<ProjectListPage.Response> =
        jsonHandler<ProjectListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List out all projects. The projects are sorted by creation date, with the most
     * recently-created projects coming first
     */
    override fun list(params: ProjectListParams, requestOptions: RequestOptions): ProjectListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "project")
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
                .let { ProjectListPage.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<Project> =
        jsonHandler<Project>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a project object by its id */
    override fun delete(params: ProjectDeleteParams, requestOptions: RequestOptions): Project {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "project", params.getPathParam(0))
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

    private val replaceHandler: Handler<Project> =
        jsonHandler<Project>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create or replace a new project. If there is an existing project with the same name as the
     * one specified in the request, will replace the existing project with the provided fields
     */
    override fun replace(params: ProjectReplaceParams, requestOptions: RequestOptions): Project {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("v1", "project")
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
