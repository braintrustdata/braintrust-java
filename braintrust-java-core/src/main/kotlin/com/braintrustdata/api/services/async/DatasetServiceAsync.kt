// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.models.Dataset
import com.braintrustdata.api.models.DatasetCreateParams
import com.braintrustdata.api.models.DatasetDeleteParams
import com.braintrustdata.api.models.DatasetFeedbackParams
import com.braintrustdata.api.models.DatasetFetchParams
import com.braintrustdata.api.models.DatasetFetchPostParams
import com.braintrustdata.api.models.DatasetFetchPostResponse
import com.braintrustdata.api.models.DatasetFetchResponse
import com.braintrustdata.api.models.DatasetInsertParams
import com.braintrustdata.api.models.DatasetInsertResponse
import com.braintrustdata.api.models.DatasetListPageAsync
import com.braintrustdata.api.models.DatasetListParams
import com.braintrustdata.api.models.DatasetReplaceParams
import com.braintrustdata.api.models.DatasetRetrieveParams
import com.braintrustdata.api.models.DatasetUpdateParams
import java.util.concurrent.CompletableFuture

interface DatasetServiceAsync {

    /**
     * Create a new dataset. If there is an existing dataset in the project with the same name as
     * the one specified in the request, will return the existing dataset unmodified
     */
    @JvmOverloads
    fun create(
        params: DatasetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Dataset>

    /** Get a dataset object by its id */
    @JvmOverloads
    fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Dataset>

    /**
     * Partially update a dataset object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null. As a workaround, you may retrieve the full object
     * with `GET /dataset/{id}` and then replace it with `PUT /dataset`.
     */
    @JvmOverloads
    fun update(
        params: DatasetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Dataset>

    /**
     * List out all datasets. The datasets are sorted by creation date, with the most
     * recently-created datasets coming first
     */
    @JvmOverloads
    fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetListPageAsync>

    /** Delete a dataset object by its id */
    @JvmOverloads
    fun delete(
        params: DatasetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Dataset>

    /** Log feedback for a set of dataset events */
    @JvmOverloads
    fun feedback(
        params: DatasetFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>

    /**
     * Fetch the events in a dataset. Equivalent to the POST form of the same path, but with the
     * parameters in the URL query rather than in the request body
     */
    @JvmOverloads
    fun fetch(
        params: DatasetFetchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetFetchResponse>

    /**
     * Fetch the events in a dataset. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query
     */
    @JvmOverloads
    fun fetchPost(
        params: DatasetFetchPostParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetFetchPostResponse>

    /** Insert a set of events into the dataset */
    @JvmOverloads
    fun insert(
        params: DatasetInsertParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetInsertResponse>

    /**
     * Create or replace a new dataset. If there is an existing dataset in the project with the same
     * name as the one specified in the request, will replace the existing dataset with the provided
     * fields
     */
    @JvmOverloads
    fun replace(
        params: DatasetReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Dataset>
}
