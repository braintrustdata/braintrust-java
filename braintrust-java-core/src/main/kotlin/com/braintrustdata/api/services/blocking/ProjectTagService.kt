// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.models.ProjectTag
import com.braintrustdata.api.models.ProjectTagCreateParams
import com.braintrustdata.api.models.ProjectTagDeleteParams
import com.braintrustdata.api.models.ProjectTagListPage
import com.braintrustdata.api.models.ProjectTagListParams
import com.braintrustdata.api.models.ProjectTagReplaceParams
import com.braintrustdata.api.models.ProjectTagRetrieveParams
import com.braintrustdata.api.models.ProjectTagUpdateParams

interface ProjectTagService {

    /**
     * Create a new project_tag. If there is an existing project_tag in the project with the same
     * name as the one specified in the request, will return the existing project_tag unmodified
     */
    @JvmOverloads
    fun create(
        params: ProjectTagCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProjectTag

    /** Get a project_tag object by its id */
    @JvmOverloads
    fun retrieve(
        params: ProjectTagRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProjectTag

    /**
     * Partially update a project_tag object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(
        params: ProjectTagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProjectTag

    /**
     * List out all project_tags. The project_tags are sorted by creation date, with the most
     * recently-created project_tags coming first
     */
    @JvmOverloads
    fun list(
        params: ProjectTagListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProjectTagListPage

    /** Delete a project_tag object by its id */
    @JvmOverloads
    fun delete(
        params: ProjectTagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProjectTag

    /**
     * Create or replace project_tag. If there is an existing project_tag in the project with the
     * same name as the one specified in the request, will replace the existing project_tag with the
     * provided fields
     */
    @JvmOverloads
    fun replace(
        params: ProjectTagReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProjectTag
}
