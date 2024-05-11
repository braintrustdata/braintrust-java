// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrust.api.services.async

import com.braintrust.api.core.RequestOptions
import com.braintrust.api.models.User
import com.braintrust.api.models.UserListPageAsync
import com.braintrust.api.models.UserListParams
import com.braintrust.api.models.UserRetrieveParams
import java.util.concurrent.CompletableFuture

interface UserServiceAsync {

    /** Get a user object by its id */
    @JvmOverloads
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<User>

    /**
     * List out all users. The users are sorted by creation date, with the most recently-created
     * users coming first
     */
    @JvmOverloads
    fun list(
        params: UserListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<UserListPageAsync>
}
