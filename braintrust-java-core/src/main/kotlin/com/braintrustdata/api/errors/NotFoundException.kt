package com.braintrustdata.api.errors

import com.braintrustdata.api.core.http.Headers

class NotFoundException(
        headers: Headers,
        body: String,
        error: BraintrustError,
) : BraintrustServiceException(404, headers, body, error)
