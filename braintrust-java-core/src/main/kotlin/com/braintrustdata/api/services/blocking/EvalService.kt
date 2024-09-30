// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.models.EvalCreateParams
import com.braintrustdata.api.models.SummarizeExperimentResponse

interface EvalService {

    /**
     * Launch an evaluation. This is the API-equivalent of the `Eval` function that is built into
     * the Braintrust SDK. In the Eval API, you provide pointers to a dataset, task function, and
     * scoring functions. The API will then run the evaluation, create an experiment, and return the
     * results along with a link to the experiment. To learn more about evals, see the
     * [Evals guide](https://www.braintrust.dev/docs/guides/evals).
     */
    @JvmOverloads
    fun create(
        params: EvalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SummarizeExperimentResponse
}
