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
    fun feedback(projectId: String, params: ProjectLogFeedbackParams): FeedbackResponseSchema =
        feedback(projectId, params, RequestOptions.none())

    /** @see [feedback] */
    fun feedback(
        projectId: String,
        params: ProjectLogFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackResponseSchema =
        feedback(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [feedback] */
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
    fun fetch(projectId: String): FetchProjectLogsEventsResponse =
        fetch(projectId, ProjectLogFetchParams.none())

    /** @see [fetch] */
    fun fetch(
        projectId: String,
        params: ProjectLogFetchParams = ProjectLogFetchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FetchProjectLogsEventsResponse =
        fetch(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [fetch] */
    fun fetch(
        projectId: String,
        params: ProjectLogFetchParams = ProjectLogFetchParams.none(),
    ): FetchProjectLogsEventsResponse = fetch(projectId, params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(
        params: ProjectLogFetchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FetchProjectLogsEventsResponse

    /** @see [fetch] */
    fun fetch(params: ProjectLogFetchParams): FetchProjectLogsEventsResponse =
        fetch(params, RequestOptions.none())

    /** @see [fetch] */
    fun fetch(projectId: String, requestOptions: RequestOptions): FetchProjectLogsEventsResponse =
        fetch(projectId, ProjectLogFetchParams.none(), requestOptions)

    /**
     * Fetch the events in a project logs. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query. For more complex queries, use
     * the `POST /btql` endpoint.
     */
    fun fetchPost(projectId: String): FetchProjectLogsEventsResponse =
        fetchPost(projectId, ProjectLogFetchPostParams.none())

    /** @see [fetchPost] */
    fun fetchPost(
        projectId: String,
        params: ProjectLogFetchPostParams = ProjectLogFetchPostParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FetchProjectLogsEventsResponse =
        fetchPost(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [fetchPost] */
    fun fetchPost(
        projectId: String,
        params: ProjectLogFetchPostParams = ProjectLogFetchPostParams.none(),
    ): FetchProjectLogsEventsResponse = fetchPost(projectId, params, RequestOptions.none())

    /** @see [fetchPost] */
    fun fetchPost(
        params: ProjectLogFetchPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FetchProjectLogsEventsResponse

    /** @see [fetchPost] */
    fun fetchPost(params: ProjectLogFetchPostParams): FetchProjectLogsEventsResponse =
        fetchPost(params, RequestOptions.none())

    /** @see [fetchPost] */
    fun fetchPost(
        projectId: String,
        requestOptions: RequestOptions,
    ): FetchProjectLogsEventsResponse =
        fetchPost(projectId, ProjectLogFetchPostParams.none(), requestOptions)

    /** Insert a set of events into the project logs */
    fun insert(projectId: String, params: ProjectLogInsertParams): InsertEventsResponse =
        insert(projectId, params, RequestOptions.none())

    /** @see [insert] */
    fun insert(
        projectId: String,
        params: ProjectLogInsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsertEventsResponse =
        insert(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [insert] */
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
        fun feedback(
            projectId: String,
            params: ProjectLogFeedbackParams,
        ): HttpResponseFor<FeedbackResponseSchema> =
            feedback(projectId, params, RequestOptions.none())

        /** @see [feedback] */
        @MustBeClosed
        fun feedback(
            projectId: String,
            params: ProjectLogFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackResponseSchema> =
            feedback(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [feedback] */
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
        fun fetch(projectId: String): HttpResponseFor<FetchProjectLogsEventsResponse> =
            fetch(projectId, ProjectLogFetchParams.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            projectId: String,
            params: ProjectLogFetchParams = ProjectLogFetchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FetchProjectLogsEventsResponse> =
            fetch(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            projectId: String,
            params: ProjectLogFetchParams = ProjectLogFetchParams.none(),
        ): HttpResponseFor<FetchProjectLogsEventsResponse> =
            fetch(projectId, params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            params: ProjectLogFetchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FetchProjectLogsEventsResponse>

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(params: ProjectLogFetchParams): HttpResponseFor<FetchProjectLogsEventsResponse> =
            fetch(params, RequestOptions.none())

        /** @see [fetch] */
        @MustBeClosed
        fun fetch(
            projectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FetchProjectLogsEventsResponse> =
            fetch(projectId, ProjectLogFetchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/project_logs/{project_id}/fetch`, but is
         * otherwise the same as [LogService.fetchPost].
         */
        @MustBeClosed
        fun fetchPost(projectId: String): HttpResponseFor<FetchProjectLogsEventsResponse> =
            fetchPost(projectId, ProjectLogFetchPostParams.none())

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            projectId: String,
            params: ProjectLogFetchPostParams = ProjectLogFetchPostParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FetchProjectLogsEventsResponse> =
            fetchPost(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            projectId: String,
            params: ProjectLogFetchPostParams = ProjectLogFetchPostParams.none(),
        ): HttpResponseFor<FetchProjectLogsEventsResponse> =
            fetchPost(projectId, params, RequestOptions.none())

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            params: ProjectLogFetchPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FetchProjectLogsEventsResponse>

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            params: ProjectLogFetchPostParams
        ): HttpResponseFor<FetchProjectLogsEventsResponse> =
            fetchPost(params, RequestOptions.none())

        /** @see [fetchPost] */
        @MustBeClosed
        fun fetchPost(
            projectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FetchProjectLogsEventsResponse> =
            fetchPost(projectId, ProjectLogFetchPostParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/project_logs/{project_id}/insert`, but is
         * otherwise the same as [LogService.insert].
         */
        @MustBeClosed
        fun insert(
            projectId: String,
            params: ProjectLogInsertParams,
        ): HttpResponseFor<InsertEventsResponse> = insert(projectId, params, RequestOptions.none())

        /** @see [insert] */
        @MustBeClosed
        fun insert(
            projectId: String,
            params: ProjectLogInsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsertEventsResponse> =
            insert(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [insert] */
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
