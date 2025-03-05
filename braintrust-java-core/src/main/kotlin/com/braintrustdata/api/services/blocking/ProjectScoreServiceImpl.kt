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
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.core.http.parseable
import com.braintrustdata.api.core.json
import com.braintrustdata.api.core.prepare
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.ProjectScore
import com.braintrustdata.api.models.ProjectScoreCreateParams
import com.braintrustdata.api.models.ProjectScoreDeleteParams
import com.braintrustdata.api.models.ProjectScoreListPage
import com.braintrustdata.api.models.ProjectScoreListParams
import com.braintrustdata.api.models.ProjectScoreReplaceParams
import com.braintrustdata.api.models.ProjectScoreRetrieveParams
import com.braintrustdata.api.models.ProjectScoreUpdateParams

class ProjectScoreServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProjectScoreService {

    private val withRawResponse: ProjectScoreService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProjectScoreService.WithRawResponse = withRawResponse

    override fun create(
        params: ProjectScoreCreateParams,
        requestOptions: RequestOptions,
    ): ProjectScore =
        // post /v1/project_score
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ProjectScoreRetrieveParams,
        requestOptions: RequestOptions,
    ): ProjectScore =
        // get /v1/project_score/{project_score_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ProjectScoreUpdateParams,
        requestOptions: RequestOptions,
    ): ProjectScore =
        // patch /v1/project_score/{project_score_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ProjectScoreListParams,
        requestOptions: RequestOptions,
    ): ProjectScoreListPage =
        // get /v1/project_score
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ProjectScoreDeleteParams,
        requestOptions: RequestOptions,
    ): ProjectScore =
        // delete /v1/project_score/{project_score_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun replace(
        params: ProjectScoreReplaceParams,
        requestOptions: RequestOptions,
    ): ProjectScore =
        // put /v1/project_score
        withRawResponse().replace(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProjectScoreService.WithRawResponse {

        private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ProjectScore> =
            jsonHandler<ProjectScore>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: ProjectScoreCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectScore> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "project_score")
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

        private val retrieveHandler: Handler<ProjectScore> =
            jsonHandler<ProjectScore>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ProjectScoreRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectScore> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "project_score", params.getPathParam(0))
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

        private val updateHandler: Handler<ProjectScore> =
            jsonHandler<ProjectScore>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: ProjectScoreUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectScore> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "project_score", params.getPathParam(0))
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

        private val listHandler: Handler<ProjectScoreListPage.Response> =
            jsonHandler<ProjectScoreListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ProjectScoreListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectScoreListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "project_score")
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
                    .let {
                        ProjectScoreListPage.of(ProjectScoreServiceImpl(clientOptions), params, it)
                    }
            }
        }

        private val deleteHandler: Handler<ProjectScore> =
            jsonHandler<ProjectScore>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: ProjectScoreDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectScore> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "project_score", params.getPathParam(0))
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

        private val replaceHandler: Handler<ProjectScore> =
            jsonHandler<ProjectScore>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun replace(
            params: ProjectScoreReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectScore> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("v1", "project_score")
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
