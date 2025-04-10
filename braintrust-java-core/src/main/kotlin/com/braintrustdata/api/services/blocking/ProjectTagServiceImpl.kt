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
import com.braintrustdata.api.models.ProjectTag
import com.braintrustdata.api.models.ProjectTagCreateParams
import com.braintrustdata.api.models.ProjectTagDeleteParams
import com.braintrustdata.api.models.ProjectTagListPage
import com.braintrustdata.api.models.ProjectTagListPageResponse
import com.braintrustdata.api.models.ProjectTagListParams
import com.braintrustdata.api.models.ProjectTagReplaceParams
import com.braintrustdata.api.models.ProjectTagRetrieveParams
import com.braintrustdata.api.models.ProjectTagUpdateParams

class ProjectTagServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProjectTagService {

    private val withRawResponse: ProjectTagService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProjectTagService.WithRawResponse = withRawResponse

    override fun create(
        params: ProjectTagCreateParams,
        requestOptions: RequestOptions,
    ): ProjectTag =
        // post /v1/project_tag
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ProjectTagRetrieveParams,
        requestOptions: RequestOptions,
    ): ProjectTag =
        // get /v1/project_tag/{project_tag_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ProjectTagUpdateParams,
        requestOptions: RequestOptions,
    ): ProjectTag =
        // patch /v1/project_tag/{project_tag_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ProjectTagListParams,
        requestOptions: RequestOptions,
    ): ProjectTagListPage =
        // get /v1/project_tag
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ProjectTagDeleteParams,
        requestOptions: RequestOptions,
    ): ProjectTag =
        // delete /v1/project_tag/{project_tag_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun replace(
        params: ProjectTagReplaceParams,
        requestOptions: RequestOptions,
    ): ProjectTag =
        // put /v1/project_tag
        withRawResponse().replace(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProjectTagService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ProjectTag> =
            jsonHandler<ProjectTag>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: ProjectTagCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectTag> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "project_tag")
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

        private val retrieveHandler: Handler<ProjectTag> =
            jsonHandler<ProjectTag>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ProjectTagRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectTag> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "project_tag", params._pathParam(0))
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

        private val updateHandler: Handler<ProjectTag> =
            jsonHandler<ProjectTag>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: ProjectTagUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectTag> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "project_tag", params._pathParam(0))
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

        private val listHandler: Handler<ProjectTagListPageResponse> =
            jsonHandler<ProjectTagListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ProjectTagListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectTagListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "project_tag")
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
                    .let { ProjectTagListPage.of(ProjectTagServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<ProjectTag> =
            jsonHandler<ProjectTag>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: ProjectTagDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectTag> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "project_tag", params._pathParam(0))
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

        private val replaceHandler: Handler<ProjectTag> =
            jsonHandler<ProjectTag>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun replace(
            params: ProjectTagReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectTag> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("v1", "project_tag")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { replaceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
