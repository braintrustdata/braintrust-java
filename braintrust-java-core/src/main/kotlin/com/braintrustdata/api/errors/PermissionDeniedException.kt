package com.braintrustdata.api.errors

import com.braintrustdata.api.core.http.Headers

class PermissionDeniedException(
        headers: Headers,
        body: String,
        error: BraintrustError,
) : BraintrustServiceException(403, headers, body, error)
