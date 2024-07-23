// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.async.project

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.ProjectLogFeedbackParams
import com.braintrustdata.api.models.ProjectLogFetchParams
import com.braintrustdata.api.models.ProjectLogFetchPostParams
import com.braintrustdata.api.models.ProjectLogFetchPostResponse
import com.braintrustdata.api.models.ProjectLogFetchResponse
import com.braintrustdata.api.models.ProjectLogInsertParams
import com.braintrustdata.api.models.ProjectLogInsertResponse
import com.braintrustdata.api.core.ClientOptions
import com.braintrustdata.api.core.http.HttpMethod
import com.braintrustdata.api.core.http.HttpRequest
import com.braintrustdata.api.core.http.HttpResponse.Handler
import com.braintrustdata.api.core.http.BinaryResponseContent
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.services.emptyHandler
import com.braintrustdata.api.services.errorHandler
import com.braintrustdata.api.services.json
import com.braintrustdata.api.services.jsonHandler
import com.braintrustdata.api.services.multipartFormData
import com.braintrustdata.api.services.stringHandler
import com.braintrustdata.api.services.binaryHandler
import com.braintrustdata.api.services.withErrorHandler

interface LogServiceAsync {

    /** Log feedback for a set of project logs events */
    @JvmOverloads
    fun feedback(params: ProjectLogFeedbackParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void>

    /**
     * Fetch the events in a project logs. Equivalent to the POST form of the same
     * path, but with the parameters in the URL query rather than in the request body
     */
    @JvmOverloads
    fun fetch(params: ProjectLogFetchParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ProjectLogFetchResponse>

    /**
     * Fetch the events in a project logs. Equivalent to the GET form of the same path,
     * but with the parameters in the request body rather than in the URL query
     */
    @JvmOverloads
    fun fetchPost(params: ProjectLogFetchPostParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ProjectLogFetchPostResponse>

    /** Insert a set of events into the project logs */
    @JvmOverloads
    fun insert(params: ProjectLogInsertParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ProjectLogInsertResponse>
}
