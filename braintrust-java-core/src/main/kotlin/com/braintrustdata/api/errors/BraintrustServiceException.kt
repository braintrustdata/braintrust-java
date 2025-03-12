package com.braintrustdata.api.errors

import com.braintrustdata.api.core.http.Headers

abstract class BraintrustServiceException
@JvmOverloads
constructor(
    private val statusCode: Int,
    private val headers: Headers,
    private val body: String,
    private val error: BraintrustError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null,
) : BraintrustException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): BraintrustError = error
}
