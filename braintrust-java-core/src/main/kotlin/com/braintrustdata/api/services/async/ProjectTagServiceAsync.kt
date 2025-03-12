// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.ProjectTag
import com.braintrustdata.api.models.ProjectTagCreateParams
import com.braintrustdata.api.models.ProjectTagDeleteParams
import com.braintrustdata.api.models.ProjectTagListPageAsync
import com.braintrustdata.api.models.ProjectTagListParams
import com.braintrustdata.api.models.ProjectTagReplaceParams
import com.braintrustdata.api.models.ProjectTagRetrieveParams
import com.braintrustdata.api.models.ProjectTagUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface ProjectTagServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new project_tag. If there is an existing project_tag in the project with the same
     * name as the one specified in the request, will return the existing project_tag unmodified
     */
    fun create(params: ProjectTagCreateParams): CompletableFuture<ProjectTag> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ProjectTagCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectTag>

    /** Get a project_tag object by its id */
    fun retrieve(params: ProjectTagRetrieveParams): CompletableFuture<ProjectTag> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ProjectTagRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectTag>

    /**
     * Partially update a project_tag object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    fun update(params: ProjectTagUpdateParams): CompletableFuture<ProjectTag> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ProjectTagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectTag>

    /**
     * List out all project_tags. The project_tags are sorted by creation date, with the most
     * recently-created project_tags coming first
     */
    fun list(): CompletableFuture<ProjectTagListPageAsync> = list(ProjectTagListParams.none())

    /** @see [list] */
    fun list(
        params: ProjectTagListParams = ProjectTagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectTagListPageAsync>

    /** @see [list] */
    fun list(
        params: ProjectTagListParams = ProjectTagListParams.none()
    ): CompletableFuture<ProjectTagListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProjectTagListPageAsync> =
        list(ProjectTagListParams.none(), requestOptions)

    /** Delete a project_tag object by its id */
    fun delete(params: ProjectTagDeleteParams): CompletableFuture<ProjectTag> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ProjectTagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectTag>

    /**
     * Create or replace project_tag. If there is an existing project_tag in the project with the
     * same name as the one specified in the request, will replace the existing project_tag with the
     * provided fields
     */
    fun replace(params: ProjectTagReplaceParams): CompletableFuture<ProjectTag> =
        replace(params, RequestOptions.none())

    /** @see [replace] */
    fun replace(
        params: ProjectTagReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectTag>

    /**
     * A view of [ProjectTagServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/project_tag`, but is otherwise the same as
         * [ProjectTagServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: ProjectTagCreateParams): CompletableFuture<HttpResponseFor<ProjectTag>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ProjectTagCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectTag>>

        /**
         * Returns a raw HTTP response for `get /v1/project_tag/{project_tag_id}`, but is otherwise
         * the same as [ProjectTagServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ProjectTagRetrieveParams
        ): CompletableFuture<HttpResponseFor<ProjectTag>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ProjectTagRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectTag>>

        /**
         * Returns a raw HTTP response for `patch /v1/project_tag/{project_tag_id}`, but is
         * otherwise the same as [ProjectTagServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: ProjectTagUpdateParams): CompletableFuture<HttpResponseFor<ProjectTag>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ProjectTagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectTag>>

        /**
         * Returns a raw HTTP response for `get /v1/project_tag`, but is otherwise the same as
         * [ProjectTagServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ProjectTagListPageAsync>> =
            list(ProjectTagListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProjectTagListParams = ProjectTagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectTagListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProjectTagListParams = ProjectTagListParams.none()
        ): CompletableFuture<HttpResponseFor<ProjectTagListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProjectTagListPageAsync>> =
            list(ProjectTagListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/project_tag/{project_tag_id}`, but is
         * otherwise the same as [ProjectTagServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: ProjectTagDeleteParams): CompletableFuture<HttpResponseFor<ProjectTag>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ProjectTagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectTag>>

        /**
         * Returns a raw HTTP response for `put /v1/project_tag`, but is otherwise the same as
         * [ProjectTagServiceAsync.replace].
         */
        @MustBeClosed
        fun replace(
            params: ProjectTagReplaceParams
        ): CompletableFuture<HttpResponseFor<ProjectTag>> = replace(params, RequestOptions.none())

        /** @see [replace] */
        @MustBeClosed
        fun replace(
            params: ProjectTagReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectTag>>
    }
}
