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
import com.braintrustdata.api.models.Organization
import com.braintrustdata.api.models.OrganizationDeleteParams
import com.braintrustdata.api.models.OrganizationListPage
import com.braintrustdata.api.models.OrganizationListParams
import com.braintrustdata.api.models.OrganizationRetrieveParams
import com.braintrustdata.api.models.OrganizationUpdateParams
import com.braintrustdata.api.services.blocking.organizations.MemberService
import com.braintrustdata.api.services.blocking.organizations.MemberServiceImpl

class OrganizationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OrganizationService {

    private val withRawResponse: OrganizationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val members: MemberService by lazy { MemberServiceImpl(clientOptions) }

    override fun withRawResponse(): OrganizationService.WithRawResponse = withRawResponse

    override fun members(): MemberService = members

    override fun retrieve(
        params: OrganizationRetrieveParams,
        requestOptions: RequestOptions,
    ): Organization =
        // get /v1/organization/{organization_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: OrganizationUpdateParams,
        requestOptions: RequestOptions,
    ): Organization =
        // patch /v1/organization/{organization_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: OrganizationListParams,
        requestOptions: RequestOptions,
    ): OrganizationListPage =
        // get /v1/organization
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: OrganizationDeleteParams,
        requestOptions: RequestOptions,
    ): Organization =
        // delete /v1/organization/{organization_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrganizationService.WithRawResponse {

        private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

        private val members: MemberService.WithRawResponse by lazy {
            MemberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun members(): MemberService.WithRawResponse = members

        private val retrieveHandler: Handler<Organization> =
            jsonHandler<Organization>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: OrganizationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Organization> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "organization", params.getPathParam(0))
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

        private val updateHandler: Handler<Organization> =
            jsonHandler<Organization>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: OrganizationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Organization> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "organization", params.getPathParam(0))
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

        private val listHandler: Handler<OrganizationListPage.Response> =
            jsonHandler<OrganizationListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: OrganizationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrganizationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "organization")
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
                        OrganizationListPage.of(OrganizationServiceImpl(clientOptions), params, it)
                    }
            }
        }

        private val deleteHandler: Handler<Organization> =
            jsonHandler<Organization>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: OrganizationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Organization> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "organization", params.getPathParam(0))
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
    }
}
