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
import com.braintrustdata.api.models.Function
import com.braintrustdata.api.models.FunctionCreateParams
import com.braintrustdata.api.models.FunctionDeleteParams
import com.braintrustdata.api.models.FunctionInvokeParams
import com.braintrustdata.api.models.FunctionInvokeResponse
import com.braintrustdata.api.models.FunctionListPage
import com.braintrustdata.api.models.FunctionListPageResponse
import com.braintrustdata.api.models.FunctionListParams
import com.braintrustdata.api.models.FunctionReplaceParams
import com.braintrustdata.api.models.FunctionRetrieveParams
import com.braintrustdata.api.models.FunctionUpdateParams
import java.util.Optional

class FunctionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FunctionService {

    private val withRawResponse: FunctionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FunctionService.WithRawResponse = withRawResponse

    override fun create(params: FunctionCreateParams, requestOptions: RequestOptions): Function =
        // post /v1/function
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: FunctionRetrieveParams,
        requestOptions: RequestOptions,
    ): Function =
        // get /v1/function/{function_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: FunctionUpdateParams, requestOptions: RequestOptions): Function =
        // patch /v1/function/{function_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: FunctionListParams,
        requestOptions: RequestOptions,
    ): FunctionListPage =
        // get /v1/function
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: FunctionDeleteParams, requestOptions: RequestOptions): Function =
        // delete /v1/function/{function_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun invoke(
        params: FunctionInvokeParams,
        requestOptions: RequestOptions,
    ): Optional<FunctionInvokeResponse> =
        // post /v1/function/{function_id}/invoke
        withRawResponse().invoke(params, requestOptions).parse()

    override fun replace(params: FunctionReplaceParams, requestOptions: RequestOptions): Function =
        // put /v1/function
        withRawResponse().replace(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FunctionService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Function> =
            jsonHandler<Function>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: FunctionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Function> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "function")
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

        private val retrieveHandler: Handler<Function> =
            jsonHandler<Function>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: FunctionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Function> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "function", params._pathParam(0))
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

        private val updateHandler: Handler<Function> =
            jsonHandler<Function>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: FunctionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Function> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "function", params._pathParam(0))
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

        private val listHandler: Handler<FunctionListPageResponse> =
            jsonHandler<FunctionListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: FunctionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FunctionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "function")
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
                        FunctionListPage.builder()
                            .service(FunctionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Function> =
            jsonHandler<Function>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: FunctionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Function> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "function", params._pathParam(0))
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

        private val invokeHandler: Handler<Optional<FunctionInvokeResponse>> =
            jsonHandler<Optional<FunctionInvokeResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun invoke(
            params: FunctionInvokeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Optional<FunctionInvokeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "function", params._pathParam(0), "invoke")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { invokeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.ifPresent { it.validate() }
                        }
                    }
            }
        }

        private val replaceHandler: Handler<Function> =
            jsonHandler<Function>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun replace(
            params: FunctionReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Function> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("v1", "function")
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
