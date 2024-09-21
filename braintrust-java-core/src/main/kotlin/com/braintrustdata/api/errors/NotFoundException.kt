package com.braintrustdata.api.errors

import com.google.common.collect.ListMultimap

class NotFoundException(
    headers: ListMultimap<String, String>,
    body: String,
    error: BraintrustError,
) : BraintrustServiceException(404, headers, body, error)
