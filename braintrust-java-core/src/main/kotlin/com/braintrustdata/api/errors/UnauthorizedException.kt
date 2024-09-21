package com.braintrustdata.api.errors

import com.google.common.collect.ListMultimap

class UnauthorizedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: BraintrustError,
) : BraintrustServiceException(401, headers, body, error)
