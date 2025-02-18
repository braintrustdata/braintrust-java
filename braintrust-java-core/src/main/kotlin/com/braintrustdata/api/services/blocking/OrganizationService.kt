// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.models.Organization
import com.braintrustdata.api.models.OrganizationDeleteParams
import com.braintrustdata.api.models.OrganizationListPage
import com.braintrustdata.api.models.OrganizationListParams
import com.braintrustdata.api.models.OrganizationRetrieveParams
import com.braintrustdata.api.models.OrganizationUpdateParams
import com.braintrustdata.api.services.blocking.organizations.MemberService

interface OrganizationService {

    fun members(): MemberService

    /** Get an organization object by its id */
    @JvmOverloads
    fun retrieve(
        params: OrganizationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Organization

    /**
     * Partially update an organization object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(
        params: OrganizationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Organization

    /**
     * List out all organizations. The organizations are sorted by creation date, with the most
     * recently-created organizations coming first
     */
    @JvmOverloads
    fun list(
        params: OrganizationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationListPage

    /** Delete an organization object by its id */
    @JvmOverloads
    fun delete(
        params: OrganizationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Organization
}
