// File generated from our OpenAPI spec by Stainless.

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
    fun helloWorld(): CompletableFuture<String> = helloWorld(TopLevelHelloWorldParams.none())

    /** @see [helloWorld] */
    fun helloWorld(
        params: TopLevelHelloWorldParams = TopLevelHelloWorldParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see [helloWorld] */
    fun helloWorld(
        params: TopLevelHelloWorldParams = TopLevelHelloWorldParams.none()
    ): CompletableFuture<String> = helloWorld(params, RequestOptions.none())

    /** @see [helloWorld] */
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
        @MustBeClosed
        fun helloWorld(): CompletableFuture<HttpResponseFor<String>> =
            helloWorld(TopLevelHelloWorldParams.none())

        /** @see [helloWorld] */
        @MustBeClosed
        fun helloWorld(
            params: TopLevelHelloWorldParams = TopLevelHelloWorldParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see [helloWorld] */
        @MustBeClosed
        fun helloWorld(
            params: TopLevelHelloWorldParams = TopLevelHelloWorldParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = helloWorld(params, RequestOptions.none())

        /** @see [helloWorld] */
        @MustBeClosed
        fun helloWorld(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            helloWorld(TopLevelHelloWorldParams.none(), requestOptions)
    }
}
