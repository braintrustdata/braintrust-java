// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.blocking

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
import com.braintrustdata.api.models.Project
import com.braintrustdata.api.models.ProjectCreateParams
import com.braintrustdata.api.models.ProjectDeleteParams
import com.braintrustdata.api.models.ProjectListPage
import com.braintrustdata.api.models.ProjectListParams
import com.braintrustdata.api.models.ProjectRetrieveParams
import com.braintrustdata.api.models.ProjectUpdateParams
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
import com.braintrustdata.api.services.blocking.project.LogService
import com.braintrustdata.api.services.blocking.project.LogServiceImpl

interface ProjectService {

    fun logs(): LogService

    /**
     * Create a new project. If there is an existing project with the same name as the
     * one specified in the request, will return the existing project unmodified
     */
    @JvmOverloads
    fun create(params: ProjectCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Project

    /** Get a project object by its id */
    @JvmOverloads
    fun retrieve(params: ProjectRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): Project

    /**
     * Partially update a project object. Specify the fields to update in the payload.
     * Any object-type fields will be deep-merged with existing content. Currently we
     * do not support removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(params: ProjectUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Project

    /**
     * List out all projects. The projects are sorted by creation date, with the most
     * recently-created projects coming first
     */
    @JvmOverloads
    fun list(params: ProjectListParams, requestOptions: RequestOptions = RequestOptions.none()): ProjectListPage

    /** Delete a project object by its id */
    @JvmOverloads
    fun delete(params: ProjectDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): Project
}
