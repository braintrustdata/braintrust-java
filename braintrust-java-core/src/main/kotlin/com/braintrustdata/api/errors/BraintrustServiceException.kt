package com.braintrustdata.api.errors

import com.google.common.collect.ListMultimap

abstract class BraintrustServiceException
@JvmOverloads
constructor(
    private val statusCode: Int,
    private val headers: ListMultimap<String, String>,
    private val body: String,
    private val error: BraintrustError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : BraintrustException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): ListMultimap<String, String> = headers

    fun body(): String = body

    fun error(): BraintrustError = error
}
