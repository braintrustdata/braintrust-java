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
import com.braintrustdata.api.models.Role
import com.braintrustdata.api.models.RoleCreateParams
import com.braintrustdata.api.models.RoleDeleteParams
import com.braintrustdata.api.models.RoleListPage
import com.braintrustdata.api.models.RoleListParams
import com.braintrustdata.api.models.RoleReplaceParams
import com.braintrustdata.api.models.RoleRetrieveParams
import com.braintrustdata.api.models.RoleUpdateParams
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

interface RoleService {

    /**
     * Create a new role. If there is an existing role with the same name as the one
     * specified in the request, will return the existing role unmodified
     */
    @JvmOverloads
    fun create(params: RoleCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Role

    /** Get a role object by its id */
    @JvmOverloads
    fun retrieve(params: RoleRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): Role

    /**
     * Partially update a role object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do
     * not support removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(params: RoleUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Role

    /**
     * List out all roles. The roles are sorted by creation date, with the most
     * recently-created roles coming first
     */
    @JvmOverloads
    fun list(params: RoleListParams, requestOptions: RequestOptions = RequestOptions.none()): RoleListPage

    /** Delete a role object by its id */
    @JvmOverloads
    fun delete(params: RoleDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): Role

    /**
     * Create or replace role. If there is an existing role with the same name as the
     * one specified in the request, will replace the existing role with the provided
     * fields
     */
    @JvmOverloads
    fun replace(params: RoleReplaceParams, requestOptions: RequestOptions = RequestOptions.none()): Role
}
