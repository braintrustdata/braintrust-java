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
import com.braintrustdata.api.core.json
import com.braintrustdata.api.core.prepareAsync
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.EvalCreateParams
import com.braintrustdata.api.models.SummarizeExperimentResponse
import java.util.concurrent.CompletableFuture

class EvalServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : EvalServiceAsync {

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
    ): CompletableFuture<SummarizeExperimentResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "eval")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
