package com.braintrustdata.api.errors

import com.braintrustdata.api.core.http.Headers

class BadRequestException(
    headers: Headers,
    body: String,
    error: BraintrustError,
) : BraintrustServiceException(400, headers, body, error)
