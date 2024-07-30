// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.models.View
import com.braintrustdata.api.models.ViewCreateParams
import com.braintrustdata.api.models.ViewDeleteParams
import com.braintrustdata.api.models.ViewListPage
import com.braintrustdata.api.models.ViewListParams
import com.braintrustdata.api.models.ViewReplaceParams
import com.braintrustdata.api.models.ViewRetrieveParams
import com.braintrustdata.api.models.ViewUpdateParams

interface ViewService {

    /**
     * Create a new view. If there is an existing view in the project with the same name as the one
     * specified in the request, will return the existing view unmodified
     */
    @JvmOverloads
    fun create(
        params: ViewCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): View

    /** Get a view object by its id */
    @JvmOverloads
    fun retrieve(
        params: ViewRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): View

    /**
     * Partially update a view object. Specify the fields to update in the payload. Any object-type
     * fields will be deep-merged with existing content. Currently we do not support removing fields
     * or setting them to null.
     */
    @JvmOverloads
    fun update(
        params: ViewUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): View

    /**
     * List out all views. The views are sorted by creation date, with the most recently-created
     * views coming first
     */
    @JvmOverloads
    fun list(
        params: ViewListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ViewListPage

    /** Delete a view object by its id */
    @JvmOverloads
    fun delete(
        params: ViewDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): View

    /**
     * Create or replace view. If there is an existing view in the project with the same name as the
     * one specified in the request, will replace the existing view with the provided fields
     */
    @JvmOverloads
    fun replace(
        params: ViewReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): View
}
