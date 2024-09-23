// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.models.Acl
import com.braintrustdata.api.models.AclBatchUpdateParams
import com.braintrustdata.api.models.AclBatchUpdateResponse
import com.braintrustdata.api.models.AclCreateParams
import com.braintrustdata.api.models.AclDeleteParams
import com.braintrustdata.api.models.AclFindAndDeleteParams
import com.braintrustdata.api.models.AclListPageAsync
import com.braintrustdata.api.models.AclListParams
import com.braintrustdata.api.models.AclRetrieveParams
import java.util.concurrent.CompletableFuture

interface AclServiceAsync {

    /**
     * Create a new acl. If there is an existing acl with the same contents as the one specified in
     * the request, will return the existing acl unmodified
     */
    @JvmOverloads
    fun create(
        params: AclCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Acl>

    /** Get an acl object by its id */
    @JvmOverloads
    fun retrieve(
        params: AclRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Acl>

    /**
     * List out all acls. The acls are sorted by creation date, with the most recently-created acls
     * coming first
     */
    @JvmOverloads
    fun list(
        params: AclListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AclListPageAsync>

    /** Delete an acl object by its id */
    @JvmOverloads
    fun delete(
        params: AclDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Acl>

    /**
     * Batch update acls. This operation is idempotent, so adding acls which already exist will have
     * no effect, and removing acls which do not exist will have no effect.
     */
    @JvmOverloads
    fun batchUpdate(
        params: AclBatchUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AclBatchUpdateResponse>

    /** Delete a single acl */
    @JvmOverloads
    fun findAndDelete(
        params: AclFindAndDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Acl>
}
