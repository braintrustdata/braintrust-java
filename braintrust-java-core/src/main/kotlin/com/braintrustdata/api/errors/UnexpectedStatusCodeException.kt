package com.braintrustdata.api.errors

import com.braintrustdata.api.core.http.Headers

class UnexpectedStatusCodeException(
        statusCode: Int,
        headers: Headers,
        body: String,
        error: BraintrustError,
) : BraintrustServiceException(statusCode, headers, body, error)
