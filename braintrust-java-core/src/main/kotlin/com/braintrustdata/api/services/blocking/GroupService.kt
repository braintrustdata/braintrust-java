// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.Group
import com.braintrustdata.api.models.GroupCreateParams
import com.braintrustdata.api.models.GroupDeleteParams
import com.braintrustdata.api.models.GroupListPage
import com.braintrustdata.api.models.GroupListParams
import com.braintrustdata.api.models.GroupReplaceParams
import com.braintrustdata.api.models.GroupRetrieveParams
import com.braintrustdata.api.models.GroupUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface GroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new group. If there is an existing group with the same name as the one specified in
     * the request, will return the existing group unmodified
     */
    fun create(params: GroupCreateParams): Group = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Group

    /** Get a group object by its id */
    fun retrieve(groupId: String): Group = retrieve(groupId, GroupRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        groupId: String,
        params: GroupRetrieveParams = GroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Group = retrieve(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(groupId: String, params: GroupRetrieveParams = GroupRetrieveParams.none()): Group =
        retrieve(groupId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: GroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Group

    /** @see [retrieve] */
    fun retrieve(params: GroupRetrieveParams): Group = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(groupId: String, requestOptions: RequestOptions): Group =
        retrieve(groupId, GroupRetrieveParams.none(), requestOptions)

    /**
     * Partially update a group object. Specify the fields to update in the payload. Any object-type
     * fields will be deep-merged with existing content. Currently we do not support removing fields
     * or setting them to null.
     */
    fun update(groupId: String): Group = update(groupId, GroupUpdateParams.none())

    /** @see [update] */
    fun update(
        groupId: String,
        params: GroupUpdateParams = GroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Group = update(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see [update] */
    fun update(groupId: String, params: GroupUpdateParams = GroupUpdateParams.none()): Group =
        update(groupId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: GroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Group

    /** @see [update] */
    fun update(params: GroupUpdateParams): Group = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(groupId: String, requestOptions: RequestOptions): Group =
        update(groupId, GroupUpdateParams.none(), requestOptions)

    /**
     * List out all groups. The groups are sorted by creation date, with the most recently-created
     * groups coming first
     */
    fun list(): GroupListPage = list(GroupListParams.none())

    /** @see [list] */
    fun list(
        params: GroupListParams = GroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GroupListPage

    /** @see [list] */
    fun list(params: GroupListParams = GroupListParams.none()): GroupListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): GroupListPage =
        list(GroupListParams.none(), requestOptions)

    /** Delete a group object by its id */
    fun delete(groupId: String): Group = delete(groupId, GroupDeleteParams.none())

    /** @see [delete] */
    fun delete(
        groupId: String,
        params: GroupDeleteParams = GroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Group = delete(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see [delete] */
    fun delete(groupId: String, params: GroupDeleteParams = GroupDeleteParams.none()): Group =
        delete(groupId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: GroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Group

    /** @see [delete] */
    fun delete(params: GroupDeleteParams): Group = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(groupId: String, requestOptions: RequestOptions): Group =
        delete(groupId, GroupDeleteParams.none(), requestOptions)

    /**
     * Create or replace group. If there is an existing group with the same name as the one
     * specified in the request, will replace the existing group with the provided fields
     */
    fun replace(params: GroupReplaceParams): Group = replace(params, RequestOptions.none())

    /** @see [replace] */
    fun replace(
        params: GroupReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Group

    /** A view of [GroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/group`, but is otherwise the same as
         * [GroupService.create].
         */
        @MustBeClosed
        fun create(params: GroupCreateParams): HttpResponseFor<Group> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Group>

        /**
         * Returns a raw HTTP response for `get /v1/group/{group_id}`, but is otherwise the same as
         * [GroupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(groupId: String): HttpResponseFor<Group> =
            retrieve(groupId, GroupRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            groupId: String,
            params: GroupRetrieveParams = GroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Group> =
            retrieve(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            groupId: String,
            params: GroupRetrieveParams = GroupRetrieveParams.none(),
        ): HttpResponseFor<Group> = retrieve(groupId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: GroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Group>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: GroupRetrieveParams): HttpResponseFor<Group> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(groupId: String, requestOptions: RequestOptions): HttpResponseFor<Group> =
            retrieve(groupId, GroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/group/{group_id}`, but is otherwise the same
         * as [GroupService.update].
         */
        @MustBeClosed
        fun update(groupId: String): HttpResponseFor<Group> =
            update(groupId, GroupUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            groupId: String,
            params: GroupUpdateParams = GroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Group> =
            update(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            groupId: String,
            params: GroupUpdateParams = GroupUpdateParams.none(),
        ): HttpResponseFor<Group> = update(groupId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: GroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Group>

        /** @see [update] */
        @MustBeClosed
        fun update(params: GroupUpdateParams): HttpResponseFor<Group> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(groupId: String, requestOptions: RequestOptions): HttpResponseFor<Group> =
            update(groupId, GroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/group`, but is otherwise the same as
         * [GroupService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<GroupListPage> = list(GroupListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: GroupListParams = GroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GroupListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: GroupListParams = GroupListParams.none()): HttpResponseFor<GroupListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<GroupListPage> =
            list(GroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/group/{group_id}`, but is otherwise the same
         * as [GroupService.delete].
         */
        @MustBeClosed
        fun delete(groupId: String): HttpResponseFor<Group> =
            delete(groupId, GroupDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            groupId: String,
            params: GroupDeleteParams = GroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Group> =
            delete(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            groupId: String,
            params: GroupDeleteParams = GroupDeleteParams.none(),
        ): HttpResponseFor<Group> = delete(groupId, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: GroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Group>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: GroupDeleteParams): HttpResponseFor<Group> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(groupId: String, requestOptions: RequestOptions): HttpResponseFor<Group> =
            delete(groupId, GroupDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/group`, but is otherwise the same as
         * [GroupService.replace].
         */
        @MustBeClosed
        fun replace(params: GroupReplaceParams): HttpResponseFor<Group> =
            replace(params, RequestOptions.none())

        /** @see [replace] */
        @MustBeClosed
        fun replace(
            params: GroupReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Group>
    }
}
