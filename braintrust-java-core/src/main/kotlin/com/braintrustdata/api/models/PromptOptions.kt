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

@JsonDeserialize(builder = PromptOptions.Builder::class)
@NoAutoDetect
class PromptOptions
private constructor(
    private val model: JsonField<String>,
    private val params: JsonField<Params>,
    private val position: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun model(): Optional<String> = Optional.ofNullable(model.getNullable("model"))

    fun params(): Optional<Params> = Optional.ofNullable(params.getNullable("params"))

    fun position(): Optional<String> = Optional.ofNullable(position.getNullable("position"))

    @JsonProperty("model") @ExcludeMissing fun _model() = model

    @JsonProperty("params") @ExcludeMissing fun _params() = params

    @JsonProperty("position") @ExcludeMissing fun _position() = position

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PromptOptions = apply {
        if (!validated) {
            model()
            params()
            position()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var model: JsonField<String> = JsonMissing.of()
        private var params: JsonField<Params> = JsonMissing.of()
        private var position: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(promptOptions: PromptOptions) = apply {
            this.model = promptOptions.model
            this.params = promptOptions.params
            this.position = promptOptions.position
            additionalProperties(promptOptions.additionalProperties)
        }

        fun model(model: String) = model(JsonField.of(model))

        @JsonProperty("model")
        @ExcludeMissing
        fun model(model: JsonField<String>) = apply { this.model = model }

        fun params(params: Params) = params(JsonField.of(params))

        @JsonProperty("params")
        @ExcludeMissing
        fun params(params: JsonField<Params>) = apply { this.params = params }

        fun position(position: String) = position(JsonField.of(position))

        @JsonProperty("position")
        @ExcludeMissing
        fun position(position: JsonField<String>) = apply { this.position = position }

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

        fun build(): PromptOptions =
            PromptOptions(
                model,
                params,
                position,
                additionalProperties.toImmutable(),
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
                openaiModelParams != null -> visitor.visitOpenAIModelParams(openaiModelParams)
                anthropicModelParams != null ->
                    visitor.visitAnthropicModelParams(anthropicModelParams)
                googleModelParams != null -> visitor.visitGoogleModelParams(googleModelParams)
                windowAiModelParams != null -> visitor.visitWindowAiModelParams(windowAiModelParams)
                jsCompletionParams != null -> visitor.visitJsCompletionParams(jsCompletionParams)
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

            return /* spotless:off */ other is Params && openaiModelParams == other.openaiModelParams && anthropicModelParams == other.anthropicModelParams && googleModelParams == other.googleModelParams && windowAiModelParams == other.windowAiModelParams && jsCompletionParams == other.jsCompletionParams /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(openaiModelParams, anthropicModelParams, googleModelParams, windowAiModelParams, jsCompletionParams) /* spotless:on */

        override fun toString(): String =
            when {
                openaiModelParams != null -> "Params{openaiModelParams=$openaiModelParams}"
                anthropicModelParams != null -> "Params{anthropicModelParams=$anthropicModelParams}"
                googleModelParams != null -> "Params{googleModelParams=$googleModelParams}"
                windowAiModelParams != null -> "Params{windowAiModelParams=$windowAiModelParams}"
                jsCompletionParams != null -> "Params{jsCompletionParams=$jsCompletionParams}"
                _json != null -> "Params{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Params")
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
                tryDeserialize(node, jacksonTypeRef<AnthropicModelParams>()) { it.validate() }
                    ?.let {
                        return Params(anthropicModelParams = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<GoogleModelParams>()) { it.validate() }
                    ?.let {
                        return Params(googleModelParams = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<WindowAiModelParams>()) { it.validate() }
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

            fun stop(): Optional<List<String>> = Optional.ofNullable(stop.getNullable("stop"))

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

            @JsonProperty("response_format") @ExcludeMissing fun _responseFormat() = responseFormat

            @JsonProperty("tool_choice") @ExcludeMissing fun _toolChoice() = toolChoice

            @JsonProperty("function_call") @ExcludeMissing fun _functionCall() = functionCall

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
                    responseFormat()
                    toolChoice()
                    functionCall()
                    n()
                    stop()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

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
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

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
                fun useCache(useCache: JsonField<Boolean>) = apply { this.useCache = useCache }

                fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

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
                fun maxTokens(maxTokens: JsonField<Double>) = apply { this.maxTokens = maxTokens }

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

                fun toolChoice(toolChoice: ToolChoice) = toolChoice(JsonField.of(toolChoice))

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
                        stop.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
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
                            throw BraintrustInvalidDataException("Unknown FunctionCall: $_json")
                        }
                        function?.validate()
                        validated = true
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FunctionCall && auto == other.auto && none == other.none && function == other.function /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(auto, none, function) /* spotless:on */

                override fun toString(): String =
                    when {
                        auto != null -> "FunctionCall{auto=$auto}"
                        none != null -> "FunctionCall{none=$none}"
                        function != null -> "FunctionCall{function=$function}"
                        _json != null -> "FunctionCall{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid FunctionCall")
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

                        return /* spotless:off */ other is Auto && value == other.value /* spotless:on */
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
                            else -> throw BraintrustInvalidDataException("Unknown Auto: $value")
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

                        return /* spotless:off */ other is None && value == other.value /* spotless:on */
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
                            else -> throw BraintrustInvalidDataException("Unknown None: $value")
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

                    fun name(): String = name.getRequired("name")

                    @JsonProperty("name") @ExcludeMissing fun _name() = name

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Function = apply {
                        if (!validated) {
                            name()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

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

                        fun build(): Function = Function(name, additionalProperties.toImmutable())
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

            @JsonDeserialize(using = ResponseFormat.Deserializer::class)
            @JsonSerialize(using = ResponseFormat.Serializer::class)
            class ResponseFormat
            private constructor(
                private val jsonObject: JsonObject? = null,
                private val jsonSchema: JsonSchema? = null,
                private val text: Text? = null,
                private val nullableVariant: NullableVariant? = null,
                private val _json: JsonValue? = null,
            ) {

                private var validated: Boolean = false

                fun jsonObject(): Optional<JsonObject> = Optional.ofNullable(jsonObject)

                fun jsonSchema(): Optional<JsonSchema> = Optional.ofNullable(jsonSchema)

                fun text(): Optional<Text> = Optional.ofNullable(text)

                fun nullableVariant(): Optional<NullableVariant> =
                    Optional.ofNullable(nullableVariant)

                fun isJsonObject(): Boolean = jsonObject != null

                fun isJsonSchema(): Boolean = jsonSchema != null

                fun isText(): Boolean = text != null

                fun isNullableVariant(): Boolean = nullableVariant != null

                fun asJsonObject(): JsonObject = jsonObject.getOrThrow("jsonObject")

                fun asJsonSchema(): JsonSchema = jsonSchema.getOrThrow("jsonSchema")

                fun asText(): Text = text.getOrThrow("text")

                fun asNullableVariant(): NullableVariant =
                    nullableVariant.getOrThrow("nullableVariant")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        jsonObject != null -> visitor.visitJsonObject(jsonObject)
                        jsonSchema != null -> visitor.visitJsonSchema(jsonSchema)
                        text != null -> visitor.visitText(text)
                        nullableVariant != null -> visitor.visitNullableVariant(nullableVariant)
                        else -> visitor.unknown(_json)
                    }
                }

                fun validate(): ResponseFormat = apply {
                    if (!validated) {
                        if (
                            jsonObject == null &&
                                jsonSchema == null &&
                                text == null &&
                                nullableVariant == null
                        ) {
                            throw BraintrustInvalidDataException("Unknown ResponseFormat: $_json")
                        }
                        jsonObject?.validate()
                        jsonSchema?.validate()
                        text?.validate()
                        nullableVariant?.validate()
                        validated = true
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ResponseFormat && jsonObject == other.jsonObject && jsonSchema == other.jsonSchema && text == other.text && nullableVariant == other.nullableVariant /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(jsonObject, jsonSchema, text, nullableVariant) /* spotless:on */

                override fun toString(): String =
                    when {
                        jsonObject != null -> "ResponseFormat{jsonObject=$jsonObject}"
                        jsonSchema != null -> "ResponseFormat{jsonSchema=$jsonSchema}"
                        text != null -> "ResponseFormat{text=$text}"
                        nullableVariant != null ->
                            "ResponseFormat{nullableVariant=$nullableVariant}"
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

                    @JvmStatic
                    fun ofNullableVariant(nullableVariant: NullableVariant) =
                        ResponseFormat(nullableVariant = nullableVariant)
                }

                interface Visitor<out T> {

                    fun visitJsonObject(jsonObject: JsonObject): T

                    fun visitJsonSchema(jsonSchema: JsonSchema): T

                    fun visitText(text: Text): T

                    fun visitNullableVariant(nullableVariant: NullableVariant): T

                    fun unknown(json: JsonValue?): T {
                        throw BraintrustInvalidDataException("Unknown ResponseFormat: $json")
                    }
                }

                class Deserializer : BaseDeserializer<ResponseFormat>(ResponseFormat::class) {

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
                        tryDeserialize(node, jacksonTypeRef<NullableVariant>()) { it.validate() }
                            ?.let {
                                return ResponseFormat(nullableVariant = it, _json = json)
                            }

                        return ResponseFormat(_json = json)
                    }
                }

                class Serializer : BaseSerializer<ResponseFormat>(ResponseFormat::class) {

                    override fun serialize(
                        value: ResponseFormat,
                        generator: JsonGenerator,
                        provider: SerializerProvider
                    ) {
                        when {
                            value.jsonObject != null -> generator.writeObject(value.jsonObject)
                            value.jsonSchema != null -> generator.writeObject(value.jsonSchema)
                            value.text != null -> generator.writeObject(value.text)
                            value.nullableVariant != null ->
                                generator.writeObject(value.nullableVariant)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid ResponseFormat")
                        }
                    }
                }

                @JsonDeserialize(builder = JsonObject.Builder::class)
                @NoAutoDetect
                class JsonObject
                private constructor(
                    private val type: JsonField<Type>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): JsonObject = apply {
                        if (!validated) {
                            type()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(jsonObject: JsonObject) = apply {
                            this.type = jsonObject.type
                            additionalProperties(jsonObject.additionalProperties)
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

                        fun build(): JsonObject =
                            JsonObject(type, additionalProperties.toImmutable())
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

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
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
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
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

                @JsonDeserialize(builder = JsonSchema.Builder::class)
                @NoAutoDetect
                class JsonSchema
                private constructor(
                    private val type: JsonField<Type>,
                    private val jsonSchema: JsonField<JsonSchema>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun type(): Type = type.getRequired("type")

                    fun jsonSchema(): JsonSchema = jsonSchema.getRequired("json_schema")

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonProperty("json_schema") @ExcludeMissing fun _jsonSchema() = jsonSchema

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): JsonSchema = apply {
                        if (!validated) {
                            type()
                            jsonSchema().validate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var type: JsonField<Type> = JsonMissing.of()
                        private var jsonSchema: JsonField<JsonSchema> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(jsonSchema: JsonSchema) = apply {
                            this.type = jsonSchema.type
                            this.jsonSchema = jsonSchema.jsonSchema
                            additionalProperties(jsonSchema.additionalProperties)
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun jsonSchema(jsonSchema: JsonSchema) =
                            jsonSchema(JsonField.of(jsonSchema))

                        @JsonProperty("json_schema")
                        @ExcludeMissing
                        fun jsonSchema(jsonSchema: JsonField<JsonSchema>) = apply {
                            this.jsonSchema = jsonSchema
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

                        fun build(): JsonSchema =
                            JsonSchema(
                                type,
                                jsonSchema,
                                additionalProperties.toImmutable(),
                            )
                    }

                    @JsonDeserialize(builder = JsonSchema.Builder::class)
                    @NoAutoDetect
                    class JsonSchema
                    private constructor(
                        private val name: JsonField<String>,
                        private val description: JsonField<String>,
                        private val schema: JsonField<Schema>,
                        private val strict: JsonField<Boolean>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        fun name(): String = name.getRequired("name")

                        fun description(): Optional<String> =
                            Optional.ofNullable(description.getNullable("description"))

                        fun schema(): Optional<Schema> =
                            Optional.ofNullable(schema.getNullable("schema"))

                        fun strict(): Optional<Boolean> =
                            Optional.ofNullable(strict.getNullable("strict"))

                        @JsonProperty("name") @ExcludeMissing fun _name() = name

                        @JsonProperty("description")
                        @ExcludeMissing
                        fun _description() = description

                        @JsonProperty("schema") @ExcludeMissing fun _schema() = schema

                        @JsonProperty("strict") @ExcludeMissing fun _strict() = strict

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): JsonSchema = apply {
                            if (!validated) {
                                name()
                                description()
                                schema().map { it.validate() }
                                strict()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var name: JsonField<String> = JsonMissing.of()
                            private var description: JsonField<String> = JsonMissing.of()
                            private var schema: JsonField<Schema> = JsonMissing.of()
                            private var strict: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(jsonSchema: JsonSchema) = apply {
                                this.name = jsonSchema.name
                                this.description = jsonSchema.description
                                this.schema = jsonSchema.schema
                                this.strict = jsonSchema.strict
                                additionalProperties(jsonSchema.additionalProperties)
                            }

                            fun name(name: String) = name(JsonField.of(name))

                            @JsonProperty("name")
                            @ExcludeMissing
                            fun name(name: JsonField<String>) = apply { this.name = name }

                            fun description(description: String) =
                                description(JsonField.of(description))

                            @JsonProperty("description")
                            @ExcludeMissing
                            fun description(description: JsonField<String>) = apply {
                                this.description = description
                            }

                            fun schema(schema: Schema) = schema(JsonField.of(schema))

                            @JsonProperty("schema")
                            @ExcludeMissing
                            fun schema(schema: JsonField<Schema>) = apply { this.schema = schema }

                            fun strict(strict: Boolean) = strict(JsonField.of(strict))

                            @JsonProperty("strict")
                            @ExcludeMissing
                            fun strict(strict: JsonField<Boolean>) = apply { this.strict = strict }

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

                            fun build(): JsonSchema =
                                JsonSchema(
                                    name,
                                    description,
                                    schema,
                                    strict,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        @JsonDeserialize(builder = Schema.Builder::class)
                        @NoAutoDetect
                        class Schema
                        private constructor(
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): Schema = apply {
                                if (!validated) {
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                @JvmStatic fun builder() = Builder()
                            }

                            class Builder {

                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(schema: Schema) = apply {
                                    additionalProperties(schema.additionalProperties)
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

                                fun build(): Schema = Schema(additionalProperties.toImmutable())
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Schema && additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            /* spotless:off */
                            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                            /* spotless:on */

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "Schema{additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is JsonSchema && name == other.name && description == other.description && schema == other.schema && strict == other.strict && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(name, description, schema, strict, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "JsonSchema{name=$name, description=$description, schema=$schema, strict=$strict, additionalProperties=$additionalProperties}"
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

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField val JSON_SCHEMA = Type(JsonField.of("json_schema"))

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        enum class Known {
                            JSON_SCHEMA,
                        }

                        enum class Value {
                            JSON_SCHEMA,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                JSON_SCHEMA -> Value.JSON_SCHEMA
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                JSON_SCHEMA -> Known.JSON_SCHEMA
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is JsonSchema && type == other.type && jsonSchema == other.jsonSchema && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(type, jsonSchema, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "JsonSchema{type=$type, jsonSchema=$jsonSchema, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = Text.Builder::class)
                @NoAutoDetect
                class Text
                private constructor(
                    private val type: JsonField<Type>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Text = apply {
                        if (!validated) {
                            type()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(text: Text) = apply {
                            this.type = text.type
                            additionalProperties(text.additionalProperties)
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

                        fun build(): Text = Text(type, additionalProperties.toImmutable())
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

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField val TEXT = Type(JsonField.of("text"))

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
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
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
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

                @JsonDeserialize(builder = NullableVariant.Builder::class)
                @NoAutoDetect
                class NullableVariant
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): NullableVariant = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(nullableVariant: NullableVariant) = apply {
                            additionalProperties(nullableVariant.additionalProperties)
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

                        fun build(): NullableVariant =
                            NullableVariant(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is NullableVariant && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "NullableVariant{additionalProperties=$additionalProperties}"
                }
            }

            @JsonDeserialize(using = ToolChoice.Deserializer::class)
            @JsonSerialize(using = ToolChoice.Serializer::class)
            class ToolChoice
            private constructor(
                private val auto: Auto? = null,
                private val none: None? = null,
                private val required: Required? = null,
                private val function: Function? = null,
                private val _json: JsonValue? = null,
            ) {

                private var validated: Boolean = false

                fun auto(): Optional<Auto> = Optional.ofNullable(auto)

                fun none(): Optional<None> = Optional.ofNullable(none)

                fun required(): Optional<Required> = Optional.ofNullable(required)

                fun function(): Optional<Function> = Optional.ofNullable(function)

                fun isAuto(): Boolean = auto != null

                fun isNone(): Boolean = none != null

                fun isRequired(): Boolean = required != null

                fun isFunction(): Boolean = function != null

                fun asAuto(): Auto = auto.getOrThrow("auto")

                fun asNone(): None = none.getOrThrow("none")

                fun asRequired(): Required = required.getOrThrow("required")

                fun asFunction(): Function = function.getOrThrow("function")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        auto != null -> visitor.visitAuto(auto)
                        none != null -> visitor.visitNone(none)
                        required != null -> visitor.visitRequired(required)
                        function != null -> visitor.visitFunction(function)
                        else -> visitor.unknown(_json)
                    }
                }

                fun validate(): ToolChoice = apply {
                    if (!validated) {
                        if (auto == null && none == null && required == null && function == null) {
                            throw BraintrustInvalidDataException("Unknown ToolChoice: $_json")
                        }
                        function?.validate()
                        validated = true
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ToolChoice && auto == other.auto && none == other.none && required == other.required && function == other.function /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(auto, none, required, function) /* spotless:on */

                override fun toString(): String =
                    when {
                        auto != null -> "ToolChoice{auto=$auto}"
                        none != null -> "ToolChoice{none=$none}"
                        required != null -> "ToolChoice{required=$required}"
                        function != null -> "ToolChoice{function=$function}"
                        _json != null -> "ToolChoice{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid ToolChoice")
                    }

                companion object {

                    @JvmStatic fun ofAuto(auto: Auto) = ToolChoice(auto = auto)

                    @JvmStatic fun ofNone(none: None) = ToolChoice(none = none)

                    @JvmStatic fun ofRequired(required: Required) = ToolChoice(required = required)

                    @JvmStatic fun ofFunction(function: Function) = ToolChoice(function = function)
                }

                interface Visitor<out T> {

                    fun visitAuto(auto: Auto): T

                    fun visitNone(none: None): T

                    fun visitRequired(required: Required): T

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
                        tryDeserialize(node, jacksonTypeRef<Required>())?.let {
                            return ToolChoice(required = it, _json = json)
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
                            value.required != null -> generator.writeObject(value.required)
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

                        return /* spotless:off */ other is Auto && value == other.value /* spotless:on */
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
                            else -> throw BraintrustInvalidDataException("Unknown Auto: $value")
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

                        return /* spotless:off */ other is None && value == other.value /* spotless:on */
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
                            else -> throw BraintrustInvalidDataException("Unknown None: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class Required
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

                        return /* spotless:off */ other is Required && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val REQUIRED = Required(JsonField.of("required"))

                        @JvmStatic fun of(value: String) = Required(JsonField.of(value))
                    }

                    enum class Known {
                        REQUIRED,
                    }

                    enum class Value {
                        REQUIRED,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            REQUIRED -> Value.REQUIRED
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            REQUIRED -> Known.REQUIRED
                            else -> throw BraintrustInvalidDataException("Unknown Required: $value")
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

                    fun type(): Type = type.getRequired("type")

                    fun function(): Function = function.getRequired("function")

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonProperty("function") @ExcludeMissing fun _function() = function

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Function = apply {
                        if (!validated) {
                            type()
                            function().validate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

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
                                type,
                                function,
                                additionalProperties.toImmutable(),
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

                        fun name(): String = name.getRequired("name")

                        @JsonProperty("name") @ExcludeMissing fun _name() = name

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Function = apply {
                            if (!validated) {
                                name()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

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
                                Function(name, additionalProperties.toImmutable())
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

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
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
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Function && type == other.type && function == other.function && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(type, function, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Function{type=$type, function=$function, additionalProperties=$additionalProperties}"
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OpenAIModelParams && useCache == other.useCache && temperature == other.temperature && topP == other.topP && maxTokens == other.maxTokens && frequencyPenalty == other.frequencyPenalty && presencePenalty == other.presencePenalty && responseFormat == other.responseFormat && toolChoice == other.toolChoice && functionCall == other.functionCall && n == other.n && stop == other.stop && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(useCache, temperature, topP, maxTokens, frequencyPenalty, presencePenalty, responseFormat, toolChoice, functionCall, n, stop, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OpenAIModelParams{useCache=$useCache, temperature=$temperature, topP=$topP, maxTokens=$maxTokens, frequencyPenalty=$frequencyPenalty, presencePenalty=$presencePenalty, responseFormat=$responseFormat, toolChoice=$toolChoice, functionCall=$functionCall, n=$n, stop=$stop, additionalProperties=$additionalProperties}"
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

            @JsonProperty("stop_sequences") @ExcludeMissing fun _stopSequences() = stopSequences

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
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

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
                fun useCache(useCache: JsonField<Boolean>) = apply { this.useCache = useCache }

                fun maxTokens(maxTokens: Double) = maxTokens(JsonField.of(maxTokens))

                @JsonProperty("max_tokens")
                @ExcludeMissing
                fun maxTokens(maxTokens: JsonField<Double>) = apply { this.maxTokens = maxTokens }

                fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

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

                fun build(): AnthropicModelParams =
                    AnthropicModelParams(
                        useCache,
                        maxTokens,
                        temperature,
                        topP,
                        topK,
                        stopSequences.map { it.toImmutable() },
                        maxTokensToSample,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AnthropicModelParams && useCache == other.useCache && maxTokens == other.maxTokens && temperature == other.temperature && topP == other.topP && topK == other.topK && stopSequences == other.stopSequences && maxTokensToSample == other.maxTokensToSample && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(useCache, maxTokens, temperature, topP, topK, stopSequences, maxTokensToSample, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AnthropicModelParams{useCache=$useCache, maxTokens=$maxTokens, temperature=$temperature, topP=$topP, topK=$topK, stopSequences=$stopSequences, maxTokensToSample=$maxTokensToSample, additionalProperties=$additionalProperties}"
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

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var useCache: JsonField<Boolean> = JsonMissing.of()
                private var temperature: JsonField<Double> = JsonMissing.of()
                private var maxOutputTokens: JsonField<Double> = JsonMissing.of()
                private var topP: JsonField<Double> = JsonMissing.of()
                private var topK: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

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
                fun useCache(useCache: JsonField<Boolean>) = apply { this.useCache = useCache }

                fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

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

                fun build(): GoogleModelParams =
                    GoogleModelParams(
                        useCache,
                        temperature,
                        maxOutputTokens,
                        topP,
                        topK,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GoogleModelParams && useCache == other.useCache && temperature == other.temperature && maxOutputTokens == other.maxOutputTokens && topP == other.topP && topK == other.topK && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(useCache, temperature, maxOutputTokens, topP, topK, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GoogleModelParams{useCache=$useCache, temperature=$temperature, maxOutputTokens=$maxOutputTokens, topP=$topP, topK=$topK, additionalProperties=$additionalProperties}"
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

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var useCache: JsonField<Boolean> = JsonMissing.of()
                private var temperature: JsonField<Double> = JsonMissing.of()
                private var topK: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

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
                fun useCache(useCache: JsonField<Boolean>) = apply { this.useCache = useCache }

                fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

                @JsonProperty("temperature")
                @ExcludeMissing
                fun temperature(temperature: JsonField<Double>) = apply {
                    this.temperature = temperature
                }

                fun topK(topK: Double) = topK(JsonField.of(topK))

                @JsonProperty("topK")
                @ExcludeMissing
                fun topK(topK: JsonField<Double>) = apply { this.topK = topK }

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

                fun build(): WindowAiModelParams =
                    WindowAiModelParams(
                        useCache,
                        temperature,
                        topK,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is WindowAiModelParams && useCache == other.useCache && temperature == other.temperature && topK == other.topK && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(useCache, temperature, topK, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WindowAiModelParams{useCache=$useCache, temperature=$temperature, topK=$topK, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = JsCompletionParams.Builder::class)
        @NoAutoDetect
        class JsCompletionParams
        private constructor(
            private val useCache: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

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

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var useCache: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(jsCompletionParams: JsCompletionParams) = apply {
                    this.useCache = jsCompletionParams.useCache
                    additionalProperties(jsCompletionParams.additionalProperties)
                }

                fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                @JsonProperty("use_cache")
                @ExcludeMissing
                fun useCache(useCache: JsonField<Boolean>) = apply { this.useCache = useCache }

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
