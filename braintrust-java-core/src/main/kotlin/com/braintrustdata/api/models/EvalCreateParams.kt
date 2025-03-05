// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional

/**
 * Launch an evaluation. This is the API-equivalent of the `Eval` function that is built into the
 * Braintrust SDK. In the Eval API, you provide pointers to a dataset, task function, and scoring
 * functions. The API will then run the evaluation, create an experiment, and return the results
 * along with a link to the experiment. To learn more about evals, see the
 * [Evals guide](https://www.braintrust.dev/docs/guides/evals).
 */
class EvalCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The dataset to use */
    fun data(): Data = body.data()

    /** Unique identifier for the project to run the eval in */
    fun projectId(): String = body.projectId()

    /** The functions to score the eval on */
    fun scores(): List<Score> = body.scores()

    /** The function to evaluate */
    fun task(): Task = body.task()

    /**
     * An optional experiment id to use as a base. If specified, the new experiment will be
     * summarized and compared to this experiment.
     */
    fun baseExperimentId(): Optional<String> = body.baseExperimentId()

    /**
     * An optional experiment name to use as a base. If specified, the new experiment will be
     * summarized and compared to this experiment.
     */
    fun baseExperimentName(): Optional<String> = body.baseExperimentName()

    /**
     * An optional name for the experiment created by this eval. If it conflicts with an existing
     * experiment, it will be suffixed with a unique identifier.
     */
    fun experimentName(): Optional<String> = body.experimentName()

    /**
     * Optional settings for collecting git metadata. By default, will collect all git metadata
     * fields allowed in org-level settings.
     */
    fun gitMetadataSettings(): Optional<GitMetadataSettings> = body.gitMetadataSettings()

    /** Whether the experiment should be public. Defaults to false. */
    fun isPublic(): Optional<Boolean> = body.isPublic()

    /**
     * The maximum number of tasks/scorers that will be run concurrently. Defaults to undefined, in
     * which case there is no max concurrency.
     */
    fun maxConcurrency(): Optional<Double> = body.maxConcurrency()

    /**
     * Optional experiment-level metadata to store about the evaluation. You can later use this to
     * slice & dice across experiments.
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /** Metadata about the state of the repo when the experiment was created */
    fun repoInfo(): Optional<RepoInfo> = body.repoInfo()

    /**
     * Whether to stream the results of the eval. If true, the request will return two events: one
     * to indicate the experiment has started, and another upon completion. If false, the request
     * will return the evaluation's summary upon completion.
     */
    fun stream(): Optional<Boolean> = body.stream()

    /**
     * The maximum duration, in milliseconds, to run the evaluation. Defaults to undefined, in which
     * case there is no timeout.
     */
    fun timeout(): Optional<Double> = body.timeout()

    /**
     * The number of times to run the evaluator per input. This is useful for evaluating
     * applications that have non-deterministic behavior and gives you both a stronger aggregate
     * measure and a sense of the variance in the results.
     */
    fun trialCount(): Optional<Double> = body.trialCount()

    /** The dataset to use */
    fun _data(): JsonField<Data> = body._data()

    /** Unique identifier for the project to run the eval in */
    fun _projectId(): JsonField<String> = body._projectId()

    /** The functions to score the eval on */
    fun _scores(): JsonField<List<Score>> = body._scores()

    /** The function to evaluate */
    fun _task(): JsonField<Task> = body._task()

    /**
     * An optional experiment id to use as a base. If specified, the new experiment will be
     * summarized and compared to this experiment.
     */
    fun _baseExperimentId(): JsonField<String> = body._baseExperimentId()

    /**
     * An optional experiment name to use as a base. If specified, the new experiment will be
     * summarized and compared to this experiment.
     */
    fun _baseExperimentName(): JsonField<String> = body._baseExperimentName()

    /**
     * An optional name for the experiment created by this eval. If it conflicts with an existing
     * experiment, it will be suffixed with a unique identifier.
     */
    fun _experimentName(): JsonField<String> = body._experimentName()

    /**
     * Optional settings for collecting git metadata. By default, will collect all git metadata
     * fields allowed in org-level settings.
     */
    fun _gitMetadataSettings(): JsonField<GitMetadataSettings> = body._gitMetadataSettings()

    /** Whether the experiment should be public. Defaults to false. */
    fun _isPublic(): JsonField<Boolean> = body._isPublic()

    /**
     * The maximum number of tasks/scorers that will be run concurrently. Defaults to undefined, in
     * which case there is no max concurrency.
     */
    fun _maxConcurrency(): JsonField<Double> = body._maxConcurrency()

    /**
     * Optional experiment-level metadata to store about the evaluation. You can later use this to
     * slice & dice across experiments.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /** Metadata about the state of the repo when the experiment was created */
    fun _repoInfo(): JsonField<RepoInfo> = body._repoInfo()

    /**
     * Whether to stream the results of the eval. If true, the request will return two events: one
     * to indicate the experiment has started, and another upon completion. If false, the request
     * will return the evaluation's summary upon completion.
     */
    fun _stream(): JsonField<Boolean> = body._stream()

    /**
     * The maximum duration, in milliseconds, to run the evaluation. Defaults to undefined, in which
     * case there is no timeout.
     */
    fun _timeout(): JsonField<Double> = body._timeout()

    /**
     * The number of times to run the evaluator per input. This is useful for evaluating
     * applications that have non-deterministic behavior and gives you both a stronger aggregate
     * measure and a sense of the variance in the results.
     */
    fun _trialCount(): JsonField<Double> = body._trialCount()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("project_id")
        @ExcludeMissing
        private val projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scores")
        @ExcludeMissing
        private val scores: JsonField<List<Score>> = JsonMissing.of(),
        @JsonProperty("task") @ExcludeMissing private val task: JsonField<Task> = JsonMissing.of(),
        @JsonProperty("base_experiment_id")
        @ExcludeMissing
        private val baseExperimentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("base_experiment_name")
        @ExcludeMissing
        private val baseExperimentName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("experiment_name")
        @ExcludeMissing
        private val experimentName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("git_metadata_settings")
        @ExcludeMissing
        private val gitMetadataSettings: JsonField<GitMetadataSettings> = JsonMissing.of(),
        @JsonProperty("is_public")
        @ExcludeMissing
        private val isPublic: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("max_concurrency")
        @ExcludeMissing
        private val maxConcurrency: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("repo_info")
        @ExcludeMissing
        private val repoInfo: JsonField<RepoInfo> = JsonMissing.of(),
        @JsonProperty("stream")
        @ExcludeMissing
        private val stream: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("timeout")
        @ExcludeMissing
        private val timeout: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("trial_count")
        @ExcludeMissing
        private val trialCount: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The dataset to use */
        fun data(): Data = data.getRequired("data")

        /** Unique identifier for the project to run the eval in */
        fun projectId(): String = projectId.getRequired("project_id")

        /** The functions to score the eval on */
        fun scores(): List<Score> = scores.getRequired("scores")

        /** The function to evaluate */
        fun task(): Task = task.getRequired("task")

        /**
         * An optional experiment id to use as a base. If specified, the new experiment will be
         * summarized and compared to this experiment.
         */
        fun baseExperimentId(): Optional<String> =
            Optional.ofNullable(baseExperimentId.getNullable("base_experiment_id"))

        /**
         * An optional experiment name to use as a base. If specified, the new experiment will be
         * summarized and compared to this experiment.
         */
        fun baseExperimentName(): Optional<String> =
            Optional.ofNullable(baseExperimentName.getNullable("base_experiment_name"))

        /**
         * An optional name for the experiment created by this eval. If it conflicts with an
         * existing experiment, it will be suffixed with a unique identifier.
         */
        fun experimentName(): Optional<String> =
            Optional.ofNullable(experimentName.getNullable("experiment_name"))

        /**
         * Optional settings for collecting git metadata. By default, will collect all git metadata
         * fields allowed in org-level settings.
         */
        fun gitMetadataSettings(): Optional<GitMetadataSettings> =
            Optional.ofNullable(gitMetadataSettings.getNullable("git_metadata_settings"))

        /** Whether the experiment should be public. Defaults to false. */
        fun isPublic(): Optional<Boolean> = Optional.ofNullable(isPublic.getNullable("is_public"))

        /**
         * The maximum number of tasks/scorers that will be run concurrently. Defaults to undefined,
         * in which case there is no max concurrency.
         */
        fun maxConcurrency(): Optional<Double> =
            Optional.ofNullable(maxConcurrency.getNullable("max_concurrency"))

        /**
         * Optional experiment-level metadata to store about the evaluation. You can later use this
         * to slice & dice across experiments.
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /** Metadata about the state of the repo when the experiment was created */
        fun repoInfo(): Optional<RepoInfo> = Optional.ofNullable(repoInfo.getNullable("repo_info"))

        /**
         * Whether to stream the results of the eval. If true, the request will return two events:
         * one to indicate the experiment has started, and another upon completion. If false, the
         * request will return the evaluation's summary upon completion.
         */
        fun stream(): Optional<Boolean> = Optional.ofNullable(stream.getNullable("stream"))

        /**
         * The maximum duration, in milliseconds, to run the evaluation. Defaults to undefined, in
         * which case there is no timeout.
         */
        fun timeout(): Optional<Double> = Optional.ofNullable(timeout.getNullable("timeout"))

        /**
         * The number of times to run the evaluator per input. This is useful for evaluating
         * applications that have non-deterministic behavior and gives you both a stronger aggregate
         * measure and a sense of the variance in the results.
         */
        fun trialCount(): Optional<Double> =
            Optional.ofNullable(trialCount.getNullable("trial_count"))

        /** The dataset to use */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

        /** Unique identifier for the project to run the eval in */
        @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

        /** The functions to score the eval on */
        @JsonProperty("scores") @ExcludeMissing fun _scores(): JsonField<List<Score>> = scores

        /** The function to evaluate */
        @JsonProperty("task") @ExcludeMissing fun _task(): JsonField<Task> = task

        /**
         * An optional experiment id to use as a base. If specified, the new experiment will be
         * summarized and compared to this experiment.
         */
        @JsonProperty("base_experiment_id")
        @ExcludeMissing
        fun _baseExperimentId(): JsonField<String> = baseExperimentId

        /**
         * An optional experiment name to use as a base. If specified, the new experiment will be
         * summarized and compared to this experiment.
         */
        @JsonProperty("base_experiment_name")
        @ExcludeMissing
        fun _baseExperimentName(): JsonField<String> = baseExperimentName

        /**
         * An optional name for the experiment created by this eval. If it conflicts with an
         * existing experiment, it will be suffixed with a unique identifier.
         */
        @JsonProperty("experiment_name")
        @ExcludeMissing
        fun _experimentName(): JsonField<String> = experimentName

        /**
         * Optional settings for collecting git metadata. By default, will collect all git metadata
         * fields allowed in org-level settings.
         */
        @JsonProperty("git_metadata_settings")
        @ExcludeMissing
        fun _gitMetadataSettings(): JsonField<GitMetadataSettings> = gitMetadataSettings

        /** Whether the experiment should be public. Defaults to false. */
        @JsonProperty("is_public") @ExcludeMissing fun _isPublic(): JsonField<Boolean> = isPublic

        /**
         * The maximum number of tasks/scorers that will be run concurrently. Defaults to undefined,
         * in which case there is no max concurrency.
         */
        @JsonProperty("max_concurrency")
        @ExcludeMissing
        fun _maxConcurrency(): JsonField<Double> = maxConcurrency

        /**
         * Optional experiment-level metadata to store about the evaluation. You can later use this
         * to slice & dice across experiments.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /** Metadata about the state of the repo when the experiment was created */
        @JsonProperty("repo_info") @ExcludeMissing fun _repoInfo(): JsonField<RepoInfo> = repoInfo

        /**
         * Whether to stream the results of the eval. If true, the request will return two events:
         * one to indicate the experiment has started, and another upon completion. If false, the
         * request will return the evaluation's summary upon completion.
         */
        @JsonProperty("stream") @ExcludeMissing fun _stream(): JsonField<Boolean> = stream

        /**
         * The maximum duration, in milliseconds, to run the evaluation. Defaults to undefined, in
         * which case there is no timeout.
         */
        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Double> = timeout

        /**
         * The number of times to run the evaluator per input. This is useful for evaluating
         * applications that have non-deterministic behavior and gives you both a stronger aggregate
         * measure and a sense of the variance in the results.
         */
        @JsonProperty("trial_count")
        @ExcludeMissing
        fun _trialCount(): JsonField<Double> = trialCount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            data().validate()
            projectId()
            scores().forEach { it.validate() }
            task().validate()
            baseExperimentId()
            baseExperimentName()
            experimentName()
            gitMetadataSettings().ifPresent { it.validate() }
            isPublic()
            maxConcurrency()
            metadata().ifPresent { it.validate() }
            repoInfo().ifPresent { it.validate() }
            stream()
            timeout()
            trialCount()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .data()
             * .projectId()
             * .scores()
             * .task()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var data: JsonField<Data>? = null
            private var projectId: JsonField<String>? = null
            private var scores: JsonField<MutableList<Score>>? = null
            private var task: JsonField<Task>? = null
            private var baseExperimentId: JsonField<String> = JsonMissing.of()
            private var baseExperimentName: JsonField<String> = JsonMissing.of()
            private var experimentName: JsonField<String> = JsonMissing.of()
            private var gitMetadataSettings: JsonField<GitMetadataSettings> = JsonMissing.of()
            private var isPublic: JsonField<Boolean> = JsonMissing.of()
            private var maxConcurrency: JsonField<Double> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var repoInfo: JsonField<RepoInfo> = JsonMissing.of()
            private var stream: JsonField<Boolean> = JsonMissing.of()
            private var timeout: JsonField<Double> = JsonMissing.of()
            private var trialCount: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                data = body.data
                projectId = body.projectId
                scores = body.scores.map { it.toMutableList() }
                task = body.task
                baseExperimentId = body.baseExperimentId
                baseExperimentName = body.baseExperimentName
                experimentName = body.experimentName
                gitMetadataSettings = body.gitMetadataSettings
                isPublic = body.isPublic
                maxConcurrency = body.maxConcurrency
                metadata = body.metadata
                repoInfo = body.repoInfo
                stream = body.stream
                timeout = body.timeout
                trialCount = body.trialCount
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The dataset to use */
            fun data(data: Data) = data(JsonField.of(data))

            /** The dataset to use */
            fun data(data: JsonField<Data>) = apply { this.data = data }

            /** Dataset id */
            fun data(datasetId: Data.DatasetId) = data(Data.ofDatasetId(datasetId))

            /** Project and dataset name */
            fun data(projectDatasetName: Data.ProjectDatasetName) =
                data(Data.ofProjectDatasetName(projectDatasetName))

            /** Unique identifier for the project to run the eval in */
            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /** Unique identifier for the project to run the eval in */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            /** The functions to score the eval on */
            fun scores(scores: List<Score>) = scores(JsonField.of(scores))

            /** The functions to score the eval on */
            fun scores(scores: JsonField<List<Score>>) = apply {
                this.scores = scores.map { it.toMutableList() }
            }

            /** The functions to score the eval on */
            fun addScore(score: Score) = apply {
                scores =
                    (scores ?: JsonField.of(mutableListOf())).also {
                        checkKnown("scores", it).add(score)
                    }
            }

            /** Function id */
            fun addScore(functionId: Score.FunctionId) = addScore(Score.ofFunctionId(functionId))

            /** Project name and slug */
            fun addScore(projectSlug: Score.ProjectSlug) =
                addScore(Score.ofProjectSlug(projectSlug))

            /** Global function name */
            fun addScore(globalFunction: Score.GlobalFunction) =
                addScore(Score.ofGlobalFunction(globalFunction))

            /** Prompt session id */
            fun addScore(promptSessionId: Score.PromptSessionId) =
                addScore(Score.ofPromptSessionId(promptSessionId))

            /** Inline code function */
            fun addScore(inlineCode: Score.InlineCode) = addScore(Score.ofInlineCode(inlineCode))

            /** Inline prompt definition */
            fun addScore(inlinePrompt: Score.InlinePrompt) =
                addScore(Score.ofInlinePrompt(inlinePrompt))

            /** The function to evaluate */
            fun task(task: Task) = task(JsonField.of(task))

            /** The function to evaluate */
            fun task(task: JsonField<Task>) = apply { this.task = task }

            /** Function id */
            fun task(functionId: Task.FunctionId) = task(Task.ofFunctionId(functionId))

            /** Project name and slug */
            fun task(projectSlug: Task.ProjectSlug) = task(Task.ofProjectSlug(projectSlug))

            /** Global function name */
            fun task(globalFunction: Task.GlobalFunction) =
                task(Task.ofGlobalFunction(globalFunction))

            /** Prompt session id */
            fun task(promptSessionId: Task.PromptSessionId) =
                task(Task.ofPromptSessionId(promptSessionId))

            /** Inline code function */
            fun task(inlineCode: Task.InlineCode) = task(Task.ofInlineCode(inlineCode))

            /** Inline prompt definition */
            fun task(inlinePrompt: Task.InlinePrompt) = task(Task.ofInlinePrompt(inlinePrompt))

            /**
             * An optional experiment id to use as a base. If specified, the new experiment will be
             * summarized and compared to this experiment.
             */
            fun baseExperimentId(baseExperimentId: String?) =
                baseExperimentId(JsonField.ofNullable(baseExperimentId))

            /**
             * An optional experiment id to use as a base. If specified, the new experiment will be
             * summarized and compared to this experiment.
             */
            fun baseExperimentId(baseExperimentId: Optional<String>) =
                baseExperimentId(baseExperimentId.orElse(null))

            /**
             * An optional experiment id to use as a base. If specified, the new experiment will be
             * summarized and compared to this experiment.
             */
            fun baseExperimentId(baseExperimentId: JsonField<String>) = apply {
                this.baseExperimentId = baseExperimentId
            }

            /**
             * An optional experiment name to use as a base. If specified, the new experiment will
             * be summarized and compared to this experiment.
             */
            fun baseExperimentName(baseExperimentName: String?) =
                baseExperimentName(JsonField.ofNullable(baseExperimentName))

            /**
             * An optional experiment name to use as a base. If specified, the new experiment will
             * be summarized and compared to this experiment.
             */
            fun baseExperimentName(baseExperimentName: Optional<String>) =
                baseExperimentName(baseExperimentName.orElse(null))

            /**
             * An optional experiment name to use as a base. If specified, the new experiment will
             * be summarized and compared to this experiment.
             */
            fun baseExperimentName(baseExperimentName: JsonField<String>) = apply {
                this.baseExperimentName = baseExperimentName
            }

            /**
             * An optional name for the experiment created by this eval. If it conflicts with an
             * existing experiment, it will be suffixed with a unique identifier.
             */
            fun experimentName(experimentName: String) =
                experimentName(JsonField.of(experimentName))

            /**
             * An optional name for the experiment created by this eval. If it conflicts with an
             * existing experiment, it will be suffixed with a unique identifier.
             */
            fun experimentName(experimentName: JsonField<String>) = apply {
                this.experimentName = experimentName
            }

            /**
             * Optional settings for collecting git metadata. By default, will collect all git
             * metadata fields allowed in org-level settings.
             */
            fun gitMetadataSettings(gitMetadataSettings: GitMetadataSettings?) =
                gitMetadataSettings(JsonField.ofNullable(gitMetadataSettings))

            /**
             * Optional settings for collecting git metadata. By default, will collect all git
             * metadata fields allowed in org-level settings.
             */
            fun gitMetadataSettings(gitMetadataSettings: Optional<GitMetadataSettings>) =
                gitMetadataSettings(gitMetadataSettings.orElse(null))

            /**
             * Optional settings for collecting git metadata. By default, will collect all git
             * metadata fields allowed in org-level settings.
             */
            fun gitMetadataSettings(gitMetadataSettings: JsonField<GitMetadataSettings>) = apply {
                this.gitMetadataSettings = gitMetadataSettings
            }

            /** Whether the experiment should be public. Defaults to false. */
            fun isPublic(isPublic: Boolean?) = isPublic(JsonField.ofNullable(isPublic))

            /** Whether the experiment should be public. Defaults to false. */
            fun isPublic(isPublic: Boolean) = isPublic(isPublic as Boolean?)

            /** Whether the experiment should be public. Defaults to false. */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun isPublic(isPublic: Optional<Boolean>) = isPublic(isPublic.orElse(null) as Boolean?)

            /** Whether the experiment should be public. Defaults to false. */
            fun isPublic(isPublic: JsonField<Boolean>) = apply { this.isPublic = isPublic }

            /**
             * The maximum number of tasks/scorers that will be run concurrently. Defaults to
             * undefined, in which case there is no max concurrency.
             */
            fun maxConcurrency(maxConcurrency: Double?) =
                maxConcurrency(JsonField.ofNullable(maxConcurrency))

            /**
             * The maximum number of tasks/scorers that will be run concurrently. Defaults to
             * undefined, in which case there is no max concurrency.
             */
            fun maxConcurrency(maxConcurrency: Double) = maxConcurrency(maxConcurrency as Double?)

            /**
             * The maximum number of tasks/scorers that will be run concurrently. Defaults to
             * undefined, in which case there is no max concurrency.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun maxConcurrency(maxConcurrency: Optional<Double>) =
                maxConcurrency(maxConcurrency.orElse(null) as Double?)

            /**
             * The maximum number of tasks/scorers that will be run concurrently. Defaults to
             * undefined, in which case there is no max concurrency.
             */
            fun maxConcurrency(maxConcurrency: JsonField<Double>) = apply {
                this.maxConcurrency = maxConcurrency
            }

            /**
             * Optional experiment-level metadata to store about the evaluation. You can later use
             * this to slice & dice across experiments.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Optional experiment-level metadata to store about the evaluation. You can later use
             * this to slice & dice across experiments.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Metadata about the state of the repo when the experiment was created */
            fun repoInfo(repoInfo: RepoInfo?) = repoInfo(JsonField.ofNullable(repoInfo))

            /** Metadata about the state of the repo when the experiment was created */
            fun repoInfo(repoInfo: Optional<RepoInfo>) = repoInfo(repoInfo.orElse(null))

            /** Metadata about the state of the repo when the experiment was created */
            fun repoInfo(repoInfo: JsonField<RepoInfo>) = apply { this.repoInfo = repoInfo }

            /**
             * Whether to stream the results of the eval. If true, the request will return two
             * events: one to indicate the experiment has started, and another upon completion. If
             * false, the request will return the evaluation's summary upon completion.
             */
            fun stream(stream: Boolean) = stream(JsonField.of(stream))

            /**
             * Whether to stream the results of the eval. If true, the request will return two
             * events: one to indicate the experiment has started, and another upon completion. If
             * false, the request will return the evaluation's summary upon completion.
             */
            fun stream(stream: JsonField<Boolean>) = apply { this.stream = stream }

            /**
             * The maximum duration, in milliseconds, to run the evaluation. Defaults to undefined,
             * in which case there is no timeout.
             */
            fun timeout(timeout: Double?) = timeout(JsonField.ofNullable(timeout))

            /**
             * The maximum duration, in milliseconds, to run the evaluation. Defaults to undefined,
             * in which case there is no timeout.
             */
            fun timeout(timeout: Double) = timeout(timeout as Double?)

            /**
             * The maximum duration, in milliseconds, to run the evaluation. Defaults to undefined,
             * in which case there is no timeout.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun timeout(timeout: Optional<Double>) = timeout(timeout.orElse(null) as Double?)

            /**
             * The maximum duration, in milliseconds, to run the evaluation. Defaults to undefined,
             * in which case there is no timeout.
             */
            fun timeout(timeout: JsonField<Double>) = apply { this.timeout = timeout }

            /**
             * The number of times to run the evaluator per input. This is useful for evaluating
             * applications that have non-deterministic behavior and gives you both a stronger
             * aggregate measure and a sense of the variance in the results.
             */
            fun trialCount(trialCount: Double?) = trialCount(JsonField.ofNullable(trialCount))

            /**
             * The number of times to run the evaluator per input. This is useful for evaluating
             * applications that have non-deterministic behavior and gives you both a stronger
             * aggregate measure and a sense of the variance in the results.
             */
            fun trialCount(trialCount: Double) = trialCount(trialCount as Double?)

            /**
             * The number of times to run the evaluator per input. This is useful for evaluating
             * applications that have non-deterministic behavior and gives you both a stronger
             * aggregate measure and a sense of the variance in the results.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun trialCount(trialCount: Optional<Double>) =
                trialCount(trialCount.orElse(null) as Double?)

            /**
             * The number of times to run the evaluator per input. This is useful for evaluating
             * applications that have non-deterministic behavior and gives you both a stronger
             * aggregate measure and a sense of the variance in the results.
             */
            fun trialCount(trialCount: JsonField<Double>) = apply { this.trialCount = trialCount }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Body =
                Body(
                    checkRequired("data", data),
                    checkRequired("projectId", projectId),
                    checkRequired("scores", scores).map { it.toImmutable() },
                    checkRequired("task", task),
                    baseExperimentId,
                    baseExperimentName,
                    experimentName,
                    gitMetadataSettings,
                    isPublic,
                    maxConcurrency,
                    metadata,
                    repoInfo,
                    stream,
                    timeout,
                    trialCount,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && data == other.data && projectId == other.projectId && scores == other.scores && task == other.task && baseExperimentId == other.baseExperimentId && baseExperimentName == other.baseExperimentName && experimentName == other.experimentName && gitMetadataSettings == other.gitMetadataSettings && isPublic == other.isPublic && maxConcurrency == other.maxConcurrency && metadata == other.metadata && repoInfo == other.repoInfo && stream == other.stream && timeout == other.timeout && trialCount == other.trialCount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(data, projectId, scores, task, baseExperimentId, baseExperimentName, experimentName, gitMetadataSettings, isPublic, maxConcurrency, metadata, repoInfo, stream, timeout, trialCount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{data=$data, projectId=$projectId, scores=$scores, task=$task, baseExperimentId=$baseExperimentId, baseExperimentName=$baseExperimentName, experimentName=$experimentName, gitMetadataSettings=$gitMetadataSettings, isPublic=$isPublic, maxConcurrency=$maxConcurrency, metadata=$metadata, repoInfo=$repoInfo, stream=$stream, timeout=$timeout, trialCount=$trialCount, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EvalCreateParams].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .projectId()
         * .scores()
         * .task()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EvalCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(evalCreateParams: EvalCreateParams) = apply {
            body = evalCreateParams.body.toBuilder()
            additionalHeaders = evalCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = evalCreateParams.additionalQueryParams.toBuilder()
        }

        /** The dataset to use */
        fun data(data: Data) = apply { body.data(data) }

        /** The dataset to use */
        fun data(data: JsonField<Data>) = apply { body.data(data) }

        /** Dataset id */
        fun data(datasetId: Data.DatasetId) = apply { body.data(datasetId) }

        /** Project and dataset name */
        fun data(projectDatasetName: Data.ProjectDatasetName) = apply {
            body.data(projectDatasetName)
        }

        /** Unique identifier for the project to run the eval in */
        fun projectId(projectId: String) = apply { body.projectId(projectId) }

        /** Unique identifier for the project to run the eval in */
        fun projectId(projectId: JsonField<String>) = apply { body.projectId(projectId) }

        /** The functions to score the eval on */
        fun scores(scores: List<Score>) = apply { body.scores(scores) }

        /** The functions to score the eval on */
        fun scores(scores: JsonField<List<Score>>) = apply { body.scores(scores) }

        /** The functions to score the eval on */
        fun addScore(score: Score) = apply { body.addScore(score) }

        /** Function id */
        fun addScore(functionId: Score.FunctionId) = apply { body.addScore(functionId) }

        /** Project name and slug */
        fun addScore(projectSlug: Score.ProjectSlug) = apply { body.addScore(projectSlug) }

        /** Global function name */
        fun addScore(globalFunction: Score.GlobalFunction) = apply { body.addScore(globalFunction) }

        /** Prompt session id */
        fun addScore(promptSessionId: Score.PromptSessionId) = apply {
            body.addScore(promptSessionId)
        }

        /** Inline code function */
        fun addScore(inlineCode: Score.InlineCode) = apply { body.addScore(inlineCode) }

        /** Inline prompt definition */
        fun addScore(inlinePrompt: Score.InlinePrompt) = apply { body.addScore(inlinePrompt) }

        /** The function to evaluate */
        fun task(task: Task) = apply { body.task(task) }

        /** The function to evaluate */
        fun task(task: JsonField<Task>) = apply { body.task(task) }

        /** Function id */
        fun task(functionId: Task.FunctionId) = apply { body.task(functionId) }

        /** Project name and slug */
        fun task(projectSlug: Task.ProjectSlug) = apply { body.task(projectSlug) }

        /** Global function name */
        fun task(globalFunction: Task.GlobalFunction) = apply { body.task(globalFunction) }

        /** Prompt session id */
        fun task(promptSessionId: Task.PromptSessionId) = apply { body.task(promptSessionId) }

        /** Inline code function */
        fun task(inlineCode: Task.InlineCode) = apply { body.task(inlineCode) }

        /** Inline prompt definition */
        fun task(inlinePrompt: Task.InlinePrompt) = apply { body.task(inlinePrompt) }

        /**
         * An optional experiment id to use as a base. If specified, the new experiment will be
         * summarized and compared to this experiment.
         */
        fun baseExperimentId(baseExperimentId: String?) = apply {
            body.baseExperimentId(baseExperimentId)
        }

        /**
         * An optional experiment id to use as a base. If specified, the new experiment will be
         * summarized and compared to this experiment.
         */
        fun baseExperimentId(baseExperimentId: Optional<String>) =
            baseExperimentId(baseExperimentId.orElse(null))

        /**
         * An optional experiment id to use as a base. If specified, the new experiment will be
         * summarized and compared to this experiment.
         */
        fun baseExperimentId(baseExperimentId: JsonField<String>) = apply {
            body.baseExperimentId(baseExperimentId)
        }

        /**
         * An optional experiment name to use as a base. If specified, the new experiment will be
         * summarized and compared to this experiment.
         */
        fun baseExperimentName(baseExperimentName: String?) = apply {
            body.baseExperimentName(baseExperimentName)
        }

        /**
         * An optional experiment name to use as a base. If specified, the new experiment will be
         * summarized and compared to this experiment.
         */
        fun baseExperimentName(baseExperimentName: Optional<String>) =
            baseExperimentName(baseExperimentName.orElse(null))

        /**
         * An optional experiment name to use as a base. If specified, the new experiment will be
         * summarized and compared to this experiment.
         */
        fun baseExperimentName(baseExperimentName: JsonField<String>) = apply {
            body.baseExperimentName(baseExperimentName)
        }

        /**
         * An optional name for the experiment created by this eval. If it conflicts with an
         * existing experiment, it will be suffixed with a unique identifier.
         */
        fun experimentName(experimentName: String) = apply { body.experimentName(experimentName) }

        /**
         * An optional name for the experiment created by this eval. If it conflicts with an
         * existing experiment, it will be suffixed with a unique identifier.
         */
        fun experimentName(experimentName: JsonField<String>) = apply {
            body.experimentName(experimentName)
        }

        /**
         * Optional settings for collecting git metadata. By default, will collect all git metadata
         * fields allowed in org-level settings.
         */
        fun gitMetadataSettings(gitMetadataSettings: GitMetadataSettings?) = apply {
            body.gitMetadataSettings(gitMetadataSettings)
        }

        /**
         * Optional settings for collecting git metadata. By default, will collect all git metadata
         * fields allowed in org-level settings.
         */
        fun gitMetadataSettings(gitMetadataSettings: Optional<GitMetadataSettings>) =
            gitMetadataSettings(gitMetadataSettings.orElse(null))

        /**
         * Optional settings for collecting git metadata. By default, will collect all git metadata
         * fields allowed in org-level settings.
         */
        fun gitMetadataSettings(gitMetadataSettings: JsonField<GitMetadataSettings>) = apply {
            body.gitMetadataSettings(gitMetadataSettings)
        }

        /** Whether the experiment should be public. Defaults to false. */
        fun isPublic(isPublic: Boolean?) = apply { body.isPublic(isPublic) }

        /** Whether the experiment should be public. Defaults to false. */
        fun isPublic(isPublic: Boolean) = isPublic(isPublic as Boolean?)

        /** Whether the experiment should be public. Defaults to false. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun isPublic(isPublic: Optional<Boolean>) = isPublic(isPublic.orElse(null) as Boolean?)

        /** Whether the experiment should be public. Defaults to false. */
        fun isPublic(isPublic: JsonField<Boolean>) = apply { body.isPublic(isPublic) }

        /**
         * The maximum number of tasks/scorers that will be run concurrently. Defaults to undefined,
         * in which case there is no max concurrency.
         */
        fun maxConcurrency(maxConcurrency: Double?) = apply { body.maxConcurrency(maxConcurrency) }

        /**
         * The maximum number of tasks/scorers that will be run concurrently. Defaults to undefined,
         * in which case there is no max concurrency.
         */
        fun maxConcurrency(maxConcurrency: Double) = maxConcurrency(maxConcurrency as Double?)

        /**
         * The maximum number of tasks/scorers that will be run concurrently. Defaults to undefined,
         * in which case there is no max concurrency.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun maxConcurrency(maxConcurrency: Optional<Double>) =
            maxConcurrency(maxConcurrency.orElse(null) as Double?)

        /**
         * The maximum number of tasks/scorers that will be run concurrently. Defaults to undefined,
         * in which case there is no max concurrency.
         */
        fun maxConcurrency(maxConcurrency: JsonField<Double>) = apply {
            body.maxConcurrency(maxConcurrency)
        }

        /**
         * Optional experiment-level metadata to store about the evaluation. You can later use this
         * to slice & dice across experiments.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Optional experiment-level metadata to store about the evaluation. You can later use this
         * to slice & dice across experiments.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Metadata about the state of the repo when the experiment was created */
        fun repoInfo(repoInfo: RepoInfo?) = apply { body.repoInfo(repoInfo) }

        /** Metadata about the state of the repo when the experiment was created */
        fun repoInfo(repoInfo: Optional<RepoInfo>) = repoInfo(repoInfo.orElse(null))

        /** Metadata about the state of the repo when the experiment was created */
        fun repoInfo(repoInfo: JsonField<RepoInfo>) = apply { body.repoInfo(repoInfo) }

        /**
         * Whether to stream the results of the eval. If true, the request will return two events:
         * one to indicate the experiment has started, and another upon completion. If false, the
         * request will return the evaluation's summary upon completion.
         */
        fun stream(stream: Boolean) = apply { body.stream(stream) }

        /**
         * Whether to stream the results of the eval. If true, the request will return two events:
         * one to indicate the experiment has started, and another upon completion. If false, the
         * request will return the evaluation's summary upon completion.
         */
        fun stream(stream: JsonField<Boolean>) = apply { body.stream(stream) }

        /**
         * The maximum duration, in milliseconds, to run the evaluation. Defaults to undefined, in
         * which case there is no timeout.
         */
        fun timeout(timeout: Double?) = apply { body.timeout(timeout) }

        /**
         * The maximum duration, in milliseconds, to run the evaluation. Defaults to undefined, in
         * which case there is no timeout.
         */
        fun timeout(timeout: Double) = timeout(timeout as Double?)

        /**
         * The maximum duration, in milliseconds, to run the evaluation. Defaults to undefined, in
         * which case there is no timeout.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun timeout(timeout: Optional<Double>) = timeout(timeout.orElse(null) as Double?)

        /**
         * The maximum duration, in milliseconds, to run the evaluation. Defaults to undefined, in
         * which case there is no timeout.
         */
        fun timeout(timeout: JsonField<Double>) = apply { body.timeout(timeout) }

        /**
         * The number of times to run the evaluator per input. This is useful for evaluating
         * applications that have non-deterministic behavior and gives you both a stronger aggregate
         * measure and a sense of the variance in the results.
         */
        fun trialCount(trialCount: Double?) = apply { body.trialCount(trialCount) }

        /**
         * The number of times to run the evaluator per input. This is useful for evaluating
         * applications that have non-deterministic behavior and gives you both a stronger aggregate
         * measure and a sense of the variance in the results.
         */
        fun trialCount(trialCount: Double) = trialCount(trialCount as Double?)

        /**
         * The number of times to run the evaluator per input. This is useful for evaluating
         * applications that have non-deterministic behavior and gives you both a stronger aggregate
         * measure and a sense of the variance in the results.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun trialCount(trialCount: Optional<Double>) =
            trialCount(trialCount.orElse(null) as Double?)

        /**
         * The number of times to run the evaluator per input. This is useful for evaluating
         * applications that have non-deterministic behavior and gives you both a stronger aggregate
         * measure and a sense of the variance in the results.
         */
        fun trialCount(trialCount: JsonField<Double>) = apply { body.trialCount(trialCount) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): EvalCreateParams =
            EvalCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    /** The dataset to use */
    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val datasetId: DatasetId? = null,
        private val projectDatasetName: ProjectDatasetName? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Dataset id */
        fun datasetId(): Optional<DatasetId> = Optional.ofNullable(datasetId)

        /** Project and dataset name */
        fun projectDatasetName(): Optional<ProjectDatasetName> =
            Optional.ofNullable(projectDatasetName)

        fun isDatasetId(): Boolean = datasetId != null

        fun isProjectDatasetName(): Boolean = projectDatasetName != null

        /** Dataset id */
        fun asDatasetId(): DatasetId = datasetId.getOrThrow("datasetId")

        /** Project and dataset name */
        fun asProjectDatasetName(): ProjectDatasetName =
            projectDatasetName.getOrThrow("projectDatasetName")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                datasetId != null -> visitor.visitDatasetId(datasetId)
                projectDatasetName != null -> visitor.visitProjectDatasetName(projectDatasetName)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitDatasetId(datasetId: DatasetId) {
                        datasetId.validate()
                    }

                    override fun visitProjectDatasetName(projectDatasetName: ProjectDatasetName) {
                        projectDatasetName.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && datasetId == other.datasetId && projectDatasetName == other.projectDatasetName /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(datasetId, projectDatasetName) /* spotless:on */

        override fun toString(): String =
            when {
                datasetId != null -> "Data{datasetId=$datasetId}"
                projectDatasetName != null -> "Data{projectDatasetName=$projectDatasetName}"
                _json != null -> "Data{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Data")
            }

        companion object {

            /** Dataset id */
            @JvmStatic fun ofDatasetId(datasetId: DatasetId) = Data(datasetId = datasetId)

            /** Project and dataset name */
            @JvmStatic
            fun ofProjectDatasetName(projectDatasetName: ProjectDatasetName) =
                Data(projectDatasetName = projectDatasetName)
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            /** Dataset id */
            fun visitDatasetId(datasetId: DatasetId): T

            /** Project and dataset name */
            fun visitProjectDatasetName(projectDatasetName: ProjectDatasetName): T

            /**
             * Maps an unknown variant of [Data] to a value of type [T].
             *
             * An instance of [Data] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws BraintrustInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Data: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Data>(Data::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Data {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<DatasetId>()) { it.validate() }
                    ?.let {
                        return Data(datasetId = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ProjectDatasetName>()) { it.validate() }
                    ?.let {
                        return Data(projectDatasetName = it, _json = json)
                    }

                return Data(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Data>(Data::class) {

            override fun serialize(
                value: Data,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.datasetId != null -> generator.writeObject(value.datasetId)
                    value.projectDatasetName != null ->
                        generator.writeObject(value.projectDatasetName)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Data")
                }
            }
        }

        /** Dataset id */
        @NoAutoDetect
        class DatasetId
        @JsonCreator
        private constructor(
            @JsonProperty("dataset_id")
            @ExcludeMissing
            private val datasetId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun datasetId(): String = datasetId.getRequired("dataset_id")

            @JsonProperty("dataset_id")
            @ExcludeMissing
            fun _datasetId(): JsonField<String> = datasetId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): DatasetId = apply {
                if (validated) {
                    return@apply
                }

                datasetId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [DatasetId].
                 *
                 * The following fields are required:
                 * ```java
                 * .datasetId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DatasetId]. */
            class Builder internal constructor() {

                private var datasetId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(datasetId: DatasetId) = apply {
                    this.datasetId = datasetId.datasetId
                    additionalProperties = datasetId.additionalProperties.toMutableMap()
                }

                fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

                fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): DatasetId =
                    DatasetId(
                        checkRequired("datasetId", datasetId),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DatasetId && datasetId == other.datasetId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(datasetId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DatasetId{datasetId=$datasetId, additionalProperties=$additionalProperties}"
        }

        /** Project and dataset name */
        @NoAutoDetect
        class ProjectDatasetName
        @JsonCreator
        private constructor(
            @JsonProperty("dataset_name")
            @ExcludeMissing
            private val datasetName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("project_name")
            @ExcludeMissing
            private val projectName: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun datasetName(): String = datasetName.getRequired("dataset_name")

            fun projectName(): String = projectName.getRequired("project_name")

            @JsonProperty("dataset_name")
            @ExcludeMissing
            fun _datasetName(): JsonField<String> = datasetName

            @JsonProperty("project_name")
            @ExcludeMissing
            fun _projectName(): JsonField<String> = projectName

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ProjectDatasetName = apply {
                if (validated) {
                    return@apply
                }

                datasetName()
                projectName()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [ProjectDatasetName].
                 *
                 * The following fields are required:
                 * ```java
                 * .datasetName()
                 * .projectName()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ProjectDatasetName]. */
            class Builder internal constructor() {

                private var datasetName: JsonField<String>? = null
                private var projectName: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(projectDatasetName: ProjectDatasetName) = apply {
                    datasetName = projectDatasetName.datasetName
                    projectName = projectDatasetName.projectName
                    additionalProperties = projectDatasetName.additionalProperties.toMutableMap()
                }

                fun datasetName(datasetName: String) = datasetName(JsonField.of(datasetName))

                fun datasetName(datasetName: JsonField<String>) = apply {
                    this.datasetName = datasetName
                }

                fun projectName(projectName: String) = projectName(JsonField.of(projectName))

                fun projectName(projectName: JsonField<String>) = apply {
                    this.projectName = projectName
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): ProjectDatasetName =
                    ProjectDatasetName(
                        checkRequired("datasetName", datasetName),
                        checkRequired("projectName", projectName),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ProjectDatasetName && datasetName == other.datasetName && projectName == other.projectName && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(datasetName, projectName, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProjectDatasetName{datasetName=$datasetName, projectName=$projectName, additionalProperties=$additionalProperties}"
        }
    }

    /** The function to evaluate */
    @JsonDeserialize(using = Score.Deserializer::class)
    @JsonSerialize(using = Score.Serializer::class)
    class Score
    private constructor(
        private val functionId: FunctionId? = null,
        private val projectSlug: ProjectSlug? = null,
        private val globalFunction: GlobalFunction? = null,
        private val promptSessionId: PromptSessionId? = null,
        private val inlineCode: InlineCode? = null,
        private val inlinePrompt: InlinePrompt? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Function id */
        fun functionId(): Optional<FunctionId> = Optional.ofNullable(functionId)

        /** Project name and slug */
        fun projectSlug(): Optional<ProjectSlug> = Optional.ofNullable(projectSlug)

        /** Global function name */
        fun globalFunction(): Optional<GlobalFunction> = Optional.ofNullable(globalFunction)

        /** Prompt session id */
        fun promptSessionId(): Optional<PromptSessionId> = Optional.ofNullable(promptSessionId)

        /** Inline code function */
        fun inlineCode(): Optional<InlineCode> = Optional.ofNullable(inlineCode)

        /** Inline prompt definition */
        fun inlinePrompt(): Optional<InlinePrompt> = Optional.ofNullable(inlinePrompt)

        fun isFunctionId(): Boolean = functionId != null

        fun isProjectSlug(): Boolean = projectSlug != null

        fun isGlobalFunction(): Boolean = globalFunction != null

        fun isPromptSessionId(): Boolean = promptSessionId != null

        fun isInlineCode(): Boolean = inlineCode != null

        fun isInlinePrompt(): Boolean = inlinePrompt != null

        /** Function id */
        fun asFunctionId(): FunctionId = functionId.getOrThrow("functionId")

        /** Project name and slug */
        fun asProjectSlug(): ProjectSlug = projectSlug.getOrThrow("projectSlug")

        /** Global function name */
        fun asGlobalFunction(): GlobalFunction = globalFunction.getOrThrow("globalFunction")

        /** Prompt session id */
        fun asPromptSessionId(): PromptSessionId = promptSessionId.getOrThrow("promptSessionId")

        /** Inline code function */
        fun asInlineCode(): InlineCode = inlineCode.getOrThrow("inlineCode")

        /** Inline prompt definition */
        fun asInlinePrompt(): InlinePrompt = inlinePrompt.getOrThrow("inlinePrompt")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                functionId != null -> visitor.visitFunctionId(functionId)
                projectSlug != null -> visitor.visitProjectSlug(projectSlug)
                globalFunction != null -> visitor.visitGlobalFunction(globalFunction)
                promptSessionId != null -> visitor.visitPromptSessionId(promptSessionId)
                inlineCode != null -> visitor.visitInlineCode(inlineCode)
                inlinePrompt != null -> visitor.visitInlinePrompt(inlinePrompt)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Score = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitFunctionId(functionId: FunctionId) {
                        functionId.validate()
                    }

                    override fun visitProjectSlug(projectSlug: ProjectSlug) {
                        projectSlug.validate()
                    }

                    override fun visitGlobalFunction(globalFunction: GlobalFunction) {
                        globalFunction.validate()
                    }

                    override fun visitPromptSessionId(promptSessionId: PromptSessionId) {
                        promptSessionId.validate()
                    }

                    override fun visitInlineCode(inlineCode: InlineCode) {
                        inlineCode.validate()
                    }

                    override fun visitInlinePrompt(inlinePrompt: InlinePrompt) {
                        inlinePrompt.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Score && functionId == other.functionId && projectSlug == other.projectSlug && globalFunction == other.globalFunction && promptSessionId == other.promptSessionId && inlineCode == other.inlineCode && inlinePrompt == other.inlinePrompt /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(functionId, projectSlug, globalFunction, promptSessionId, inlineCode, inlinePrompt) /* spotless:on */

        override fun toString(): String =
            when {
                functionId != null -> "Score{functionId=$functionId}"
                projectSlug != null -> "Score{projectSlug=$projectSlug}"
                globalFunction != null -> "Score{globalFunction=$globalFunction}"
                promptSessionId != null -> "Score{promptSessionId=$promptSessionId}"
                inlineCode != null -> "Score{inlineCode=$inlineCode}"
                inlinePrompt != null -> "Score{inlinePrompt=$inlinePrompt}"
                _json != null -> "Score{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Score")
            }

        companion object {

            /** Function id */
            @JvmStatic fun ofFunctionId(functionId: FunctionId) = Score(functionId = functionId)

            /** Project name and slug */
            @JvmStatic
            fun ofProjectSlug(projectSlug: ProjectSlug) = Score(projectSlug = projectSlug)

            /** Global function name */
            @JvmStatic
            fun ofGlobalFunction(globalFunction: GlobalFunction) =
                Score(globalFunction = globalFunction)

            /** Prompt session id */
            @JvmStatic
            fun ofPromptSessionId(promptSessionId: PromptSessionId) =
                Score(promptSessionId = promptSessionId)

            /** Inline code function */
            @JvmStatic fun ofInlineCode(inlineCode: InlineCode) = Score(inlineCode = inlineCode)

            /** Inline prompt definition */
            @JvmStatic
            fun ofInlinePrompt(inlinePrompt: InlinePrompt) = Score(inlinePrompt = inlinePrompt)
        }

        /** An interface that defines how to map each variant of [Score] to a value of type [T]. */
        interface Visitor<out T> {

            /** Function id */
            fun visitFunctionId(functionId: FunctionId): T

            /** Project name and slug */
            fun visitProjectSlug(projectSlug: ProjectSlug): T

            /** Global function name */
            fun visitGlobalFunction(globalFunction: GlobalFunction): T

            /** Prompt session id */
            fun visitPromptSessionId(promptSessionId: PromptSessionId): T

            /** Inline code function */
            fun visitInlineCode(inlineCode: InlineCode): T

            /** Inline prompt definition */
            fun visitInlinePrompt(inlinePrompt: InlinePrompt): T

            /**
             * Maps an unknown variant of [Score] to a value of type [T].
             *
             * An instance of [Score] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws BraintrustInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Score: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Score>(Score::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Score {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<FunctionId>()) { it.validate() }
                    ?.let {
                        return Score(functionId = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ProjectSlug>()) { it.validate() }
                    ?.let {
                        return Score(projectSlug = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<GlobalFunction>()) { it.validate() }
                    ?.let {
                        return Score(globalFunction = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<PromptSessionId>()) { it.validate() }
                    ?.let {
                        return Score(promptSessionId = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<InlineCode>()) { it.validate() }
                    ?.let {
                        return Score(inlineCode = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<InlinePrompt>()) { it.validate() }
                    ?.let {
                        return Score(inlinePrompt = it, _json = json)
                    }

                return Score(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Score>(Score::class) {

            override fun serialize(
                value: Score,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.functionId != null -> generator.writeObject(value.functionId)
                    value.projectSlug != null -> generator.writeObject(value.projectSlug)
                    value.globalFunction != null -> generator.writeObject(value.globalFunction)
                    value.promptSessionId != null -> generator.writeObject(value.promptSessionId)
                    value.inlineCode != null -> generator.writeObject(value.inlineCode)
                    value.inlinePrompt != null -> generator.writeObject(value.inlinePrompt)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Score")
                }
            }
        }

        /** Function id */
        @NoAutoDetect
        class FunctionId
        @JsonCreator
        private constructor(
            @JsonProperty("function_id")
            @ExcludeMissing
            private val functionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version")
            @ExcludeMissing
            private val version: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The ID of the function */
            fun functionId(): String = functionId.getRequired("function_id")

            /** The version of the function */
            fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

            /** The ID of the function */
            @JsonProperty("function_id")
            @ExcludeMissing
            fun _functionId(): JsonField<String> = functionId

            /** The version of the function */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): FunctionId = apply {
                if (validated) {
                    return@apply
                }

                functionId()
                version()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [FunctionId].
                 *
                 * The following fields are required:
                 * ```java
                 * .functionId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FunctionId]. */
            class Builder internal constructor() {

                private var functionId: JsonField<String>? = null
                private var version: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(functionId: FunctionId) = apply {
                    this.functionId = functionId.functionId
                    version = functionId.version
                    additionalProperties = functionId.additionalProperties.toMutableMap()
                }

                /** The ID of the function */
                fun functionId(functionId: String) = functionId(JsonField.of(functionId))

                /** The ID of the function */
                fun functionId(functionId: JsonField<String>) = apply {
                    this.functionId = functionId
                }

                /** The version of the function */
                fun version(version: String) = version(JsonField.of(version))

                /** The version of the function */
                fun version(version: JsonField<String>) = apply { this.version = version }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): FunctionId =
                    FunctionId(
                        checkRequired("functionId", functionId),
                        version,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FunctionId && functionId == other.functionId && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(functionId, version, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FunctionId{functionId=$functionId, version=$version, additionalProperties=$additionalProperties}"
        }

        /** Project name and slug */
        @NoAutoDetect
        class ProjectSlug
        @JsonCreator
        private constructor(
            @JsonProperty("project_name")
            @ExcludeMissing
            private val projectName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("slug")
            @ExcludeMissing
            private val slug: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version")
            @ExcludeMissing
            private val version: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The name of the project containing the function */
            fun projectName(): String = projectName.getRequired("project_name")

            /** The slug of the function */
            fun slug(): String = slug.getRequired("slug")

            /** The version of the function */
            fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

            /** The name of the project containing the function */
            @JsonProperty("project_name")
            @ExcludeMissing
            fun _projectName(): JsonField<String> = projectName

            /** The slug of the function */
            @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

            /** The version of the function */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ProjectSlug = apply {
                if (validated) {
                    return@apply
                }

                projectName()
                slug()
                version()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [ProjectSlug].
                 *
                 * The following fields are required:
                 * ```java
                 * .projectName()
                 * .slug()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ProjectSlug]. */
            class Builder internal constructor() {

                private var projectName: JsonField<String>? = null
                private var slug: JsonField<String>? = null
                private var version: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(projectSlug: ProjectSlug) = apply {
                    projectName = projectSlug.projectName
                    slug = projectSlug.slug
                    version = projectSlug.version
                    additionalProperties = projectSlug.additionalProperties.toMutableMap()
                }

                /** The name of the project containing the function */
                fun projectName(projectName: String) = projectName(JsonField.of(projectName))

                /** The name of the project containing the function */
                fun projectName(projectName: JsonField<String>) = apply {
                    this.projectName = projectName
                }

                /** The slug of the function */
                fun slug(slug: String) = slug(JsonField.of(slug))

                /** The slug of the function */
                fun slug(slug: JsonField<String>) = apply { this.slug = slug }

                /** The version of the function */
                fun version(version: String) = version(JsonField.of(version))

                /** The version of the function */
                fun version(version: JsonField<String>) = apply { this.version = version }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): ProjectSlug =
                    ProjectSlug(
                        checkRequired("projectName", projectName),
                        checkRequired("slug", slug),
                        version,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ProjectSlug && projectName == other.projectName && slug == other.slug && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(projectName, slug, version, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProjectSlug{projectName=$projectName, slug=$slug, version=$version, additionalProperties=$additionalProperties}"
        }

        /** Global function name */
        @NoAutoDetect
        class GlobalFunction
        @JsonCreator
        private constructor(
            @JsonProperty("global_function")
            @ExcludeMissing
            private val globalFunction: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The name of the global function. Currently, the global namespace includes the
             * functions in autoevals
             */
            fun globalFunction(): String = globalFunction.getRequired("global_function")

            /**
             * The name of the global function. Currently, the global namespace includes the
             * functions in autoevals
             */
            @JsonProperty("global_function")
            @ExcludeMissing
            fun _globalFunction(): JsonField<String> = globalFunction

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): GlobalFunction = apply {
                if (validated) {
                    return@apply
                }

                globalFunction()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [GlobalFunction].
                 *
                 * The following fields are required:
                 * ```java
                 * .globalFunction()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [GlobalFunction]. */
            class Builder internal constructor() {

                private var globalFunction: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(globalFunction: GlobalFunction) = apply {
                    this.globalFunction = globalFunction.globalFunction
                    additionalProperties = globalFunction.additionalProperties.toMutableMap()
                }

                /**
                 * The name of the global function. Currently, the global namespace includes the
                 * functions in autoevals
                 */
                fun globalFunction(globalFunction: String) =
                    globalFunction(JsonField.of(globalFunction))

                /**
                 * The name of the global function. Currently, the global namespace includes the
                 * functions in autoevals
                 */
                fun globalFunction(globalFunction: JsonField<String>) = apply {
                    this.globalFunction = globalFunction
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): GlobalFunction =
                    GlobalFunction(
                        checkRequired("globalFunction", globalFunction),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GlobalFunction && globalFunction == other.globalFunction && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(globalFunction, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GlobalFunction{globalFunction=$globalFunction, additionalProperties=$additionalProperties}"
        }

        /** Prompt session id */
        @NoAutoDetect
        class PromptSessionId
        @JsonCreator
        private constructor(
            @JsonProperty("prompt_session_function_id")
            @ExcludeMissing
            private val promptSessionFunctionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt_session_id")
            @ExcludeMissing
            private val promptSessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version")
            @ExcludeMissing
            private val version: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The ID of the function in the prompt session */
            fun promptSessionFunctionId(): String =
                promptSessionFunctionId.getRequired("prompt_session_function_id")

            /** The ID of the prompt session */
            fun promptSessionId(): String = promptSessionId.getRequired("prompt_session_id")

            /** The version of the function */
            fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

            /** The ID of the function in the prompt session */
            @JsonProperty("prompt_session_function_id")
            @ExcludeMissing
            fun _promptSessionFunctionId(): JsonField<String> = promptSessionFunctionId

            /** The ID of the prompt session */
            @JsonProperty("prompt_session_id")
            @ExcludeMissing
            fun _promptSessionId(): JsonField<String> = promptSessionId

            /** The version of the function */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PromptSessionId = apply {
                if (validated) {
                    return@apply
                }

                promptSessionFunctionId()
                promptSessionId()
                version()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [PromptSessionId].
                 *
                 * The following fields are required:
                 * ```java
                 * .promptSessionFunctionId()
                 * .promptSessionId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PromptSessionId]. */
            class Builder internal constructor() {

                private var promptSessionFunctionId: JsonField<String>? = null
                private var promptSessionId: JsonField<String>? = null
                private var version: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(promptSessionId: PromptSessionId) = apply {
                    promptSessionFunctionId = promptSessionId.promptSessionFunctionId
                    this.promptSessionId = promptSessionId.promptSessionId
                    version = promptSessionId.version
                    additionalProperties = promptSessionId.additionalProperties.toMutableMap()
                }

                /** The ID of the function in the prompt session */
                fun promptSessionFunctionId(promptSessionFunctionId: String) =
                    promptSessionFunctionId(JsonField.of(promptSessionFunctionId))

                /** The ID of the function in the prompt session */
                fun promptSessionFunctionId(promptSessionFunctionId: JsonField<String>) = apply {
                    this.promptSessionFunctionId = promptSessionFunctionId
                }

                /** The ID of the prompt session */
                fun promptSessionId(promptSessionId: String) =
                    promptSessionId(JsonField.of(promptSessionId))

                /** The ID of the prompt session */
                fun promptSessionId(promptSessionId: JsonField<String>) = apply {
                    this.promptSessionId = promptSessionId
                }

                /** The version of the function */
                fun version(version: String) = version(JsonField.of(version))

                /** The version of the function */
                fun version(version: JsonField<String>) = apply { this.version = version }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): PromptSessionId =
                    PromptSessionId(
                        checkRequired("promptSessionFunctionId", promptSessionFunctionId),
                        checkRequired("promptSessionId", promptSessionId),
                        version,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PromptSessionId && promptSessionFunctionId == other.promptSessionFunctionId && promptSessionId == other.promptSessionId && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(promptSessionFunctionId, promptSessionId, version, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PromptSessionId{promptSessionFunctionId=$promptSessionFunctionId, promptSessionId=$promptSessionId, version=$version, additionalProperties=$additionalProperties}"
        }

        /** Inline code function */
        @NoAutoDetect
        class InlineCode
        @JsonCreator
        private constructor(
            @JsonProperty("code")
            @ExcludeMissing
            private val code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inline_context")
            @ExcludeMissing
            private val inlineContext: JsonField<InlineContext> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The inline code to execute */
            fun code(): String = code.getRequired("code")

            fun inlineContext(): InlineContext = inlineContext.getRequired("inline_context")

            /** The name of the inline code function */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** The inline code to execute */
            @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

            @JsonProperty("inline_context")
            @ExcludeMissing
            fun _inlineContext(): JsonField<InlineContext> = inlineContext

            /** The name of the inline code function */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): InlineCode = apply {
                if (validated) {
                    return@apply
                }

                code()
                inlineContext().validate()
                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [InlineCode].
                 *
                 * The following fields are required:
                 * ```java
                 * .code()
                 * .inlineContext()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InlineCode]. */
            class Builder internal constructor() {

                private var code: JsonField<String>? = null
                private var inlineContext: JsonField<InlineContext>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inlineCode: InlineCode) = apply {
                    code = inlineCode.code
                    inlineContext = inlineCode.inlineContext
                    name = inlineCode.name
                    additionalProperties = inlineCode.additionalProperties.toMutableMap()
                }

                /** The inline code to execute */
                fun code(code: String) = code(JsonField.of(code))

                /** The inline code to execute */
                fun code(code: JsonField<String>) = apply { this.code = code }

                fun inlineContext(inlineContext: InlineContext) =
                    inlineContext(JsonField.of(inlineContext))

                fun inlineContext(inlineContext: JsonField<InlineContext>) = apply {
                    this.inlineContext = inlineContext
                }

                /** The name of the inline code function */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** The name of the inline code function */
                fun name(name: Optional<String>) = name(name.orElse(null))

                /** The name of the inline code function */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): InlineCode =
                    InlineCode(
                        checkRequired("code", code),
                        checkRequired("inlineContext", inlineContext),
                        name,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class InlineContext
            @JsonCreator
            private constructor(
                @JsonProperty("runtime")
                @ExcludeMissing
                private val runtime: JsonField<Runtime> = JsonMissing.of(),
                @JsonProperty("version")
                @ExcludeMissing
                private val version: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun runtime(): Runtime = runtime.getRequired("runtime")

                fun version(): String = version.getRequired("version")

                @JsonProperty("runtime")
                @ExcludeMissing
                fun _runtime(): JsonField<Runtime> = runtime

                @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): InlineContext = apply {
                    if (validated) {
                        return@apply
                    }

                    runtime()
                    version()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [InlineContext].
                     *
                     * The following fields are required:
                     * ```java
                     * .runtime()
                     * .version()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [InlineContext]. */
                class Builder internal constructor() {

                    private var runtime: JsonField<Runtime>? = null
                    private var version: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(inlineContext: InlineContext) = apply {
                        runtime = inlineContext.runtime
                        version = inlineContext.version
                        additionalProperties = inlineContext.additionalProperties.toMutableMap()
                    }

                    fun runtime(runtime: Runtime) = runtime(JsonField.of(runtime))

                    fun runtime(runtime: JsonField<Runtime>) = apply { this.runtime = runtime }

                    fun version(version: String) = version(JsonField.of(version))

                    fun version(version: JsonField<String>) = apply { this.version = version }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): InlineContext =
                        InlineContext(
                            checkRequired("runtime", runtime),
                            checkRequired("version", version),
                            additionalProperties.toImmutable(),
                        )
                }

                class Runtime
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val NODE = of("node")

                        @JvmField val PYTHON = of("python")

                        @JvmStatic fun of(value: String) = Runtime(JsonField.of(value))
                    }

                    /** An enum containing [Runtime]'s known values. */
                    enum class Known {
                        NODE,
                        PYTHON,
                    }

                    /**
                     * An enum containing [Runtime]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Runtime] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        NODE,
                        PYTHON,
                        /**
                         * An enum member indicating that [Runtime] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            NODE -> Value.NODE
                            PYTHON -> Value.PYTHON
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws BraintrustInvalidDataException if this class instance's value is a
                     *   not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            NODE -> Known.NODE
                            PYTHON -> Known.PYTHON
                            else -> throw BraintrustInvalidDataException("Unknown Runtime: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws BraintrustInvalidDataException if this class instance's value does
                     *   not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            BraintrustInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Runtime && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is InlineContext && runtime == other.runtime && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(runtime, version, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "InlineContext{runtime=$runtime, version=$version, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InlineCode && code == other.code && inlineContext == other.inlineContext && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(code, inlineContext, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InlineCode{code=$code, inlineContext=$inlineContext, name=$name, additionalProperties=$additionalProperties}"
        }

        /** Inline prompt definition */
        @NoAutoDetect
        class InlinePrompt
        @JsonCreator
        private constructor(
            @JsonProperty("inline_prompt")
            @ExcludeMissing
            private val inlinePrompt: JsonField<PromptData> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The prompt, model, and its parameters */
            fun inlinePrompt(): Optional<PromptData> =
                Optional.ofNullable(inlinePrompt.getNullable("inline_prompt"))

            /** The name of the inline prompt */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** The prompt, model, and its parameters */
            @JsonProperty("inline_prompt")
            @ExcludeMissing
            fun _inlinePrompt(): JsonField<PromptData> = inlinePrompt

            /** The name of the inline prompt */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): InlinePrompt = apply {
                if (validated) {
                    return@apply
                }

                inlinePrompt().ifPresent { it.validate() }
                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [InlinePrompt].
                 *
                 * The following fields are required:
                 * ```java
                 * .inlinePrompt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InlinePrompt]. */
            class Builder internal constructor() {

                private var inlinePrompt: JsonField<PromptData>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inlinePrompt: InlinePrompt) = apply {
                    this.inlinePrompt = inlinePrompt.inlinePrompt
                    name = inlinePrompt.name
                    additionalProperties = inlinePrompt.additionalProperties.toMutableMap()
                }

                /** The prompt, model, and its parameters */
                fun inlinePrompt(inlinePrompt: PromptData?) =
                    inlinePrompt(JsonField.ofNullable(inlinePrompt))

                /** The prompt, model, and its parameters */
                fun inlinePrompt(inlinePrompt: Optional<PromptData>) =
                    inlinePrompt(inlinePrompt.orElse(null))

                /** The prompt, model, and its parameters */
                fun inlinePrompt(inlinePrompt: JsonField<PromptData>) = apply {
                    this.inlinePrompt = inlinePrompt
                }

                /** The name of the inline prompt */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** The name of the inline prompt */
                fun name(name: Optional<String>) = name(name.orElse(null))

                /** The name of the inline prompt */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): InlinePrompt =
                    InlinePrompt(
                        checkRequired("inlinePrompt", inlinePrompt),
                        name,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InlinePrompt && inlinePrompt == other.inlinePrompt && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(inlinePrompt, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InlinePrompt{inlinePrompt=$inlinePrompt, name=$name, additionalProperties=$additionalProperties}"
        }
    }

    /** The function to evaluate */
    @JsonDeserialize(using = Task.Deserializer::class)
    @JsonSerialize(using = Task.Serializer::class)
    class Task
    private constructor(
        private val functionId: FunctionId? = null,
        private val projectSlug: ProjectSlug? = null,
        private val globalFunction: GlobalFunction? = null,
        private val promptSessionId: PromptSessionId? = null,
        private val inlineCode: InlineCode? = null,
        private val inlinePrompt: InlinePrompt? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Function id */
        fun functionId(): Optional<FunctionId> = Optional.ofNullable(functionId)

        /** Project name and slug */
        fun projectSlug(): Optional<ProjectSlug> = Optional.ofNullable(projectSlug)

        /** Global function name */
        fun globalFunction(): Optional<GlobalFunction> = Optional.ofNullable(globalFunction)

        /** Prompt session id */
        fun promptSessionId(): Optional<PromptSessionId> = Optional.ofNullable(promptSessionId)

        /** Inline code function */
        fun inlineCode(): Optional<InlineCode> = Optional.ofNullable(inlineCode)

        /** Inline prompt definition */
        fun inlinePrompt(): Optional<InlinePrompt> = Optional.ofNullable(inlinePrompt)

        fun isFunctionId(): Boolean = functionId != null

        fun isProjectSlug(): Boolean = projectSlug != null

        fun isGlobalFunction(): Boolean = globalFunction != null

        fun isPromptSessionId(): Boolean = promptSessionId != null

        fun isInlineCode(): Boolean = inlineCode != null

        fun isInlinePrompt(): Boolean = inlinePrompt != null

        /** Function id */
        fun asFunctionId(): FunctionId = functionId.getOrThrow("functionId")

        /** Project name and slug */
        fun asProjectSlug(): ProjectSlug = projectSlug.getOrThrow("projectSlug")

        /** Global function name */
        fun asGlobalFunction(): GlobalFunction = globalFunction.getOrThrow("globalFunction")

        /** Prompt session id */
        fun asPromptSessionId(): PromptSessionId = promptSessionId.getOrThrow("promptSessionId")

        /** Inline code function */
        fun asInlineCode(): InlineCode = inlineCode.getOrThrow("inlineCode")

        /** Inline prompt definition */
        fun asInlinePrompt(): InlinePrompt = inlinePrompt.getOrThrow("inlinePrompt")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                functionId != null -> visitor.visitFunctionId(functionId)
                projectSlug != null -> visitor.visitProjectSlug(projectSlug)
                globalFunction != null -> visitor.visitGlobalFunction(globalFunction)
                promptSessionId != null -> visitor.visitPromptSessionId(promptSessionId)
                inlineCode != null -> visitor.visitInlineCode(inlineCode)
                inlinePrompt != null -> visitor.visitInlinePrompt(inlinePrompt)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Task = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitFunctionId(functionId: FunctionId) {
                        functionId.validate()
                    }

                    override fun visitProjectSlug(projectSlug: ProjectSlug) {
                        projectSlug.validate()
                    }

                    override fun visitGlobalFunction(globalFunction: GlobalFunction) {
                        globalFunction.validate()
                    }

                    override fun visitPromptSessionId(promptSessionId: PromptSessionId) {
                        promptSessionId.validate()
                    }

                    override fun visitInlineCode(inlineCode: InlineCode) {
                        inlineCode.validate()
                    }

                    override fun visitInlinePrompt(inlinePrompt: InlinePrompt) {
                        inlinePrompt.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Task && functionId == other.functionId && projectSlug == other.projectSlug && globalFunction == other.globalFunction && promptSessionId == other.promptSessionId && inlineCode == other.inlineCode && inlinePrompt == other.inlinePrompt /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(functionId, projectSlug, globalFunction, promptSessionId, inlineCode, inlinePrompt) /* spotless:on */

        override fun toString(): String =
            when {
                functionId != null -> "Task{functionId=$functionId}"
                projectSlug != null -> "Task{projectSlug=$projectSlug}"
                globalFunction != null -> "Task{globalFunction=$globalFunction}"
                promptSessionId != null -> "Task{promptSessionId=$promptSessionId}"
                inlineCode != null -> "Task{inlineCode=$inlineCode}"
                inlinePrompt != null -> "Task{inlinePrompt=$inlinePrompt}"
                _json != null -> "Task{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Task")
            }

        companion object {

            /** Function id */
            @JvmStatic fun ofFunctionId(functionId: FunctionId) = Task(functionId = functionId)

            /** Project name and slug */
            @JvmStatic fun ofProjectSlug(projectSlug: ProjectSlug) = Task(projectSlug = projectSlug)

            /** Global function name */
            @JvmStatic
            fun ofGlobalFunction(globalFunction: GlobalFunction) =
                Task(globalFunction = globalFunction)

            /** Prompt session id */
            @JvmStatic
            fun ofPromptSessionId(promptSessionId: PromptSessionId) =
                Task(promptSessionId = promptSessionId)

            /** Inline code function */
            @JvmStatic fun ofInlineCode(inlineCode: InlineCode) = Task(inlineCode = inlineCode)

            /** Inline prompt definition */
            @JvmStatic
            fun ofInlinePrompt(inlinePrompt: InlinePrompt) = Task(inlinePrompt = inlinePrompt)
        }

        /** An interface that defines how to map each variant of [Task] to a value of type [T]. */
        interface Visitor<out T> {

            /** Function id */
            fun visitFunctionId(functionId: FunctionId): T

            /** Project name and slug */
            fun visitProjectSlug(projectSlug: ProjectSlug): T

            /** Global function name */
            fun visitGlobalFunction(globalFunction: GlobalFunction): T

            /** Prompt session id */
            fun visitPromptSessionId(promptSessionId: PromptSessionId): T

            /** Inline code function */
            fun visitInlineCode(inlineCode: InlineCode): T

            /** Inline prompt definition */
            fun visitInlinePrompt(inlinePrompt: InlinePrompt): T

            /**
             * Maps an unknown variant of [Task] to a value of type [T].
             *
             * An instance of [Task] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws BraintrustInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Task: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Task>(Task::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Task {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<FunctionId>()) { it.validate() }
                    ?.let {
                        return Task(functionId = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ProjectSlug>()) { it.validate() }
                    ?.let {
                        return Task(projectSlug = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<GlobalFunction>()) { it.validate() }
                    ?.let {
                        return Task(globalFunction = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<PromptSessionId>()) { it.validate() }
                    ?.let {
                        return Task(promptSessionId = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<InlineCode>()) { it.validate() }
                    ?.let {
                        return Task(inlineCode = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<InlinePrompt>()) { it.validate() }
                    ?.let {
                        return Task(inlinePrompt = it, _json = json)
                    }

                return Task(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Task>(Task::class) {

            override fun serialize(
                value: Task,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.functionId != null -> generator.writeObject(value.functionId)
                    value.projectSlug != null -> generator.writeObject(value.projectSlug)
                    value.globalFunction != null -> generator.writeObject(value.globalFunction)
                    value.promptSessionId != null -> generator.writeObject(value.promptSessionId)
                    value.inlineCode != null -> generator.writeObject(value.inlineCode)
                    value.inlinePrompt != null -> generator.writeObject(value.inlinePrompt)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Task")
                }
            }
        }

        /** Function id */
        @NoAutoDetect
        class FunctionId
        @JsonCreator
        private constructor(
            @JsonProperty("function_id")
            @ExcludeMissing
            private val functionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version")
            @ExcludeMissing
            private val version: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The ID of the function */
            fun functionId(): String = functionId.getRequired("function_id")

            /** The version of the function */
            fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

            /** The ID of the function */
            @JsonProperty("function_id")
            @ExcludeMissing
            fun _functionId(): JsonField<String> = functionId

            /** The version of the function */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): FunctionId = apply {
                if (validated) {
                    return@apply
                }

                functionId()
                version()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [FunctionId].
                 *
                 * The following fields are required:
                 * ```java
                 * .functionId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FunctionId]. */
            class Builder internal constructor() {

                private var functionId: JsonField<String>? = null
                private var version: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(functionId: FunctionId) = apply {
                    this.functionId = functionId.functionId
                    version = functionId.version
                    additionalProperties = functionId.additionalProperties.toMutableMap()
                }

                /** The ID of the function */
                fun functionId(functionId: String) = functionId(JsonField.of(functionId))

                /** The ID of the function */
                fun functionId(functionId: JsonField<String>) = apply {
                    this.functionId = functionId
                }

                /** The version of the function */
                fun version(version: String) = version(JsonField.of(version))

                /** The version of the function */
                fun version(version: JsonField<String>) = apply { this.version = version }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): FunctionId =
                    FunctionId(
                        checkRequired("functionId", functionId),
                        version,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FunctionId && functionId == other.functionId && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(functionId, version, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FunctionId{functionId=$functionId, version=$version, additionalProperties=$additionalProperties}"
        }

        /** Project name and slug */
        @NoAutoDetect
        class ProjectSlug
        @JsonCreator
        private constructor(
            @JsonProperty("project_name")
            @ExcludeMissing
            private val projectName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("slug")
            @ExcludeMissing
            private val slug: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version")
            @ExcludeMissing
            private val version: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The name of the project containing the function */
            fun projectName(): String = projectName.getRequired("project_name")

            /** The slug of the function */
            fun slug(): String = slug.getRequired("slug")

            /** The version of the function */
            fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

            /** The name of the project containing the function */
            @JsonProperty("project_name")
            @ExcludeMissing
            fun _projectName(): JsonField<String> = projectName

            /** The slug of the function */
            @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

            /** The version of the function */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ProjectSlug = apply {
                if (validated) {
                    return@apply
                }

                projectName()
                slug()
                version()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [ProjectSlug].
                 *
                 * The following fields are required:
                 * ```java
                 * .projectName()
                 * .slug()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ProjectSlug]. */
            class Builder internal constructor() {

                private var projectName: JsonField<String>? = null
                private var slug: JsonField<String>? = null
                private var version: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(projectSlug: ProjectSlug) = apply {
                    projectName = projectSlug.projectName
                    slug = projectSlug.slug
                    version = projectSlug.version
                    additionalProperties = projectSlug.additionalProperties.toMutableMap()
                }

                /** The name of the project containing the function */
                fun projectName(projectName: String) = projectName(JsonField.of(projectName))

                /** The name of the project containing the function */
                fun projectName(projectName: JsonField<String>) = apply {
                    this.projectName = projectName
                }

                /** The slug of the function */
                fun slug(slug: String) = slug(JsonField.of(slug))

                /** The slug of the function */
                fun slug(slug: JsonField<String>) = apply { this.slug = slug }

                /** The version of the function */
                fun version(version: String) = version(JsonField.of(version))

                /** The version of the function */
                fun version(version: JsonField<String>) = apply { this.version = version }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): ProjectSlug =
                    ProjectSlug(
                        checkRequired("projectName", projectName),
                        checkRequired("slug", slug),
                        version,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ProjectSlug && projectName == other.projectName && slug == other.slug && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(projectName, slug, version, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProjectSlug{projectName=$projectName, slug=$slug, version=$version, additionalProperties=$additionalProperties}"
        }

        /** Global function name */
        @NoAutoDetect
        class GlobalFunction
        @JsonCreator
        private constructor(
            @JsonProperty("global_function")
            @ExcludeMissing
            private val globalFunction: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The name of the global function. Currently, the global namespace includes the
             * functions in autoevals
             */
            fun globalFunction(): String = globalFunction.getRequired("global_function")

            /**
             * The name of the global function. Currently, the global namespace includes the
             * functions in autoevals
             */
            @JsonProperty("global_function")
            @ExcludeMissing
            fun _globalFunction(): JsonField<String> = globalFunction

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): GlobalFunction = apply {
                if (validated) {
                    return@apply
                }

                globalFunction()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [GlobalFunction].
                 *
                 * The following fields are required:
                 * ```java
                 * .globalFunction()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [GlobalFunction]. */
            class Builder internal constructor() {

                private var globalFunction: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(globalFunction: GlobalFunction) = apply {
                    this.globalFunction = globalFunction.globalFunction
                    additionalProperties = globalFunction.additionalProperties.toMutableMap()
                }

                /**
                 * The name of the global function. Currently, the global namespace includes the
                 * functions in autoevals
                 */
                fun globalFunction(globalFunction: String) =
                    globalFunction(JsonField.of(globalFunction))

                /**
                 * The name of the global function. Currently, the global namespace includes the
                 * functions in autoevals
                 */
                fun globalFunction(globalFunction: JsonField<String>) = apply {
                    this.globalFunction = globalFunction
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): GlobalFunction =
                    GlobalFunction(
                        checkRequired("globalFunction", globalFunction),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GlobalFunction && globalFunction == other.globalFunction && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(globalFunction, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GlobalFunction{globalFunction=$globalFunction, additionalProperties=$additionalProperties}"
        }

        /** Prompt session id */
        @NoAutoDetect
        class PromptSessionId
        @JsonCreator
        private constructor(
            @JsonProperty("prompt_session_function_id")
            @ExcludeMissing
            private val promptSessionFunctionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt_session_id")
            @ExcludeMissing
            private val promptSessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version")
            @ExcludeMissing
            private val version: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The ID of the function in the prompt session */
            fun promptSessionFunctionId(): String =
                promptSessionFunctionId.getRequired("prompt_session_function_id")

            /** The ID of the prompt session */
            fun promptSessionId(): String = promptSessionId.getRequired("prompt_session_id")

            /** The version of the function */
            fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

            /** The ID of the function in the prompt session */
            @JsonProperty("prompt_session_function_id")
            @ExcludeMissing
            fun _promptSessionFunctionId(): JsonField<String> = promptSessionFunctionId

            /** The ID of the prompt session */
            @JsonProperty("prompt_session_id")
            @ExcludeMissing
            fun _promptSessionId(): JsonField<String> = promptSessionId

            /** The version of the function */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PromptSessionId = apply {
                if (validated) {
                    return@apply
                }

                promptSessionFunctionId()
                promptSessionId()
                version()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [PromptSessionId].
                 *
                 * The following fields are required:
                 * ```java
                 * .promptSessionFunctionId()
                 * .promptSessionId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PromptSessionId]. */
            class Builder internal constructor() {

                private var promptSessionFunctionId: JsonField<String>? = null
                private var promptSessionId: JsonField<String>? = null
                private var version: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(promptSessionId: PromptSessionId) = apply {
                    promptSessionFunctionId = promptSessionId.promptSessionFunctionId
                    this.promptSessionId = promptSessionId.promptSessionId
                    version = promptSessionId.version
                    additionalProperties = promptSessionId.additionalProperties.toMutableMap()
                }

                /** The ID of the function in the prompt session */
                fun promptSessionFunctionId(promptSessionFunctionId: String) =
                    promptSessionFunctionId(JsonField.of(promptSessionFunctionId))

                /** The ID of the function in the prompt session */
                fun promptSessionFunctionId(promptSessionFunctionId: JsonField<String>) = apply {
                    this.promptSessionFunctionId = promptSessionFunctionId
                }

                /** The ID of the prompt session */
                fun promptSessionId(promptSessionId: String) =
                    promptSessionId(JsonField.of(promptSessionId))

                /** The ID of the prompt session */
                fun promptSessionId(promptSessionId: JsonField<String>) = apply {
                    this.promptSessionId = promptSessionId
                }

                /** The version of the function */
                fun version(version: String) = version(JsonField.of(version))

                /** The version of the function */
                fun version(version: JsonField<String>) = apply { this.version = version }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): PromptSessionId =
                    PromptSessionId(
                        checkRequired("promptSessionFunctionId", promptSessionFunctionId),
                        checkRequired("promptSessionId", promptSessionId),
                        version,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PromptSessionId && promptSessionFunctionId == other.promptSessionFunctionId && promptSessionId == other.promptSessionId && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(promptSessionFunctionId, promptSessionId, version, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PromptSessionId{promptSessionFunctionId=$promptSessionFunctionId, promptSessionId=$promptSessionId, version=$version, additionalProperties=$additionalProperties}"
        }

        /** Inline code function */
        @NoAutoDetect
        class InlineCode
        @JsonCreator
        private constructor(
            @JsonProperty("code")
            @ExcludeMissing
            private val code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inline_context")
            @ExcludeMissing
            private val inlineContext: JsonField<InlineContext> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The inline code to execute */
            fun code(): String = code.getRequired("code")

            fun inlineContext(): InlineContext = inlineContext.getRequired("inline_context")

            /** The name of the inline code function */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** The inline code to execute */
            @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

            @JsonProperty("inline_context")
            @ExcludeMissing
            fun _inlineContext(): JsonField<InlineContext> = inlineContext

            /** The name of the inline code function */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): InlineCode = apply {
                if (validated) {
                    return@apply
                }

                code()
                inlineContext().validate()
                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [InlineCode].
                 *
                 * The following fields are required:
                 * ```java
                 * .code()
                 * .inlineContext()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InlineCode]. */
            class Builder internal constructor() {

                private var code: JsonField<String>? = null
                private var inlineContext: JsonField<InlineContext>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inlineCode: InlineCode) = apply {
                    code = inlineCode.code
                    inlineContext = inlineCode.inlineContext
                    name = inlineCode.name
                    additionalProperties = inlineCode.additionalProperties.toMutableMap()
                }

                /** The inline code to execute */
                fun code(code: String) = code(JsonField.of(code))

                /** The inline code to execute */
                fun code(code: JsonField<String>) = apply { this.code = code }

                fun inlineContext(inlineContext: InlineContext) =
                    inlineContext(JsonField.of(inlineContext))

                fun inlineContext(inlineContext: JsonField<InlineContext>) = apply {
                    this.inlineContext = inlineContext
                }

                /** The name of the inline code function */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** The name of the inline code function */
                fun name(name: Optional<String>) = name(name.orElse(null))

                /** The name of the inline code function */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): InlineCode =
                    InlineCode(
                        checkRequired("code", code),
                        checkRequired("inlineContext", inlineContext),
                        name,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class InlineContext
            @JsonCreator
            private constructor(
                @JsonProperty("runtime")
                @ExcludeMissing
                private val runtime: JsonField<Runtime> = JsonMissing.of(),
                @JsonProperty("version")
                @ExcludeMissing
                private val version: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun runtime(): Runtime = runtime.getRequired("runtime")

                fun version(): String = version.getRequired("version")

                @JsonProperty("runtime")
                @ExcludeMissing
                fun _runtime(): JsonField<Runtime> = runtime

                @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): InlineContext = apply {
                    if (validated) {
                        return@apply
                    }

                    runtime()
                    version()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [InlineContext].
                     *
                     * The following fields are required:
                     * ```java
                     * .runtime()
                     * .version()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [InlineContext]. */
                class Builder internal constructor() {

                    private var runtime: JsonField<Runtime>? = null
                    private var version: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(inlineContext: InlineContext) = apply {
                        runtime = inlineContext.runtime
                        version = inlineContext.version
                        additionalProperties = inlineContext.additionalProperties.toMutableMap()
                    }

                    fun runtime(runtime: Runtime) = runtime(JsonField.of(runtime))

                    fun runtime(runtime: JsonField<Runtime>) = apply { this.runtime = runtime }

                    fun version(version: String) = version(JsonField.of(version))

                    fun version(version: JsonField<String>) = apply { this.version = version }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): InlineContext =
                        InlineContext(
                            checkRequired("runtime", runtime),
                            checkRequired("version", version),
                            additionalProperties.toImmutable(),
                        )
                }

                class Runtime
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val NODE = of("node")

                        @JvmField val PYTHON = of("python")

                        @JvmStatic fun of(value: String) = Runtime(JsonField.of(value))
                    }

                    /** An enum containing [Runtime]'s known values. */
                    enum class Known {
                        NODE,
                        PYTHON,
                    }

                    /**
                     * An enum containing [Runtime]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Runtime] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        NODE,
                        PYTHON,
                        /**
                         * An enum member indicating that [Runtime] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            NODE -> Value.NODE
                            PYTHON -> Value.PYTHON
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws BraintrustInvalidDataException if this class instance's value is a
                     *   not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            NODE -> Known.NODE
                            PYTHON -> Known.PYTHON
                            else -> throw BraintrustInvalidDataException("Unknown Runtime: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws BraintrustInvalidDataException if this class instance's value does
                     *   not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            BraintrustInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Runtime && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is InlineContext && runtime == other.runtime && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(runtime, version, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "InlineContext{runtime=$runtime, version=$version, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InlineCode && code == other.code && inlineContext == other.inlineContext && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(code, inlineContext, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InlineCode{code=$code, inlineContext=$inlineContext, name=$name, additionalProperties=$additionalProperties}"
        }

        /** Inline prompt definition */
        @NoAutoDetect
        class InlinePrompt
        @JsonCreator
        private constructor(
            @JsonProperty("inline_prompt")
            @ExcludeMissing
            private val inlinePrompt: JsonField<PromptData> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The prompt, model, and its parameters */
            fun inlinePrompt(): Optional<PromptData> =
                Optional.ofNullable(inlinePrompt.getNullable("inline_prompt"))

            /** The name of the inline prompt */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** The prompt, model, and its parameters */
            @JsonProperty("inline_prompt")
            @ExcludeMissing
            fun _inlinePrompt(): JsonField<PromptData> = inlinePrompt

            /** The name of the inline prompt */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): InlinePrompt = apply {
                if (validated) {
                    return@apply
                }

                inlinePrompt().ifPresent { it.validate() }
                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [InlinePrompt].
                 *
                 * The following fields are required:
                 * ```java
                 * .inlinePrompt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InlinePrompt]. */
            class Builder internal constructor() {

                private var inlinePrompt: JsonField<PromptData>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inlinePrompt: InlinePrompt) = apply {
                    this.inlinePrompt = inlinePrompt.inlinePrompt
                    name = inlinePrompt.name
                    additionalProperties = inlinePrompt.additionalProperties.toMutableMap()
                }

                /** The prompt, model, and its parameters */
                fun inlinePrompt(inlinePrompt: PromptData?) =
                    inlinePrompt(JsonField.ofNullable(inlinePrompt))

                /** The prompt, model, and its parameters */
                fun inlinePrompt(inlinePrompt: Optional<PromptData>) =
                    inlinePrompt(inlinePrompt.orElse(null))

                /** The prompt, model, and its parameters */
                fun inlinePrompt(inlinePrompt: JsonField<PromptData>) = apply {
                    this.inlinePrompt = inlinePrompt
                }

                /** The name of the inline prompt */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** The name of the inline prompt */
                fun name(name: Optional<String>) = name(name.orElse(null))

                /** The name of the inline prompt */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): InlinePrompt =
                    InlinePrompt(
                        checkRequired("inlinePrompt", inlinePrompt),
                        name,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InlinePrompt && inlinePrompt == other.inlinePrompt && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(inlinePrompt, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InlinePrompt{inlinePrompt=$inlinePrompt, name=$name, additionalProperties=$additionalProperties}"
        }
    }

    /**
     * Optional settings for collecting git metadata. By default, will collect all git metadata
     * fields allowed in org-level settings.
     */
    @NoAutoDetect
    class GitMetadataSettings
    @JsonCreator
    private constructor(
        @JsonProperty("collect")
        @ExcludeMissing
        private val collect: JsonField<Collect> = JsonMissing.of(),
        @JsonProperty("fields")
        @ExcludeMissing
        private val fields: JsonField<List<Field>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun collect(): Collect = collect.getRequired("collect")

        fun fields(): Optional<List<Field>> = Optional.ofNullable(fields.getNullable("fields"))

        @JsonProperty("collect") @ExcludeMissing fun _collect(): JsonField<Collect> = collect

        @JsonProperty("fields") @ExcludeMissing fun _fields(): JsonField<List<Field>> = fields

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): GitMetadataSettings = apply {
            if (validated) {
                return@apply
            }

            collect()
            fields()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [GitMetadataSettings].
             *
             * The following fields are required:
             * ```java
             * .collect()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GitMetadataSettings]. */
        class Builder internal constructor() {

            private var collect: JsonField<Collect>? = null
            private var fields: JsonField<MutableList<Field>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(gitMetadataSettings: GitMetadataSettings) = apply {
                collect = gitMetadataSettings.collect
                fields = gitMetadataSettings.fields.map { it.toMutableList() }
                additionalProperties = gitMetadataSettings.additionalProperties.toMutableMap()
            }

            fun collect(collect: Collect) = collect(JsonField.of(collect))

            fun collect(collect: JsonField<Collect>) = apply { this.collect = collect }

            fun fields(fields: List<Field>) = fields(JsonField.of(fields))

            fun fields(fields: JsonField<List<Field>>) = apply {
                this.fields = fields.map { it.toMutableList() }
            }

            fun addField(field: Field) = apply {
                fields =
                    (fields ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fields", it).add(field)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): GitMetadataSettings =
                GitMetadataSettings(
                    checkRequired("collect", collect),
                    (fields ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        class Collect @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ALL = of("all")

                @JvmField val NONE = of("none")

                @JvmField val SOME = of("some")

                @JvmStatic fun of(value: String) = Collect(JsonField.of(value))
            }

            /** An enum containing [Collect]'s known values. */
            enum class Known {
                ALL,
                NONE,
                SOME,
            }

            /**
             * An enum containing [Collect]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Collect] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ALL,
                NONE,
                SOME,
                /**
                 * An enum member indicating that [Collect] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ALL -> Value.ALL
                    NONE -> Value.NONE
                    SOME -> Value.SOME
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BraintrustInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    ALL -> Known.ALL
                    NONE -> Known.NONE
                    SOME -> Known.SOME
                    else -> throw BraintrustInvalidDataException("Unknown Collect: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BraintrustInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BraintrustInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Collect && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Field @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val COMMIT = of("commit")

                @JvmField val BRANCH = of("branch")

                @JvmField val TAG = of("tag")

                @JvmField val DIRTY = of("dirty")

                @JvmField val AUTHOR_NAME = of("author_name")

                @JvmField val AUTHOR_EMAIL = of("author_email")

                @JvmField val COMMIT_MESSAGE = of("commit_message")

                @JvmField val COMMIT_TIME = of("commit_time")

                @JvmField val GIT_DIFF = of("git_diff")

                @JvmStatic fun of(value: String) = Field(JsonField.of(value))
            }

            /** An enum containing [Field]'s known values. */
            enum class Known {
                COMMIT,
                BRANCH,
                TAG,
                DIRTY,
                AUTHOR_NAME,
                AUTHOR_EMAIL,
                COMMIT_MESSAGE,
                COMMIT_TIME,
                GIT_DIFF,
            }

            /**
             * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Field] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMIT,
                BRANCH,
                TAG,
                DIRTY,
                AUTHOR_NAME,
                AUTHOR_EMAIL,
                COMMIT_MESSAGE,
                COMMIT_TIME,
                GIT_DIFF,
                /**
                 * An enum member indicating that [Field] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    COMMIT -> Value.COMMIT
                    BRANCH -> Value.BRANCH
                    TAG -> Value.TAG
                    DIRTY -> Value.DIRTY
                    AUTHOR_NAME -> Value.AUTHOR_NAME
                    AUTHOR_EMAIL -> Value.AUTHOR_EMAIL
                    COMMIT_MESSAGE -> Value.COMMIT_MESSAGE
                    COMMIT_TIME -> Value.COMMIT_TIME
                    GIT_DIFF -> Value.GIT_DIFF
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws BraintrustInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    COMMIT -> Known.COMMIT
                    BRANCH -> Known.BRANCH
                    TAG -> Known.TAG
                    DIRTY -> Known.DIRTY
                    AUTHOR_NAME -> Known.AUTHOR_NAME
                    AUTHOR_EMAIL -> Known.AUTHOR_EMAIL
                    COMMIT_MESSAGE -> Known.COMMIT_MESSAGE
                    COMMIT_TIME -> Known.COMMIT_TIME
                    GIT_DIFF -> Known.GIT_DIFF
                    else -> throw BraintrustInvalidDataException("Unknown Field: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws BraintrustInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BraintrustInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Field && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GitMetadataSettings && collect == other.collect && fields == other.fields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(collect, fields, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GitMetadataSettings{collect=$collect, fields=$fields, additionalProperties=$additionalProperties}"
    }

    /**
     * Optional experiment-level metadata to store about the evaluation. You can later use this to
     * slice & dice across experiments.
     */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EvalCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EvalCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
