// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrust.api.services.blocking

import com.braintrust.api.core.RequestOptions
import com.braintrust.api.models.Dataset
import com.braintrust.api.models.DatasetCreateParams
import com.braintrust.api.models.DatasetDeleteParams
import com.braintrust.api.models.DatasetFeedbackParams
import com.braintrust.api.models.DatasetFetchParams
import com.braintrust.api.models.DatasetFetchPostParams
import com.braintrust.api.models.DatasetFetchPostResponse
import com.braintrust.api.models.DatasetFetchResponse
import com.braintrust.api.models.DatasetInsertParams
import com.braintrust.api.models.DatasetInsertResponse
import com.braintrust.api.models.DatasetListPage
import com.braintrust.api.models.DatasetListParams
import com.braintrust.api.models.DatasetReplaceParams
import com.braintrust.api.models.DatasetRetrieveParams
import com.braintrust.api.models.DatasetUpdateParams

interface DatasetService {

    /**
     * Create a new dataset. If there is an existing dataset in the project with the same name as
     * the one specified in the request, will return the existing dataset unmodified
     */
    @JvmOverloads
    fun create(
        params: DatasetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Dataset

    /** Get a dataset object by its id */
    @JvmOverloads
    fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Dataset

    /**
     * Partially update a dataset object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(
        params: DatasetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Dataset

    /**
     * List out all datasets. The datasets are sorted by creation date, with the most
     * recently-created datasets coming first
     */
    @JvmOverloads
    fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DatasetListPage

    /** Delete a dataset object by its id */
    @JvmOverloads
    fun delete(
        params: DatasetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Dataset

    /** Log feedback for a set of dataset events */
    @JvmOverloads
    fun feedback(
        params: DatasetFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    /**
     * Fetch the events in a dataset. Equivalent to the POST form of the same path, but with the
     * parameters in the URL query rather than in the request body
     */
    @JvmOverloads
    fun fetch(
        params: DatasetFetchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DatasetFetchResponse

    /**
     * Fetch the events in a dataset. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query
     */
    @JvmOverloads
    fun fetchPost(
        params: DatasetFetchPostParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DatasetFetchPostResponse

    /** Insert a set of events into the dataset */
    @JvmOverloads
    fun insert(
        params: DatasetInsertParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DatasetInsertResponse

    /**
     * NOTE: This operation is deprecated and will be removed in a future revision of the API.
     * Create or replace a new dataset. If there is an existing dataset in the project with the same
     * name as the one specified in the request, will return the existing dataset unmodified, will
     * replace the existing dataset with the provided fields
     */
    @JvmOverloads
    fun replace(
        params: DatasetReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Dataset
}
