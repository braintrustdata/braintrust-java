// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.Dataset
import com.braintrustdata.api.models.DatasetCreateParams
import com.braintrustdata.api.models.DatasetDeleteParams
import com.braintrustdata.api.models.DatasetFeedbackParams
import com.braintrustdata.api.models.DatasetFetchParams
import com.braintrustdata.api.models.DatasetFetchPostParams
import com.braintrustdata.api.models.DatasetInsertParams
import com.braintrustdata.api.models.DatasetListPage
import com.braintrustdata.api.models.DatasetListParams
import com.braintrustdata.api.models.DatasetRetrieveParams
import com.braintrustdata.api.models.DatasetSummarizeParams
import com.braintrustdata.api.models.DatasetUpdateParams
import com.braintrustdata.api.models.FeedbackResponseSchema
import com.braintrustdata.api.models.FetchDatasetEventsResponse
import com.braintrustdata.api.models.InsertEventsResponse
import com.braintrustdata.api.models.SummarizeDatasetResponse
import com.google.errorprone.annotations.MustBeClosed

interface DatasetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new dataset. If there is an existing dataset in the project with the same name as
     * the one specified in the request, will return the existing dataset unmodified
     */
    fun create(params: DatasetCreateParams): Dataset = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: DatasetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Dataset

    /** Get a dataset object by its id */
    fun retrieve(datasetId: String): Dataset = retrieve(datasetId, DatasetRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        datasetId: String,
        params: DatasetRetrieveParams = DatasetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Dataset = retrieve(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        datasetId: String,
        params: DatasetRetrieveParams = DatasetRetrieveParams.none(),
    ): Dataset = retrieve(datasetId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Dataset

    /** @see [retrieve] */
    fun retrieve(params: DatasetRetrieveParams): Dataset = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(datasetId: String, requestOptions: RequestOptions): Dataset =
        retrieve(datasetId, DatasetRetrieveParams.none(), requestOptions)

    /**
     * Partially update a dataset object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    fun update(datasetId: String): Dataset = update(datasetId, DatasetUpdateParams.none())

    /** @see [update] */
    fun update(
        datasetId: String,
        params: DatasetUpdateParams = DatasetUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Dataset = update(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see [update] */
    fun update(
        datasetId: String,
        params: DatasetUpdateParams = DatasetUpdateParams.none(),
    ): Dataset = update(datasetId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: DatasetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Dataset

    /** @see [update] */
    fun update(params: DatasetUpdateParams): Dataset = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(datasetId: String, requestOptions: RequestOptions): Dataset =
        update(datasetId, DatasetUpdateParams.none(), requestOptions)

    /**
     * List out all datasets. The datasets are sorted by creation date, with the most
     * recently-created datasets coming first
     */
    fun list(): DatasetListPage = list(DatasetListParams.none())

    /** @see [list] */
    fun list(
        params: DatasetListParams = DatasetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetListPage

    /** @see [list] */
    fun list(params: DatasetListParams = DatasetListParams.none()): DatasetListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): DatasetListPage =
        list(DatasetListParams.none(), requestOptions)

    /** Delete a dataset object by its id */
    fun delete(datasetId: String): Dataset = delete(datasetId, DatasetDeleteParams.none())

    /** @see [delete] */
    fun delete(
        datasetId: String,
        params: DatasetDeleteParams = DatasetDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Dataset = delete(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        datasetId: String,
        params: DatasetDeleteParams = DatasetDeleteParams.none(),
    ): Dataset = delete(datasetId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: DatasetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Dataset

    /** @see [delete] */
    fun delete(params: DatasetDeleteParams): Dataset = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(datasetId: String, requestOptions: RequestOptions): Dataset =
        delete(datasetId, DatasetDeleteParams.none(), requestOptions)

    /** Log feedback for a set of dataset events */
    fun feedback(datasetId: String, params: DatasetFeedbackParams): FeedbackResponseSchema =
        feedback(datasetId, params, RequestOptions.none())

    /** @see [feedback] */
    fun feedback(
        datasetId: String,
        params: DatasetFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackResponseSchema =
        feedback(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see [feedback] */
    fun feedback(params: DatasetFeedbackParams): FeedbackResponseSchema =
        feedback(params, RequestOptions.none())

    /** @see [feedback] */
    fun feedback(
        params: DatasetFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackResponseSchema

    /**
     * Fetch the events in a dataset. Equivalent to the POST form of the same path, but with the
     * parameters in the URL query rather than in the request body. For more complex queries, use
     * the `POST /btql` endpoint.
     */
    fun fetch(datasetId: String): FetchDatasetEventsResponse =
        fetch(datasetId, DatasetFetchParams.none())

    /** @see [fetch] */
    fun fetch(
        datasetId: String,
        params: DatasetFetchParams = DatasetFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FetchDatasetEventsResponse =
        fetch(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see [fetch] */
    fun fetch(
        datasetId: String,
        params: DatasetFetchParams = DatasetFetchParams.none(),
    ): FetchDatasetEventsResponse = fetch(datasetId, params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(
        params: DatasetFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FetchDatasetEventsResponse

    /** @see [fetch] */
    fun fetch(params: DatasetFetchParams): FetchDatasetEventsResponse =
        fetch(params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(datasetId: String, requestOptions: RequestOptions): FetchDatasetEventsResponse =
        fetch(datasetId, DatasetFetchParams.none(), requestOptions)

    /**
     * Fetch the events in a dataset. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query. For more complex queries, use
     * the `POST /btql` endpoint.
     */
    fun fetchPost(datasetId: String): FetchDatasetEventsResponse =
        fetchPost(datasetId, DatasetFetchPostParams.none())

    /** @see [fetchPost] */
    fun fetchPost(
        datasetId: String,
        params: DatasetFetchPostParams = DatasetFetchPostParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FetchDatasetEventsResponse =
        fetchPost(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see [fetchPost] */
    fun fetchPost(
        datasetId: String,
        params: DatasetFetchPostParams = DatasetFetchPostParams.none(),
    ): FetchDatasetEventsResponse = fetchPost(datasetId, params, RequestOptions.none())

    /** @see [fetchPost] */
    fun fetchPost(
        params: DatasetFetchPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FetchDatasetEventsResponse

    /** @see [fetchPost] */
    fun fetchPost(params: DatasetFetchPostParams): FetchDatasetEventsResponse =
        fetchPost(params, RequestOptions.none())

    /** @see [fetchPost] */
    fun fetchPost(datasetId: String, requestOptions: RequestOptions): FetchDatasetEventsResponse =
        fetchPost(datasetId, DatasetFetchPostParams.none(), requestOptions)

    /** Insert a set of events into the dataset */
    fun insert(datasetId: String, params: DatasetInsertParams): InsertEventsResponse =
        insert(datasetId, params, RequestOptions.none())

    /** @see [insert] */
    fun insert(
        datasetId: String,
        params: DatasetInsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsertEventsResponse =
        insert(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see [insert] */
    fun insert(params: DatasetInsertParams): InsertEventsResponse =
        insert(params, RequestOptions.none())

    /** @see [insert] */
    fun insert(
        params: DatasetInsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsertEventsResponse

    /** Summarize dataset */
    fun summarize(datasetId: String): SummarizeDatasetResponse =
        summarize(datasetId, DatasetSummarizeParams.none())

    /** @see [summarize] */
    fun summarize(
        datasetId: String,
        params: DatasetSummarizeParams = DatasetSummarizeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SummarizeDatasetResponse =
        summarize(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see [summarize] */
    fun summarize(
        datasetId: String,
        params: DatasetSummarizeParams = DatasetSummarizeParams.none(),
    ): SummarizeDatasetResponse = summarize(datasetId, params, RequestOptions.none())

    /** @see [summarize] */
    fun summarize(
        params: DatasetSummarizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SummarizeDatasetResponse

    /** @see [summarize] */
    fun summarize(params: DatasetSummarizeParams): SummarizeDatasetResponse =
        summarize(params, RequestOptions.none())

    /** @see [summarize] */
    fun summarize(datasetId: String, requestOptions: RequestOptions): SummarizeDatasetResponse =
        summarize(datasetId, DatasetSummarizeParams.none(), requestOptions)

    /** A view of [DatasetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/dataset`, but is otherwise the same as
         * [DatasetService.create].
         */
        @MustBeClosed
        fun create(params: DatasetCreateParams): HttpResponseFor<Dataset> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: DatasetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Dataset>

        /**
         * Returns a raw HTTP response for `get /v1/dataset/{dataset_id}`, but is otherwise the same
         * as [DatasetService.retrieve].
         */
        @MustBeClosed
        fun retrieve(datasetId: String): HttpResponseFor<Dataset> =
            retrieve(datasetId, DatasetRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            datasetId: String,
            params: DatasetRetrieveParams = DatasetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Dataset> =
            retrieve(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            datasetId: String,
            params: DatasetRetrieveParams = DatasetRetrieveParams.none(),
        ): HttpResponseFor<Dataset> = retrieve(datasetId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DatasetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Dataset>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: DatasetRetrieveParams): HttpResponseFor<Dataset> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(datasetId: String, requestOptions: RequestOptions): HttpResponseFor<Dataset> =
            retrieve(datasetId, DatasetRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/dataset/{dataset_id}`, but is otherwise the
         * same as [DatasetService.update].
         */
        @MustBeClosed
        fun update(datasetId: String): HttpResponseFor<Dataset> =
            update(datasetId, DatasetUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            datasetId: String,
            params: DatasetUpdateParams = DatasetUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Dataset> =
            update(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            datasetId: String,
            params: DatasetUpdateParams = DatasetUpdateParams.none(),
        ): HttpResponseFor<Dataset> = update(datasetId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: DatasetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Dataset>

        /** @see [update] */
        @MustBeClosed
        fun update(params: DatasetUpdateParams): HttpResponseFor<Dataset> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(datasetId: String, requestOptions: RequestOptions): HttpResponseFor<Dataset> =
            update(datasetId, DatasetUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/dataset`, but is otherwise the same as
         * [DatasetService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<DatasetListPage> = list(DatasetListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DatasetListParams = DatasetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DatasetListParams = DatasetListParams.none()
        ): HttpResponseFor<DatasetListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DatasetListPage> =
            list(DatasetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/dataset/{dataset_id}`, but is otherwise the
         * same as [DatasetService.delete].
         */
        @MustBeClosed
        fun delete(datasetId: String): HttpResponseFor<Dataset> =
            delete(datasetId, DatasetDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            datasetId: String,
            params: DatasetDeleteParams = DatasetDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Dataset> =
            delete(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            datasetId: String,
            params: DatasetDeleteParams = DatasetDeleteParams.none(),
        ): HttpResponseFor<Dataset> = delete(datasetId, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: DatasetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Dataset>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: DatasetDeleteParams): HttpResponseFor<Dataset> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(datasetId: String, requestOptions: RequestOptions): HttpResponseFor<Dataset> =
            delete(datasetId, DatasetDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/dataset/{dataset_id}/feedback`, but is
         * otherwise the same as [DatasetService.feedback].
         */
        @MustBeClosed
        fun feedback(
            datasetId: String,
            params: DatasetFeedbackParams,
        ): HttpResponseFor<FeedbackResponseSchema> =
            feedback(datasetId, params, RequestOptions.none())

        /** @see [feedback] */
        @MustBeClosed
        fun feedback(
            datasetId: String,
            params: DatasetFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackResponseSchema> =
            feedback(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see [feedback] */
        @MustBeClosed
        fun feedback(params: DatasetFeedbackParams): HttpResponseFor<FeedbackResponseSchema> =
            feedback(params, RequestOptions.none())

        /** @see [feedback] */
        @MustBeClosed
        fun feedback(
            params: DatasetFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackResponseSchema>

        /**
         * Returns a raw HTTP response for `get /v1/dataset/{dataset_id}/fetch`, but is otherwise
         * the same as [DatasetService.fetch].
         */
        @MustBeClosed
        fun fetch(datasetId: String): HttpResponseFor<FetchDatasetEventsResponse> =
            fetch(datasetId, DatasetFetchParams.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            datasetId: String,
            params: DatasetFetchParams = DatasetFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FetchDatasetEventsResponse> =
            fetch(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            datasetId: String,
            params: DatasetFetchParams = DatasetFetchParams.none(),
        ): HttpResponseFor<FetchDatasetEventsResponse> =
            fetch(datasetId, params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            params: DatasetFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FetchDatasetEventsResponse>

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(params: DatasetFetchParams): HttpResponseFor<FetchDatasetEventsResponse> =
            fetch(params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FetchDatasetEventsResponse> =
            fetch(datasetId, DatasetFetchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/dataset/{dataset_id}/fetch`, but is otherwise
         * the same as [DatasetService.fetchPost].
         */
        @MustBeClosed
        fun fetchPost(datasetId: String): HttpResponseFor<FetchDatasetEventsResponse> =
            fetchPost(datasetId, DatasetFetchPostParams.none())

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            datasetId: String,
            params: DatasetFetchPostParams = DatasetFetchPostParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FetchDatasetEventsResponse> =
            fetchPost(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            datasetId: String,
            params: DatasetFetchPostParams = DatasetFetchPostParams.none(),
        ): HttpResponseFor<FetchDatasetEventsResponse> =
            fetchPost(datasetId, params, RequestOptions.none())

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            params: DatasetFetchPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FetchDatasetEventsResponse>

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(params: DatasetFetchPostParams): HttpResponseFor<FetchDatasetEventsResponse> =
            fetchPost(params, RequestOptions.none())

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FetchDatasetEventsResponse> =
            fetchPost(datasetId, DatasetFetchPostParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/dataset/{dataset_id}/insert`, but is otherwise
         * the same as [DatasetService.insert].
         */
        @MustBeClosed
        fun insert(
            datasetId: String,
            params: DatasetInsertParams,
        ): HttpResponseFor<InsertEventsResponse> = insert(datasetId, params, RequestOptions.none())

        /** @see [insert] */
        @MustBeClosed
        fun insert(
            datasetId: String,
            params: DatasetInsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsertEventsResponse> =
            insert(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see [insert] */
        @MustBeClosed
        fun insert(params: DatasetInsertParams): HttpResponseFor<InsertEventsResponse> =
            insert(params, RequestOptions.none())

        /** @see [insert] */
        @MustBeClosed
        fun insert(
            params: DatasetInsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsertEventsResponse>

        /**
         * Returns a raw HTTP response for `get /v1/dataset/{dataset_id}/summarize`, but is
         * otherwise the same as [DatasetService.summarize].
         */
        @MustBeClosed
        fun summarize(datasetId: String): HttpResponseFor<SummarizeDatasetResponse> =
            summarize(datasetId, DatasetSummarizeParams.none())

        /** @see [summarize] */
        @MustBeClosed
        fun summarize(
            datasetId: String,
            params: DatasetSummarizeParams = DatasetSummarizeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SummarizeDatasetResponse> =
            summarize(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see [summarize] */
        @MustBeClosed
        fun summarize(
            datasetId: String,
            params: DatasetSummarizeParams = DatasetSummarizeParams.none(),
        ): HttpResponseFor<SummarizeDatasetResponse> =
            summarize(datasetId, params, RequestOptions.none())

        /** @see [summarize] */
        @MustBeClosed
        fun summarize(
            params: DatasetSummarizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SummarizeDatasetResponse>

        /** @see [summarize] */
        @MustBeClosed
        fun summarize(params: DatasetSummarizeParams): HttpResponseFor<SummarizeDatasetResponse> =
            summarize(params, RequestOptions.none())

        /** @see [summarize] */
        @MustBeClosed
        fun summarize(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SummarizeDatasetResponse> =
            summarize(datasetId, DatasetSummarizeParams.none(), requestOptions)
    }
}
