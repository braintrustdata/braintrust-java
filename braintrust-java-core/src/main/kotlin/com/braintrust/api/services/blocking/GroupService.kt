// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrust.api.services.blocking

import com.braintrust.api.core.RequestOptions
import com.braintrust.api.models.Group
import com.braintrust.api.models.GroupCreateParams
import com.braintrust.api.models.GroupDeleteParams
import com.braintrust.api.models.GroupListPage
import com.braintrust.api.models.GroupListParams
import com.braintrust.api.models.GroupReplaceParams
import com.braintrust.api.models.GroupRetrieveParams
import com.braintrust.api.models.GroupUpdateParams

interface GroupService {

    /**
     * Create a new group. If there is an existing group with the same name as the one specified in
     * the request, will return the existing group unmodified
     */
    @JvmOverloads
    fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Group

    /** Get a group object by its id */
    @JvmOverloads
    fun retrieve(
        params: GroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Group

    /**
     * Partially update a group object. Specify the fields to update in the payload. Any object-type
     * fields will be deep-merged with existing content. Currently we do not support removing fields
     * or setting them to null.
     */
    @JvmOverloads
    fun update(
        params: GroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Group

    /**
     * List out all groups. The groups are sorted by creation date, with the most recently-created
     * groups coming first
     */
    @JvmOverloads
    fun list(
        params: GroupListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): GroupListPage

    /** Delete a group object by its id */
    @JvmOverloads
    fun delete(
        params: GroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Group

    /**
     * NOTE: This operation is deprecated and will be removed in a future revision of the API.
     * Create or replace a new group. If there is an existing group with the same name as the one
     * specified in the request, will return the existing group unmodified, will replace the
     * existing group with the provided fields
     */
    @JvmOverloads
    fun replace(
        params: GroupReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Group
}
