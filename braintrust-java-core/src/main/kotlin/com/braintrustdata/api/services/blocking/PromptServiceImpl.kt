// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

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
import com.braintrustdata.api.core.prepare
import com.braintrustdata.api.models.Prompt
import com.braintrustdata.api.models.PromptCreateParams
import com.braintrustdata.api.models.PromptDeleteParams
import com.braintrustdata.api.models.PromptListPage
import com.braintrustdata.api.models.PromptListPageResponse
import com.braintrustdata.api.models.PromptListParams
import com.braintrustdata.api.models.PromptReplaceParams
import com.braintrustdata.api.models.PromptRetrieveParams
import com.braintrustdata.api.models.PromptUpdateParams
import kotlin.jvm.optionals.getOrNull

class PromptServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PromptService {

    private val withRawResponse: PromptService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PromptService.WithRawResponse = withRawResponse

    override fun create(params: PromptCreateParams, requestOptions: RequestOptions): Prompt =
        // post /v1/prompt
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: PromptRetrieveParams, requestOptions: RequestOptions): Prompt =
        // get /v1/prompt/{prompt_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: PromptUpdateParams, requestOptions: RequestOptions): Prompt =
        // patch /v1/prompt/{prompt_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: PromptListParams, requestOptions: RequestOptions): PromptListPage =
        // get /v1/prompt
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: PromptDeleteParams, requestOptions: RequestOptions): Prompt =
        // delete /v1/prompt/{prompt_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun replace(params: PromptReplaceParams, requestOptions: RequestOptions): Prompt =
        // put /v1/prompt
        withRawResponse().replace(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PromptService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Prompt> =
            jsonHandler<Prompt>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: PromptCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Prompt> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "prompt")
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

        private val retrieveHandler: Handler<Prompt> =
            jsonHandler<Prompt>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PromptRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Prompt> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("promptId", params.promptId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "prompt", params._pathParam(0))
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

        private val updateHandler: Handler<Prompt> =
            jsonHandler<Prompt>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: PromptUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Prompt> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("promptId", params.promptId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "prompt", params._pathParam(0))
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

        private val listHandler: Handler<PromptListPageResponse> =
            jsonHandler<PromptListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PromptListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromptListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "prompt")
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
                        PromptListPage.builder()
                            .service(PromptServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Prompt> =
            jsonHandler<Prompt>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: PromptDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Prompt> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("promptId", params.promptId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "prompt", params._pathParam(0))
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

        private val replaceHandler: Handler<Prompt> =
            jsonHandler<Prompt>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun replace(
            params: PromptReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Prompt> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("v1", "prompt")
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
