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

/** The prompt, model, and its parameters */
@JsonDeserialize(builder = PromptData.Builder::class)
@NoAutoDetect
class PromptData
private constructor(
    private val prompt: JsonField<Prompt>,
    private val options: JsonField<Options>,
    private val parser: JsonField<Parser>,
    private val toolFunctions: JsonField<List<ToolFunction>>,
    private val origin: JsonField<Origin>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun prompt(): Optional<Prompt> = Optional.ofNullable(prompt.getNullable("prompt"))

    fun options(): Optional<Options> = Optional.ofNullable(options.getNullable("options"))

    fun parser(): Optional<Parser> = Optional.ofNullable(parser.getNullable("parser"))

    fun toolFunctions(): Optional<List<ToolFunction>> =
        Optional.ofNullable(toolFunctions.getNullable("tool_functions"))

    fun origin(): Optional<Origin> = Optional.ofNullable(origin.getNullable("origin"))

    @JsonProperty("prompt") @ExcludeMissing fun _prompt() = prompt

    @JsonProperty("options") @ExcludeMissing fun _options() = options

    @JsonProperty("parser") @ExcludeMissing fun _parser() = parser

    @JsonProperty("tool_functions") @ExcludeMissing fun _toolFunctions() = toolFunctions

    @JsonProperty("origin") @ExcludeMissing fun _origin() = origin

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PromptData = apply {
        if (!validated) {
            prompt()
            options().map { it.validate() }
            parser().map { it.validate() }
            toolFunctions()
            origin().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var prompt: JsonField<Prompt> = JsonMissing.of()
        private var options: JsonField<Options> = JsonMissing.of()
        private var parser: JsonField<Parser> = JsonMissing.of()
        private var toolFunctions: JsonField<List<ToolFunction>> = JsonMissing.of()
        private var origin: JsonField<Origin> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(promptData: PromptData) = apply {
            this.prompt = promptData.prompt
            this.options = promptData.options
            this.parser = promptData.parser
            this.toolFunctions = promptData.toolFunctions
            this.origin = promptData.origin
            additionalProperties(promptData.additionalProperties)
        }

        fun prompt(prompt: Prompt) = prompt(JsonField.of(prompt))

        @JsonProperty("prompt")
        @ExcludeMissing
        fun prompt(prompt: JsonField<Prompt>) = apply { this.prompt = prompt }

        fun options(options: Options) = options(JsonField.of(options))

        @JsonProperty("options")
        @ExcludeMissing
        fun options(options: JsonField<Options>) = apply { this.options = options }

        fun parser(parser: Parser) = parser(JsonField.of(parser))

        @JsonProperty("parser")
        @ExcludeMissing
        fun parser(parser: JsonField<Parser>) = apply { this.parser = parser }

        fun toolFunctions(toolFunctions: List<ToolFunction>) =
            toolFunctions(JsonField.of(toolFunctions))

        @JsonProperty("tool_functions")
        @ExcludeMissing
        fun toolFunctions(toolFunctions: JsonField<List<ToolFunction>>) = apply {
            this.toolFunctions = toolFunctions
        }

        fun origin(origin: Origin) = origin(JsonField.of(origin))

        @JsonProperty("origin")
        @ExcludeMissing
        fun origin(origin: JsonField<Origin>) = apply { this.origin = origin }

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
                parser,
                toolFunctions.map { it.toUnmodifiable() },
                origin,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Options.Builder::class)
    @NoAutoDetect
    class Options
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

        fun validate(): Options = apply {
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
            internal fun from(options: Options) = apply {
                this.model = options.model
                this.params = options.params
                this.position = options.position
                additionalProperties(options.additionalProperties)
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
                    openaiModelParams != null -> visitor.visitOpenAIModelParams(openaiModelParams)
                    anthropicModelParams != null ->
                        visitor.visitAnthropicModelParams(anthropicModelParams)
                    googleModelParams != null -> visitor.visitGoogleModelParams(googleModelParams)
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

                return /* spotless:off */ other is Params && this.openaiModelParams == other.openaiModelParams && this.anthropicModelParams == other.anthropicModelParams && this.googleModelParams == other.googleModelParams && this.windowAiModelParams == other.windowAiModelParams && this.jsCompletionParams == other.jsCompletionParams /* spotless:on */
            }

            override fun hashCode(): Int {
                return /* spotless:off */ Objects.hash(openaiModelParams, anthropicModelParams, googleModelParams, windowAiModelParams, jsCompletionParams) /* spotless:on */
            }

            override fun toString(): String {
                return when {
                    openaiModelParams != null -> "Params{openaiModelParams=$openaiModelParams}"
                    anthropicModelParams != null ->
                        "Params{anthropicModelParams=$anthropicModelParams}"
                    googleModelParams != null -> "Params{googleModelParams=$googleModelParams}"
                    windowAiModelParams != null ->
                        "Params{windowAiModelParams=$windowAiModelParams}"
                    jsCompletionParams != null -> "Params{jsCompletionParams=$jsCompletionParams}"
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

                @JsonProperty("response_format")
                @ExcludeMissing
                fun _responseFormat() = responseFormat

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
                        responseFormat().map { it.validate() }
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

                        return /* spotless:off */ other is FunctionCall && this.auto == other.auto && this.none == other.none && this.function == other.function /* spotless:on */
                    }

                    override fun hashCode(): Int {
                        return /* spotless:off */ Objects.hash(auto, none, function) /* spotless:on */
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
                            tryDeserialize(node, jacksonTypeRef<FunctionCall.None>())?.let {
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

                            return /* spotless:off */ other is Auto && this.value == other.value /* spotless:on */
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

                            return /* spotless:off */ other is None && this.value == other.value /* spotless:on */
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

                            fun build(): Function =
                                Function(name, additionalProperties.toUnmodifiable())
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Function && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        private var hashCode: Int = 0

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = /* spotless:off */ Objects.hash(name, additionalProperties) /* spotless:on */
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Function{name=$name, additionalProperties=$additionalProperties}"
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

                            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
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

                        return /* spotless:off */ other is ResponseFormat && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(type, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "ResponseFormat{type=$type, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is OpenAIModelParams && this.useCache == other.useCache && this.temperature == other.temperature && this.topP == other.topP && this.maxTokens == other.maxTokens && this.frequencyPenalty == other.frequencyPenalty && this.presencePenalty == other.presencePenalty && this.responseFormat == other.responseFormat && this.toolChoice == other.toolChoice && this.functionCall == other.functionCall && this.n == other.n && this.stop == other.stop && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(useCache, temperature, topP, maxTokens, frequencyPenalty, presencePenalty, responseFormat, toolChoice, functionCall, n, stop, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

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
                    fun maxTokens(maxTokens: JsonField<Double>) = apply {
                        this.maxTokens = maxTokens
                    }

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
                            stopSequences.map { it.toUnmodifiable() },
                            maxTokensToSample,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AnthropicModelParams && this.useCache == other.useCache && this.maxTokens == other.maxTokens && this.temperature == other.temperature && this.topP == other.topP && this.topK == other.topK && this.stopSequences == other.stopSequences && this.maxTokensToSample == other.maxTokensToSample && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(useCache, maxTokens, temperature, topP, topK, stopSequences, maxTokensToSample, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

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
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is GoogleModelParams && this.useCache == other.useCache && this.temperature == other.temperature && this.maxOutputTokens == other.maxOutputTokens && this.topP == other.topP && this.topK == other.topK && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(useCache, temperature, maxOutputTokens, topP, topK, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

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
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is WindowAiModelParams && this.useCache == other.useCache && this.temperature == other.temperature && this.topK == other.topK && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(useCache, temperature, topK, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

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
                        JsCompletionParams(useCache, additionalProperties.toUnmodifiable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is JsCompletionParams && this.useCache == other.useCache && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(useCache, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "JsCompletionParams{useCache=$useCache, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Options && this.model == other.model && this.params == other.params && this.position == other.position && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(model, params, position, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Options{model=$model, params=$params, position=$position, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Origin.Builder::class)
    @NoAutoDetect
    class Origin
    private constructor(
        private val promptId: JsonField<String>,
        private val projectId: JsonField<String>,
        private val promptVersion: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun promptId(): Optional<String> = Optional.ofNullable(promptId.getNullable("prompt_id"))

        fun projectId(): Optional<String> = Optional.ofNullable(projectId.getNullable("project_id"))

        fun promptVersion(): Optional<String> =
            Optional.ofNullable(promptVersion.getNullable("prompt_version"))

        @JsonProperty("prompt_id") @ExcludeMissing fun _promptId() = promptId

        @JsonProperty("project_id") @ExcludeMissing fun _projectId() = projectId

        @JsonProperty("prompt_version") @ExcludeMissing fun _promptVersion() = promptVersion

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Origin = apply {
            if (!validated) {
                promptId()
                projectId()
                promptVersion()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var promptId: JsonField<String> = JsonMissing.of()
            private var projectId: JsonField<String> = JsonMissing.of()
            private var promptVersion: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(origin: Origin) = apply {
                this.promptId = origin.promptId
                this.projectId = origin.projectId
                this.promptVersion = origin.promptVersion
                additionalProperties(origin.additionalProperties)
            }

            fun promptId(promptId: String) = promptId(JsonField.of(promptId))

            @JsonProperty("prompt_id")
            @ExcludeMissing
            fun promptId(promptId: JsonField<String>) = apply { this.promptId = promptId }

            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            @JsonProperty("project_id")
            @ExcludeMissing
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            fun promptVersion(promptVersion: String) = promptVersion(JsonField.of(promptVersion))

            @JsonProperty("prompt_version")
            @ExcludeMissing
            fun promptVersion(promptVersion: JsonField<String>) = apply {
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Origin && this.promptId == other.promptId && this.projectId == other.projectId && this.promptVersion == other.promptVersion && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(promptId, projectId, promptVersion, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Origin{promptId=$promptId, projectId=$projectId, promptVersion=$promptVersion, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Parser.Builder::class)
    @NoAutoDetect
    class Parser
    private constructor(
        private val type: JsonField<Type>,
        private val useCot: JsonField<Boolean>,
        private val choiceScores: JsonField<ChoiceScores>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun type(): Type = type.getRequired("type")

        fun useCot(): Boolean = useCot.getRequired("use_cot")

        fun choiceScores(): ChoiceScores = choiceScores.getRequired("choice_scores")

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonProperty("use_cot") @ExcludeMissing fun _useCot() = useCot

        @JsonProperty("choice_scores") @ExcludeMissing fun _choiceScores() = choiceScores

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Parser = apply {
            if (!validated) {
                type()
                useCot()
                choiceScores().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: JsonField<Type> = JsonMissing.of()
            private var useCot: JsonField<Boolean> = JsonMissing.of()
            private var choiceScores: JsonField<ChoiceScores> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(parser: Parser) = apply {
                this.type = parser.type
                this.useCot = parser.useCot
                this.choiceScores = parser.choiceScores
                additionalProperties(parser.additionalProperties)
            }

            fun type(type: Type) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun useCot(useCot: Boolean) = useCot(JsonField.of(useCot))

            @JsonProperty("use_cot")
            @ExcludeMissing
            fun useCot(useCot: JsonField<Boolean>) = apply { this.useCot = useCot }

            fun choiceScores(choiceScores: ChoiceScores) = choiceScores(JsonField.of(choiceScores))

            @JsonProperty("choice_scores")
            @ExcludeMissing
            fun choiceScores(choiceScores: JsonField<ChoiceScores>) = apply {
                this.choiceScores = choiceScores
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

            fun build(): Parser =
                Parser(
                    type,
                    useCot,
                    choiceScores,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = ChoiceScores.Builder::class)
        @NoAutoDetect
        class ChoiceScores
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ChoiceScores = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(choiceScores: ChoiceScores) = apply {
                    additionalProperties(choiceScores.additionalProperties)
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

                fun build(): ChoiceScores = ChoiceScores(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ChoiceScores && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "ChoiceScores{additionalProperties=$additionalProperties}"
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val LLM_CLASSIFIER = Type(JsonField.of("llm_classifier"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                LLM_CLASSIFIER,
            }

            enum class Value {
                LLM_CLASSIFIER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    LLM_CLASSIFIER -> Value.LLM_CLASSIFIER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    LLM_CLASSIFIER -> Known.LLM_CLASSIFIER
                    else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Parser && this.type == other.type && this.useCot == other.useCot && this.choiceScores == other.choiceScores && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(type, useCot, choiceScores, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Parser{type=$type, useCot=$useCot, choiceScores=$choiceScores, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is Prompt && this.completion == other.completion && this.chat == other.chat && this.nullableVariant == other.nullableVariant /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(completion, chat, nullableVariant) /* spotless:on */
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

            @JvmStatic fun ofCompletion(completion: Completion) = Prompt(completion = completion)

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
                    value.nullableVariant != null -> generator.writeObject(value.nullableVariant)
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

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Completion && this.type == other.type && this.content == other.content && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(type, content, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Completion{type=$type, content=$content, additionalProperties=$additionalProperties}"
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

                    return /* spotless:off */ other is Message && this.system == other.system && this.user == other.user && this.assistant == other.assistant && this.tool == other.tool && this.function == other.function && this.fallback == other.fallback /* spotless:on */
                }

                override fun hashCode(): Int {
                    return /* spotless:off */ Objects.hash(system, user, assistant, tool, function, fallback) /* spotless:on */
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
                        fun content(content: JsonField<String>) = apply { this.content = content }

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

                            return /* spotless:off */ other is Role && this.value == other.value /* spotless:on */
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
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is System && this.content == other.content && this.role == other.role && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(content, role, name, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "System{content=$content, role=$role, name=$name, additionalProperties=$additionalProperties}"
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
                        fun content(content: JsonField<Content>) = apply { this.content = content }

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

                            return /* spotless:off */ other is Role && this.value == other.value /* spotless:on */
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
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    @JsonDeserialize(using = Content.Deserializer::class)
                    @JsonSerialize(using = Content.Serializer::class)
                    class Content
                    private constructor(
                        private val text: String? = null,
                        private val array: List<ChatCompletionContentPart>? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        private var validated: Boolean = false

                        fun text(): Optional<String> = Optional.ofNullable(text)

                        fun array(): Optional<List<ChatCompletionContentPart>> =
                            Optional.ofNullable(array)

                        fun isText(): Boolean = text != null

                        fun isArray(): Boolean = array != null

                        fun asText(): String = text.getOrThrow("text")

                        fun asArray(): List<ChatCompletionContentPart> = array.getOrThrow("array")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        fun <T> accept(visitor: Visitor<T>): T {
                            return when {
                                text != null -> visitor.visitText(text)
                                array != null -> visitor.visitArray(array)
                                else -> visitor.unknown(_json)
                            }
                        }

                        fun validate(): Content = apply {
                            if (!validated) {
                                if (text == null && array == null) {
                                    throw BraintrustInvalidDataException("Unknown Content: $_json")
                                }
                                validated = true
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Content && this.text == other.text && this.array == other.array /* spotless:on */
                        }

                        override fun hashCode(): Int {
                            return /* spotless:off */ Objects.hash(text, array) /* spotless:on */
                        }

                        override fun toString(): String {
                            return when {
                                text != null -> "Content{text=$text}"
                                array != null -> "Content{array=$array}"
                                _json != null -> "Content{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Content")
                            }
                        }

                        companion object {

                            @JvmStatic fun ofText(text: String) = Content(text = text)

                            @JvmStatic
                            fun ofArray(array: List<ChatCompletionContentPart>) =
                                Content(array = array)
                        }

                        interface Visitor<out T> {

                            fun visitText(text: String): T

                            fun visitArray(array: List<ChatCompletionContentPart>): T

                            fun unknown(json: JsonValue?): T {
                                throw BraintrustInvalidDataException("Unknown Content: $json")
                            }
                        }

                        class Deserializer : BaseDeserializer<Content>(Content::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): Content {
                                val json = JsonValue.fromJsonNode(node)

                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    return Content(text = it, _json = json)
                                }
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<List<ChatCompletionContentPart>>()
                                    )
                                    ?.let {
                                        return Content(array = it, _json = json)
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
                                    value.text != null -> generator.writeObject(value.text)
                                    value.array != null -> generator.writeObject(value.array)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid Content")
                                }
                            }
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is User && this.content == other.content && this.role == other.role && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(content, role, name, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "User{content=$content, role=$role, name=$name, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = Assistant.Builder::class)
                @NoAutoDetect
                class Assistant
                private constructor(
                    private val role: JsonField<Role>,
                    private val content: JsonField<String>,
                    private val functionCall: JsonField<FunctionCall>,
                    private val name: JsonField<String>,
                    private val toolCalls: JsonField<List<ChatCompletionMessageToolCall>>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun role(): Role = role.getRequired("role")

                    fun content(): Optional<String> =
                        Optional.ofNullable(content.getNullable("content"))

                    fun functionCall(): Optional<FunctionCall> =
                        Optional.ofNullable(functionCall.getNullable("function_call"))

                    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                    fun toolCalls(): Optional<List<ChatCompletionMessageToolCall>> =
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

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var role: JsonField<Role> = JsonMissing.of()
                        private var content: JsonField<String> = JsonMissing.of()
                        private var functionCall: JsonField<FunctionCall> = JsonMissing.of()
                        private var name: JsonField<String> = JsonMissing.of()
                        private var toolCalls: JsonField<List<ChatCompletionMessageToolCall>> =
                            JsonMissing.of()
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
                        fun content(content: JsonField<String>) = apply { this.content = content }

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

                        fun toolCalls(toolCalls: List<ChatCompletionMessageToolCall>) =
                            toolCalls(JsonField.of(toolCalls))

                        @JsonProperty("tool_calls")
                        @ExcludeMissing
                        fun toolCalls(toolCalls: JsonField<List<ChatCompletionMessageToolCall>>) =
                            apply {
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

                            return /* spotless:off */ other is Role && this.value == other.value /* spotless:on */
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
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
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

                        fun arguments(): String = arguments.getRequired("arguments")

                        fun name(): String = name.getRequired("name")

                        @JsonProperty("arguments") @ExcludeMissing fun _arguments() = arguments

                        @JsonProperty("name") @ExcludeMissing fun _name() = name

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): FunctionCall = apply {
                            if (!validated) {
                                arguments()
                                name()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

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

                            fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                            @JsonProperty("arguments")
                            @ExcludeMissing
                            fun arguments(arguments: JsonField<String>) = apply {
                                this.arguments = arguments
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

                            fun build(): FunctionCall =
                                FunctionCall(
                                    arguments,
                                    name,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is FunctionCall && this.arguments == other.arguments && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        private var hashCode: Int = 0

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = /* spotless:off */ Objects.hash(arguments, name, additionalProperties) /* spotless:on */
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "FunctionCall{arguments=$arguments, name=$name, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Assistant && this.role == other.role && this.content == other.content && this.functionCall == other.functionCall && this.name == other.name && this.toolCalls == other.toolCalls && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(role, content, functionCall, name, toolCalls, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Assistant{role=$role, content=$content, functionCall=$functionCall, name=$name, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
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
                        fun content(content: JsonField<String>) = apply { this.content = content }

                        fun role(role: Role) = role(JsonField.of(role))

                        @JsonProperty("role")
                        @ExcludeMissing
                        fun role(role: JsonField<Role>) = apply { this.role = role }

                        fun toolCallId(toolCallId: String) = toolCallId(JsonField.of(toolCallId))

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

                            return /* spotless:off */ other is Role && this.value == other.value /* spotless:on */
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
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Tool && this.content == other.content && this.role == other.role && this.toolCallId == other.toolCallId && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(content, role, toolCallId, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Tool{content=$content, role=$role, toolCallId=$toolCallId, additionalProperties=$additionalProperties}"
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
                        fun content(content: JsonField<String>) = apply { this.content = content }

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

                            return /* spotless:off */ other is Role && this.value == other.value /* spotless:on */
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
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Function && this.content == other.content && this.name == other.name && this.role == other.role && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(content, name, role, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Function{content=$content, name=$name, role=$role, additionalProperties=$additionalProperties}"
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
                        fun content(content: JsonField<String>) = apply { this.content = content }

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

                            return /* spotless:off */ other is Role && this.value == other.value /* spotless:on */
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
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Fallback && this.role == other.role && this.content == other.content && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(role, content, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Fallback{role=$role, content=$content, additionalProperties=$additionalProperties}"
                }
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Chat && this.type == other.type && this.messages == other.messages && this.tools == other.tools && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(type, messages, tools, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Chat{type=$type, messages=$messages, tools=$tools, additionalProperties=$additionalProperties}"
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NullableVariant && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "NullableVariant{additionalProperties=$additionalProperties}"
        }
    }

    @JsonDeserialize(using = ToolFunction.Deserializer::class)
    @JsonSerialize(using = ToolFunction.Serializer::class)
    class ToolFunction
    private constructor(
        private val function: Function? = null,
        private val global: Global? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun function(): Optional<Function> = Optional.ofNullable(function)

        fun global(): Optional<Global> = Optional.ofNullable(global)

        fun isFunction(): Boolean = function != null

        fun isGlobal(): Boolean = global != null

        fun asFunction(): Function = function.getOrThrow("function")

        fun asGlobal(): Global = global.getOrThrow("global")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                function != null -> visitor.visitFunction(function)
                global != null -> visitor.visitGlobal(global)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): ToolFunction = apply {
            if (!validated) {
                if (function == null && global == null) {
                    throw BraintrustInvalidDataException("Unknown ToolFunction: $_json")
                }
                function?.validate()
                global?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolFunction && this.function == other.function && this.global == other.global /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(function, global) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                function != null -> "ToolFunction{function=$function}"
                global != null -> "ToolFunction{global=$global}"
                _json != null -> "ToolFunction{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ToolFunction")
            }
        }

        companion object {

            @JvmStatic fun ofFunction(function: Function) = ToolFunction(function = function)

            @JvmStatic fun ofGlobal(global: Global) = ToolFunction(global = global)
        }

        interface Visitor<out T> {

            fun visitFunction(function: Function): T

            fun visitGlobal(global: Global): T

            fun unknown(json: JsonValue?): T {
                throw BraintrustInvalidDataException("Unknown ToolFunction: $json")
            }
        }

        class Deserializer : BaseDeserializer<ToolFunction>(ToolFunction::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ToolFunction {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<Function>()) { it.validate() }
                    ?.let {
                        return ToolFunction(function = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Global>()) { it.validate() }
                    ?.let {
                        return ToolFunction(global = it, _json = json)
                    }

                return ToolFunction(_json = json)
            }
        }

        class Serializer : BaseSerializer<ToolFunction>(ToolFunction::class) {

            override fun serialize(
                value: ToolFunction,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.function != null -> generator.writeObject(value.function)
                    value.global != null -> generator.writeObject(value.global)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ToolFunction")
                }
            }
        }

        @JsonDeserialize(builder = Function.Builder::class)
        @NoAutoDetect
        class Function
        private constructor(
            private val type: JsonField<Type>,
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun type(): Type = type.getRequired("type")

            fun id(): String = id.getRequired("id")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Function = apply {
                if (!validated) {
                    type()
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(function: Function) = apply {
                    this.type = function.type
                    this.id = function.id
                    additionalProperties(function.additionalProperties)
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

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

                fun build(): Function =
                    Function(
                        type,
                        id,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
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

                return /* spotless:off */ other is Function && this.type == other.type && this.id == other.id && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(type, id, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Function{type=$type, id=$id, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Global.Builder::class)
        @NoAutoDetect
        class Global
        private constructor(
            private val type: JsonField<Type>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun type(): Type = type.getRequired("type")

            fun name(): String = name.getRequired("name")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Global = apply {
                if (!validated) {
                    type()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(global: Global) = apply {
                    this.type = global.type
                    this.name = global.name
                    additionalProperties(global.additionalProperties)
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun name(name: String) = name(JsonField.of(name))

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

                fun build(): Global =
                    Global(
                        type,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val GLOBAL = Type(JsonField.of("global"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    GLOBAL,
                }

                enum class Value {
                    GLOBAL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        GLOBAL -> Value.GLOBAL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        GLOBAL -> Known.GLOBAL
                        else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Global && this.type == other.type && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(type, name, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Global{type=$type, name=$name, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PromptData && this.prompt == other.prompt && this.options == other.options && this.parser == other.parser && this.toolFunctions == other.toolFunctions && this.origin == other.origin && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(prompt, options, parser, toolFunctions, origin, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "PromptData{prompt=$prompt, options=$options, parser=$parser, toolFunctions=$toolFunctions, origin=$origin, additionalProperties=$additionalProperties}"
}
