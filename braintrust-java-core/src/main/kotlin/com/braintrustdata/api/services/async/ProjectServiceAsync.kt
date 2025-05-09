// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.Project
import com.braintrustdata.api.models.ProjectCreateParams
import com.braintrustdata.api.models.ProjectDeleteParams
import com.braintrustdata.api.models.ProjectListPageAsync
import com.braintrustdata.api.models.ProjectListParams
import com.braintrustdata.api.models.ProjectRetrieveParams
import com.braintrustdata.api.models.ProjectUpdateParams
import com.braintrustdata.api.services.async.projects.LogServiceAsync
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface ProjectServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun logs(): LogServiceAsync

    /**
     * Create a new project. If there is an existing project with the same name as the one specified
     * in the request, will return the existing project unmodified
     */
    fun create(params: ProjectCreateParams): CompletableFuture<Project> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Project>

    /** Get a project object by its id */
    fun retrieve(projectId: String): CompletableFuture<Project> =
        retrieve(projectId, ProjectRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        projectId: String,
        params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Project> =
        retrieve(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        projectId: String,
        params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
    ): CompletableFuture<Project> = retrieve(projectId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ProjectRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Project>

    /** @see [retrieve] */
    fun retrieve(params: ProjectRetrieveParams): CompletableFuture<Project> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(projectId: String, requestOptions: RequestOptions): CompletableFuture<Project> =
        retrieve(projectId, ProjectRetrieveParams.none(), requestOptions)

    /**
     * Partially update a project object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    fun update(projectId: String): CompletableFuture<Project> =
        update(projectId, ProjectUpdateParams.none())

    /** @see [update] */
    fun update(
        projectId: String,
        params: ProjectUpdateParams = ProjectUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Project> =
        update(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [update] */
    fun update(
        projectId: String,
        params: ProjectUpdateParams = ProjectUpdateParams.none(),
    ): CompletableFuture<Project> = update(projectId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ProjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Project>

    /** @see [update] */
    fun update(params: ProjectUpdateParams): CompletableFuture<Project> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(projectId: String, requestOptions: RequestOptions): CompletableFuture<Project> =
        update(projectId, ProjectUpdateParams.none(), requestOptions)

    /**
     * List out all projects. The projects are sorted by creation date, with the most
     * recently-created projects coming first
     */
    fun list(): CompletableFuture<ProjectListPageAsync> = list(ProjectListParams.none())

    /** @see [list] */
    fun list(
        params: ProjectListParams = ProjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectListPageAsync>

    /** @see [list] */
    fun list(
        params: ProjectListParams = ProjectListParams.none()
    ): CompletableFuture<ProjectListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProjectListPageAsync> =
        list(ProjectListParams.none(), requestOptions)

    /** Delete a project object by its id */
    fun delete(projectId: String): CompletableFuture<Project> =
        delete(projectId, ProjectDeleteParams.none())

    /** @see [delete] */
    fun delete(
        projectId: String,
        params: ProjectDeleteParams = ProjectDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Project> =
        delete(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        projectId: String,
        params: ProjectDeleteParams = ProjectDeleteParams.none(),
    ): CompletableFuture<Project> = delete(projectId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ProjectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Project>

    /** @see [delete] */
    fun delete(params: ProjectDeleteParams): CompletableFuture<Project> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(projectId: String, requestOptions: RequestOptions): CompletableFuture<Project> =
        delete(projectId, ProjectDeleteParams.none(), requestOptions)

    /**
     * A view of [ProjectServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun logs(): LogServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/project`, but is otherwise the same as
         * [ProjectServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: ProjectCreateParams): CompletableFuture<HttpResponseFor<Project>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Project>>

        /**
         * Returns a raw HTTP response for `get /v1/project/{project_id}`, but is otherwise the same
         * as [ProjectServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(projectId: String): CompletableFuture<HttpResponseFor<Project>> =
            retrieve(projectId, ProjectRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            projectId: String,
            params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Project>> =
            retrieve(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            projectId: String,
            params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Project>> =
            retrieve(projectId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ProjectRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Project>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ProjectRetrieveParams): CompletableFuture<HttpResponseFor<Project>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            projectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Project>> =
            retrieve(projectId, ProjectRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/project/{project_id}`, but is otherwise the
         * same as [ProjectServiceAsync.update].
         */
        @MustBeClosed
        fun update(projectId: String): CompletableFuture<HttpResponseFor<Project>> =
            update(projectId, ProjectUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            projectId: String,
            params: ProjectUpdateParams = ProjectUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Project>> =
            update(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            projectId: String,
            params: ProjectUpdateParams = ProjectUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Project>> =
            update(projectId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ProjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Project>>

        /** @see [update] */
        @MustBeClosed
        fun update(params: ProjectUpdateParams): CompletableFuture<HttpResponseFor<Project>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            projectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Project>> =
            update(projectId, ProjectUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/project`, but is otherwise the same as
         * [ProjectServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ProjectListPageAsync>> =
            list(ProjectListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProjectListParams = ProjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProjectListParams = ProjectListParams.none()
        ): CompletableFuture<HttpResponseFor<ProjectListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProjectListPageAsync>> =
            list(ProjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/project/{project_id}`, but is otherwise the
         * same as [ProjectServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(projectId: String): CompletableFuture<HttpResponseFor<Project>> =
            delete(projectId, ProjectDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            projectId: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Project>> =
            delete(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            projectId: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<Project>> =
            delete(projectId, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ProjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Project>>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: ProjectDeleteParams): CompletableFuture<HttpResponseFor<Project>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            projectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Project>> =
            delete(projectId, ProjectDeleteParams.none(), requestOptions)
    }
}
