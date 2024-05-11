// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrust.api.services.async.project

import com.braintrust.api.core.RequestOptions
import com.braintrust.api.models.ProjectLogFeedbackParams
import com.braintrust.api.models.ProjectLogFetchParams
import com.braintrust.api.models.ProjectLogFetchPostParams
import com.braintrust.api.models.ProjectLogFetchPostResponse
import com.braintrust.api.models.ProjectLogFetchResponse
import com.braintrust.api.models.ProjectLogInsertParams
import com.braintrust.api.models.ProjectLogInsertResponse
import java.util.concurrent.CompletableFuture

interface LogServiceAsync {

    /** Log feedback for a set of project logs events */
    @JvmOverloads
    fun feedback(
        params: ProjectLogFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>

    /**
     * Fetch the events in a project logs. Equivalent to the POST form of the same path, but with
     * the parameters in the URL query rather than in the request body
     */
    @JvmOverloads
    fun fetch(
        params: ProjectLogFetchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ProjectLogFetchResponse>

    /**
     * Fetch the events in a project logs. Equivalent to the GET form of the same path, but with the
     * parameters in the request body rather than in the URL query
     */
    @JvmOverloads
    fun fetchPost(
        params: ProjectLogFetchPostParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ProjectLogFetchPostResponse>

    /** Insert a set of events into the project logs */
    @JvmOverloads
    fun insert(
        params: ProjectLogInsertParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ProjectLogInsertResponse>
}
