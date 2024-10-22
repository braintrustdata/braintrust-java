// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.models.*
import java.util.Objects
import java.util.Optional

class ExperimentSummarizeParams
constructor(
    private val experimentId: String,
    private val comparisonExperimentId: String?,
    private val summarizeScores: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun experimentId(): String = experimentId

    fun comparisonExperimentId(): Optional<String> = Optional.ofNullable(comparisonExperimentId)

    fun summarizeScores(): Optional<Boolean> = Optional.ofNullable(summarizeScores)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.comparisonExperimentId?.let {
            params.put("comparison_experiment_id", listOf(it.toString()))
        }
        this.summarizeScores?.let { params.put("summarize_scores", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> experimentId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExperimentSummarizeParams && this.experimentId == other.experimentId && this.comparisonExperimentId == other.comparisonExperimentId && this.summarizeScores == other.summarizeScores && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(experimentId, comparisonExperimentId, summarizeScores, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "ExperimentSummarizeParams{experimentId=$experimentId, comparisonExperimentId=$comparisonExperimentId, summarizeScores=$summarizeScores, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var experimentId: String? = null
        private var comparisonExperimentId: String? = null
        private var summarizeScores: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(experimentSummarizeParams: ExperimentSummarizeParams) = apply {
            this.experimentId = experimentSummarizeParams.experimentId
            this.comparisonExperimentId = experimentSummarizeParams.comparisonExperimentId
            this.summarizeScores = experimentSummarizeParams.summarizeScores
            additionalQueryParams(experimentSummarizeParams.additionalQueryParams)
            additionalHeaders(experimentSummarizeParams.additionalHeaders)
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

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): ExperimentSummarizeParams =
            ExperimentSummarizeParams(
                checkNotNull(experimentId) { "`experimentId` is required but was not set" },
                comparisonExperimentId,
                summarizeScores,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
