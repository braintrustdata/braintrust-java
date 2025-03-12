package com.braintrustdata.api.errors

import com.braintrustdata.api.core.http.Headers

class RateLimitException(
        headers: Headers,
        body: String,
        error: BraintrustError,
) : BraintrustServiceException(429, headers, body, error)
