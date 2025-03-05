// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.TopLevelHelloWorldParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface TopLevelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Default endpoint. Simply replies with 'Hello, World!'. Authorization is not required */
    @JvmOverloads
    fun helloWorld(
        params: TopLevelHelloWorldParams = TopLevelHelloWorldParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** Default endpoint. Simply replies with 'Hello, World!'. Authorization is not required */
    fun helloWorld(requestOptions: RequestOptions): CompletableFuture<String> =
        helloWorld(TopLevelHelloWorldParams.none(), requestOptions)

    /**
     * A view of [TopLevelServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1`, but is otherwise the same as
         * [TopLevelServiceAsync.helloWorld].
         */
        @JvmOverloads
        @MustBeClosed
        fun helloWorld(
            params: TopLevelHelloWorldParams = TopLevelHelloWorldParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `get /v1`, but is otherwise the same as
         * [TopLevelServiceAsync.helloWorld].
         */
        @MustBeClosed
        fun helloWorld(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            helloWorld(TopLevelHelloWorldParams.none(), requestOptions)
    }
}
