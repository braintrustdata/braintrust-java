// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.Project
import com.braintrustdata.api.models.ProjectCreateParams
import com.braintrustdata.api.models.ProjectDeleteParams
import com.braintrustdata.api.models.ProjectListPage
import com.braintrustdata.api.models.ProjectListParams
import com.braintrustdata.api.models.ProjectRetrieveParams
import com.braintrustdata.api.models.ProjectUpdateParams
import com.braintrustdata.api.services.blocking.projects.LogService
import com.google.errorprone.annotations.MustBeClosed

interface ProjectService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun logs(): LogService

    /**
     * Create a new project. If there is an existing project with the same name as the one specified
     * in the request, will return the existing project unmodified
     */
    @JvmOverloads
    fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Project

    /** Get a project object by its id */
    @JvmOverloads
    fun retrieve(
        params: ProjectRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Project

    /**
     * Partially update a project object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(
        params: ProjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Project

    /**
     * List out all projects. The projects are sorted by creation date, with the most
     * recently-created projects coming first
     */
    @JvmOverloads
    fun list(
        params: ProjectListParams = ProjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectListPage

    /**
     * List out all projects. The projects are sorted by creation date, with the most
     * recently-created projects coming first
     */
    fun list(requestOptions: RequestOptions): ProjectListPage =
        list(ProjectListParams.none(), requestOptions)

    /** Delete a project object by its id */
    @JvmOverloads
    fun delete(
        params: ProjectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Project

    /** A view of [ProjectService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun logs(): LogService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/project`, but is otherwise the same as
         * [ProjectService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Project>

        /**
         * Returns a raw HTTP response for `get /v1/project/{project_id}`, but is otherwise the same
         * as [ProjectService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ProjectRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Project>

        /**
         * Returns a raw HTTP response for `patch /v1/project/{project_id}`, but is otherwise the
         * same as [ProjectService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ProjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Project>

        /**
         * Returns a raw HTTP response for `get /v1/project`, but is otherwise the same as
         * [ProjectService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ProjectListParams = ProjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectListPage>

        /**
         * Returns a raw HTTP response for `get /v1/project`, but is otherwise the same as
         * [ProjectService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProjectListPage> =
            list(ProjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/project/{project_id}`, but is otherwise the
         * same as [ProjectService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: ProjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Project>
    }
}
