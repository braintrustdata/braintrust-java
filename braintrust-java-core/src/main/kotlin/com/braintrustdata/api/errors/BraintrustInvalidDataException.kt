package com.braintrustdata.api.errors

class BraintrustInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    BraintrustException(message, cause)
