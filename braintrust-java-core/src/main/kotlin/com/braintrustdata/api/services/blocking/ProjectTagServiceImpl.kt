// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.handlers.errorHandler
import com.braintrustdata.api.core.handlers.jsonHandler
import com.braintrustdata.api.core.handlers.withErrorHandler
import com.braintrustdata.api.core.http.HttpMethod
import com.braintrustdata.api.core.http.HttpRequest
import com.braintrustdata.api.core.http.HttpResponse.Handler
import com.braintrustdata.api.core.json
import com.braintrustdata.api.core.prepare
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.ProjectTag
import com.braintrustdata.api.models.ProjectTagCreateParams
import com.braintrustdata.api.models.ProjectTagDeleteParams
import com.braintrustdata.api.models.ProjectTagListPage
import com.braintrustdata.api.models.ProjectTagListParams
import com.braintrustdata.api.models.ProjectTagReplaceParams
import com.braintrustdata.api.models.ProjectTagRetrieveParams
import com.braintrustdata.api.models.ProjectTagUpdateParams

class ProjectTagServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProjectTagService {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ProjectTag> =
        jsonHandler<ProjectTag>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new project_tag. If there is an existing project_tag in the project with the same
     * name as the one specified in the request, will return the existing project_tag unmodified
     */
    override fun create(
        params: ProjectTagCreateParams,
        requestOptions: RequestOptions,
    ): ProjectTag {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "project_tag")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<ProjectTag> =
        jsonHandler<ProjectTag>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a project_tag object by its id */
    override fun retrieve(
        params: ProjectTagRetrieveParams,
        requestOptions: RequestOptions,
    ): ProjectTag {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "project_tag", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<ProjectTag> =
        jsonHandler<ProjectTag>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Partially update a project_tag object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    override fun update(
        params: ProjectTagUpdateParams,
        requestOptions: RequestOptions,
    ): ProjectTag {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "project_tag", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<ProjectTagListPage.Response> =
        jsonHandler<ProjectTagListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List out all project_tags. The project_tags are sorted by creation date, with the most
     * recently-created project_tags coming first
     */
    override fun list(
        params: ProjectTagListParams,
        requestOptions: RequestOptions,
    ): ProjectTagListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "project_tag")
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
            .let { ProjectTagListPage.of(this, params, it) }
    }

    private val deleteHandler: Handler<ProjectTag> =
        jsonHandler<ProjectTag>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a project_tag object by its id */
    override fun delete(
        params: ProjectTagDeleteParams,
        requestOptions: RequestOptions,
    ): ProjectTag {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "project_tag", params.getPathParam(0))
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { deleteHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val replaceHandler: Handler<ProjectTag> =
        jsonHandler<ProjectTag>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create or replace project_tag. If there is an existing project_tag in the project with the
     * same name as the one specified in the request, will replace the existing project_tag with the
     * provided fields
     */
    override fun replace(
        params: ProjectTagReplaceParams,
        requestOptions: RequestOptions,
    ): ProjectTag {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("v1", "project_tag")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { replaceHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}
