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
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    fun logs(): LogServiceAsync

    /**
     * Create a new project. If there is an existing project with the same name as the
     * one specified in the request, will return the existing project unmodified
     */
    fun create(params: ProjectCreateParams): CompletableFuture<Project> =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: ProjectCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Project>

    /** Get a project object by its id */
    fun retrieve(params: ProjectRetrieveParams): CompletableFuture<Project> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: ProjectRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Project>

    /**
     * Partially update a project object. Specify the fields to update in the payload.
     * Any object-type fields will be deep-merged with existing content. Currently we
     * do not support removing fields or setting them to null.
     */
    fun update(params: ProjectUpdateParams): CompletableFuture<Project> =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(params: ProjectUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Project>

    /**
     * List out all projects. The projects are sorted by creation date, with the most
     * recently-created projects coming first
     */
    fun list(): CompletableFuture<ProjectListPageAsync> = list(ProjectListParams.none())

    /** @see [list] */
    fun list(params: ProjectListParams = ProjectListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ProjectListPageAsync>

    /** @see [list] */
    fun list(params: ProjectListParams = ProjectListParams.none()): CompletableFuture<ProjectListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProjectListPageAsync> = list(ProjectListParams.none(), requestOptions)

    /** Delete a project object by its id */
    fun delete(params: ProjectDeleteParams): CompletableFuture<Project> =
        delete(
          params, RequestOptions.none()
        )

    /** @see [delete] */
    fun delete(params: ProjectDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Project>

    /**
     * A view of [ProjectServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        fun logs(): LogServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/project`, but is otherwise the same as
         * [ProjectServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: ProjectCreateParams): CompletableFuture<HttpResponseFor<Project>> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: ProjectCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Project>>

        /**
         * Returns a raw HTTP response for `get /v1/project/{project_id}`, but is otherwise
         * the same as [ProjectServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ProjectRetrieveParams): CompletableFuture<HttpResponseFor<Project>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ProjectRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Project>>

        /**
         * Returns a raw HTTP response for `patch /v1/project/{project_id}`, but is
         * otherwise the same as [ProjectServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: ProjectUpdateParams): CompletableFuture<HttpResponseFor<Project>> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: ProjectUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Project>>

        /**
         * Returns a raw HTTP response for `get /v1/project`, but is otherwise the same as
         * [ProjectServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ProjectListPageAsync>> = list(ProjectListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: ProjectListParams = ProjectListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ProjectListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: ProjectListParams = ProjectListParams.none()): CompletableFuture<HttpResponseFor<ProjectListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ProjectListPageAsync>> = list(ProjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/project/{project_id}`, but is
         * otherwise the same as [ProjectServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: ProjectDeleteParams): CompletableFuture<HttpResponseFor<Project>> =
            delete(
              params, RequestOptions.none()
            )

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: ProjectDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Project>>
    }
}
