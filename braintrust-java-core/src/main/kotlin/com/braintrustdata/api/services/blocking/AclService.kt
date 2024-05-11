// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.models.Acl
import com.braintrustdata.api.models.AclCreateParams
import com.braintrustdata.api.models.AclDeleteParams
import com.braintrustdata.api.models.AclListPage
import com.braintrustdata.api.models.AclListParams
import com.braintrustdata.api.models.AclReplaceParams
import com.braintrustdata.api.models.AclRetrieveParams

interface AclService {

    /**
     * Create a new acl. If there is an existing acl with the same contents as the one specified in
     * the request, will return the existing acl unmodified
     */
    @JvmOverloads
    fun create(params: AclCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Acl

    /** Get an acl object by its id */
    @JvmOverloads
    fun retrieve(
        params: AclRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Acl

    /**
     * List out all acls. The acls are sorted by creation date, with the most recently-created acls
     * coming first
     */
    @JvmOverloads
    fun list(
        params: AclListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AclListPage

    /** Delete an acl object by its id */
    @JvmOverloads
    fun delete(params: AclDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): Acl

    /**
     * NOTE: This operation is deprecated and will be removed in a future revision of the API.
     * Create or replace a new acl. If there is an existing acl with the same contents as the one
     * specified in the request, will return the existing acl unmodified, will replace the existing
     * acl with the provided fields
     */
    @JvmOverloads
    fun replace(
        params: AclReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Acl
}
