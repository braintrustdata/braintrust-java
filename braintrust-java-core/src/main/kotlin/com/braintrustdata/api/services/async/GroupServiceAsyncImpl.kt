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
import com.braintrustdata.api.models.Group
import com.braintrustdata.api.models.GroupCreateParams
import com.braintrustdata.api.models.GroupDeleteParams
import com.braintrustdata.api.models.GroupListPageAsync
import com.braintrustdata.api.models.GroupListPageResponse
import com.braintrustdata.api.models.GroupListParams
import com.braintrustdata.api.models.GroupReplaceParams
import com.braintrustdata.api.models.GroupRetrieveParams
import com.braintrustdata.api.models.GroupUpdateParams
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class GroupServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    GroupServiceAsync {

    private val withRawResponse: GroupServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GroupServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Group> =
        // post /v1/group
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: GroupRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Group> =
        // get /v1/group/{group_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: GroupUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Group> =
        // patch /v1/group/{group_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: GroupListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GroupListPageAsync> =
        // get /v1/group
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: GroupDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Group> =
        // delete /v1/group/{group_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun replace(
        params: GroupReplaceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Group> =
        // put /v1/group
        withRawResponse().replace(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GroupServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Group> =
            jsonHandler<Group>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Group>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "group")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<Group> =
            jsonHandler<Group>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: GroupRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Group>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupId", params.groupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "group", params._pathParam(0))
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

        private val updateHandler: Handler<Group> =
            jsonHandler<Group>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: GroupUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Group>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupId", params.groupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "group", params._pathParam(0))
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

        private val listHandler: Handler<GroupListPageResponse> =
            jsonHandler<GroupListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: GroupListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GroupListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "group")
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
                                GroupListPageAsync.builder()
                                    .service(GroupServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Group> =
            jsonHandler<Group>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: GroupDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Group>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupId", params.groupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "group", params._pathParam(0))
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

        private val replaceHandler: Handler<Group> =
            jsonHandler<Group>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun replace(
            params: GroupReplaceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Group>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("v1", "group")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
}
