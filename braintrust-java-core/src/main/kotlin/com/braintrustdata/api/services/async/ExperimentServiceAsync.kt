// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.Experiment
import com.braintrustdata.api.models.ExperimentCreateParams
import com.braintrustdata.api.models.ExperimentDeleteParams
import com.braintrustdata.api.models.ExperimentFeedbackParams
import com.braintrustdata.api.models.ExperimentFetchParams
import com.braintrustdata.api.models.ExperimentFetchPostParams
import com.braintrustdata.api.models.ExperimentInsertParams
import com.braintrustdata.api.models.ExperimentListPageAsync
import com.braintrustdata.api.models.ExperimentListParams
import com.braintrustdata.api.models.ExperimentRetrieveParams
import com.braintrustdata.api.models.ExperimentSummarizeParams
import com.braintrustdata.api.models.ExperimentUpdateParams
import com.braintrustdata.api.models.FeedbackResponseSchema
import com.braintrustdata.api.models.FetchExperimentEventsResponse
import com.braintrustdata.api.models.InsertEventsResponse
import com.braintrustdata.api.models.SummarizeExperimentResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface ExperimentServiceAsync {

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
    ): CompletableFuture<Experiment>

    /** Get an experiment object by its id */
    @JvmOverloads
    fun retrieve(
        params: ExperimentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Experiment>

    /**
     * Partially update an experiment object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(
        params: ExperimentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Experiment>

    /**
     * List out all experiments. The experiments are sorted by creation date, with the most
     * recently-created experiments coming first
     */
    @JvmOverloads
    fun list(
        params: ExperimentListParams = ExperimentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExperimentListPageAsync>

    /**
     * List out all experiments. The experiments are sorted by creation date, with the most
     * recently-created experiments coming first
     */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExperimentListPageAsync> =
        list(ExperimentListParams.none(), requestOptions)

    /** Delete an experiment object by its id */
    @JvmOverloads
    fun delete(
        params: ExperimentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Experiment>

    /** Log feedback for a set of experiment events */
    @JvmOverloads
    fun feedback(
        params: ExperimentFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackResponseSchema>

    /**
     * Fetch the events in an experiment. Equivalent to the POST form of the same path, but with the
     * parameters in the URL query rather than in the request body. For more complex queries, use
     * the `POST /btql` endpoint.
     */
    @JvmOverloads
    fun fetch(
        params: ExperimentFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FetchExperimentEventsResponse>

    /**
     * Fetch the events in an experiment. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query. For more complex queries, use
     * the `POST /btql` endpoint.
     */
    @JvmOverloads
    fun fetchPost(
        params: ExperimentFetchPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FetchExperimentEventsResponse>

    /** Insert a set of events into the experiment */
    @JvmOverloads
    fun insert(
        params: ExperimentInsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsertEventsResponse>

    /** Summarize experiment */
    @JvmOverloads
    fun summarize(
        params: ExperimentSummarizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SummarizeExperimentResponse>

    /**
     * A view of [ExperimentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/experiment`, but is otherwise the same as
         * [ExperimentServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ExperimentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Experiment>>

        /**
         * Returns a raw HTTP response for `get /v1/experiment/{experiment_id}`, but is otherwise
         * the same as [ExperimentServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ExperimentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Experiment>>

        /**
         * Returns a raw HTTP response for `patch /v1/experiment/{experiment_id}`, but is otherwise
         * the same as [ExperimentServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ExperimentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Experiment>>

        /**
         * Returns a raw HTTP response for `get /v1/experiment`, but is otherwise the same as
         * [ExperimentServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ExperimentListParams = ExperimentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExperimentListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /v1/experiment`, but is otherwise the same as
         * [ExperimentServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExperimentListPageAsync>> =
            list(ExperimentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/experiment/{experiment_id}`, but is otherwise
         * the same as [ExperimentServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: ExperimentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Experiment>>

        /**
         * Returns a raw HTTP response for `post /v1/experiment/{experiment_id}/feedback`, but is
         * otherwise the same as [ExperimentServiceAsync.feedback].
         */
        @JvmOverloads
        @MustBeClosed
        fun feedback(
            params: ExperimentFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackResponseSchema>>

        /**
         * Returns a raw HTTP response for `get /v1/experiment/{experiment_id}/fetch`, but is
         * otherwise the same as [ExperimentServiceAsync.fetch].
         */
        @JvmOverloads
        @MustBeClosed
        fun fetch(
            params: ExperimentFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FetchExperimentEventsResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/experiment/{experiment_id}/fetch`, but is
         * otherwise the same as [ExperimentServiceAsync.fetchPost].
         */
        @JvmOverloads
        @MustBeClosed
        fun fetchPost(
            params: ExperimentFetchPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FetchExperimentEventsResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/experiment/{experiment_id}/insert`, but is
         * otherwise the same as [ExperimentServiceAsync.insert].
         */
        @JvmOverloads
        @MustBeClosed
        fun insert(
            params: ExperimentInsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsertEventsResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/experiment/{experiment_id}/summarize`, but is
         * otherwise the same as [ExperimentServiceAsync.summarize].
         */
        @JvmOverloads
        @MustBeClosed
        fun summarize(
            params: ExperimentSummarizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SummarizeExperimentResponse>>
    }
}
