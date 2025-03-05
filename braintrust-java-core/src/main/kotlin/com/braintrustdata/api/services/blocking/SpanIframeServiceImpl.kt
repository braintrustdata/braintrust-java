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
import com.braintrustdata.api.models.SpanIFrame
import com.braintrustdata.api.models.SpanIframeCreateParams
import com.braintrustdata.api.models.SpanIframeDeleteParams
import com.braintrustdata.api.models.SpanIframeListPage
import com.braintrustdata.api.models.SpanIframeListParams
import com.braintrustdata.api.models.SpanIframeReplaceParams
import com.braintrustdata.api.models.SpanIframeRetrieveParams
import com.braintrustdata.api.models.SpanIframeUpdateParams

class SpanIframeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SpanIframeService {

    private val withRawResponse: SpanIframeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SpanIframeService.WithRawResponse = withRawResponse

    override fun create(
        params: SpanIframeCreateParams,
        requestOptions: RequestOptions,
    ): SpanIFrame =
        // post /v1/span_iframe
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: SpanIframeRetrieveParams,
        requestOptions: RequestOptions,
    ): SpanIFrame =
        // get /v1/span_iframe/{span_iframe_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: SpanIframeUpdateParams,
        requestOptions: RequestOptions,
    ): SpanIFrame =
        // patch /v1/span_iframe/{span_iframe_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: SpanIframeListParams,
        requestOptions: RequestOptions,
    ): SpanIframeListPage =
        // get /v1/span_iframe
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: SpanIframeDeleteParams,
        requestOptions: RequestOptions,
    ): SpanIFrame =
        // delete /v1/span_iframe/{span_iframe_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun replace(
        params: SpanIframeReplaceParams,
        requestOptions: RequestOptions,
    ): SpanIFrame =
        // put /v1/span_iframe
        withRawResponse().replace(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SpanIframeService.WithRawResponse {

        private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<SpanIFrame> =
            jsonHandler<SpanIFrame>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: SpanIframeCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SpanIFrame> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "span_iframe")
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

        private val retrieveHandler: Handler<SpanIFrame> =
            jsonHandler<SpanIFrame>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: SpanIframeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SpanIFrame> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "span_iframe", params.getPathParam(0))
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

        private val updateHandler: Handler<SpanIFrame> =
            jsonHandler<SpanIFrame>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: SpanIframeUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SpanIFrame> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "span_iframe", params.getPathParam(0))
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

        private val listHandler: Handler<SpanIframeListPage.Response> =
            jsonHandler<SpanIframeListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: SpanIframeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SpanIframeListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "span_iframe")
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
                    .let { SpanIframeListPage.of(SpanIframeServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<SpanIFrame> =
            jsonHandler<SpanIFrame>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: SpanIframeDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SpanIFrame> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "span_iframe", params.getPathParam(0))
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

        private val replaceHandler: Handler<SpanIFrame> =
            jsonHandler<SpanIFrame>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun replace(
            params: SpanIframeReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SpanIFrame> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("v1", "span_iframe")
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
