// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async.projects

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
import java.util.concurrent.CompletableFuture

interface LogServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Log feedback for a set of project logs events */
    fun feedback(params: ProjectLogFeedbackParams): CompletableFuture<FeedbackResponseSchema> =
        feedback(params, RequestOptions.none())

    /** @see [feedback] */
    fun feedback(
        params: ProjectLogFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackResponseSchema>

    /**
     * Fetch the events in a project logs. Equivalent to the POST form of the same path, but with
     * the parameters in the URL query rather than in the request body. For more complex queries,
     * use the `POST /btql` endpoint.
     */
    fun fetch(params: ProjectLogFetchParams): CompletableFuture<FetchProjectLogsEventsResponse> =
        fetch(params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(
        params: ProjectLogFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FetchProjectLogsEventsResponse>

    /**
     * Fetch the events in a project logs. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query. For more complex queries, use
     * the `POST /btql` endpoint.
     */
    fun fetchPost(
        params: ProjectLogFetchPostParams
    ): CompletableFuture<FetchProjectLogsEventsResponse> = fetchPost(params, RequestOptions.none())

    /** @see [fetchPost] */
    fun fetchPost(
        params: ProjectLogFetchPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FetchProjectLogsEventsResponse>

    /** Insert a set of events into the project logs */
    fun insert(params: ProjectLogInsertParams): CompletableFuture<InsertEventsResponse> =
        insert(params, RequestOptions.none())

    /** @see [insert] */
    fun insert(
        params: ProjectLogInsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsertEventsResponse>

    /** A view of [LogServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/project_logs/{project_id}/feedback`, but is
         * otherwise the same as [LogServiceAsync.feedback].
         */
        @MustBeClosed
        fun feedback(
            params: ProjectLogFeedbackParams
        ): CompletableFuture<HttpResponseFor<FeedbackResponseSchema>> =
            feedback(params, RequestOptions.none())

        /** @see [feedback] */
        @MustBeClosed
        fun feedback(
            params: ProjectLogFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackResponseSchema>>

        /**
         * Returns a raw HTTP response for `get /v1/project_logs/{project_id}/fetch`, but is
         * otherwise the same as [LogServiceAsync.fetch].
         */
        @MustBeClosed
        fun fetch(
            params: ProjectLogFetchParams
        ): CompletableFuture<HttpResponseFor<FetchProjectLogsEventsResponse>> =
            fetch(params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            params: ProjectLogFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FetchProjectLogsEventsResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/project_logs/{project_id}/fetch`, but is
         * otherwise the same as [LogServiceAsync.fetchPost].
         */
        @MustBeClosed
        fun fetchPost(
            params: ProjectLogFetchPostParams
        ): CompletableFuture<HttpResponseFor<FetchProjectLogsEventsResponse>> =
            fetchPost(params, RequestOptions.none())

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            params: ProjectLogFetchPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FetchProjectLogsEventsResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/project_logs/{project_id}/insert`, but is
         * otherwise the same as [LogServiceAsync.insert].
         */
        @MustBeClosed
        fun insert(
            params: ProjectLogInsertParams
        ): CompletableFuture<HttpResponseFor<InsertEventsResponse>> =
            insert(params, RequestOptions.none())

        /** @see [insert] */
        @MustBeClosed
        fun insert(
            params: ProjectLogInsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsertEventsResponse>>
    }
}
