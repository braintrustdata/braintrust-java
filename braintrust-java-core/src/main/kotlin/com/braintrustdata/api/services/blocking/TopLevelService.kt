// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.TopLevelHelloWorldParams
import com.google.errorprone.annotations.MustBeClosed

interface TopLevelService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Default endpoint. Simply replies with 'Hello, World!'. Authorization is not required */
    fun helloWorld(): String = helloWorld(TopLevelHelloWorldParams.none())

    /** @see [helloWorld] */
    fun helloWorld(
        params: TopLevelHelloWorldParams = TopLevelHelloWorldParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see [helloWorld] */
    fun helloWorld(params: TopLevelHelloWorldParams = TopLevelHelloWorldParams.none()): String =
        helloWorld(params, RequestOptions.none())

    /** @see [helloWorld] */
    fun helloWorld(requestOptions: RequestOptions): String =
        helloWorld(TopLevelHelloWorldParams.none(), requestOptions)

    /** A view of [TopLevelService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1`, but is otherwise the same as
         * [TopLevelService.helloWorld].
         */
        @MustBeClosed
        fun helloWorld(): HttpResponseFor<String> = helloWorld(TopLevelHelloWorldParams.none())

        /** @see [helloWorld] */
        @MustBeClosed
        fun helloWorld(
            params: TopLevelHelloWorldParams = TopLevelHelloWorldParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see [helloWorld] */
        @MustBeClosed
        fun helloWorld(
            params: TopLevelHelloWorldParams = TopLevelHelloWorldParams.none()
        ): HttpResponseFor<String> = helloWorld(params, RequestOptions.none())

        /** @see [helloWorld] */
        @MustBeClosed
        fun helloWorld(requestOptions: RequestOptions): HttpResponseFor<String> =
            helloWorld(TopLevelHelloWorldParams.none(), requestOptions)
    }
}
