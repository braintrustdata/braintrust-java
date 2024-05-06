// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrust.api.services.blocking

import com.braintrust.api.core.RequestOptions
import com.braintrust.api.models.PromptCreateParams
import com.braintrust.api.models.PromptCreateResponse
import com.braintrust.api.models.PromptDeleteParams
import com.braintrust.api.models.PromptDeleteResponse
import com.braintrust.api.models.PromptFeedbackParams
import com.braintrust.api.models.PromptListPage
import com.braintrust.api.models.PromptListParams
import com.braintrust.api.models.PromptReplaceParams
import com.braintrust.api.models.PromptReplaceResponse
import com.braintrust.api.models.PromptRetrieveParams
import com.braintrust.api.models.PromptRetrieveResponse
import com.braintrust.api.models.PromptUpdateParams
import com.braintrust.api.models.PromptUpdateResponse

interface PromptService {

    /**
     * Create a new prompt. If there is an existing prompt in the project with the same slug as the
     * one specified in the request, will return the existing prompt unmodified
     */
    @JvmOverloads
    fun create(
        params: PromptCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PromptCreateResponse

    /** Get a prompt object by its id */
    @JvmOverloads
    fun retrieve(
        params: PromptRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PromptRetrieveResponse

    /**
     * Partially update a prompt object. Specify the fields to update in the payload. Any
     * object-type fields will be deep-merged with existing content. Currently we do not support
     * removing fields or setting them to null.
     */
    @JvmOverloads
    fun update(
        params: PromptUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PromptUpdateResponse

    /**
     * List out all prompts. The prompts are sorted by creation date, with the most recently-created
     * prompts coming first
     */
    @JvmOverloads
    fun list(
        params: PromptListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PromptListPage

    /** Delete a prompt object by its id */
    @JvmOverloads
    fun delete(
        params: PromptDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PromptDeleteResponse

    /** Log feedback for a set of prompt events */
    @JvmOverloads
    fun feedback(
        params: PromptFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    /**
     * NOTE: This operation is deprecated and will be removed in a future revision of the API.
     * Create or replace a new prompt. If there is an existing prompt in the project with the same
     * slug as the one specified in the request, will return the existing prompt unmodified, will
     * replace the existing prompt with the provided fields
     */
    @JvmOverloads
    fun replace(
        params: PromptReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PromptReplaceResponse
}
