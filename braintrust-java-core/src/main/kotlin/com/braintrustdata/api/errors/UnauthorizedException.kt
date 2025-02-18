package com.braintrustdata.api.errors

import com.braintrustdata.api.core.http.Headers

class UnauthorizedException(headers: Headers, body: String, error: BraintrustError) :
    BraintrustServiceException(401, headers, body, error)
