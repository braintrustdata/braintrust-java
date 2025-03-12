// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.ProjectTag
import com.braintrustdata.api.models.ProjectTagCreateParams
import com.braintrustdata.api.models.ProjectTagDeleteParams
import com.braintrustdata.api.models.ProjectTagListPage
import com.braintrustdata.api.models.ProjectTagListParams
import com.braintrustdata.api.models.ProjectTagReplaceParams
import com.braintrustdata.api.models.ProjectTagRetrieveParams
import com.braintrustdata.api.models.ProjectTagUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface ProjectTagService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new project_tag. If there is an existing project_tag in the project
     * with the same name as the one specified in the request, will return the existing
     * project_tag unmodified
     */
    fun create(params: ProjectTagCreateParams): ProjectTag =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: ProjectTagCreateParams, requestOptions: RequestOptions = RequestOptions.none()): ProjectTag

    /** Get a project_tag object by its id */
    fun retrieve(params: ProjectTagRetrieveParams): ProjectTag =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: ProjectTagRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): ProjectTag

    /**
     * Partially update a project_tag object. Specify the fields to update in the
     * payload. Any object-type fields will be deep-merged with existing content.
     * Currently we do not support removing fields or setting them to null.
     */
    fun update(params: ProjectTagUpdateParams): ProjectTag =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(params: ProjectTagUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): ProjectTag

    /**
     * List out all project_tags. The project_tags are sorted by creation date, with
     * the most recently-created project_tags coming first
     */
    fun list(): ProjectTagListPage = list(ProjectTagListParams.none())

    /** @see [list] */
    fun list(params: ProjectTagListParams = ProjectTagListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ProjectTagListPage

    /** @see [list] */
    fun list(params: ProjectTagListParams = ProjectTagListParams.none()): ProjectTagListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ProjectTagListPage = list(ProjectTagListParams.none(), requestOptions)

    /** Delete a project_tag object by its id */
    fun delete(params: ProjectTagDeleteParams): ProjectTag =
        delete(
          params, RequestOptions.none()
        )

    /** @see [delete] */
    fun delete(params: ProjectTagDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): ProjectTag

    /**
     * Create or replace project_tag. If there is an existing project_tag in the
     * project with the same name as the one specified in the request, will replace the
     * existing project_tag with the provided fields
     */
    fun replace(params: ProjectTagReplaceParams): ProjectTag =
        replace(
          params, RequestOptions.none()
        )

    /** @see [replace] */
    fun replace(params: ProjectTagReplaceParams, requestOptions: RequestOptions = RequestOptions.none()): ProjectTag

    /**
     * A view of [ProjectTagService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/project_tag`, but is otherwise the
         * same as [ProjectTagService.create].
         */
        @MustBeClosed
        fun create(params: ProjectTagCreateParams): HttpResponseFor<ProjectTag> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: ProjectTagCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ProjectTag>

        /**
         * Returns a raw HTTP response for `get /v1/project_tag/{project_tag_id}`, but is
         * otherwise the same as [ProjectTagService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ProjectTagRetrieveParams): HttpResponseFor<ProjectTag> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ProjectTagRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ProjectTag>

        /**
         * Returns a raw HTTP response for `patch /v1/project_tag/{project_tag_id}`, but is
         * otherwise the same as [ProjectTagService.update].
         */
        @MustBeClosed
        fun update(params: ProjectTagUpdateParams): HttpResponseFor<ProjectTag> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: ProjectTagUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ProjectTag>

        /**
         * Returns a raw HTTP response for `get /v1/project_tag`, but is otherwise the same
         * as [ProjectTagService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ProjectTagListPage> = list(ProjectTagListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: ProjectTagListParams = ProjectTagListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ProjectTagListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: ProjectTagListParams = ProjectTagListParams.none()): HttpResponseFor<ProjectTagListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProjectTagListPage> = list(ProjectTagListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/project_tag/{project_tag_id}`, but
         * is otherwise the same as [ProjectTagService.delete].
         */
        @MustBeClosed
        fun delete(params: ProjectTagDeleteParams): HttpResponseFor<ProjectTag> =
            delete(
              params, RequestOptions.none()
            )

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: ProjectTagDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ProjectTag>

        /**
         * Returns a raw HTTP response for `put /v1/project_tag`, but is otherwise the same
         * as [ProjectTagService.replace].
         */
        @MustBeClosed
        fun replace(params: ProjectTagReplaceParams): HttpResponseFor<ProjectTag> =
            replace(
              params, RequestOptions.none()
            )

        /** @see [replace] */
        @MustBeClosed
        fun replace(params: ProjectTagReplaceParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ProjectTag>
    }
}
