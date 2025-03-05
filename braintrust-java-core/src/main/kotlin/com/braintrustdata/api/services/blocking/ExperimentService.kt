// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.Experiment
import com.braintrustdata.api.models.ExperimentCreateParams
import com.braintrustdata.api.models.ExperimentDeleteParams
import com.braintrustdata.api.models.ExperimentFeedbackParams
import com.braintrustdata.api.models.ExperimentFetchParams
import com.braintrustdata.api.models.ExperimentFetchPostParams
import com.braintrustdata.api.models.ExperimentInsertParams
import com.braintrustdata.api.models.ExperimentListPage
import com.braintrustdata.api.models.ExperimentListParams
import com.braintrustdata.api.models.ExperimentRetrieveParams
import com.braintrustdata.api.models.ExperimentSummarizeParams
import com.braintrustdata.api.models.ExperimentUpdateParams
import com.braintrustdata.api.models.FeedbackResponseSchema
import com.braintrustdata.api.models.FetchExperimentEventsResponse
import com.braintrustdata.api.models.InsertEventsResponse
import com.braintrustdata.api.models.SummarizeExperimentResponse
import com.google.errorprone.annotations.MustBeClosed

interface ExperimentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new experiment. If there is an existing experiment in the project with the same name
     * as the one specified in the request, will return the existing experiment unmodified
     */
    @JvmOverloads
    fun create(
        params: ExperimentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Experiment

    /** Get an experiment object by its id */
    @JvmOverloads
    fun retrieve(
        params: ExperimentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Experiment

    /**
     * Partially update an experiment object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(
        params: ExperimentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Experiment

    /**
     * List out all experiments. The experiments are sorted by creation date, with the most
     * recently-created experiments coming first
     */
    @JvmOverloads
    fun list(
        params: ExperimentListParams = ExperimentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExperimentListPage

    /**
     * List out all experiments. The experiments are sorted by creation date, with the most
     * recently-created experiments coming first
     */
    fun list(requestOptions: RequestOptions): ExperimentListPage =
        list(ExperimentListParams.none(), requestOptions)

    /** Delete an experiment object by its id */
    @JvmOverloads
    fun delete(
        params: ExperimentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Experiment

    /** Log feedback for a set of experiment events */
    @JvmOverloads
    fun feedback(
        params: ExperimentFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackResponseSchema

    /**
     * Fetch the events in an experiment. Equivalent to the POST form of the same path, but with the
     * parameters in the URL query rather than in the request body. For more complex queries, use
     * the `POST /btql` endpoint.
     */
    @JvmOverloads
    fun fetch(
        params: ExperimentFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FetchExperimentEventsResponse

    /**
     * Fetch the events in an experiment. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query. For more complex queries, use
     * the `POST /btql` endpoint.
     */
    @JvmOverloads
    fun fetchPost(
        params: ExperimentFetchPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FetchExperimentEventsResponse

    /** Insert a set of events into the experiment */
    @JvmOverloads
    fun insert(
        params: ExperimentInsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsertEventsResponse

    /** Summarize experiment */
    @JvmOverloads
    fun summarize(
        params: ExperimentSummarizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SummarizeExperimentResponse

    /** A view of [ExperimentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/experiment`, but is otherwise the same as
         * [ExperimentService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ExperimentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Experiment>

        /**
         * Returns a raw HTTP response for `get /v1/experiment/{experiment_id}`, but is otherwise
         * the same as [ExperimentService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ExperimentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Experiment>

        /**
         * Returns a raw HTTP response for `patch /v1/experiment/{experiment_id}`, but is otherwise
         * the same as [ExperimentService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ExperimentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Experiment>

        /**
         * Returns a raw HTTP response for `get /v1/experiment`, but is otherwise the same as
         * [ExperimentService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ExperimentListParams = ExperimentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExperimentListPage>

        /**
         * Returns a raw HTTP response for `get /v1/experiment`, but is otherwise the same as
         * [ExperimentService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExperimentListPage> =
            list(ExperimentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/experiment/{experiment_id}`, but is otherwise
         * the same as [ExperimentService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: ExperimentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Experiment>

        /**
         * Returns a raw HTTP response for `post /v1/experiment/{experiment_id}/feedback`, but is
         * otherwise the same as [ExperimentService.feedback].
         */
        @JvmOverloads
        @MustBeClosed
        fun feedback(
            params: ExperimentFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackResponseSchema>

        /**
         * Returns a raw HTTP response for `get /v1/experiment/{experiment_id}/fetch`, but is
         * otherwise the same as [ExperimentService.fetch].
         */
        @JvmOverloads
        @MustBeClosed
        fun fetch(
            params: ExperimentFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FetchExperimentEventsResponse>

        /**
         * Returns a raw HTTP response for `post /v1/experiment/{experiment_id}/fetch`, but is
         * otherwise the same as [ExperimentService.fetchPost].
         */
        @JvmOverloads
        @MustBeClosed
        fun fetchPost(
            params: ExperimentFetchPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FetchExperimentEventsResponse>

        /**
         * Returns a raw HTTP response for `post /v1/experiment/{experiment_id}/insert`, but is
         * otherwise the same as [ExperimentService.insert].
         */
        @JvmOverloads
        @MustBeClosed
        fun insert(
            params: ExperimentInsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsertEventsResponse>

        /**
         * Returns a raw HTTP response for `get /v1/experiment/{experiment_id}/summarize`, but is
         * otherwise the same as [ExperimentService.summarize].
         */
        @JvmOverloads
        @MustBeClosed
        fun summarize(
            params: ExperimentSummarizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SummarizeExperimentResponse>
    }
}
