package com.braintrust.api.errors

class BraintrustIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    BraintrustException(message, cause)
