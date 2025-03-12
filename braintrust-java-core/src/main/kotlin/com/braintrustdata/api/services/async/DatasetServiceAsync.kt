// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.Dataset
import com.braintrustdata.api.models.DatasetCreateParams
import com.braintrustdata.api.models.DatasetDeleteParams
import com.braintrustdata.api.models.DatasetFeedbackParams
import com.braintrustdata.api.models.DatasetFetchParams
import com.braintrustdata.api.models.DatasetFetchPostParams
import com.braintrustdata.api.models.DatasetInsertParams
import com.braintrustdata.api.models.DatasetListPageAsync
import com.braintrustdata.api.models.DatasetListParams
import com.braintrustdata.api.models.DatasetRetrieveParams
import com.braintrustdata.api.models.DatasetSummarizeParams
import com.braintrustdata.api.models.DatasetUpdateParams
import com.braintrustdata.api.models.FeedbackResponseSchema
import com.braintrustdata.api.models.FetchDatasetEventsResponse
import com.braintrustdata.api.models.InsertEventsResponse
import com.braintrustdata.api.models.SummarizeDatasetResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface DatasetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new dataset. If there is an existing dataset in the project with the
     * same name as the one specified in the request, will return the existing dataset
     * unmodified
     */
    fun create(params: DatasetCreateParams): CompletableFuture<Dataset> =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: DatasetCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Dataset>

    /** Get a dataset object by its id */
    fun retrieve(params: DatasetRetrieveParams): CompletableFuture<Dataset> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: DatasetRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Dataset>

    /**
     * Partially update a dataset object. Specify the fields to update in the payload.
     * Any object-type fields will be deep-merged with existing content. Currently we
     * do not support removing fields or setting them to null.
     */
    fun update(params: DatasetUpdateParams): CompletableFuture<Dataset> =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(params: DatasetUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Dataset>

    /**
     * List out all datasets. The datasets are sorted by creation date, with the most
     * recently-created datasets coming first
     */
    fun list(): CompletableFuture<DatasetListPageAsync> = list(DatasetListParams.none())

    /** @see [list] */
    fun list(params: DatasetListParams = DatasetListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<DatasetListPageAsync>

    /** @see [list] */
    fun list(params: DatasetListParams = DatasetListParams.none()): CompletableFuture<DatasetListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<DatasetListPageAsync> = list(DatasetListParams.none(), requestOptions)

    /** Delete a dataset object by its id */
    fun delete(params: DatasetDeleteParams): CompletableFuture<Dataset> =
        delete(
          params, RequestOptions.none()
        )

    /** @see [delete] */
    fun delete(params: DatasetDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Dataset>

    /** Log feedback for a set of dataset events */
    fun feedback(params: DatasetFeedbackParams): CompletableFuture<FeedbackResponseSchema> =
        feedback(
          params, RequestOptions.none()
        )

    /** @see [feedback] */
    fun feedback(params: DatasetFeedbackParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<FeedbackResponseSchema>

    /**
     * Fetch the events in a dataset. Equivalent to the POST form of the same path, but
     * with the parameters in the URL query rather than in the request body. For more
     * complex queries, use the `POST /btql` endpoint.
     */
    fun fetch(params: DatasetFetchParams): CompletableFuture<FetchDatasetEventsResponse> =
        fetch(
          params, RequestOptions.none()
        )

    /** @see [fetch] */
    fun fetch(params: DatasetFetchParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<FetchDatasetEventsResponse>

    /**
     * Fetch the events in a dataset. Equivalent to the GET form of the same path, but
     * with the parameters in the request body rather than in the URL query. For more
     * complex queries, use the `POST /btql` endpoint.
     */
    fun fetchPost(params: DatasetFetchPostParams): CompletableFuture<FetchDatasetEventsResponse> =
        fetchPost(
          params, RequestOptions.none()
        )

    /** @see [fetchPost] */
    fun fetchPost(params: DatasetFetchPostParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<FetchDatasetEventsResponse>

    /** Insert a set of events into the dataset */
    fun insert(params: DatasetInsertParams): CompletableFuture<InsertEventsResponse> =
        insert(
          params, RequestOptions.none()
        )

    /** @see [insert] */
    fun insert(params: DatasetInsertParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<InsertEventsResponse>

    /** Summarize dataset */
    fun summarize(params: DatasetSummarizeParams): CompletableFuture<SummarizeDatasetResponse> =
        summarize(
          params, RequestOptions.none()
        )

    /** @see [summarize] */
    fun summarize(params: DatasetSummarizeParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<SummarizeDatasetResponse>

    /**
     * A view of [DatasetServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/dataset`, but is otherwise the same as
         * [DatasetServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: DatasetCreateParams): CompletableFuture<HttpResponseFor<Dataset>> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: DatasetCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Dataset>>

        /**
         * Returns a raw HTTP response for `get /v1/dataset/{dataset_id}`, but is otherwise
         * the same as [DatasetServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: DatasetRetrieveParams): CompletableFuture<HttpResponseFor<Dataset>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: DatasetRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Dataset>>

        /**
         * Returns a raw HTTP response for `patch /v1/dataset/{dataset_id}`, but is
         * otherwise the same as [DatasetServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: DatasetUpdateParams): CompletableFuture<HttpResponseFor<Dataset>> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: DatasetUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Dataset>>

        /**
         * Returns a raw HTTP response for `get /v1/dataset`, but is otherwise the same as
         * [DatasetServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<DatasetListPageAsync>> = list(DatasetListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: DatasetListParams = DatasetListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<DatasetListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: DatasetListParams = DatasetListParams.none()): CompletableFuture<HttpResponseFor<DatasetListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<DatasetListPageAsync>> = list(DatasetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/dataset/{dataset_id}`, but is
         * otherwise the same as [DatasetServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: DatasetDeleteParams): CompletableFuture<HttpResponseFor<Dataset>> =
            delete(
              params, RequestOptions.none()
            )

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: DatasetDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Dataset>>

        /**
         * Returns a raw HTTP response for `post /v1/dataset/{dataset_id}/feedback`, but is
         * otherwise the same as [DatasetServiceAsync.feedback].
         */
        @MustBeClosed
        fun feedback(params: DatasetFeedbackParams): CompletableFuture<HttpResponseFor<FeedbackResponseSchema>> =
            feedback(
              params, RequestOptions.none()
            )

        /** @see [feedback] */
        @MustBeClosed
        fun feedback(params: DatasetFeedbackParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<FeedbackResponseSchema>>

        /**
         * Returns a raw HTTP response for `get /v1/dataset/{dataset_id}/fetch`, but is
         * otherwise the same as [DatasetServiceAsync.fetch].
         */
        @MustBeClosed
        fun fetch(params: DatasetFetchParams): CompletableFuture<HttpResponseFor<FetchDatasetEventsResponse>> =
            fetch(
              params, RequestOptions.none()
            )

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(params: DatasetFetchParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<FetchDatasetEventsResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/dataset/{dataset_id}/fetch`, but is
         * otherwise the same as [DatasetServiceAsync.fetchPost].
         */
        @MustBeClosed
        fun fetchPost(params: DatasetFetchPostParams): CompletableFuture<HttpResponseFor<FetchDatasetEventsResponse>> =
            fetchPost(
              params, RequestOptions.none()
            )

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(params: DatasetFetchPostParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<FetchDatasetEventsResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/dataset/{dataset_id}/insert`, but is
         * otherwise the same as [DatasetServiceAsync.insert].
         */
        @MustBeClosed
        fun insert(params: DatasetInsertParams): CompletableFuture<HttpResponseFor<InsertEventsResponse>> =
            insert(
              params, RequestOptions.none()
            )

        /** @see [insert] */
        @MustBeClosed
        fun insert(params: DatasetInsertParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<InsertEventsResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/dataset/{dataset_id}/summarize`, but is
         * otherwise the same as [DatasetServiceAsync.summarize].
         */
        @MustBeClosed
        fun summarize(params: DatasetSummarizeParams): CompletableFuture<HttpResponseFor<SummarizeDatasetResponse>> =
            summarize(
              params, RequestOptions.none()
            )

        /** @see [summarize] */
        @MustBeClosed
        fun summarize(params: DatasetSummarizeParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<SummarizeDatasetResponse>>
    }
}
