// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.models.Experiment
import com.braintrustdata.api.models.ExperimentCreateParams
import com.braintrustdata.api.models.ExperimentDeleteParams
import com.braintrustdata.api.models.ExperimentFeedbackParams
import com.braintrustdata.api.models.ExperimentFetchParams
import com.braintrustdata.api.models.ExperimentFetchPostParams
import com.braintrustdata.api.models.ExperimentFetchPostResponse
import com.braintrustdata.api.models.ExperimentFetchResponse
import com.braintrustdata.api.models.ExperimentInsertParams
import com.braintrustdata.api.models.ExperimentInsertResponse
import com.braintrustdata.api.models.ExperimentListPage
import com.braintrustdata.api.models.ExperimentListParams
import com.braintrustdata.api.models.ExperimentReplaceParams
import com.braintrustdata.api.models.ExperimentRetrieveParams
import com.braintrustdata.api.models.ExperimentSummarizeParams
import com.braintrustdata.api.models.ExperimentSummarizeResponse
import com.braintrustdata.api.models.ExperimentUpdateParams

interface ExperimentService {

    /**
     * Create a new experiment. If there is an existing experiment in the project with the same name
     * as the one specified in the request, will return the existing experiment unmodified
     */
    @JvmOverloads
    fun create(
        params: ExperimentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Experiment

    /** Get an experiment object by its id */
    @JvmOverloads
    fun retrieve(
        params: ExperimentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Experiment

    /**
     * Partially update an experiment object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(
        params: ExperimentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Experiment

    /**
     * List out all experiments. The experiments are sorted by creation date, with the most
     * recently-created experiments coming first
     */
    @JvmOverloads
    fun list(
        params: ExperimentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExperimentListPage

    /** Delete an experiment object by its id */
    @JvmOverloads
    fun delete(
        params: ExperimentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Experiment

    /** Log feedback for a set of experiment events */
    @JvmOverloads
    fun feedback(
        params: ExperimentFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    /**
     * Fetch the events in an experiment. Equivalent to the POST form of the same path, but with the
     * parameters in the URL query rather than in the request body
     */
    @JvmOverloads
    fun fetch(
        params: ExperimentFetchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExperimentFetchResponse

    /**
     * Fetch the events in an experiment. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query
     */
    @JvmOverloads
    fun fetchPost(
        params: ExperimentFetchPostParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExperimentFetchPostResponse

    /** Insert a set of events into the experiment */
    @JvmOverloads
    fun insert(
        params: ExperimentInsertParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExperimentInsertResponse

    /**
     * NOTE: This operation is deprecated and will be removed in a future revision of the API.
     * Create or replace a new experiment. If there is an existing experiment in the project with
     * the same name as the one specified in the request, will return the existing experiment
     * unmodified, will replace the existing experiment with the provided fields
     */
    @JvmOverloads
    fun replace(
        params: ExperimentReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Experiment

    /** Summarize experiment */
    @JvmOverloads
    fun summarize(
        params: ExperimentSummarizeParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExperimentSummarizeResponse
}
