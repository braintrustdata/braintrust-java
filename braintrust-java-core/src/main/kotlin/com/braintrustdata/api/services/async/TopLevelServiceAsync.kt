// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.models.TopLevelHelloWorldParams
import java.util.concurrent.CompletableFuture

interface TopLevelServiceAsync {

    /** Default endpoint. Simply replies with 'Hello, World!'. Authorization is not required */
    @JvmOverloads
    fun helloWorld(
        params: TopLevelHelloWorldParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>
}
