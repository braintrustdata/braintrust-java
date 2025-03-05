// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.handlers.errorHandler
import com.braintrustdata.api.core.handlers.stringHandler
import com.braintrustdata.api.core.handlers.withErrorHandler
import com.braintrustdata.api.core.http.HttpMethod
import com.braintrustdata.api.core.http.HttpRequest
import com.braintrustdata.api.core.http.HttpResponse.Handler
import com.braintrustdata.api.core.prepare
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.models.TopLevelHelloWorldParams

class TopLevelServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TopLevelService {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val helloWorldHandler: Handler<String> = stringHandler().withErrorHandler(errorHandler)

    /** Default endpoint. Simply replies with 'Hello, World!'. Authorization is not required */
    override fun helloWorld(
        params: TopLevelHelloWorldParams,
        requestOptions: RequestOptions,
    ): String {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1")
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response.use { helloWorldHandler.handle(it) }
    }
}
