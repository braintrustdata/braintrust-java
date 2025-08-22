// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Summarize experiment */
class ExperimentSummarizeParams
private constructor(
    private val experimentId: String?,
    private val comparisonExperimentId: String?,
    private val summarizeScores: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Experiment id */
    fun experimentId(): Optional<String> = Optional.ofNullable(experimentId)

    /**
     * The experiment to compare against, if summarizing scores and metrics. If omitted, will fall
     * back to the `base_exp_id` stored in the experiment metadata, and then to the most recent
     * experiment run in the same project. Must pass `summarize_scores=true` for this id to be used
     */
    fun comparisonExperimentId(): Optional<String> = Optional.ofNullable(comparisonExperimentId)

    /**
     * Whether to summarize the scores and metrics. If false (or omitted), only the metadata will be
     * returned.
     */
    fun summarizeScores(): Optional<Boolean> = Optional.ofNullable(summarizeScores)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ExperimentSummarizeParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ExperimentSummarizeParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExperimentSummarizeParams]. */
    class Builder internal constructor() {

        private var experimentId: String? = null
        private var comparisonExperimentId: String? = null
        private var summarizeScores: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(experimentSummarizeParams: ExperimentSummarizeParams) = apply {
            experimentId = experimentSummarizeParams.experimentId
            comparisonExperimentId = experimentSummarizeParams.comparisonExperimentId
            summarizeScores = experimentSummarizeParams.summarizeScores
            additionalHeaders = experimentSummarizeParams.additionalHeaders.toBuilder()
            additionalQueryParams = experimentSummarizeParams.additionalQueryParams.toBuilder()
        }

        /** Experiment id */
        fun experimentId(experimentId: String?) = apply { this.experimentId = experimentId }

        /** Alias for calling [Builder.experimentId] with `experimentId.orElse(null)`. */
        fun experimentId(experimentId: Optional<String>) = experimentId(experimentId.getOrNull())

        /**
         * The experiment to compare against, if summarizing scores and metrics. If omitted, will
         * fall back to the `base_exp_id` stored in the experiment metadata, and then to the most
         * recent experiment run in the same project. Must pass `summarize_scores=true` for this id
         * to be used
         */
        fun comparisonExperimentId(comparisonExperimentId: String?) = apply {
            this.comparisonExperimentId = comparisonExperimentId
        }

        /**
         * Alias for calling [Builder.comparisonExperimentId] with
         * `comparisonExperimentId.orElse(null)`.
         */
        fun comparisonExperimentId(comparisonExperimentId: Optional<String>) =
            comparisonExperimentId(comparisonExperimentId.getOrNull())

        /**
         * Whether to summarize the scores and metrics. If false (or omitted), only the metadata
         * will be returned.
         */
        fun summarizeScores(summarizeScores: Boolean?) = apply {
            this.summarizeScores = summarizeScores
        }

        /**
         * Alias for [Builder.summarizeScores].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun summarizeScores(summarizeScores: Boolean) = summarizeScores(summarizeScores as Boolean?)

        /** Alias for calling [Builder.summarizeScores] with `summarizeScores.orElse(null)`. */
        fun summarizeScores(summarizeScores: Optional<Boolean>) =
            summarizeScores(summarizeScores.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ExperimentSummarizeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExperimentSummarizeParams =
            ExperimentSummarizeParams(
                experimentId,
                comparisonExperimentId,
                summarizeScores,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> experimentId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                comparisonExperimentId?.let { put("comparison_experiment_id", it) }
                summarizeScores?.let { put("summarize_scores", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExperimentSummarizeParams &&
            experimentId == other.experimentId &&
            comparisonExperimentId == other.comparisonExperimentId &&
            summarizeScores == other.summarizeScores &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            experimentId,
            comparisonExperimentId,
            summarizeScores,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ExperimentSummarizeParams{experimentId=$experimentId, comparisonExperimentId=$comparisonExperimentId, summarizeScores=$summarizeScores, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
