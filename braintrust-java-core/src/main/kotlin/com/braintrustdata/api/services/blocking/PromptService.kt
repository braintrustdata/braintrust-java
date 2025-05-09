// File generated from our OpenAPI spec by Stainless.

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
    fun create(params: PromptCreateParams): Prompt = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PromptCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Prompt

    /** Get a prompt object by its id */
    fun retrieve(promptId: String): Prompt = retrieve(promptId, PromptRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        promptId: String,
        params: PromptRetrieveParams = PromptRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Prompt = retrieve(params.toBuilder().promptId(promptId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        promptId: String,
        params: PromptRetrieveParams = PromptRetrieveParams.none(),
    ): Prompt = retrieve(promptId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PromptRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Prompt

    /** @see [retrieve] */
    fun retrieve(params: PromptRetrieveParams): Prompt = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(promptId: String, requestOptions: RequestOptions): Prompt =
        retrieve(promptId, PromptRetrieveParams.none(), requestOptions)

    /**
     * Partially update a prompt object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    fun update(promptId: String): Prompt = update(promptId, PromptUpdateParams.none())

    /** @see [update] */
    fun update(
        promptId: String,
        params: PromptUpdateParams = PromptUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Prompt = update(params.toBuilder().promptId(promptId).build(), requestOptions)

    /** @see [update] */
    fun update(promptId: String, params: PromptUpdateParams = PromptUpdateParams.none()): Prompt =
        update(promptId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PromptUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Prompt

    /** @see [update] */
    fun update(params: PromptUpdateParams): Prompt = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(promptId: String, requestOptions: RequestOptions): Prompt =
        update(promptId, PromptUpdateParams.none(), requestOptions)

    /**
     * List out all prompts. The prompts are sorted by creation date, with the most recently-created
     * prompts coming first
     */
    fun list(): PromptListPage = list(PromptListParams.none())

    /** @see [list] */
    fun list(
        params: PromptListParams = PromptListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptListPage

    /** @see [list] */
    fun list(params: PromptListParams = PromptListParams.none()): PromptListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PromptListPage =
        list(PromptListParams.none(), requestOptions)

    /** Delete a prompt object by its id */
    fun delete(promptId: String): Prompt = delete(promptId, PromptDeleteParams.none())

    /** @see [delete] */
    fun delete(
        promptId: String,
        params: PromptDeleteParams = PromptDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Prompt = delete(params.toBuilder().promptId(promptId).build(), requestOptions)

    /** @see [delete] */
    fun delete(promptId: String, params: PromptDeleteParams = PromptDeleteParams.none()): Prompt =
        delete(promptId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PromptDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Prompt

    /** @see [delete] */
    fun delete(params: PromptDeleteParams): Prompt = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(promptId: String, requestOptions: RequestOptions): Prompt =
        delete(promptId, PromptDeleteParams.none(), requestOptions)

    /**
     * Create or replace prompt. If there is an existing prompt in the project with the same slug as
     * the one specified in the request, will replace the existing prompt with the provided fields
     */
    fun replace(params: PromptReplaceParams): Prompt = replace(params, RequestOptions.none())

    /** @see [replace] */
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
        @MustBeClosed
        fun create(params: PromptCreateParams): HttpResponseFor<Prompt> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PromptCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Prompt>

        /**
         * Returns a raw HTTP response for `get /v1/prompt/{prompt_id}`, but is otherwise the same
         * as [PromptService.retrieve].
         */
        @MustBeClosed
        fun retrieve(promptId: String): HttpResponseFor<Prompt> =
            retrieve(promptId, PromptRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            promptId: String,
            params: PromptRetrieveParams = PromptRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Prompt> =
            retrieve(params.toBuilder().promptId(promptId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            promptId: String,
            params: PromptRetrieveParams = PromptRetrieveParams.none(),
        ): HttpResponseFor<Prompt> = retrieve(promptId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PromptRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Prompt>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: PromptRetrieveParams): HttpResponseFor<Prompt> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(promptId: String, requestOptions: RequestOptions): HttpResponseFor<Prompt> =
            retrieve(promptId, PromptRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/prompt/{prompt_id}`, but is otherwise the same
         * as [PromptService.update].
         */
        @MustBeClosed
        fun update(promptId: String): HttpResponseFor<Prompt> =
            update(promptId, PromptUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            promptId: String,
            params: PromptUpdateParams = PromptUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Prompt> =
            update(params.toBuilder().promptId(promptId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            promptId: String,
            params: PromptUpdateParams = PromptUpdateParams.none(),
        ): HttpResponseFor<Prompt> = update(promptId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PromptUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Prompt>

        /** @see [update] */
        @MustBeClosed
        fun update(params: PromptUpdateParams): HttpResponseFor<Prompt> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(promptId: String, requestOptions: RequestOptions): HttpResponseFor<Prompt> =
            update(promptId, PromptUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/prompt`, but is otherwise the same as
         * [PromptService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<PromptListPage> = list(PromptListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PromptListParams = PromptListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PromptListParams = PromptListParams.none()
        ): HttpResponseFor<PromptListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PromptListPage> =
            list(PromptListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/prompt/{prompt_id}`, but is otherwise the
         * same as [PromptService.delete].
         */
        @MustBeClosed
        fun delete(promptId: String): HttpResponseFor<Prompt> =
            delete(promptId, PromptDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            promptId: String,
            params: PromptDeleteParams = PromptDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Prompt> =
            delete(params.toBuilder().promptId(promptId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            promptId: String,
            params: PromptDeleteParams = PromptDeleteParams.none(),
        ): HttpResponseFor<Prompt> = delete(promptId, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: PromptDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Prompt>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: PromptDeleteParams): HttpResponseFor<Prompt> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(promptId: String, requestOptions: RequestOptions): HttpResponseFor<Prompt> =
            delete(promptId, PromptDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/prompt`, but is otherwise the same as
         * [PromptService.replace].
         */
        @MustBeClosed
        fun replace(params: PromptReplaceParams): HttpResponseFor<Prompt> =
            replace(params, RequestOptions.none())

        /** @see [replace] */
        @MustBeClosed
        fun replace(
            params: PromptReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Prompt>
    }
}
