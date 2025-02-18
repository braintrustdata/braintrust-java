package com.braintrustdata.api.errors

import com.braintrustdata.api.core.http.Headers

class UnprocessableEntityException(headers: Headers, body: String, error: BraintrustError) :
    BraintrustServiceException(422, headers, body, error)
