package com.braintrustdata.api.errors

import com.google.common.collect.ListMultimap

class BadRequestException(
    headers: ListMultimap<String, String>,
    body: String,
    error: BraintrustError,
) : BraintrustServiceException(400, headers, body, error)
