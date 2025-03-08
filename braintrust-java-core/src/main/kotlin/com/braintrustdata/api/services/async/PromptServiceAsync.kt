// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.async

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.Prompt
import com.braintrustdata.api.models.PromptCreateParams
import com.braintrustdata.api.models.PromptDeleteParams
import com.braintrustdata.api.models.PromptListPageAsync
import com.braintrustdata.api.models.PromptListParams
import com.braintrustdata.api.models.PromptReplaceParams
import com.braintrustdata.api.models.PromptRetrieveParams
import com.braintrustdata.api.models.PromptUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface PromptServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new prompt. If there is an existing prompt in the project with the same slug as the
     * one specified in the request, will return the existing prompt unmodified
     */
    fun create(params: PromptCreateParams): CompletableFuture<Prompt> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PromptCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Prompt>

    /** Get a prompt object by its id */
    fun retrieve(params: PromptRetrieveParams): CompletableFuture<Prompt> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PromptRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Prompt>

    /**
     * Partially update a prompt object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    fun update(params: PromptUpdateParams): CompletableFuture<Prompt> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PromptUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Prompt>

    /**
     * List out all prompts. The prompts are sorted by creation date, with the most recently-created
     * prompts coming first
     */
    fun list(): CompletableFuture<PromptListPageAsync> = list(PromptListParams.none())

    /** @see [list] */
    fun list(
        params: PromptListParams = PromptListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptListPageAsync>

    /** @see [list] */
    fun list(
        params: PromptListParams = PromptListParams.none()
    ): CompletableFuture<PromptListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<PromptListPageAsync> =
        list(PromptListParams.none(), requestOptions)

    /** Delete a prompt object by its id */
    fun delete(params: PromptDeleteParams): CompletableFuture<Prompt> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PromptDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Prompt>

    /**
     * Create or replace prompt. If there is an existing prompt in the project with the same slug as
     * the one specified in the request, will replace the existing prompt with the provided fields
     */
    fun replace(params: PromptReplaceParams): CompletableFuture<Prompt> =
        replace(params, RequestOptions.none())

    /** @see [replace] */
    fun replace(
        params: PromptReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Prompt>

    /**
     * A view of [PromptServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/prompt`, but is otherwise the same as
         * [PromptServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: PromptCreateParams): CompletableFuture<HttpResponseFor<Prompt>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PromptCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Prompt>>

        /**
         * Returns a raw HTTP response for `get /v1/prompt/{prompt_id}`, but is otherwise the same
         * as [PromptServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: PromptRetrieveParams): CompletableFuture<HttpResponseFor<Prompt>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PromptRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Prompt>>

        /**
         * Returns a raw HTTP response for `patch /v1/prompt/{prompt_id}`, but is otherwise the same
         * as [PromptServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: PromptUpdateParams): CompletableFuture<HttpResponseFor<Prompt>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PromptUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Prompt>>

        /**
         * Returns a raw HTTP response for `get /v1/prompt`, but is otherwise the same as
         * [PromptServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<PromptListPageAsync>> =
            list(PromptListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PromptListParams = PromptListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PromptListParams = PromptListParams.none()
        ): CompletableFuture<HttpResponseFor<PromptListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PromptListPageAsync>> =
            list(PromptListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/prompt/{prompt_id}`, but is otherwise the
         * same as [PromptServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: PromptDeleteParams): CompletableFuture<HttpResponseFor<Prompt>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: PromptDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Prompt>>

        /**
         * Returns a raw HTTP response for `put /v1/prompt`, but is otherwise the same as
         * [PromptServiceAsync.replace].
         */
        @MustBeClosed
        fun replace(params: PromptReplaceParams): CompletableFuture<HttpResponseFor<Prompt>> =
            replace(params, RequestOptions.none())

        /** @see [replace] */
        @MustBeClosed
        fun replace(
            params: PromptReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Prompt>>
    }
}
