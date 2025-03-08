// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking.projects

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.FeedbackResponseSchema
import com.braintrustdata.api.models.FetchProjectLogsEventsResponse
import com.braintrustdata.api.models.InsertEventsResponse
import com.braintrustdata.api.models.ProjectLogFeedbackParams
import com.braintrustdata.api.models.ProjectLogFetchParams
import com.braintrustdata.api.models.ProjectLogFetchPostParams
import com.braintrustdata.api.models.ProjectLogInsertParams
import com.google.errorprone.annotations.MustBeClosed

interface LogService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Log feedback for a set of project logs events */
    fun feedback(params: ProjectLogFeedbackParams): FeedbackResponseSchema =
        feedback(params, RequestOptions.none())

    /** @see [feedback] */
    fun feedback(
        params: ProjectLogFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackResponseSchema

    /**
     * Fetch the events in a project logs. Equivalent to the POST form of the same path, but with
     * the parameters in the URL query rather than in the request body. For more complex queries,
     * use the `POST /btql` endpoint.
     */
    fun fetch(params: ProjectLogFetchParams): FetchProjectLogsEventsResponse =
        fetch(params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(
        params: ProjectLogFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FetchProjectLogsEventsResponse

    /**
     * Fetch the events in a project logs. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query. For more complex queries, use
     * the `POST /btql` endpoint.
     */
    fun fetchPost(params: ProjectLogFetchPostParams): FetchProjectLogsEventsResponse =
        fetchPost(params, RequestOptions.none())

    /** @see [fetchPost] */
    fun fetchPost(
        params: ProjectLogFetchPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FetchProjectLogsEventsResponse

    /** Insert a set of events into the project logs */
    fun insert(params: ProjectLogInsertParams): InsertEventsResponse =
        insert(params, RequestOptions.none())

    /** @see [insert] */
    fun insert(
        params: ProjectLogInsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsertEventsResponse

    /** A view of [LogService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/project_logs/{project_id}/feedback`, but is
         * otherwise the same as [LogService.feedback].
         */
        @MustBeClosed
        fun feedback(params: ProjectLogFeedbackParams): HttpResponseFor<FeedbackResponseSchema> =
            feedback(params, RequestOptions.none())

        /** @see [feedback] */
        @MustBeClosed
        fun feedback(
            params: ProjectLogFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackResponseSchema>

        /**
         * Returns a raw HTTP response for `get /v1/project_logs/{project_id}/fetch`, but is
         * otherwise the same as [LogService.fetch].
         */
        @MustBeClosed
        fun fetch(params: ProjectLogFetchParams): HttpResponseFor<FetchProjectLogsEventsResponse> =
            fetch(params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            params: ProjectLogFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FetchProjectLogsEventsResponse>

        /**
         * Returns a raw HTTP response for `post /v1/project_logs/{project_id}/fetch`, but is
         * otherwise the same as [LogService.fetchPost].
         */
        @MustBeClosed
        fun fetchPost(
            params: ProjectLogFetchPostParams
        ): HttpResponseFor<FetchProjectLogsEventsResponse> =
            fetchPost(params, RequestOptions.none())

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            params: ProjectLogFetchPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FetchProjectLogsEventsResponse>

        /**
         * Returns a raw HTTP response for `post /v1/project_logs/{project_id}/insert`, but is
         * otherwise the same as [LogService.insert].
         */
        @MustBeClosed
        fun insert(params: ProjectLogInsertParams): HttpResponseFor<InsertEventsResponse> =
            insert(params, RequestOptions.none())

        /** @see [insert] */
        @MustBeClosed
        fun insert(
            params: ProjectLogInsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsertEventsResponse>
    }
}
