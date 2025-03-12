// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.ClientOptions
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
import com.braintrustdata.api.core.prepareAsync
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.Role
import com.braintrustdata.api.models.RoleCreateParams
import com.braintrustdata.api.models.RoleDeleteParams
import com.braintrustdata.api.models.RoleListPage
import com.braintrustdata.api.models.RoleListPageAsync
import com.braintrustdata.api.models.RoleListParams
import com.braintrustdata.api.models.RoleReplaceParams
import com.braintrustdata.api.models.RoleRetrieveParams
import com.braintrustdata.api.models.RoleUpdateParams
import java.util.concurrent.CompletableFuture

class RoleServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : RoleServiceAsync {

    private val withRawResponse: RoleServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): RoleServiceAsync.WithRawResponse = withRawResponse

    override fun create(params: RoleCreateParams, requestOptions: RequestOptions): CompletableFuture<Role> =
        // post /v1/role
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(params: RoleRetrieveParams, requestOptions: RequestOptions): CompletableFuture<Role> =
        // get /v1/role/{role_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(params: RoleUpdateParams, requestOptions: RequestOptions): CompletableFuture<Role> =
        // patch /v1/role/{role_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(params: RoleListParams, requestOptions: RequestOptions): CompletableFuture<RoleListPageAsync> =
        // get /v1/role
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(params: RoleDeleteParams, requestOptions: RequestOptions): CompletableFuture<Role> =
        // delete /v1/role/{role_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun replace(params: RoleReplaceParams, requestOptions: RequestOptions): CompletableFuture<Role> =
        // put /v1/role
        withRawResponse().replace(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : RoleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Role> = jsonHandler<Role>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(params: RoleCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Role>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("v1", "role")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  createHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val retrieveHandler: Handler<Role> = jsonHandler<Role>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(params: RoleRetrieveParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Role>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("v1", "role", params.getPathParam(0))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val updateHandler: Handler<Role> = jsonHandler<Role>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(params: RoleUpdateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Role>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.PATCH)
            .addPathSegments("v1", "role", params.getPathParam(0))
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  updateHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val listHandler: Handler<RoleListPageAsync.Response> = jsonHandler<RoleListPageAsync.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: RoleListParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<RoleListPageAsync>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("v1", "role")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  RoleListPageAsync.of(RoleServiceAsyncImpl(clientOptions), params, it)
              }
          } }
        }

        private val deleteHandler: Handler<Role> = jsonHandler<Role>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(params: RoleDeleteParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Role>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .addPathSegments("v1", "role", params.getPathParam(0))
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  deleteHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }

        private val replaceHandler: Handler<Role> = jsonHandler<Role>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun replace(params: RoleReplaceParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Role>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .addPathSegments("v1", "role")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  replaceHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }
    }
}
