// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.Params
import com.braintrustdata.api.core.allMaxBy
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.http.QueryParams
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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

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

    /**
     * The dataset to use
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = body.data()

    /**
     * Unique identifier for the project to run the eval in
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = body.projectId()

    /**
     * The functions to score the eval on
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scores(): List<Score> = body.scores()

    /**
     * The function to evaluate
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun task(): Task = body.task()

    /**
     * An optional experiment id to use as a base. If specified, the new experiment will be
     * summarized and compared to this experiment.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun baseExperimentId(): Optional<String> = body.baseExperimentId()

    /**
     * An optional experiment name to use as a base. If specified, the new experiment will be
     * summarized and compared to this experiment.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun baseExperimentName(): Optional<String> = body.baseExperimentName()

    /**
     * An optional name for the experiment created by this eval. If it conflicts with an existing
     * experiment, it will be suffixed with a unique identifier.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun experimentName(): Optional<String> = body.experimentName()

    /**
     * Optional settings for collecting git metadata. By default, will collect all git metadata
     * fields allowed in org-level settings.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun gitMetadataSettings(): Optional<GitMetadataSettings> = body.gitMetadataSettings()

    /**
     * Whether the experiment should be public. Defaults to false.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isPublic(): Optional<Boolean> = body.isPublic()

    /**
     * The maximum number of tasks/scorers that will be run concurrently. Defaults to undefined, in
     * which case there is no max concurrency.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxConcurrency(): Optional<Double> = body.maxConcurrency()

    /**
     * Optional experiment-level metadata to store about the evaluation. You can later use this to
     * slice & dice across experiments.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Options for tracing the evaluation
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parent(): Optional<Parent> = body.parent()

    /**
     * Metadata about the state of the repo when the experiment was created
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun repoInfo(): Optional<RepoInfo> = body.repoInfo()

    /**
     * Whether to stream the results of the eval. If true, the request will return two events: one
     * to indicate the experiment has started, and another upon completion. If false, the request
     * will return the evaluation's summary upon completion.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stream(): Optional<Boolean> = body.stream()

    /**
     * The maximum duration, in milliseconds, to run the evaluation. Defaults to undefined, in which
     * case there is no timeout.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeout(): Optional<Double> = body.timeout()

    /**
     * The number of times to run the evaluator per input. This is useful for evaluating
     * applications that have non-deterministic behavior and gives you both a stronger aggregate
     * measure and a sense of the variance in the results.
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trialCount(): Optional<Double> = body.trialCount()

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _data(): JsonField<Data> = body._data()

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _projectId(): JsonField<String> = body._projectId()

    /**
     * Returns the raw JSON value of [scores].
     *
     * Unlike [scores], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scores(): JsonField<List<Score>> = body._scores()

    /**
     * Returns the raw JSON value of [task].
     *
     * Unlike [task], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _task(): JsonField<Task> = body._task()

    /**
     * Returns the raw JSON value of [baseExperimentId].
     *
     * Unlike [baseExperimentId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _baseExperimentId(): JsonField<String> = body._baseExperimentId()

    /**
     * Returns the raw JSON value of [baseExperimentName].
     *
     * Unlike [baseExperimentName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _baseExperimentName(): JsonField<String> = body._baseExperimentName()

    /**
     * Returns the raw JSON value of [experimentName].
     *
     * Unlike [experimentName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _experimentName(): JsonField<String> = body._experimentName()

    /**
     * Returns the raw JSON value of [gitMetadataSettings].
     *
     * Unlike [gitMetadataSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _gitMetadataSettings(): JsonField<GitMetadataSettings> = body._gitMetadataSettings()

    /**
     * Returns the raw JSON value of [isPublic].
     *
     * Unlike [isPublic], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isPublic(): JsonField<Boolean> = body._isPublic()

    /**
     * Returns the raw JSON value of [maxConcurrency].
     *
     * Unlike [maxConcurrency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxConcurrency(): JsonField<Double> = body._maxConcurrency()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [parent].
     *
     * Unlike [parent], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _parent(): JsonField<Parent> = body._parent()

    /**
     * Returns the raw JSON value of [repoInfo].
     *
     * Unlike [repoInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _repoInfo(): JsonField<RepoInfo> = body._repoInfo()

    /**
     * Returns the raw JSON value of [stream].
     *
     * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stream(): JsonField<Boolean> = body._stream()

    /**
     * Returns the raw JSON value of [timeout].
     *
     * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeout(): JsonField<Double> = body._timeout()

    /**
     * Returns the raw JSON value of [trialCount].
     *
     * Unlike [trialCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _trialCount(): JsonField<Double> = body._trialCount()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

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

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [data]
         * - [projectId]
         * - [scores]
         * - [task]
         * - [baseExperimentId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The dataset to use */
        fun data(data: Data) = apply { body.data(data) }

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { body.data(data) }

        /** Alias for calling [data] with `Data.ofDatasetId(datasetId)`. */
        fun data(datasetId: Data.DatasetId) = apply { body.data(datasetId) }

        /** Alias for calling [data] with `Data.ofProjectDatasetName(projectDatasetName)`. */
        fun data(projectDatasetName: Data.ProjectDatasetName) = apply {
            body.data(projectDatasetName)
        }

        /** Alias for calling [data] with `Data.ofDatasetRows(datasetRows)`. */
        fun data(datasetRows: Data.DatasetRows) = apply { body.data(datasetRows) }

        /** Unique identifier for the project to run the eval in */
        fun projectId(projectId: String) = apply { body.projectId(projectId) }

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { body.projectId(projectId) }

        /** The functions to score the eval on */
        fun scores(scores: List<Score>) = apply { body.scores(scores) }

        /**
         * Sets [Builder.scores] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scores] with a well-typed `List<Score>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scores(scores: JsonField<List<Score>>) = apply { body.scores(scores) }

        /**
         * Adds a single [Score] to [scores].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScore(score: Score) = apply { body.addScore(score) }

        /** Alias for calling [addScore] with `Score.ofFunctionId(functionId)`. */
        fun addScore(functionId: Score.FunctionId) = apply { body.addScore(functionId) }

        /** Alias for calling [addScore] with `Score.ofProjectSlug(projectSlug)`. */
        fun addScore(projectSlug: Score.ProjectSlug) = apply { body.addScore(projectSlug) }

        /** Alias for calling [addScore] with `Score.ofGlobalFunction(globalFunction)`. */
        fun addScore(globalFunction: Score.GlobalFunction) = apply { body.addScore(globalFunction) }

        /** Alias for calling [addScore] with `Score.ofPromptSessionId(promptSessionId)`. */
        fun addScore(promptSessionId: Score.PromptSessionId) = apply {
            body.addScore(promptSessionId)
        }

        /** Alias for calling [addScore] with `Score.ofInlineCode(inlineCode)`. */
        fun addScore(inlineCode: Score.InlineCode) = apply { body.addScore(inlineCode) }

        /** Alias for calling [addScore] with `Score.ofInlinePrompt(inlinePrompt)`. */
        fun addScore(inlinePrompt: Score.InlinePrompt) = apply { body.addScore(inlinePrompt) }

        /** The function to evaluate */
        fun task(task: Task) = apply { body.task(task) }

        /**
         * Sets [Builder.task] to an arbitrary JSON value.
         *
         * You should usually call [Builder.task] with a well-typed [Task] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun task(task: JsonField<Task>) = apply { body.task(task) }

        /** Alias for calling [task] with `Task.ofFunctionId(functionId)`. */
        fun task(functionId: Task.FunctionId) = apply { body.task(functionId) }

        /** Alias for calling [task] with `Task.ofProjectSlug(projectSlug)`. */
        fun task(projectSlug: Task.ProjectSlug) = apply { body.task(projectSlug) }

        /** Alias for calling [task] with `Task.ofGlobalFunction(globalFunction)`. */
        fun task(globalFunction: Task.GlobalFunction) = apply { body.task(globalFunction) }

        /** Alias for calling [task] with `Task.ofPromptSessionId(promptSessionId)`. */
        fun task(promptSessionId: Task.PromptSessionId) = apply { body.task(promptSessionId) }

        /** Alias for calling [task] with `Task.ofInlineCode(inlineCode)`. */
        fun task(inlineCode: Task.InlineCode) = apply { body.task(inlineCode) }

        /** Alias for calling [task] with `Task.ofInlinePrompt(inlinePrompt)`. */
        fun task(inlinePrompt: Task.InlinePrompt) = apply { body.task(inlinePrompt) }

        /**
         * An optional experiment id to use as a base. If specified, the new experiment will be
         * summarized and compared to this experiment.
         */
        fun baseExperimentId(baseExperimentId: String?) = apply {
            body.baseExperimentId(baseExperimentId)
        }

        /** Alias for calling [Builder.baseExperimentId] with `baseExperimentId.orElse(null)`. */
        fun baseExperimentId(baseExperimentId: Optional<String>) =
            baseExperimentId(baseExperimentId.getOrNull())

        /**
         * Sets [Builder.baseExperimentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseExperimentId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Alias for calling [Builder.baseExperimentName] with `baseExperimentName.orElse(null)`.
         */
        fun baseExperimentName(baseExperimentName: Optional<String>) =
            baseExperimentName(baseExperimentName.getOrNull())

        /**
         * Sets [Builder.baseExperimentName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseExperimentName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.experimentName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.experimentName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Alias for calling [Builder.gitMetadataSettings] with `gitMetadataSettings.orElse(null)`.
         */
        fun gitMetadataSettings(gitMetadataSettings: Optional<GitMetadataSettings>) =
            gitMetadataSettings(gitMetadataSettings.getOrNull())

        /**
         * Sets [Builder.gitMetadataSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gitMetadataSettings] with a well-typed
         * [GitMetadataSettings] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun gitMetadataSettings(gitMetadataSettings: JsonField<GitMetadataSettings>) = apply {
            body.gitMetadataSettings(gitMetadataSettings)
        }

        /** Whether the experiment should be public. Defaults to false. */
        fun isPublic(isPublic: Boolean?) = apply { body.isPublic(isPublic) }

        /**
         * Alias for [Builder.isPublic].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isPublic(isPublic: Boolean) = isPublic(isPublic as Boolean?)

        /** Alias for calling [Builder.isPublic] with `isPublic.orElse(null)`. */
        fun isPublic(isPublic: Optional<Boolean>) = isPublic(isPublic.getOrNull())

        /**
         * Sets [Builder.isPublic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPublic] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPublic(isPublic: JsonField<Boolean>) = apply { body.isPublic(isPublic) }

        /**
         * The maximum number of tasks/scorers that will be run concurrently. Defaults to undefined,
         * in which case there is no max concurrency.
         */
        fun maxConcurrency(maxConcurrency: Double?) = apply { body.maxConcurrency(maxConcurrency) }

        /**
         * Alias for [Builder.maxConcurrency].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxConcurrency(maxConcurrency: Double) = maxConcurrency(maxConcurrency as Double?)

        /** Alias for calling [Builder.maxConcurrency] with `maxConcurrency.orElse(null)`. */
        fun maxConcurrency(maxConcurrency: Optional<Double>) =
            maxConcurrency(maxConcurrency.getOrNull())

        /**
         * Sets [Builder.maxConcurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxConcurrency] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Options for tracing the evaluation */
        fun parent(parent: Parent) = apply { body.parent(parent) }

        /**
         * Sets [Builder.parent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parent] with a well-typed [Parent] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun parent(parent: JsonField<Parent>) = apply { body.parent(parent) }

        /** Alias for calling [parent] with `Parent.ofSpanParentStruct(spanParentStruct)`. */
        fun parent(spanParentStruct: Parent.SpanParentStruct) = apply {
            body.parent(spanParentStruct)
        }

        /** Alias for calling [parent] with `Parent.ofString(string)`. */
        fun parent(string: String) = apply { body.parent(string) }

        /** Metadata about the state of the repo when the experiment was created */
        fun repoInfo(repoInfo: RepoInfo?) = apply { body.repoInfo(repoInfo) }

        /** Alias for calling [Builder.repoInfo] with `repoInfo.orElse(null)`. */
        fun repoInfo(repoInfo: Optional<RepoInfo>) = repoInfo(repoInfo.getOrNull())

        /**
         * Sets [Builder.repoInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repoInfo] with a well-typed [RepoInfo] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun repoInfo(repoInfo: JsonField<RepoInfo>) = apply { body.repoInfo(repoInfo) }

        /**
         * Whether to stream the results of the eval. If true, the request will return two events:
         * one to indicate the experiment has started, and another upon completion. If false, the
         * request will return the evaluation's summary upon completion.
         */
        fun stream(stream: Boolean) = apply { body.stream(stream) }

        /**
         * Sets [Builder.stream] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stream] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stream(stream: JsonField<Boolean>) = apply { body.stream(stream) }

        /**
         * The maximum duration, in milliseconds, to run the evaluation. Defaults to undefined, in
         * which case there is no timeout.
         */
        fun timeout(timeout: Double?) = apply { body.timeout(timeout) }

        /**
         * Alias for [Builder.timeout].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun timeout(timeout: Double) = timeout(timeout as Double?)

        /** Alias for calling [Builder.timeout] with `timeout.orElse(null)`. */
        fun timeout(timeout: Optional<Double>) = timeout(timeout.getOrNull())

        /**
         * Sets [Builder.timeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeout] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timeout(timeout: JsonField<Double>) = apply { body.timeout(timeout) }

        /**
         * The number of times to run the evaluator per input. This is useful for evaluating
         * applications that have non-deterministic behavior and gives you both a stronger aggregate
         * measure and a sense of the variance in the results.
         */
        fun trialCount(trialCount: Double?) = apply { body.trialCount(trialCount) }

        /**
         * Alias for [Builder.trialCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun trialCount(trialCount: Double) = trialCount(trialCount as Double?)

        /** Alias for calling [Builder.trialCount] with `trialCount.orElse(null)`. */
        fun trialCount(trialCount: Optional<Double>) = trialCount(trialCount.getOrNull())

        /**
         * Sets [Builder.trialCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialCount] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        /**
         * Returns an immutable instance of [EvalCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * .projectId()
         * .scores()
         * .task()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EvalCreateParams =
            EvalCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val data: JsonField<Data>,
        private val projectId: JsonField<String>,
        private val scores: JsonField<List<Score>>,
        private val task: JsonField<Task>,
        private val baseExperimentId: JsonField<String>,
        private val baseExperimentName: JsonField<String>,
        private val experimentName: JsonField<String>,
        private val gitMetadataSettings: JsonField<GitMetadataSettings>,
        private val isPublic: JsonField<Boolean>,
        private val maxConcurrency: JsonField<Double>,
        private val metadata: JsonField<Metadata>,
        private val parent: JsonField<Parent>,
        private val repoInfo: JsonField<RepoInfo>,
        private val stream: JsonField<Boolean>,
        private val timeout: JsonField<Double>,
        private val trialCount: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
            @JsonProperty("project_id")
            @ExcludeMissing
            projectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scores")
            @ExcludeMissing
            scores: JsonField<List<Score>> = JsonMissing.of(),
            @JsonProperty("task") @ExcludeMissing task: JsonField<Task> = JsonMissing.of(),
            @JsonProperty("base_experiment_id")
            @ExcludeMissing
            baseExperimentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("base_experiment_name")
            @ExcludeMissing
            baseExperimentName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("experiment_name")
            @ExcludeMissing
            experimentName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("git_metadata_settings")
            @ExcludeMissing
            gitMetadataSettings: JsonField<GitMetadataSettings> = JsonMissing.of(),
            @JsonProperty("is_public")
            @ExcludeMissing
            isPublic: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("max_concurrency")
            @ExcludeMissing
            maxConcurrency: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("parent") @ExcludeMissing parent: JsonField<Parent> = JsonMissing.of(),
            @JsonProperty("repo_info")
            @ExcludeMissing
            repoInfo: JsonField<RepoInfo> = JsonMissing.of(),
            @JsonProperty("stream") @ExcludeMissing stream: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("trial_count")
            @ExcludeMissing
            trialCount: JsonField<Double> = JsonMissing.of(),
        ) : this(
            data,
            projectId,
            scores,
            task,
            baseExperimentId,
            baseExperimentName,
            experimentName,
            gitMetadataSettings,
            isPublic,
            maxConcurrency,
            metadata,
            parent,
            repoInfo,
            stream,
            timeout,
            trialCount,
            mutableMapOf(),
        )

        /**
         * The dataset to use
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun data(): Data = data.getRequired("data")

        /**
         * Unique identifier for the project to run the eval in
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun projectId(): String = projectId.getRequired("project_id")

        /**
         * The functions to score the eval on
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scores(): List<Score> = scores.getRequired("scores")

        /**
         * The function to evaluate
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun task(): Task = task.getRequired("task")

        /**
         * An optional experiment id to use as a base. If specified, the new experiment will be
         * summarized and compared to this experiment.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun baseExperimentId(): Optional<String> =
            Optional.ofNullable(baseExperimentId.getNullable("base_experiment_id"))

        /**
         * An optional experiment name to use as a base. If specified, the new experiment will be
         * summarized and compared to this experiment.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun baseExperimentName(): Optional<String> =
            Optional.ofNullable(baseExperimentName.getNullable("base_experiment_name"))

        /**
         * An optional name for the experiment created by this eval. If it conflicts with an
         * existing experiment, it will be suffixed with a unique identifier.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun experimentName(): Optional<String> =
            Optional.ofNullable(experimentName.getNullable("experiment_name"))

        /**
         * Optional settings for collecting git metadata. By default, will collect all git metadata
         * fields allowed in org-level settings.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun gitMetadataSettings(): Optional<GitMetadataSettings> =
            Optional.ofNullable(gitMetadataSettings.getNullable("git_metadata_settings"))

        /**
         * Whether the experiment should be public. Defaults to false.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isPublic(): Optional<Boolean> = Optional.ofNullable(isPublic.getNullable("is_public"))

        /**
         * The maximum number of tasks/scorers that will be run concurrently. Defaults to undefined,
         * in which case there is no max concurrency.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxConcurrency(): Optional<Double> =
            Optional.ofNullable(maxConcurrency.getNullable("max_concurrency"))

        /**
         * Optional experiment-level metadata to store about the evaluation. You can later use this
         * to slice & dice across experiments.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /**
         * Options for tracing the evaluation
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun parent(): Optional<Parent> = Optional.ofNullable(parent.getNullable("parent"))

        /**
         * Metadata about the state of the repo when the experiment was created
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun repoInfo(): Optional<RepoInfo> = Optional.ofNullable(repoInfo.getNullable("repo_info"))

        /**
         * Whether to stream the results of the eval. If true, the request will return two events:
         * one to indicate the experiment has started, and another upon completion. If false, the
         * request will return the evaluation's summary upon completion.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun stream(): Optional<Boolean> = Optional.ofNullable(stream.getNullable("stream"))

        /**
         * The maximum duration, in milliseconds, to run the evaluation. Defaults to undefined, in
         * which case there is no timeout.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun timeout(): Optional<Double> = Optional.ofNullable(timeout.getNullable("timeout"))

        /**
         * The number of times to run the evaluator per input. This is useful for evaluating
         * applications that have non-deterministic behavior and gives you both a stronger aggregate
         * measure and a sense of the variance in the results.
         *
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun trialCount(): Optional<Double> =
            Optional.ofNullable(trialCount.getNullable("trial_count"))

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

        /**
         * Returns the raw JSON value of [projectId].
         *
         * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

        /**
         * Returns the raw JSON value of [scores].
         *
         * Unlike [scores], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scores") @ExcludeMissing fun _scores(): JsonField<List<Score>> = scores

        /**
         * Returns the raw JSON value of [task].
         *
         * Unlike [task], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("task") @ExcludeMissing fun _task(): JsonField<Task> = task

        /**
         * Returns the raw JSON value of [baseExperimentId].
         *
         * Unlike [baseExperimentId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("base_experiment_id")
        @ExcludeMissing
        fun _baseExperimentId(): JsonField<String> = baseExperimentId

        /**
         * Returns the raw JSON value of [baseExperimentName].
         *
         * Unlike [baseExperimentName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("base_experiment_name")
        @ExcludeMissing
        fun _baseExperimentName(): JsonField<String> = baseExperimentName

        /**
         * Returns the raw JSON value of [experimentName].
         *
         * Unlike [experimentName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("experiment_name")
        @ExcludeMissing
        fun _experimentName(): JsonField<String> = experimentName

        /**
         * Returns the raw JSON value of [gitMetadataSettings].
         *
         * Unlike [gitMetadataSettings], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("git_metadata_settings")
        @ExcludeMissing
        fun _gitMetadataSettings(): JsonField<GitMetadataSettings> = gitMetadataSettings

        /**
         * Returns the raw JSON value of [isPublic].
         *
         * Unlike [isPublic], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_public") @ExcludeMissing fun _isPublic(): JsonField<Boolean> = isPublic

        /**
         * Returns the raw JSON value of [maxConcurrency].
         *
         * Unlike [maxConcurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_concurrency")
        @ExcludeMissing
        fun _maxConcurrency(): JsonField<Double> = maxConcurrency

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [parent].
         *
         * Unlike [parent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parent") @ExcludeMissing fun _parent(): JsonField<Parent> = parent

        /**
         * Returns the raw JSON value of [repoInfo].
         *
         * Unlike [repoInfo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("repo_info") @ExcludeMissing fun _repoInfo(): JsonField<RepoInfo> = repoInfo

        /**
         * Returns the raw JSON value of [stream].
         *
         * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stream") @ExcludeMissing fun _stream(): JsonField<Boolean> = stream

        /**
         * Returns the raw JSON value of [timeout].
         *
         * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Double> = timeout

        /**
         * Returns the raw JSON value of [trialCount].
         *
         * Unlike [trialCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trial_count")
        @ExcludeMissing
        fun _trialCount(): JsonField<Double> = trialCount

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

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
            private var parent: JsonField<Parent> = JsonMissing.of()
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
                parent = body.parent
                repoInfo = body.repoInfo
                stream = body.stream
                timeout = body.timeout
                trialCount = body.trialCount
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The dataset to use */
            fun data(data: Data) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed [Data] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun data(data: JsonField<Data>) = apply { this.data = data }

            /** Alias for calling [data] with `Data.ofDatasetId(datasetId)`. */
            fun data(datasetId: Data.DatasetId) = data(Data.ofDatasetId(datasetId))

            /** Alias for calling [data] with `Data.ofProjectDatasetName(projectDatasetName)`. */
            fun data(projectDatasetName: Data.ProjectDatasetName) =
                data(Data.ofProjectDatasetName(projectDatasetName))

            /** Alias for calling [data] with `Data.ofDatasetRows(datasetRows)`. */
            fun data(datasetRows: Data.DatasetRows) = data(Data.ofDatasetRows(datasetRows))

            /** Unique identifier for the project to run the eval in */
            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /**
             * Sets [Builder.projectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            /** The functions to score the eval on */
            fun scores(scores: List<Score>) = scores(JsonField.of(scores))

            /**
             * Sets [Builder.scores] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scores] with a well-typed `List<Score>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scores(scores: JsonField<List<Score>>) = apply {
                this.scores = scores.map { it.toMutableList() }
            }

            /**
             * Adds a single [Score] to [scores].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addScore(score: Score) = apply {
                scores =
                    (scores ?: JsonField.of(mutableListOf())).also {
                        checkKnown("scores", it).add(score)
                    }
            }

            /** Alias for calling [addScore] with `Score.ofFunctionId(functionId)`. */
            fun addScore(functionId: Score.FunctionId) = addScore(Score.ofFunctionId(functionId))

            /** Alias for calling [addScore] with `Score.ofProjectSlug(projectSlug)`. */
            fun addScore(projectSlug: Score.ProjectSlug) =
                addScore(Score.ofProjectSlug(projectSlug))

            /** Alias for calling [addScore] with `Score.ofGlobalFunction(globalFunction)`. */
            fun addScore(globalFunction: Score.GlobalFunction) =
                addScore(Score.ofGlobalFunction(globalFunction))

            /** Alias for calling [addScore] with `Score.ofPromptSessionId(promptSessionId)`. */
            fun addScore(promptSessionId: Score.PromptSessionId) =
                addScore(Score.ofPromptSessionId(promptSessionId))

            /** Alias for calling [addScore] with `Score.ofInlineCode(inlineCode)`. */
            fun addScore(inlineCode: Score.InlineCode) = addScore(Score.ofInlineCode(inlineCode))

            /** Alias for calling [addScore] with `Score.ofInlinePrompt(inlinePrompt)`. */
            fun addScore(inlinePrompt: Score.InlinePrompt) =
                addScore(Score.ofInlinePrompt(inlinePrompt))

            /** The function to evaluate */
            fun task(task: Task) = task(JsonField.of(task))

            /**
             * Sets [Builder.task] to an arbitrary JSON value.
             *
             * You should usually call [Builder.task] with a well-typed [Task] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun task(task: JsonField<Task>) = apply { this.task = task }

            /** Alias for calling [task] with `Task.ofFunctionId(functionId)`. */
            fun task(functionId: Task.FunctionId) = task(Task.ofFunctionId(functionId))

            /** Alias for calling [task] with `Task.ofProjectSlug(projectSlug)`. */
            fun task(projectSlug: Task.ProjectSlug) = task(Task.ofProjectSlug(projectSlug))

            /** Alias for calling [task] with `Task.ofGlobalFunction(globalFunction)`. */
            fun task(globalFunction: Task.GlobalFunction) =
                task(Task.ofGlobalFunction(globalFunction))

            /** Alias for calling [task] with `Task.ofPromptSessionId(promptSessionId)`. */
            fun task(promptSessionId: Task.PromptSessionId) =
                task(Task.ofPromptSessionId(promptSessionId))

            /** Alias for calling [task] with `Task.ofInlineCode(inlineCode)`. */
            fun task(inlineCode: Task.InlineCode) = task(Task.ofInlineCode(inlineCode))

            /** Alias for calling [task] with `Task.ofInlinePrompt(inlinePrompt)`. */
            fun task(inlinePrompt: Task.InlinePrompt) = task(Task.ofInlinePrompt(inlinePrompt))

            /**
             * An optional experiment id to use as a base. If specified, the new experiment will be
             * summarized and compared to this experiment.
             */
            fun baseExperimentId(baseExperimentId: String?) =
                baseExperimentId(JsonField.ofNullable(baseExperimentId))

            /**
             * Alias for calling [Builder.baseExperimentId] with `baseExperimentId.orElse(null)`.
             */
            fun baseExperimentId(baseExperimentId: Optional<String>) =
                baseExperimentId(baseExperimentId.getOrNull())

            /**
             * Sets [Builder.baseExperimentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baseExperimentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Alias for calling [Builder.baseExperimentName] with
             * `baseExperimentName.orElse(null)`.
             */
            fun baseExperimentName(baseExperimentName: Optional<String>) =
                baseExperimentName(baseExperimentName.getOrNull())

            /**
             * Sets [Builder.baseExperimentName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baseExperimentName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.experimentName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.experimentName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Alias for calling [Builder.gitMetadataSettings] with
             * `gitMetadataSettings.orElse(null)`.
             */
            fun gitMetadataSettings(gitMetadataSettings: Optional<GitMetadataSettings>) =
                gitMetadataSettings(gitMetadataSettings.getOrNull())

            /**
             * Sets [Builder.gitMetadataSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gitMetadataSettings] with a well-typed
             * [GitMetadataSettings] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun gitMetadataSettings(gitMetadataSettings: JsonField<GitMetadataSettings>) = apply {
                this.gitMetadataSettings = gitMetadataSettings
            }

            /** Whether the experiment should be public. Defaults to false. */
            fun isPublic(isPublic: Boolean?) = isPublic(JsonField.ofNullable(isPublic))

            /**
             * Alias for [Builder.isPublic].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun isPublic(isPublic: Boolean) = isPublic(isPublic as Boolean?)

            /** Alias for calling [Builder.isPublic] with `isPublic.orElse(null)`. */
            fun isPublic(isPublic: Optional<Boolean>) = isPublic(isPublic.getOrNull())

            /**
             * Sets [Builder.isPublic] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isPublic] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isPublic(isPublic: JsonField<Boolean>) = apply { this.isPublic = isPublic }

            /**
             * The maximum number of tasks/scorers that will be run concurrently. Defaults to
             * undefined, in which case there is no max concurrency.
             */
            fun maxConcurrency(maxConcurrency: Double?) =
                maxConcurrency(JsonField.ofNullable(maxConcurrency))

            /**
             * Alias for [Builder.maxConcurrency].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxConcurrency(maxConcurrency: Double) = maxConcurrency(maxConcurrency as Double?)

            /** Alias for calling [Builder.maxConcurrency] with `maxConcurrency.orElse(null)`. */
            fun maxConcurrency(maxConcurrency: Optional<Double>) =
                maxConcurrency(maxConcurrency.getOrNull())

            /**
             * Sets [Builder.maxConcurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxConcurrency] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Options for tracing the evaluation */
            fun parent(parent: Parent) = parent(JsonField.of(parent))

            /**
             * Sets [Builder.parent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parent] with a well-typed [Parent] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parent(parent: JsonField<Parent>) = apply { this.parent = parent }

            /** Alias for calling [parent] with `Parent.ofSpanParentStruct(spanParentStruct)`. */
            fun parent(spanParentStruct: Parent.SpanParentStruct) =
                parent(Parent.ofSpanParentStruct(spanParentStruct))

            /** Alias for calling [parent] with `Parent.ofString(string)`. */
            fun parent(string: String) = parent(Parent.ofString(string))

            /** Metadata about the state of the repo when the experiment was created */
            fun repoInfo(repoInfo: RepoInfo?) = repoInfo(JsonField.ofNullable(repoInfo))

            /** Alias for calling [Builder.repoInfo] with `repoInfo.orElse(null)`. */
            fun repoInfo(repoInfo: Optional<RepoInfo>) = repoInfo(repoInfo.getOrNull())

            /**
             * Sets [Builder.repoInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.repoInfo] with a well-typed [RepoInfo] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun repoInfo(repoInfo: JsonField<RepoInfo>) = apply { this.repoInfo = repoInfo }

            /**
             * Whether to stream the results of the eval. If true, the request will return two
             * events: one to indicate the experiment has started, and another upon completion. If
             * false, the request will return the evaluation's summary upon completion.
             */
            fun stream(stream: Boolean) = stream(JsonField.of(stream))

            /**
             * Sets [Builder.stream] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stream] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stream(stream: JsonField<Boolean>) = apply { this.stream = stream }

            /**
             * The maximum duration, in milliseconds, to run the evaluation. Defaults to undefined,
             * in which case there is no timeout.
             */
            fun timeout(timeout: Double?) = timeout(JsonField.ofNullable(timeout))

            /**
             * Alias for [Builder.timeout].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun timeout(timeout: Double) = timeout(timeout as Double?)

            /** Alias for calling [Builder.timeout] with `timeout.orElse(null)`. */
            fun timeout(timeout: Optional<Double>) = timeout(timeout.getOrNull())

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout(timeout: JsonField<Double>) = apply { this.timeout = timeout }

            /**
             * The number of times to run the evaluator per input. This is useful for evaluating
             * applications that have non-deterministic behavior and gives you both a stronger
             * aggregate measure and a sense of the variance in the results.
             */
            fun trialCount(trialCount: Double?) = trialCount(JsonField.ofNullable(trialCount))

            /**
             * Alias for [Builder.trialCount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun trialCount(trialCount: Double) = trialCount(trialCount as Double?)

            /** Alias for calling [Builder.trialCount] with `trialCount.orElse(null)`. */
            fun trialCount(trialCount: Optional<Double>) = trialCount(trialCount.getOrNull())

            /**
             * Sets [Builder.trialCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialCount] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .data()
             * .projectId()
             * .scores()
             * .task()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
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
                    parent,
                    repoInfo,
                    stream,
                    timeout,
                    trialCount,
                    additionalProperties.toMutableMap(),
                )
        }

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
            parent().ifPresent { it.validate() }
            repoInfo().ifPresent { it.validate() }
            stream()
            timeout()
            trialCount()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BraintrustInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (data.asKnown().getOrNull()?.validity() ?: 0) +
                (if (projectId.asKnown().isPresent) 1 else 0) +
                (scores.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (task.asKnown().getOrNull()?.validity() ?: 0) +
                (if (baseExperimentId.asKnown().isPresent) 1 else 0) +
                (if (baseExperimentName.asKnown().isPresent) 1 else 0) +
                (if (experimentName.asKnown().isPresent) 1 else 0) +
                (gitMetadataSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (if (isPublic.asKnown().isPresent) 1 else 0) +
                (if (maxConcurrency.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (parent.asKnown().getOrNull()?.validity() ?: 0) +
                (repoInfo.asKnown().getOrNull()?.validity() ?: 0) +
                (if (stream.asKnown().isPresent) 1 else 0) +
                (if (timeout.asKnown().isPresent) 1 else 0) +
                (if (trialCount.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && data == other.data && projectId == other.projectId && scores == other.scores && task == other.task && baseExperimentId == other.baseExperimentId && baseExperimentName == other.baseExperimentName && experimentName == other.experimentName && gitMetadataSettings == other.gitMetadataSettings && isPublic == other.isPublic && maxConcurrency == other.maxConcurrency && metadata == other.metadata && parent == other.parent && repoInfo == other.repoInfo && stream == other.stream && timeout == other.timeout && trialCount == other.trialCount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(data, projectId, scores, task, baseExperimentId, baseExperimentName, experimentName, gitMetadataSettings, isPublic, maxConcurrency, metadata, parent, repoInfo, stream, timeout, trialCount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{data=$data, projectId=$projectId, scores=$scores, task=$task, baseExperimentId=$baseExperimentId, baseExperimentName=$baseExperimentName, experimentName=$experimentName, gitMetadataSettings=$gitMetadataSettings, isPublic=$isPublic, maxConcurrency=$maxConcurrency, metadata=$metadata, parent=$parent, repoInfo=$repoInfo, stream=$stream, timeout=$timeout, trialCount=$trialCount, additionalProperties=$additionalProperties}"
    }

    /** The dataset to use */
    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val datasetId: DatasetId? = null,
        private val projectDatasetName: ProjectDatasetName? = null,
        private val datasetRows: DatasetRows? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Dataset id */
        fun datasetId(): Optional<DatasetId> = Optional.ofNullable(datasetId)

        /** Project and dataset name */
        fun projectDatasetName(): Optional<ProjectDatasetName> =
            Optional.ofNullable(projectDatasetName)

        /** Dataset rows */
        fun datasetRows(): Optional<DatasetRows> = Optional.ofNullable(datasetRows)

        fun isDatasetId(): Boolean = datasetId != null

        fun isProjectDatasetName(): Boolean = projectDatasetName != null

        fun isDatasetRows(): Boolean = datasetRows != null

        /** Dataset id */
        fun asDatasetId(): DatasetId = datasetId.getOrThrow("datasetId")

        /** Project and dataset name */
        fun asProjectDatasetName(): ProjectDatasetName =
            projectDatasetName.getOrThrow("projectDatasetName")

        /** Dataset rows */
        fun asDatasetRows(): DatasetRows = datasetRows.getOrThrow("datasetRows")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                datasetId != null -> visitor.visitDatasetId(datasetId)
                projectDatasetName != null -> visitor.visitProjectDatasetName(projectDatasetName)
                datasetRows != null -> visitor.visitDatasetRows(datasetRows)
                else -> visitor.unknown(_json)
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

                    override fun visitDatasetRows(datasetRows: DatasetRows) {
                        datasetRows.validate()
                    }
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BraintrustInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitDatasetId(datasetId: DatasetId) = datasetId.validity()

                    override fun visitProjectDatasetName(projectDatasetName: ProjectDatasetName) =
                        projectDatasetName.validity()

                    override fun visitDatasetRows(datasetRows: DatasetRows) = datasetRows.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && datasetId == other.datasetId && projectDatasetName == other.projectDatasetName && datasetRows == other.datasetRows /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(datasetId, projectDatasetName, datasetRows) /* spotless:on */

        override fun toString(): String =
            when {
                datasetId != null -> "Data{datasetId=$datasetId}"
                projectDatasetName != null -> "Data{projectDatasetName=$projectDatasetName}"
                datasetRows != null -> "Data{datasetRows=$datasetRows}"
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

            /** Dataset rows */
            @JvmStatic fun ofDatasetRows(datasetRows: DatasetRows) = Data(datasetRows = datasetRows)
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            /** Dataset id */
            fun visitDatasetId(datasetId: DatasetId): T

            /** Project and dataset name */
            fun visitProjectDatasetName(projectDatasetName: ProjectDatasetName): T

            /** Dataset rows */
            fun visitDatasetRows(datasetRows: DatasetRows): T

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<DatasetId>())?.let {
                                Data(datasetId = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ProjectDatasetName>())?.let {
                                Data(projectDatasetName = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DatasetRows>())?.let {
                                Data(datasetRows = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Data(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
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
                    value.datasetRows != null -> generator.writeObject(value.datasetRows)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Data")
                }
            }
        }

        /** Dataset id */
        class DatasetId
        private constructor(
            private val datasetId: JsonField<String>,
            private val _internalBtql: JsonField<_InternalBtql>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("dataset_id")
                @ExcludeMissing
                datasetId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("_internal_btql")
                @ExcludeMissing
                _internalBtql: JsonField<_InternalBtql> = JsonMissing.of(),
            ) : this(datasetId, _internalBtql, mutableMapOf())

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun datasetId(): String = datasetId.getRequired("dataset_id")

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun _internalBtql(): Optional<_InternalBtql> =
                Optional.ofNullable(_internalBtql.getNullable("_internal_btql"))

            /**
             * Returns the raw JSON value of [datasetId].
             *
             * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dataset_id")
            @ExcludeMissing
            fun _datasetId(): JsonField<String> = datasetId

            /**
             * Returns the raw JSON value of [_internalBtql].
             *
             * Unlike [_internalBtql], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("_internal_btql")
            @ExcludeMissing
            fun __internalBtql(): JsonField<_InternalBtql> = _internalBtql

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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
                private var _internalBtql: JsonField<_InternalBtql> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(datasetId: DatasetId) = apply {
                    this.datasetId = datasetId.datasetId
                    _internalBtql = datasetId._internalBtql
                    additionalProperties = datasetId.additionalProperties.toMutableMap()
                }

                fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

                /**
                 * Sets [Builder.datasetId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.datasetId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

                fun _internalBtql(_internalBtql: _InternalBtql?) =
                    _internalBtql(JsonField.ofNullable(_internalBtql))

                /** Alias for calling [Builder._internalBtql] with `_internalBtql.orElse(null)`. */
                fun _internalBtql(_internalBtql: Optional<_InternalBtql>) =
                    _internalBtql(_internalBtql.getOrNull())

                /**
                 * Sets [Builder._internalBtql] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder._internalBtql] with a well-typed [_InternalBtql]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun _internalBtql(_internalBtql: JsonField<_InternalBtql>) = apply {
                    this._internalBtql = _internalBtql
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

                /**
                 * Returns an immutable instance of [DatasetId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .datasetId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DatasetId =
                    DatasetId(
                        checkRequired("datasetId", datasetId),
                        _internalBtql,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DatasetId = apply {
                if (validated) {
                    return@apply
                }

                datasetId()
                _internalBtql().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (datasetId.asKnown().isPresent) 1 else 0) +
                    (_internalBtql.asKnown().getOrNull()?.validity() ?: 0)

            class _InternalBtql
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [_InternalBtql].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [_InternalBtql]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(_internalBtql: _InternalBtql) = apply {
                        additionalProperties = _internalBtql.additionalProperties.toMutableMap()
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

                    /**
                     * Returns an immutable instance of [_InternalBtql].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): _InternalBtql = _InternalBtql(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): _InternalBtql = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: BraintrustInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is _InternalBtql && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "_InternalBtql{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DatasetId && datasetId == other.datasetId && _internalBtql == other._internalBtql && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(datasetId, _internalBtql, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DatasetId{datasetId=$datasetId, _internalBtql=$_internalBtql, additionalProperties=$additionalProperties}"
        }

        /** Project and dataset name */
        class ProjectDatasetName
        private constructor(
            private val datasetName: JsonField<String>,
            private val projectName: JsonField<String>,
            private val _internalBtql: JsonField<_InternalBtql>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("dataset_name")
                @ExcludeMissing
                datasetName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("project_name")
                @ExcludeMissing
                projectName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("_internal_btql")
                @ExcludeMissing
                _internalBtql: JsonField<_InternalBtql> = JsonMissing.of(),
            ) : this(datasetName, projectName, _internalBtql, mutableMapOf())

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun datasetName(): String = datasetName.getRequired("dataset_name")

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun projectName(): String = projectName.getRequired("project_name")

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun _internalBtql(): Optional<_InternalBtql> =
                Optional.ofNullable(_internalBtql.getNullable("_internal_btql"))

            /**
             * Returns the raw JSON value of [datasetName].
             *
             * Unlike [datasetName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dataset_name")
            @ExcludeMissing
            fun _datasetName(): JsonField<String> = datasetName

            /**
             * Returns the raw JSON value of [projectName].
             *
             * Unlike [projectName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("project_name")
            @ExcludeMissing
            fun _projectName(): JsonField<String> = projectName

            /**
             * Returns the raw JSON value of [_internalBtql].
             *
             * Unlike [_internalBtql], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("_internal_btql")
            @ExcludeMissing
            fun __internalBtql(): JsonField<_InternalBtql> = _internalBtql

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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
                private var _internalBtql: JsonField<_InternalBtql> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(projectDatasetName: ProjectDatasetName) = apply {
                    datasetName = projectDatasetName.datasetName
                    projectName = projectDatasetName.projectName
                    _internalBtql = projectDatasetName._internalBtql
                    additionalProperties = projectDatasetName.additionalProperties.toMutableMap()
                }

                fun datasetName(datasetName: String) = datasetName(JsonField.of(datasetName))

                /**
                 * Sets [Builder.datasetName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.datasetName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun datasetName(datasetName: JsonField<String>) = apply {
                    this.datasetName = datasetName
                }

                fun projectName(projectName: String) = projectName(JsonField.of(projectName))

                /**
                 * Sets [Builder.projectName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.projectName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun projectName(projectName: JsonField<String>) = apply {
                    this.projectName = projectName
                }

                fun _internalBtql(_internalBtql: _InternalBtql?) =
                    _internalBtql(JsonField.ofNullable(_internalBtql))

                /** Alias for calling [Builder._internalBtql] with `_internalBtql.orElse(null)`. */
                fun _internalBtql(_internalBtql: Optional<_InternalBtql>) =
                    _internalBtql(_internalBtql.getOrNull())

                /**
                 * Sets [Builder._internalBtql] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder._internalBtql] with a well-typed [_InternalBtql]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun _internalBtql(_internalBtql: JsonField<_InternalBtql>) = apply {
                    this._internalBtql = _internalBtql
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

                /**
                 * Returns an immutable instance of [ProjectDatasetName].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .datasetName()
                 * .projectName()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ProjectDatasetName =
                    ProjectDatasetName(
                        checkRequired("datasetName", datasetName),
                        checkRequired("projectName", projectName),
                        _internalBtql,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ProjectDatasetName = apply {
                if (validated) {
                    return@apply
                }

                datasetName()
                projectName()
                _internalBtql().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (datasetName.asKnown().isPresent) 1 else 0) +
                    (if (projectName.asKnown().isPresent) 1 else 0) +
                    (_internalBtql.asKnown().getOrNull()?.validity() ?: 0)

            class _InternalBtql
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [_InternalBtql].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [_InternalBtql]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(_internalBtql: _InternalBtql) = apply {
                        additionalProperties = _internalBtql.additionalProperties.toMutableMap()
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

                    /**
                     * Returns an immutable instance of [_InternalBtql].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): _InternalBtql = _InternalBtql(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): _InternalBtql = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: BraintrustInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is _InternalBtql && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "_InternalBtql{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ProjectDatasetName && datasetName == other.datasetName && projectName == other.projectName && _internalBtql == other._internalBtql && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(datasetName, projectName, _internalBtql, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProjectDatasetName{datasetName=$datasetName, projectName=$projectName, _internalBtql=$_internalBtql, additionalProperties=$additionalProperties}"
        }

        /** Dataset rows */
        class DatasetRows
        private constructor(
            private val data: JsonField<List<JsonValue?>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("data")
                @ExcludeMissing
                data: JsonField<List<JsonValue?>> = JsonMissing.of()
            ) : this(data, mutableMapOf())

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun data(): List<JsonValue?> = data.getRequired("data")

            /**
             * Returns the raw JSON value of [data].
             *
             * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<JsonValue?>> = data

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [DatasetRows].
                 *
                 * The following fields are required:
                 * ```java
                 * .data()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DatasetRows]. */
            class Builder internal constructor() {

                private var data: JsonField<MutableList<JsonValue?>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(datasetRows: DatasetRows) = apply {
                    data = datasetRows.data.map { it.toMutableList() }
                    additionalProperties = datasetRows.additionalProperties.toMutableMap()
                }

                fun data(data: List<JsonValue?>) = data(JsonField.of(data))

                /**
                 * Sets [Builder.data] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.data] with a well-typed `List<JsonValue?>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun data(data: JsonField<List<JsonValue?>>) = apply {
                    this.data = data.map { it.toMutableList() }
                }

                /**
                 * Adds a single [JsonValue] to [Builder.data].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addData(data: JsonValue) = apply {
                    this.data =
                        (this.data ?: JsonField.of(mutableListOf())).also {
                            checkKnown("data", it).add(data)
                        }
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

                /**
                 * Returns an immutable instance of [DatasetRows].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .data()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DatasetRows =
                    DatasetRows(
                        checkRequired("data", data).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DatasetRows = apply {
                if (validated) {
                    return@apply
                }

                data()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (data.asKnown().getOrNull()?.sumOf { (if (it == null) 0 else 1).toInt() } ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DatasetRows && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DatasetRows{data=$data, additionalProperties=$additionalProperties}"
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

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                functionId != null -> visitor.visitFunctionId(functionId)
                projectSlug != null -> visitor.visitProjectSlug(projectSlug)
                globalFunction != null -> visitor.visitGlobalFunction(globalFunction)
                promptSessionId != null -> visitor.visitPromptSessionId(promptSessionId)
                inlineCode != null -> visitor.visitInlineCode(inlineCode)
                inlinePrompt != null -> visitor.visitInlinePrompt(inlinePrompt)
                else -> visitor.unknown(_json)
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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BraintrustInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitFunctionId(functionId: FunctionId) = functionId.validity()

                    override fun visitProjectSlug(projectSlug: ProjectSlug) = projectSlug.validity()

                    override fun visitGlobalFunction(globalFunction: GlobalFunction) =
                        globalFunction.validity()

                    override fun visitPromptSessionId(promptSessionId: PromptSessionId) =
                        promptSessionId.validity()

                    override fun visitInlineCode(inlineCode: InlineCode) = inlineCode.validity()

                    override fun visitInlinePrompt(inlinePrompt: InlinePrompt) =
                        inlinePrompt.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<FunctionId>())?.let {
                                Score(functionId = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ProjectSlug>())?.let {
                                Score(projectSlug = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<GlobalFunction>())?.let {
                                Score(globalFunction = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PromptSessionId>())?.let {
                                Score(promptSessionId = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<InlineCode>())?.let {
                                Score(inlineCode = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<InlinePrompt>())?.let {
                                Score(inlinePrompt = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Score(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
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
        class FunctionId
        private constructor(
            private val functionId: JsonField<String>,
            private val version: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("function_id")
                @ExcludeMissing
                functionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("version")
                @ExcludeMissing
                version: JsonField<String> = JsonMissing.of(),
            ) : this(functionId, version, mutableMapOf())

            /**
             * The ID of the function
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun functionId(): String = functionId.getRequired("function_id")

            /**
             * The version of the function
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

            /**
             * Returns the raw JSON value of [functionId].
             *
             * Unlike [functionId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("function_id")
            @ExcludeMissing
            fun _functionId(): JsonField<String> = functionId

            /**
             * Returns the raw JSON value of [version].
             *
             * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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

                /**
                 * Sets [Builder.functionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.functionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun functionId(functionId: JsonField<String>) = apply {
                    this.functionId = functionId
                }

                /** The version of the function */
                fun version(version: String) = version(JsonField.of(version))

                /**
                 * Sets [Builder.version] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.version] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [FunctionId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .functionId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): FunctionId =
                    FunctionId(
                        checkRequired("functionId", functionId),
                        version,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): FunctionId = apply {
                if (validated) {
                    return@apply
                }

                functionId()
                version()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (functionId.asKnown().isPresent) 1 else 0) +
                    (if (version.asKnown().isPresent) 1 else 0)

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
        class ProjectSlug
        private constructor(
            private val projectName: JsonField<String>,
            private val slug: JsonField<String>,
            private val version: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("project_name")
                @ExcludeMissing
                projectName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
                @JsonProperty("version")
                @ExcludeMissing
                version: JsonField<String> = JsonMissing.of(),
            ) : this(projectName, slug, version, mutableMapOf())

            /**
             * The name of the project containing the function
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun projectName(): String = projectName.getRequired("project_name")

            /**
             * The slug of the function
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun slug(): String = slug.getRequired("slug")

            /**
             * The version of the function
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

            /**
             * Returns the raw JSON value of [projectName].
             *
             * Unlike [projectName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("project_name")
            @ExcludeMissing
            fun _projectName(): JsonField<String> = projectName

            /**
             * Returns the raw JSON value of [slug].
             *
             * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

            /**
             * Returns the raw JSON value of [version].
             *
             * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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

                /**
                 * Sets [Builder.projectName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.projectName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun projectName(projectName: JsonField<String>) = apply {
                    this.projectName = projectName
                }

                /** The slug of the function */
                fun slug(slug: String) = slug(JsonField.of(slug))

                /**
                 * Sets [Builder.slug] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.slug] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun slug(slug: JsonField<String>) = apply { this.slug = slug }

                /** The version of the function */
                fun version(version: String) = version(JsonField.of(version))

                /**
                 * Sets [Builder.version] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.version] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [ProjectSlug].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .projectName()
                 * .slug()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ProjectSlug =
                    ProjectSlug(
                        checkRequired("projectName", projectName),
                        checkRequired("slug", slug),
                        version,
                        additionalProperties.toMutableMap(),
                    )
            }

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

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (projectName.asKnown().isPresent) 1 else 0) +
                    (if (slug.asKnown().isPresent) 1 else 0) +
                    (if (version.asKnown().isPresent) 1 else 0)

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
        class GlobalFunction
        private constructor(
            private val globalFunction: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("global_function")
                @ExcludeMissing
                globalFunction: JsonField<String> = JsonMissing.of()
            ) : this(globalFunction, mutableMapOf())

            /**
             * The name of the global function. Currently, the global namespace includes the
             * functions in autoevals
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun globalFunction(): String = globalFunction.getRequired("global_function")

            /**
             * Returns the raw JSON value of [globalFunction].
             *
             * Unlike [globalFunction], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("global_function")
            @ExcludeMissing
            fun _globalFunction(): JsonField<String> = globalFunction

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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
                 * Sets [Builder.globalFunction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.globalFunction] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /**
                 * Returns an immutable instance of [GlobalFunction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .globalFunction()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): GlobalFunction =
                    GlobalFunction(
                        checkRequired("globalFunction", globalFunction),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): GlobalFunction = apply {
                if (validated) {
                    return@apply
                }

                globalFunction()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int = (if (globalFunction.asKnown().isPresent) 1 else 0)

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
        class PromptSessionId
        private constructor(
            private val promptSessionFunctionId: JsonField<String>,
            private val promptSessionId: JsonField<String>,
            private val version: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("prompt_session_function_id")
                @ExcludeMissing
                promptSessionFunctionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("prompt_session_id")
                @ExcludeMissing
                promptSessionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("version")
                @ExcludeMissing
                version: JsonField<String> = JsonMissing.of(),
            ) : this(promptSessionFunctionId, promptSessionId, version, mutableMapOf())

            /**
             * The ID of the function in the prompt session
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun promptSessionFunctionId(): String =
                promptSessionFunctionId.getRequired("prompt_session_function_id")

            /**
             * The ID of the prompt session
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun promptSessionId(): String = promptSessionId.getRequired("prompt_session_id")

            /**
             * The version of the function
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

            /**
             * Returns the raw JSON value of [promptSessionFunctionId].
             *
             * Unlike [promptSessionFunctionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("prompt_session_function_id")
            @ExcludeMissing
            fun _promptSessionFunctionId(): JsonField<String> = promptSessionFunctionId

            /**
             * Returns the raw JSON value of [promptSessionId].
             *
             * Unlike [promptSessionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("prompt_session_id")
            @ExcludeMissing
            fun _promptSessionId(): JsonField<String> = promptSessionId

            /**
             * Returns the raw JSON value of [version].
             *
             * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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

                /**
                 * Sets [Builder.promptSessionFunctionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.promptSessionFunctionId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun promptSessionFunctionId(promptSessionFunctionId: JsonField<String>) = apply {
                    this.promptSessionFunctionId = promptSessionFunctionId
                }

                /** The ID of the prompt session */
                fun promptSessionId(promptSessionId: String) =
                    promptSessionId(JsonField.of(promptSessionId))

                /**
                 * Sets [Builder.promptSessionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.promptSessionId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun promptSessionId(promptSessionId: JsonField<String>) = apply {
                    this.promptSessionId = promptSessionId
                }

                /** The version of the function */
                fun version(version: String) = version(JsonField.of(version))

                /**
                 * Sets [Builder.version] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.version] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [PromptSessionId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .promptSessionFunctionId()
                 * .promptSessionId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PromptSessionId =
                    PromptSessionId(
                        checkRequired("promptSessionFunctionId", promptSessionFunctionId),
                        checkRequired("promptSessionId", promptSessionId),
                        version,
                        additionalProperties.toMutableMap(),
                    )
            }

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

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (promptSessionFunctionId.asKnown().isPresent) 1 else 0) +
                    (if (promptSessionId.asKnown().isPresent) 1 else 0) +
                    (if (version.asKnown().isPresent) 1 else 0)

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
        class InlineCode
        private constructor(
            private val code: JsonField<String>,
            private val inlineContext: JsonField<InlineContext>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
                @JsonProperty("inline_context")
                @ExcludeMissing
                inlineContext: JsonField<InlineContext> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(code, inlineContext, name, mutableMapOf())

            /**
             * The inline code to execute
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun code(): String = code.getRequired("code")

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun inlineContext(): InlineContext = inlineContext.getRequired("inline_context")

            /**
             * The name of the inline code function
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /**
             * Returns the raw JSON value of [code].
             *
             * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

            /**
             * Returns the raw JSON value of [inlineContext].
             *
             * Unlike [inlineContext], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("inline_context")
            @ExcludeMissing
            fun _inlineContext(): JsonField<InlineContext> = inlineContext

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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

                /**
                 * Sets [Builder.code] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.code] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<String>) = apply { this.code = code }

                fun inlineContext(inlineContext: InlineContext) =
                    inlineContext(JsonField.of(inlineContext))

                /**
                 * Sets [Builder.inlineContext] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inlineContext] with a well-typed [InlineContext]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun inlineContext(inlineContext: JsonField<InlineContext>) = apply {
                    this.inlineContext = inlineContext
                }

                /** The name of the inline code function */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [InlineCode].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .code()
                 * .inlineContext()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InlineCode =
                    InlineCode(
                        checkRequired("code", code),
                        checkRequired("inlineContext", inlineContext),
                        name,
                        additionalProperties.toMutableMap(),
                    )
            }

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

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (code.asKnown().isPresent) 1 else 0) +
                    (inlineContext.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0)

            class InlineContext
            private constructor(
                private val runtime: JsonField<Runtime>,
                private val version: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("runtime")
                    @ExcludeMissing
                    runtime: JsonField<Runtime> = JsonMissing.of(),
                    @JsonProperty("version")
                    @ExcludeMissing
                    version: JsonField<String> = JsonMissing.of(),
                ) : this(runtime, version, mutableMapOf())

                /**
                 * @throws BraintrustInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun runtime(): Runtime = runtime.getRequired("runtime")

                /**
                 * @throws BraintrustInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun version(): String = version.getRequired("version")

                /**
                 * Returns the raw JSON value of [runtime].
                 *
                 * Unlike [runtime], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("runtime")
                @ExcludeMissing
                fun _runtime(): JsonField<Runtime> = runtime

                /**
                 * Returns the raw JSON value of [version].
                 *
                 * Unlike [version], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

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

                    /**
                     * Sets [Builder.runtime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.runtime] with a well-typed [Runtime] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun runtime(runtime: JsonField<Runtime>) = apply { this.runtime = runtime }

                    fun version(version: String) = version(JsonField.of(version))

                    /**
                     * Sets [Builder.version] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.version] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [InlineContext].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .runtime()
                     * .version()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): InlineContext =
                        InlineContext(
                            checkRequired("runtime", runtime),
                            checkRequired("version", version),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): InlineContext = apply {
                    if (validated) {
                        return@apply
                    }

                    runtime().validate()
                    version()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: BraintrustInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (runtime.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (version.asKnown().isPresent) 1 else 0)

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

                    private var validated: Boolean = false

                    fun validate(): Runtime = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: BraintrustInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
        class InlinePrompt
        private constructor(
            private val inlinePrompt: JsonField<PromptData>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("inline_prompt")
                @ExcludeMissing
                inlinePrompt: JsonField<PromptData> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(inlinePrompt, name, mutableMapOf())

            /**
             * The prompt, model, and its parameters
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun inlinePrompt(): Optional<PromptData> =
                Optional.ofNullable(inlinePrompt.getNullable("inline_prompt"))

            /**
             * The name of the inline prompt
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /**
             * Returns the raw JSON value of [inlinePrompt].
             *
             * Unlike [inlinePrompt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("inline_prompt")
            @ExcludeMissing
            fun _inlinePrompt(): JsonField<PromptData> = inlinePrompt

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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

                /** Alias for calling [Builder.inlinePrompt] with `inlinePrompt.orElse(null)`. */
                fun inlinePrompt(inlinePrompt: Optional<PromptData>) =
                    inlinePrompt(inlinePrompt.getOrNull())

                /**
                 * Sets [Builder.inlinePrompt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inlinePrompt] with a well-typed [PromptData]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun inlinePrompt(inlinePrompt: JsonField<PromptData>) = apply {
                    this.inlinePrompt = inlinePrompt
                }

                /** The name of the inline prompt */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [InlinePrompt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .inlinePrompt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InlinePrompt =
                    InlinePrompt(
                        checkRequired("inlinePrompt", inlinePrompt),
                        name,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InlinePrompt = apply {
                if (validated) {
                    return@apply
                }

                inlinePrompt().ifPresent { it.validate() }
                name()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (inlinePrompt.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0)

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

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                functionId != null -> visitor.visitFunctionId(functionId)
                projectSlug != null -> visitor.visitProjectSlug(projectSlug)
                globalFunction != null -> visitor.visitGlobalFunction(globalFunction)
                promptSessionId != null -> visitor.visitPromptSessionId(promptSessionId)
                inlineCode != null -> visitor.visitInlineCode(inlineCode)
                inlinePrompt != null -> visitor.visitInlinePrompt(inlinePrompt)
                else -> visitor.unknown(_json)
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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BraintrustInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitFunctionId(functionId: FunctionId) = functionId.validity()

                    override fun visitProjectSlug(projectSlug: ProjectSlug) = projectSlug.validity()

                    override fun visitGlobalFunction(globalFunction: GlobalFunction) =
                        globalFunction.validity()

                    override fun visitPromptSessionId(promptSessionId: PromptSessionId) =
                        promptSessionId.validity()

                    override fun visitInlineCode(inlineCode: InlineCode) = inlineCode.validity()

                    override fun visitInlinePrompt(inlinePrompt: InlinePrompt) =
                        inlinePrompt.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<FunctionId>())?.let {
                                Task(functionId = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ProjectSlug>())?.let {
                                Task(projectSlug = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<GlobalFunction>())?.let {
                                Task(globalFunction = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PromptSessionId>())?.let {
                                Task(promptSessionId = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<InlineCode>())?.let {
                                Task(inlineCode = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<InlinePrompt>())?.let {
                                Task(inlinePrompt = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Task(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
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
        class FunctionId
        private constructor(
            private val functionId: JsonField<String>,
            private val version: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("function_id")
                @ExcludeMissing
                functionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("version")
                @ExcludeMissing
                version: JsonField<String> = JsonMissing.of(),
            ) : this(functionId, version, mutableMapOf())

            /**
             * The ID of the function
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun functionId(): String = functionId.getRequired("function_id")

            /**
             * The version of the function
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

            /**
             * Returns the raw JSON value of [functionId].
             *
             * Unlike [functionId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("function_id")
            @ExcludeMissing
            fun _functionId(): JsonField<String> = functionId

            /**
             * Returns the raw JSON value of [version].
             *
             * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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

                /**
                 * Sets [Builder.functionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.functionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun functionId(functionId: JsonField<String>) = apply {
                    this.functionId = functionId
                }

                /** The version of the function */
                fun version(version: String) = version(JsonField.of(version))

                /**
                 * Sets [Builder.version] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.version] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [FunctionId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .functionId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): FunctionId =
                    FunctionId(
                        checkRequired("functionId", functionId),
                        version,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): FunctionId = apply {
                if (validated) {
                    return@apply
                }

                functionId()
                version()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (functionId.asKnown().isPresent) 1 else 0) +
                    (if (version.asKnown().isPresent) 1 else 0)

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
        class ProjectSlug
        private constructor(
            private val projectName: JsonField<String>,
            private val slug: JsonField<String>,
            private val version: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("project_name")
                @ExcludeMissing
                projectName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
                @JsonProperty("version")
                @ExcludeMissing
                version: JsonField<String> = JsonMissing.of(),
            ) : this(projectName, slug, version, mutableMapOf())

            /**
             * The name of the project containing the function
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun projectName(): String = projectName.getRequired("project_name")

            /**
             * The slug of the function
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun slug(): String = slug.getRequired("slug")

            /**
             * The version of the function
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

            /**
             * Returns the raw JSON value of [projectName].
             *
             * Unlike [projectName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("project_name")
            @ExcludeMissing
            fun _projectName(): JsonField<String> = projectName

            /**
             * Returns the raw JSON value of [slug].
             *
             * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

            /**
             * Returns the raw JSON value of [version].
             *
             * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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

                /**
                 * Sets [Builder.projectName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.projectName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun projectName(projectName: JsonField<String>) = apply {
                    this.projectName = projectName
                }

                /** The slug of the function */
                fun slug(slug: String) = slug(JsonField.of(slug))

                /**
                 * Sets [Builder.slug] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.slug] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun slug(slug: JsonField<String>) = apply { this.slug = slug }

                /** The version of the function */
                fun version(version: String) = version(JsonField.of(version))

                /**
                 * Sets [Builder.version] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.version] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [ProjectSlug].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .projectName()
                 * .slug()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ProjectSlug =
                    ProjectSlug(
                        checkRequired("projectName", projectName),
                        checkRequired("slug", slug),
                        version,
                        additionalProperties.toMutableMap(),
                    )
            }

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

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (projectName.asKnown().isPresent) 1 else 0) +
                    (if (slug.asKnown().isPresent) 1 else 0) +
                    (if (version.asKnown().isPresent) 1 else 0)

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
        class GlobalFunction
        private constructor(
            private val globalFunction: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("global_function")
                @ExcludeMissing
                globalFunction: JsonField<String> = JsonMissing.of()
            ) : this(globalFunction, mutableMapOf())

            /**
             * The name of the global function. Currently, the global namespace includes the
             * functions in autoevals
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun globalFunction(): String = globalFunction.getRequired("global_function")

            /**
             * Returns the raw JSON value of [globalFunction].
             *
             * Unlike [globalFunction], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("global_function")
            @ExcludeMissing
            fun _globalFunction(): JsonField<String> = globalFunction

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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
                 * Sets [Builder.globalFunction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.globalFunction] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /**
                 * Returns an immutable instance of [GlobalFunction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .globalFunction()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): GlobalFunction =
                    GlobalFunction(
                        checkRequired("globalFunction", globalFunction),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): GlobalFunction = apply {
                if (validated) {
                    return@apply
                }

                globalFunction()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int = (if (globalFunction.asKnown().isPresent) 1 else 0)

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
        class PromptSessionId
        private constructor(
            private val promptSessionFunctionId: JsonField<String>,
            private val promptSessionId: JsonField<String>,
            private val version: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("prompt_session_function_id")
                @ExcludeMissing
                promptSessionFunctionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("prompt_session_id")
                @ExcludeMissing
                promptSessionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("version")
                @ExcludeMissing
                version: JsonField<String> = JsonMissing.of(),
            ) : this(promptSessionFunctionId, promptSessionId, version, mutableMapOf())

            /**
             * The ID of the function in the prompt session
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun promptSessionFunctionId(): String =
                promptSessionFunctionId.getRequired("prompt_session_function_id")

            /**
             * The ID of the prompt session
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun promptSessionId(): String = promptSessionId.getRequired("prompt_session_id")

            /**
             * The version of the function
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

            /**
             * Returns the raw JSON value of [promptSessionFunctionId].
             *
             * Unlike [promptSessionFunctionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("prompt_session_function_id")
            @ExcludeMissing
            fun _promptSessionFunctionId(): JsonField<String> = promptSessionFunctionId

            /**
             * Returns the raw JSON value of [promptSessionId].
             *
             * Unlike [promptSessionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("prompt_session_id")
            @ExcludeMissing
            fun _promptSessionId(): JsonField<String> = promptSessionId

            /**
             * Returns the raw JSON value of [version].
             *
             * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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

                /**
                 * Sets [Builder.promptSessionFunctionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.promptSessionFunctionId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun promptSessionFunctionId(promptSessionFunctionId: JsonField<String>) = apply {
                    this.promptSessionFunctionId = promptSessionFunctionId
                }

                /** The ID of the prompt session */
                fun promptSessionId(promptSessionId: String) =
                    promptSessionId(JsonField.of(promptSessionId))

                /**
                 * Sets [Builder.promptSessionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.promptSessionId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun promptSessionId(promptSessionId: JsonField<String>) = apply {
                    this.promptSessionId = promptSessionId
                }

                /** The version of the function */
                fun version(version: String) = version(JsonField.of(version))

                /**
                 * Sets [Builder.version] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.version] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [PromptSessionId].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .promptSessionFunctionId()
                 * .promptSessionId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PromptSessionId =
                    PromptSessionId(
                        checkRequired("promptSessionFunctionId", promptSessionFunctionId),
                        checkRequired("promptSessionId", promptSessionId),
                        version,
                        additionalProperties.toMutableMap(),
                    )
            }

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

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (promptSessionFunctionId.asKnown().isPresent) 1 else 0) +
                    (if (promptSessionId.asKnown().isPresent) 1 else 0) +
                    (if (version.asKnown().isPresent) 1 else 0)

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
        class InlineCode
        private constructor(
            private val code: JsonField<String>,
            private val inlineContext: JsonField<InlineContext>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
                @JsonProperty("inline_context")
                @ExcludeMissing
                inlineContext: JsonField<InlineContext> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(code, inlineContext, name, mutableMapOf())

            /**
             * The inline code to execute
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun code(): String = code.getRequired("code")

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun inlineContext(): InlineContext = inlineContext.getRequired("inline_context")

            /**
             * The name of the inline code function
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /**
             * Returns the raw JSON value of [code].
             *
             * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

            /**
             * Returns the raw JSON value of [inlineContext].
             *
             * Unlike [inlineContext], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("inline_context")
            @ExcludeMissing
            fun _inlineContext(): JsonField<InlineContext> = inlineContext

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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

                /**
                 * Sets [Builder.code] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.code] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<String>) = apply { this.code = code }

                fun inlineContext(inlineContext: InlineContext) =
                    inlineContext(JsonField.of(inlineContext))

                /**
                 * Sets [Builder.inlineContext] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inlineContext] with a well-typed [InlineContext]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun inlineContext(inlineContext: JsonField<InlineContext>) = apply {
                    this.inlineContext = inlineContext
                }

                /** The name of the inline code function */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [InlineCode].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .code()
                 * .inlineContext()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InlineCode =
                    InlineCode(
                        checkRequired("code", code),
                        checkRequired("inlineContext", inlineContext),
                        name,
                        additionalProperties.toMutableMap(),
                    )
            }

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

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (code.asKnown().isPresent) 1 else 0) +
                    (inlineContext.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0)

            class InlineContext
            private constructor(
                private val runtime: JsonField<Runtime>,
                private val version: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("runtime")
                    @ExcludeMissing
                    runtime: JsonField<Runtime> = JsonMissing.of(),
                    @JsonProperty("version")
                    @ExcludeMissing
                    version: JsonField<String> = JsonMissing.of(),
                ) : this(runtime, version, mutableMapOf())

                /**
                 * @throws BraintrustInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun runtime(): Runtime = runtime.getRequired("runtime")

                /**
                 * @throws BraintrustInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun version(): String = version.getRequired("version")

                /**
                 * Returns the raw JSON value of [runtime].
                 *
                 * Unlike [runtime], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("runtime")
                @ExcludeMissing
                fun _runtime(): JsonField<Runtime> = runtime

                /**
                 * Returns the raw JSON value of [version].
                 *
                 * Unlike [version], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

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

                    /**
                     * Sets [Builder.runtime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.runtime] with a well-typed [Runtime] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun runtime(runtime: JsonField<Runtime>) = apply { this.runtime = runtime }

                    fun version(version: String) = version(JsonField.of(version))

                    /**
                     * Sets [Builder.version] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.version] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [InlineContext].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .runtime()
                     * .version()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): InlineContext =
                        InlineContext(
                            checkRequired("runtime", runtime),
                            checkRequired("version", version),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): InlineContext = apply {
                    if (validated) {
                        return@apply
                    }

                    runtime().validate()
                    version()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: BraintrustInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (runtime.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (version.asKnown().isPresent) 1 else 0)

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

                    private var validated: Boolean = false

                    fun validate(): Runtime = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: BraintrustInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
        class InlinePrompt
        private constructor(
            private val inlinePrompt: JsonField<PromptData>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("inline_prompt")
                @ExcludeMissing
                inlinePrompt: JsonField<PromptData> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(inlinePrompt, name, mutableMapOf())

            /**
             * The prompt, model, and its parameters
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun inlinePrompt(): Optional<PromptData> =
                Optional.ofNullable(inlinePrompt.getNullable("inline_prompt"))

            /**
             * The name of the inline prompt
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /**
             * Returns the raw JSON value of [inlinePrompt].
             *
             * Unlike [inlinePrompt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("inline_prompt")
            @ExcludeMissing
            fun _inlinePrompt(): JsonField<PromptData> = inlinePrompt

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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

                /** Alias for calling [Builder.inlinePrompt] with `inlinePrompt.orElse(null)`. */
                fun inlinePrompt(inlinePrompt: Optional<PromptData>) =
                    inlinePrompt(inlinePrompt.getOrNull())

                /**
                 * Sets [Builder.inlinePrompt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inlinePrompt] with a well-typed [PromptData]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun inlinePrompt(inlinePrompt: JsonField<PromptData>) = apply {
                    this.inlinePrompt = inlinePrompt
                }

                /** The name of the inline prompt */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [InlinePrompt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .inlinePrompt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InlinePrompt =
                    InlinePrompt(
                        checkRequired("inlinePrompt", inlinePrompt),
                        name,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InlinePrompt = apply {
                if (validated) {
                    return@apply
                }

                inlinePrompt().ifPresent { it.validate() }
                name()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (inlinePrompt.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0)

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
    class GitMetadataSettings
    private constructor(
        private val collect: JsonField<Collect>,
        private val fields: JsonField<List<Field>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("collect") @ExcludeMissing collect: JsonField<Collect> = JsonMissing.of(),
            @JsonProperty("fields")
            @ExcludeMissing
            fields: JsonField<List<Field>> = JsonMissing.of(),
        ) : this(collect, fields, mutableMapOf())

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun collect(): Collect = collect.getRequired("collect")

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fields(): Optional<List<Field>> = Optional.ofNullable(fields.getNullable("fields"))

        /**
         * Returns the raw JSON value of [collect].
         *
         * Unlike [collect], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("collect") @ExcludeMissing fun _collect(): JsonField<Collect> = collect

        /**
         * Returns the raw JSON value of [fields].
         *
         * Unlike [fields], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fields") @ExcludeMissing fun _fields(): JsonField<List<Field>> = fields

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

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

            /**
             * Sets [Builder.collect] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collect] with a well-typed [Collect] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun collect(collect: JsonField<Collect>) = apply { this.collect = collect }

            fun fields(fields: List<Field>) = fields(JsonField.of(fields))

            /**
             * Sets [Builder.fields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fields] with a well-typed `List<Field>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fields(fields: JsonField<List<Field>>) = apply {
                this.fields = fields.map { it.toMutableList() }
            }

            /**
             * Adds a single [Field] to [fields].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
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

            /**
             * Returns an immutable instance of [GitMetadataSettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .collect()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): GitMetadataSettings =
                GitMetadataSettings(
                    checkRequired("collect", collect),
                    (fields ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): GitMetadataSettings = apply {
            if (validated) {
                return@apply
            }

            collect().validate()
            fields().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BraintrustInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (collect.asKnown().getOrNull()?.validity() ?: 0) +
                (fields.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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

            private var validated: Boolean = false

            fun validate(): Collect = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

            private var validated: Boolean = false

            fun validate(): Field = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BraintrustInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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

    /** Options for tracing the evaluation */
    @JsonDeserialize(using = Parent.Deserializer::class)
    @JsonSerialize(using = Parent.Serializer::class)
    class Parent
    private constructor(
        private val spanParentStruct: SpanParentStruct? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Span parent properties */
        fun spanParentStruct(): Optional<SpanParentStruct> = Optional.ofNullable(spanParentStruct)

        /** The parent's span identifier, created by calling `.export()` on a span */
        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isSpanParentStruct(): Boolean = spanParentStruct != null

        fun isString(): Boolean = string != null

        /** Span parent properties */
        fun asSpanParentStruct(): SpanParentStruct = spanParentStruct.getOrThrow("spanParentStruct")

        /** The parent's span identifier, created by calling `.export()` on a span */
        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                spanParentStruct != null -> visitor.visitSpanParentStruct(spanParentStruct)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Parent = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitSpanParentStruct(spanParentStruct: SpanParentStruct) {
                        spanParentStruct.validate()
                    }

                    override fun visitString(string: String) {}
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BraintrustInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitSpanParentStruct(spanParentStruct: SpanParentStruct) =
                        spanParentStruct.validity()

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Parent && spanParentStruct == other.spanParentStruct && string == other.string /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(spanParentStruct, string) /* spotless:on */

        override fun toString(): String =
            when {
                spanParentStruct != null -> "Parent{spanParentStruct=$spanParentStruct}"
                string != null -> "Parent{string=$string}"
                _json != null -> "Parent{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Parent")
            }

        companion object {

            /** Span parent properties */
            @JvmStatic
            fun ofSpanParentStruct(spanParentStruct: SpanParentStruct) =
                Parent(spanParentStruct = spanParentStruct)

            /** The parent's span identifier, created by calling `.export()` on a span */
            @JvmStatic fun ofString(string: String) = Parent(string = string)
        }

        /** An interface that defines how to map each variant of [Parent] to a value of type [T]. */
        interface Visitor<out T> {

            /** Span parent properties */
            fun visitSpanParentStruct(spanParentStruct: SpanParentStruct): T

            /** The parent's span identifier, created by calling `.export()` on a span */
            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [Parent] to a value of type [T].
             *
             * An instance of [Parent] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws BraintrustInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Parent: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Parent>(Parent::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Parent {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<SpanParentStruct>())?.let {
                                Parent(spanParentStruct = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Parent(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from array).
                    0 -> Parent(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Parent>(Parent::class) {

            override fun serialize(
                value: Parent,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.spanParentStruct != null -> generator.writeObject(value.spanParentStruct)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Parent")
                }
            }
        }

        /** Span parent properties */
        class SpanParentStruct
        private constructor(
            private val objectId: JsonField<String>,
            private val objectType: JsonField<ObjectType>,
            private val propagatedEvent: JsonField<PropagatedEvent>,
            private val rowIds: JsonField<RowIds>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("object_id")
                @ExcludeMissing
                objectId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("object_type")
                @ExcludeMissing
                objectType: JsonField<ObjectType> = JsonMissing.of(),
                @JsonProperty("propagated_event")
                @ExcludeMissing
                propagatedEvent: JsonField<PropagatedEvent> = JsonMissing.of(),
                @JsonProperty("row_ids")
                @ExcludeMissing
                rowIds: JsonField<RowIds> = JsonMissing.of(),
            ) : this(objectId, objectType, propagatedEvent, rowIds, mutableMapOf())

            /**
             * The id of the container object you are logging to
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun objectId(): String = objectId.getRequired("object_id")

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun objectType(): ObjectType = objectType.getRequired("object_type")

            /**
             * Include these properties in every span created under this parent
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun propagatedEvent(): Optional<PropagatedEvent> =
                Optional.ofNullable(propagatedEvent.getNullable("propagated_event"))

            /**
             * Identifiers for the row to to log a subspan under
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun rowIds(): Optional<RowIds> = Optional.ofNullable(rowIds.getNullable("row_ids"))

            /**
             * Returns the raw JSON value of [objectId].
             *
             * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("object_id") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

            /**
             * Returns the raw JSON value of [objectType].
             *
             * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("object_type")
            @ExcludeMissing
            fun _objectType(): JsonField<ObjectType> = objectType

            /**
             * Returns the raw JSON value of [propagatedEvent].
             *
             * Unlike [propagatedEvent], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("propagated_event")
            @ExcludeMissing
            fun _propagatedEvent(): JsonField<PropagatedEvent> = propagatedEvent

            /**
             * Returns the raw JSON value of [rowIds].
             *
             * Unlike [rowIds], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("row_ids") @ExcludeMissing fun _rowIds(): JsonField<RowIds> = rowIds

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [SpanParentStruct].
                 *
                 * The following fields are required:
                 * ```java
                 * .objectId()
                 * .objectType()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SpanParentStruct]. */
            class Builder internal constructor() {

                private var objectId: JsonField<String>? = null
                private var objectType: JsonField<ObjectType>? = null
                private var propagatedEvent: JsonField<PropagatedEvent> = JsonMissing.of()
                private var rowIds: JsonField<RowIds> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(spanParentStruct: SpanParentStruct) = apply {
                    objectId = spanParentStruct.objectId
                    objectType = spanParentStruct.objectType
                    propagatedEvent = spanParentStruct.propagatedEvent
                    rowIds = spanParentStruct.rowIds
                    additionalProperties = spanParentStruct.additionalProperties.toMutableMap()
                }

                /** The id of the container object you are logging to */
                fun objectId(objectId: String) = objectId(JsonField.of(objectId))

                /**
                 * Sets [Builder.objectId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.objectId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

                fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

                /**
                 * Sets [Builder.objectType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.objectType] with a well-typed [ObjectType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun objectType(objectType: JsonField<ObjectType>) = apply {
                    this.objectType = objectType
                }

                /** Include these properties in every span created under this parent */
                fun propagatedEvent(propagatedEvent: PropagatedEvent?) =
                    propagatedEvent(JsonField.ofNullable(propagatedEvent))

                /**
                 * Alias for calling [Builder.propagatedEvent] with `propagatedEvent.orElse(null)`.
                 */
                fun propagatedEvent(propagatedEvent: Optional<PropagatedEvent>) =
                    propagatedEvent(propagatedEvent.getOrNull())

                /**
                 * Sets [Builder.propagatedEvent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.propagatedEvent] with a well-typed
                 * [PropagatedEvent] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun propagatedEvent(propagatedEvent: JsonField<PropagatedEvent>) = apply {
                    this.propagatedEvent = propagatedEvent
                }

                /** Identifiers for the row to to log a subspan under */
                fun rowIds(rowIds: RowIds?) = rowIds(JsonField.ofNullable(rowIds))

                /** Alias for calling [Builder.rowIds] with `rowIds.orElse(null)`. */
                fun rowIds(rowIds: Optional<RowIds>) = rowIds(rowIds.getOrNull())

                /**
                 * Sets [Builder.rowIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rowIds] with a well-typed [RowIds] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rowIds(rowIds: JsonField<RowIds>) = apply { this.rowIds = rowIds }

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

                /**
                 * Returns an immutable instance of [SpanParentStruct].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .objectId()
                 * .objectType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SpanParentStruct =
                    SpanParentStruct(
                        checkRequired("objectId", objectId),
                        checkRequired("objectType", objectType),
                        propagatedEvent,
                        rowIds,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): SpanParentStruct = apply {
                if (validated) {
                    return@apply
                }

                objectId()
                objectType().validate()
                propagatedEvent().ifPresent { it.validate() }
                rowIds().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: BraintrustInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (objectId.asKnown().isPresent) 1 else 0) +
                    (objectType.asKnown().getOrNull()?.validity() ?: 0) +
                    (propagatedEvent.asKnown().getOrNull()?.validity() ?: 0) +
                    (rowIds.asKnown().getOrNull()?.validity() ?: 0)

            class ObjectType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PROJECT_LOGS = of("project_logs")

                    @JvmField val EXPERIMENT = of("experiment")

                    @JvmField val PLAYGROUND_LOGS = of("playground_logs")

                    @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
                }

                /** An enum containing [ObjectType]'s known values. */
                enum class Known {
                    PROJECT_LOGS,
                    EXPERIMENT,
                    PLAYGROUND_LOGS,
                }

                /**
                 * An enum containing [ObjectType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [ObjectType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PROJECT_LOGS,
                    EXPERIMENT,
                    PLAYGROUND_LOGS,
                    /**
                     * An enum member indicating that [ObjectType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PROJECT_LOGS -> Value.PROJECT_LOGS
                        EXPERIMENT -> Value.EXPERIMENT
                        PLAYGROUND_LOGS -> Value.PLAYGROUND_LOGS
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
                        PROJECT_LOGS -> Known.PROJECT_LOGS
                        EXPERIMENT -> Known.EXPERIMENT
                        PLAYGROUND_LOGS -> Known.PLAYGROUND_LOGS
                        else -> throw BraintrustInvalidDataException("Unknown ObjectType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws BraintrustInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BraintrustInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): ObjectType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: BraintrustInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ObjectType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Include these properties in every span created under this parent */
            class PropagatedEvent
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [PropagatedEvent].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PropagatedEvent]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(propagatedEvent: PropagatedEvent) = apply {
                        additionalProperties = propagatedEvent.additionalProperties.toMutableMap()
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

                    /**
                     * Returns an immutable instance of [PropagatedEvent].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): PropagatedEvent =
                        PropagatedEvent(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): PropagatedEvent = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: BraintrustInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PropagatedEvent && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PropagatedEvent{additionalProperties=$additionalProperties}"
            }

            /** Identifiers for the row to to log a subspan under */
            class RowIds
            private constructor(
                private val id: JsonField<String>,
                private val rootSpanId: JsonField<String>,
                private val spanId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("root_span_id")
                    @ExcludeMissing
                    rootSpanId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("span_id")
                    @ExcludeMissing
                    spanId: JsonField<String> = JsonMissing.of(),
                ) : this(id, rootSpanId, spanId, mutableMapOf())

                /**
                 * The id of the row
                 *
                 * @throws BraintrustInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * The root_span_id of the row
                 *
                 * @throws BraintrustInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun rootSpanId(): String = rootSpanId.getRequired("root_span_id")

                /**
                 * The span_id of the row
                 *
                 * @throws BraintrustInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun spanId(): String = spanId.getRequired("span_id")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [rootSpanId].
                 *
                 * Unlike [rootSpanId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("root_span_id")
                @ExcludeMissing
                fun _rootSpanId(): JsonField<String> = rootSpanId

                /**
                 * Returns the raw JSON value of [spanId].
                 *
                 * Unlike [spanId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("span_id") @ExcludeMissing fun _spanId(): JsonField<String> = spanId

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [RowIds].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .rootSpanId()
                     * .spanId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RowIds]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var rootSpanId: JsonField<String>? = null
                    private var spanId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(rowIds: RowIds) = apply {
                        id = rowIds.id
                        rootSpanId = rowIds.rootSpanId
                        spanId = rowIds.spanId
                        additionalProperties = rowIds.additionalProperties.toMutableMap()
                    }

                    /** The id of the row */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** The root_span_id of the row */
                    fun rootSpanId(rootSpanId: String) = rootSpanId(JsonField.of(rootSpanId))

                    /**
                     * Sets [Builder.rootSpanId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.rootSpanId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun rootSpanId(rootSpanId: JsonField<String>) = apply {
                        this.rootSpanId = rootSpanId
                    }

                    /** The span_id of the row */
                    fun spanId(spanId: String) = spanId(JsonField.of(spanId))

                    /**
                     * Sets [Builder.spanId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.spanId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

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

                    /**
                     * Returns an immutable instance of [RowIds].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .rootSpanId()
                     * .spanId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): RowIds =
                        RowIds(
                            checkRequired("id", id),
                            checkRequired("rootSpanId", rootSpanId),
                            checkRequired("spanId", spanId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): RowIds = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    rootSpanId()
                    spanId()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: BraintrustInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (rootSpanId.asKnown().isPresent) 1 else 0) +
                        (if (spanId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RowIds && id == other.id && rootSpanId == other.rootSpanId && spanId == other.spanId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, rootSpanId, spanId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RowIds{id=$id, rootSpanId=$rootSpanId, spanId=$spanId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SpanParentStruct && objectId == other.objectId && objectType == other.objectType && propagatedEvent == other.propagatedEvent && rowIds == other.rowIds && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(objectId, objectType, propagatedEvent, rowIds, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SpanParentStruct{objectId=$objectId, objectType=$objectType, propagatedEvent=$propagatedEvent, rowIds=$rowIds, additionalProperties=$additionalProperties}"
        }
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
