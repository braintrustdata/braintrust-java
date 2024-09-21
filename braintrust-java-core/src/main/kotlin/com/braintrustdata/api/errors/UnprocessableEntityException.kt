package com.braintrustdata.api.errors

import com.google.common.collect.ListMultimap

class UnprocessableEntityException(
    headers: ListMultimap<String, String>,
    body: String,
    error: BraintrustError,
) : BraintrustServiceException(422, headers, body, error)
