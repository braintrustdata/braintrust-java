package com.braintrustdata.api.errors

import com.google.common.collect.ListMultimap

class BadRequestException
constructor(
        headers: ListMultimap<String, String>,
        private val error: BraintrustError,
) : BraintrustServiceException(headers, "${error}") {
    override fun statusCode(): Int = 400
    fun error(): BraintrustError = error
}
