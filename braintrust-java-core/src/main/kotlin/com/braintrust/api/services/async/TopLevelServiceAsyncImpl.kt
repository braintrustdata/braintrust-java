// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.services.async

import com.braintrust.api.core.ClientOptions
import com.braintrust.api.core.RequestOptions
import com.braintrust.api.core.http.HttpMethod
import com.braintrust.api.core.http.HttpRequest
import com.braintrust.api.core.http.HttpResponse.Handler
import com.braintrust.api.errors.BraintrustError
import com.braintrust.api.models.TopLevelHelloWorldParams
import com.braintrust.api.services.errorHandler
import com.braintrust.api.services.stringHandler
import com.braintrust.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class TopLevelServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : TopLevelServiceAsync {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val helloWorldHandler: Handler<String> = stringHandler().withErrorHandler(errorHandler)

    /** Default endpoint. Simply replies with 'Hello, World!'. Authorization is not required */
    override fun helloWorld(
        params: TopLevelHelloWorldParams,
        requestOptions: RequestOptions
    ): CompletableFuture<String> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { helloWorldHandler.handle(it) }
        }
    }
}
