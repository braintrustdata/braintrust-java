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
import com.braintrustdata.api.core.http.json
import com.braintrustdata.api.core.http.parseable
import com.braintrustdata.api.core.prepare
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.Group
import com.braintrustdata.api.models.GroupCreateParams
import com.braintrustdata.api.models.GroupDeleteParams
import com.braintrustdata.api.models.GroupListPage
import com.braintrustdata.api.models.GroupListParams
import com.braintrustdata.api.models.GroupReplaceParams
import com.braintrustdata.api.models.GroupRetrieveParams
import com.braintrustdata.api.models.GroupUpdateParams

class GroupServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : GroupService {

    private val withRawResponse: GroupService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): GroupService.WithRawResponse = withRawResponse

    override fun create(params: GroupCreateParams, requestOptions: RequestOptions): Group =
        // post /v1/group
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: GroupRetrieveParams, requestOptions: RequestOptions): Group =
        // get /v1/group/{group_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: GroupUpdateParams, requestOptions: RequestOptions): Group =
        // patch /v1/group/{group_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: GroupListParams, requestOptions: RequestOptions): GroupListPage =
        // get /v1/group
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: GroupDeleteParams, requestOptions: RequestOptions): Group =
        // delete /v1/group/{group_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun replace(params: GroupReplaceParams, requestOptions: RequestOptions): Group =
        // put /v1/group
        withRawResponse().replace(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : GroupService.WithRawResponse {

        private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Group> = jsonHandler<Group>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(params: GroupCreateParams, requestOptions: RequestOptions): HttpResponseFor<Group> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("v1", "group")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  createHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val retrieveHandler: Handler<Group> = jsonHandler<Group>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(params: GroupRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<Group> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("v1", "group", params.getPathParam(0))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val updateHandler: Handler<Group> = jsonHandler<Group>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(params: GroupUpdateParams, requestOptions: RequestOptions): HttpResponseFor<Group> {
          val request = HttpRequest.builder()
            .method(HttpMethod.PATCH)
            .addPathSegments("v1", "group", params.getPathParam(0))
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  updateHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val listHandler: Handler<GroupListPage.Response> = jsonHandler<GroupListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: GroupListParams, requestOptions: RequestOptions): HttpResponseFor<GroupListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("v1", "group")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  GroupListPage.of(GroupServiceImpl(clientOptions), params, it)
              }
          }
        }

        private val deleteHandler: Handler<Group> = jsonHandler<Group>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(params: GroupDeleteParams, requestOptions: RequestOptions): HttpResponseFor<Group> {
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .addPathSegments("v1", "group", params.getPathParam(0))
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  deleteHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val replaceHandler: Handler<Group> = jsonHandler<Group>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun replace(params: GroupReplaceParams, requestOptions: RequestOptions): HttpResponseFor<Group> {
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .addPathSegments("v1", "group")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  replaceHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }
    }
}
