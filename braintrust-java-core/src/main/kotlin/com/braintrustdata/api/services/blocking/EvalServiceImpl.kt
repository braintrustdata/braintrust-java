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
import com.braintrustdata.api.core.json
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.EvalCreateParams
import com.braintrustdata.api.models.SummarizeExperimentResponse

class EvalServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : EvalService {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<SummarizeExperimentResponse> =
        jsonHandler<SummarizeExperimentResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Launch an evaluation. This is the API-equivalent of the `Eval` function that is built into
     * the Braintrust SDK. In the Eval API, you provide pointers to a dataset, task function, and
     * scoring functions. The API will then run the evaluation, create an experiment, and return the
     * results along with a link to the experiment. To learn more about evals, see the
     * [Evals guide](https://www.braintrust.dev/docs/guides/evals).
     */
    override fun create(
        params: EvalCreateParams,
        requestOptions: RequestOptions
    ): SummarizeExperimentResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "eval")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
