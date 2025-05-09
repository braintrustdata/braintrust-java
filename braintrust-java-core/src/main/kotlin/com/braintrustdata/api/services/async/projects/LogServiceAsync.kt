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
    fun feedback(
        projectId: String,
        params: ProjectLogFeedbackParams,
    ): CompletableFuture<FeedbackResponseSchema> =
        feedback(projectId, params, RequestOptions.none())

    /** @see [feedback] */
    fun feedback(
        projectId: String,
        params: ProjectLogFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackResponseSchema> =
        feedback(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [feedback] */
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
    fun fetch(projectId: String): CompletableFuture<FetchProjectLogsEventsResponse> =
        fetch(projectId, ProjectLogFetchParams.none())

    /** @see [fetch] */
    fun fetch(
        projectId: String,
        params: ProjectLogFetchParams = ProjectLogFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FetchProjectLogsEventsResponse> =
        fetch(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [fetch] */
    fun fetch(
        projectId: String,
        params: ProjectLogFetchParams = ProjectLogFetchParams.none(),
    ): CompletableFuture<FetchProjectLogsEventsResponse> =
        fetch(projectId, params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(
        params: ProjectLogFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FetchProjectLogsEventsResponse>

    /** @see [fetch] */
    fun fetch(params: ProjectLogFetchParams): CompletableFuture<FetchProjectLogsEventsResponse> =
        fetch(params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(
        projectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FetchProjectLogsEventsResponse> =
        fetch(projectId, ProjectLogFetchParams.none(), requestOptions)

    /**
     * Fetch the events in a project logs. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query. For more complex queries, use
     * the `POST /btql` endpoint.
     */
    fun fetchPost(projectId: String): CompletableFuture<FetchProjectLogsEventsResponse> =
        fetchPost(projectId, ProjectLogFetchPostParams.none())

    /** @see [fetchPost] */
    fun fetchPost(
        projectId: String,
        params: ProjectLogFetchPostParams = ProjectLogFetchPostParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FetchProjectLogsEventsResponse> =
        fetchPost(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [fetchPost] */
    fun fetchPost(
        projectId: String,
        params: ProjectLogFetchPostParams = ProjectLogFetchPostParams.none(),
    ): CompletableFuture<FetchProjectLogsEventsResponse> =
        fetchPost(projectId, params, RequestOptions.none())

    /** @see [fetchPost] */
    fun fetchPost(
        params: ProjectLogFetchPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FetchProjectLogsEventsResponse>

    /** @see [fetchPost] */
    fun fetchPost(
        params: ProjectLogFetchPostParams
    ): CompletableFuture<FetchProjectLogsEventsResponse> = fetchPost(params, RequestOptions.none())

    /** @see [fetchPost] */
    fun fetchPost(
        projectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FetchProjectLogsEventsResponse> =
        fetchPost(projectId, ProjectLogFetchPostParams.none(), requestOptions)

    /** Insert a set of events into the project logs */
    fun insert(
        projectId: String,
        params: ProjectLogInsertParams,
    ): CompletableFuture<InsertEventsResponse> = insert(projectId, params, RequestOptions.none())

    /** @see [insert] */
    fun insert(
        projectId: String,
        params: ProjectLogInsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsertEventsResponse> =
        insert(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [insert] */
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
            projectId: String,
            params: ProjectLogFeedbackParams,
        ): CompletableFuture<HttpResponseFor<FeedbackResponseSchema>> =
            feedback(projectId, params, RequestOptions.none())

        /** @see [feedback] */
        @MustBeClosed
        fun feedback(
            projectId: String,
            params: ProjectLogFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackResponseSchema>> =
            feedback(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [feedback] */
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
            projectId: String
        ): CompletableFuture<HttpResponseFor<FetchProjectLogsEventsResponse>> =
            fetch(projectId, ProjectLogFetchParams.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            projectId: String,
            params: ProjectLogFetchParams = ProjectLogFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FetchProjectLogsEventsResponse>> =
            fetch(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            projectId: String,
            params: ProjectLogFetchParams = ProjectLogFetchParams.none(),
        ): CompletableFuture<HttpResponseFor<FetchProjectLogsEventsResponse>> =
            fetch(projectId, params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            params: ProjectLogFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FetchProjectLogsEventsResponse>>

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            params: ProjectLogFetchParams
        ): CompletableFuture<HttpResponseFor<FetchProjectLogsEventsResponse>> =
            fetch(params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            projectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FetchProjectLogsEventsResponse>> =
            fetch(projectId, ProjectLogFetchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/project_logs/{project_id}/fetch`, but is
         * otherwise the same as [LogServiceAsync.fetchPost].
         */
        @MustBeClosed
        fun fetchPost(
            projectId: String
        ): CompletableFuture<HttpResponseFor<FetchProjectLogsEventsResponse>> =
            fetchPost(projectId, ProjectLogFetchPostParams.none())

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            projectId: String,
            params: ProjectLogFetchPostParams = ProjectLogFetchPostParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FetchProjectLogsEventsResponse>> =
            fetchPost(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            projectId: String,
            params: ProjectLogFetchPostParams = ProjectLogFetchPostParams.none(),
        ): CompletableFuture<HttpResponseFor<FetchProjectLogsEventsResponse>> =
            fetchPost(projectId, params, RequestOptions.none())

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            params: ProjectLogFetchPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FetchProjectLogsEventsResponse>>

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            params: ProjectLogFetchPostParams
        ): CompletableFuture<HttpResponseFor<FetchProjectLogsEventsResponse>> =
            fetchPost(params, RequestOptions.none())

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            projectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FetchProjectLogsEventsResponse>> =
            fetchPost(projectId, ProjectLogFetchPostParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/project_logs/{project_id}/insert`, but is
         * otherwise the same as [LogServiceAsync.insert].
         */
        @MustBeClosed
        fun insert(
            projectId: String,
            params: ProjectLogInsertParams,
        ): CompletableFuture<HttpResponseFor<InsertEventsResponse>> =
            insert(projectId, params, RequestOptions.none())

        /** @see [insert] */
        @MustBeClosed
        fun insert(
            projectId: String,
            params: ProjectLogInsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsertEventsResponse>> =
            insert(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [insert] */
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
