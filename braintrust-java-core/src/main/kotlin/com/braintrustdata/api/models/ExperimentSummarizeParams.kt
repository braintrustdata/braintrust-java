// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.models.*
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import java.util.Objects
import java.util.Optional

class ExperimentSummarizeParams
constructor(
    private val experimentId: String,
    private val comparisonExperimentId: String?,
    private val summarizeScores: Boolean?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
) {

    fun experimentId(): String = experimentId

    fun comparisonExperimentId(): Optional<String> = Optional.ofNullable(comparisonExperimentId)

    fun summarizeScores(): Optional<Boolean> = Optional.ofNullable(summarizeScores)

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.comparisonExperimentId?.let {
            params.put("comparison_experiment_id", listOf(it.toString()))
        }
        this.summarizeScores?.let { params.put("summarize_scores", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> experimentId
            else -> ""
        }
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExperimentSummarizeParams && this.experimentId == other.experimentId && this.comparisonExperimentId == other.comparisonExperimentId && this.summarizeScores == other.summarizeScores && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(experimentId, comparisonExperimentId, summarizeScores, additionalHeaders, additionalQueryParams) /* spotless:on */
    }

    override fun toString() =
        "ExperimentSummarizeParams{experimentId=$experimentId, comparisonExperimentId=$comparisonExperimentId, summarizeScores=$summarizeScores, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var experimentId: String? = null
        private var comparisonExperimentId: String? = null
        private var summarizeScores: Boolean? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()

        @JvmSynthetic
        internal fun from(experimentSummarizeParams: ExperimentSummarizeParams) = apply {
            this.experimentId = experimentSummarizeParams.experimentId
            this.comparisonExperimentId = experimentSummarizeParams.comparisonExperimentId
            this.summarizeScores = experimentSummarizeParams.summarizeScores
            additionalHeaders(experimentSummarizeParams.additionalHeaders)
            additionalQueryParams(experimentSummarizeParams.additionalQueryParams)
        }

        /** Experiment id */
        fun experimentId(experimentId: String) = apply { this.experimentId = experimentId }

        /**
         * The experiment to compare against, if summarizing scores and metrics. If omitted, will
         * fall back to the `base_exp_id` stored in the experiment metadata, and then to the most
         * recent experiment run in the same project. Must pass `summarize_scores=true` for this id
         * to be used
         */
        fun comparisonExperimentId(comparisonExperimentId: String) = apply {
            this.comparisonExperimentId = comparisonExperimentId
        }

        /**
         * Whether to summarize the scores and metrics. If false (or omitted), only the metadata
         * will be returned.
         */
        fun summarizeScores(summarizeScores: Boolean) = apply {
            this.summarizeScores = summarizeScores
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

        fun build(): ExperimentSummarizeParams =
            ExperimentSummarizeParams(
                checkNotNull(experimentId) { "`experimentId` is required but was not set" },
                comparisonExperimentId,
                summarizeScores,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
            )
    }
}
