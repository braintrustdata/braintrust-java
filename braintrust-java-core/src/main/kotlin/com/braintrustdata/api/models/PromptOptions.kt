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
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
import com.braintrustdata.api.core.getOrThrow
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
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class PromptOptions
@JsonCreator
private constructor(
    @JsonProperty("model") @ExcludeMissing private val model: JsonField<String> = JsonMissing.of(),
    @JsonProperty("params")
    @ExcludeMissing
    private val params: JsonField<Params> = JsonMissing.of(),
    @JsonProperty("position")
    @ExcludeMissing
    private val position: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = Optional.ofNullable(model.getNullable("model"))

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun params(): Optional<Params> = Optional.ofNullable(params.getNullable("params"))

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun position(): Optional<String> = Optional.ofNullable(position.getNullable("position"))

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [params].
     *
     * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

    /**
     * Returns the raw JSON value of [position].
     *
     * Unlike [position], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("position") @ExcludeMissing fun _position(): JsonField<String> = position

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PromptOptions = apply {
        if (validated) {
            return@apply
        }

        model()
        params().ifPresent { it.validate() }
        position()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [PromptOptions]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PromptOptions]. */
    class Builder internal constructor() {

        private var model: JsonField<String> = JsonMissing.of()
        private var params: JsonField<Params> = JsonMissing.of()
        private var position: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(promptOptions: PromptOptions) = apply {
            model = promptOptions.model
            params = promptOptions.params
            position = promptOptions.position
            additionalProperties = promptOptions.additionalProperties.toMutableMap()
        }

        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        fun params(params: Params) = params(JsonField.of(params))

        /**
         * Sets [Builder.params] to an arbitrary JSON value.
         *
         * You should usually call [Builder.params] with a well-typed [Params] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun params(params: JsonField<Params>) = apply { this.params = params }

        /** Alias for calling [params] with `Params.ofOpenAIModel(openaiModel)`. */
        fun params(openaiModel: Params.OpenAIModelParams) =
            params(Params.ofOpenAIModel(openaiModel))

        /** Alias for calling [params] with `Params.ofAnthropicModel(anthropicModel)`. */
        fun params(anthropicModel: Params.AnthropicModelParams) =
            params(Params.ofAnthropicModel(anthropicModel))

        /** Alias for calling [params] with `Params.ofGoogleModel(googleModel)`. */
        fun params(googleModel: Params.GoogleModelParams) =
            params(Params.ofGoogleModel(googleModel))

        /** Alias for calling [params] with `Params.ofWindowAiModel(windowAiModel)`. */
        fun params(windowAiModel: Params.WindowAiModelParams) =
            params(Params.ofWindowAiModel(windowAiModel))

        /** Alias for calling [params] with `Params.ofJsCompletion(jsCompletion)`. */
        fun params(jsCompletion: Params.JsCompletionParams) =
            params(Params.ofJsCompletion(jsCompletion))

        fun position(position: String) = position(JsonField.of(position))

        /**
         * Sets [Builder.position] to an arbitrary JSON value.
         *
         * You should usually call [Builder.position] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun position(position: JsonField<String>) = apply { this.position = position }

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
         * Returns an immutable instance of [PromptOptions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PromptOptions =
            PromptOptions(model, params, position, additionalProperties.toImmutable())
    }

    @JsonDeserialize(using = Params.Deserializer::class)
    @JsonSerialize(using = Params.Serializer::class)
    class Params
    private constructor(
        private val openaiModel: OpenAIModelParams? = null,
        private val anthropicModel: AnthropicModelParams? = null,
        private val googleModel: GoogleModelParams? = null,
        private val windowAiModel: WindowAiModelParams? = null,
        private val jsCompletion: JsCompletionParams? = null,
        private val _json: JsonValue? = null,
    ) {

        fun openaiModel(): Optional<OpenAIModelParams> = Optional.ofNullable(openaiModel)

        fun anthropicModel(): Optional<AnthropicModelParams> = Optional.ofNullable(anthropicModel)

        fun googleModel(): Optional<GoogleModelParams> = Optional.ofNullable(googleModel)

        fun windowAiModel(): Optional<WindowAiModelParams> = Optional.ofNullable(windowAiModel)

        fun jsCompletion(): Optional<JsCompletionParams> = Optional.ofNullable(jsCompletion)

        fun isOpenAIModel(): Boolean = openaiModel != null

        fun isAnthropicModel(): Boolean = anthropicModel != null

        fun isGoogleModel(): Boolean = googleModel != null

        fun isWindowAiModel(): Boolean = windowAiModel != null

        fun isJsCompletion(): Boolean = jsCompletion != null

        fun asOpenAIModel(): OpenAIModelParams = openaiModel.getOrThrow("openaiModel")

        fun asAnthropicModel(): AnthropicModelParams = anthropicModel.getOrThrow("anthropicModel")

        fun asGoogleModel(): GoogleModelParams = googleModel.getOrThrow("googleModel")

        fun asWindowAiModel(): WindowAiModelParams = windowAiModel.getOrThrow("windowAiModel")

        fun asJsCompletion(): JsCompletionParams = jsCompletion.getOrThrow("jsCompletion")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                openaiModel != null -> visitor.visitOpenAIModel(openaiModel)
                anthropicModel != null -> visitor.visitAnthropicModel(anthropicModel)
                googleModel != null -> visitor.visitGoogleModel(googleModel)
                windowAiModel != null -> visitor.visitWindowAiModel(windowAiModel)
                jsCompletion != null -> visitor.visitJsCompletion(jsCompletion)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Params = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitOpenAIModel(openaiModel: OpenAIModelParams) {
                        openaiModel.validate()
                    }

                    override fun visitAnthropicModel(anthropicModel: AnthropicModelParams) {
                        anthropicModel.validate()
                    }

                    override fun visitGoogleModel(googleModel: GoogleModelParams) {
                        googleModel.validate()
                    }

                    override fun visitWindowAiModel(windowAiModel: WindowAiModelParams) {
                        windowAiModel.validate()
                    }

                    override fun visitJsCompletion(jsCompletion: JsCompletionParams) {
                        jsCompletion.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Params && openaiModel == other.openaiModel && anthropicModel == other.anthropicModel && googleModel == other.googleModel && windowAiModel == other.windowAiModel && jsCompletion == other.jsCompletion /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(openaiModel, anthropicModel, googleModel, windowAiModel, jsCompletion) /* spotless:on */

        override fun toString(): String =
            when {
                openaiModel != null -> "Params{openaiModel=$openaiModel}"
                anthropicModel != null -> "Params{anthropicModel=$anthropicModel}"
                googleModel != null -> "Params{googleModel=$googleModel}"
                windowAiModel != null -> "Params{windowAiModel=$windowAiModel}"
                jsCompletion != null -> "Params{jsCompletion=$jsCompletion}"
                _json != null -> "Params{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Params")
            }

        companion object {

            @JvmStatic
            fun ofOpenAIModel(openaiModel: OpenAIModelParams) = Params(openaiModel = openaiModel)

            @JvmStatic
            fun ofAnthropicModel(anthropicModel: AnthropicModelParams) =
                Params(anthropicModel = anthropicModel)

            @JvmStatic
            fun ofGoogleModel(googleModel: GoogleModelParams) = Params(googleModel = googleModel)

            @JvmStatic
            fun ofWindowAiModel(windowAiModel: WindowAiModelParams) =
                Params(windowAiModel = windowAiModel)

            @JvmStatic
            fun ofJsCompletion(jsCompletion: JsCompletionParams) =
                Params(jsCompletion = jsCompletion)
        }

        /** An interface that defines how to map each variant of [Params] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitOpenAIModel(openaiModel: OpenAIModelParams): T

            fun visitAnthropicModel(anthropicModel: AnthropicModelParams): T

            fun visitGoogleModel(googleModel: GoogleModelParams): T

            fun visitWindowAiModel(windowAiModel: WindowAiModelParams): T

            fun visitJsCompletion(jsCompletion: JsCompletionParams): T

            /**
             * Maps an unknown variant of [Params] to a value of type [T].
             *
             * An instance of [Params] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws BraintrustInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown Params: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Params>(Params::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Params {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<OpenAIModelParams>()) { it.validate() }
                    ?.let {
                        return Params(openaiModel = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<AnthropicModelParams>()) { it.validate() }
                    ?.let {
                        return Params(anthropicModel = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<GoogleModelParams>()) { it.validate() }
                    ?.let {
                        return Params(googleModel = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<WindowAiModelParams>()) { it.validate() }
                    ?.let {
                        return Params(windowAiModel = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<JsCompletionParams>()) { it.validate() }
                    ?.let {
                        return Params(jsCompletion = it, _json = json)
                    }

                return Params(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Params>(Params::class) {

            override fun serialize(
                value: Params,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.openaiModel != null -> generator.writeObject(value.openaiModel)
                    value.anthropicModel != null -> generator.writeObject(value.anthropicModel)
                    value.googleModel != null -> generator.writeObject(value.googleModel)
                    value.windowAiModel != null -> generator.writeObject(value.windowAiModel)
                    value.jsCompletion != null -> generator.writeObject(value.jsCompletion)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Params")
                }
            }
        }

        @NoAutoDetect
        class OpenAIModelParams
        @JsonCreator
        private constructor(
            @JsonProperty("frequency_penalty")
            @ExcludeMissing
            private val frequencyPenalty: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("function_call")
            @ExcludeMissing
            private val functionCall: JsonField<FunctionCall> = JsonMissing.of(),
            @JsonProperty("max_completion_tokens")
            @ExcludeMissing
            private val maxCompletionTokens: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("max_tokens")
            @ExcludeMissing
            private val maxTokens: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("n") @ExcludeMissing private val n: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("presence_penalty")
            @ExcludeMissing
            private val presencePenalty: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("reasoning_effort")
            @ExcludeMissing
            private val reasoningEffort: JsonField<ReasoningEffort> = JsonMissing.of(),
            @JsonProperty("response_format")
            @ExcludeMissing
            private val responseFormat: JsonField<ResponseFormat> = JsonMissing.of(),
            @JsonProperty("stop")
            @ExcludeMissing
            private val stop: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("temperature")
            @ExcludeMissing
            private val temperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tool_choice")
            @ExcludeMissing
            private val toolChoice: JsonField<ToolChoice> = JsonMissing.of(),
            @JsonProperty("top_p")
            @ExcludeMissing
            private val topP: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("use_cache")
            @ExcludeMissing
            private val useCache: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun frequencyPenalty(): Optional<Double> =
                Optional.ofNullable(frequencyPenalty.getNullable("frequency_penalty"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun functionCall(): Optional<FunctionCall> =
                Optional.ofNullable(functionCall.getNullable("function_call"))

            /**
             * The successor to max_tokens
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun maxCompletionTokens(): Optional<Double> =
                Optional.ofNullable(maxCompletionTokens.getNullable("max_completion_tokens"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun maxTokens(): Optional<Double> =
                Optional.ofNullable(maxTokens.getNullable("max_tokens"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun n(): Optional<Double> = Optional.ofNullable(n.getNullable("n"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun presencePenalty(): Optional<Double> =
                Optional.ofNullable(presencePenalty.getNullable("presence_penalty"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun reasoningEffort(): Optional<ReasoningEffort> =
                Optional.ofNullable(reasoningEffort.getNullable("reasoning_effort"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun responseFormat(): Optional<ResponseFormat> =
                Optional.ofNullable(responseFormat.getNullable("response_format"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun stop(): Optional<List<String>> = Optional.ofNullable(stop.getNullable("stop"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun temperature(): Optional<Double> =
                Optional.ofNullable(temperature.getNullable("temperature"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun toolChoice(): Optional<ToolChoice> =
                Optional.ofNullable(toolChoice.getNullable("tool_choice"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun topP(): Optional<Double> = Optional.ofNullable(topP.getNullable("top_p"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun useCache(): Optional<Boolean> =
                Optional.ofNullable(useCache.getNullable("use_cache"))

            /**
             * Returns the raw JSON value of [frequencyPenalty].
             *
             * Unlike [frequencyPenalty], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("frequency_penalty")
            @ExcludeMissing
            fun _frequencyPenalty(): JsonField<Double> = frequencyPenalty

            /**
             * Returns the raw JSON value of [functionCall].
             *
             * Unlike [functionCall], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("function_call")
            @ExcludeMissing
            fun _functionCall(): JsonField<FunctionCall> = functionCall

            /**
             * Returns the raw JSON value of [maxCompletionTokens].
             *
             * Unlike [maxCompletionTokens], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_completion_tokens")
            @ExcludeMissing
            fun _maxCompletionTokens(): JsonField<Double> = maxCompletionTokens

            /**
             * Returns the raw JSON value of [maxTokens].
             *
             * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("max_tokens")
            @ExcludeMissing
            fun _maxTokens(): JsonField<Double> = maxTokens

            /**
             * Returns the raw JSON value of [n].
             *
             * Unlike [n], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("n") @ExcludeMissing fun _n(): JsonField<Double> = n

            /**
             * Returns the raw JSON value of [presencePenalty].
             *
             * Unlike [presencePenalty], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("presence_penalty")
            @ExcludeMissing
            fun _presencePenalty(): JsonField<Double> = presencePenalty

            /**
             * Returns the raw JSON value of [reasoningEffort].
             *
             * Unlike [reasoningEffort], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("reasoning_effort")
            @ExcludeMissing
            fun _reasoningEffort(): JsonField<ReasoningEffort> = reasoningEffort

            /**
             * Returns the raw JSON value of [responseFormat].
             *
             * Unlike [responseFormat], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("response_format")
            @ExcludeMissing
            fun _responseFormat(): JsonField<ResponseFormat> = responseFormat

            /**
             * Returns the raw JSON value of [stop].
             *
             * Unlike [stop], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("stop") @ExcludeMissing fun _stop(): JsonField<List<String>> = stop

            /**
             * Returns the raw JSON value of [temperature].
             *
             * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("temperature")
            @ExcludeMissing
            fun _temperature(): JsonField<Double> = temperature

            /**
             * Returns the raw JSON value of [toolChoice].
             *
             * Unlike [toolChoice], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tool_choice")
            @ExcludeMissing
            fun _toolChoice(): JsonField<ToolChoice> = toolChoice

            /**
             * Returns the raw JSON value of [topP].
             *
             * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("top_p") @ExcludeMissing fun _topP(): JsonField<Double> = topP

            /**
             * Returns the raw JSON value of [useCache].
             *
             * Unlike [useCache], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("use_cache")
            @ExcludeMissing
            fun _useCache(): JsonField<Boolean> = useCache

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): OpenAIModelParams = apply {
                if (validated) {
                    return@apply
                }

                frequencyPenalty()
                functionCall().ifPresent { it.validate() }
                maxCompletionTokens()
                maxTokens()
                n()
                presencePenalty()
                reasoningEffort()
                responseFormat().ifPresent { it.validate() }
                stop()
                temperature()
                toolChoice().ifPresent { it.validate() }
                topP()
                useCache()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [OpenAIModelParams].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OpenAIModelParams]. */
            class Builder internal constructor() {

                private var frequencyPenalty: JsonField<Double> = JsonMissing.of()
                private var functionCall: JsonField<FunctionCall> = JsonMissing.of()
                private var maxCompletionTokens: JsonField<Double> = JsonMissing.of()
                private var maxTokens: JsonField<Double> = JsonMissing.of()
                private var n: JsonField<Double> = JsonMissing.of()
                private var presencePenalty: JsonField<Double> = JsonMissing.of()
                private var reasoningEffort: JsonField<ReasoningEffort> = JsonMissing.of()
                private var responseFormat: JsonField<ResponseFormat> = JsonMissing.of()
                private var stop: JsonField<MutableList<String>>? = null
                private var temperature: JsonField<Double> = JsonMissing.of()
                private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
                private var topP: JsonField<Double> = JsonMissing.of()
                private var useCache: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(openaiModelParams: OpenAIModelParams) = apply {
                    frequencyPenalty = openaiModelParams.frequencyPenalty
                    functionCall = openaiModelParams.functionCall
                    maxCompletionTokens = openaiModelParams.maxCompletionTokens
                    maxTokens = openaiModelParams.maxTokens
                    n = openaiModelParams.n
                    presencePenalty = openaiModelParams.presencePenalty
                    reasoningEffort = openaiModelParams.reasoningEffort
                    responseFormat = openaiModelParams.responseFormat
                    stop = openaiModelParams.stop.map { it.toMutableList() }
                    temperature = openaiModelParams.temperature
                    toolChoice = openaiModelParams.toolChoice
                    topP = openaiModelParams.topP
                    useCache = openaiModelParams.useCache
                    additionalProperties = openaiModelParams.additionalProperties.toMutableMap()
                }

                fun frequencyPenalty(frequencyPenalty: Double) =
                    frequencyPenalty(JsonField.of(frequencyPenalty))

                /**
                 * Sets [Builder.frequencyPenalty] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.frequencyPenalty] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun frequencyPenalty(frequencyPenalty: JsonField<Double>) = apply {
                    this.frequencyPenalty = frequencyPenalty
                }

                fun functionCall(functionCall: FunctionCall) =
                    functionCall(JsonField.of(functionCall))

                /**
                 * Sets [Builder.functionCall] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.functionCall] with a well-typed [FunctionCall]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun functionCall(functionCall: JsonField<FunctionCall>) = apply {
                    this.functionCall = functionCall
                }

                /**
                 * Alias for calling [functionCall] with
                 * `FunctionCall.ofUnionMember0(unionMember0)`.
                 */
                fun functionCall(unionMember0: FunctionCall.UnionMember0) =
                    functionCall(FunctionCall.ofUnionMember0(unionMember0))

                /** Alias for calling [functionCall] with `FunctionCall.ofFunction(function)`. */
                fun functionCall(function: FunctionCall.Function) =
                    functionCall(FunctionCall.ofFunction(function))

                /** The successor to max_tokens */
                fun maxCompletionTokens(maxCompletionTokens: Double) =
                    maxCompletionTokens(JsonField.of(maxCompletionTokens))

                /**
                 * Sets [Builder.maxCompletionTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxCompletionTokens] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxCompletionTokens(maxCompletionTokens: JsonField<Double>) = apply {
                    this.maxCompletionTokens = maxCompletionTokens
                }

                fun maxTokens(maxTokens: Double) = maxTokens(JsonField.of(maxTokens))

                /**
                 * Sets [Builder.maxTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxTokens] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxTokens(maxTokens: JsonField<Double>) = apply { this.maxTokens = maxTokens }

                fun n(n: Double) = n(JsonField.of(n))

                /**
                 * Sets [Builder.n] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.n] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun n(n: JsonField<Double>) = apply { this.n = n }

                fun presencePenalty(presencePenalty: Double) =
                    presencePenalty(JsonField.of(presencePenalty))

                /**
                 * Sets [Builder.presencePenalty] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.presencePenalty] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun presencePenalty(presencePenalty: JsonField<Double>) = apply {
                    this.presencePenalty = presencePenalty
                }

                fun reasoningEffort(reasoningEffort: ReasoningEffort) =
                    reasoningEffort(JsonField.of(reasoningEffort))

                /**
                 * Sets [Builder.reasoningEffort] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reasoningEffort] with a well-typed
                 * [ReasoningEffort] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun reasoningEffort(reasoningEffort: JsonField<ReasoningEffort>) = apply {
                    this.reasoningEffort = reasoningEffort
                }

                fun responseFormat(responseFormat: ResponseFormat?) =
                    responseFormat(JsonField.ofNullable(responseFormat))

                /**
                 * Alias for calling [Builder.responseFormat] with `responseFormat.orElse(null)`.
                 */
                fun responseFormat(responseFormat: Optional<ResponseFormat>) =
                    responseFormat(responseFormat.getOrNull())

                /**
                 * Sets [Builder.responseFormat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.responseFormat] with a well-typed
                 * [ResponseFormat] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
                    this.responseFormat = responseFormat
                }

                /**
                 * Alias for calling [responseFormat] with
                 * `ResponseFormat.ofJsonObject(jsonObject)`.
                 */
                fun responseFormat(jsonObject: ResponseFormat.JsonObject) =
                    responseFormat(ResponseFormat.ofJsonObject(jsonObject))

                /**
                 * Alias for calling [responseFormat] with
                 * `ResponseFormat.ofJsonSchema(jsonSchema)`.
                 */
                fun responseFormat(jsonSchema: ResponseFormat.JsonSchema) =
                    responseFormat(ResponseFormat.ofJsonSchema(jsonSchema))

                /** Alias for calling [responseFormat] with `ResponseFormat.ofText(text)`. */
                fun responseFormat(text: ResponseFormat.Text) =
                    responseFormat(ResponseFormat.ofText(text))

                fun stop(stop: List<String>) = stop(JsonField.of(stop))

                /**
                 * Sets [Builder.stop] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stop] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun stop(stop: JsonField<List<String>>) = apply {
                    this.stop = stop.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.stop].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addStop(stop: String) = apply {
                    this.stop =
                        (this.stop ?: JsonField.of(mutableListOf())).also {
                            checkKnown("stop", it).add(stop)
                        }
                }

                fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

                /**
                 * Sets [Builder.temperature] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.temperature] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun temperature(temperature: JsonField<Double>) = apply {
                    this.temperature = temperature
                }

                fun toolChoice(toolChoice: ToolChoice) = toolChoice(JsonField.of(toolChoice))

                /**
                 * Sets [Builder.toolChoice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.toolChoice] with a well-typed [ToolChoice] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply {
                    this.toolChoice = toolChoice
                }

                /**
                 * Alias for calling [toolChoice] with `ToolChoice.ofUnionMember0(unionMember0)`.
                 */
                fun toolChoice(unionMember0: ToolChoice.UnionMember0) =
                    toolChoice(ToolChoice.ofUnionMember0(unionMember0))

                /** Alias for calling [toolChoice] with `ToolChoice.ofFunction(function)`. */
                fun toolChoice(function: ToolChoice.Function) =
                    toolChoice(ToolChoice.ofFunction(function))

                fun topP(topP: Double) = topP(JsonField.of(topP))

                /**
                 * Sets [Builder.topP] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.topP] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

                fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                /**
                 * Sets [Builder.useCache] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.useCache] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun useCache(useCache: JsonField<Boolean>) = apply { this.useCache = useCache }

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
                 * Returns an immutable instance of [OpenAIModelParams].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): OpenAIModelParams =
                    OpenAIModelParams(
                        frequencyPenalty,
                        functionCall,
                        maxCompletionTokens,
                        maxTokens,
                        n,
                        presencePenalty,
                        reasoningEffort,
                        responseFormat,
                        (stop ?: JsonMissing.of()).map { it.toImmutable() },
                        temperature,
                        toolChoice,
                        topP,
                        useCache,
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(using = FunctionCall.Deserializer::class)
            @JsonSerialize(using = FunctionCall.Serializer::class)
            class FunctionCall
            private constructor(
                private val unionMember0: UnionMember0? = null,
                private val function: Function? = null,
                private val _json: JsonValue? = null,
            ) {

                fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

                fun function(): Optional<Function> = Optional.ofNullable(function)

                fun isUnionMember0(): Boolean = unionMember0 != null

                fun isFunction(): Boolean = function != null

                fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

                fun asFunction(): Function = function.getOrThrow("function")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                        function != null -> visitor.visitFunction(function)
                        else -> visitor.unknown(_json)
                    }
                }

                private var validated: Boolean = false

                fun validate(): FunctionCall = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitUnionMember0(unionMember0: UnionMember0) {}

                            override fun visitFunction(function: Function) {
                                function.validate()
                            }
                        }
                    )
                    validated = true
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FunctionCall && unionMember0 == other.unionMember0 && function == other.function /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(unionMember0, function) /* spotless:on */

                override fun toString(): String =
                    when {
                        unionMember0 != null -> "FunctionCall{unionMember0=$unionMember0}"
                        function != null -> "FunctionCall{function=$function}"
                        _json != null -> "FunctionCall{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid FunctionCall")
                    }

                companion object {

                    @JvmStatic
                    fun ofUnionMember0(unionMember0: UnionMember0) =
                        FunctionCall(unionMember0 = unionMember0)

                    @JvmStatic
                    fun ofFunction(function: Function) = FunctionCall(function = function)
                }

                /**
                 * An interface that defines how to map each variant of [FunctionCall] to a value of
                 * type [T].
                 */
                interface Visitor<out T> {

                    fun visitUnionMember0(unionMember0: UnionMember0): T

                    fun visitFunction(function: Function): T

                    /**
                     * Maps an unknown variant of [FunctionCall] to a value of type [T].
                     *
                     * An instance of [FunctionCall] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws BraintrustInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw BraintrustInvalidDataException("Unknown FunctionCall: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<FunctionCall>(FunctionCall::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): FunctionCall {
                        val json = JsonValue.fromJsonNode(node)

                        tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                            return FunctionCall(unionMember0 = it, _json = json)
                        }
                        tryDeserialize(node, jacksonTypeRef<Function>()) { it.validate() }
                            ?.let {
                                return FunctionCall(function = it, _json = json)
                            }

                        return FunctionCall(_json = json)
                    }
                }

                internal class Serializer : BaseSerializer<FunctionCall>(FunctionCall::class) {

                    override fun serialize(
                        value: FunctionCall,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                            value.function != null -> generator.writeObject(value.function)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid FunctionCall")
                        }
                    }
                }

                class UnionMember0
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

                        @JvmField val AUTO = of("auto")

                        @JvmField val NONE = of("none")

                        @JvmStatic fun of(value: String) = UnionMember0(JsonField.of(value))
                    }

                    /** An enum containing [UnionMember0]'s known values. */
                    enum class Known {
                        AUTO,
                        NONE,
                    }

                    /**
                     * An enum containing [UnionMember0]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [UnionMember0] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        AUTO,
                        NONE,
                        /**
                         * An enum member indicating that [UnionMember0] was instantiated with an
                         * unknown value.
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
                            AUTO -> Value.AUTO
                            NONE -> Value.NONE
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
                            AUTO -> Known.AUTO
                            NONE -> Known.NONE
                            else ->
                                throw BraintrustInvalidDataException("Unknown UnionMember0: $value")
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

                        return /* spotless:off */ other is UnionMember0 && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                @NoAutoDetect
                class Function
                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    private val name: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Function = apply {
                        if (validated) {
                            return@apply
                        }

                        name()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Function].
                         *
                         * The following fields are required:
                         * ```java
                         * .name()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Function]. */
                    class Builder internal constructor() {

                        private var name: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(function: Function) = apply {
                            name = function.name
                            additionalProperties = function.additionalProperties.toMutableMap()
                        }

                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Function].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .name()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Function =
                            Function(
                                checkRequired("name", name),
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Function && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Function{name=$name, additionalProperties=$additionalProperties}"
                }
            }

            class ReasoningEffort
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

                    @JvmField val LOW = of("low")

                    @JvmField val MEDIUM = of("medium")

                    @JvmField val HIGH = of("high")

                    @JvmStatic fun of(value: String) = ReasoningEffort(JsonField.of(value))
                }

                /** An enum containing [ReasoningEffort]'s known values. */
                enum class Known {
                    LOW,
                    MEDIUM,
                    HIGH,
                }

                /**
                 * An enum containing [ReasoningEffort]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ReasoningEffort] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LOW,
                    MEDIUM,
                    HIGH,
                    /**
                     * An enum member indicating that [ReasoningEffort] was instantiated with an
                     * unknown value.
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
                        LOW -> Value.LOW
                        MEDIUM -> Value.MEDIUM
                        HIGH -> Value.HIGH
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
                        LOW -> Known.LOW
                        MEDIUM -> Known.MEDIUM
                        HIGH -> Known.HIGH
                        else ->
                            throw BraintrustInvalidDataException("Unknown ReasoningEffort: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ReasoningEffort && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            @JsonDeserialize(using = ResponseFormat.Deserializer::class)
            @JsonSerialize(using = ResponseFormat.Serializer::class)
            class ResponseFormat
            private constructor(
                private val jsonObject: JsonObject? = null,
                private val jsonSchema: JsonSchema? = null,
                private val text: Text? = null,
                private val _json: JsonValue? = null,
            ) {

                fun jsonObject(): Optional<JsonObject> = Optional.ofNullable(jsonObject)

                fun jsonSchema(): Optional<JsonSchema> = Optional.ofNullable(jsonSchema)

                fun text(): Optional<Text> = Optional.ofNullable(text)

                fun isJsonObject(): Boolean = jsonObject != null

                fun isJsonSchema(): Boolean = jsonSchema != null

                fun isText(): Boolean = text != null

                fun asJsonObject(): JsonObject = jsonObject.getOrThrow("jsonObject")

                fun asJsonSchema(): JsonSchema = jsonSchema.getOrThrow("jsonSchema")

                fun asText(): Text = text.getOrThrow("text")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        jsonObject != null -> visitor.visitJsonObject(jsonObject)
                        jsonSchema != null -> visitor.visitJsonSchema(jsonSchema)
                        text != null -> visitor.visitText(text)
                        else -> visitor.unknown(_json)
                    }
                }

                private var validated: Boolean = false

                fun validate(): ResponseFormat = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitJsonObject(jsonObject: JsonObject) {
                                jsonObject.validate()
                            }

                            override fun visitJsonSchema(jsonSchema: JsonSchema) {
                                jsonSchema.validate()
                            }

                            override fun visitText(text: Text) {
                                text.validate()
                            }
                        }
                    )
                    validated = true
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ResponseFormat && jsonObject == other.jsonObject && jsonSchema == other.jsonSchema && text == other.text /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(jsonObject, jsonSchema, text) /* spotless:on */

                override fun toString(): String =
                    when {
                        jsonObject != null -> "ResponseFormat{jsonObject=$jsonObject}"
                        jsonSchema != null -> "ResponseFormat{jsonSchema=$jsonSchema}"
                        text != null -> "ResponseFormat{text=$text}"
                        _json != null -> "ResponseFormat{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid ResponseFormat")
                    }

                companion object {

                    @JvmStatic
                    fun ofJsonObject(jsonObject: JsonObject) =
                        ResponseFormat(jsonObject = jsonObject)

                    @JvmStatic
                    fun ofJsonSchema(jsonSchema: JsonSchema) =
                        ResponseFormat(jsonSchema = jsonSchema)

                    @JvmStatic fun ofText(text: Text) = ResponseFormat(text = text)
                }

                /**
                 * An interface that defines how to map each variant of [ResponseFormat] to a value
                 * of type [T].
                 */
                interface Visitor<out T> {

                    fun visitJsonObject(jsonObject: JsonObject): T

                    fun visitJsonSchema(jsonSchema: JsonSchema): T

                    fun visitText(text: Text): T

                    /**
                     * Maps an unknown variant of [ResponseFormat] to a value of type [T].
                     *
                     * An instance of [ResponseFormat] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws BraintrustInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw BraintrustInvalidDataException("Unknown ResponseFormat: $json")
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<ResponseFormat>(ResponseFormat::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): ResponseFormat {
                        val json = JsonValue.fromJsonNode(node)

                        tryDeserialize(node, jacksonTypeRef<JsonObject>()) { it.validate() }
                            ?.let {
                                return ResponseFormat(jsonObject = it, _json = json)
                            }
                        tryDeserialize(node, jacksonTypeRef<JsonSchema>()) { it.validate() }
                            ?.let {
                                return ResponseFormat(jsonSchema = it, _json = json)
                            }
                        tryDeserialize(node, jacksonTypeRef<Text>()) { it.validate() }
                            ?.let {
                                return ResponseFormat(text = it, _json = json)
                            }

                        return ResponseFormat(_json = json)
                    }
                }

                internal class Serializer : BaseSerializer<ResponseFormat>(ResponseFormat::class) {

                    override fun serialize(
                        value: ResponseFormat,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.jsonObject != null -> generator.writeObject(value.jsonObject)
                            value.jsonSchema != null -> generator.writeObject(value.jsonSchema)
                            value.text != null -> generator.writeObject(value.text)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid ResponseFormat")
                        }
                    }
                }

                @NoAutoDetect
                class JsonObject
                @JsonCreator
                private constructor(
                    @JsonProperty("type")
                    @ExcludeMissing
                    private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): JsonObject = apply {
                        if (validated) {
                            return@apply
                        }

                        type()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [JsonObject].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [JsonObject]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(jsonObject: JsonObject) = apply {
                            type = jsonObject.type
                            additionalProperties = jsonObject.additionalProperties.toMutableMap()
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [JsonObject].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): JsonObject =
                            JsonObject(
                                checkRequired("type", type),
                                additionalProperties.toImmutable(),
                            )
                    }

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val JSON_OBJECT = of("json_object")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            JSON_OBJECT
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            JSON_OBJECT,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                JSON_OBJECT -> Value.JSON_OBJECT
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value is
                         *   a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                JSON_OBJECT -> Known.JSON_OBJECT
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value
                         *   does not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                BraintrustInvalidDataException("Value is not a String")
                            }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is JsonObject && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "JsonObject{type=$type, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class JsonSchema
                @JsonCreator
                private constructor(
                    @JsonProperty("json_schema")
                    @ExcludeMissing
                    private val jsonSchema: JsonField<InnerJsonSchema> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun jsonSchema(): InnerJsonSchema = jsonSchema.getRequired("json_schema")

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * Returns the raw JSON value of [jsonSchema].
                     *
                     * Unlike [jsonSchema], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("json_schema")
                    @ExcludeMissing
                    fun _jsonSchema(): JsonField<InnerJsonSchema> = jsonSchema

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): JsonSchema = apply {
                        if (validated) {
                            return@apply
                        }

                        jsonSchema().validate()
                        type()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [JsonSchema].
                         *
                         * The following fields are required:
                         * ```java
                         * .jsonSchema()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [JsonSchema]. */
                    class Builder internal constructor() {

                        private var jsonSchema: JsonField<InnerJsonSchema>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(jsonSchema: JsonSchema) = apply {
                            this.jsonSchema = jsonSchema.jsonSchema
                            type = jsonSchema.type
                            additionalProperties = jsonSchema.additionalProperties.toMutableMap()
                        }

                        fun jsonSchema(jsonSchema: InnerJsonSchema) =
                            jsonSchema(JsonField.of(jsonSchema))

                        /**
                         * Sets [Builder.jsonSchema] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.jsonSchema] with a well-typed
                         * [InnerJsonSchema] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun jsonSchema(jsonSchema: JsonField<InnerJsonSchema>) = apply {
                            this.jsonSchema = jsonSchema
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [JsonSchema].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .jsonSchema()
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): JsonSchema =
                            JsonSchema(
                                checkRequired("jsonSchema", jsonSchema),
                                checkRequired("type", type),
                                additionalProperties.toImmutable(),
                            )
                    }

                    @NoAutoDetect
                    class InnerJsonSchema
                    @JsonCreator
                    private constructor(
                        @JsonProperty("name")
                        @ExcludeMissing
                        private val name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("description")
                        @ExcludeMissing
                        private val description: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("schema")
                        @ExcludeMissing
                        private val schema: JsonField<Schema> = JsonMissing.of(),
                        @JsonProperty("strict")
                        @ExcludeMissing
                        private val strict: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        /**
                         * @throws BraintrustInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun name(): String = name.getRequired("name")

                        /**
                         * @throws BraintrustInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun description(): Optional<String> =
                            Optional.ofNullable(description.getNullable("description"))

                        /**
                         * @throws BraintrustInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun schema(): Optional<Schema> =
                            Optional.ofNullable(schema.getNullable("schema"))

                        /**
                         * @throws BraintrustInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun strict(): Optional<Boolean> =
                            Optional.ofNullable(strict.getNullable("strict"))

                        /**
                         * Returns the raw JSON value of [name].
                         *
                         * Unlike [name], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                        /**
                         * Returns the raw JSON value of [description].
                         *
                         * Unlike [description], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("description")
                        @ExcludeMissing
                        fun _description(): JsonField<String> = description

                        /**
                         * Returns the raw JSON value of [schema].
                         *
                         * Unlike [schema], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("schema")
                        @ExcludeMissing
                        fun _schema(): JsonField<Schema> = schema

                        /**
                         * Returns the raw JSON value of [strict].
                         *
                         * Unlike [strict], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("strict")
                        @ExcludeMissing
                        fun _strict(): JsonField<Boolean> = strict

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): InnerJsonSchema = apply {
                            if (validated) {
                                return@apply
                            }

                            name()
                            description()
                            schema().ifPresent { it.validate() }
                            strict()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [InnerJsonSchema].
                             *
                             * The following fields are required:
                             * ```java
                             * .name()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [InnerJsonSchema]. */
                        class Builder internal constructor() {

                            private var name: JsonField<String>? = null
                            private var description: JsonField<String> = JsonMissing.of()
                            private var schema: JsonField<Schema> = JsonMissing.of()
                            private var strict: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(innerJsonSchema: InnerJsonSchema) = apply {
                                name = innerJsonSchema.name
                                description = innerJsonSchema.description
                                schema = innerJsonSchema.schema
                                strict = innerJsonSchema.strict
                                additionalProperties =
                                    innerJsonSchema.additionalProperties.toMutableMap()
                            }

                            fun name(name: String) = name(JsonField.of(name))

                            /**
                             * Sets [Builder.name] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.name] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun name(name: JsonField<String>) = apply { this.name = name }

                            fun description(description: String) =
                                description(JsonField.of(description))

                            /**
                             * Sets [Builder.description] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.description] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun description(description: JsonField<String>) = apply {
                                this.description = description
                            }

                            fun schema(schema: Schema) = schema(JsonField.of(schema))

                            /**
                             * Sets [Builder.schema] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.schema] with a well-typed [Schema]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun schema(schema: JsonField<Schema>) = apply { this.schema = schema }

                            /** Alias for calling [schema] with `Schema.ofObject(object_)`. */
                            fun schema(object_: Schema.Object) = schema(Schema.ofObject(object_))

                            /** Alias for calling [schema] with `Schema.ofString(string)`. */
                            fun schema(string: String) = schema(Schema.ofString(string))

                            fun strict(strict: Boolean?) = strict(JsonField.ofNullable(strict))

                            /**
                             * Alias for [Builder.strict].
                             *
                             * This unboxed primitive overload exists for backwards compatibility.
                             */
                            fun strict(strict: Boolean) = strict(strict as Boolean?)

                            /** Alias for calling [Builder.strict] with `strict.orElse(null)`. */
                            fun strict(strict: Optional<Boolean>) = strict(strict.getOrNull())

                            /**
                             * Sets [Builder.strict] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.strict] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun strict(strict: JsonField<Boolean>) = apply { this.strict = strict }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [InnerJsonSchema].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .name()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): InnerJsonSchema =
                                InnerJsonSchema(
                                    checkRequired("name", name),
                                    description,
                                    schema,
                                    strict,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        @JsonDeserialize(using = Schema.Deserializer::class)
                        @JsonSerialize(using = Schema.Serializer::class)
                        class Schema
                        private constructor(
                            private val object_: Object? = null,
                            private val string: String? = null,
                            private val _json: JsonValue? = null,
                        ) {

                            fun object_(): Optional<Object> = Optional.ofNullable(object_)

                            fun string(): Optional<String> = Optional.ofNullable(string)

                            fun isObject(): Boolean = object_ != null

                            fun isString(): Boolean = string != null

                            fun asObject(): Object = object_.getOrThrow("object_")

                            fun asString(): String = string.getOrThrow("string")

                            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                            fun <T> accept(visitor: Visitor<T>): T {
                                return when {
                                    object_ != null -> visitor.visitObject(object_)
                                    string != null -> visitor.visitString(string)
                                    else -> visitor.unknown(_json)
                                }
                            }

                            private var validated: Boolean = false

                            fun validate(): Schema = apply {
                                if (validated) {
                                    return@apply
                                }

                                accept(
                                    object : Visitor<Unit> {
                                        override fun visitObject(object_: Object) {
                                            object_.validate()
                                        }

                                        override fun visitString(string: String) {}
                                    }
                                )
                                validated = true
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Schema && object_ == other.object_ && string == other.string /* spotless:on */
                            }

                            override fun hashCode(): Int = /* spotless:off */ Objects.hash(object_, string) /* spotless:on */

                            override fun toString(): String =
                                when {
                                    object_ != null -> "Schema{object_=$object_}"
                                    string != null -> "Schema{string=$string}"
                                    _json != null -> "Schema{_unknown=$_json}"
                                    else -> throw IllegalStateException("Invalid Schema")
                                }

                            companion object {

                                @JvmStatic fun ofObject(object_: Object) = Schema(object_ = object_)

                                @JvmStatic fun ofString(string: String) = Schema(string = string)
                            }

                            /**
                             * An interface that defines how to map each variant of [Schema] to a
                             * value of type [T].
                             */
                            interface Visitor<out T> {

                                fun visitObject(object_: Object): T

                                fun visitString(string: String): T

                                /**
                                 * Maps an unknown variant of [Schema] to a value of type [T].
                                 *
                                 * An instance of [Schema] can contain an unknown variant if it was
                                 * deserialized from data that doesn't match any known variant. For
                                 * example, if the SDK is on an older version than the API, then the
                                 * API may respond with new variants that the SDK is unaware of.
                                 *
                                 * @throws BraintrustInvalidDataException in the default
                                 *   implementation.
                                 */
                                fun unknown(json: JsonValue?): T {
                                    throw BraintrustInvalidDataException("Unknown Schema: $json")
                                }
                            }

                            internal class Deserializer : BaseDeserializer<Schema>(Schema::class) {

                                override fun ObjectCodec.deserialize(node: JsonNode): Schema {
                                    val json = JsonValue.fromJsonNode(node)

                                    tryDeserialize(node, jacksonTypeRef<Object>()) { it.validate() }
                                        ?.let {
                                            return Schema(object_ = it, _json = json)
                                        }
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        return Schema(string = it, _json = json)
                                    }

                                    return Schema(_json = json)
                                }
                            }

                            internal class Serializer : BaseSerializer<Schema>(Schema::class) {

                                override fun serialize(
                                    value: Schema,
                                    generator: JsonGenerator,
                                    provider: SerializerProvider,
                                ) {
                                    when {
                                        value.object_ != null ->
                                            generator.writeObject(value.object_)
                                        value.string != null -> generator.writeObject(value.string)
                                        value._json != null -> generator.writeObject(value._json)
                                        else -> throw IllegalStateException("Invalid Schema")
                                    }
                                }
                            }

                            @NoAutoDetect
                            class Object
                            @JsonCreator
                            private constructor(
                                @JsonAnySetter
                                private val additionalProperties: Map<String, JsonValue> =
                                    immutableEmptyMap()
                            ) {

                                @JsonAnyGetter
                                @ExcludeMissing
                                fun _additionalProperties(): Map<String, JsonValue> =
                                    additionalProperties

                                private var validated: Boolean = false

                                fun validate(): Object = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    validated = true
                                }

                                fun toBuilder() = Builder().from(this)

                                companion object {

                                    /**
                                     * Returns a mutable builder for constructing an instance of
                                     * [Object].
                                     */
                                    @JvmStatic fun builder() = Builder()
                                }

                                /** A builder for [Object]. */
                                class Builder internal constructor() {

                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    @JvmSynthetic
                                    internal fun from(object_: Object) = apply {
                                        additionalProperties =
                                            object_.additionalProperties.toMutableMap()
                                    }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [Object].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     */
                                    fun build(): Object = Object(additionalProperties.toImmutable())
                                }

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return /* spotless:off */ other is Object && additionalProperties == other.additionalProperties /* spotless:on */
                                }

                                /* spotless:off */
                                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                                /* spotless:on */

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "Object{additionalProperties=$additionalProperties}"
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is InnerJsonSchema && name == other.name && description == other.description && schema == other.schema && strict == other.strict && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(name, description, schema, strict, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "InnerJsonSchema{name=$name, description=$description, schema=$schema, strict=$strict, additionalProperties=$additionalProperties}"
                    }

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val JSON_SCHEMA = of("json_schema")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            JSON_SCHEMA
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            JSON_SCHEMA,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                JSON_SCHEMA -> Value.JSON_SCHEMA
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value is
                         *   a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                JSON_SCHEMA -> Known.JSON_SCHEMA
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value
                         *   does not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                BraintrustInvalidDataException("Value is not a String")
                            }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is JsonSchema && jsonSchema == other.jsonSchema && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(jsonSchema, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "JsonSchema{jsonSchema=$jsonSchema, type=$type, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class Text
                @JsonCreator
                private constructor(
                    @JsonProperty("type")
                    @ExcludeMissing
                    private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Text = apply {
                        if (validated) {
                            return@apply
                        }

                        type()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Text].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Text]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(text: Text) = apply {
                            type = text.type
                            additionalProperties = text.additionalProperties.toMutableMap()
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Text].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Text =
                            Text(checkRequired("type", type), additionalProperties.toImmutable())
                    }

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val TEXT = of("text")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            TEXT
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            TEXT,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                TEXT -> Value.TEXT
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value is
                         *   a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                TEXT -> Known.TEXT
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value
                         *   does not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                BraintrustInvalidDataException("Value is not a String")
                            }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Text && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Text{type=$type, additionalProperties=$additionalProperties}"
                }
            }

            @JsonDeserialize(using = ToolChoice.Deserializer::class)
            @JsonSerialize(using = ToolChoice.Serializer::class)
            class ToolChoice
            private constructor(
                private val unionMember0: UnionMember0? = null,
                private val function: Function? = null,
                private val _json: JsonValue? = null,
            ) {

                fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

                fun function(): Optional<Function> = Optional.ofNullable(function)

                fun isUnionMember0(): Boolean = unionMember0 != null

                fun isFunction(): Boolean = function != null

                fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

                fun asFunction(): Function = function.getOrThrow("function")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                        function != null -> visitor.visitFunction(function)
                        else -> visitor.unknown(_json)
                    }
                }

                private var validated: Boolean = false

                fun validate(): ToolChoice = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitUnionMember0(unionMember0: UnionMember0) {}

                            override fun visitFunction(function: Function) {
                                function.validate()
                            }
                        }
                    )
                    validated = true
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ToolChoice && unionMember0 == other.unionMember0 && function == other.function /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(unionMember0, function) /* spotless:on */

                override fun toString(): String =
                    when {
                        unionMember0 != null -> "ToolChoice{unionMember0=$unionMember0}"
                        function != null -> "ToolChoice{function=$function}"
                        _json != null -> "ToolChoice{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid ToolChoice")
                    }

                companion object {

                    @JvmStatic
                    fun ofUnionMember0(unionMember0: UnionMember0) =
                        ToolChoice(unionMember0 = unionMember0)

                    @JvmStatic fun ofFunction(function: Function) = ToolChoice(function = function)
                }

                /**
                 * An interface that defines how to map each variant of [ToolChoice] to a value of
                 * type [T].
                 */
                interface Visitor<out T> {

                    fun visitUnionMember0(unionMember0: UnionMember0): T

                    fun visitFunction(function: Function): T

                    /**
                     * Maps an unknown variant of [ToolChoice] to a value of type [T].
                     *
                     * An instance of [ToolChoice] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws BraintrustInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw BraintrustInvalidDataException("Unknown ToolChoice: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<ToolChoice>(ToolChoice::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): ToolChoice {
                        val json = JsonValue.fromJsonNode(node)

                        tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                            return ToolChoice(unionMember0 = it, _json = json)
                        }
                        tryDeserialize(node, jacksonTypeRef<Function>()) { it.validate() }
                            ?.let {
                                return ToolChoice(function = it, _json = json)
                            }

                        return ToolChoice(_json = json)
                    }
                }

                internal class Serializer : BaseSerializer<ToolChoice>(ToolChoice::class) {

                    override fun serialize(
                        value: ToolChoice,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                            value.function != null -> generator.writeObject(value.function)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid ToolChoice")
                        }
                    }
                }

                class UnionMember0
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

                        @JvmField val AUTO = of("auto")

                        @JvmField val NONE = of("none")

                        @JvmField val REQUIRED = of("required")

                        @JvmStatic fun of(value: String) = UnionMember0(JsonField.of(value))
                    }

                    /** An enum containing [UnionMember0]'s known values. */
                    enum class Known {
                        AUTO,
                        NONE,
                        REQUIRED,
                    }

                    /**
                     * An enum containing [UnionMember0]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [UnionMember0] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        AUTO,
                        NONE,
                        REQUIRED,
                        /**
                         * An enum member indicating that [UnionMember0] was instantiated with an
                         * unknown value.
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
                            AUTO -> Value.AUTO
                            NONE -> Value.NONE
                            REQUIRED -> Value.REQUIRED
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
                            AUTO -> Known.AUTO
                            NONE -> Known.NONE
                            REQUIRED -> Known.REQUIRED
                            else ->
                                throw BraintrustInvalidDataException("Unknown UnionMember0: $value")
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

                        return /* spotless:off */ other is UnionMember0 && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                @NoAutoDetect
                class Function
                @JsonCreator
                private constructor(
                    @JsonProperty("function")
                    @ExcludeMissing
                    private val function: JsonField<InnerFunction> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun function(): InnerFunction = function.getRequired("function")

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * Returns the raw JSON value of [function].
                     *
                     * Unlike [function], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("function")
                    @ExcludeMissing
                    fun _function(): JsonField<InnerFunction> = function

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Function = apply {
                        if (validated) {
                            return@apply
                        }

                        function().validate()
                        type()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Function].
                         *
                         * The following fields are required:
                         * ```java
                         * .function()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Function]. */
                    class Builder internal constructor() {

                        private var function: JsonField<InnerFunction>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(function: Function) = apply {
                            this.function = function.function
                            type = function.type
                            additionalProperties = function.additionalProperties.toMutableMap()
                        }

                        fun function(function: InnerFunction) = function(JsonField.of(function))

                        /**
                         * Sets [Builder.function] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.function] with a well-typed
                         * [InnerFunction] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun function(function: JsonField<InnerFunction>) = apply {
                            this.function = function
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Function].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .function()
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Function =
                            Function(
                                checkRequired("function", function),
                                checkRequired("type", type),
                                additionalProperties.toImmutable(),
                            )
                    }

                    @NoAutoDetect
                    class InnerFunction
                    @JsonCreator
                    private constructor(
                        @JsonProperty("name")
                        @ExcludeMissing
                        private val name: JsonField<String> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        /**
                         * @throws BraintrustInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun name(): String = name.getRequired("name")

                        /**
                         * Returns the raw JSON value of [name].
                         *
                         * Unlike [name], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): InnerFunction = apply {
                            if (validated) {
                                return@apply
                            }

                            name()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [InnerFunction].
                             *
                             * The following fields are required:
                             * ```java
                             * .name()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [InnerFunction]. */
                        class Builder internal constructor() {

                            private var name: JsonField<String>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(innerFunction: InnerFunction) = apply {
                                name = innerFunction.name
                                additionalProperties =
                                    innerFunction.additionalProperties.toMutableMap()
                            }

                            fun name(name: String) = name(JsonField.of(name))

                            /**
                             * Sets [Builder.name] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.name] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun name(name: JsonField<String>) = apply { this.name = name }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [InnerFunction].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .name()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): InnerFunction =
                                InnerFunction(
                                    checkRequired("name", name),
                                    additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is InnerFunction && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "InnerFunction{name=$name, additionalProperties=$additionalProperties}"
                    }

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val FUNCTION = of("function")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            FUNCTION
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            FUNCTION,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                FUNCTION -> Value.FUNCTION
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value is
                         *   a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                FUNCTION -> Known.FUNCTION
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value
                         *   does not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                BraintrustInvalidDataException("Value is not a String")
                            }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Function && function == other.function && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(function, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Function{function=$function, type=$type, additionalProperties=$additionalProperties}"
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OpenAIModelParams && frequencyPenalty == other.frequencyPenalty && functionCall == other.functionCall && maxCompletionTokens == other.maxCompletionTokens && maxTokens == other.maxTokens && n == other.n && presencePenalty == other.presencePenalty && reasoningEffort == other.reasoningEffort && responseFormat == other.responseFormat && stop == other.stop && temperature == other.temperature && toolChoice == other.toolChoice && topP == other.topP && useCache == other.useCache && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(frequencyPenalty, functionCall, maxCompletionTokens, maxTokens, n, presencePenalty, reasoningEffort, responseFormat, stop, temperature, toolChoice, topP, useCache, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OpenAIModelParams{frequencyPenalty=$frequencyPenalty, functionCall=$functionCall, maxCompletionTokens=$maxCompletionTokens, maxTokens=$maxTokens, n=$n, presencePenalty=$presencePenalty, reasoningEffort=$reasoningEffort, responseFormat=$responseFormat, stop=$stop, temperature=$temperature, toolChoice=$toolChoice, topP=$topP, useCache=$useCache, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class AnthropicModelParams
        @JsonCreator
        private constructor(
            @JsonProperty("max_tokens")
            @ExcludeMissing
            private val maxTokens: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("temperature")
            @ExcludeMissing
            private val temperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("max_tokens_to_sample")
            @ExcludeMissing
            private val maxTokensToSample: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("stop_sequences")
            @ExcludeMissing
            private val stopSequences: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("top_k")
            @ExcludeMissing
            private val topK: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("top_p")
            @ExcludeMissing
            private val topP: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("use_cache")
            @ExcludeMissing
            private val useCache: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun maxTokens(): Double = maxTokens.getRequired("max_tokens")

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun temperature(): Double = temperature.getRequired("temperature")

            /**
             * This is a legacy parameter that should not be used.
             *
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun maxTokensToSample(): Optional<Double> =
                Optional.ofNullable(maxTokensToSample.getNullable("max_tokens_to_sample"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun stopSequences(): Optional<List<String>> =
                Optional.ofNullable(stopSequences.getNullable("stop_sequences"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun topK(): Optional<Double> = Optional.ofNullable(topK.getNullable("top_k"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun topP(): Optional<Double> = Optional.ofNullable(topP.getNullable("top_p"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun useCache(): Optional<Boolean> =
                Optional.ofNullable(useCache.getNullable("use_cache"))

            /**
             * Returns the raw JSON value of [maxTokens].
             *
             * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("max_tokens")
            @ExcludeMissing
            fun _maxTokens(): JsonField<Double> = maxTokens

            /**
             * Returns the raw JSON value of [temperature].
             *
             * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("temperature")
            @ExcludeMissing
            fun _temperature(): JsonField<Double> = temperature

            /**
             * Returns the raw JSON value of [maxTokensToSample].
             *
             * Unlike [maxTokensToSample], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_tokens_to_sample")
            @ExcludeMissing
            fun _maxTokensToSample(): JsonField<Double> = maxTokensToSample

            /**
             * Returns the raw JSON value of [stopSequences].
             *
             * Unlike [stopSequences], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("stop_sequences")
            @ExcludeMissing
            fun _stopSequences(): JsonField<List<String>> = stopSequences

            /**
             * Returns the raw JSON value of [topK].
             *
             * Unlike [topK], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("top_k") @ExcludeMissing fun _topK(): JsonField<Double> = topK

            /**
             * Returns the raw JSON value of [topP].
             *
             * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("top_p") @ExcludeMissing fun _topP(): JsonField<Double> = topP

            /**
             * Returns the raw JSON value of [useCache].
             *
             * Unlike [useCache], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("use_cache")
            @ExcludeMissing
            fun _useCache(): JsonField<Boolean> = useCache

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AnthropicModelParams = apply {
                if (validated) {
                    return@apply
                }

                maxTokens()
                temperature()
                maxTokensToSample()
                stopSequences()
                topK()
                topP()
                useCache()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [AnthropicModelParams].
                 *
                 * The following fields are required:
                 * ```java
                 * .maxTokens()
                 * .temperature()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AnthropicModelParams]. */
            class Builder internal constructor() {

                private var maxTokens: JsonField<Double>? = null
                private var temperature: JsonField<Double>? = null
                private var maxTokensToSample: JsonField<Double> = JsonMissing.of()
                private var stopSequences: JsonField<MutableList<String>>? = null
                private var topK: JsonField<Double> = JsonMissing.of()
                private var topP: JsonField<Double> = JsonMissing.of()
                private var useCache: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(anthropicModelParams: AnthropicModelParams) = apply {
                    maxTokens = anthropicModelParams.maxTokens
                    temperature = anthropicModelParams.temperature
                    maxTokensToSample = anthropicModelParams.maxTokensToSample
                    stopSequences = anthropicModelParams.stopSequences.map { it.toMutableList() }
                    topK = anthropicModelParams.topK
                    topP = anthropicModelParams.topP
                    useCache = anthropicModelParams.useCache
                    additionalProperties = anthropicModelParams.additionalProperties.toMutableMap()
                }

                fun maxTokens(maxTokens: Double) = maxTokens(JsonField.of(maxTokens))

                /**
                 * Sets [Builder.maxTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxTokens] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxTokens(maxTokens: JsonField<Double>) = apply { this.maxTokens = maxTokens }

                fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

                /**
                 * Sets [Builder.temperature] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.temperature] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun temperature(temperature: JsonField<Double>) = apply {
                    this.temperature = temperature
                }

                /** This is a legacy parameter that should not be used. */
                fun maxTokensToSample(maxTokensToSample: Double) =
                    maxTokensToSample(JsonField.of(maxTokensToSample))

                /**
                 * Sets [Builder.maxTokensToSample] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxTokensToSample] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxTokensToSample(maxTokensToSample: JsonField<Double>) = apply {
                    this.maxTokensToSample = maxTokensToSample
                }

                fun stopSequences(stopSequences: List<String>) =
                    stopSequences(JsonField.of(stopSequences))

                /**
                 * Sets [Builder.stopSequences] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stopSequences] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun stopSequences(stopSequences: JsonField<List<String>>) = apply {
                    this.stopSequences = stopSequences.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [stopSequences].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addStopSequence(stopSequence: String) = apply {
                    stopSequences =
                        (stopSequences ?: JsonField.of(mutableListOf())).also {
                            checkKnown("stopSequences", it).add(stopSequence)
                        }
                }

                fun topK(topK: Double) = topK(JsonField.of(topK))

                /**
                 * Sets [Builder.topK] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.topK] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun topK(topK: JsonField<Double>) = apply { this.topK = topK }

                fun topP(topP: Double) = topP(JsonField.of(topP))

                /**
                 * Sets [Builder.topP] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.topP] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

                fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                /**
                 * Sets [Builder.useCache] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.useCache] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun useCache(useCache: JsonField<Boolean>) = apply { this.useCache = useCache }

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
                 * Returns an immutable instance of [AnthropicModelParams].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .maxTokens()
                 * .temperature()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AnthropicModelParams =
                    AnthropicModelParams(
                        checkRequired("maxTokens", maxTokens),
                        checkRequired("temperature", temperature),
                        maxTokensToSample,
                        (stopSequences ?: JsonMissing.of()).map { it.toImmutable() },
                        topK,
                        topP,
                        useCache,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AnthropicModelParams && maxTokens == other.maxTokens && temperature == other.temperature && maxTokensToSample == other.maxTokensToSample && stopSequences == other.stopSequences && topK == other.topK && topP == other.topP && useCache == other.useCache && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(maxTokens, temperature, maxTokensToSample, stopSequences, topK, topP, useCache, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AnthropicModelParams{maxTokens=$maxTokens, temperature=$temperature, maxTokensToSample=$maxTokensToSample, stopSequences=$stopSequences, topK=$topK, topP=$topP, useCache=$useCache, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class GoogleModelParams
        @JsonCreator
        private constructor(
            @JsonProperty("maxOutputTokens")
            @ExcludeMissing
            private val maxOutputTokens: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("temperature")
            @ExcludeMissing
            private val temperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("topK")
            @ExcludeMissing
            private val topK: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("topP")
            @ExcludeMissing
            private val topP: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("use_cache")
            @ExcludeMissing
            private val useCache: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun maxOutputTokens(): Optional<Double> =
                Optional.ofNullable(maxOutputTokens.getNullable("maxOutputTokens"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun temperature(): Optional<Double> =
                Optional.ofNullable(temperature.getNullable("temperature"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun topK(): Optional<Double> = Optional.ofNullable(topK.getNullable("topK"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun topP(): Optional<Double> = Optional.ofNullable(topP.getNullable("topP"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun useCache(): Optional<Boolean> =
                Optional.ofNullable(useCache.getNullable("use_cache"))

            /**
             * Returns the raw JSON value of [maxOutputTokens].
             *
             * Unlike [maxOutputTokens], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("maxOutputTokens")
            @ExcludeMissing
            fun _maxOutputTokens(): JsonField<Double> = maxOutputTokens

            /**
             * Returns the raw JSON value of [temperature].
             *
             * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("temperature")
            @ExcludeMissing
            fun _temperature(): JsonField<Double> = temperature

            /**
             * Returns the raw JSON value of [topK].
             *
             * Unlike [topK], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("topK") @ExcludeMissing fun _topK(): JsonField<Double> = topK

            /**
             * Returns the raw JSON value of [topP].
             *
             * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("topP") @ExcludeMissing fun _topP(): JsonField<Double> = topP

            /**
             * Returns the raw JSON value of [useCache].
             *
             * Unlike [useCache], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("use_cache")
            @ExcludeMissing
            fun _useCache(): JsonField<Boolean> = useCache

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): GoogleModelParams = apply {
                if (validated) {
                    return@apply
                }

                maxOutputTokens()
                temperature()
                topK()
                topP()
                useCache()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [GoogleModelParams].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [GoogleModelParams]. */
            class Builder internal constructor() {

                private var maxOutputTokens: JsonField<Double> = JsonMissing.of()
                private var temperature: JsonField<Double> = JsonMissing.of()
                private var topK: JsonField<Double> = JsonMissing.of()
                private var topP: JsonField<Double> = JsonMissing.of()
                private var useCache: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(googleModelParams: GoogleModelParams) = apply {
                    maxOutputTokens = googleModelParams.maxOutputTokens
                    temperature = googleModelParams.temperature
                    topK = googleModelParams.topK
                    topP = googleModelParams.topP
                    useCache = googleModelParams.useCache
                    additionalProperties = googleModelParams.additionalProperties.toMutableMap()
                }

                fun maxOutputTokens(maxOutputTokens: Double) =
                    maxOutputTokens(JsonField.of(maxOutputTokens))

                /**
                 * Sets [Builder.maxOutputTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxOutputTokens] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxOutputTokens(maxOutputTokens: JsonField<Double>) = apply {
                    this.maxOutputTokens = maxOutputTokens
                }

                fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

                /**
                 * Sets [Builder.temperature] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.temperature] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun temperature(temperature: JsonField<Double>) = apply {
                    this.temperature = temperature
                }

                fun topK(topK: Double) = topK(JsonField.of(topK))

                /**
                 * Sets [Builder.topK] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.topK] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun topK(topK: JsonField<Double>) = apply { this.topK = topK }

                fun topP(topP: Double) = topP(JsonField.of(topP))

                /**
                 * Sets [Builder.topP] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.topP] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

                fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                /**
                 * Sets [Builder.useCache] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.useCache] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun useCache(useCache: JsonField<Boolean>) = apply { this.useCache = useCache }

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
                 * Returns an immutable instance of [GoogleModelParams].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): GoogleModelParams =
                    GoogleModelParams(
                        maxOutputTokens,
                        temperature,
                        topK,
                        topP,
                        useCache,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GoogleModelParams && maxOutputTokens == other.maxOutputTokens && temperature == other.temperature && topK == other.topK && topP == other.topP && useCache == other.useCache && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(maxOutputTokens, temperature, topK, topP, useCache, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GoogleModelParams{maxOutputTokens=$maxOutputTokens, temperature=$temperature, topK=$topK, topP=$topP, useCache=$useCache, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class WindowAiModelParams
        @JsonCreator
        private constructor(
            @JsonProperty("temperature")
            @ExcludeMissing
            private val temperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("topK")
            @ExcludeMissing
            private val topK: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("use_cache")
            @ExcludeMissing
            private val useCache: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun temperature(): Optional<Double> =
                Optional.ofNullable(temperature.getNullable("temperature"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun topK(): Optional<Double> = Optional.ofNullable(topK.getNullable("topK"))

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun useCache(): Optional<Boolean> =
                Optional.ofNullable(useCache.getNullable("use_cache"))

            /**
             * Returns the raw JSON value of [temperature].
             *
             * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("temperature")
            @ExcludeMissing
            fun _temperature(): JsonField<Double> = temperature

            /**
             * Returns the raw JSON value of [topK].
             *
             * Unlike [topK], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("topK") @ExcludeMissing fun _topK(): JsonField<Double> = topK

            /**
             * Returns the raw JSON value of [useCache].
             *
             * Unlike [useCache], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("use_cache")
            @ExcludeMissing
            fun _useCache(): JsonField<Boolean> = useCache

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): WindowAiModelParams = apply {
                if (validated) {
                    return@apply
                }

                temperature()
                topK()
                useCache()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [WindowAiModelParams].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WindowAiModelParams]. */
            class Builder internal constructor() {

                private var temperature: JsonField<Double> = JsonMissing.of()
                private var topK: JsonField<Double> = JsonMissing.of()
                private var useCache: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(windowAiModelParams: WindowAiModelParams) = apply {
                    temperature = windowAiModelParams.temperature
                    topK = windowAiModelParams.topK
                    useCache = windowAiModelParams.useCache
                    additionalProperties = windowAiModelParams.additionalProperties.toMutableMap()
                }

                fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

                /**
                 * Sets [Builder.temperature] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.temperature] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun temperature(temperature: JsonField<Double>) = apply {
                    this.temperature = temperature
                }

                fun topK(topK: Double) = topK(JsonField.of(topK))

                /**
                 * Sets [Builder.topK] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.topK] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun topK(topK: JsonField<Double>) = apply { this.topK = topK }

                fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                /**
                 * Sets [Builder.useCache] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.useCache] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun useCache(useCache: JsonField<Boolean>) = apply { this.useCache = useCache }

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
                 * Returns an immutable instance of [WindowAiModelParams].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): WindowAiModelParams =
                    WindowAiModelParams(
                        temperature,
                        topK,
                        useCache,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is WindowAiModelParams && temperature == other.temperature && topK == other.topK && useCache == other.useCache && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(temperature, topK, useCache, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WindowAiModelParams{temperature=$temperature, topK=$topK, useCache=$useCache, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class JsCompletionParams
        @JsonCreator
        private constructor(
            @JsonProperty("use_cache")
            @ExcludeMissing
            private val useCache: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun useCache(): Optional<Boolean> =
                Optional.ofNullable(useCache.getNullable("use_cache"))

            /**
             * Returns the raw JSON value of [useCache].
             *
             * Unlike [useCache], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("use_cache")
            @ExcludeMissing
            fun _useCache(): JsonField<Boolean> = useCache

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): JsCompletionParams = apply {
                if (validated) {
                    return@apply
                }

                useCache()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [JsCompletionParams].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [JsCompletionParams]. */
            class Builder internal constructor() {

                private var useCache: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(jsCompletionParams: JsCompletionParams) = apply {
                    useCache = jsCompletionParams.useCache
                    additionalProperties = jsCompletionParams.additionalProperties.toMutableMap()
                }

                fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                /**
                 * Sets [Builder.useCache] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.useCache] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun useCache(useCache: JsonField<Boolean>) = apply { this.useCache = useCache }

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
                 * Returns an immutable instance of [JsCompletionParams].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): JsCompletionParams =
                    JsCompletionParams(useCache, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is JsCompletionParams && useCache == other.useCache && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(useCache, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "JsCompletionParams{useCache=$useCache, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PromptOptions && model == other.model && params == other.params && position == other.position && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(model, params, position, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PromptOptions{model=$model, params=$params, position=$position, additionalProperties=$additionalProperties}"
}
