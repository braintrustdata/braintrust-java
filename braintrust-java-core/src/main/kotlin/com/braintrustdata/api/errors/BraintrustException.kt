package com.braintrustdata.api.errors

open class BraintrustException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
