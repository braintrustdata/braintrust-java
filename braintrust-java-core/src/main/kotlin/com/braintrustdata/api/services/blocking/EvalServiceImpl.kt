// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.handlers.errorBodyHandler
import com.braintrustdata.api.core.handlers.errorHandler
import com.braintrustdata.api.core.handlers.jsonHandler
import com.braintrustdata.api.core.http.HttpMethod
import com.braintrustdata.api.core.http.HttpRequest
import com.braintrustdata.api.core.http.HttpResponse
import com.braintrustdata.api.core.http.HttpResponse.Handler
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.core.http.json
import com.braintrustdata.api.core.http.parseable
import com.braintrustdata.api.core.prepare
import com.braintrustdata.api.models.EvalCreateParams
import com.braintrustdata.api.models.SummarizeExperimentResponse
import java.util.function.Consumer

class EvalServiceImpl internal constructor(private val clientOptions: ClientOptions) : EvalService {

    private val withRawResponse: EvalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EvalService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EvalService =
        EvalServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: EvalCreateParams,
        requestOptions: RequestOptions,
    ): SummarizeExperimentResponse =
        // post /v1/eval
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EvalService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EvalService.WithRawResponse =
            EvalServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SummarizeExperimentResponse> =
            jsonHandler<SummarizeExperimentResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EvalCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SummarizeExperimentResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "eval")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
}
