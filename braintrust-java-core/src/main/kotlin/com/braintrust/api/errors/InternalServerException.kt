package com.braintrust.api.errors

import com.google.common.collect.ListMultimap

class InternalServerException
constructor(
    private val statusCode: Int,
    headers: ListMultimap<String, String>,
    private val error: BraintrustError,
) : BraintrustServiceException(headers, "${error}") {
    override fun statusCode(): Int = statusCode

    fun error(): BraintrustError = error
}
