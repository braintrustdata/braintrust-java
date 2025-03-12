// File generated from our OpenAPI spec by Stainless.

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
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    fun logs(): LogService

    /**
     * Create a new project. If there is an existing project with the same name as the
     * one specified in the request, will return the existing project unmodified
     */
    fun create(params: ProjectCreateParams): Project =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: ProjectCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Project

    /** Get a project object by its id */
    fun retrieve(params: ProjectRetrieveParams): Project =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: ProjectRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): Project

    /**
     * Partially update a project object. Specify the fields to update in the payload.
     * Any object-type fields will be deep-merged with existing content. Currently we
     * do not support removing fields or setting them to null.
     */
    fun update(params: ProjectUpdateParams): Project =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(params: ProjectUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Project

    /**
     * List out all projects. The projects are sorted by creation date, with the most
     * recently-created projects coming first
     */
    fun list(): ProjectListPage = list(ProjectListParams.none())

    /** @see [list] */
    fun list(params: ProjectListParams = ProjectListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ProjectListPage

    /** @see [list] */
    fun list(params: ProjectListParams = ProjectListParams.none()): ProjectListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ProjectListPage = list(ProjectListParams.none(), requestOptions)

    /** Delete a project object by its id */
    fun delete(params: ProjectDeleteParams): Project =
        delete(
          params, RequestOptions.none()
        )

    /** @see [delete] */
    fun delete(params: ProjectDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): Project

    /**
     * A view of [ProjectService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun logs(): LogService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/project`, but is otherwise the same as
         * [ProjectService.create].
         */
        @MustBeClosed
        fun create(params: ProjectCreateParams): HttpResponseFor<Project> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: ProjectCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Project>

        /**
         * Returns a raw HTTP response for `get /v1/project/{project_id}`, but is otherwise
         * the same as [ProjectService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ProjectRetrieveParams): HttpResponseFor<Project> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ProjectRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Project>

        /**
         * Returns a raw HTTP response for `patch /v1/project/{project_id}`, but is
         * otherwise the same as [ProjectService.update].
         */
        @MustBeClosed
        fun update(params: ProjectUpdateParams): HttpResponseFor<Project> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: ProjectUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Project>

        /**
         * Returns a raw HTTP response for `get /v1/project`, but is otherwise the same as
         * [ProjectService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ProjectListPage> = list(ProjectListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: ProjectListParams = ProjectListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ProjectListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: ProjectListParams = ProjectListParams.none()): HttpResponseFor<ProjectListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProjectListPage> = list(ProjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/project/{project_id}`, but is
         * otherwise the same as [ProjectService.delete].
         */
        @MustBeClosed
        fun delete(params: ProjectDeleteParams): HttpResponseFor<Project> =
            delete(
              params, RequestOptions.none()
            )

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: ProjectDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Project>
    }
}
