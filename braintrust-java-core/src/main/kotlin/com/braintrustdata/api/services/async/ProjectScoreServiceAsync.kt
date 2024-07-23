// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.async

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
import com.braintrustdata.api.models.ProjectScore
import com.braintrustdata.api.models.ProjectScoreCreateParams
import com.braintrustdata.api.models.ProjectScoreDeleteParams
import com.braintrustdata.api.models.ProjectScoreListPageAsync
import com.braintrustdata.api.models.ProjectScoreListParams
import com.braintrustdata.api.models.ProjectScoreReplaceParams
import com.braintrustdata.api.models.ProjectScoreRetrieveParams
import com.braintrustdata.api.models.ProjectScoreUpdateParams
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

interface ProjectScoreServiceAsync {

    /**
     * Create a new project_score. If there is an existing project_score in the project
     * with the same name as the one specified in the request, will return the existing
     * project_score unmodified
     */
    @JvmOverloads
    fun create(params: ProjectScoreCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ProjectScore>

    /** Get a project_score object by its id */
    @JvmOverloads
    fun retrieve(params: ProjectScoreRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ProjectScore>

    /**
     * Partially update a project_score object. Specify the fields to update in the
     * payload. Any object-type fields will be deep-merged with existing content.
     * Currently we do not support removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(params: ProjectScoreUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ProjectScore>

    /**
     * List out all project_scores. The project_scores are sorted by creation date,
     * with the most recently-created project_scores coming first
     */
    @JvmOverloads
    fun list(params: ProjectScoreListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ProjectScoreListPageAsync>

    /** Delete a project_score object by its id */
    @JvmOverloads
    fun delete(params: ProjectScoreDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ProjectScore>

    /**
     * Create or replace project_score. If there is an existing project_score in the
     * project with the same name as the one specified in the request, will replace the
     * existing project_score with the provided fields
     */
    @JvmOverloads
    fun replace(params: ProjectScoreReplaceParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ProjectScore>
}
