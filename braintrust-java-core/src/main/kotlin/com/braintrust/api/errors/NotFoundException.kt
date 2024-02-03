package com.braintrust.api.errors

import com.google.common.collect.ListMultimap

class NotFoundException
constructor(
    headers: ListMultimap<String, String>,
    private val error: BraintrustError,
) : BraintrustServiceException(headers, "${error}") {
    override fun statusCode(): Int = 404
    fun error(): BraintrustError = error
}
