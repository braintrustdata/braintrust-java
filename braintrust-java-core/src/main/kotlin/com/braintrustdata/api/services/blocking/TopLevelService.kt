// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.models.TopLevelHelloWorldParams

interface TopLevelService {

    /** Default endpoint. Simply replies with 'Hello, World!'. Authorization is not required */
    @JvmOverloads
    fun helloWorld(
        params: TopLevelHelloWorldParams = TopLevelHelloWorldParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** Default endpoint. Simply replies with 'Hello, World!'. Authorization is not required */
    fun helloWorld(requestOptions: RequestOptions): String =
        helloWorld(TopLevelHelloWorldParams.none(), requestOptions)
}
