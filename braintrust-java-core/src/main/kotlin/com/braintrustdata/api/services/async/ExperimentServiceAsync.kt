// File generated from our OpenAPI spec by Stainless.

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
    fun create(params: ExperimentCreateParams): CompletableFuture<Experiment> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ExperimentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Experiment>

    /** Get an experiment object by its id */
    fun retrieve(params: ExperimentRetrieveParams): CompletableFuture<Experiment> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ExperimentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Experiment>

    /**
     * Partially update an experiment object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    fun update(params: ExperimentUpdateParams): CompletableFuture<Experiment> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ExperimentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Experiment>

    /**
     * List out all experiments. The experiments are sorted by creation date, with the most
     * recently-created experiments coming first
     */
    fun list(): CompletableFuture<ExperimentListPageAsync> = list(ExperimentListParams.none())

    /** @see [list] */
    fun list(
        params: ExperimentListParams = ExperimentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExperimentListPageAsync>

    /** @see [list] */
    fun list(
        params: ExperimentListParams = ExperimentListParams.none()
    ): CompletableFuture<ExperimentListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExperimentListPageAsync> =
        list(ExperimentListParams.none(), requestOptions)

    /** Delete an experiment object by its id */
    fun delete(params: ExperimentDeleteParams): CompletableFuture<Experiment> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ExperimentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Experiment>

    /** Log feedback for a set of experiment events */
    fun feedback(params: ExperimentFeedbackParams): CompletableFuture<FeedbackResponseSchema> =
        feedback(params, RequestOptions.none())

    /** @see [feedback] */
    fun feedback(
        params: ExperimentFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackResponseSchema>

    /**
     * Fetch the events in an experiment. Equivalent to the POST form of the same path, but with the
     * parameters in the URL query rather than in the request body. For more complex queries, use
     * the `POST /btql` endpoint.
     */
    fun fetch(params: ExperimentFetchParams): CompletableFuture<FetchExperimentEventsResponse> =
        fetch(params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(
        params: ExperimentFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FetchExperimentEventsResponse>

    /**
     * Fetch the events in an experiment. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query. For more complex queries, use
     * the `POST /btql` endpoint.
     */
    fun fetchPost(
        params: ExperimentFetchPostParams
    ): CompletableFuture<FetchExperimentEventsResponse> = fetchPost(params, RequestOptions.none())

    /** @see [fetchPost] */
    fun fetchPost(
        params: ExperimentFetchPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FetchExperimentEventsResponse>

    /** Insert a set of events into the experiment */
    fun insert(params: ExperimentInsertParams): CompletableFuture<InsertEventsResponse> =
        insert(params, RequestOptions.none())

    /** @see [insert] */
    fun insert(
        params: ExperimentInsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsertEventsResponse>

    /** Summarize experiment */
    fun summarize(
        params: ExperimentSummarizeParams
    ): CompletableFuture<SummarizeExperimentResponse> = summarize(params, RequestOptions.none())

    /** @see [summarize] */
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
        @MustBeClosed
        fun create(params: ExperimentCreateParams): CompletableFuture<HttpResponseFor<Experiment>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ExperimentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Experiment>>

        /**
         * Returns a raw HTTP response for `get /v1/experiment/{experiment_id}`, but is otherwise
         * the same as [ExperimentServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ExperimentRetrieveParams
        ): CompletableFuture<HttpResponseFor<Experiment>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ExperimentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Experiment>>

        /**
         * Returns a raw HTTP response for `patch /v1/experiment/{experiment_id}`, but is otherwise
         * the same as [ExperimentServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: ExperimentUpdateParams): CompletableFuture<HttpResponseFor<Experiment>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ExperimentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Experiment>>

        /**
         * Returns a raw HTTP response for `get /v1/experiment`, but is otherwise the same as
         * [ExperimentServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ExperimentListPageAsync>> =
            list(ExperimentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExperimentListParams = ExperimentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExperimentListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExperimentListParams = ExperimentListParams.none()
        ): CompletableFuture<HttpResponseFor<ExperimentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExperimentListPageAsync>> =
            list(ExperimentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/experiment/{experiment_id}`, but is otherwise
         * the same as [ExperimentServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: ExperimentDeleteParams): CompletableFuture<HttpResponseFor<Experiment>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ExperimentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Experiment>>

        /**
         * Returns a raw HTTP response for `post /v1/experiment/{experiment_id}/feedback`, but is
         * otherwise the same as [ExperimentServiceAsync.feedback].
         */
        @MustBeClosed
        fun feedback(
            params: ExperimentFeedbackParams
        ): CompletableFuture<HttpResponseFor<FeedbackResponseSchema>> =
            feedback(params, RequestOptions.none())

        /** @see [feedback] */
        @MustBeClosed
        fun feedback(
            params: ExperimentFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackResponseSchema>>

        /**
         * Returns a raw HTTP response for `get /v1/experiment/{experiment_id}/fetch`, but is
         * otherwise the same as [ExperimentServiceAsync.fetch].
         */
        @MustBeClosed
        fun fetch(
            params: ExperimentFetchParams
        ): CompletableFuture<HttpResponseFor<FetchExperimentEventsResponse>> =
            fetch(params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            params: ExperimentFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FetchExperimentEventsResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/experiment/{experiment_id}/fetch`, but is
         * otherwise the same as [ExperimentServiceAsync.fetchPost].
         */
        @MustBeClosed
        fun fetchPost(
            params: ExperimentFetchPostParams
        ): CompletableFuture<HttpResponseFor<FetchExperimentEventsResponse>> =
            fetchPost(params, RequestOptions.none())

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            params: ExperimentFetchPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FetchExperimentEventsResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/experiment/{experiment_id}/insert`, but is
         * otherwise the same as [ExperimentServiceAsync.insert].
         */
        @MustBeClosed
        fun insert(
            params: ExperimentInsertParams
        ): CompletableFuture<HttpResponseFor<InsertEventsResponse>> =
            insert(params, RequestOptions.none())

        /** @see [insert] */
        @MustBeClosed
        fun insert(
            params: ExperimentInsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsertEventsResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/experiment/{experiment_id}/summarize`, but is
         * otherwise the same as [ExperimentServiceAsync.summarize].
         */
        @MustBeClosed
        fun summarize(
            params: ExperimentSummarizeParams
        ): CompletableFuture<HttpResponseFor<SummarizeExperimentResponse>> =
            summarize(params, RequestOptions.none())

        /** @see [summarize] */
        @MustBeClosed
        fun summarize(
            params: ExperimentSummarizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SummarizeExperimentResponse>>
    }
}
