// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.Prompt
import com.braintrustdata.api.models.PromptCreateParams
import com.braintrustdata.api.models.PromptDeleteParams
import com.braintrustdata.api.models.PromptListPage
import com.braintrustdata.api.models.PromptListParams
import com.braintrustdata.api.models.PromptReplaceParams
import com.braintrustdata.api.models.PromptRetrieveParams
import com.braintrustdata.api.models.PromptUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface PromptService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new prompt. If there is an existing prompt in the project with the same slug as the
     * one specified in the request, will return the existing prompt unmodified
     */
    @JvmOverloads
    fun create(
        params: PromptCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Prompt

    /** Get a prompt object by its id */
    @JvmOverloads
    fun retrieve(
        params: PromptRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Prompt

    /**
     * Partially update a prompt object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(
        params: PromptUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Prompt

    /**
     * List out all prompts. The prompts are sorted by creation date, with the most recently-created
     * prompts coming first
     */
    @JvmOverloads
    fun list(
        params: PromptListParams = PromptListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptListPage

    /**
     * List out all prompts. The prompts are sorted by creation date, with the most recently-created
     * prompts coming first
     */
    fun list(requestOptions: RequestOptions): PromptListPage =
        list(PromptListParams.none(), requestOptions)

    /** Delete a prompt object by its id */
    @JvmOverloads
    fun delete(
        params: PromptDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Prompt

    /**
     * Create or replace prompt. If there is an existing prompt in the project with the same slug as
     * the one specified in the request, will replace the existing prompt with the provided fields
     */
    @JvmOverloads
    fun replace(
        params: PromptReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Prompt

    /** A view of [PromptService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/prompt`, but is otherwise the same as
         * [PromptService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: PromptCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Prompt>

        /**
         * Returns a raw HTTP response for `get /v1/prompt/{prompt_id}`, but is otherwise the same
         * as [PromptService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: PromptRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Prompt>

        /**
         * Returns a raw HTTP response for `patch /v1/prompt/{prompt_id}`, but is otherwise the same
         * as [PromptService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: PromptUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Prompt>

        /**
         * Returns a raw HTTP response for `get /v1/prompt`, but is otherwise the same as
         * [PromptService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: PromptListParams = PromptListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptListPage>

        /**
         * Returns a raw HTTP response for `get /v1/prompt`, but is otherwise the same as
         * [PromptService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PromptListPage> =
            list(PromptListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/prompt/{prompt_id}`, but is otherwise the
         * same as [PromptService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: PromptDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Prompt>

        /**
         * Returns a raw HTTP response for `put /v1/prompt`, but is otherwise the same as
         * [PromptService.replace].
         */
        @JvmOverloads
        @MustBeClosed
        fun replace(
            params: PromptReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Prompt>
    }
}
