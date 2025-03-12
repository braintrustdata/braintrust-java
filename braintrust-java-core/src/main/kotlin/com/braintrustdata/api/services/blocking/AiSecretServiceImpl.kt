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
import com.braintrustdata.api.models.AISecret
import com.braintrustdata.api.models.AiSecretCreateParams
import com.braintrustdata.api.models.AiSecretDeleteParams
import com.braintrustdata.api.models.AiSecretFindAndDeleteParams
import com.braintrustdata.api.models.AiSecretListPage
import com.braintrustdata.api.models.AiSecretListParams
import com.braintrustdata.api.models.AiSecretReplaceParams
import com.braintrustdata.api.models.AiSecretRetrieveParams
import com.braintrustdata.api.models.AiSecretUpdateParams

class AiSecretServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : AiSecretService {

    private val withRawResponse: AiSecretService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): AiSecretService.WithRawResponse = withRawResponse

    override fun create(params: AiSecretCreateParams, requestOptions: RequestOptions): AISecret =
        // post /v1/ai_secret
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: AiSecretRetrieveParams, requestOptions: RequestOptions): AISecret =
        // get /v1/ai_secret/{ai_secret_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AiSecretUpdateParams, requestOptions: RequestOptions): AISecret =
        // patch /v1/ai_secret/{ai_secret_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: AiSecretListParams, requestOptions: RequestOptions): AiSecretListPage =
        // get /v1/ai_secret
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AiSecretDeleteParams, requestOptions: RequestOptions): AISecret =
        // delete /v1/ai_secret/{ai_secret_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun findAndDelete(params: AiSecretFindAndDeleteParams, requestOptions: RequestOptions): AISecret =
        // delete /v1/ai_secret
        withRawResponse().findAndDelete(params, requestOptions).parse()

    override fun replace(params: AiSecretReplaceParams, requestOptions: RequestOptions): AISecret =
        // put /v1/ai_secret
        withRawResponse().replace(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : AiSecretService.WithRawResponse {

        private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AISecret> = jsonHandler<AISecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(params: AiSecretCreateParams, requestOptions: RequestOptions): HttpResponseFor<AISecret> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("v1", "ai_secret")
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

        private val retrieveHandler: Handler<AISecret> = jsonHandler<AISecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(params: AiSecretRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<AISecret> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("v1", "ai_secret", params.getPathParam(0))
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

        private val updateHandler: Handler<AISecret> = jsonHandler<AISecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(params: AiSecretUpdateParams, requestOptions: RequestOptions): HttpResponseFor<AISecret> {
          val request = HttpRequest.builder()
            .method(HttpMethod.PATCH)
            .addPathSegments("v1", "ai_secret", params.getPathParam(0))
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

        private val listHandler: Handler<AiSecretListPage.Response> = jsonHandler<AiSecretListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: AiSecretListParams, requestOptions: RequestOptions): HttpResponseFor<AiSecretListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("v1", "ai_secret")
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
                  AiSecretListPage.of(AiSecretServiceImpl(clientOptions), params, it)
              }
          }
        }

        private val deleteHandler: Handler<AISecret> = jsonHandler<AISecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(params: AiSecretDeleteParams, requestOptions: RequestOptions): HttpResponseFor<AISecret> {
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .addPathSegments("v1", "ai_secret", params.getPathParam(0))
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

        private val findAndDeleteHandler: Handler<AISecret> = jsonHandler<AISecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun findAndDelete(params: AiSecretFindAndDeleteParams, requestOptions: RequestOptions): HttpResponseFor<AISecret> {
          val request = HttpRequest.builder()
            .method(HttpMethod.DELETE)
            .addPathSegments("v1", "ai_secret")
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
                  findAndDeleteHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val replaceHandler: Handler<AISecret> = jsonHandler<AISecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun replace(params: AiSecretReplaceParams, requestOptions: RequestOptions): HttpResponseFor<AISecret> {
          val request = HttpRequest.builder()
            .method(HttpMethod.PUT)
            .addPathSegments("v1", "ai_secret")
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
