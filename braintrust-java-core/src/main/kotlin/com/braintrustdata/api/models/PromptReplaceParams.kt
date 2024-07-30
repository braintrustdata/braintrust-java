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

class PromptReplaceParams
constructor(
    private val name: String,
    private val projectId: String,
    private val slug: String,
    private val description: String?,
    private val promptData: PromptData?,
    private val tags: List<String>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun projectId(): String = projectId

    fun slug(): String = slug

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun promptData(): Optional<PromptData> = Optional.ofNullable(promptData)

    fun tags(): Optional<List<String>> = Optional.ofNullable(tags)

    @JvmSynthetic
    internal fun getBody(): PromptReplaceBody {
        return PromptReplaceBody(
            name,
            projectId,
            slug,
            description,
            promptData,
            tags,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = PromptReplaceBody.Builder::class)
    @NoAutoDetect
    class PromptReplaceBody
    internal constructor(
        private val name: String?,
        private val projectId: String?,
        private val slug: String?,
        private val description: String?,
        private val promptData: PromptData?,
        private val tags: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Name of the prompt */
        @JsonProperty("name") fun name(): String? = name

        /** Unique identifier for the project that the prompt belongs under */
        @JsonProperty("project_id") fun projectId(): String? = projectId

        /** Unique identifier for the prompt */
        @JsonProperty("slug") fun slug(): String? = slug

        /** Textual description of the prompt */
        @JsonProperty("description") fun description(): String? = description

        /** The prompt, model, and its parameters */
        @JsonProperty("prompt_data") fun promptData(): PromptData? = promptData

        /** A list of tags for the prompt */
        @JsonProperty("tags") fun tags(): List<String>? = tags

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PromptReplaceBody &&
                this.name == other.name &&
                this.projectId == other.projectId &&
                this.slug == other.slug &&
                this.description == other.description &&
                this.promptData == other.promptData &&
                this.tags == other.tags &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        projectId,
                        slug,
                        description,
                        promptData,
                        tags,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PromptReplaceBody{name=$name, projectId=$projectId, slug=$slug, description=$description, promptData=$promptData, tags=$tags, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var projectId: String? = null
            private var slug: String? = null
            private var description: String? = null
            private var promptData: PromptData? = null
            private var tags: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(promptReplaceBody: PromptReplaceBody) = apply {
                this.name = promptReplaceBody.name
                this.projectId = promptReplaceBody.projectId
                this.slug = promptReplaceBody.slug
                this.description = promptReplaceBody.description
                this.promptData = promptReplaceBody.promptData
                this.tags = promptReplaceBody.tags
                additionalProperties(promptReplaceBody.additionalProperties)
            }

            /** Name of the prompt */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** Unique identifier for the project that the prompt belongs under */
            @JsonProperty("project_id")
            fun projectId(projectId: String) = apply { this.projectId = projectId }

            /** Unique identifier for the prompt */
            @JsonProperty("slug") fun slug(slug: String) = apply { this.slug = slug }

            /** Textual description of the prompt */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** The prompt, model, and its parameters */
            @JsonProperty("prompt_data")
            fun promptData(promptData: PromptData) = apply { this.promptData = promptData }

            /** A list of tags for the prompt */
            @JsonProperty("tags") fun tags(tags: List<String>) = apply { this.tags = tags }

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

            fun build(): PromptReplaceBody =
                PromptReplaceBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(projectId) { "`projectId` is required but was not set" },
                    checkNotNull(slug) { "`slug` is required but was not set" },
                    description,
                    promptData,
                    tags?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PromptReplaceParams &&
            this.name == other.name &&
            this.projectId == other.projectId &&
            this.slug == other.slug &&
            this.description == other.description &&
            this.promptData == other.promptData &&
            this.tags == other.tags &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            name,
            projectId,
            slug,
            description,
            promptData,
            tags,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "PromptReplaceParams{name=$name, projectId=$projectId, slug=$slug, description=$description, promptData=$promptData, tags=$tags, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var projectId: String? = null
        private var slug: String? = null
        private var description: String? = null
        private var promptData: PromptData? = null
        private var tags: MutableList<String> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(promptReplaceParams: PromptReplaceParams) = apply {
            this.name = promptReplaceParams.name
            this.projectId = promptReplaceParams.projectId
            this.slug = promptReplaceParams.slug
            this.description = promptReplaceParams.description
            this.promptData = promptReplaceParams.promptData
            this.tags(promptReplaceParams.tags ?: listOf())
            additionalQueryParams(promptReplaceParams.additionalQueryParams)
            additionalHeaders(promptReplaceParams.additionalHeaders)
            additionalBodyProperties(promptReplaceParams.additionalBodyProperties)
        }

        /** Name of the prompt */
        fun name(name: String) = apply { this.name = name }

        /** Unique identifier for the project that the prompt belongs under */
        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /** Unique identifier for the prompt */
        fun slug(slug: String) = apply { this.slug = slug }

        /** Textual description of the prompt */
        fun description(description: String) = apply { this.description = description }

        /** The prompt, model, and its parameters */
        fun promptData(promptData: PromptData) = apply { this.promptData = promptData }

        /** A list of tags for the prompt */
        fun tags(tags: List<String>) = apply {
            this.tags.clear()
            this.tags.addAll(tags)
        }

        /** A list of tags for the prompt */
        fun addTag(tag: String) = apply { this.tags.add(tag) }

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

        fun build(): PromptReplaceParams =
            PromptReplaceParams(
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(projectId) { "`projectId` is required but was not set" },
                checkNotNull(slug) { "`slug` is required but was not set" },
                description,
                promptData,
                if (tags.size == 0) null else tags.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /** The prompt, model, and its parameters */
    @JsonDeserialize(builder = PromptData.Builder::class)
    @NoAutoDetect
    class PromptData
    private constructor(
        private val prompt: Prompt?,
        private val options: Options?,
        private val origin: Origin?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("prompt") fun prompt(): Prompt? = prompt

        @JsonProperty("options") fun options(): Options? = options

        @JsonProperty("origin") fun origin(): Origin? = origin

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PromptData &&
                this.prompt == other.prompt &&
                this.options == other.options &&
                this.origin == other.origin &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        prompt,
                        options,
                        origin,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PromptData{prompt=$prompt, options=$options, origin=$origin, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var prompt: Prompt? = null
            private var options: Options? = null
            private var origin: Origin? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(promptData: PromptData) = apply {
                this.prompt = promptData.prompt
                this.options = promptData.options
                this.origin = promptData.origin
                additionalProperties(promptData.additionalProperties)
            }

            @JsonProperty("prompt") fun prompt(prompt: Prompt) = apply { this.prompt = prompt }

            @JsonProperty("options")
            fun options(options: Options) = apply { this.options = options }

            @JsonProperty("origin") fun origin(origin: Origin) = apply { this.origin = origin }

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

            fun build(): PromptData =
                PromptData(
                    prompt,
                    options,
                    origin,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = Options.Builder::class)
        @NoAutoDetect
        class Options
        private constructor(
            private val model: String?,
            private val params: Params?,
            private val position: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonProperty("model") fun model(): String? = model

            @JsonProperty("params") fun params(): Params? = params

            @JsonProperty("position") fun position(): String? = position

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Options &&
                    this.model == other.model &&
                    this.params == other.params &&
                    this.position == other.position &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            model,
                            params,
                            position,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Options{model=$model, params=$params, position=$position, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var model: String? = null
                private var params: Params? = null
                private var position: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(options: Options) = apply {
                    this.model = options.model
                    this.params = options.params
                    this.position = options.position
                    additionalProperties(options.additionalProperties)
                }

                @JsonProperty("model") fun model(model: String) = apply { this.model = model }

                @JsonProperty("params") fun params(params: Params) = apply { this.params = params }

                @JsonProperty("position")
                fun position(position: String) = apply { this.position = position }

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

                fun build(): Options =
                    Options(
                        model,
                        params,
                        position,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(using = Params.Deserializer::class)
            @JsonSerialize(using = Params.Serializer::class)
            class Params
            private constructor(
                private val openaiModelParams: OpenAIModelParams? = null,
                private val anthropicModelParams: AnthropicModelParams? = null,
                private val googleModelParams: GoogleModelParams? = null,
                private val windowAiModelParams: WindowAiModelParams? = null,
                private val jsCompletionParams: JsCompletionParams? = null,
                private val _json: JsonValue? = null,
            ) {

                private var validated: Boolean = false

                fun openaiModelParams(): Optional<OpenAIModelParams> =
                    Optional.ofNullable(openaiModelParams)

                fun anthropicModelParams(): Optional<AnthropicModelParams> =
                    Optional.ofNullable(anthropicModelParams)

                fun googleModelParams(): Optional<GoogleModelParams> =
                    Optional.ofNullable(googleModelParams)

                fun windowAiModelParams(): Optional<WindowAiModelParams> =
                    Optional.ofNullable(windowAiModelParams)

                fun jsCompletionParams(): Optional<JsCompletionParams> =
                    Optional.ofNullable(jsCompletionParams)

                fun isOpenAIModelParams(): Boolean = openaiModelParams != null

                fun isAnthropicModelParams(): Boolean = anthropicModelParams != null

                fun isGoogleModelParams(): Boolean = googleModelParams != null

                fun isWindowAiModelParams(): Boolean = windowAiModelParams != null

                fun isJsCompletionParams(): Boolean = jsCompletionParams != null

                fun asOpenAIModelParams(): OpenAIModelParams =
                    openaiModelParams.getOrThrow("openaiModelParams")

                fun asAnthropicModelParams(): AnthropicModelParams =
                    anthropicModelParams.getOrThrow("anthropicModelParams")

                fun asGoogleModelParams(): GoogleModelParams =
                    googleModelParams.getOrThrow("googleModelParams")

                fun asWindowAiModelParams(): WindowAiModelParams =
                    windowAiModelParams.getOrThrow("windowAiModelParams")

                fun asJsCompletionParams(): JsCompletionParams =
                    jsCompletionParams.getOrThrow("jsCompletionParams")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        openaiModelParams != null ->
                            visitor.visitOpenAIModelParams(openaiModelParams)
                        anthropicModelParams != null ->
                            visitor.visitAnthropicModelParams(anthropicModelParams)
                        googleModelParams != null ->
                            visitor.visitGoogleModelParams(googleModelParams)
                        windowAiModelParams != null ->
                            visitor.visitWindowAiModelParams(windowAiModelParams)
                        jsCompletionParams != null ->
                            visitor.visitJsCompletionParams(jsCompletionParams)
                        else -> visitor.unknown(_json)
                    }
                }

                fun validate(): Params = apply {
                    if (!validated) {
                        if (
                            openaiModelParams == null &&
                                anthropicModelParams == null &&
                                googleModelParams == null &&
                                windowAiModelParams == null &&
                                jsCompletionParams == null
                        ) {
                            throw BraintrustInvalidDataException("Unknown Params: $_json")
                        }
                        openaiModelParams?.validate()
                        anthropicModelParams?.validate()
                        googleModelParams?.validate()
                        windowAiModelParams?.validate()
                        jsCompletionParams?.validate()
                        validated = true
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Params &&
                        this.openaiModelParams == other.openaiModelParams &&
                        this.anthropicModelParams == other.anthropicModelParams &&
                        this.googleModelParams == other.googleModelParams &&
                        this.windowAiModelParams == other.windowAiModelParams &&
                        this.jsCompletionParams == other.jsCompletionParams
                }

                override fun hashCode(): Int {
                    return Objects.hash(
                        openaiModelParams,
                        anthropicModelParams,
                        googleModelParams,
                        windowAiModelParams,
                        jsCompletionParams,
                    )
                }

                override fun toString(): String {
                    return when {
                        openaiModelParams != null -> "Params{openaiModelParams=$openaiModelParams}"
                        anthropicModelParams != null ->
                            "Params{anthropicModelParams=$anthropicModelParams}"
                        googleModelParams != null -> "Params{googleModelParams=$googleModelParams}"
                        windowAiModelParams != null ->
                            "Params{windowAiModelParams=$windowAiModelParams}"
                        jsCompletionParams != null ->
                            "Params{jsCompletionParams=$jsCompletionParams}"
                        _json != null -> "Params{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Params")
                    }
                }

                companion object {

                    @JvmStatic
                    fun ofOpenAIModelParams(openaiModelParams: OpenAIModelParams) =
                        Params(openaiModelParams = openaiModelParams)

                    @JvmStatic
                    fun ofAnthropicModelParams(anthropicModelParams: AnthropicModelParams) =
                        Params(anthropicModelParams = anthropicModelParams)

                    @JvmStatic
                    fun ofGoogleModelParams(googleModelParams: GoogleModelParams) =
                        Params(googleModelParams = googleModelParams)

                    @JvmStatic
                    fun ofWindowAiModelParams(windowAiModelParams: WindowAiModelParams) =
                        Params(windowAiModelParams = windowAiModelParams)

                    @JvmStatic
                    fun ofJsCompletionParams(jsCompletionParams: JsCompletionParams) =
                        Params(jsCompletionParams = jsCompletionParams)
                }

                interface Visitor<out T> {

                    fun visitOpenAIModelParams(openaiModelParams: OpenAIModelParams): T

                    fun visitAnthropicModelParams(anthropicModelParams: AnthropicModelParams): T

                    fun visitGoogleModelParams(googleModelParams: GoogleModelParams): T

                    fun visitWindowAiModelParams(windowAiModelParams: WindowAiModelParams): T

                    fun visitJsCompletionParams(jsCompletionParams: JsCompletionParams): T

                    fun unknown(json: JsonValue?): T {
                        throw BraintrustInvalidDataException("Unknown Params: $json")
                    }
                }

                class Deserializer : BaseDeserializer<Params>(Params::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Params {
                        val json = JsonValue.fromJsonNode(node)
                        tryDeserialize(node, jacksonTypeRef<OpenAIModelParams>()) { it.validate() }
                            ?.let {
                                return Params(openaiModelParams = it, _json = json)
                            }
                        tryDeserialize(node, jacksonTypeRef<AnthropicModelParams>()) {
                                it.validate()
                            }
                            ?.let {
                                return Params(anthropicModelParams = it, _json = json)
                            }
                        tryDeserialize(node, jacksonTypeRef<GoogleModelParams>()) { it.validate() }
                            ?.let {
                                return Params(googleModelParams = it, _json = json)
                            }
                        tryDeserialize(node, jacksonTypeRef<WindowAiModelParams>()) {
                                it.validate()
                            }
                            ?.let {
                                return Params(windowAiModelParams = it, _json = json)
                            }
                        tryDeserialize(node, jacksonTypeRef<JsCompletionParams>()) { it.validate() }
                            ?.let {
                                return Params(jsCompletionParams = it, _json = json)
                            }

                        return Params(_json = json)
                    }
                }

                class Serializer : BaseSerializer<Params>(Params::class) {

                    override fun serialize(
                        value: Params,
                        generator: JsonGenerator,
                        provider: SerializerProvider
                    ) {
                        when {
                            value.openaiModelParams != null ->
                                generator.writeObject(value.openaiModelParams)
                            value.anthropicModelParams != null ->
                                generator.writeObject(value.anthropicModelParams)
                            value.googleModelParams != null ->
                                generator.writeObject(value.googleModelParams)
                            value.windowAiModelParams != null ->
                                generator.writeObject(value.windowAiModelParams)
                            value.jsCompletionParams != null ->
                                generator.writeObject(value.jsCompletionParams)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Params")
                        }
                    }
                }

                @JsonDeserialize(builder = OpenAIModelParams.Builder::class)
                @NoAutoDetect
                class OpenAIModelParams
                private constructor(
                    private val useCache: JsonField<Boolean>,
                    private val temperature: JsonField<Double>,
                    private val topP: JsonField<Double>,
                    private val maxTokens: JsonField<Double>,
                    private val frequencyPenalty: JsonField<Double>,
                    private val presencePenalty: JsonField<Double>,
                    private val responseFormat: JsonField<ResponseFormat>,
                    private val toolChoice: JsonField<ToolChoice>,
                    private val functionCall: JsonField<FunctionCall>,
                    private val n: JsonField<Double>,
                    private val stop: JsonField<List<String>>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun useCache(): Optional<Boolean> =
                        Optional.ofNullable(useCache.getNullable("use_cache"))

                    fun temperature(): Optional<Double> =
                        Optional.ofNullable(temperature.getNullable("temperature"))

                    fun topP(): Optional<Double> = Optional.ofNullable(topP.getNullable("top_p"))

                    fun maxTokens(): Optional<Double> =
                        Optional.ofNullable(maxTokens.getNullable("max_tokens"))

                    fun frequencyPenalty(): Optional<Double> =
                        Optional.ofNullable(frequencyPenalty.getNullable("frequency_penalty"))

                    fun presencePenalty(): Optional<Double> =
                        Optional.ofNullable(presencePenalty.getNullable("presence_penalty"))

                    fun responseFormat(): Optional<ResponseFormat> =
                        Optional.ofNullable(responseFormat.getNullable("response_format"))

                    fun toolChoice(): Optional<ToolChoice> =
                        Optional.ofNullable(toolChoice.getNullable("tool_choice"))

                    fun functionCall(): Optional<FunctionCall> =
                        Optional.ofNullable(functionCall.getNullable("function_call"))

                    fun n(): Optional<Double> = Optional.ofNullable(n.getNullable("n"))

                    fun stop(): Optional<List<String>> =
                        Optional.ofNullable(stop.getNullable("stop"))

                    @JsonProperty("use_cache") @ExcludeMissing fun _useCache() = useCache

                    @JsonProperty("temperature") @ExcludeMissing fun _temperature() = temperature

                    @JsonProperty("top_p") @ExcludeMissing fun _topP() = topP

                    @JsonProperty("max_tokens") @ExcludeMissing fun _maxTokens() = maxTokens

                    @JsonProperty("frequency_penalty")
                    @ExcludeMissing
                    fun _frequencyPenalty() = frequencyPenalty

                    @JsonProperty("presence_penalty")
                    @ExcludeMissing
                    fun _presencePenalty() = presencePenalty

                    @JsonProperty("response_format")
                    @ExcludeMissing
                    fun _responseFormat() = responseFormat

                    @JsonProperty("tool_choice") @ExcludeMissing fun _toolChoice() = toolChoice

                    @JsonProperty("function_call")
                    @ExcludeMissing
                    fun _functionCall() = functionCall

                    @JsonProperty("n") @ExcludeMissing fun _n() = n

                    @JsonProperty("stop") @ExcludeMissing fun _stop() = stop

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): OpenAIModelParams = apply {
                        if (!validated) {
                            useCache()
                            temperature()
                            topP()
                            maxTokens()
                            frequencyPenalty()
                            presencePenalty()
                            responseFormat().map { it.validate() }
                            toolChoice()
                            functionCall()
                            n()
                            stop()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is OpenAIModelParams &&
                            this.useCache == other.useCache &&
                            this.temperature == other.temperature &&
                            this.topP == other.topP &&
                            this.maxTokens == other.maxTokens &&
                            this.frequencyPenalty == other.frequencyPenalty &&
                            this.presencePenalty == other.presencePenalty &&
                            this.responseFormat == other.responseFormat &&
                            this.toolChoice == other.toolChoice &&
                            this.functionCall == other.functionCall &&
                            this.n == other.n &&
                            this.stop == other.stop &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    useCache,
                                    temperature,
                                    topP,
                                    maxTokens,
                                    frequencyPenalty,
                                    presencePenalty,
                                    responseFormat,
                                    toolChoice,
                                    functionCall,
                                    n,
                                    stop,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "OpenAIModelParams{useCache=$useCache, temperature=$temperature, topP=$topP, maxTokens=$maxTokens, frequencyPenalty=$frequencyPenalty, presencePenalty=$presencePenalty, responseFormat=$responseFormat, toolChoice=$toolChoice, functionCall=$functionCall, n=$n, stop=$stop, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var useCache: JsonField<Boolean> = JsonMissing.of()
                        private var temperature: JsonField<Double> = JsonMissing.of()
                        private var topP: JsonField<Double> = JsonMissing.of()
                        private var maxTokens: JsonField<Double> = JsonMissing.of()
                        private var frequencyPenalty: JsonField<Double> = JsonMissing.of()
                        private var presencePenalty: JsonField<Double> = JsonMissing.of()
                        private var responseFormat: JsonField<ResponseFormat> = JsonMissing.of()
                        private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
                        private var functionCall: JsonField<FunctionCall> = JsonMissing.of()
                        private var n: JsonField<Double> = JsonMissing.of()
                        private var stop: JsonField<List<String>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(openaiModelParams: OpenAIModelParams) = apply {
                            this.useCache = openaiModelParams.useCache
                            this.temperature = openaiModelParams.temperature
                            this.topP = openaiModelParams.topP
                            this.maxTokens = openaiModelParams.maxTokens
                            this.frequencyPenalty = openaiModelParams.frequencyPenalty
                            this.presencePenalty = openaiModelParams.presencePenalty
                            this.responseFormat = openaiModelParams.responseFormat
                            this.toolChoice = openaiModelParams.toolChoice
                            this.functionCall = openaiModelParams.functionCall
                            this.n = openaiModelParams.n
                            this.stop = openaiModelParams.stop
                            additionalProperties(openaiModelParams.additionalProperties)
                        }

                        fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                        @JsonProperty("use_cache")
                        @ExcludeMissing
                        fun useCache(useCache: JsonField<Boolean>) = apply {
                            this.useCache = useCache
                        }

                        fun temperature(temperature: Double) =
                            temperature(JsonField.of(temperature))

                        @JsonProperty("temperature")
                        @ExcludeMissing
                        fun temperature(temperature: JsonField<Double>) = apply {
                            this.temperature = temperature
                        }

                        fun topP(topP: Double) = topP(JsonField.of(topP))

                        @JsonProperty("top_p")
                        @ExcludeMissing
                        fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

                        fun maxTokens(maxTokens: Double) = maxTokens(JsonField.of(maxTokens))

                        @JsonProperty("max_tokens")
                        @ExcludeMissing
                        fun maxTokens(maxTokens: JsonField<Double>) = apply {
                            this.maxTokens = maxTokens
                        }

                        fun frequencyPenalty(frequencyPenalty: Double) =
                            frequencyPenalty(JsonField.of(frequencyPenalty))

                        @JsonProperty("frequency_penalty")
                        @ExcludeMissing
                        fun frequencyPenalty(frequencyPenalty: JsonField<Double>) = apply {
                            this.frequencyPenalty = frequencyPenalty
                        }

                        fun presencePenalty(presencePenalty: Double) =
                            presencePenalty(JsonField.of(presencePenalty))

                        @JsonProperty("presence_penalty")
                        @ExcludeMissing
                        fun presencePenalty(presencePenalty: JsonField<Double>) = apply {
                            this.presencePenalty = presencePenalty
                        }

                        fun responseFormat(responseFormat: ResponseFormat) =
                            responseFormat(JsonField.of(responseFormat))

                        @JsonProperty("response_format")
                        @ExcludeMissing
                        fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
                            this.responseFormat = responseFormat
                        }

                        fun toolChoice(toolChoice: ToolChoice) =
                            toolChoice(JsonField.of(toolChoice))

                        @JsonProperty("tool_choice")
                        @ExcludeMissing
                        fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply {
                            this.toolChoice = toolChoice
                        }

                        fun functionCall(functionCall: FunctionCall) =
                            functionCall(JsonField.of(functionCall))

                        @JsonProperty("function_call")
                        @ExcludeMissing
                        fun functionCall(functionCall: JsonField<FunctionCall>) = apply {
                            this.functionCall = functionCall
                        }

                        fun n(n: Double) = n(JsonField.of(n))

                        @JsonProperty("n")
                        @ExcludeMissing
                        fun n(n: JsonField<Double>) = apply { this.n = n }

                        fun stop(stop: List<String>) = stop(JsonField.of(stop))

                        @JsonProperty("stop")
                        @ExcludeMissing
                        fun stop(stop: JsonField<List<String>>) = apply { this.stop = stop }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): OpenAIModelParams =
                            OpenAIModelParams(
                                useCache,
                                temperature,
                                topP,
                                maxTokens,
                                frequencyPenalty,
                                presencePenalty,
                                responseFormat,
                                toolChoice,
                                functionCall,
                                n,
                                stop.map { it.toUnmodifiable() },
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    @JsonDeserialize(using = FunctionCall.Deserializer::class)
                    @JsonSerialize(using = FunctionCall.Serializer::class)
                    class FunctionCall
                    private constructor(
                        private val auto: Auto? = null,
                        private val none: None? = null,
                        private val function: Function? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        private var validated: Boolean = false

                        fun auto(): Optional<Auto> = Optional.ofNullable(auto)

                        fun none(): Optional<None> = Optional.ofNullable(none)

                        fun function(): Optional<Function> = Optional.ofNullable(function)

                        fun isAuto(): Boolean = auto != null

                        fun isNone(): Boolean = none != null

                        fun isFunction(): Boolean = function != null

                        fun asAuto(): Auto = auto.getOrThrow("auto")

                        fun asNone(): None = none.getOrThrow("none")

                        fun asFunction(): Function = function.getOrThrow("function")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        fun <T> accept(visitor: Visitor<T>): T {
                            return when {
                                auto != null -> visitor.visitAuto(auto)
                                none != null -> visitor.visitNone(none)
                                function != null -> visitor.visitFunction(function)
                                else -> visitor.unknown(_json)
                            }
                        }

                        fun validate(): FunctionCall = apply {
                            if (!validated) {
                                if (auto == null && none == null && function == null) {
                                    throw BraintrustInvalidDataException(
                                        "Unknown FunctionCall: $_json"
                                    )
                                }
                                function?.validate()
                                validated = true
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is FunctionCall &&
                                this.auto == other.auto &&
                                this.none == other.none &&
                                this.function == other.function
                        }

                        override fun hashCode(): Int {
                            return Objects.hash(
                                auto,
                                none,
                                function,
                            )
                        }

                        override fun toString(): String {
                            return when {
                                auto != null -> "FunctionCall{auto=$auto}"
                                none != null -> "FunctionCall{none=$none}"
                                function != null -> "FunctionCall{function=$function}"
                                _json != null -> "FunctionCall{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid FunctionCall")
                            }
                        }

                        companion object {

                            @JvmStatic fun ofAuto(auto: Auto) = FunctionCall(auto = auto)

                            @JvmStatic fun ofNone(none: None) = FunctionCall(none = none)

                            @JvmStatic
                            fun ofFunction(function: Function) = FunctionCall(function = function)
                        }

                        interface Visitor<out T> {

                            fun visitAuto(auto: Auto): T

                            fun visitNone(none: None): T

                            fun visitFunction(function: Function): T

                            fun unknown(json: JsonValue?): T {
                                throw BraintrustInvalidDataException("Unknown FunctionCall: $json")
                            }
                        }

                        class Deserializer : BaseDeserializer<FunctionCall>(FunctionCall::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): FunctionCall {
                                val json = JsonValue.fromJsonNode(node)
                                tryDeserialize(node, jacksonTypeRef<Auto>())?.let {
                                    return FunctionCall(auto = it, _json = json)
                                }
                                tryDeserialize(node, jacksonTypeRef<None>())?.let {
                                    return FunctionCall(none = it, _json = json)
                                }
                                tryDeserialize(node, jacksonTypeRef<Function>()) { it.validate() }
                                    ?.let {
                                        return FunctionCall(function = it, _json = json)
                                    }

                                return FunctionCall(_json = json)
                            }
                        }

                        class Serializer : BaseSerializer<FunctionCall>(FunctionCall::class) {

                            override fun serialize(
                                value: FunctionCall,
                                generator: JsonGenerator,
                                provider: SerializerProvider
                            ) {
                                when {
                                    value.auto != null -> generator.writeObject(value.auto)
                                    value.none != null -> generator.writeObject(value.none)
                                    value.function != null -> generator.writeObject(value.function)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid FunctionCall")
                                }
                            }
                        }

                        class Auto
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

                                return other is Auto && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val AUTO = Auto(JsonField.of("auto"))

                                @JvmStatic fun of(value: String) = Auto(JsonField.of(value))
                            }

                            enum class Known {
                                AUTO,
                            }

                            enum class Value {
                                AUTO,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    AUTO -> Value.AUTO
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    AUTO -> Known.AUTO
                                    else ->
                                        throw BraintrustInvalidDataException("Unknown Auto: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        class None
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

                                return other is None && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val NONE = None(JsonField.of("none"))

                                @JvmStatic fun of(value: String) = None(JsonField.of(value))
                            }

                            enum class Known {
                                NONE,
                            }

                            enum class Value {
                                NONE,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NONE -> Value.NONE
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NONE -> Known.NONE
                                    else ->
                                        throw BraintrustInvalidDataException("Unknown None: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        @JsonDeserialize(builder = Function.Builder::class)
                        @NoAutoDetect
                        class Function
                        private constructor(
                            private val name: JsonField<String>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            fun name(): String = name.getRequired("name")

                            @JsonProperty("name") @ExcludeMissing fun _name() = name

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): Function = apply {
                                if (!validated) {
                                    name()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Function &&
                                    this.name == other.name &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode = Objects.hash(name, additionalProperties)
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "Function{name=$name, additionalProperties=$additionalProperties}"

                            companion object {

                                @JvmStatic fun builder() = Builder()
                            }

                            class Builder {

                                private var name: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(function: Function) = apply {
                                    this.name = function.name
                                    additionalProperties(function.additionalProperties)
                                }

                                fun name(name: String) = name(JsonField.of(name))

                                @JsonProperty("name")
                                @ExcludeMissing
                                fun name(name: JsonField<String>) = apply { this.name = name }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                                @JsonAnySetter
                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    this.additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun build(): Function =
                                    Function(name, additionalProperties.toUnmodifiable())
                            }
                        }
                    }

                    @JsonDeserialize(builder = ResponseFormat.Builder::class)
                    @NoAutoDetect
                    class ResponseFormat
                    private constructor(
                        private val type: JsonField<Type>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun type(): Type = type.getRequired("type")

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): ResponseFormat = apply {
                            if (!validated) {
                                type()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ResponseFormat &&
                                this.type == other.type &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = Objects.hash(type, additionalProperties)
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "ResponseFormat{type=$type, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var type: JsonField<Type> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(responseFormat: ResponseFormat) = apply {
                                this.type = responseFormat.type
                                additionalProperties(responseFormat.additionalProperties)
                            }

                            fun type(type: Type) = type(JsonField.of(type))

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): ResponseFormat =
                                ResponseFormat(type, additionalProperties.toUnmodifiable())
                        }

                        class Type
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

                                return other is Type && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val JSON_OBJECT = Type(JsonField.of("json_object"))

                                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                            }

                            enum class Known {
                                JSON_OBJECT,
                            }

                            enum class Value {
                                JSON_OBJECT,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    JSON_OBJECT -> Value.JSON_OBJECT
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    JSON_OBJECT -> Known.JSON_OBJECT
                                    else ->
                                        throw BraintrustInvalidDataException("Unknown Type: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }

                    @JsonDeserialize(using = ToolChoice.Deserializer::class)
                    @JsonSerialize(using = ToolChoice.Serializer::class)
                    class ToolChoice
                    private constructor(
                        private val auto: Auto? = null,
                        private val none: None? = null,
                        private val function: Function? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        private var validated: Boolean = false

                        fun auto(): Optional<Auto> = Optional.ofNullable(auto)

                        fun none(): Optional<None> = Optional.ofNullable(none)

                        fun function(): Optional<Function> = Optional.ofNullable(function)

                        fun isAuto(): Boolean = auto != null

                        fun isNone(): Boolean = none != null

                        fun isFunction(): Boolean = function != null

                        fun asAuto(): Auto = auto.getOrThrow("auto")

                        fun asNone(): None = none.getOrThrow("none")

                        fun asFunction(): Function = function.getOrThrow("function")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        fun <T> accept(visitor: Visitor<T>): T {
                            return when {
                                auto != null -> visitor.visitAuto(auto)
                                none != null -> visitor.visitNone(none)
                                function != null -> visitor.visitFunction(function)
                                else -> visitor.unknown(_json)
                            }
                        }

                        fun validate(): ToolChoice = apply {
                            if (!validated) {
                                if (auto == null && none == null && function == null) {
                                    throw BraintrustInvalidDataException(
                                        "Unknown ToolChoice: $_json"
                                    )
                                }
                                function?.validate()
                                validated = true
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ToolChoice &&
                                this.auto == other.auto &&
                                this.none == other.none &&
                                this.function == other.function
                        }

                        override fun hashCode(): Int {
                            return Objects.hash(
                                auto,
                                none,
                                function,
                            )
                        }

                        override fun toString(): String {
                            return when {
                                auto != null -> "ToolChoice{auto=$auto}"
                                none != null -> "ToolChoice{none=$none}"
                                function != null -> "ToolChoice{function=$function}"
                                _json != null -> "ToolChoice{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid ToolChoice")
                            }
                        }

                        companion object {

                            @JvmStatic fun ofAuto(auto: Auto) = ToolChoice(auto = auto)

                            @JvmStatic fun ofNone(none: None) = ToolChoice(none = none)

                            @JvmStatic
                            fun ofFunction(function: Function) = ToolChoice(function = function)
                        }

                        interface Visitor<out T> {

                            fun visitAuto(auto: Auto): T

                            fun visitNone(none: None): T

                            fun visitFunction(function: Function): T

                            fun unknown(json: JsonValue?): T {
                                throw BraintrustInvalidDataException("Unknown ToolChoice: $json")
                            }
                        }

                        class Deserializer : BaseDeserializer<ToolChoice>(ToolChoice::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): ToolChoice {
                                val json = JsonValue.fromJsonNode(node)
                                tryDeserialize(node, jacksonTypeRef<Auto>())?.let {
                                    return ToolChoice(auto = it, _json = json)
                                }
                                tryDeserialize(node, jacksonTypeRef<None>())?.let {
                                    return ToolChoice(none = it, _json = json)
                                }
                                tryDeserialize(node, jacksonTypeRef<Function>()) { it.validate() }
                                    ?.let {
                                        return ToolChoice(function = it, _json = json)
                                    }

                                return ToolChoice(_json = json)
                            }
                        }

                        class Serializer : BaseSerializer<ToolChoice>(ToolChoice::class) {

                            override fun serialize(
                                value: ToolChoice,
                                generator: JsonGenerator,
                                provider: SerializerProvider
                            ) {
                                when {
                                    value.auto != null -> generator.writeObject(value.auto)
                                    value.none != null -> generator.writeObject(value.none)
                                    value.function != null -> generator.writeObject(value.function)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid ToolChoice")
                                }
                            }
                        }

                        class Auto
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

                                return other is Auto && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val AUTO = Auto(JsonField.of("auto"))

                                @JvmStatic fun of(value: String) = Auto(JsonField.of(value))
                            }

                            enum class Known {
                                AUTO,
                            }

                            enum class Value {
                                AUTO,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    AUTO -> Value.AUTO
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    AUTO -> Known.AUTO
                                    else ->
                                        throw BraintrustInvalidDataException("Unknown Auto: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        class None
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

                                return other is None && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val NONE = None(JsonField.of("none"))

                                @JvmStatic fun of(value: String) = None(JsonField.of(value))
                            }

                            enum class Known {
                                NONE,
                            }

                            enum class Value {
                                NONE,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NONE -> Value.NONE
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NONE -> Known.NONE
                                    else ->
                                        throw BraintrustInvalidDataException("Unknown None: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        @JsonDeserialize(builder = Function.Builder::class)
                        @NoAutoDetect
                        class Function
                        private constructor(
                            private val type: JsonField<Type>,
                            private val function: JsonField<Function>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            fun type(): Type = type.getRequired("type")

                            fun function(): Function = function.getRequired("function")

                            @JsonProperty("type") @ExcludeMissing fun _type() = type

                            @JsonProperty("function") @ExcludeMissing fun _function() = function

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): Function = apply {
                                if (!validated) {
                                    type()
                                    function().validate()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Function &&
                                    this.type == other.type &&
                                    this.function == other.function &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode =
                                        Objects.hash(
                                            type,
                                            function,
                                            additionalProperties,
                                        )
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "Function{type=$type, function=$function, additionalProperties=$additionalProperties}"

                            companion object {

                                @JvmStatic fun builder() = Builder()
                            }

                            class Builder {

                                private var type: JsonField<Type> = JsonMissing.of()
                                private var function: JsonField<Function> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(function: Function) = apply {
                                    this.type = function.type
                                    this.function = function.function
                                    additionalProperties(function.additionalProperties)
                                }

                                fun type(type: Type) = type(JsonField.of(type))

                                @JsonProperty("type")
                                @ExcludeMissing
                                fun type(type: JsonField<Type>) = apply { this.type = type }

                                fun function(function: Function) = function(JsonField.of(function))

                                @JsonProperty("function")
                                @ExcludeMissing
                                fun function(function: JsonField<Function>) = apply {
                                    this.function = function
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                                @JsonAnySetter
                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    this.additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun build(): Function =
                                    Function(
                                        type,
                                        function,
                                        additionalProperties.toUnmodifiable(),
                                    )
                            }

                            @JsonDeserialize(builder = Function.Builder::class)
                            @NoAutoDetect
                            class Function
                            private constructor(
                                private val name: JsonField<String>,
                                private val additionalProperties: Map<String, JsonValue>,
                            ) {

                                private var validated: Boolean = false

                                private var hashCode: Int = 0

                                fun name(): String = name.getRequired("name")

                                @JsonProperty("name") @ExcludeMissing fun _name() = name

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> =
                                    additionalProperties

                                fun validate(): Function = apply {
                                    if (!validated) {
                                        name()
                                        validated = true
                                    }
                                }

                                fun toBuilder() = Builder().from(this)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Function &&
                                        this.name == other.name &&
                                        this.additionalProperties == other.additionalProperties
                                }

                                override fun hashCode(): Int {
                                    if (hashCode == 0) {
                                        hashCode = Objects.hash(name, additionalProperties)
                                    }
                                    return hashCode
                                }

                                override fun toString() =
                                    "Function{name=$name, additionalProperties=$additionalProperties}"

                                companion object {

                                    @JvmStatic fun builder() = Builder()
                                }

                                class Builder {

                                    private var name: JsonField<String> = JsonMissing.of()
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    @JvmSynthetic
                                    internal fun from(function: Function) = apply {
                                        this.name = function.name
                                        additionalProperties(function.additionalProperties)
                                    }

                                    fun name(name: String) = name(JsonField.of(name))

                                    @JsonProperty("name")
                                    @ExcludeMissing
                                    fun name(name: JsonField<String>) = apply { this.name = name }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    @JsonAnySetter
                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            this.additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun build(): Function =
                                        Function(name, additionalProperties.toUnmodifiable())
                                }
                            }

                            class Type
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

                                    return other is Type && this.value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()

                                companion object {

                                    @JvmField val FUNCTION = Type(JsonField.of("function"))

                                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                                }

                                enum class Known {
                                    FUNCTION,
                                }

                                enum class Value {
                                    FUNCTION,
                                    _UNKNOWN,
                                }

                                fun value(): Value =
                                    when (this) {
                                        FUNCTION -> Value.FUNCTION
                                        else -> Value._UNKNOWN
                                    }

                                fun known(): Known =
                                    when (this) {
                                        FUNCTION -> Known.FUNCTION
                                        else ->
                                            throw BraintrustInvalidDataException(
                                                "Unknown Type: $value"
                                            )
                                    }

                                fun asString(): String = _value().asStringOrThrow()
                            }
                        }
                    }
                }

                @JsonDeserialize(builder = AnthropicModelParams.Builder::class)
                @NoAutoDetect
                class AnthropicModelParams
                private constructor(
                    private val useCache: JsonField<Boolean>,
                    private val maxTokens: JsonField<Double>,
                    private val temperature: JsonField<Double>,
                    private val topP: JsonField<Double>,
                    private val topK: JsonField<Double>,
                    private val stopSequences: JsonField<List<String>>,
                    private val maxTokensToSample: JsonField<Double>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun useCache(): Optional<Boolean> =
                        Optional.ofNullable(useCache.getNullable("use_cache"))

                    fun maxTokens(): Double = maxTokens.getRequired("max_tokens")

                    fun temperature(): Double = temperature.getRequired("temperature")

                    fun topP(): Optional<Double> = Optional.ofNullable(topP.getNullable("top_p"))

                    fun topK(): Optional<Double> = Optional.ofNullable(topK.getNullable("top_k"))

                    fun stopSequences(): Optional<List<String>> =
                        Optional.ofNullable(stopSequences.getNullable("stop_sequences"))

                    /** This is a legacy parameter that should not be used. */
                    fun maxTokensToSample(): Optional<Double> =
                        Optional.ofNullable(maxTokensToSample.getNullable("max_tokens_to_sample"))

                    @JsonProperty("use_cache") @ExcludeMissing fun _useCache() = useCache

                    @JsonProperty("max_tokens") @ExcludeMissing fun _maxTokens() = maxTokens

                    @JsonProperty("temperature") @ExcludeMissing fun _temperature() = temperature

                    @JsonProperty("top_p") @ExcludeMissing fun _topP() = topP

                    @JsonProperty("top_k") @ExcludeMissing fun _topK() = topK

                    @JsonProperty("stop_sequences")
                    @ExcludeMissing
                    fun _stopSequences() = stopSequences

                    /** This is a legacy parameter that should not be used. */
                    @JsonProperty("max_tokens_to_sample")
                    @ExcludeMissing
                    fun _maxTokensToSample() = maxTokensToSample

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): AnthropicModelParams = apply {
                        if (!validated) {
                            useCache()
                            maxTokens()
                            temperature()
                            topP()
                            topK()
                            stopSequences()
                            maxTokensToSample()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AnthropicModelParams &&
                            this.useCache == other.useCache &&
                            this.maxTokens == other.maxTokens &&
                            this.temperature == other.temperature &&
                            this.topP == other.topP &&
                            this.topK == other.topK &&
                            this.stopSequences == other.stopSequences &&
                            this.maxTokensToSample == other.maxTokensToSample &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    useCache,
                                    maxTokens,
                                    temperature,
                                    topP,
                                    topK,
                                    stopSequences,
                                    maxTokensToSample,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "AnthropicModelParams{useCache=$useCache, maxTokens=$maxTokens, temperature=$temperature, topP=$topP, topK=$topK, stopSequences=$stopSequences, maxTokensToSample=$maxTokensToSample, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var useCache: JsonField<Boolean> = JsonMissing.of()
                        private var maxTokens: JsonField<Double> = JsonMissing.of()
                        private var temperature: JsonField<Double> = JsonMissing.of()
                        private var topP: JsonField<Double> = JsonMissing.of()
                        private var topK: JsonField<Double> = JsonMissing.of()
                        private var stopSequences: JsonField<List<String>> = JsonMissing.of()
                        private var maxTokensToSample: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(anthropicModelParams: AnthropicModelParams) = apply {
                            this.useCache = anthropicModelParams.useCache
                            this.maxTokens = anthropicModelParams.maxTokens
                            this.temperature = anthropicModelParams.temperature
                            this.topP = anthropicModelParams.topP
                            this.topK = anthropicModelParams.topK
                            this.stopSequences = anthropicModelParams.stopSequences
                            this.maxTokensToSample = anthropicModelParams.maxTokensToSample
                            additionalProperties(anthropicModelParams.additionalProperties)
                        }

                        fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                        @JsonProperty("use_cache")
                        @ExcludeMissing
                        fun useCache(useCache: JsonField<Boolean>) = apply {
                            this.useCache = useCache
                        }

                        fun maxTokens(maxTokens: Double) = maxTokens(JsonField.of(maxTokens))

                        @JsonProperty("max_tokens")
                        @ExcludeMissing
                        fun maxTokens(maxTokens: JsonField<Double>) = apply {
                            this.maxTokens = maxTokens
                        }

                        fun temperature(temperature: Double) =
                            temperature(JsonField.of(temperature))

                        @JsonProperty("temperature")
                        @ExcludeMissing
                        fun temperature(temperature: JsonField<Double>) = apply {
                            this.temperature = temperature
                        }

                        fun topP(topP: Double) = topP(JsonField.of(topP))

                        @JsonProperty("top_p")
                        @ExcludeMissing
                        fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

                        fun topK(topK: Double) = topK(JsonField.of(topK))

                        @JsonProperty("top_k")
                        @ExcludeMissing
                        fun topK(topK: JsonField<Double>) = apply { this.topK = topK }

                        fun stopSequences(stopSequences: List<String>) =
                            stopSequences(JsonField.of(stopSequences))

                        @JsonProperty("stop_sequences")
                        @ExcludeMissing
                        fun stopSequences(stopSequences: JsonField<List<String>>) = apply {
                            this.stopSequences = stopSequences
                        }

                        /** This is a legacy parameter that should not be used. */
                        fun maxTokensToSample(maxTokensToSample: Double) =
                            maxTokensToSample(JsonField.of(maxTokensToSample))

                        /** This is a legacy parameter that should not be used. */
                        @JsonProperty("max_tokens_to_sample")
                        @ExcludeMissing
                        fun maxTokensToSample(maxTokensToSample: JsonField<Double>) = apply {
                            this.maxTokensToSample = maxTokensToSample
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): AnthropicModelParams =
                            AnthropicModelParams(
                                useCache,
                                maxTokens,
                                temperature,
                                topP,
                                topK,
                                stopSequences.map { it.toUnmodifiable() },
                                maxTokensToSample,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                @JsonDeserialize(builder = GoogleModelParams.Builder::class)
                @NoAutoDetect
                class GoogleModelParams
                private constructor(
                    private val useCache: JsonField<Boolean>,
                    private val temperature: JsonField<Double>,
                    private val maxOutputTokens: JsonField<Double>,
                    private val topP: JsonField<Double>,
                    private val topK: JsonField<Double>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun useCache(): Optional<Boolean> =
                        Optional.ofNullable(useCache.getNullable("use_cache"))

                    fun temperature(): Optional<Double> =
                        Optional.ofNullable(temperature.getNullable("temperature"))

                    fun maxOutputTokens(): Optional<Double> =
                        Optional.ofNullable(maxOutputTokens.getNullable("maxOutputTokens"))

                    fun topP(): Optional<Double> = Optional.ofNullable(topP.getNullable("topP"))

                    fun topK(): Optional<Double> = Optional.ofNullable(topK.getNullable("topK"))

                    @JsonProperty("use_cache") @ExcludeMissing fun _useCache() = useCache

                    @JsonProperty("temperature") @ExcludeMissing fun _temperature() = temperature

                    @JsonProperty("maxOutputTokens")
                    @ExcludeMissing
                    fun _maxOutputTokens() = maxOutputTokens

                    @JsonProperty("topP") @ExcludeMissing fun _topP() = topP

                    @JsonProperty("topK") @ExcludeMissing fun _topK() = topK

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): GoogleModelParams = apply {
                        if (!validated) {
                            useCache()
                            temperature()
                            maxOutputTokens()
                            topP()
                            topK()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is GoogleModelParams &&
                            this.useCache == other.useCache &&
                            this.temperature == other.temperature &&
                            this.maxOutputTokens == other.maxOutputTokens &&
                            this.topP == other.topP &&
                            this.topK == other.topK &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    useCache,
                                    temperature,
                                    maxOutputTokens,
                                    topP,
                                    topK,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "GoogleModelParams{useCache=$useCache, temperature=$temperature, maxOutputTokens=$maxOutputTokens, topP=$topP, topK=$topK, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var useCache: JsonField<Boolean> = JsonMissing.of()
                        private var temperature: JsonField<Double> = JsonMissing.of()
                        private var maxOutputTokens: JsonField<Double> = JsonMissing.of()
                        private var topP: JsonField<Double> = JsonMissing.of()
                        private var topK: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(googleModelParams: GoogleModelParams) = apply {
                            this.useCache = googleModelParams.useCache
                            this.temperature = googleModelParams.temperature
                            this.maxOutputTokens = googleModelParams.maxOutputTokens
                            this.topP = googleModelParams.topP
                            this.topK = googleModelParams.topK
                            additionalProperties(googleModelParams.additionalProperties)
                        }

                        fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                        @JsonProperty("use_cache")
                        @ExcludeMissing
                        fun useCache(useCache: JsonField<Boolean>) = apply {
                            this.useCache = useCache
                        }

                        fun temperature(temperature: Double) =
                            temperature(JsonField.of(temperature))

                        @JsonProperty("temperature")
                        @ExcludeMissing
                        fun temperature(temperature: JsonField<Double>) = apply {
                            this.temperature = temperature
                        }

                        fun maxOutputTokens(maxOutputTokens: Double) =
                            maxOutputTokens(JsonField.of(maxOutputTokens))

                        @JsonProperty("maxOutputTokens")
                        @ExcludeMissing
                        fun maxOutputTokens(maxOutputTokens: JsonField<Double>) = apply {
                            this.maxOutputTokens = maxOutputTokens
                        }

                        fun topP(topP: Double) = topP(JsonField.of(topP))

                        @JsonProperty("topP")
                        @ExcludeMissing
                        fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

                        fun topK(topK: Double) = topK(JsonField.of(topK))

                        @JsonProperty("topK")
                        @ExcludeMissing
                        fun topK(topK: JsonField<Double>) = apply { this.topK = topK }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): GoogleModelParams =
                            GoogleModelParams(
                                useCache,
                                temperature,
                                maxOutputTokens,
                                topP,
                                topK,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                @JsonDeserialize(builder = WindowAiModelParams.Builder::class)
                @NoAutoDetect
                class WindowAiModelParams
                private constructor(
                    private val useCache: JsonField<Boolean>,
                    private val temperature: JsonField<Double>,
                    private val topK: JsonField<Double>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun useCache(): Optional<Boolean> =
                        Optional.ofNullable(useCache.getNullable("use_cache"))

                    fun temperature(): Optional<Double> =
                        Optional.ofNullable(temperature.getNullable("temperature"))

                    fun topK(): Optional<Double> = Optional.ofNullable(topK.getNullable("topK"))

                    @JsonProperty("use_cache") @ExcludeMissing fun _useCache() = useCache

                    @JsonProperty("temperature") @ExcludeMissing fun _temperature() = temperature

                    @JsonProperty("topK") @ExcludeMissing fun _topK() = topK

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): WindowAiModelParams = apply {
                        if (!validated) {
                            useCache()
                            temperature()
                            topK()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is WindowAiModelParams &&
                            this.useCache == other.useCache &&
                            this.temperature == other.temperature &&
                            this.topK == other.topK &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    useCache,
                                    temperature,
                                    topK,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "WindowAiModelParams{useCache=$useCache, temperature=$temperature, topK=$topK, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var useCache: JsonField<Boolean> = JsonMissing.of()
                        private var temperature: JsonField<Double> = JsonMissing.of()
                        private var topK: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(windowAiModelParams: WindowAiModelParams) = apply {
                            this.useCache = windowAiModelParams.useCache
                            this.temperature = windowAiModelParams.temperature
                            this.topK = windowAiModelParams.topK
                            additionalProperties(windowAiModelParams.additionalProperties)
                        }

                        fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                        @JsonProperty("use_cache")
                        @ExcludeMissing
                        fun useCache(useCache: JsonField<Boolean>) = apply {
                            this.useCache = useCache
                        }

                        fun temperature(temperature: Double) =
                            temperature(JsonField.of(temperature))

                        @JsonProperty("temperature")
                        @ExcludeMissing
                        fun temperature(temperature: JsonField<Double>) = apply {
                            this.temperature = temperature
                        }

                        fun topK(topK: Double) = topK(JsonField.of(topK))

                        @JsonProperty("topK")
                        @ExcludeMissing
                        fun topK(topK: JsonField<Double>) = apply { this.topK = topK }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): WindowAiModelParams =
                            WindowAiModelParams(
                                useCache,
                                temperature,
                                topK,
                                additionalProperties.toUnmodifiable(),
                            )
                    }
                }

                @JsonDeserialize(builder = JsCompletionParams.Builder::class)
                @NoAutoDetect
                class JsCompletionParams
                private constructor(
                    private val useCache: JsonField<Boolean>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    fun useCache(): Optional<Boolean> =
                        Optional.ofNullable(useCache.getNullable("use_cache"))

                    @JsonProperty("use_cache") @ExcludeMissing fun _useCache() = useCache

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): JsCompletionParams = apply {
                        if (!validated) {
                            useCache()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is JsCompletionParams &&
                            this.useCache == other.useCache &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(useCache, additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "JsCompletionParams{useCache=$useCache, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var useCache: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(jsCompletionParams: JsCompletionParams) = apply {
                            this.useCache = jsCompletionParams.useCache
                            additionalProperties(jsCompletionParams.additionalProperties)
                        }

                        fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                        @JsonProperty("use_cache")
                        @ExcludeMissing
                        fun useCache(useCache: JsonField<Boolean>) = apply {
                            this.useCache = useCache
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): JsCompletionParams =
                            JsCompletionParams(useCache, additionalProperties.toUnmodifiable())
                    }
                }
            }
        }

        @JsonDeserialize(builder = Origin.Builder::class)
        @NoAutoDetect
        class Origin
        private constructor(
            private val promptId: String?,
            private val projectId: String?,
            private val promptVersion: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonProperty("prompt_id") fun promptId(): String? = promptId

            @JsonProperty("project_id") fun projectId(): String? = projectId

            @JsonProperty("prompt_version") fun promptVersion(): String? = promptVersion

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Origin &&
                    this.promptId == other.promptId &&
                    this.projectId == other.projectId &&
                    this.promptVersion == other.promptVersion &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            promptId,
                            projectId,
                            promptVersion,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Origin{promptId=$promptId, projectId=$projectId, promptVersion=$promptVersion, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var promptId: String? = null
                private var projectId: String? = null
                private var promptVersion: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(origin: Origin) = apply {
                    this.promptId = origin.promptId
                    this.projectId = origin.projectId
                    this.promptVersion = origin.promptVersion
                    additionalProperties(origin.additionalProperties)
                }

                @JsonProperty("prompt_id")
                fun promptId(promptId: String) = apply { this.promptId = promptId }

                @JsonProperty("project_id")
                fun projectId(projectId: String) = apply { this.projectId = projectId }

                @JsonProperty("prompt_version")
                fun promptVersion(promptVersion: String) = apply {
                    this.promptVersion = promptVersion
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

                fun build(): Origin =
                    Origin(
                        promptId,
                        projectId,
                        promptVersion,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(using = Prompt.Deserializer::class)
        @JsonSerialize(using = Prompt.Serializer::class)
        class Prompt
        private constructor(
            private val completion: Completion? = null,
            private val chat: Chat? = null,
            private val nullableVariant: NullableVariant? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun completion(): Optional<Completion> = Optional.ofNullable(completion)

            fun chat(): Optional<Chat> = Optional.ofNullable(chat)

            fun nullableVariant(): Optional<NullableVariant> = Optional.ofNullable(nullableVariant)

            fun isCompletion(): Boolean = completion != null

            fun isChat(): Boolean = chat != null

            fun isNullableVariant(): Boolean = nullableVariant != null

            fun asCompletion(): Completion = completion.getOrThrow("completion")

            fun asChat(): Chat = chat.getOrThrow("chat")

            fun asNullableVariant(): NullableVariant = nullableVariant.getOrThrow("nullableVariant")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    completion != null -> visitor.visitCompletion(completion)
                    chat != null -> visitor.visitChat(chat)
                    nullableVariant != null -> visitor.visitNullableVariant(nullableVariant)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): Prompt = apply {
                if (!validated) {
                    if (completion == null && chat == null && nullableVariant == null) {
                        throw BraintrustInvalidDataException("Unknown Prompt: $_json")
                    }
                    completion?.validate()
                    chat?.validate()
                    nullableVariant?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Prompt &&
                    this.completion == other.completion &&
                    this.chat == other.chat &&
                    this.nullableVariant == other.nullableVariant
            }

            override fun hashCode(): Int {
                return Objects.hash(
                    completion,
                    chat,
                    nullableVariant,
                )
            }

            override fun toString(): String {
                return when {
                    completion != null -> "Prompt{completion=$completion}"
                    chat != null -> "Prompt{chat=$chat}"
                    nullableVariant != null -> "Prompt{nullableVariant=$nullableVariant}"
                    _json != null -> "Prompt{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Prompt")
                }
            }

            companion object {

                @JvmStatic
                fun ofCompletion(completion: Completion) = Prompt(completion = completion)

                @JvmStatic fun ofChat(chat: Chat) = Prompt(chat = chat)

                @JvmStatic
                fun ofNullableVariant(nullableVariant: NullableVariant) =
                    Prompt(nullableVariant = nullableVariant)
            }

            interface Visitor<out T> {

                fun visitCompletion(completion: Completion): T

                fun visitChat(chat: Chat): T

                fun visitNullableVariant(nullableVariant: NullableVariant): T

                fun unknown(json: JsonValue?): T {
                    throw BraintrustInvalidDataException("Unknown Prompt: $json")
                }
            }

            class Deserializer : BaseDeserializer<Prompt>(Prompt::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Prompt {
                    val json = JsonValue.fromJsonNode(node)
                    tryDeserialize(node, jacksonTypeRef<Completion>()) { it.validate() }
                        ?.let {
                            return Prompt(completion = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<Chat>()) { it.validate() }
                        ?.let {
                            return Prompt(chat = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<NullableVariant>()) { it.validate() }
                        ?.let {
                            return Prompt(nullableVariant = it, _json = json)
                        }

                    return Prompt(_json = json)
                }
            }

            class Serializer : BaseSerializer<Prompt>(Prompt::class) {

                override fun serialize(
                    value: Prompt,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.completion != null -> generator.writeObject(value.completion)
                        value.chat != null -> generator.writeObject(value.chat)
                        value.nullableVariant != null ->
                            generator.writeObject(value.nullableVariant)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Prompt")
                    }
                }
            }

            @JsonDeserialize(builder = Completion.Builder::class)
            @NoAutoDetect
            class Completion
            private constructor(
                private val type: JsonField<Type>,
                private val content: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun type(): Type = type.getRequired("type")

                fun content(): String = content.getRequired("content")

                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonProperty("content") @ExcludeMissing fun _content() = content

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Completion = apply {
                    if (!validated) {
                        type()
                        content()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Completion &&
                        this.type == other.type &&
                        this.content == other.content &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                type,
                                content,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Completion{type=$type, content=$content, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var type: JsonField<Type> = JsonMissing.of()
                    private var content: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(completion: Completion) = apply {
                        this.type = completion.type
                        this.content = completion.content
                        additionalProperties(completion.additionalProperties)
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun content(content: String) = content(JsonField.of(content))

                    @JsonProperty("content")
                    @ExcludeMissing
                    fun content(content: JsonField<String>) = apply { this.content = content }

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

                    fun build(): Completion =
                        Completion(
                            type,
                            content,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Type
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

                        return other is Type && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val COMPLETION = Type(JsonField.of("completion"))

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        COMPLETION,
                    }

                    enum class Value {
                        COMPLETION,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            COMPLETION -> Value.COMPLETION
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            COMPLETION -> Known.COMPLETION
                            else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = Chat.Builder::class)
            @NoAutoDetect
            class Chat
            private constructor(
                private val type: JsonField<Type>,
                private val messages: JsonField<List<Message>>,
                private val tools: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun type(): Type = type.getRequired("type")

                fun messages(): List<Message> = messages.getRequired("messages")

                fun tools(): Optional<String> = Optional.ofNullable(tools.getNullable("tools"))

                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonProperty("messages") @ExcludeMissing fun _messages() = messages

                @JsonProperty("tools") @ExcludeMissing fun _tools() = tools

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Chat = apply {
                    if (!validated) {
                        type()
                        messages()
                        tools()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Chat &&
                        this.type == other.type &&
                        this.messages == other.messages &&
                        this.tools == other.tools &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                type,
                                messages,
                                tools,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Chat{type=$type, messages=$messages, tools=$tools, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var type: JsonField<Type> = JsonMissing.of()
                    private var messages: JsonField<List<Message>> = JsonMissing.of()
                    private var tools: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(chat: Chat) = apply {
                        this.type = chat.type
                        this.messages = chat.messages
                        this.tools = chat.tools
                        additionalProperties(chat.additionalProperties)
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun messages(messages: List<Message>) = messages(JsonField.of(messages))

                    @JsonProperty("messages")
                    @ExcludeMissing
                    fun messages(messages: JsonField<List<Message>>) = apply {
                        this.messages = messages
                    }

                    fun tools(tools: String) = tools(JsonField.of(tools))

                    @JsonProperty("tools")
                    @ExcludeMissing
                    fun tools(tools: JsonField<String>) = apply { this.tools = tools }

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

                    fun build(): Chat =
                        Chat(
                            type,
                            messages.map { it.toUnmodifiable() },
                            tools,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(using = Message.Deserializer::class)
                @JsonSerialize(using = Message.Serializer::class)
                class Message
                private constructor(
                    private val system: System? = null,
                    private val user: User? = null,
                    private val assistant: Assistant? = null,
                    private val tool: Tool? = null,
                    private val function: Function? = null,
                    private val fallback: Fallback? = null,
                    private val _json: JsonValue? = null,
                ) {

                    private var validated: Boolean = false

                    fun system(): Optional<System> = Optional.ofNullable(system)

                    fun user(): Optional<User> = Optional.ofNullable(user)

                    fun assistant(): Optional<Assistant> = Optional.ofNullable(assistant)

                    fun tool(): Optional<Tool> = Optional.ofNullable(tool)

                    fun function(): Optional<Function> = Optional.ofNullable(function)

                    fun fallback(): Optional<Fallback> = Optional.ofNullable(fallback)

                    fun isSystem(): Boolean = system != null

                    fun isUser(): Boolean = user != null

                    fun isAssistant(): Boolean = assistant != null

                    fun isTool(): Boolean = tool != null

                    fun isFunction(): Boolean = function != null

                    fun isFallback(): Boolean = fallback != null

                    fun asSystem(): System = system.getOrThrow("system")

                    fun asUser(): User = user.getOrThrow("user")

                    fun asAssistant(): Assistant = assistant.getOrThrow("assistant")

                    fun asTool(): Tool = tool.getOrThrow("tool")

                    fun asFunction(): Function = function.getOrThrow("function")

                    fun asFallback(): Fallback = fallback.getOrThrow("fallback")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T {
                        return when {
                            system != null -> visitor.visitSystem(system)
                            user != null -> visitor.visitUser(user)
                            assistant != null -> visitor.visitAssistant(assistant)
                            tool != null -> visitor.visitTool(tool)
                            function != null -> visitor.visitFunction(function)
                            fallback != null -> visitor.visitFallback(fallback)
                            else -> visitor.unknown(_json)
                        }
                    }

                    fun validate(): Message = apply {
                        if (!validated) {
                            if (
                                system == null &&
                                    user == null &&
                                    assistant == null &&
                                    tool == null &&
                                    function == null &&
                                    fallback == null
                            ) {
                                throw BraintrustInvalidDataException("Unknown Message: $_json")
                            }
                            system?.validate()
                            user?.validate()
                            assistant?.validate()
                            tool?.validate()
                            function?.validate()
                            fallback?.validate()
                            validated = true
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Message &&
                            this.system == other.system &&
                            this.user == other.user &&
                            this.assistant == other.assistant &&
                            this.tool == other.tool &&
                            this.function == other.function &&
                            this.fallback == other.fallback
                    }

                    override fun hashCode(): Int {
                        return Objects.hash(
                            system,
                            user,
                            assistant,
                            tool,
                            function,
                            fallback,
                        )
                    }

                    override fun toString(): String {
                        return when {
                            system != null -> "Message{system=$system}"
                            user != null -> "Message{user=$user}"
                            assistant != null -> "Message{assistant=$assistant}"
                            tool != null -> "Message{tool=$tool}"
                            function != null -> "Message{function=$function}"
                            fallback != null -> "Message{fallback=$fallback}"
                            _json != null -> "Message{_unknown=$_json}"
                            else -> throw IllegalStateException("Invalid Message")
                        }
                    }

                    companion object {

                        @JvmStatic fun ofSystem(system: System) = Message(system = system)

                        @JvmStatic fun ofUser(user: User) = Message(user = user)

                        @JvmStatic
                        fun ofAssistant(assistant: Assistant) = Message(assistant = assistant)

                        @JvmStatic fun ofTool(tool: Tool) = Message(tool = tool)

                        @JvmStatic fun ofFunction(function: Function) = Message(function = function)

                        @JvmStatic fun ofFallback(fallback: Fallback) = Message(fallback = fallback)
                    }

                    interface Visitor<out T> {

                        fun visitSystem(system: System): T

                        fun visitUser(user: User): T

                        fun visitAssistant(assistant: Assistant): T

                        fun visitTool(tool: Tool): T

                        fun visitFunction(function: Function): T

                        fun visitFallback(fallback: Fallback): T

                        fun unknown(json: JsonValue?): T {
                            throw BraintrustInvalidDataException("Unknown Message: $json")
                        }
                    }

                    class Deserializer : BaseDeserializer<Message>(Message::class) {

                        override fun ObjectCodec.deserialize(node: JsonNode): Message {
                            val json = JsonValue.fromJsonNode(node)
                            tryDeserialize(node, jacksonTypeRef<System>()) { it.validate() }
                                ?.let {
                                    return Message(system = it, _json = json)
                                }
                            tryDeserialize(node, jacksonTypeRef<User>()) { it.validate() }
                                ?.let {
                                    return Message(user = it, _json = json)
                                }
                            tryDeserialize(node, jacksonTypeRef<Assistant>()) { it.validate() }
                                ?.let {
                                    return Message(assistant = it, _json = json)
                                }
                            tryDeserialize(node, jacksonTypeRef<Tool>()) { it.validate() }
                                ?.let {
                                    return Message(tool = it, _json = json)
                                }
                            tryDeserialize(node, jacksonTypeRef<Function>()) { it.validate() }
                                ?.let {
                                    return Message(function = it, _json = json)
                                }
                            tryDeserialize(node, jacksonTypeRef<Fallback>()) { it.validate() }
                                ?.let {
                                    return Message(fallback = it, _json = json)
                                }

                            return Message(_json = json)
                        }
                    }

                    class Serializer : BaseSerializer<Message>(Message::class) {

                        override fun serialize(
                            value: Message,
                            generator: JsonGenerator,
                            provider: SerializerProvider
                        ) {
                            when {
                                value.system != null -> generator.writeObject(value.system)
                                value.user != null -> generator.writeObject(value.user)
                                value.assistant != null -> generator.writeObject(value.assistant)
                                value.tool != null -> generator.writeObject(value.tool)
                                value.function != null -> generator.writeObject(value.function)
                                value.fallback != null -> generator.writeObject(value.fallback)
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid Message")
                            }
                        }
                    }

                    @JsonDeserialize(builder = System.Builder::class)
                    @NoAutoDetect
                    class System
                    private constructor(
                        private val content: JsonField<String>,
                        private val role: JsonField<Role>,
                        private val name: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun content(): Optional<String> =
                            Optional.ofNullable(content.getNullable("content"))

                        fun role(): Role = role.getRequired("role")

                        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                        @JsonProperty("content") @ExcludeMissing fun _content() = content

                        @JsonProperty("role") @ExcludeMissing fun _role() = role

                        @JsonProperty("name") @ExcludeMissing fun _name() = name

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): System = apply {
                            if (!validated) {
                                content()
                                role()
                                name()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is System &&
                                this.content == other.content &&
                                this.role == other.role &&
                                this.name == other.name &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        content,
                                        role,
                                        name,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "System{content=$content, role=$role, name=$name, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var content: JsonField<String> = JsonMissing.of()
                            private var role: JsonField<Role> = JsonMissing.of()
                            private var name: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(system: System) = apply {
                                this.content = system.content
                                this.role = system.role
                                this.name = system.name
                                additionalProperties(system.additionalProperties)
                            }

                            fun content(content: String) = content(JsonField.of(content))

                            @JsonProperty("content")
                            @ExcludeMissing
                            fun content(content: JsonField<String>) = apply {
                                this.content = content
                            }

                            fun role(role: Role) = role(JsonField.of(role))

                            @JsonProperty("role")
                            @ExcludeMissing
                            fun role(role: JsonField<Role>) = apply { this.role = role }

                            fun name(name: String) = name(JsonField.of(name))

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun name(name: JsonField<String>) = apply { this.name = name }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): System =
                                System(
                                    content,
                                    role,
                                    name,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class Role
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

                                return other is Role && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val SYSTEM = Role(JsonField.of("system"))

                                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                            }

                            enum class Known {
                                SYSTEM,
                            }

                            enum class Value {
                                SYSTEM,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    SYSTEM -> Value.SYSTEM
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    SYSTEM -> Known.SYSTEM
                                    else ->
                                        throw BraintrustInvalidDataException("Unknown Role: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }

                    @JsonDeserialize(builder = User.Builder::class)
                    @NoAutoDetect
                    class User
                    private constructor(
                        private val content: JsonField<Content>,
                        private val role: JsonField<Role>,
                        private val name: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun content(): Optional<Content> =
                            Optional.ofNullable(content.getNullable("content"))

                        fun role(): Role = role.getRequired("role")

                        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                        @JsonProperty("content") @ExcludeMissing fun _content() = content

                        @JsonProperty("role") @ExcludeMissing fun _role() = role

                        @JsonProperty("name") @ExcludeMissing fun _name() = name

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): User = apply {
                            if (!validated) {
                                content()
                                role()
                                name()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is User &&
                                this.content == other.content &&
                                this.role == other.role &&
                                this.name == other.name &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        content,
                                        role,
                                        name,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "User{content=$content, role=$role, name=$name, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var content: JsonField<Content> = JsonMissing.of()
                            private var role: JsonField<Role> = JsonMissing.of()
                            private var name: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(user: User) = apply {
                                this.content = user.content
                                this.role = user.role
                                this.name = user.name
                                additionalProperties(user.additionalProperties)
                            }

                            fun content(content: Content) = content(JsonField.of(content))

                            @JsonProperty("content")
                            @ExcludeMissing
                            fun content(content: JsonField<Content>) = apply {
                                this.content = content
                            }

                            fun role(role: Role) = role(JsonField.of(role))

                            @JsonProperty("role")
                            @ExcludeMissing
                            fun role(role: JsonField<Role>) = apply { this.role = role }

                            fun name(name: String) = name(JsonField.of(name))

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun name(name: JsonField<String>) = apply { this.name = name }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): User =
                                User(
                                    content,
                                    role,
                                    name,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class Role
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

                                return other is Role && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val USER = Role(JsonField.of("user"))

                                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                            }

                            enum class Known {
                                USER,
                            }

                            enum class Value {
                                USER,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    USER -> Value.USER
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    USER -> Known.USER
                                    else ->
                                        throw BraintrustInvalidDataException("Unknown Role: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        @JsonDeserialize(using = Content.Deserializer::class)
                        @JsonSerialize(using = Content.Serializer::class)
                        class Content
                        private constructor(
                            private val string: String? = null,
                            private val unnamedSchemaWithArrayParent2s:
                                List<UnnamedSchemaWithArrayParent2>? =
                                null,
                            private val _json: JsonValue? = null,
                        ) {

                            private var validated: Boolean = false

                            fun string(): Optional<String> = Optional.ofNullable(string)

                            fun unnamedSchemaWithArrayParent2s():
                                Optional<List<UnnamedSchemaWithArrayParent2>> =
                                Optional.ofNullable(unnamedSchemaWithArrayParent2s)

                            fun isString(): Boolean = string != null

                            fun isUnnamedSchemaWithArrayParent2s(): Boolean =
                                unnamedSchemaWithArrayParent2s != null

                            fun asString(): String = string.getOrThrow("string")

                            fun asUnnamedSchemaWithArrayParent2s():
                                List<UnnamedSchemaWithArrayParent2> =
                                unnamedSchemaWithArrayParent2s.getOrThrow(
                                    "unnamedSchemaWithArrayParent2s"
                                )

                            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                            fun <T> accept(visitor: Visitor<T>): T {
                                return when {
                                    string != null -> visitor.visitString(string)
                                    unnamedSchemaWithArrayParent2s != null ->
                                        visitor.visitUnnamedSchemaWithArrayParent2s(
                                            unnamedSchemaWithArrayParent2s
                                        )
                                    else -> visitor.unknown(_json)
                                }
                            }

                            fun validate(): Content = apply {
                                if (!validated) {
                                    if (string == null && unnamedSchemaWithArrayParent2s == null) {
                                        throw BraintrustInvalidDataException(
                                            "Unknown Content: $_json"
                                        )
                                    }
                                    validated = true
                                }
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Content &&
                                    this.string == other.string &&
                                    this.unnamedSchemaWithArrayParent2s ==
                                        other.unnamedSchemaWithArrayParent2s
                            }

                            override fun hashCode(): Int {
                                return Objects.hash(string, unnamedSchemaWithArrayParent2s)
                            }

                            override fun toString(): String {
                                return when {
                                    string != null -> "Content{string=$string}"
                                    unnamedSchemaWithArrayParent2s != null ->
                                        "Content{unnamedSchemaWithArrayParent2s=$unnamedSchemaWithArrayParent2s}"
                                    _json != null -> "Content{_unknown=$_json}"
                                    else -> throw IllegalStateException("Invalid Content")
                                }
                            }

                            companion object {

                                @JvmStatic fun ofString(string: String) = Content(string = string)

                                @JvmStatic
                                fun ofUnnamedSchemaWithArrayParent2s(
                                    unnamedSchemaWithArrayParent2s:
                                        List<UnnamedSchemaWithArrayParent2>
                                ) =
                                    Content(
                                        unnamedSchemaWithArrayParent2s =
                                            unnamedSchemaWithArrayParent2s
                                    )
                            }

                            interface Visitor<out T> {

                                fun visitString(string: String): T

                                fun visitUnnamedSchemaWithArrayParent2s(
                                    unnamedSchemaWithArrayParent2s:
                                        List<UnnamedSchemaWithArrayParent2>
                                ): T

                                fun unknown(json: JsonValue?): T {
                                    throw BraintrustInvalidDataException("Unknown Content: $json")
                                }
                            }

                            class Deserializer : BaseDeserializer<Content>(Content::class) {

                                override fun ObjectCodec.deserialize(node: JsonNode): Content {
                                    val json = JsonValue.fromJsonNode(node)
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        return Content(string = it, _json = json)
                                    }
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<List<UnnamedSchemaWithArrayParent2>>()
                                        )
                                        ?.let {
                                            return Content(
                                                unnamedSchemaWithArrayParent2s = it,
                                                _json = json
                                            )
                                        }

                                    return Content(_json = json)
                                }
                            }

                            class Serializer : BaseSerializer<Content>(Content::class) {

                                override fun serialize(
                                    value: Content,
                                    generator: JsonGenerator,
                                    provider: SerializerProvider
                                ) {
                                    when {
                                        value.string != null -> generator.writeObject(value.string)
                                        value.unnamedSchemaWithArrayParent2s != null ->
                                            generator.writeObject(
                                                value.unnamedSchemaWithArrayParent2s
                                            )
                                        value._json != null -> generator.writeObject(value._json)
                                        else -> throw IllegalStateException("Invalid Content")
                                    }
                                }
                            }

                            @JsonDeserialize(
                                using = UnnamedSchemaWithArrayParent2.Deserializer::class
                            )
                            @JsonSerialize(using = UnnamedSchemaWithArrayParent2.Serializer::class)
                            class UnnamedSchemaWithArrayParent2
                            private constructor(
                                private val text: Text? = null,
                                private val imageUrl: ImageUrl? = null,
                                private val _json: JsonValue? = null,
                            ) {

                                private var validated: Boolean = false

                                fun text(): Optional<Text> = Optional.ofNullable(text)

                                fun imageUrl(): Optional<ImageUrl> = Optional.ofNullable(imageUrl)

                                fun isText(): Boolean = text != null

                                fun isImageUrl(): Boolean = imageUrl != null

                                fun asText(): Text = text.getOrThrow("text")

                                fun asImageUrl(): ImageUrl = imageUrl.getOrThrow("imageUrl")

                                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                                fun <T> accept(visitor: Visitor<T>): T {
                                    return when {
                                        text != null -> visitor.visitText(text)
                                        imageUrl != null -> visitor.visitImageUrl(imageUrl)
                                        else -> visitor.unknown(_json)
                                    }
                                }

                                fun validate(): UnnamedSchemaWithArrayParent2 = apply {
                                    if (!validated) {
                                        if (text == null && imageUrl == null) {
                                            throw BraintrustInvalidDataException(
                                                "Unknown UnnamedSchemaWithArrayParent2: $_json"
                                            )
                                        }
                                        text?.validate()
                                        imageUrl?.validate()
                                        validated = true
                                    }
                                }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is UnnamedSchemaWithArrayParent2 &&
                                        this.text == other.text &&
                                        this.imageUrl == other.imageUrl
                                }

                                override fun hashCode(): Int {
                                    return Objects.hash(text, imageUrl)
                                }

                                override fun toString(): String {
                                    return when {
                                        text != null -> "UnnamedSchemaWithArrayParent2{text=$text}"
                                        imageUrl != null ->
                                            "UnnamedSchemaWithArrayParent2{imageUrl=$imageUrl}"
                                        _json != null ->
                                            "UnnamedSchemaWithArrayParent2{_unknown=$_json}"
                                        else ->
                                            throw IllegalStateException(
                                                "Invalid UnnamedSchemaWithArrayParent2"
                                            )
                                    }
                                }

                                companion object {

                                    @JvmStatic
                                    fun ofText(text: Text) =
                                        UnnamedSchemaWithArrayParent2(text = text)

                                    @JvmStatic
                                    fun ofImageUrl(imageUrl: ImageUrl) =
                                        UnnamedSchemaWithArrayParent2(imageUrl = imageUrl)
                                }

                                interface Visitor<out T> {

                                    fun visitText(text: Text): T

                                    fun visitImageUrl(imageUrl: ImageUrl): T

                                    fun unknown(json: JsonValue?): T {
                                        throw BraintrustInvalidDataException(
                                            "Unknown UnnamedSchemaWithArrayParent2: $json"
                                        )
                                    }
                                }

                                class Deserializer :
                                    BaseDeserializer<UnnamedSchemaWithArrayParent2>(
                                        UnnamedSchemaWithArrayParent2::class
                                    ) {

                                    override fun ObjectCodec.deserialize(
                                        node: JsonNode
                                    ): UnnamedSchemaWithArrayParent2 {
                                        val json = JsonValue.fromJsonNode(node)
                                        tryDeserialize(node, jacksonTypeRef<Text>()) {
                                                it.validate()
                                            }
                                            ?.let {
                                                return UnnamedSchemaWithArrayParent2(
                                                    text = it,
                                                    _json = json
                                                )
                                            }
                                        tryDeserialize(node, jacksonTypeRef<ImageUrl>()) {
                                                it.validate()
                                            }
                                            ?.let {
                                                return UnnamedSchemaWithArrayParent2(
                                                    imageUrl = it,
                                                    _json = json
                                                )
                                            }

                                        return UnnamedSchemaWithArrayParent2(_json = json)
                                    }
                                }

                                class Serializer :
                                    BaseSerializer<UnnamedSchemaWithArrayParent2>(
                                        UnnamedSchemaWithArrayParent2::class
                                    ) {

                                    override fun serialize(
                                        value: UnnamedSchemaWithArrayParent2,
                                        generator: JsonGenerator,
                                        provider: SerializerProvider
                                    ) {
                                        when {
                                            value.text != null -> generator.writeObject(value.text)
                                            value.imageUrl != null ->
                                                generator.writeObject(value.imageUrl)
                                            value._json != null ->
                                                generator.writeObject(value._json)
                                            else ->
                                                throw IllegalStateException(
                                                    "Invalid UnnamedSchemaWithArrayParent2"
                                                )
                                        }
                                    }
                                }

                                @JsonDeserialize(builder = Text.Builder::class)
                                @NoAutoDetect
                                class Text
                                private constructor(
                                    private val text: JsonField<String>,
                                    private val type: JsonField<Type>,
                                    private val additionalProperties: Map<String, JsonValue>,
                                ) {

                                    private var validated: Boolean = false

                                    private var hashCode: Int = 0

                                    fun text(): Optional<String> =
                                        Optional.ofNullable(text.getNullable("text"))

                                    fun type(): Type = type.getRequired("type")

                                    @JsonProperty("text") @ExcludeMissing fun _text() = text

                                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                                    @JsonAnyGetter
                                    @ExcludeMissing
                                    fun _additionalProperties(): Map<String, JsonValue> =
                                        additionalProperties

                                    fun validate(): Text = apply {
                                        if (!validated) {
                                            text()
                                            type()
                                            validated = true
                                        }
                                    }

                                    fun toBuilder() = Builder().from(this)

                                    override fun equals(other: Any?): Boolean {
                                        if (this === other) {
                                            return true
                                        }

                                        return other is Text &&
                                            this.text == other.text &&
                                            this.type == other.type &&
                                            this.additionalProperties == other.additionalProperties
                                    }

                                    override fun hashCode(): Int {
                                        if (hashCode == 0) {
                                            hashCode =
                                                Objects.hash(
                                                    text,
                                                    type,
                                                    additionalProperties,
                                                )
                                        }
                                        return hashCode
                                    }

                                    override fun toString() =
                                        "Text{text=$text, type=$type, additionalProperties=$additionalProperties}"

                                    companion object {

                                        @JvmStatic fun builder() = Builder()
                                    }

                                    class Builder {

                                        private var text: JsonField<String> = JsonMissing.of()
                                        private var type: JsonField<Type> = JsonMissing.of()
                                        private var additionalProperties:
                                            MutableMap<String, JsonValue> =
                                            mutableMapOf()

                                        @JvmSynthetic
                                        internal fun from(text: Text) = apply {
                                            this.text = text.text
                                            this.type = text.type
                                            additionalProperties(text.additionalProperties)
                                        }

                                        fun text(text: String) = text(JsonField.of(text))

                                        @JsonProperty("text")
                                        @ExcludeMissing
                                        fun text(text: JsonField<String>) = apply {
                                            this.text = text
                                        }

                                        fun type(type: Type) = type(JsonField.of(type))

                                        @JsonProperty("type")
                                        @ExcludeMissing
                                        fun type(type: JsonField<Type>) = apply { this.type = type }

                                        fun additionalProperties(
                                            additionalProperties: Map<String, JsonValue>
                                        ) = apply {
                                            this.additionalProperties.clear()
                                            this.additionalProperties.putAll(additionalProperties)
                                        }

                                        @JsonAnySetter
                                        fun putAdditionalProperty(key: String, value: JsonValue) =
                                            apply {
                                                this.additionalProperties.put(key, value)
                                            }

                                        fun putAllAdditionalProperties(
                                            additionalProperties: Map<String, JsonValue>
                                        ) = apply {
                                            this.additionalProperties.putAll(additionalProperties)
                                        }

                                        fun build(): Text =
                                            Text(
                                                text,
                                                type,
                                                additionalProperties.toUnmodifiable(),
                                            )
                                    }

                                    class Type
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

                                            return other is Type && this.value == other.value
                                        }

                                        override fun hashCode() = value.hashCode()

                                        override fun toString() = value.toString()

                                        companion object {

                                            @JvmField val TEXT = Type(JsonField.of("text"))

                                            @JvmStatic
                                            fun of(value: String) = Type(JsonField.of(value))
                                        }

                                        enum class Known {
                                            TEXT,
                                        }

                                        enum class Value {
                                            TEXT,
                                            _UNKNOWN,
                                        }

                                        fun value(): Value =
                                            when (this) {
                                                TEXT -> Value.TEXT
                                                else -> Value._UNKNOWN
                                            }

                                        fun known(): Known =
                                            when (this) {
                                                TEXT -> Known.TEXT
                                                else ->
                                                    throw BraintrustInvalidDataException(
                                                        "Unknown Type: $value"
                                                    )
                                            }

                                        fun asString(): String = _value().asStringOrThrow()
                                    }
                                }

                                @JsonDeserialize(builder = ImageUrl.Builder::class)
                                @NoAutoDetect
                                class ImageUrl
                                private constructor(
                                    private val imageUrl: JsonField<ImageUrl>,
                                    private val type: JsonField<Type>,
                                    private val additionalProperties: Map<String, JsonValue>,
                                ) {

                                    private var validated: Boolean = false

                                    private var hashCode: Int = 0

                                    fun imageUrl(): ImageUrl = imageUrl.getRequired("image_url")

                                    fun type(): Type = type.getRequired("type")

                                    @JsonProperty("image_url")
                                    @ExcludeMissing
                                    fun _imageUrl() = imageUrl

                                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                                    @JsonAnyGetter
                                    @ExcludeMissing
                                    fun _additionalProperties(): Map<String, JsonValue> =
                                        additionalProperties

                                    fun validate(): ImageUrl = apply {
                                        if (!validated) {
                                            imageUrl().validate()
                                            type()
                                            validated = true
                                        }
                                    }

                                    fun toBuilder() = Builder().from(this)

                                    override fun equals(other: Any?): Boolean {
                                        if (this === other) {
                                            return true
                                        }

                                        return other is ImageUrl &&
                                            this.imageUrl == other.imageUrl &&
                                            this.type == other.type &&
                                            this.additionalProperties == other.additionalProperties
                                    }

                                    override fun hashCode(): Int {
                                        if (hashCode == 0) {
                                            hashCode =
                                                Objects.hash(
                                                    imageUrl,
                                                    type,
                                                    additionalProperties,
                                                )
                                        }
                                        return hashCode
                                    }

                                    override fun toString() =
                                        "ImageUrl{imageUrl=$imageUrl, type=$type, additionalProperties=$additionalProperties}"

                                    companion object {

                                        @JvmStatic fun builder() = Builder()
                                    }

                                    class Builder {

                                        private var imageUrl: JsonField<ImageUrl> = JsonMissing.of()
                                        private var type: JsonField<Type> = JsonMissing.of()
                                        private var additionalProperties:
                                            MutableMap<String, JsonValue> =
                                            mutableMapOf()

                                        @JvmSynthetic
                                        internal fun from(imageUrl: ImageUrl) = apply {
                                            this.imageUrl = imageUrl.imageUrl
                                            this.type = imageUrl.type
                                            additionalProperties(imageUrl.additionalProperties)
                                        }

                                        fun imageUrl(imageUrl: ImageUrl) =
                                            imageUrl(JsonField.of(imageUrl))

                                        @JsonProperty("image_url")
                                        @ExcludeMissing
                                        fun imageUrl(imageUrl: JsonField<ImageUrl>) = apply {
                                            this.imageUrl = imageUrl
                                        }

                                        fun type(type: Type) = type(JsonField.of(type))

                                        @JsonProperty("type")
                                        @ExcludeMissing
                                        fun type(type: JsonField<Type>) = apply { this.type = type }

                                        fun additionalProperties(
                                            additionalProperties: Map<String, JsonValue>
                                        ) = apply {
                                            this.additionalProperties.clear()
                                            this.additionalProperties.putAll(additionalProperties)
                                        }

                                        @JsonAnySetter
                                        fun putAdditionalProperty(key: String, value: JsonValue) =
                                            apply {
                                                this.additionalProperties.put(key, value)
                                            }

                                        fun putAllAdditionalProperties(
                                            additionalProperties: Map<String, JsonValue>
                                        ) = apply {
                                            this.additionalProperties.putAll(additionalProperties)
                                        }

                                        fun build(): ImageUrl =
                                            ImageUrl(
                                                imageUrl,
                                                type,
                                                additionalProperties.toUnmodifiable(),
                                            )
                                    }

                                    @JsonDeserialize(builder = ImageUrl.Builder::class)
                                    @NoAutoDetect
                                    class ImageUrl
                                    private constructor(
                                        private val url: JsonField<String>,
                                        private val detail: JsonField<Detail>,
                                        private val additionalProperties: Map<String, JsonValue>,
                                    ) {

                                        private var validated: Boolean = false

                                        private var hashCode: Int = 0

                                        fun url(): String = url.getRequired("url")

                                        fun detail(): Optional<Detail> =
                                            Optional.ofNullable(detail.getNullable("detail"))

                                        @JsonProperty("url") @ExcludeMissing fun _url() = url

                                        @JsonProperty("detail")
                                        @ExcludeMissing
                                        fun _detail() = detail

                                        @JsonAnyGetter
                                        @ExcludeMissing
                                        fun _additionalProperties(): Map<String, JsonValue> =
                                            additionalProperties

                                        fun validate(): ImageUrl = apply {
                                            if (!validated) {
                                                url()
                                                detail()
                                                validated = true
                                            }
                                        }

                                        fun toBuilder() = Builder().from(this)

                                        override fun equals(other: Any?): Boolean {
                                            if (this === other) {
                                                return true
                                            }

                                            return other is ImageUrl &&
                                                this.url == other.url &&
                                                this.detail == other.detail &&
                                                this.additionalProperties ==
                                                    other.additionalProperties
                                        }

                                        override fun hashCode(): Int {
                                            if (hashCode == 0) {
                                                hashCode =
                                                    Objects.hash(
                                                        url,
                                                        detail,
                                                        additionalProperties,
                                                    )
                                            }
                                            return hashCode
                                        }

                                        override fun toString() =
                                            "ImageUrl{url=$url, detail=$detail, additionalProperties=$additionalProperties}"

                                        companion object {

                                            @JvmStatic fun builder() = Builder()
                                        }

                                        class Builder {

                                            private var url: JsonField<String> = JsonMissing.of()
                                            private var detail: JsonField<Detail> = JsonMissing.of()
                                            private var additionalProperties:
                                                MutableMap<String, JsonValue> =
                                                mutableMapOf()

                                            @JvmSynthetic
                                            internal fun from(imageUrl: ImageUrl) = apply {
                                                this.url = imageUrl.url
                                                this.detail = imageUrl.detail
                                                additionalProperties(imageUrl.additionalProperties)
                                            }

                                            fun url(url: String) = url(JsonField.of(url))

                                            @JsonProperty("url")
                                            @ExcludeMissing
                                            fun url(url: JsonField<String>) = apply {
                                                this.url = url
                                            }

                                            fun detail(detail: Detail) =
                                                detail(JsonField.of(detail))

                                            @JsonProperty("detail")
                                            @ExcludeMissing
                                            fun detail(detail: JsonField<Detail>) = apply {
                                                this.detail = detail
                                            }

                                            fun additionalProperties(
                                                additionalProperties: Map<String, JsonValue>
                                            ) = apply {
                                                this.additionalProperties.clear()
                                                this.additionalProperties.putAll(
                                                    additionalProperties
                                                )
                                            }

                                            @JsonAnySetter
                                            fun putAdditionalProperty(
                                                key: String,
                                                value: JsonValue
                                            ) = apply { this.additionalProperties.put(key, value) }

                                            fun putAllAdditionalProperties(
                                                additionalProperties: Map<String, JsonValue>
                                            ) = apply {
                                                this.additionalProperties.putAll(
                                                    additionalProperties
                                                )
                                            }

                                            fun build(): ImageUrl =
                                                ImageUrl(
                                                    url,
                                                    detail,
                                                    additionalProperties.toUnmodifiable(),
                                                )
                                        }

                                        class Detail
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

                                                return other is Detail && this.value == other.value
                                            }

                                            override fun hashCode() = value.hashCode()

                                            override fun toString() = value.toString()

                                            companion object {

                                                @JvmField val AUTO = Detail(JsonField.of("auto"))

                                                @JvmField val LOW = Detail(JsonField.of("low"))

                                                @JvmField val HIGH = Detail(JsonField.of("high"))

                                                @JvmStatic
                                                fun of(value: String) = Detail(JsonField.of(value))
                                            }

                                            enum class Known {
                                                AUTO,
                                                LOW,
                                                HIGH,
                                            }

                                            enum class Value {
                                                AUTO,
                                                LOW,
                                                HIGH,
                                                _UNKNOWN,
                                            }

                                            fun value(): Value =
                                                when (this) {
                                                    AUTO -> Value.AUTO
                                                    LOW -> Value.LOW
                                                    HIGH -> Value.HIGH
                                                    else -> Value._UNKNOWN
                                                }

                                            fun known(): Known =
                                                when (this) {
                                                    AUTO -> Known.AUTO
                                                    LOW -> Known.LOW
                                                    HIGH -> Known.HIGH
                                                    else ->
                                                        throw BraintrustInvalidDataException(
                                                            "Unknown Detail: $value"
                                                        )
                                                }

                                            fun asString(): String = _value().asStringOrThrow()
                                        }
                                    }

                                    class Type
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

                                            return other is Type && this.value == other.value
                                        }

                                        override fun hashCode() = value.hashCode()

                                        override fun toString() = value.toString()

                                        companion object {

                                            @JvmField
                                            val IMAGE_URL = Type(JsonField.of("image_url"))

                                            @JvmStatic
                                            fun of(value: String) = Type(JsonField.of(value))
                                        }

                                        enum class Known {
                                            IMAGE_URL,
                                        }

                                        enum class Value {
                                            IMAGE_URL,
                                            _UNKNOWN,
                                        }

                                        fun value(): Value =
                                            when (this) {
                                                IMAGE_URL -> Value.IMAGE_URL
                                                else -> Value._UNKNOWN
                                            }

                                        fun known(): Known =
                                            when (this) {
                                                IMAGE_URL -> Known.IMAGE_URL
                                                else ->
                                                    throw BraintrustInvalidDataException(
                                                        "Unknown Type: $value"
                                                    )
                                            }

                                        fun asString(): String = _value().asStringOrThrow()
                                    }
                                }
                            }
                        }
                    }

                    @JsonDeserialize(builder = Assistant.Builder::class)
                    @NoAutoDetect
                    class Assistant
                    private constructor(
                        private val role: JsonField<Role>,
                        private val content: JsonField<String>,
                        private val functionCall: JsonField<FunctionCall>,
                        private val name: JsonField<String>,
                        private val toolCalls: JsonField<List<ToolCall>>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun role(): Role = role.getRequired("role")

                        fun content(): Optional<String> =
                            Optional.ofNullable(content.getNullable("content"))

                        fun functionCall(): Optional<FunctionCall> =
                            Optional.ofNullable(functionCall.getNullable("function_call"))

                        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                        fun toolCalls(): Optional<List<ToolCall>> =
                            Optional.ofNullable(toolCalls.getNullable("tool_calls"))

                        @JsonProperty("role") @ExcludeMissing fun _role() = role

                        @JsonProperty("content") @ExcludeMissing fun _content() = content

                        @JsonProperty("function_call")
                        @ExcludeMissing
                        fun _functionCall() = functionCall

                        @JsonProperty("name") @ExcludeMissing fun _name() = name

                        @JsonProperty("tool_calls") @ExcludeMissing fun _toolCalls() = toolCalls

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Assistant = apply {
                            if (!validated) {
                                role()
                                content()
                                functionCall().map { it.validate() }
                                name()
                                toolCalls().map { it.forEach { it.validate() } }
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Assistant &&
                                this.role == other.role &&
                                this.content == other.content &&
                                this.functionCall == other.functionCall &&
                                this.name == other.name &&
                                this.toolCalls == other.toolCalls &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        role,
                                        content,
                                        functionCall,
                                        name,
                                        toolCalls,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Assistant{role=$role, content=$content, functionCall=$functionCall, name=$name, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var role: JsonField<Role> = JsonMissing.of()
                            private var content: JsonField<String> = JsonMissing.of()
                            private var functionCall: JsonField<FunctionCall> = JsonMissing.of()
                            private var name: JsonField<String> = JsonMissing.of()
                            private var toolCalls: JsonField<List<ToolCall>> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(assistant: Assistant) = apply {
                                this.role = assistant.role
                                this.content = assistant.content
                                this.functionCall = assistant.functionCall
                                this.name = assistant.name
                                this.toolCalls = assistant.toolCalls
                                additionalProperties(assistant.additionalProperties)
                            }

                            fun role(role: Role) = role(JsonField.of(role))

                            @JsonProperty("role")
                            @ExcludeMissing
                            fun role(role: JsonField<Role>) = apply { this.role = role }

                            fun content(content: String) = content(JsonField.of(content))

                            @JsonProperty("content")
                            @ExcludeMissing
                            fun content(content: JsonField<String>) = apply {
                                this.content = content
                            }

                            fun functionCall(functionCall: FunctionCall) =
                                functionCall(JsonField.of(functionCall))

                            @JsonProperty("function_call")
                            @ExcludeMissing
                            fun functionCall(functionCall: JsonField<FunctionCall>) = apply {
                                this.functionCall = functionCall
                            }

                            fun name(name: String) = name(JsonField.of(name))

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun name(name: JsonField<String>) = apply { this.name = name }

                            fun toolCalls(toolCalls: List<ToolCall>) =
                                toolCalls(JsonField.of(toolCalls))

                            @JsonProperty("tool_calls")
                            @ExcludeMissing
                            fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
                                this.toolCalls = toolCalls
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Assistant =
                                Assistant(
                                    role,
                                    content,
                                    functionCall,
                                    name,
                                    toolCalls.map { it.toUnmodifiable() },
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class Role
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

                                return other is Role && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val ASSISTANT = Role(JsonField.of("assistant"))

                                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                            }

                            enum class Known {
                                ASSISTANT,
                            }

                            enum class Value {
                                ASSISTANT,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    ASSISTANT -> Value.ASSISTANT
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    ASSISTANT -> Known.ASSISTANT
                                    else ->
                                        throw BraintrustInvalidDataException("Unknown Role: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        @JsonDeserialize(builder = FunctionCall.Builder::class)
                        @NoAutoDetect
                        class FunctionCall
                        private constructor(
                            private val arguments: JsonField<String>,
                            private val name: JsonField<String>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            fun arguments(): String = arguments.getRequired("arguments")

                            fun name(): String = name.getRequired("name")

                            @JsonProperty("arguments") @ExcludeMissing fun _arguments() = arguments

                            @JsonProperty("name") @ExcludeMissing fun _name() = name

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): FunctionCall = apply {
                                if (!validated) {
                                    arguments()
                                    name()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is FunctionCall &&
                                    this.arguments == other.arguments &&
                                    this.name == other.name &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode =
                                        Objects.hash(
                                            arguments,
                                            name,
                                            additionalProperties,
                                        )
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "FunctionCall{arguments=$arguments, name=$name, additionalProperties=$additionalProperties}"

                            companion object {

                                @JvmStatic fun builder() = Builder()
                            }

                            class Builder {

                                private var arguments: JsonField<String> = JsonMissing.of()
                                private var name: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(functionCall: FunctionCall) = apply {
                                    this.arguments = functionCall.arguments
                                    this.name = functionCall.name
                                    additionalProperties(functionCall.additionalProperties)
                                }

                                fun arguments(arguments: String) =
                                    arguments(JsonField.of(arguments))

                                @JsonProperty("arguments")
                                @ExcludeMissing
                                fun arguments(arguments: JsonField<String>) = apply {
                                    this.arguments = arguments
                                }

                                fun name(name: String) = name(JsonField.of(name))

                                @JsonProperty("name")
                                @ExcludeMissing
                                fun name(name: JsonField<String>) = apply { this.name = name }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                                @JsonAnySetter
                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    this.additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun build(): FunctionCall =
                                    FunctionCall(
                                        arguments,
                                        name,
                                        additionalProperties.toUnmodifiable(),
                                    )
                            }
                        }

                        @JsonDeserialize(builder = ToolCall.Builder::class)
                        @NoAutoDetect
                        class ToolCall
                        private constructor(
                            private val id: JsonField<String>,
                            private val function: JsonField<Function>,
                            private val type: JsonField<Type>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            fun id(): String = id.getRequired("id")

                            fun function(): Function = function.getRequired("function")

                            fun type(): Type = type.getRequired("type")

                            @JsonProperty("id") @ExcludeMissing fun _id() = id

                            @JsonProperty("function") @ExcludeMissing fun _function() = function

                            @JsonProperty("type") @ExcludeMissing fun _type() = type

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): ToolCall = apply {
                                if (!validated) {
                                    id()
                                    function().validate()
                                    type()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is ToolCall &&
                                    this.id == other.id &&
                                    this.function == other.function &&
                                    this.type == other.type &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode =
                                        Objects.hash(
                                            id,
                                            function,
                                            type,
                                            additionalProperties,
                                        )
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "ToolCall{id=$id, function=$function, type=$type, additionalProperties=$additionalProperties}"

                            companion object {

                                @JvmStatic fun builder() = Builder()
                            }

                            class Builder {

                                private var id: JsonField<String> = JsonMissing.of()
                                private var function: JsonField<Function> = JsonMissing.of()
                                private var type: JsonField<Type> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(toolCall: ToolCall) = apply {
                                    this.id = toolCall.id
                                    this.function = toolCall.function
                                    this.type = toolCall.type
                                    additionalProperties(toolCall.additionalProperties)
                                }

                                fun id(id: String) = id(JsonField.of(id))

                                @JsonProperty("id")
                                @ExcludeMissing
                                fun id(id: JsonField<String>) = apply { this.id = id }

                                fun function(function: Function) = function(JsonField.of(function))

                                @JsonProperty("function")
                                @ExcludeMissing
                                fun function(function: JsonField<Function>) = apply {
                                    this.function = function
                                }

                                fun type(type: Type) = type(JsonField.of(type))

                                @JsonProperty("type")
                                @ExcludeMissing
                                fun type(type: JsonField<Type>) = apply { this.type = type }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                                @JsonAnySetter
                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    this.additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun build(): ToolCall =
                                    ToolCall(
                                        id,
                                        function,
                                        type,
                                        additionalProperties.toUnmodifiable(),
                                    )
                            }

                            @JsonDeserialize(builder = Function.Builder::class)
                            @NoAutoDetect
                            class Function
                            private constructor(
                                private val arguments: JsonField<String>,
                                private val name: JsonField<String>,
                                private val additionalProperties: Map<String, JsonValue>,
                            ) {

                                private var validated: Boolean = false

                                private var hashCode: Int = 0

                                fun arguments(): String = arguments.getRequired("arguments")

                                fun name(): String = name.getRequired("name")

                                @JsonProperty("arguments")
                                @ExcludeMissing
                                fun _arguments() = arguments

                                @JsonProperty("name") @ExcludeMissing fun _name() = name

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> =
                                    additionalProperties

                                fun validate(): Function = apply {
                                    if (!validated) {
                                        arguments()
                                        name()
                                        validated = true
                                    }
                                }

                                fun toBuilder() = Builder().from(this)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Function &&
                                        this.arguments == other.arguments &&
                                        this.name == other.name &&
                                        this.additionalProperties == other.additionalProperties
                                }

                                override fun hashCode(): Int {
                                    if (hashCode == 0) {
                                        hashCode =
                                            Objects.hash(
                                                arguments,
                                                name,
                                                additionalProperties,
                                            )
                                    }
                                    return hashCode
                                }

                                override fun toString() =
                                    "Function{arguments=$arguments, name=$name, additionalProperties=$additionalProperties}"

                                companion object {

                                    @JvmStatic fun builder() = Builder()
                                }

                                class Builder {

                                    private var arguments: JsonField<String> = JsonMissing.of()
                                    private var name: JsonField<String> = JsonMissing.of()
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    @JvmSynthetic
                                    internal fun from(function: Function) = apply {
                                        this.arguments = function.arguments
                                        this.name = function.name
                                        additionalProperties(function.additionalProperties)
                                    }

                                    fun arguments(arguments: String) =
                                        arguments(JsonField.of(arguments))

                                    @JsonProperty("arguments")
                                    @ExcludeMissing
                                    fun arguments(arguments: JsonField<String>) = apply {
                                        this.arguments = arguments
                                    }

                                    fun name(name: String) = name(JsonField.of(name))

                                    @JsonProperty("name")
                                    @ExcludeMissing
                                    fun name(name: JsonField<String>) = apply { this.name = name }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    @JsonAnySetter
                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            this.additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun build(): Function =
                                        Function(
                                            arguments,
                                            name,
                                            additionalProperties.toUnmodifiable(),
                                        )
                                }
                            }

                            class Type
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

                                    return other is Type && this.value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()

                                companion object {

                                    @JvmField val FUNCTION = Type(JsonField.of("function"))

                                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                                }

                                enum class Known {
                                    FUNCTION,
                                }

                                enum class Value {
                                    FUNCTION,
                                    _UNKNOWN,
                                }

                                fun value(): Value =
                                    when (this) {
                                        FUNCTION -> Value.FUNCTION
                                        else -> Value._UNKNOWN
                                    }

                                fun known(): Known =
                                    when (this) {
                                        FUNCTION -> Known.FUNCTION
                                        else ->
                                            throw BraintrustInvalidDataException(
                                                "Unknown Type: $value"
                                            )
                                    }

                                fun asString(): String = _value().asStringOrThrow()
                            }
                        }
                    }

                    @JsonDeserialize(builder = Tool.Builder::class)
                    @NoAutoDetect
                    class Tool
                    private constructor(
                        private val content: JsonField<String>,
                        private val role: JsonField<Role>,
                        private val toolCallId: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun content(): Optional<String> =
                            Optional.ofNullable(content.getNullable("content"))

                        fun role(): Role = role.getRequired("role")

                        fun toolCallId(): Optional<String> =
                            Optional.ofNullable(toolCallId.getNullable("tool_call_id"))

                        @JsonProperty("content") @ExcludeMissing fun _content() = content

                        @JsonProperty("role") @ExcludeMissing fun _role() = role

                        @JsonProperty("tool_call_id") @ExcludeMissing fun _toolCallId() = toolCallId

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Tool = apply {
                            if (!validated) {
                                content()
                                role()
                                toolCallId()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Tool &&
                                this.content == other.content &&
                                this.role == other.role &&
                                this.toolCallId == other.toolCallId &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        content,
                                        role,
                                        toolCallId,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Tool{content=$content, role=$role, toolCallId=$toolCallId, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var content: JsonField<String> = JsonMissing.of()
                            private var role: JsonField<Role> = JsonMissing.of()
                            private var toolCallId: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(tool: Tool) = apply {
                                this.content = tool.content
                                this.role = tool.role
                                this.toolCallId = tool.toolCallId
                                additionalProperties(tool.additionalProperties)
                            }

                            fun content(content: String) = content(JsonField.of(content))

                            @JsonProperty("content")
                            @ExcludeMissing
                            fun content(content: JsonField<String>) = apply {
                                this.content = content
                            }

                            fun role(role: Role) = role(JsonField.of(role))

                            @JsonProperty("role")
                            @ExcludeMissing
                            fun role(role: JsonField<Role>) = apply { this.role = role }

                            fun toolCallId(toolCallId: String) =
                                toolCallId(JsonField.of(toolCallId))

                            @JsonProperty("tool_call_id")
                            @ExcludeMissing
                            fun toolCallId(toolCallId: JsonField<String>) = apply {
                                this.toolCallId = toolCallId
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Tool =
                                Tool(
                                    content,
                                    role,
                                    toolCallId,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class Role
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

                                return other is Role && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val TOOL = Role(JsonField.of("tool"))

                                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                            }

                            enum class Known {
                                TOOL,
                            }

                            enum class Value {
                                TOOL,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    TOOL -> Value.TOOL
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    TOOL -> Known.TOOL
                                    else ->
                                        throw BraintrustInvalidDataException("Unknown Role: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }

                    @JsonDeserialize(builder = Function.Builder::class)
                    @NoAutoDetect
                    class Function
                    private constructor(
                        private val content: JsonField<String>,
                        private val name: JsonField<String>,
                        private val role: JsonField<Role>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun content(): Optional<String> =
                            Optional.ofNullable(content.getNullable("content"))

                        fun name(): String = name.getRequired("name")

                        fun role(): Role = role.getRequired("role")

                        @JsonProperty("content") @ExcludeMissing fun _content() = content

                        @JsonProperty("name") @ExcludeMissing fun _name() = name

                        @JsonProperty("role") @ExcludeMissing fun _role() = role

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Function = apply {
                            if (!validated) {
                                content()
                                name()
                                role()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Function &&
                                this.content == other.content &&
                                this.name == other.name &&
                                this.role == other.role &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        content,
                                        name,
                                        role,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Function{content=$content, name=$name, role=$role, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var content: JsonField<String> = JsonMissing.of()
                            private var name: JsonField<String> = JsonMissing.of()
                            private var role: JsonField<Role> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(function: Function) = apply {
                                this.content = function.content
                                this.name = function.name
                                this.role = function.role
                                additionalProperties(function.additionalProperties)
                            }

                            fun content(content: String) = content(JsonField.of(content))

                            @JsonProperty("content")
                            @ExcludeMissing
                            fun content(content: JsonField<String>) = apply {
                                this.content = content
                            }

                            fun name(name: String) = name(JsonField.of(name))

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun name(name: JsonField<String>) = apply { this.name = name }

                            fun role(role: Role) = role(JsonField.of(role))

                            @JsonProperty("role")
                            @ExcludeMissing
                            fun role(role: JsonField<Role>) = apply { this.role = role }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Function =
                                Function(
                                    content,
                                    name,
                                    role,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class Role
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

                                return other is Role && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val FUNCTION = Role(JsonField.of("function"))

                                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                            }

                            enum class Known {
                                FUNCTION,
                            }

                            enum class Value {
                                FUNCTION,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    FUNCTION -> Value.FUNCTION
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    FUNCTION -> Known.FUNCTION
                                    else ->
                                        throw BraintrustInvalidDataException("Unknown Role: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }

                    @JsonDeserialize(builder = Fallback.Builder::class)
                    @NoAutoDetect
                    class Fallback
                    private constructor(
                        private val role: JsonField<Role>,
                        private val content: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun role(): Role = role.getRequired("role")

                        fun content(): Optional<String> =
                            Optional.ofNullable(content.getNullable("content"))

                        @JsonProperty("role") @ExcludeMissing fun _role() = role

                        @JsonProperty("content") @ExcludeMissing fun _content() = content

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Fallback = apply {
                            if (!validated) {
                                role()
                                content()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Fallback &&
                                this.role == other.role &&
                                this.content == other.content &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        role,
                                        content,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Fallback{role=$role, content=$content, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var role: JsonField<Role> = JsonMissing.of()
                            private var content: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(fallback: Fallback) = apply {
                                this.role = fallback.role
                                this.content = fallback.content
                                additionalProperties(fallback.additionalProperties)
                            }

                            fun role(role: Role) = role(JsonField.of(role))

                            @JsonProperty("role")
                            @ExcludeMissing
                            fun role(role: JsonField<Role>) = apply { this.role = role }

                            fun content(content: String) = content(JsonField.of(content))

                            @JsonProperty("content")
                            @ExcludeMissing
                            fun content(content: JsonField<String>) = apply {
                                this.content = content
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Fallback =
                                Fallback(
                                    role,
                                    content,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class Role
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

                                return other is Role && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val MODEL = Role(JsonField.of("model"))

                                @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                            }

                            enum class Known {
                                MODEL,
                            }

                            enum class Value {
                                MODEL,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    MODEL -> Value.MODEL
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    MODEL -> Known.MODEL
                                    else ->
                                        throw BraintrustInvalidDataException("Unknown Role: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }
                }

                class Type
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

                        return other is Type && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val CHAT = Type(JsonField.of("chat"))

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        CHAT,
                    }

                    enum class Value {
                        CHAT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            CHAT -> Value.CHAT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            CHAT -> Known.CHAT
                            else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = NullableVariant.Builder::class)
            @NoAutoDetect
            class NullableVariant
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NullableVariant = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NullableVariant &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "NullableVariant{additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(nullableVariant: NullableVariant) = apply {
                        additionalProperties(nullableVariant.additionalProperties)
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

                    fun build(): NullableVariant =
                        NullableVariant(additionalProperties.toUnmodifiable())
                }
            }
        }
    }
}
