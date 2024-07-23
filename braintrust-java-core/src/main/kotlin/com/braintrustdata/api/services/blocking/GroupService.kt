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
import com.braintrustdata.api.models.Group
import com.braintrustdata.api.models.GroupCreateParams
import com.braintrustdata.api.models.GroupDeleteParams
import com.braintrustdata.api.models.GroupListPage
import com.braintrustdata.api.models.GroupListParams
import com.braintrustdata.api.models.GroupReplaceParams
import com.braintrustdata.api.models.GroupRetrieveParams
import com.braintrustdata.api.models.GroupUpdateParams
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

interface GroupService {

    /**
     * Create a new group. If there is an existing group with the same name as the one
     * specified in the request, will return the existing group unmodified
     */
    @JvmOverloads
    fun create(params: GroupCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Group

    /** Get a group object by its id */
    @JvmOverloads
    fun retrieve(params: GroupRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): Group

    /**
     * Partially update a group object. Specify the fields to update in the payload.
     * Any object-type fields will be deep-merged with existing content. Currently we
     * do not support removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(params: GroupUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Group

    /**
     * List out all groups. The groups are sorted by creation date, with the most
     * recently-created groups coming first
     */
    @JvmOverloads
    fun list(params: GroupListParams, requestOptions: RequestOptions = RequestOptions.none()): GroupListPage

    /** Delete a group object by its id */
    @JvmOverloads
    fun delete(params: GroupDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): Group

    /**
     * Create or replace group. If there is an existing group with the same name as the
     * one specified in the request, will replace the existing group with the provided
     * fields
     */
    @JvmOverloads
    fun replace(params: GroupReplaceParams, requestOptions: RequestOptions = RequestOptions.none()): Group
}
