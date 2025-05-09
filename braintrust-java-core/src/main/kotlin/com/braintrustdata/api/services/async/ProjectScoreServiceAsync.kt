// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.ProjectScore
import com.braintrustdata.api.models.ProjectScoreCreateParams
import com.braintrustdata.api.models.ProjectScoreDeleteParams
import com.braintrustdata.api.models.ProjectScoreListPageAsync
import com.braintrustdata.api.models.ProjectScoreListParams
import com.braintrustdata.api.models.ProjectScoreReplaceParams
import com.braintrustdata.api.models.ProjectScoreRetrieveParams
import com.braintrustdata.api.models.ProjectScoreUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface ProjectScoreServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new project_score. If there is an existing project_score in the project with the
     * same name as the one specified in the request, will return the existing project_score
     * unmodified
     */
    fun create(params: ProjectScoreCreateParams): CompletableFuture<ProjectScore> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ProjectScoreCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectScore>

    /** Get a project_score object by its id */
    fun retrieve(projectScoreId: String): CompletableFuture<ProjectScore> =
        retrieve(projectScoreId, ProjectScoreRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        projectScoreId: String,
        params: ProjectScoreRetrieveParams = ProjectScoreRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectScore> =
        retrieve(params.toBuilder().projectScoreId(projectScoreId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        projectScoreId: String,
        params: ProjectScoreRetrieveParams = ProjectScoreRetrieveParams.none(),
    ): CompletableFuture<ProjectScore> = retrieve(projectScoreId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ProjectScoreRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectScore>

    /** @see [retrieve] */
    fun retrieve(params: ProjectScoreRetrieveParams): CompletableFuture<ProjectScore> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        projectScoreId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectScore> =
        retrieve(projectScoreId, ProjectScoreRetrieveParams.none(), requestOptions)

    /**
     * Partially update a project_score object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    fun update(projectScoreId: String): CompletableFuture<ProjectScore> =
        update(projectScoreId, ProjectScoreUpdateParams.none())

    /** @see [update] */
    fun update(
        projectScoreId: String,
        params: ProjectScoreUpdateParams = ProjectScoreUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectScore> =
        update(params.toBuilder().projectScoreId(projectScoreId).build(), requestOptions)

    /** @see [update] */
    fun update(
        projectScoreId: String,
        params: ProjectScoreUpdateParams = ProjectScoreUpdateParams.none(),
    ): CompletableFuture<ProjectScore> = update(projectScoreId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ProjectScoreUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectScore>

    /** @see [update] */
    fun update(params: ProjectScoreUpdateParams): CompletableFuture<ProjectScore> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        projectScoreId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectScore> =
        update(projectScoreId, ProjectScoreUpdateParams.none(), requestOptions)

    /**
     * List out all project_scores. The project_scores are sorted by creation date, with the most
     * recently-created project_scores coming first
     */
    fun list(): CompletableFuture<ProjectScoreListPageAsync> = list(ProjectScoreListParams.none())

    /** @see [list] */
    fun list(
        params: ProjectScoreListParams = ProjectScoreListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectScoreListPageAsync>

    /** @see [list] */
    fun list(
        params: ProjectScoreListParams = ProjectScoreListParams.none()
    ): CompletableFuture<ProjectScoreListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProjectScoreListPageAsync> =
        list(ProjectScoreListParams.none(), requestOptions)

    /** Delete a project_score object by its id */
    fun delete(projectScoreId: String): CompletableFuture<ProjectScore> =
        delete(projectScoreId, ProjectScoreDeleteParams.none())

    /** @see [delete] */
    fun delete(
        projectScoreId: String,
        params: ProjectScoreDeleteParams = ProjectScoreDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectScore> =
        delete(params.toBuilder().projectScoreId(projectScoreId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        projectScoreId: String,
        params: ProjectScoreDeleteParams = ProjectScoreDeleteParams.none(),
    ): CompletableFuture<ProjectScore> = delete(projectScoreId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ProjectScoreDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectScore>

    /** @see [delete] */
    fun delete(params: ProjectScoreDeleteParams): CompletableFuture<ProjectScore> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        projectScoreId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectScore> =
        delete(projectScoreId, ProjectScoreDeleteParams.none(), requestOptions)

    /**
     * Create or replace project_score. If there is an existing project_score in the project with
     * the same name as the one specified in the request, will replace the existing project_score
     * with the provided fields
     */
    fun replace(params: ProjectScoreReplaceParams): CompletableFuture<ProjectScore> =
        replace(params, RequestOptions.none())

    /** @see [replace] */
    fun replace(
        params: ProjectScoreReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectScore>

    /**
     * A view of [ProjectScoreServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/project_score`, but is otherwise the same as
         * [ProjectScoreServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: ProjectScoreCreateParams
        ): CompletableFuture<HttpResponseFor<ProjectScore>> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ProjectScoreCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectScore>>

        /**
         * Returns a raw HTTP response for `get /v1/project_score/{project_score_id}`, but is
         * otherwise the same as [ProjectScoreServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(projectScoreId: String): CompletableFuture<HttpResponseFor<ProjectScore>> =
            retrieve(projectScoreId, ProjectScoreRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            projectScoreId: String,
            params: ProjectScoreRetrieveParams = ProjectScoreRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectScore>> =
            retrieve(params.toBuilder().projectScoreId(projectScoreId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            projectScoreId: String,
            params: ProjectScoreRetrieveParams = ProjectScoreRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ProjectScore>> =
            retrieve(projectScoreId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ProjectScoreRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectScore>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ProjectScoreRetrieveParams
        ): CompletableFuture<HttpResponseFor<ProjectScore>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            projectScoreId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProjectScore>> =
            retrieve(projectScoreId, ProjectScoreRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/project_score/{project_score_id}`, but is
         * otherwise the same as [ProjectScoreServiceAsync.update].
         */
        @MustBeClosed
        fun update(projectScoreId: String): CompletableFuture<HttpResponseFor<ProjectScore>> =
            update(projectScoreId, ProjectScoreUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            projectScoreId: String,
            params: ProjectScoreUpdateParams = ProjectScoreUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectScore>> =
            update(params.toBuilder().projectScoreId(projectScoreId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            projectScoreId: String,
            params: ProjectScoreUpdateParams = ProjectScoreUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ProjectScore>> =
            update(projectScoreId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ProjectScoreUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectScore>>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ProjectScoreUpdateParams
        ): CompletableFuture<HttpResponseFor<ProjectScore>> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            projectScoreId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProjectScore>> =
            update(projectScoreId, ProjectScoreUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/project_score`, but is otherwise the same as
         * [ProjectScoreServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ProjectScoreListPageAsync>> =
            list(ProjectScoreListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProjectScoreListParams = ProjectScoreListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectScoreListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProjectScoreListParams = ProjectScoreListParams.none()
        ): CompletableFuture<HttpResponseFor<ProjectScoreListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProjectScoreListPageAsync>> =
            list(ProjectScoreListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/project_score/{project_score_id}`, but is
         * otherwise the same as [ProjectScoreServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(projectScoreId: String): CompletableFuture<HttpResponseFor<ProjectScore>> =
            delete(projectScoreId, ProjectScoreDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            projectScoreId: String,
            params: ProjectScoreDeleteParams = ProjectScoreDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectScore>> =
            delete(params.toBuilder().projectScoreId(projectScoreId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            projectScoreId: String,
            params: ProjectScoreDeleteParams = ProjectScoreDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ProjectScore>> =
            delete(projectScoreId, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ProjectScoreDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectScore>>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ProjectScoreDeleteParams
        ): CompletableFuture<HttpResponseFor<ProjectScore>> = delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            projectScoreId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProjectScore>> =
            delete(projectScoreId, ProjectScoreDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/project_score`, but is otherwise the same as
         * [ProjectScoreServiceAsync.replace].
         */
        @MustBeClosed
        fun replace(
            params: ProjectScoreReplaceParams
        ): CompletableFuture<HttpResponseFor<ProjectScore>> = replace(params, RequestOptions.none())

        /** @see [replace] */
        @MustBeClosed
        fun replace(
            params: ProjectScoreReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectScore>>
    }
}
