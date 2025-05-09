// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.handlers.errorHandler
import com.braintrustdata.api.core.handlers.jsonHandler
import com.braintrustdata.api.core.handlers.withErrorHandler
import com.braintrustdata.api.core.http.HttpMethod
import com.braintrustdata.api.core.http.HttpRequest
import com.braintrustdata.api.core.http.HttpResponse.Handler
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.core.http.json
import com.braintrustdata.api.core.http.parseable
import com.braintrustdata.api.core.prepareAsync
import com.braintrustdata.api.models.Organization
import com.braintrustdata.api.models.OrganizationDeleteParams
import com.braintrustdata.api.models.OrganizationListPageAsync
import com.braintrustdata.api.models.OrganizationListPageResponse
import com.braintrustdata.api.models.OrganizationListParams
import com.braintrustdata.api.models.OrganizationRetrieveParams
import com.braintrustdata.api.models.OrganizationUpdateParams
import com.braintrustdata.api.services.async.organizations.MemberServiceAsync
import com.braintrustdata.api.services.async.organizations.MemberServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class OrganizationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OrganizationServiceAsync {

    private val withRawResponse: OrganizationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val members: MemberServiceAsync by lazy { MemberServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OrganizationServiceAsync.WithRawResponse = withRawResponse

    override fun members(): MemberServiceAsync = members

    override fun retrieve(
        params: OrganizationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Organization> =
        // get /v1/organization/{organization_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: OrganizationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Organization> =
        // patch /v1/organization/{organization_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: OrganizationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrganizationListPageAsync> =
        // get /v1/organization
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: OrganizationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Organization> =
        // delete /v1/organization/{organization_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrganizationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val members: MemberServiceAsync.WithRawResponse by lazy {
            MemberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun members(): MemberServiceAsync.WithRawResponse = members

        private val retrieveHandler: Handler<Organization> =
            jsonHandler<Organization>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: OrganizationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Organization>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("organizationId", params.organizationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "organization", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<Organization> =
            jsonHandler<Organization>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: OrganizationUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Organization>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("organizationId", params.organizationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "organization", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<OrganizationListPageResponse> =
            jsonHandler<OrganizationListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: OrganizationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrganizationListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "organization")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                OrganizationListPageAsync.builder()
                                    .service(OrganizationServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Organization> =
            jsonHandler<Organization>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: OrganizationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Organization>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("organizationId", params.organizationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "organization", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
}
