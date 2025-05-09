// File generated from our OpenAPI spec by Stainless.

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
    fun create(params: ExperimentCreateParams): Experiment = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ExperimentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Experiment

    /** Get an experiment object by its id */
    fun retrieve(experimentId: String): Experiment =
        retrieve(experimentId, ExperimentRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        experimentId: String,
        params: ExperimentRetrieveParams = ExperimentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Experiment = retrieve(params.toBuilder().experimentId(experimentId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        experimentId: String,
        params: ExperimentRetrieveParams = ExperimentRetrieveParams.none(),
    ): Experiment = retrieve(experimentId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ExperimentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Experiment

    /** @see [retrieve] */
    fun retrieve(params: ExperimentRetrieveParams): Experiment =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(experimentId: String, requestOptions: RequestOptions): Experiment =
        retrieve(experimentId, ExperimentRetrieveParams.none(), requestOptions)

    /**
     * Partially update an experiment object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    fun update(experimentId: String): Experiment =
        update(experimentId, ExperimentUpdateParams.none())

    /** @see [update] */
    fun update(
        experimentId: String,
        params: ExperimentUpdateParams = ExperimentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Experiment = update(params.toBuilder().experimentId(experimentId).build(), requestOptions)

    /** @see [update] */
    fun update(
        experimentId: String,
        params: ExperimentUpdateParams = ExperimentUpdateParams.none(),
    ): Experiment = update(experimentId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ExperimentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Experiment

    /** @see [update] */
    fun update(params: ExperimentUpdateParams): Experiment = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(experimentId: String, requestOptions: RequestOptions): Experiment =
        update(experimentId, ExperimentUpdateParams.none(), requestOptions)

    /**
     * List out all experiments. The experiments are sorted by creation date, with the most
     * recently-created experiments coming first
     */
    fun list(): ExperimentListPage = list(ExperimentListParams.none())

    /** @see [list] */
    fun list(
        params: ExperimentListParams = ExperimentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExperimentListPage

    /** @see [list] */
    fun list(params: ExperimentListParams = ExperimentListParams.none()): ExperimentListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ExperimentListPage =
        list(ExperimentListParams.none(), requestOptions)

    /** Delete an experiment object by its id */
    fun delete(experimentId: String): Experiment =
        delete(experimentId, ExperimentDeleteParams.none())

    /** @see [delete] */
    fun delete(
        experimentId: String,
        params: ExperimentDeleteParams = ExperimentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Experiment = delete(params.toBuilder().experimentId(experimentId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        experimentId: String,
        params: ExperimentDeleteParams = ExperimentDeleteParams.none(),
    ): Experiment = delete(experimentId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ExperimentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Experiment

    /** @see [delete] */
    fun delete(params: ExperimentDeleteParams): Experiment = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(experimentId: String, requestOptions: RequestOptions): Experiment =
        delete(experimentId, ExperimentDeleteParams.none(), requestOptions)

    /** Log feedback for a set of experiment events */
    fun feedback(experimentId: String, params: ExperimentFeedbackParams): FeedbackResponseSchema =
        feedback(experimentId, params, RequestOptions.none())

    /** @see [feedback] */
    fun feedback(
        experimentId: String,
        params: ExperimentFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackResponseSchema =
        feedback(params.toBuilder().experimentId(experimentId).build(), requestOptions)

    /** @see [feedback] */
    fun feedback(params: ExperimentFeedbackParams): FeedbackResponseSchema =
        feedback(params, RequestOptions.none())

    /** @see [feedback] */
    fun feedback(
        params: ExperimentFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackResponseSchema

    /**
     * Fetch the events in an experiment. Equivalent to the POST form of the same path, but with the
     * parameters in the URL query rather than in the request body. For more complex queries, use
     * the `POST /btql` endpoint.
     */
    fun fetch(experimentId: String): FetchExperimentEventsResponse =
        fetch(experimentId, ExperimentFetchParams.none())

    /** @see [fetch] */
    fun fetch(
        experimentId: String,
        params: ExperimentFetchParams = ExperimentFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FetchExperimentEventsResponse =
        fetch(params.toBuilder().experimentId(experimentId).build(), requestOptions)

    /** @see [fetch] */
    fun fetch(
        experimentId: String,
        params: ExperimentFetchParams = ExperimentFetchParams.none(),
    ): FetchExperimentEventsResponse = fetch(experimentId, params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(
        params: ExperimentFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FetchExperimentEventsResponse

    /** @see [fetch] */
    fun fetch(params: ExperimentFetchParams): FetchExperimentEventsResponse =
        fetch(params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(experimentId: String, requestOptions: RequestOptions): FetchExperimentEventsResponse =
        fetch(experimentId, ExperimentFetchParams.none(), requestOptions)

    /**
     * Fetch the events in an experiment. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query. For more complex queries, use
     * the `POST /btql` endpoint.
     */
    fun fetchPost(experimentId: String): FetchExperimentEventsResponse =
        fetchPost(experimentId, ExperimentFetchPostParams.none())

    /** @see [fetchPost] */
    fun fetchPost(
        experimentId: String,
        params: ExperimentFetchPostParams = ExperimentFetchPostParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FetchExperimentEventsResponse =
        fetchPost(params.toBuilder().experimentId(experimentId).build(), requestOptions)

    /** @see [fetchPost] */
    fun fetchPost(
        experimentId: String,
        params: ExperimentFetchPostParams = ExperimentFetchPostParams.none(),
    ): FetchExperimentEventsResponse = fetchPost(experimentId, params, RequestOptions.none())

    /** @see [fetchPost] */
    fun fetchPost(
        params: ExperimentFetchPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FetchExperimentEventsResponse

    /** @see [fetchPost] */
    fun fetchPost(params: ExperimentFetchPostParams): FetchExperimentEventsResponse =
        fetchPost(params, RequestOptions.none())

    /** @see [fetchPost] */
    fun fetchPost(
        experimentId: String,
        requestOptions: RequestOptions,
    ): FetchExperimentEventsResponse =
        fetchPost(experimentId, ExperimentFetchPostParams.none(), requestOptions)

    /** Insert a set of events into the experiment */
    fun insert(experimentId: String, params: ExperimentInsertParams): InsertEventsResponse =
        insert(experimentId, params, RequestOptions.none())

    /** @see [insert] */
    fun insert(
        experimentId: String,
        params: ExperimentInsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsertEventsResponse =
        insert(params.toBuilder().experimentId(experimentId).build(), requestOptions)

    /** @see [insert] */
    fun insert(params: ExperimentInsertParams): InsertEventsResponse =
        insert(params, RequestOptions.none())

    /** @see [insert] */
    fun insert(
        params: ExperimentInsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsertEventsResponse

    /** Summarize experiment */
    fun summarize(experimentId: String): SummarizeExperimentResponse =
        summarize(experimentId, ExperimentSummarizeParams.none())

    /** @see [summarize] */
    fun summarize(
        experimentId: String,
        params: ExperimentSummarizeParams = ExperimentSummarizeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SummarizeExperimentResponse =
        summarize(params.toBuilder().experimentId(experimentId).build(), requestOptions)

    /** @see [summarize] */
    fun summarize(
        experimentId: String,
        params: ExperimentSummarizeParams = ExperimentSummarizeParams.none(),
    ): SummarizeExperimentResponse = summarize(experimentId, params, RequestOptions.none())

    /** @see [summarize] */
    fun summarize(
        params: ExperimentSummarizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SummarizeExperimentResponse

    /** @see [summarize] */
    fun summarize(params: ExperimentSummarizeParams): SummarizeExperimentResponse =
        summarize(params, RequestOptions.none())

    /** @see [summarize] */
    fun summarize(
        experimentId: String,
        requestOptions: RequestOptions,
    ): SummarizeExperimentResponse =
        summarize(experimentId, ExperimentSummarizeParams.none(), requestOptions)

    /** A view of [ExperimentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/experiment`, but is otherwise the same as
         * [ExperimentService.create].
         */
        @MustBeClosed
        fun create(params: ExperimentCreateParams): HttpResponseFor<Experiment> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ExperimentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Experiment>

        /**
         * Returns a raw HTTP response for `get /v1/experiment/{experiment_id}`, but is otherwise
         * the same as [ExperimentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(experimentId: String): HttpResponseFor<Experiment> =
            retrieve(experimentId, ExperimentRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            experimentId: String,
            params: ExperimentRetrieveParams = ExperimentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Experiment> =
            retrieve(params.toBuilder().experimentId(experimentId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            experimentId: String,
            params: ExperimentRetrieveParams = ExperimentRetrieveParams.none(),
        ): HttpResponseFor<Experiment> = retrieve(experimentId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ExperimentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Experiment>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ExperimentRetrieveParams): HttpResponseFor<Experiment> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            experimentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Experiment> =
            retrieve(experimentId, ExperimentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/experiment/{experiment_id}`, but is otherwise
         * the same as [ExperimentService.update].
         */
        @MustBeClosed
        fun update(experimentId: String): HttpResponseFor<Experiment> =
            update(experimentId, ExperimentUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            experimentId: String,
            params: ExperimentUpdateParams = ExperimentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Experiment> =
            update(params.toBuilder().experimentId(experimentId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            experimentId: String,
            params: ExperimentUpdateParams = ExperimentUpdateParams.none(),
        ): HttpResponseFor<Experiment> = update(experimentId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ExperimentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Experiment>

        /** @see [update] */
        @MustBeClosed
        fun update(params: ExperimentUpdateParams): HttpResponseFor<Experiment> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            experimentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Experiment> =
            update(experimentId, ExperimentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/experiment`, but is otherwise the same as
         * [ExperimentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ExperimentListPage> = list(ExperimentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExperimentListParams = ExperimentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExperimentListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExperimentListParams = ExperimentListParams.none()
        ): HttpResponseFor<ExperimentListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExperimentListPage> =
            list(ExperimentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/experiment/{experiment_id}`, but is otherwise
         * the same as [ExperimentService.delete].
         */
        @MustBeClosed
        fun delete(experimentId: String): HttpResponseFor<Experiment> =
            delete(experimentId, ExperimentDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            experimentId: String,
            params: ExperimentDeleteParams = ExperimentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Experiment> =
            delete(params.toBuilder().experimentId(experimentId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            experimentId: String,
            params: ExperimentDeleteParams = ExperimentDeleteParams.none(),
        ): HttpResponseFor<Experiment> = delete(experimentId, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ExperimentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Experiment>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: ExperimentDeleteParams): HttpResponseFor<Experiment> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            experimentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Experiment> =
            delete(experimentId, ExperimentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/experiment/{experiment_id}/feedback`, but is
         * otherwise the same as [ExperimentService.feedback].
         */
        @MustBeClosed
        fun feedback(
            experimentId: String,
            params: ExperimentFeedbackParams,
        ): HttpResponseFor<FeedbackResponseSchema> =
            feedback(experimentId, params, RequestOptions.none())

        /** @see [feedback] */
        @MustBeClosed
        fun feedback(
            experimentId: String,
            params: ExperimentFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackResponseSchema> =
            feedback(params.toBuilder().experimentId(experimentId).build(), requestOptions)

        /** @see [feedback] */
        @MustBeClosed
        fun feedback(params: ExperimentFeedbackParams): HttpResponseFor<FeedbackResponseSchema> =
            feedback(params, RequestOptions.none())

        /** @see [feedback] */
        @MustBeClosed
        fun feedback(
            params: ExperimentFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackResponseSchema>

        /**
         * Returns a raw HTTP response for `get /v1/experiment/{experiment_id}/fetch`, but is
         * otherwise the same as [ExperimentService.fetch].
         */
        @MustBeClosed
        fun fetch(experimentId: String): HttpResponseFor<FetchExperimentEventsResponse> =
            fetch(experimentId, ExperimentFetchParams.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            experimentId: String,
            params: ExperimentFetchParams = ExperimentFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FetchExperimentEventsResponse> =
            fetch(params.toBuilder().experimentId(experimentId).build(), requestOptions)

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            experimentId: String,
            params: ExperimentFetchParams = ExperimentFetchParams.none(),
        ): HttpResponseFor<FetchExperimentEventsResponse> =
            fetch(experimentId, params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            params: ExperimentFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FetchExperimentEventsResponse>

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(params: ExperimentFetchParams): HttpResponseFor<FetchExperimentEventsResponse> =
            fetch(params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            experimentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FetchExperimentEventsResponse> =
            fetch(experimentId, ExperimentFetchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/experiment/{experiment_id}/fetch`, but is
         * otherwise the same as [ExperimentService.fetchPost].
         */
        @MustBeClosed
        fun fetchPost(experimentId: String): HttpResponseFor<FetchExperimentEventsResponse> =
            fetchPost(experimentId, ExperimentFetchPostParams.none())

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            experimentId: String,
            params: ExperimentFetchPostParams = ExperimentFetchPostParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FetchExperimentEventsResponse> =
            fetchPost(params.toBuilder().experimentId(experimentId).build(), requestOptions)

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            experimentId: String,
            params: ExperimentFetchPostParams = ExperimentFetchPostParams.none(),
        ): HttpResponseFor<FetchExperimentEventsResponse> =
            fetchPost(experimentId, params, RequestOptions.none())

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            params: ExperimentFetchPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FetchExperimentEventsResponse>

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            params: ExperimentFetchPostParams
        ): HttpResponseFor<FetchExperimentEventsResponse> = fetchPost(params, RequestOptions.none())

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            experimentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FetchExperimentEventsResponse> =
            fetchPost(experimentId, ExperimentFetchPostParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/experiment/{experiment_id}/insert`, but is
         * otherwise the same as [ExperimentService.insert].
         */
        @MustBeClosed
        fun insert(
            experimentId: String,
            params: ExperimentInsertParams,
        ): HttpResponseFor<InsertEventsResponse> =
            insert(experimentId, params, RequestOptions.none())

        /** @see [insert] */
        @MustBeClosed
        fun insert(
            experimentId: String,
            params: ExperimentInsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsertEventsResponse> =
            insert(params.toBuilder().experimentId(experimentId).build(), requestOptions)

        /** @see [insert] */
        @MustBeClosed
        fun insert(params: ExperimentInsertParams): HttpResponseFor<InsertEventsResponse> =
            insert(params, RequestOptions.none())

        /** @see [insert] */
        @MustBeClosed
        fun insert(
            params: ExperimentInsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsertEventsResponse>

        /**
         * Returns a raw HTTP response for `get /v1/experiment/{experiment_id}/summarize`, but is
         * otherwise the same as [ExperimentService.summarize].
         */
        @MustBeClosed
        fun summarize(experimentId: String): HttpResponseFor<SummarizeExperimentResponse> =
            summarize(experimentId, ExperimentSummarizeParams.none())

        /** @see [summarize] */
        @MustBeClosed
        fun summarize(
            experimentId: String,
            params: ExperimentSummarizeParams = ExperimentSummarizeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SummarizeExperimentResponse> =
            summarize(params.toBuilder().experimentId(experimentId).build(), requestOptions)

        /** @see [summarize] */
        @MustBeClosed
        fun summarize(
            experimentId: String,
            params: ExperimentSummarizeParams = ExperimentSummarizeParams.none(),
        ): HttpResponseFor<SummarizeExperimentResponse> =
            summarize(experimentId, params, RequestOptions.none())

        /** @see [summarize] */
        @MustBeClosed
        fun summarize(
            params: ExperimentSummarizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SummarizeExperimentResponse>

        /** @see [summarize] */
        @MustBeClosed
        fun summarize(
            params: ExperimentSummarizeParams
        ): HttpResponseFor<SummarizeExperimentResponse> = summarize(params, RequestOptions.none())

        /** @see [summarize] */
        @MustBeClosed
        fun summarize(
            experimentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SummarizeExperimentResponse> =
            summarize(experimentId, ExperimentSummarizeParams.none(), requestOptions)
    }
}
