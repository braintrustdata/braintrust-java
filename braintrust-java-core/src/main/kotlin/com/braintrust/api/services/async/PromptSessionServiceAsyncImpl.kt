// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.services.async

import com.braintrust.api.core.ClientOptions
import com.braintrust.api.core.http.HttpResponse.Handler
import com.braintrust.api.errors.BraintrustError
import com.braintrust.api.services.errorHandler

class PromptSessionServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : PromptSessionServiceAsync {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)
}
