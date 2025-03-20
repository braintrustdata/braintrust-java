// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.errors

import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.http.Headers

abstract class BraintrustServiceException
protected constructor(message: String, cause: Throwable? = null) :
    BraintrustException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
