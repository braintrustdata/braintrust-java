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
import com.braintrustdata.api.core.getOrThrow
import com.braintrustdata.api.core.toUnmodifiable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.braintrustdata.api.models.*
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

class EvalCreateParams
constructor(
    private val data: Data,
    private val projectId: String,
    private val scores: List<Score>,
    private val task: Task,
    private val experimentName: String?,
    private val metadata: Metadata?,
    private val stream: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun data(): Data = data

    fun projectId(): String = projectId

    fun scores(): List<Score> = scores

    fun task(): Task = task

    fun experimentName(): Optional<String> = Optional.ofNullable(experimentName)

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun stream(): Optional<Boolean> = Optional.ofNullable(stream)

    @JvmSynthetic
    internal fun getBody(): EvalCreateBody {
        return EvalCreateBody(
            data,
            projectId,
            scores,
            task,
            experimentName,
            metadata,
            stream,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = EvalCreateBody.Builder::class)
    @NoAutoDetect
    class EvalCreateBody
    internal constructor(
        private val data: Data?,
        private val projectId: String?,
        private val scores: List<Score>?,
        private val task: Task?,
        private val experimentName: String?,
        private val metadata: Metadata?,
        private val stream: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The dataset to use */
        @JsonProperty("data") fun data(): Data? = data

        /** Unique identifier for the project to run the eval in */
        @JsonProperty("project_id") fun projectId(): String? = projectId

        /** The functions to score the eval on */
        @JsonProperty("scores") fun scores(): List<Score>? = scores

        /** The function to evaluate */
        @JsonProperty("task") fun task(): Task? = task

        /**
         * An optional name for the experiment created by this eval. If it conflicts with an
         * existing experiment, it will be suffixed with a unique identifier.
         */
        @JsonProperty("experiment_name") fun experimentName(): String? = experimentName

        /**
         * Optional experiment-level metadata to store about the evaluation. You can later use this
         * to slice & dice across experiments.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * Whether to stream the results of the eval. If true, the request will return two events:
         * one to indicate the experiment has started, and another upon completion. If false, the
         * request will return the evaluation's summary upon completion.
         */
        @JsonProperty("stream") fun stream(): Boolean? = stream

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var data: Data? = null
            private var projectId: String? = null
            private var scores: List<Score>? = null
            private var task: Task? = null
            private var experimentName: String? = null
            private var metadata: Metadata? = null
            private var stream: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(evalCreateBody: EvalCreateBody) = apply {
                this.data = evalCreateBody.data
                this.projectId = evalCreateBody.projectId
                this.scores = evalCreateBody.scores
                this.task = evalCreateBody.task
                this.experimentName = evalCreateBody.experimentName
                this.metadata = evalCreateBody.metadata
                this.stream = evalCreateBody.stream
                additionalProperties(evalCreateBody.additionalProperties)
            }

            /** The dataset to use */
            @JsonProperty("data") fun data(data: Data) = apply { this.data = data }

            /** Unique identifier for the project to run the eval in */
            @JsonProperty("project_id")
            fun projectId(projectId: String) = apply { this.projectId = projectId }

            /** The functions to score the eval on */
            @JsonProperty("scores") fun scores(scores: List<Score>) = apply { this.scores = scores }

            /** The function to evaluate */
            @JsonProperty("task") fun task(task: Task) = apply { this.task = task }

            /**
             * An optional name for the experiment created by this eval. If it conflicts with an
             * existing experiment, it will be suffixed with a unique identifier.
             */
            @JsonProperty("experiment_name")
            fun experimentName(experimentName: String) = apply {
                this.experimentName = experimentName
            }

            /**
             * Optional experiment-level metadata to store about the evaluation. You can later use
             * this to slice & dice across experiments.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * Whether to stream the results of the eval. If true, the request will return two
             * events: one to indicate the experiment has started, and another upon completion. If
             * false, the request will return the evaluation's summary upon completion.
             */
            @JsonProperty("stream") fun stream(stream: Boolean) = apply { this.stream = stream }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): EvalCreateBody =
                EvalCreateBody(
                    checkNotNull(data) { "`data` is required but was not set" },
                    checkNotNull(projectId) { "`projectId` is required but was not set" },
                    checkNotNull(scores) { "`scores` is required but was not set" }
                        .toUnmodifiable(),
                    checkNotNull(task) { "`task` is required but was not set" },
                    experimentName,
                    metadata,
                    stream,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EvalCreateBody && this.data == other.data && this.projectId == other.projectId && this.scores == other.scores && this.task == other.task && this.experimentName == other.experimentName && this.metadata == other.metadata && this.stream == other.stream && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(data, projectId, scores, task, experimentName, metadata, stream, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "EvalCreateBody{data=$data, projectId=$projectId, scores=$scores, task=$task, experimentName=$experimentName, metadata=$metadata, stream=$stream, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EvalCreateParams && this.data == other.data && this.projectId == other.projectId && this.scores == other.scores && this.task == other.task && this.experimentName == other.experimentName && this.metadata == other.metadata && this.stream == other.stream && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(data, projectId, scores, task, experimentName, metadata, stream, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "EvalCreateParams{data=$data, projectId=$projectId, scores=$scores, task=$task, experimentName=$experimentName, metadata=$metadata, stream=$stream, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var data: Data? = null
        private var projectId: String? = null
        private var scores: MutableList<Score> = mutableListOf()
        private var task: Task? = null
        private var experimentName: String? = null
        private var metadata: Metadata? = null
        private var stream: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(evalCreateParams: EvalCreateParams) = apply {
            this.data = evalCreateParams.data
            this.projectId = evalCreateParams.projectId
            this.scores(evalCreateParams.scores)
            this.task = evalCreateParams.task
            this.experimentName = evalCreateParams.experimentName
            this.metadata = evalCreateParams.metadata
            this.stream = evalCreateParams.stream
            additionalQueryParams(evalCreateParams.additionalQueryParams)
            additionalHeaders(evalCreateParams.additionalHeaders)
            additionalBodyProperties(evalCreateParams.additionalBodyProperties)
        }

        /** The dataset to use */
        fun data(data: Data) = apply { this.data = data }

        /** The dataset to use */
        fun data(datasetId: Data.DatasetId) = apply { this.data = Data.ofDatasetId(datasetId) }

        /** The dataset to use */
        fun data(projectDatasetName: Data.ProjectDatasetName) = apply {
            this.data = Data.ofProjectDatasetName(projectDatasetName)
        }

        /** Unique identifier for the project to run the eval in */
        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /** The functions to score the eval on */
        fun scores(scores: List<Score>) = apply {
            this.scores.clear()
            this.scores.addAll(scores)
        }

        /** The functions to score the eval on */
        fun addScore(score: Score) = apply { this.scores.add(score) }

        /** The function to evaluate */
        fun task(task: Task) = apply { this.task = task }

        /** The function to evaluate */
        fun task(functionId: Task.FunctionId) = apply { this.task = Task.ofFunctionId(functionId) }

        /** The function to evaluate */
        fun task(projectSlug: Task.ProjectSlug) = apply {
            this.task = Task.ofProjectSlug(projectSlug)
        }

        /** The function to evaluate */
        fun task(globalFunction: Task.GlobalFunction) = apply {
            this.task = Task.ofGlobalFunction(globalFunction)
        }

        /** The function to evaluate */
        fun task(promptSessionId: Task.PromptSessionId) = apply {
            this.task = Task.ofPromptSessionId(promptSessionId)
        }

        /** The function to evaluate */
        fun task(inlineCode: Task.InlineCode) = apply { this.task = Task.ofInlineCode(inlineCode) }

        /** The function to evaluate */
        fun task(inlinePrompt: Task.InlinePrompt) = apply {
            this.task = Task.ofInlinePrompt(inlinePrompt)
        }

        /**
         * An optional name for the experiment created by this eval. If it conflicts with an
         * existing experiment, it will be suffixed with a unique identifier.
         */
        fun experimentName(experimentName: String) = apply { this.experimentName = experimentName }

        /**
         * Optional experiment-level metadata to store about the evaluation. You can later use this
         * to slice & dice across experiments.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /**
         * Whether to stream the results of the eval. If true, the request will return two events:
         * one to indicate the experiment has started, and another upon completion. If false, the
         * request will return the evaluation's summary upon completion.
         */
        fun stream(stream: Boolean) = apply { this.stream = stream }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): EvalCreateParams =
            EvalCreateParams(
                checkNotNull(data) { "`data` is required but was not set" },
                checkNotNull(projectId) { "`projectId` is required but was not set" },
                checkNotNull(scores) { "`scores` is required but was not set" }.toUnmodifiable(),
                checkNotNull(task) { "`task` is required but was not set" },
                experimentName,
                metadata,
                stream,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val datasetId: DatasetId? = null,
        private val projectDatasetName: ProjectDatasetName? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        /** Dataset id */
        fun datasetId(): Optional<DatasetId> = Optional.ofNullable(datasetId)
        /** Project and dataset name */
        fun projectDatasetName(): Optional<ProjectDatasetName> =
            Optional.ofNullable(projectDatasetName)

        fun isDatasetId(): Boolean = datasetId != null

        fun isProjectDatasetName(): Boolean = projectDatasetName != null

        fun asDatasetId(): DatasetId = datasetId.getOrThrow("datasetId")

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

        fun validate(): Data = apply {
            if (!validated) {
                if (datasetId == null && projectDatasetName == null) {
                    throw BraintrustInvalidDataException("Unknown Data: $_json")
                }
                datasetId?.validate()
                projectDatasetName?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && this.datasetId == other.datasetId && this.projectDatasetName == other.projectDatasetName /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(datasetId, projectDatasetName) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                datasetId != null -> "Data{datasetId=$datasetId}"
                projectDatasetName != null -> "Data{projectDatasetName=$projectDatasetName}"
                _json != null -> "Data{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Data")
            }
        }

        companion object {

            @JvmStatic fun ofDatasetId(datasetId: DatasetId) = Data(datasetId = datasetId)

            @JvmStatic
            fun ofProjectDatasetName(projectDatasetName: ProjectDatasetName) =
                Data(projectDatasetName = projectDatasetName)
        }

        interface Visitor<out T> {

            fun visitDatasetId(datasetId: DatasetId): T

            fun visitProjectDatasetName(projectDatasetName: ProjectDatasetName): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Data: $json")
            }
        }

        class Deserializer : BaseDeserializer<Data>(Data::class) {

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

        class Serializer : BaseSerializer<Data>(Data::class) {

            override fun serialize(
                value: Data,
                generator: JsonGenerator,
                provider: SerializerProvider
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
        @JsonDeserialize(builder = DatasetId.Builder::class)
        @NoAutoDetect
        class DatasetId
        private constructor(
            private val datasetId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun datasetId(): String = datasetId.getRequired("dataset_id")

            @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId() = datasetId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): DatasetId = apply {
                if (!validated) {
                    datasetId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var datasetId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(datasetId: DatasetId) = apply {
                    this.datasetId = datasetId.datasetId
                    additionalProperties(datasetId.additionalProperties)
                }

                fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

                @JsonProperty("dataset_id")
                @ExcludeMissing
                fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): DatasetId = DatasetId(datasetId, additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DatasetId && this.datasetId == other.datasetId && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(datasetId, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "DatasetId{datasetId=$datasetId, additionalProperties=$additionalProperties}"
        }

        /** Project and dataset name */
        @JsonDeserialize(builder = ProjectDatasetName.Builder::class)
        @NoAutoDetect
        class ProjectDatasetName
        private constructor(
            private val projectName: JsonField<String>,
            private val datasetName: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun projectName(): String = projectName.getRequired("project_name")

            fun datasetName(): String = datasetName.getRequired("dataset_name")

            @JsonProperty("project_name") @ExcludeMissing fun _projectName() = projectName

            @JsonProperty("dataset_name") @ExcludeMissing fun _datasetName() = datasetName

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ProjectDatasetName = apply {
                if (!validated) {
                    projectName()
                    datasetName()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var projectName: JsonField<String> = JsonMissing.of()
                private var datasetName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(projectDatasetName: ProjectDatasetName) = apply {
                    this.projectName = projectDatasetName.projectName
                    this.datasetName = projectDatasetName.datasetName
                    additionalProperties(projectDatasetName.additionalProperties)
                }

                fun projectName(projectName: String) = projectName(JsonField.of(projectName))

                @JsonProperty("project_name")
                @ExcludeMissing
                fun projectName(projectName: JsonField<String>) = apply {
                    this.projectName = projectName
                }

                fun datasetName(datasetName: String) = datasetName(JsonField.of(datasetName))

                @JsonProperty("dataset_name")
                @ExcludeMissing
                fun datasetName(datasetName: JsonField<String>) = apply {
                    this.datasetName = datasetName
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ProjectDatasetName =
                    ProjectDatasetName(
                        projectName,
                        datasetName,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ProjectDatasetName && this.projectName == other.projectName && this.datasetName == other.datasetName && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(projectName, datasetName, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ProjectDatasetName{projectName=$projectName, datasetName=$datasetName, additionalProperties=$additionalProperties}"
        }
    }

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

        private var validated: Boolean = false

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

        fun asFunctionId(): FunctionId = functionId.getOrThrow("functionId")

        fun asProjectSlug(): ProjectSlug = projectSlug.getOrThrow("projectSlug")

        fun asGlobalFunction(): GlobalFunction = globalFunction.getOrThrow("globalFunction")

        fun asPromptSessionId(): PromptSessionId = promptSessionId.getOrThrow("promptSessionId")

        fun asInlineCode(): InlineCode = inlineCode.getOrThrow("inlineCode")

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

        fun validate(): Score = apply {
            if (!validated) {
                if (
                    functionId == null &&
                        projectSlug == null &&
                        globalFunction == null &&
                        promptSessionId == null &&
                        inlineCode == null &&
                        inlinePrompt == null
                ) {
                    throw BraintrustInvalidDataException("Unknown Score: $_json")
                }
                functionId?.validate()
                projectSlug?.validate()
                globalFunction?.validate()
                promptSessionId?.validate()
                inlineCode?.validate()
                inlinePrompt?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Score && this.functionId == other.functionId && this.projectSlug == other.projectSlug && this.globalFunction == other.globalFunction && this.promptSessionId == other.promptSessionId && this.inlineCode == other.inlineCode && this.inlinePrompt == other.inlinePrompt /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(functionId, projectSlug, globalFunction, promptSessionId, inlineCode, inlinePrompt) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                functionId != null -> "Score{functionId=$functionId}"
                projectSlug != null -> "Score{projectSlug=$projectSlug}"
                globalFunction != null -> "Score{globalFunction=$globalFunction}"
                promptSessionId != null -> "Score{promptSessionId=$promptSessionId}"
                inlineCode != null -> "Score{inlineCode=$inlineCode}"
                inlinePrompt != null -> "Score{inlinePrompt=$inlinePrompt}"
                _json != null -> "Score{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Score")
            }
        }

        companion object {

            @JvmStatic fun ofFunctionId(functionId: FunctionId) = Score(functionId = functionId)

            @JvmStatic
            fun ofProjectSlug(projectSlug: ProjectSlug) = Score(projectSlug = projectSlug)

            @JvmStatic
            fun ofGlobalFunction(globalFunction: GlobalFunction) =
                Score(globalFunction = globalFunction)

            @JvmStatic
            fun ofPromptSessionId(promptSessionId: PromptSessionId) =
                Score(promptSessionId = promptSessionId)

            @JvmStatic fun ofInlineCode(inlineCode: InlineCode) = Score(inlineCode = inlineCode)

            @JvmStatic
            fun ofInlinePrompt(inlinePrompt: InlinePrompt) = Score(inlinePrompt = inlinePrompt)
        }

        interface Visitor<out T> {

            fun visitFunctionId(functionId: FunctionId): T

            fun visitProjectSlug(projectSlug: ProjectSlug): T

            fun visitGlobalFunction(globalFunction: GlobalFunction): T

            fun visitPromptSessionId(promptSessionId: PromptSessionId): T

            fun visitInlineCode(inlineCode: InlineCode): T

            fun visitInlinePrompt(inlinePrompt: InlinePrompt): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Score: $json")
            }
        }

        class Deserializer : BaseDeserializer<Score>(Score::class) {

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

        class Serializer : BaseSerializer<Score>(Score::class) {

            override fun serialize(
                value: Score,
                generator: JsonGenerator,
                provider: SerializerProvider
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
        @JsonDeserialize(builder = FunctionId.Builder::class)
        @NoAutoDetect
        class FunctionId
        private constructor(
            private val functionId: JsonField<String>,
            private val version: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The ID of the function */
            fun functionId(): String = functionId.getRequired("function_id")

            /** The version of the function */
            fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

            /** The ID of the function */
            @JsonProperty("function_id") @ExcludeMissing fun _functionId() = functionId

            /** The version of the function */
            @JsonProperty("version") @ExcludeMissing fun _version() = version

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): FunctionId = apply {
                if (!validated) {
                    functionId()
                    version()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var functionId: JsonField<String> = JsonMissing.of()
                private var version: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(functionId: FunctionId) = apply {
                    this.functionId = functionId.functionId
                    this.version = functionId.version
                    additionalProperties(functionId.additionalProperties)
                }

                /** The ID of the function */
                fun functionId(functionId: String) = functionId(JsonField.of(functionId))

                /** The ID of the function */
                @JsonProperty("function_id")
                @ExcludeMissing
                fun functionId(functionId: JsonField<String>) = apply {
                    this.functionId = functionId
                }

                /** The version of the function */
                fun version(version: String) = version(JsonField.of(version))

                /** The version of the function */
                @JsonProperty("version")
                @ExcludeMissing
                fun version(version: JsonField<String>) = apply { this.version = version }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): FunctionId =
                    FunctionId(
                        functionId,
                        version,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FunctionId && this.functionId == other.functionId && this.version == other.version && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(functionId, version, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "FunctionId{functionId=$functionId, version=$version, additionalProperties=$additionalProperties}"
        }

        /** Project name and slug */
        @JsonDeserialize(builder = ProjectSlug.Builder::class)
        @NoAutoDetect
        class ProjectSlug
        private constructor(
            private val projectName: JsonField<String>,
            private val slug: JsonField<String>,
            private val version: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The name of the project containing the function */
            fun projectName(): String = projectName.getRequired("project_name")

            /** The slug of the function */
            fun slug(): String = slug.getRequired("slug")

            /** The version of the function */
            fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

            /** The name of the project containing the function */
            @JsonProperty("project_name") @ExcludeMissing fun _projectName() = projectName

            /** The slug of the function */
            @JsonProperty("slug") @ExcludeMissing fun _slug() = slug

            /** The version of the function */
            @JsonProperty("version") @ExcludeMissing fun _version() = version

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ProjectSlug = apply {
                if (!validated) {
                    projectName()
                    slug()
                    version()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var projectName: JsonField<String> = JsonMissing.of()
                private var slug: JsonField<String> = JsonMissing.of()
                private var version: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(projectSlug: ProjectSlug) = apply {
                    this.projectName = projectSlug.projectName
                    this.slug = projectSlug.slug
                    this.version = projectSlug.version
                    additionalProperties(projectSlug.additionalProperties)
                }

                /** The name of the project containing the function */
                fun projectName(projectName: String) = projectName(JsonField.of(projectName))

                /** The name of the project containing the function */
                @JsonProperty("project_name")
                @ExcludeMissing
                fun projectName(projectName: JsonField<String>) = apply {
                    this.projectName = projectName
                }

                /** The slug of the function */
                fun slug(slug: String) = slug(JsonField.of(slug))

                /** The slug of the function */
                @JsonProperty("slug")
                @ExcludeMissing
                fun slug(slug: JsonField<String>) = apply { this.slug = slug }

                /** The version of the function */
                fun version(version: String) = version(JsonField.of(version))

                /** The version of the function */
                @JsonProperty("version")
                @ExcludeMissing
                fun version(version: JsonField<String>) = apply { this.version = version }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ProjectSlug =
                    ProjectSlug(
                        projectName,
                        slug,
                        version,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ProjectSlug && this.projectName == other.projectName && this.slug == other.slug && this.version == other.version && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(projectName, slug, version, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ProjectSlug{projectName=$projectName, slug=$slug, version=$version, additionalProperties=$additionalProperties}"
        }

        /** Global function name */
        @JsonDeserialize(builder = GlobalFunction.Builder::class)
        @NoAutoDetect
        class GlobalFunction
        private constructor(
            private val globalFunction: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /**
             * The name of the global function. Currently, the global namespace includes the
             * functions in autoevals
             */
            fun globalFunction(): String = globalFunction.getRequired("global_function")

            /**
             * The name of the global function. Currently, the global namespace includes the
             * functions in autoevals
             */
            @JsonProperty("global_function") @ExcludeMissing fun _globalFunction() = globalFunction

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): GlobalFunction = apply {
                if (!validated) {
                    globalFunction()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var globalFunction: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(globalFunction: GlobalFunction) = apply {
                    this.globalFunction = globalFunction.globalFunction
                    additionalProperties(globalFunction.additionalProperties)
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
                @JsonProperty("global_function")
                @ExcludeMissing
                fun globalFunction(globalFunction: JsonField<String>) = apply {
                    this.globalFunction = globalFunction
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): GlobalFunction =
                    GlobalFunction(globalFunction, additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GlobalFunction && this.globalFunction == other.globalFunction && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(globalFunction, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "GlobalFunction{globalFunction=$globalFunction, additionalProperties=$additionalProperties}"
        }

        /** Prompt session id */
        @JsonDeserialize(builder = PromptSessionId.Builder::class)
        @NoAutoDetect
        class PromptSessionId
        private constructor(
            private val promptSessionId: JsonField<String>,
            private val promptSessionFunctionId: JsonField<String>,
            private val version: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The ID of the prompt session */
            fun promptSessionId(): String = promptSessionId.getRequired("prompt_session_id")

            /** The ID of the function in the prompt session */
            fun promptSessionFunctionId(): String =
                promptSessionFunctionId.getRequired("prompt_session_function_id")

            /** The version of the function */
            fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

            /** The ID of the prompt session */
            @JsonProperty("prompt_session_id")
            @ExcludeMissing
            fun _promptSessionId() = promptSessionId

            /** The ID of the function in the prompt session */
            @JsonProperty("prompt_session_function_id")
            @ExcludeMissing
            fun _promptSessionFunctionId() = promptSessionFunctionId

            /** The version of the function */
            @JsonProperty("version") @ExcludeMissing fun _version() = version

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): PromptSessionId = apply {
                if (!validated) {
                    promptSessionId()
                    promptSessionFunctionId()
                    version()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var promptSessionId: JsonField<String> = JsonMissing.of()
                private var promptSessionFunctionId: JsonField<String> = JsonMissing.of()
                private var version: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(promptSessionId: PromptSessionId) = apply {
                    this.promptSessionId = promptSessionId.promptSessionId
                    this.promptSessionFunctionId = promptSessionId.promptSessionFunctionId
                    this.version = promptSessionId.version
                    additionalProperties(promptSessionId.additionalProperties)
                }

                /** The ID of the prompt session */
                fun promptSessionId(promptSessionId: String) =
                    promptSessionId(JsonField.of(promptSessionId))

                /** The ID of the prompt session */
                @JsonProperty("prompt_session_id")
                @ExcludeMissing
                fun promptSessionId(promptSessionId: JsonField<String>) = apply {
                    this.promptSessionId = promptSessionId
                }

                /** The ID of the function in the prompt session */
                fun promptSessionFunctionId(promptSessionFunctionId: String) =
                    promptSessionFunctionId(JsonField.of(promptSessionFunctionId))

                /** The ID of the function in the prompt session */
                @JsonProperty("prompt_session_function_id")
                @ExcludeMissing
                fun promptSessionFunctionId(promptSessionFunctionId: JsonField<String>) = apply {
                    this.promptSessionFunctionId = promptSessionFunctionId
                }

                /** The version of the function */
                fun version(version: String) = version(JsonField.of(version))

                /** The version of the function */
                @JsonProperty("version")
                @ExcludeMissing
                fun version(version: JsonField<String>) = apply { this.version = version }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PromptSessionId =
                    PromptSessionId(
                        promptSessionId,
                        promptSessionFunctionId,
                        version,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PromptSessionId && this.promptSessionId == other.promptSessionId && this.promptSessionFunctionId == other.promptSessionFunctionId && this.version == other.version && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(promptSessionId, promptSessionFunctionId, version, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "PromptSessionId{promptSessionId=$promptSessionId, promptSessionFunctionId=$promptSessionFunctionId, version=$version, additionalProperties=$additionalProperties}"
        }

        /** Inline code function */
        @JsonDeserialize(builder = InlineCode.Builder::class)
        @NoAutoDetect
        class InlineCode
        private constructor(
            private val inlineContext: JsonField<InlineContext>,
            private val code: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun inlineContext(): InlineContext = inlineContext.getRequired("inline_context")

            /** The inline code to execute */
            fun code(): String = code.getRequired("code")

            /** The name of the inline code function */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            @JsonProperty("inline_context") @ExcludeMissing fun _inlineContext() = inlineContext

            /** The inline code to execute */
            @JsonProperty("code") @ExcludeMissing fun _code() = code

            /** The name of the inline code function */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InlineCode = apply {
                if (!validated) {
                    inlineContext().validate()
                    code()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var inlineContext: JsonField<InlineContext> = JsonMissing.of()
                private var code: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inlineCode: InlineCode) = apply {
                    this.inlineContext = inlineCode.inlineContext
                    this.code = inlineCode.code
                    this.name = inlineCode.name
                    additionalProperties(inlineCode.additionalProperties)
                }

                fun inlineContext(inlineContext: InlineContext) =
                    inlineContext(JsonField.of(inlineContext))

                @JsonProperty("inline_context")
                @ExcludeMissing
                fun inlineContext(inlineContext: JsonField<InlineContext>) = apply {
                    this.inlineContext = inlineContext
                }

                /** The inline code to execute */
                fun code(code: String) = code(JsonField.of(code))

                /** The inline code to execute */
                @JsonProperty("code")
                @ExcludeMissing
                fun code(code: JsonField<String>) = apply { this.code = code }

                /** The name of the inline code function */
                fun name(name: String) = name(JsonField.of(name))

                /** The name of the inline code function */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InlineCode =
                    InlineCode(
                        inlineContext,
                        code,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = InlineContext.Builder::class)
            @NoAutoDetect
            class InlineContext
            private constructor(
                private val runtime: JsonField<Runtime>,
                private val version: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun runtime(): Runtime = runtime.getRequired("runtime")

                fun version(): String = version.getRequired("version")

                @JsonProperty("runtime") @ExcludeMissing fun _runtime() = runtime

                @JsonProperty("version") @ExcludeMissing fun _version() = version

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): InlineContext = apply {
                    if (!validated) {
                        runtime()
                        version()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var runtime: JsonField<Runtime> = JsonMissing.of()
                    private var version: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(inlineContext: InlineContext) = apply {
                        this.runtime = inlineContext.runtime
                        this.version = inlineContext.version
                        additionalProperties(inlineContext.additionalProperties)
                    }

                    fun runtime(runtime: Runtime) = runtime(JsonField.of(runtime))

                    @JsonProperty("runtime")
                    @ExcludeMissing
                    fun runtime(runtime: JsonField<Runtime>) = apply { this.runtime = runtime }

                    fun version(version: String) = version(JsonField.of(version))

                    @JsonProperty("version")
                    @ExcludeMissing
                    fun version(version: JsonField<String>) = apply { this.version = version }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): InlineContext =
                        InlineContext(
                            runtime,
                            version,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Runtime
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Runtime && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val NODE = Runtime(JsonField.of("node"))

                        @JvmField val PYTHON = Runtime(JsonField.of("python"))

                        @JvmStatic fun of(value: String) = Runtime(JsonField.of(value))
                    }

                    enum class Known {
                        NODE,
                        PYTHON,
                    }

                    enum class Value {
                        NODE,
                        PYTHON,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            NODE -> Value.NODE
                            PYTHON -> Value.PYTHON
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            NODE -> Known.NODE
                            PYTHON -> Known.PYTHON
                            else -> throw BraintrustInvalidDataException("Unknown Runtime: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is InlineContext && this.runtime == other.runtime && this.version == other.version && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(runtime, version, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "InlineContext{runtime=$runtime, version=$version, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InlineCode && this.inlineContext == other.inlineContext && this.code == other.code && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(inlineContext, code, name, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InlineCode{inlineContext=$inlineContext, code=$code, name=$name, additionalProperties=$additionalProperties}"
        }

        /** Inline prompt definition */
        @JsonDeserialize(builder = InlinePrompt.Builder::class)
        @NoAutoDetect
        class InlinePrompt
        private constructor(
            private val inlinePrompt: JsonField<PromptData>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The prompt, model, and its parameters */
            fun inlinePrompt(): Optional<PromptData> =
                Optional.ofNullable(inlinePrompt.getNullable("inline_prompt"))

            /** The name of the inline prompt */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** The prompt, model, and its parameters */
            @JsonProperty("inline_prompt") @ExcludeMissing fun _inlinePrompt() = inlinePrompt

            /** The name of the inline prompt */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InlinePrompt = apply {
                if (!validated) {
                    inlinePrompt().map { it.validate() }
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var inlinePrompt: JsonField<PromptData> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inlinePrompt: InlinePrompt) = apply {
                    this.inlinePrompt = inlinePrompt.inlinePrompt
                    this.name = inlinePrompt.name
                    additionalProperties(inlinePrompt.additionalProperties)
                }

                /** The prompt, model, and its parameters */
                fun inlinePrompt(inlinePrompt: PromptData) =
                    inlinePrompt(JsonField.of(inlinePrompt))

                /** The prompt, model, and its parameters */
                @JsonProperty("inline_prompt")
                @ExcludeMissing
                fun inlinePrompt(inlinePrompt: JsonField<PromptData>) = apply {
                    this.inlinePrompt = inlinePrompt
                }

                /** The name of the inline prompt */
                fun name(name: String) = name(JsonField.of(name))

                /** The name of the inline prompt */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InlinePrompt =
                    InlinePrompt(
                        inlinePrompt,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InlinePrompt && this.inlinePrompt == other.inlinePrompt && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(inlinePrompt, name, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InlinePrompt{inlinePrompt=$inlinePrompt, name=$name, additionalProperties=$additionalProperties}"
        }
    }

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

        private var validated: Boolean = false

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

        fun asFunctionId(): FunctionId = functionId.getOrThrow("functionId")

        fun asProjectSlug(): ProjectSlug = projectSlug.getOrThrow("projectSlug")

        fun asGlobalFunction(): GlobalFunction = globalFunction.getOrThrow("globalFunction")

        fun asPromptSessionId(): PromptSessionId = promptSessionId.getOrThrow("promptSessionId")

        fun asInlineCode(): InlineCode = inlineCode.getOrThrow("inlineCode")

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

        fun validate(): Task = apply {
            if (!validated) {
                if (
                    functionId == null &&
                        projectSlug == null &&
                        globalFunction == null &&
                        promptSessionId == null &&
                        inlineCode == null &&
                        inlinePrompt == null
                ) {
                    throw BraintrustInvalidDataException("Unknown Task: $_json")
                }
                functionId?.validate()
                projectSlug?.validate()
                globalFunction?.validate()
                promptSessionId?.validate()
                inlineCode?.validate()
                inlinePrompt?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Task && this.functionId == other.functionId && this.projectSlug == other.projectSlug && this.globalFunction == other.globalFunction && this.promptSessionId == other.promptSessionId && this.inlineCode == other.inlineCode && this.inlinePrompt == other.inlinePrompt /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(functionId, projectSlug, globalFunction, promptSessionId, inlineCode, inlinePrompt) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                functionId != null -> "Task{functionId=$functionId}"
                projectSlug != null -> "Task{projectSlug=$projectSlug}"
                globalFunction != null -> "Task{globalFunction=$globalFunction}"
                promptSessionId != null -> "Task{promptSessionId=$promptSessionId}"
                inlineCode != null -> "Task{inlineCode=$inlineCode}"
                inlinePrompt != null -> "Task{inlinePrompt=$inlinePrompt}"
                _json != null -> "Task{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Task")
            }
        }

        companion object {

            @JvmStatic fun ofFunctionId(functionId: FunctionId) = Task(functionId = functionId)

            @JvmStatic fun ofProjectSlug(projectSlug: ProjectSlug) = Task(projectSlug = projectSlug)

            @JvmStatic
            fun ofGlobalFunction(globalFunction: GlobalFunction) =
                Task(globalFunction = globalFunction)

            @JvmStatic
            fun ofPromptSessionId(promptSessionId: PromptSessionId) =
                Task(promptSessionId = promptSessionId)

            @JvmStatic fun ofInlineCode(inlineCode: InlineCode) = Task(inlineCode = inlineCode)

            @JvmStatic
            fun ofInlinePrompt(inlinePrompt: InlinePrompt) = Task(inlinePrompt = inlinePrompt)
        }

        interface Visitor<out T> {

            fun visitFunctionId(functionId: FunctionId): T

            fun visitProjectSlug(projectSlug: ProjectSlug): T

            fun visitGlobalFunction(globalFunction: GlobalFunction): T

            fun visitPromptSessionId(promptSessionId: PromptSessionId): T

            fun visitInlineCode(inlineCode: InlineCode): T

            fun visitInlinePrompt(inlinePrompt: InlinePrompt): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Task: $json")
            }
        }

        class Deserializer : BaseDeserializer<Task>(Task::class) {

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

        class Serializer : BaseSerializer<Task>(Task::class) {

            override fun serialize(
                value: Task,
                generator: JsonGenerator,
                provider: SerializerProvider
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
        @JsonDeserialize(builder = FunctionId.Builder::class)
        @NoAutoDetect
        class FunctionId
        private constructor(
            private val functionId: JsonField<String>,
            private val version: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The ID of the function */
            fun functionId(): String = functionId.getRequired("function_id")

            /** The version of the function */
            fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

            /** The ID of the function */
            @JsonProperty("function_id") @ExcludeMissing fun _functionId() = functionId

            /** The version of the function */
            @JsonProperty("version") @ExcludeMissing fun _version() = version

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): FunctionId = apply {
                if (!validated) {
                    functionId()
                    version()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var functionId: JsonField<String> = JsonMissing.of()
                private var version: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(functionId: FunctionId) = apply {
                    this.functionId = functionId.functionId
                    this.version = functionId.version
                    additionalProperties(functionId.additionalProperties)
                }

                /** The ID of the function */
                fun functionId(functionId: String) = functionId(JsonField.of(functionId))

                /** The ID of the function */
                @JsonProperty("function_id")
                @ExcludeMissing
                fun functionId(functionId: JsonField<String>) = apply {
                    this.functionId = functionId
                }

                /** The version of the function */
                fun version(version: String) = version(JsonField.of(version))

                /** The version of the function */
                @JsonProperty("version")
                @ExcludeMissing
                fun version(version: JsonField<String>) = apply { this.version = version }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): FunctionId =
                    FunctionId(
                        functionId,
                        version,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FunctionId && this.functionId == other.functionId && this.version == other.version && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(functionId, version, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "FunctionId{functionId=$functionId, version=$version, additionalProperties=$additionalProperties}"
        }

        /** Project name and slug */
        @JsonDeserialize(builder = ProjectSlug.Builder::class)
        @NoAutoDetect
        class ProjectSlug
        private constructor(
            private val projectName: JsonField<String>,
            private val slug: JsonField<String>,
            private val version: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The name of the project containing the function */
            fun projectName(): String = projectName.getRequired("project_name")

            /** The slug of the function */
            fun slug(): String = slug.getRequired("slug")

            /** The version of the function */
            fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

            /** The name of the project containing the function */
            @JsonProperty("project_name") @ExcludeMissing fun _projectName() = projectName

            /** The slug of the function */
            @JsonProperty("slug") @ExcludeMissing fun _slug() = slug

            /** The version of the function */
            @JsonProperty("version") @ExcludeMissing fun _version() = version

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ProjectSlug = apply {
                if (!validated) {
                    projectName()
                    slug()
                    version()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var projectName: JsonField<String> = JsonMissing.of()
                private var slug: JsonField<String> = JsonMissing.of()
                private var version: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(projectSlug: ProjectSlug) = apply {
                    this.projectName = projectSlug.projectName
                    this.slug = projectSlug.slug
                    this.version = projectSlug.version
                    additionalProperties(projectSlug.additionalProperties)
                }

                /** The name of the project containing the function */
                fun projectName(projectName: String) = projectName(JsonField.of(projectName))

                /** The name of the project containing the function */
                @JsonProperty("project_name")
                @ExcludeMissing
                fun projectName(projectName: JsonField<String>) = apply {
                    this.projectName = projectName
                }

                /** The slug of the function */
                fun slug(slug: String) = slug(JsonField.of(slug))

                /** The slug of the function */
                @JsonProperty("slug")
                @ExcludeMissing
                fun slug(slug: JsonField<String>) = apply { this.slug = slug }

                /** The version of the function */
                fun version(version: String) = version(JsonField.of(version))

                /** The version of the function */
                @JsonProperty("version")
                @ExcludeMissing
                fun version(version: JsonField<String>) = apply { this.version = version }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ProjectSlug =
                    ProjectSlug(
                        projectName,
                        slug,
                        version,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ProjectSlug && this.projectName == other.projectName && this.slug == other.slug && this.version == other.version && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(projectName, slug, version, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ProjectSlug{projectName=$projectName, slug=$slug, version=$version, additionalProperties=$additionalProperties}"
        }

        /** Global function name */
        @JsonDeserialize(builder = GlobalFunction.Builder::class)
        @NoAutoDetect
        class GlobalFunction
        private constructor(
            private val globalFunction: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /**
             * The name of the global function. Currently, the global namespace includes the
             * functions in autoevals
             */
            fun globalFunction(): String = globalFunction.getRequired("global_function")

            /**
             * The name of the global function. Currently, the global namespace includes the
             * functions in autoevals
             */
            @JsonProperty("global_function") @ExcludeMissing fun _globalFunction() = globalFunction

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): GlobalFunction = apply {
                if (!validated) {
                    globalFunction()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var globalFunction: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(globalFunction: GlobalFunction) = apply {
                    this.globalFunction = globalFunction.globalFunction
                    additionalProperties(globalFunction.additionalProperties)
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
                @JsonProperty("global_function")
                @ExcludeMissing
                fun globalFunction(globalFunction: JsonField<String>) = apply {
                    this.globalFunction = globalFunction
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): GlobalFunction =
                    GlobalFunction(globalFunction, additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GlobalFunction && this.globalFunction == other.globalFunction && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(globalFunction, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "GlobalFunction{globalFunction=$globalFunction, additionalProperties=$additionalProperties}"
        }

        /** Prompt session id */
        @JsonDeserialize(builder = PromptSessionId.Builder::class)
        @NoAutoDetect
        class PromptSessionId
        private constructor(
            private val promptSessionId: JsonField<String>,
            private val promptSessionFunctionId: JsonField<String>,
            private val version: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The ID of the prompt session */
            fun promptSessionId(): String = promptSessionId.getRequired("prompt_session_id")

            /** The ID of the function in the prompt session */
            fun promptSessionFunctionId(): String =
                promptSessionFunctionId.getRequired("prompt_session_function_id")

            /** The version of the function */
            fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

            /** The ID of the prompt session */
            @JsonProperty("prompt_session_id")
            @ExcludeMissing
            fun _promptSessionId() = promptSessionId

            /** The ID of the function in the prompt session */
            @JsonProperty("prompt_session_function_id")
            @ExcludeMissing
            fun _promptSessionFunctionId() = promptSessionFunctionId

            /** The version of the function */
            @JsonProperty("version") @ExcludeMissing fun _version() = version

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): PromptSessionId = apply {
                if (!validated) {
                    promptSessionId()
                    promptSessionFunctionId()
                    version()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var promptSessionId: JsonField<String> = JsonMissing.of()
                private var promptSessionFunctionId: JsonField<String> = JsonMissing.of()
                private var version: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(promptSessionId: PromptSessionId) = apply {
                    this.promptSessionId = promptSessionId.promptSessionId
                    this.promptSessionFunctionId = promptSessionId.promptSessionFunctionId
                    this.version = promptSessionId.version
                    additionalProperties(promptSessionId.additionalProperties)
                }

                /** The ID of the prompt session */
                fun promptSessionId(promptSessionId: String) =
                    promptSessionId(JsonField.of(promptSessionId))

                /** The ID of the prompt session */
                @JsonProperty("prompt_session_id")
                @ExcludeMissing
                fun promptSessionId(promptSessionId: JsonField<String>) = apply {
                    this.promptSessionId = promptSessionId
                }

                /** The ID of the function in the prompt session */
                fun promptSessionFunctionId(promptSessionFunctionId: String) =
                    promptSessionFunctionId(JsonField.of(promptSessionFunctionId))

                /** The ID of the function in the prompt session */
                @JsonProperty("prompt_session_function_id")
                @ExcludeMissing
                fun promptSessionFunctionId(promptSessionFunctionId: JsonField<String>) = apply {
                    this.promptSessionFunctionId = promptSessionFunctionId
                }

                /** The version of the function */
                fun version(version: String) = version(JsonField.of(version))

                /** The version of the function */
                @JsonProperty("version")
                @ExcludeMissing
                fun version(version: JsonField<String>) = apply { this.version = version }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PromptSessionId =
                    PromptSessionId(
                        promptSessionId,
                        promptSessionFunctionId,
                        version,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PromptSessionId && this.promptSessionId == other.promptSessionId && this.promptSessionFunctionId == other.promptSessionFunctionId && this.version == other.version && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(promptSessionId, promptSessionFunctionId, version, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "PromptSessionId{promptSessionId=$promptSessionId, promptSessionFunctionId=$promptSessionFunctionId, version=$version, additionalProperties=$additionalProperties}"
        }

        /** Inline code function */
        @JsonDeserialize(builder = InlineCode.Builder::class)
        @NoAutoDetect
        class InlineCode
        private constructor(
            private val inlineContext: JsonField<InlineContext>,
            private val code: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun inlineContext(): InlineContext = inlineContext.getRequired("inline_context")

            /** The inline code to execute */
            fun code(): String = code.getRequired("code")

            /** The name of the inline code function */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            @JsonProperty("inline_context") @ExcludeMissing fun _inlineContext() = inlineContext

            /** The inline code to execute */
            @JsonProperty("code") @ExcludeMissing fun _code() = code

            /** The name of the inline code function */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InlineCode = apply {
                if (!validated) {
                    inlineContext().validate()
                    code()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var inlineContext: JsonField<InlineContext> = JsonMissing.of()
                private var code: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inlineCode: InlineCode) = apply {
                    this.inlineContext = inlineCode.inlineContext
                    this.code = inlineCode.code
                    this.name = inlineCode.name
                    additionalProperties(inlineCode.additionalProperties)
                }

                fun inlineContext(inlineContext: InlineContext) =
                    inlineContext(JsonField.of(inlineContext))

                @JsonProperty("inline_context")
                @ExcludeMissing
                fun inlineContext(inlineContext: JsonField<InlineContext>) = apply {
                    this.inlineContext = inlineContext
                }

                /** The inline code to execute */
                fun code(code: String) = code(JsonField.of(code))

                /** The inline code to execute */
                @JsonProperty("code")
                @ExcludeMissing
                fun code(code: JsonField<String>) = apply { this.code = code }

                /** The name of the inline code function */
                fun name(name: String) = name(JsonField.of(name))

                /** The name of the inline code function */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InlineCode =
                    InlineCode(
                        inlineContext,
                        code,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = InlineContext.Builder::class)
            @NoAutoDetect
            class InlineContext
            private constructor(
                private val runtime: JsonField<Runtime>,
                private val version: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun runtime(): Runtime = runtime.getRequired("runtime")

                fun version(): String = version.getRequired("version")

                @JsonProperty("runtime") @ExcludeMissing fun _runtime() = runtime

                @JsonProperty("version") @ExcludeMissing fun _version() = version

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): InlineContext = apply {
                    if (!validated) {
                        runtime()
                        version()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var runtime: JsonField<Runtime> = JsonMissing.of()
                    private var version: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(inlineContext: InlineContext) = apply {
                        this.runtime = inlineContext.runtime
                        this.version = inlineContext.version
                        additionalProperties(inlineContext.additionalProperties)
                    }

                    fun runtime(runtime: Runtime) = runtime(JsonField.of(runtime))

                    @JsonProperty("runtime")
                    @ExcludeMissing
                    fun runtime(runtime: JsonField<Runtime>) = apply { this.runtime = runtime }

                    fun version(version: String) = version(JsonField.of(version))

                    @JsonProperty("version")
                    @ExcludeMissing
                    fun version(version: JsonField<String>) = apply { this.version = version }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): InlineContext =
                        InlineContext(
                            runtime,
                            version,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Runtime
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Runtime && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val NODE = Runtime(JsonField.of("node"))

                        @JvmField val PYTHON = Runtime(JsonField.of("python"))

                        @JvmStatic fun of(value: String) = Runtime(JsonField.of(value))
                    }

                    enum class Known {
                        NODE,
                        PYTHON,
                    }

                    enum class Value {
                        NODE,
                        PYTHON,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            NODE -> Value.NODE
                            PYTHON -> Value.PYTHON
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            NODE -> Known.NODE
                            PYTHON -> Known.PYTHON
                            else -> throw BraintrustInvalidDataException("Unknown Runtime: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is InlineContext && this.runtime == other.runtime && this.version == other.version && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(runtime, version, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "InlineContext{runtime=$runtime, version=$version, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InlineCode && this.inlineContext == other.inlineContext && this.code == other.code && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(inlineContext, code, name, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InlineCode{inlineContext=$inlineContext, code=$code, name=$name, additionalProperties=$additionalProperties}"
        }

        /** Inline prompt definition */
        @JsonDeserialize(builder = InlinePrompt.Builder::class)
        @NoAutoDetect
        class InlinePrompt
        private constructor(
            private val inlinePrompt: JsonField<PromptData>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The prompt, model, and its parameters */
            fun inlinePrompt(): Optional<PromptData> =
                Optional.ofNullable(inlinePrompt.getNullable("inline_prompt"))

            /** The name of the inline prompt */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** The prompt, model, and its parameters */
            @JsonProperty("inline_prompt") @ExcludeMissing fun _inlinePrompt() = inlinePrompt

            /** The name of the inline prompt */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InlinePrompt = apply {
                if (!validated) {
                    inlinePrompt().map { it.validate() }
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var inlinePrompt: JsonField<PromptData> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inlinePrompt: InlinePrompt) = apply {
                    this.inlinePrompt = inlinePrompt.inlinePrompt
                    this.name = inlinePrompt.name
                    additionalProperties(inlinePrompt.additionalProperties)
                }

                /** The prompt, model, and its parameters */
                fun inlinePrompt(inlinePrompt: PromptData) =
                    inlinePrompt(JsonField.of(inlinePrompt))

                /** The prompt, model, and its parameters */
                @JsonProperty("inline_prompt")
                @ExcludeMissing
                fun inlinePrompt(inlinePrompt: JsonField<PromptData>) = apply {
                    this.inlinePrompt = inlinePrompt
                }

                /** The name of the inline prompt */
                fun name(name: String) = name(JsonField.of(name))

                /** The name of the inline prompt */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InlinePrompt =
                    InlinePrompt(
                        inlinePrompt,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InlinePrompt && this.inlinePrompt == other.inlinePrompt && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(inlinePrompt, name, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InlinePrompt{inlinePrompt=$inlinePrompt, name=$name, additionalProperties=$additionalProperties}"
        }
    }

    /**
     * Optional experiment-level metadata to store about the evaluation. You can later use this to
     * slice & dice across experiments.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }
}
