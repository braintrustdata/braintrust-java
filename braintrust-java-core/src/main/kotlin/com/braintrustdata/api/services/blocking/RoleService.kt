// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.Role
import com.braintrustdata.api.models.RoleCreateParams
import com.braintrustdata.api.models.RoleDeleteParams
import com.braintrustdata.api.models.RoleListPage
import com.braintrustdata.api.models.RoleListParams
import com.braintrustdata.api.models.RoleReplaceParams
import com.braintrustdata.api.models.RoleRetrieveParams
import com.braintrustdata.api.models.RoleUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface RoleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new role. If there is an existing role with the same name as the one
     * specified in the request, will return the existing role unmodified
     */
    fun create(params: RoleCreateParams): Role =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: RoleCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Role

    /** Get a role object by its id */
    fun retrieve(params: RoleRetrieveParams): Role =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: RoleRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): Role

    /**
     * Partially update a role object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do
     * not support removing fields or setting them to null.
     */
    fun update(params: RoleUpdateParams): Role =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(params: RoleUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Role

    /**
     * List out all roles. The roles are sorted by creation date, with the most
     * recently-created roles coming first
     */
    fun list(): RoleListPage = list(RoleListParams.none())

    /** @see [list] */
    fun list(params: RoleListParams = RoleListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): RoleListPage

    /** @see [list] */
    fun list(params: RoleListParams = RoleListParams.none()): RoleListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): RoleListPage = list(RoleListParams.none(), requestOptions)

    /** Delete a role object by its id */
    fun delete(params: RoleDeleteParams): Role =
        delete(
          params, RequestOptions.none()
        )

    /** @see [delete] */
    fun delete(params: RoleDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): Role

    /**
     * Create or replace role. If there is an existing role with the same name as the
     * one specified in the request, will replace the existing role with the provided
     * fields
     */
    fun replace(params: RoleReplaceParams): Role =
        replace(
          params, RequestOptions.none()
        )

    /** @see [replace] */
    fun replace(params: RoleReplaceParams, requestOptions: RequestOptions = RequestOptions.none()): Role

    /**
     * A view of [RoleService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/role`, but is otherwise the same as
         * [RoleService.create].
         */
        @MustBeClosed
        fun create(params: RoleCreateParams): HttpResponseFor<Role> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: RoleCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Role>

        /**
         * Returns a raw HTTP response for `get /v1/role/{role_id}`, but is otherwise the
         * same as [RoleService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: RoleRetrieveParams): HttpResponseFor<Role> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: RoleRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Role>

        /**
         * Returns a raw HTTP response for `patch /v1/role/{role_id}`, but is otherwise the
         * same as [RoleService.update].
         */
        @MustBeClosed
        fun update(params: RoleUpdateParams): HttpResponseFor<Role> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: RoleUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Role>

        /**
         * Returns a raw HTTP response for `get /v1/role`, but is otherwise the same as
         * [RoleService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<RoleListPage> = list(RoleListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: RoleListParams = RoleListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RoleListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: RoleListParams = RoleListParams.none()): HttpResponseFor<RoleListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RoleListPage> = list(RoleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/role/{role_id}`, but is otherwise
         * the same as [RoleService.delete].
         */
        @MustBeClosed
        fun delete(params: RoleDeleteParams): HttpResponseFor<Role> =
            delete(
              params, RequestOptions.none()
            )

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: RoleDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Role>

        /**
         * Returns a raw HTTP response for `put /v1/role`, but is otherwise the same as
         * [RoleService.replace].
         */
        @MustBeClosed
        fun replace(params: RoleReplaceParams): HttpResponseFor<Role> =
            replace(
              params, RequestOptions.none()
            )

        /** @see [replace] */
        @MustBeClosed
        fun replace(params: RoleReplaceParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Role>
    }
}
