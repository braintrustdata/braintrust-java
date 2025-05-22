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
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun logs(): LogService

    /**
     * Create a new project. If there is an existing project with the same name as the one specified
     * in the request, will return the existing project unmodified
     */
    fun create(params: ProjectCreateParams): Project = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Project

    /** Get a project object by its id */
    fun retrieve(projectId: String): Project = retrieve(projectId, ProjectRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        projectId: String,
        params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Project = retrieve(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        projectId: String,
        params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
    ): Project = retrieve(projectId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ProjectRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Project

    /** @see [retrieve] */
    fun retrieve(params: ProjectRetrieveParams): Project = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(projectId: String, requestOptions: RequestOptions): Project =
        retrieve(projectId, ProjectRetrieveParams.none(), requestOptions)

    /**
     * Partially update a project object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    fun update(projectId: String): Project = update(projectId, ProjectUpdateParams.none())

    /** @see [update] */
    fun update(
        projectId: String,
        params: ProjectUpdateParams = ProjectUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Project = update(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [update] */
    fun update(
        projectId: String,
        params: ProjectUpdateParams = ProjectUpdateParams.none(),
    ): Project = update(projectId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ProjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Project

    /** @see [update] */
    fun update(params: ProjectUpdateParams): Project = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(projectId: String, requestOptions: RequestOptions): Project =
        update(projectId, ProjectUpdateParams.none(), requestOptions)

    /**
     * List out all projects. The projects are sorted by creation date, with the most
     * recently-created projects coming first
     */
    fun list(): ProjectListPage = list(ProjectListParams.none())

    /** @see [list] */
    fun list(
        params: ProjectListParams = ProjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectListPage

    /** @see [list] */
    fun list(params: ProjectListParams = ProjectListParams.none()): ProjectListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ProjectListPage =
        list(ProjectListParams.none(), requestOptions)

    /** Delete a project object by its id */
    fun delete(projectId: String): Project = delete(projectId, ProjectDeleteParams.none())

    /** @see [delete] */
    fun delete(
        projectId: String,
        params: ProjectDeleteParams = ProjectDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Project = delete(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        projectId: String,
        params: ProjectDeleteParams = ProjectDeleteParams.none(),
    ): Project = delete(projectId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ProjectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Project

    /** @see [delete] */
    fun delete(params: ProjectDeleteParams): Project = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(projectId: String, requestOptions: RequestOptions): Project =
        delete(projectId, ProjectDeleteParams.none(), requestOptions)

    /** A view of [ProjectService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun logs(): LogService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/project`, but is otherwise the same as
         * [ProjectService.create].
         */
        @MustBeClosed
        fun create(params: ProjectCreateParams): HttpResponseFor<Project> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Project>

        /**
         * Returns a raw HTTP response for `get /v1/project/{project_id}`, but is otherwise the same
         * as [ProjectService.retrieve].
         */
        @MustBeClosed
        fun retrieve(projectId: String): HttpResponseFor<Project> =
            retrieve(projectId, ProjectRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            projectId: String,
            params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Project> =
            retrieve(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            projectId: String,
            params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
        ): HttpResponseFor<Project> = retrieve(projectId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ProjectRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Project>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ProjectRetrieveParams): HttpResponseFor<Project> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(projectId: String, requestOptions: RequestOptions): HttpResponseFor<Project> =
            retrieve(projectId, ProjectRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/project/{project_id}`, but is otherwise the
         * same as [ProjectService.update].
         */
        @MustBeClosed
        fun update(projectId: String): HttpResponseFor<Project> =
            update(projectId, ProjectUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            projectId: String,
            params: ProjectUpdateParams = ProjectUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Project> =
            update(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            projectId: String,
            params: ProjectUpdateParams = ProjectUpdateParams.none(),
        ): HttpResponseFor<Project> = update(projectId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ProjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Project>

        /** @see [update] */
        @MustBeClosed
        fun update(params: ProjectUpdateParams): HttpResponseFor<Project> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(projectId: String, requestOptions: RequestOptions): HttpResponseFor<Project> =
            update(projectId, ProjectUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/project`, but is otherwise the same as
         * [ProjectService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ProjectListPage> = list(ProjectListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProjectListParams = ProjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProjectListParams = ProjectListParams.none()
        ): HttpResponseFor<ProjectListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProjectListPage> =
            list(ProjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/project/{project_id}`, but is otherwise the
         * same as [ProjectService.delete].
         */
        @MustBeClosed
        fun delete(projectId: String): HttpResponseFor<Project> =
            delete(projectId, ProjectDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            projectId: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Project> =
            delete(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            projectId: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
        ): HttpResponseFor<Project> = delete(projectId, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ProjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Project>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: ProjectDeleteParams): HttpResponseFor<Project> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(projectId: String, requestOptions: RequestOptions): HttpResponseFor<Project> =
            delete(projectId, ProjectDeleteParams.none(), requestOptions)
    }
}
