// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrust.api.services.async

import com.braintrust.api.core.RequestOptions
import com.braintrust.api.models.Experiment
import com.braintrust.api.models.ExperimentCreateParams
import com.braintrust.api.models.ExperimentDeleteParams
import com.braintrust.api.models.ExperimentFeedbackParams
import com.braintrust.api.models.ExperimentFetchParams
import com.braintrust.api.models.ExperimentFetchPostParams
import com.braintrust.api.models.ExperimentFetchPostResponse
import com.braintrust.api.models.ExperimentFetchResponse
import com.braintrust.api.models.ExperimentInsertParams
import com.braintrust.api.models.ExperimentInsertResponse
import com.braintrust.api.models.ExperimentListPageAsync
import com.braintrust.api.models.ExperimentListParams
import com.braintrust.api.models.ExperimentReplaceParams
import com.braintrust.api.models.ExperimentRetrieveParams
import com.braintrust.api.models.ExperimentSummarizeParams
import com.braintrust.api.models.ExperimentSummarizeResponse
import com.braintrust.api.models.ExperimentUpdateParams
import java.util.concurrent.CompletableFuture

interface ExperimentServiceAsync {

    /**
     * Create a new experiment. If there is an existing experiment in the project with the same name
     * as the one specified in the request, will return the existing experiment unmodified
     */
    @JvmOverloads
    fun create(
        params: ExperimentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Experiment>

    /** Get an experiment object by its id */
    @JvmOverloads
    fun retrieve(
        params: ExperimentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Experiment>

    /**
     * Partially update an experiment object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(
        params: ExperimentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Experiment>

    /**
     * List out all experiments. The experiments are sorted by creation date, with the most
     * recently-created experiments coming first
     */
    @JvmOverloads
    fun list(
        params: ExperimentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ExperimentListPageAsync>

    /** Delete an experiment object by its id */
    @JvmOverloads
    fun delete(
        params: ExperimentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Experiment>

    /** Log feedback for a set of experiment events */
    @JvmOverloads
    fun feedback(
        params: ExperimentFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>

    /**
     * Fetch the events in an experiment. Equivalent to the POST form of the same path, but with the
     * parameters in the URL query rather than in the request body
     */
    @JvmOverloads
    fun fetch(
        params: ExperimentFetchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ExperimentFetchResponse>

    /**
     * Fetch the events in an experiment. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query
     */
    @JvmOverloads
    fun fetchPost(
        params: ExperimentFetchPostParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ExperimentFetchPostResponse>

    /** Insert a set of events into the experiment */
    @JvmOverloads
    fun insert(
        params: ExperimentInsertParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ExperimentInsertResponse>

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
    ): CompletableFuture<Experiment>

    /** Summarize experiment */
    @JvmOverloads
    fun summarize(
        params: ExperimentSummarizeParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ExperimentSummarizeResponse>
}
