// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.AISecret
import com.braintrustdata.api.models.AiSecretCreateParams
import com.braintrustdata.api.models.AiSecretDeleteParams
import com.braintrustdata.api.models.AiSecretFindAndDeleteParams
import com.braintrustdata.api.models.AiSecretListPage
import com.braintrustdata.api.models.AiSecretListParams
import com.braintrustdata.api.models.AiSecretReplaceParams
import com.braintrustdata.api.models.AiSecretRetrieveParams
import com.braintrustdata.api.models.AiSecretUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface AiSecretService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new ai_secret. If there is an existing ai_secret with the same name as
     * the one specified in the request, will return the existing ai_secret unmodified
     */
    fun create(params: AiSecretCreateParams): AISecret =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: AiSecretCreateParams, requestOptions: RequestOptions = RequestOptions.none()): AISecret

    /** Get an ai_secret object by its id */
    fun retrieve(params: AiSecretRetrieveParams): AISecret =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: AiSecretRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): AISecret

    /**
     * Partially update an ai_secret object. Specify the fields to update in the
     * payload. Any object-type fields will be deep-merged with existing content.
     * Currently we do not support removing fields or setting them to null.
     */
    fun update(params: AiSecretUpdateParams): AISecret =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(params: AiSecretUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): AISecret

    /**
     * List out all ai_secrets. The ai_secrets are sorted by creation date, with the
     * most recently-created ai_secrets coming first
     */
    fun list(): AiSecretListPage = list(AiSecretListParams.none())

    /** @see [list] */
    fun list(params: AiSecretListParams = AiSecretListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AiSecretListPage

    /** @see [list] */
    fun list(params: AiSecretListParams = AiSecretListParams.none()): AiSecretListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): AiSecretListPage = list(AiSecretListParams.none(), requestOptions)

    /** Delete an ai_secret object by its id */
    fun delete(params: AiSecretDeleteParams): AISecret =
        delete(
          params, RequestOptions.none()
        )

    /** @see [delete] */
    fun delete(params: AiSecretDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): AISecret

    /** Delete a single ai_secret */
    fun findAndDelete(params: AiSecretFindAndDeleteParams): AISecret =
        findAndDelete(
          params, RequestOptions.none()
        )

    /** @see [findAndDelete] */
    fun findAndDelete(params: AiSecretFindAndDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): AISecret

    /**
     * Create or replace ai_secret. If there is an existing ai_secret with the same
     * name as the one specified in the request, will replace the existing ai_secret
     * with the provided fields
     */
    fun replace(params: AiSecretReplaceParams): AISecret =
        replace(
          params, RequestOptions.none()
        )

    /** @see [replace] */
    fun replace(params: AiSecretReplaceParams, requestOptions: RequestOptions = RequestOptions.none()): AISecret

    /**
     * A view of [AiSecretService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/ai_secret`, but is otherwise the same
         * as [AiSecretService.create].
         */
        @MustBeClosed
        fun create(params: AiSecretCreateParams): HttpResponseFor<AISecret> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: AiSecretCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AISecret>

        /**
         * Returns a raw HTTP response for `get /v1/ai_secret/{ai_secret_id}`, but is
         * otherwise the same as [AiSecretService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: AiSecretRetrieveParams): HttpResponseFor<AISecret> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: AiSecretRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AISecret>

        /**
         * Returns a raw HTTP response for `patch /v1/ai_secret/{ai_secret_id}`, but is
         * otherwise the same as [AiSecretService.update].
         */
        @MustBeClosed
        fun update(params: AiSecretUpdateParams): HttpResponseFor<AISecret> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: AiSecretUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AISecret>

        /**
         * Returns a raw HTTP response for `get /v1/ai_secret`, but is otherwise the same
         * as [AiSecretService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AiSecretListPage> = list(AiSecretListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: AiSecretListParams = AiSecretListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AiSecretListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: AiSecretListParams = AiSecretListParams.none()): HttpResponseFor<AiSecretListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AiSecretListPage> = list(AiSecretListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/ai_secret/{ai_secret_id}`, but is
         * otherwise the same as [AiSecretService.delete].
         */
        @MustBeClosed
        fun delete(params: AiSecretDeleteParams): HttpResponseFor<AISecret> =
            delete(
              params, RequestOptions.none()
            )

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: AiSecretDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AISecret>

        /**
         * Returns a raw HTTP response for `delete /v1/ai_secret`, but is otherwise the
         * same as [AiSecretService.findAndDelete].
         */
        @MustBeClosed
        fun findAndDelete(params: AiSecretFindAndDeleteParams): HttpResponseFor<AISecret> =
            findAndDelete(
              params, RequestOptions.none()
            )

        /** @see [findAndDelete] */
        @MustBeClosed
        fun findAndDelete(params: AiSecretFindAndDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AISecret>

        /**
         * Returns a raw HTTP response for `put /v1/ai_secret`, but is otherwise the same
         * as [AiSecretService.replace].
         */
        @MustBeClosed
        fun replace(params: AiSecretReplaceParams): HttpResponseFor<AISecret> =
            replace(
              params, RequestOptions.none()
            )

        /** @see [replace] */
        @MustBeClosed
        fun replace(params: AiSecretReplaceParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AISecret>
    }
}
