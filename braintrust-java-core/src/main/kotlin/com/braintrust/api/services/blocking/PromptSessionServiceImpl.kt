// File generated from our OpenAPI spec by Stainless.

package com.braintrust.api.services.blocking

import com.braintrust.api.core.ClientOptions
import com.braintrust.api.core.http.HttpResponse.Handler
import com.braintrust.api.errors.BraintrustError
import com.braintrust.api.services.errorHandler

class PromptSessionServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : PromptSessionService {

    private val errorHandler: Handler<BraintrustError> = errorHandler(clientOptions.jsonMapper)
}
