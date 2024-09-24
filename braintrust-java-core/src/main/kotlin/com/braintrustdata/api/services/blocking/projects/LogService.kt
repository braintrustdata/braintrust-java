// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.blocking.projects

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.models.FeedbackResponseSchema
import com.braintrustdata.api.models.FetchProjectLogsEventsResponse
import com.braintrustdata.api.models.InsertEventsResponse
import com.braintrustdata.api.models.ProjectLogFeedbackParams
import com.braintrustdata.api.models.ProjectLogFetchParams
import com.braintrustdata.api.models.ProjectLogFetchPostParams
import com.braintrustdata.api.models.ProjectLogInsertParams

interface LogService {

    /** Log feedback for a set of project logs events */
    @JvmOverloads
    fun feedback(
        params: ProjectLogFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FeedbackResponseSchema

    /**
     * Fetch the events in a project logs. Equivalent to the POST form of the same path, but with
     * the parameters in the URL query rather than in the request body
     */
    @JvmOverloads
    fun fetch(
        params: ProjectLogFetchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FetchProjectLogsEventsResponse

    /**
     * Fetch the events in a project logs. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query
     */
    @JvmOverloads
    fun fetchPost(
        params: ProjectLogFetchPostParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FetchProjectLogsEventsResponse

    /** Insert a set of events into the project logs */
    @JvmOverloads
    fun insert(
        params: ProjectLogInsertParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InsertEventsResponse
}
