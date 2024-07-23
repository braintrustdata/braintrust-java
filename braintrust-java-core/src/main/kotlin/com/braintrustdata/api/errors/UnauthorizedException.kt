package com.braintrustdata.api.errors

import com.google.common.collect.ListMultimap

class UnauthorizedException
constructor(
        headers: ListMultimap<String, String>,
        private val error: BraintrustError,
) : BraintrustServiceException(headers, "${error}") {
    override fun statusCode(): Int = 401
    fun error(): BraintrustError = error
}
