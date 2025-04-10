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
import com.braintrustdata.api.models.Acl
import com.braintrustdata.api.models.AclBatchUpdateParams
import com.braintrustdata.api.models.AclBatchUpdateResponse
import com.braintrustdata.api.models.AclCreateParams
import com.braintrustdata.api.models.AclDeleteParams
import com.braintrustdata.api.models.AclFindAndDeleteParams
import com.braintrustdata.api.models.AclListPage
import com.braintrustdata.api.models.AclListPageResponse
import com.braintrustdata.api.models.AclListParams
import com.braintrustdata.api.models.AclRetrieveParams

class AclServiceImpl internal constructor(private val clientOptions: ClientOptions) : AclService {

    private val withRawResponse: AclService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AclService.WithRawResponse = withRawResponse

    override fun create(params: AclCreateParams, requestOptions: RequestOptions): Acl =
        // post /v1/acl
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: AclRetrieveParams, requestOptions: RequestOptions): Acl =
        // get /v1/acl/{acl_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: AclListParams, requestOptions: RequestOptions): AclListPage =
        // get /v1/acl
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AclDeleteParams, requestOptions: RequestOptions): Acl =
        // delete /v1/acl/{acl_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun batchUpdate(
        params: AclBatchUpdateParams,
        requestOptions: RequestOptions,
    ): AclBatchUpdateResponse =
        // post /v1/acl/batch_update
        withRawResponse().batchUpdate(params, requestOptions).parse()

    override fun findAndDelete(
        params: AclFindAndDeleteParams,
        requestOptions: RequestOptions,
    ): Acl =
        // delete /v1/acl
        withRawResponse().findAndDelete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AclService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Acl> =
            jsonHandler<Acl>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: AclCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Acl> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "acl")
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

        private val retrieveHandler: Handler<Acl> =
            jsonHandler<Acl>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AclRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Acl> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "acl", params._pathParam(0))
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

        private val listHandler: Handler<AclListPageResponse> =
            jsonHandler<AclListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AclListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AclListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "acl")
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
                    .let { AclListPage.of(AclServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<Acl> =
            jsonHandler<Acl>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: AclDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Acl> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "acl", params._pathParam(0))
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

        private val batchUpdateHandler: Handler<AclBatchUpdateResponse> =
            jsonHandler<AclBatchUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun batchUpdate(
            params: AclBatchUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AclBatchUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "acl", "batch_update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { batchUpdateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val findAndDeleteHandler: Handler<Acl> =
            jsonHandler<Acl>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun findAndDelete(
            params: AclFindAndDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Acl> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "acl")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { findAndDeleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
