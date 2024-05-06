// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.services.async

import com.braintrust.api.core.ClientOptions
import com.braintrust.api.core.RequestOptions
import com.braintrust.api.core.http.HttpMethod
import com.braintrust.api.core.http.HttpRequest
import com.braintrust.api.core.http.HttpResponse.Handler
import com.braintrust.api.errors.BraintrustError
import com.braintrust.api.models.User
import com.braintrust.api.models.UserListPageAsync
import com.braintrust.api.models.UserListParams
import com.braintrust.api.models.UserRetrieveParams
import com.braintrust.api.services.errorHandler
import com.braintrust.api.services.jsonHandler
import com.braintrust.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class UserServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : UserServiceAsync {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<User> =
        jsonHandler<User>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a user object by its id */
    override fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<User> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "user", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<UserListPageAsync.Response> =
        jsonHandler<UserListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List out all users. The users are sorted by creation date, with the most recently-created
     * users coming first
     */
    override fun list(
        params: UserListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<UserListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "user")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { UserListPageAsync.of(this, params, it) }
        }
    }
}
