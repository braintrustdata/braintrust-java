package com.braintrustdata.api.errors

import com.google.common.collect.ListMultimap

class UnexpectedStatusCodeException(
    statusCode: Int,
    headers: ListMultimap<String, String>,
    body: String,
    error: BraintrustError,
) : BraintrustServiceException(statusCode, headers, body, error)
