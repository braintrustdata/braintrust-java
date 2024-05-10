// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.models.Project
import com.braintrustdata.api.models.ProjectCreateParams
import com.braintrustdata.api.models.ProjectDeleteParams
import com.braintrustdata.api.models.ProjectListPageAsync
import com.braintrustdata.api.models.ProjectListParams
import com.braintrustdata.api.models.ProjectReplaceParams
import com.braintrustdata.api.models.ProjectRetrieveParams
import com.braintrustdata.api.models.ProjectUpdateParams
import com.braintrustdata.api.services.async.project.LogServiceAsync
import java.util.concurrent.CompletableFuture

interface ProjectServiceAsync {

    fun logs(): LogServiceAsync

    /**
     * Create a new project. If there is an existing project with the same name as the one specified
     * in the request, will return the existing project unmodified
     */
    @JvmOverloads
    fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Project>

    /** Get a project object by its id */
    @JvmOverloads
    fun retrieve(
        params: ProjectRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Project>

    /**
     * Partially update a project object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(
        params: ProjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Project>

    /**
     * List out all projects. The projects are sorted by creation date, with the most
     * recently-created projects coming first
     */
    @JvmOverloads
    fun list(
        params: ProjectListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ProjectListPageAsync>

    /** Delete a project object by its id */
    @JvmOverloads
    fun delete(
        params: ProjectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Project>

    /**
     * NOTE: This operation is deprecated and will be removed in a future revision of the API.
     * Create or replace a new project. If there is an existing project with the same name as the
     * one specified in the request, will return the existing project unmodified, will replace the
     * existing project with the provided fields
     */
    @JvmOverloads
    fun replace(
        params: ProjectReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Project>
}
