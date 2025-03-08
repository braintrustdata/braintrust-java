// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services.blocking

import com.braintrustdata.api.core.RequestOptions
import com.braintrustdata.api.core.http.HttpResponseFor
import com.braintrustdata.api.models.EvalCreateParams
import com.braintrustdata.api.models.SummarizeExperimentResponse
import com.google.errorprone.annotations.MustBeClosed

interface EvalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Launch an evaluation. This is the API-equivalent of the `Eval` function that is built into
     * the Braintrust SDK. In the Eval API, you provide pointers to a dataset, task function, and
     * scoring functions. The API will then run the evaluation, create an experiment, and return the
     * results along with a link to the experiment. To learn more about evals, see the
     * [Evals guide](https://www.braintrust.dev/docs/guides/evals).
     */
    fun create(params: EvalCreateParams): SummarizeExperimentResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: EvalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SummarizeExperimentResponse

    /** A view of [EvalService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/eval`, but is otherwise the same as
         * [EvalService.create].
         */
        @MustBeClosed
        fun create(params: EvalCreateParams): HttpResponseFor<SummarizeExperimentResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: EvalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SummarizeExperimentResponse>
    }
}
