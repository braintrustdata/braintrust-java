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
class PromptOptions @JsonCreator private constructor(
    @JsonProperty("model") @ExcludeMissing private val model: JsonField<String> = JsonMissing.of(),
    @JsonProperty("params") @ExcludeMissing private val params: JsonField<Params> = JsonMissing.of(),
    @JsonProperty("position") @ExcludeMissing private val position: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    fun model(): Optional<String> = Optional.ofNullable(model.getNullable("model"))

    fun params(): Optional<Params> = Optional.ofNullable(params.getNullable("params"))

    fun position(): Optional<String> = Optional.ofNullable(position.getNullable("position"))

    @JsonProperty("model")
    @ExcludeMissing
    fun _model(): JsonField<String> = model

    @JsonProperty("params")
    @ExcludeMissing
    fun _params(): JsonField<Params> = params

    @JsonProperty("position")
    @ExcludeMissing
    fun _position(): JsonField<String> = position

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PromptOptions =
        apply {
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
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [PromptOptions]. */
    class Builder internal constructor() {

        private var model: JsonField<String> = JsonMissing.of()
        private var params: JsonField<Params> = JsonMissing.of()
        private var position: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(promptOptions: PromptOptions) =
            apply {
                model = promptOptions.model
                params = promptOptions.params
                position = promptOptions.position
                additionalProperties = promptOptions.additionalProperties.toMutableMap()
            }

        fun model(model: String) = model(JsonField.of(model))

        fun model(model: JsonField<String>) =
            apply {
                this.model = model
            }

        fun params(params: Params) = params(JsonField.of(params))

        fun params(params: JsonField<Params>) =
            apply {
                this.params = params
            }

        fun params(openaiModel: Params.OpenAIModelParams) = params(Params.ofOpenAIModel(openaiModel))

        fun params(anthropicModel: Params.AnthropicModelParams) = params(Params.ofAnthropicModel(anthropicModel))

        fun params(googleModel: Params.GoogleModelParams) = params(Params.ofGoogleModel(googleModel))

        fun params(windowAiModel: Params.WindowAiModelParams) = params(Params.ofWindowAiModel(windowAiModel))

        fun params(jsCompletion: Params.JsCompletionParams) = params(Params.ofJsCompletion(jsCompletion))

        fun position(position: String) = position(JsonField.of(position))

        fun position(position: JsonField<String>) =
            apply {
                this.position = position
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
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
    class Params private constructor(
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

        fun validate(): Params =
            apply {
                if (validated) {
                  return@apply
                }

                accept(object : Visitor<Unit> {
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
                })
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
            fun ofAnthropicModel(anthropicModel: AnthropicModelParams) = Params(anthropicModel = anthropicModel)

            @JvmStatic
            fun ofGoogleModel(googleModel: GoogleModelParams) = Params(googleModel = googleModel)

            @JvmStatic
            fun ofWindowAiModel(windowAiModel: WindowAiModelParams) = Params(windowAiModel = windowAiModel)

            @JvmStatic
            fun ofJsCompletion(jsCompletion: JsCompletionParams) = Params(jsCompletion = jsCompletion)
        }

        /**
         * An interface that defines how to map each variant of [Params] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitOpenAIModel(openaiModel: OpenAIModelParams): T

            fun visitAnthropicModel(anthropicModel: AnthropicModelParams): T

            fun visitGoogleModel(googleModel: GoogleModelParams): T

            fun visitWindowAiModel(windowAiModel: WindowAiModelParams): T

            fun visitJsCompletion(jsCompletion: JsCompletionParams): T

            /**
             * Maps an unknown variant of [Params] to a value of type [T].
             *
             * An instance of [Params] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the
             * SDK is unaware of.
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

              tryDeserialize(node, jacksonTypeRef<OpenAIModelParams>()){ it.validate() }?.let {
                  return Params(openaiModel = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<AnthropicModelParams>()){ it.validate() }?.let {
                  return Params(anthropicModel = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<GoogleModelParams>()){ it.validate() }?.let {
                  return Params(googleModel = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<WindowAiModelParams>()){ it.validate() }?.let {
                  return Params(windowAiModel = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<JsCompletionParams>()){ it.validate() }?.let {
                  return Params(jsCompletion = it, _json = json)
              }

              return Params(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Params>(Params::class) {

            override fun serialize(value: Params, generator: JsonGenerator, provider: SerializerProvider) {
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
        class OpenAIModelParams @JsonCreator private constructor(
            @JsonProperty("frequency_penalty") @ExcludeMissing private val frequencyPenalty: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("function_call") @ExcludeMissing private val functionCall: JsonField<FunctionCall> = JsonMissing.of(),
            @JsonProperty("max_tokens") @ExcludeMissing private val maxTokens: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("n") @ExcludeMissing private val n: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("presence_penalty") @ExcludeMissing private val presencePenalty: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("response_format") @ExcludeMissing private val responseFormat: JsonField<ResponseFormat> = JsonMissing.of(),
            @JsonProperty("stop") @ExcludeMissing private val stop: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("temperature") @ExcludeMissing private val temperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tool_choice") @ExcludeMissing private val toolChoice: JsonField<ToolChoice> = JsonMissing.of(),
            @JsonProperty("top_p") @ExcludeMissing private val topP: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("use_cache") @ExcludeMissing private val useCache: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

        ) {

            fun frequencyPenalty(): Optional<Double> = Optional.ofNullable(frequencyPenalty.getNullable("frequency_penalty"))

            fun functionCall(): Optional<FunctionCall> = Optional.ofNullable(functionCall.getNullable("function_call"))

            fun maxTokens(): Optional<Double> = Optional.ofNullable(maxTokens.getNullable("max_tokens"))

            fun n(): Optional<Double> = Optional.ofNullable(n.getNullable("n"))

            fun presencePenalty(): Optional<Double> = Optional.ofNullable(presencePenalty.getNullable("presence_penalty"))

            fun responseFormat(): Optional<ResponseFormat> = Optional.ofNullable(responseFormat.getNullable("response_format"))

            fun stop(): Optional<List<String>> = Optional.ofNullable(stop.getNullable("stop"))

            fun temperature(): Optional<Double> = Optional.ofNullable(temperature.getNullable("temperature"))

            fun toolChoice(): Optional<ToolChoice> = Optional.ofNullable(toolChoice.getNullable("tool_choice"))

            fun topP(): Optional<Double> = Optional.ofNullable(topP.getNullable("top_p"))

            fun useCache(): Optional<Boolean> = Optional.ofNullable(useCache.getNullable("use_cache"))

            @JsonProperty("frequency_penalty")
            @ExcludeMissing
            fun _frequencyPenalty(): JsonField<Double> = frequencyPenalty

            @JsonProperty("function_call")
            @ExcludeMissing
            fun _functionCall(): JsonField<FunctionCall> = functionCall

            @JsonProperty("max_tokens")
            @ExcludeMissing
            fun _maxTokens(): JsonField<Double> = maxTokens

            @JsonProperty("n")
            @ExcludeMissing
            fun _n(): JsonField<Double> = n

            @JsonProperty("presence_penalty")
            @ExcludeMissing
            fun _presencePenalty(): JsonField<Double> = presencePenalty

            @JsonProperty("response_format")
            @ExcludeMissing
            fun _responseFormat(): JsonField<ResponseFormat> = responseFormat

            @JsonProperty("stop")
            @ExcludeMissing
            fun _stop(): JsonField<List<String>> = stop

            @JsonProperty("temperature")
            @ExcludeMissing
            fun _temperature(): JsonField<Double> = temperature

            @JsonProperty("tool_choice")
            @ExcludeMissing
            fun _toolChoice(): JsonField<ToolChoice> = toolChoice

            @JsonProperty("top_p")
            @ExcludeMissing
            fun _topP(): JsonField<Double> = topP

            @JsonProperty("use_cache")
            @ExcludeMissing
            fun _useCache(): JsonField<Boolean> = useCache

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): OpenAIModelParams =
                apply {
                    if (validated) {
                      return@apply
                    }

                    frequencyPenalty()
                    functionCall().ifPresent { it.validate() }
                    maxTokens()
                    n()
                    presencePenalty()
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

                /** Returns a mutable builder for constructing an instance of [OpenAIModelParams]. */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [OpenAIModelParams]. */
            class Builder internal constructor() {

                private var frequencyPenalty: JsonField<Double> = JsonMissing.of()
                private var functionCall: JsonField<FunctionCall> = JsonMissing.of()
                private var maxTokens: JsonField<Double> = JsonMissing.of()
                private var n: JsonField<Double> = JsonMissing.of()
                private var presencePenalty: JsonField<Double> = JsonMissing.of()
                private var responseFormat: JsonField<ResponseFormat> = JsonMissing.of()
                private var stop: JsonField<MutableList<String>>? = null
                private var temperature: JsonField<Double> = JsonMissing.of()
                private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
                private var topP: JsonField<Double> = JsonMissing.of()
                private var useCache: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(openaiModelParams: OpenAIModelParams) =
                    apply {
                        frequencyPenalty = openaiModelParams.frequencyPenalty
                        functionCall = openaiModelParams.functionCall
                        maxTokens = openaiModelParams.maxTokens
                        n = openaiModelParams.n
                        presencePenalty = openaiModelParams.presencePenalty
                        responseFormat = openaiModelParams.responseFormat
                        stop = openaiModelParams.stop.map { it.toMutableList() }
                        temperature = openaiModelParams.temperature
                        toolChoice = openaiModelParams.toolChoice
                        topP = openaiModelParams.topP
                        useCache = openaiModelParams.useCache
                        additionalProperties = openaiModelParams.additionalProperties.toMutableMap()
                    }

                fun frequencyPenalty(frequencyPenalty: Double) = frequencyPenalty(JsonField.of(frequencyPenalty))

                fun frequencyPenalty(frequencyPenalty: JsonField<Double>) =
                    apply {
                        this.frequencyPenalty = frequencyPenalty
                    }

                fun functionCall(functionCall: FunctionCall) = functionCall(JsonField.of(functionCall))

                fun functionCall(functionCall: JsonField<FunctionCall>) =
                    apply {
                        this.functionCall = functionCall
                    }

                fun functionCall(unionMember0: FunctionCall.UnionMember0) = functionCall(FunctionCall.ofUnionMember0(unionMember0))

                fun functionCall(function: FunctionCall.Function) = functionCall(FunctionCall.ofFunction(function))

                fun maxTokens(maxTokens: Double) = maxTokens(JsonField.of(maxTokens))

                fun maxTokens(maxTokens: JsonField<Double>) =
                    apply {
                        this.maxTokens = maxTokens
                    }

                fun n(n: Double) = n(JsonField.of(n))

                fun n(n: JsonField<Double>) =
                    apply {
                        this.n = n
                    }

                fun presencePenalty(presencePenalty: Double) = presencePenalty(JsonField.of(presencePenalty))

                fun presencePenalty(presencePenalty: JsonField<Double>) =
                    apply {
                        this.presencePenalty = presencePenalty
                    }

                fun responseFormat(responseFormat: ResponseFormat) = responseFormat(JsonField.of(responseFormat))

                fun responseFormat(responseFormat: JsonField<ResponseFormat>) =
                    apply {
                        this.responseFormat = responseFormat
                    }

                fun responseFormat(jsonObject: ResponseFormat.JsonObject) = responseFormat(ResponseFormat.ofJsonObject(jsonObject))

                fun responseFormat(jsonSchema: ResponseFormat.JsonSchema) = responseFormat(ResponseFormat.ofJsonSchema(jsonSchema))

                fun responseFormat(text: ResponseFormat.Text) = responseFormat(ResponseFormat.ofText(text))

                fun responseFormat(nullableVariant: ResponseFormat.NullableVariant) = responseFormat(ResponseFormat.ofNullableVariant(nullableVariant))

                fun stop(stop: List<String>) = stop(JsonField.of(stop))

                fun stop(stop: JsonField<List<String>>) =
                    apply {
                        this.stop = stop.map { it.toMutableList() }
                    }

                fun addStop(stop: String) =
                    apply {
                        this.stop = (this.stop ?: JsonField.of(mutableListOf())).also {
                            checkKnown("stop", it).add(stop)
                        }
                    }

                fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

                fun temperature(temperature: JsonField<Double>) =
                    apply {
                        this.temperature = temperature
                    }

                fun toolChoice(toolChoice: ToolChoice) = toolChoice(JsonField.of(toolChoice))

                fun toolChoice(toolChoice: JsonField<ToolChoice>) =
                    apply {
                        this.toolChoice = toolChoice
                    }

                fun toolChoice(unionMember0: ToolChoice.UnionMember0) = toolChoice(ToolChoice.ofUnionMember0(unionMember0))

                fun toolChoice(function: ToolChoice.Function) = toolChoice(ToolChoice.ofFunction(function))

                fun topP(topP: Double) = topP(JsonField.of(topP))

                fun topP(topP: JsonField<Double>) =
                    apply {
                        this.topP = topP
                    }

                fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                fun useCache(useCache: JsonField<Boolean>) =
                    apply {
                        this.useCache = useCache
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                fun putAdditionalProperty(key: String, value: JsonValue) =
                    apply {
                        additionalProperties.put(key, value)
                    }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) =
                    apply {
                        additionalProperties.remove(key)
                    }

                fun removeAllAdditionalProperties(keys: Set<String>) =
                    apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                fun build(): OpenAIModelParams =
                    OpenAIModelParams(
                      frequencyPenalty,
                      functionCall,
                      maxTokens,
                      n,
                      presencePenalty,
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
            class FunctionCall private constructor(
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

                fun validate(): FunctionCall =
                    apply {
                        if (validated) {
                          return@apply
                        }

                        accept(object : Visitor<Unit> {
                            override fun visitUnionMember0(unionMember0: UnionMember0) {

                            }

                            override fun visitFunction(function: Function) {
                              function.validate()
                            }
                        })
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
                    fun ofUnionMember0(unionMember0: UnionMember0) = FunctionCall(unionMember0 = unionMember0)

                    @JvmStatic
                    fun ofFunction(function: Function) = FunctionCall(function = function)
                }

                /**
                 * An interface that defines how to map each variant of [FunctionCall] to a value
                 * of type [T].
                 */
                interface Visitor<out T> {

                    fun visitUnionMember0(unionMember0: UnionMember0): T

                    fun visitFunction(function: Function): T

                    /**
                     * Maps an unknown variant of [FunctionCall] to a value of type [T].
                     *
                     * An instance of [FunctionCall] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if the
                     * SDK is on an older version than the API, then the API may respond with new
                     * variants that the SDK is unaware of.
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
                      tryDeserialize(node, jacksonTypeRef<Function>()){ it.validate() }?.let {
                          return FunctionCall(function = it, _json = json)
                      }

                      return FunctionCall(_json = json)
                    }
                }

                internal class Serializer : BaseSerializer<FunctionCall>(FunctionCall::class) {

                    override fun serialize(value: FunctionCall, generator: JsonGenerator, provider: SerializerProvider) {
                      when {
                          value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                          value.function != null -> generator.writeObject(value.function)
                          value._json != null -> generator.writeObject(value._json)
                          else -> throw IllegalStateException("Invalid FunctionCall")
                      }
                    }
                }

                class UnionMember0 @JsonCreator private constructor(
                    private val value: JsonField<String>,

                ) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example, if
                     * the SDK is on an older version than the API, then the API may respond with new
                     * members that the SDK is unaware of.
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
                     * An instance of [UnionMember0] can contain an unknown value in a couple of cases:
                     *
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     *
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        AUTO,
                        NONE,
                        /**
                         * An enum member indicating that [UnionMember0] was instantiated with an unknown
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
                            AUTO -> Value.AUTO
                            NONE -> Value.NONE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known and
                     * don't want to throw for the unknown case.
                     *
                     * @throws BraintrustInvalidDataException if this class instance's value is a not a
                     * known member.
                     */
                    fun known(): Known =
                        when (this) {
                            AUTO -> Known.AUTO
                            NONE -> Known.NONE
                            else -> throw BraintrustInvalidDataException("Unknown UnionMember0: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws BraintrustInvalidDataException if this class instance's value does not
                     * have the expected primitive type.
                     */
                    fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

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
                class Function @JsonCreator private constructor(
                    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                ) {

                    fun name(): String = name.getRequired("name")

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun _name(): JsonField<String> = name

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Function =
                        apply {
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
                         *
                         * ```java
                         * .name()
                         * ```
                         */
                        @JvmStatic
                        fun builder() = Builder()
                    }

                    /** A builder for [Function]. */
                    class Builder internal constructor() {

                        private var name: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(function: Function) =
                            apply {
                                name = function.name
                                additionalProperties = function.additionalProperties.toMutableMap()
                            }

                        fun name(name: String) = name(JsonField.of(name))

                        fun name(name: JsonField<String>) =
                            apply {
                                this.name = name
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) =
                            apply {
                                additionalProperties.put(key, value)
                            }

                        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        fun removeAdditionalProperty(key: String) =
                            apply {
                                additionalProperties.remove(key)
                            }

                        fun removeAllAdditionalProperties(keys: Set<String>) =
                            apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                        fun build(): Function =
                            Function(
                              checkRequired(
                                "name", name
                              ), additionalProperties.toImmutable()
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

                    override fun toString() = "Function{name=$name, additionalProperties=$additionalProperties}"
                }
            }

            @JsonDeserialize(using = ResponseFormat.Deserializer::class)
            @JsonSerialize(using = ResponseFormat.Serializer::class)
            class ResponseFormat private constructor(
                private val jsonObject: JsonObject? = null,
                private val jsonSchema: JsonSchema? = null,
                private val text: Text? = null,
                private val nullableVariant: NullableVariant? = null,
                private val _json: JsonValue? = null,

            ) {

                fun jsonObject(): Optional<JsonObject> = Optional.ofNullable(jsonObject)

                fun jsonSchema(): Optional<JsonSchema> = Optional.ofNullable(jsonSchema)

                fun text(): Optional<Text> = Optional.ofNullable(text)

                fun nullableVariant(): Optional<NullableVariant> = Optional.ofNullable(nullableVariant)

                fun isJsonObject(): Boolean = jsonObject != null

                fun isJsonSchema(): Boolean = jsonSchema != null

                fun isText(): Boolean = text != null

                fun isNullableVariant(): Boolean = nullableVariant != null

                fun asJsonObject(): JsonObject = jsonObject.getOrThrow("jsonObject")

                fun asJsonSchema(): JsonSchema = jsonSchema.getOrThrow("jsonSchema")

                fun asText(): Text = text.getOrThrow("text")

                fun asNullableVariant(): NullableVariant = nullableVariant.getOrThrow("nullableVariant")

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

                private var validated: Boolean = false

                fun validate(): ResponseFormat =
                    apply {
                        if (validated) {
                          return@apply
                        }

                        accept(object : Visitor<Unit> {
                            override fun visitJsonObject(jsonObject: JsonObject) {
                              jsonObject.validate()
                            }

                            override fun visitJsonSchema(jsonSchema: JsonSchema) {
                              jsonSchema.validate()
                            }

                            override fun visitText(text: Text) {
                              text.validate()
                            }

                            override fun visitNullableVariant(nullableVariant: NullableVariant) {
                              nullableVariant.validate()
                            }
                        })
                        validated = true
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
                        nullableVariant != null -> "ResponseFormat{nullableVariant=$nullableVariant}"
                        _json != null -> "ResponseFormat{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid ResponseFormat")
                    }

                companion object {

                    @JvmStatic
                    fun ofJsonObject(jsonObject: JsonObject) = ResponseFormat(jsonObject = jsonObject)

                    @JvmStatic
                    fun ofJsonSchema(jsonSchema: JsonSchema) = ResponseFormat(jsonSchema = jsonSchema)

                    @JvmStatic
                    fun ofText(text: Text) = ResponseFormat(text = text)

                    @JvmStatic
                    fun ofNullableVariant(nullableVariant: NullableVariant) = ResponseFormat(nullableVariant = nullableVariant)
                }

                /**
                 * An interface that defines how to map each variant of [ResponseFormat] to a value
                 * of type [T].
                 */
                interface Visitor<out T> {

                    fun visitJsonObject(jsonObject: JsonObject): T

                    fun visitJsonSchema(jsonSchema: JsonSchema): T

                    fun visitText(text: Text): T

                    fun visitNullableVariant(nullableVariant: NullableVariant): T

                    /**
                     * Maps an unknown variant of [ResponseFormat] to a value of type [T].
                     *
                     * An instance of [ResponseFormat] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if the
                     * SDK is on an older version than the API, then the API may respond with new
                     * variants that the SDK is unaware of.
                     *
                     * @throws BraintrustInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                      throw BraintrustInvalidDataException("Unknown ResponseFormat: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<ResponseFormat>(ResponseFormat::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): ResponseFormat {
                      val json = JsonValue.fromJsonNode(node)

                      tryDeserialize(node, jacksonTypeRef<JsonObject>()){ it.validate() }?.let {
                          return ResponseFormat(jsonObject = it, _json = json)
                      }
                      tryDeserialize(node, jacksonTypeRef<JsonSchema>()){ it.validate() }?.let {
                          return ResponseFormat(jsonSchema = it, _json = json)
                      }
                      tryDeserialize(node, jacksonTypeRef<Text>()){ it.validate() }?.let {
                          return ResponseFormat(text = it, _json = json)
                      }
                      tryDeserialize(node, jacksonTypeRef<NullableVariant>()){ it.validate() }?.let {
                          return ResponseFormat(nullableVariant = it, _json = json)
                      }

                      return ResponseFormat(_json = json)
                    }
                }

                internal class Serializer : BaseSerializer<ResponseFormat>(ResponseFormat::class) {

                    override fun serialize(value: ResponseFormat, generator: JsonGenerator, provider: SerializerProvider) {
                      when {
                          value.jsonObject != null -> generator.writeObject(value.jsonObject)
                          value.jsonSchema != null -> generator.writeObject(value.jsonSchema)
                          value.text != null -> generator.writeObject(value.text)
                          value.nullableVariant != null -> generator.writeObject(value.nullableVariant)
                          value._json != null -> generator.writeObject(value._json)
                          else -> throw IllegalStateException("Invalid ResponseFormat")
                      }
                    }
                }

                @NoAutoDetect
                class JsonObject @JsonCreator private constructor(
                    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                ) {

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun _type(): JsonField<Type> = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): JsonObject =
                        apply {
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
                         *
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic
                        fun builder() = Builder()
                    }

                    /** A builder for [JsonObject]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(jsonObject: JsonObject) =
                            apply {
                                type = jsonObject.type
                                additionalProperties = jsonObject.additionalProperties.toMutableMap()
                            }

                        fun type(type: Type) = type(JsonField.of(type))

                        fun type(type: JsonField<Type>) =
                            apply {
                                this.type = type
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) =
                            apply {
                                additionalProperties.put(key, value)
                            }

                        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        fun removeAdditionalProperty(key: String) =
                            apply {
                                additionalProperties.remove(key)
                            }

                        fun removeAllAdditionalProperties(keys: Set<String>) =
                            apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                        fun build(): JsonObject =
                            JsonObject(
                              checkRequired(
                                "type", type
                              ), additionalProperties.toImmutable()
                            )
                    }

                    class Type @JsonCreator private constructor(
                        private val value: JsonField<String>,

                    ) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data that
                         * doesn't match any known member, and you want to know that value. For example, if
                         * the SDK is on an older version than the API, then the API may respond with new
                         * members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val JSON_OBJECT = of("json_object")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            JSON_OBJECT,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         *
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API may
                         *   respond with new members that the SDK is unaware of.
                         *
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            JSON_OBJECT,
                            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                                JSON_OBJECT -> Value.JSON_OBJECT
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always known and
                         * don't want to throw for the unknown case.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value is a not a
                         * known member.
                         */
                        fun known(): Known =
                            when (this) {
                                JSON_OBJECT -> Known.JSON_OBJECT
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily for
                         * debugging and generally doesn't throw.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value does not
                         * have the expected primitive type.
                         */
                        fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

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

                    override fun toString() = "JsonObject{type=$type, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class JsonSchema @JsonCreator private constructor(
                    @JsonProperty("json_schema") @ExcludeMissing private val jsonSchema: JsonField<InnerJsonSchema> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                ) {

                    fun jsonSchema(): InnerJsonSchema = jsonSchema.getRequired("json_schema")

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("json_schema")
                    @ExcludeMissing
                    fun _jsonSchema(): JsonField<InnerJsonSchema> = jsonSchema

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun _type(): JsonField<Type> = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): JsonSchema =
                        apply {
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
                         *
                         * ```java
                         * .jsonSchema()
                         * .type()
                         * ```
                         */
                        @JvmStatic
                        fun builder() = Builder()
                    }

                    /** A builder for [JsonSchema]. */
                    class Builder internal constructor() {

                        private var jsonSchema: JsonField<InnerJsonSchema>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(jsonSchema: JsonSchema) =
                            apply {
                                this.jsonSchema = jsonSchema.jsonSchema
                                type = jsonSchema.type
                                additionalProperties = jsonSchema.additionalProperties.toMutableMap()
                            }

                        fun jsonSchema(jsonSchema: InnerJsonSchema) = jsonSchema(JsonField.of(jsonSchema))

                        fun jsonSchema(jsonSchema: JsonField<InnerJsonSchema>) =
                            apply {
                                this.jsonSchema = jsonSchema
                            }

                        fun type(type: Type) = type(JsonField.of(type))

                        fun type(type: JsonField<Type>) =
                            apply {
                                this.type = type
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) =
                            apply {
                                additionalProperties.put(key, value)
                            }

                        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        fun removeAdditionalProperty(key: String) =
                            apply {
                                additionalProperties.remove(key)
                            }

                        fun removeAllAdditionalProperties(keys: Set<String>) =
                            apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                        fun build(): JsonSchema =
                            JsonSchema(
                              checkRequired(
                                "jsonSchema", jsonSchema
                              ),
                              checkRequired(
                                "type", type
                              ),
                              additionalProperties.toImmutable(),
                            )
                    }

                    @NoAutoDetect
                    class InnerJsonSchema @JsonCreator private constructor(
                        @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("description") @ExcludeMissing private val description: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("schema") @ExcludeMissing private val schema: JsonField<Schema> = JsonMissing.of(),
                        @JsonProperty("strict") @ExcludeMissing private val strict: JsonField<Boolean> = JsonMissing.of(),
                        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                    ) {

                        fun name(): String = name.getRequired("name")

                        fun description(): Optional<String> = Optional.ofNullable(description.getNullable("description"))

                        fun schema(): Optional<Schema> = Optional.ofNullable(schema.getNullable("schema"))

                        fun strict(): Optional<Boolean> = Optional.ofNullable(strict.getNullable("strict"))

                        @JsonProperty("name")
                        @ExcludeMissing
                        fun _name(): JsonField<String> = name

                        @JsonProperty("description")
                        @ExcludeMissing
                        fun _description(): JsonField<String> = description

                        @JsonProperty("schema")
                        @ExcludeMissing
                        fun _schema(): JsonField<Schema> = schema

                        @JsonProperty("strict")
                        @ExcludeMissing
                        fun _strict(): JsonField<Boolean> = strict

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): InnerJsonSchema =
                            apply {
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
                             * Returns a mutable builder for constructing an instance of [InnerJsonSchema].
                             *
                             * The following fields are required:
                             *
                             * ```java
                             * .name()
                             * ```
                             */
                            @JvmStatic
                            fun builder() = Builder()
                        }

                        /** A builder for [InnerJsonSchema]. */
                        class Builder internal constructor() {

                            private var name: JsonField<String>? = null
                            private var description: JsonField<String> = JsonMissing.of()
                            private var schema: JsonField<Schema> = JsonMissing.of()
                            private var strict: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                            @JvmSynthetic
                            internal fun from(innerJsonSchema: InnerJsonSchema) =
                                apply {
                                    name = innerJsonSchema.name
                                    description = innerJsonSchema.description
                                    schema = innerJsonSchema.schema
                                    strict = innerJsonSchema.strict
                                    additionalProperties = innerJsonSchema.additionalProperties.toMutableMap()
                                }

                            fun name(name: String) = name(JsonField.of(name))

                            fun name(name: JsonField<String>) =
                                apply {
                                    this.name = name
                                }

                            fun description(description: String) = description(JsonField.of(description))

                            fun description(description: JsonField<String>) =
                                apply {
                                    this.description = description
                                }

                            fun schema(schema: Schema) = schema(JsonField.of(schema))

                            fun schema(schema: JsonField<Schema>) =
                                apply {
                                    this.schema = schema
                                }

                            fun strict(strict: Boolean?) = strict(JsonField.ofNullable(strict))

                            fun strict(strict: Boolean) = strict(strict as Boolean?)

                            fun strict(strict: Optional<Boolean>) = strict(strict.getOrNull())

                            fun strict(strict: JsonField<Boolean>) =
                                apply {
                                    this.strict = strict
                                }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) =
                                apply {
                                    additionalProperties.put(key, value)
                                }

                            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            fun removeAdditionalProperty(key: String) =
                                apply {
                                    additionalProperties.remove(key)
                                }

                            fun removeAllAdditionalProperties(keys: Set<String>) =
                                apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                            fun build(): InnerJsonSchema =
                                InnerJsonSchema(
                                  checkRequired(
                                    "name", name
                                  ),
                                  description,
                                  schema,
                                  strict,
                                  additionalProperties.toImmutable(),
                                )
                        }

                        @NoAutoDetect
                        class Schema @JsonCreator private constructor(
                            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                        ) {

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                            private var validated: Boolean = false

                            fun validate(): Schema =
                                apply {
                                    if (validated) {
                                      return@apply
                                    }

                                    validated = true
                                }

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                /** Returns a mutable builder for constructing an instance of [Schema]. */
                                @JvmStatic
                                fun builder() = Builder()
                            }

                            /** A builder for [Schema]. */
                            class Builder internal constructor() {

                                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                                @JvmSynthetic
                                internal fun from(schema: Schema) =
                                    apply {
                                        additionalProperties = schema.additionalProperties.toMutableMap()
                                    }

                                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                    apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                fun putAdditionalProperty(key: String, value: JsonValue) =
                                    apply {
                                        additionalProperties.put(key, value)
                                    }

                                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                                    apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                fun removeAdditionalProperty(key: String) =
                                    apply {
                                        additionalProperties.remove(key)
                                    }

                                fun removeAllAdditionalProperties(keys: Set<String>) =
                                    apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

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

                            override fun toString() = "Schema{additionalProperties=$additionalProperties}"
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

                        override fun toString() = "InnerJsonSchema{name=$name, description=$description, schema=$schema, strict=$strict, additionalProperties=$additionalProperties}"
                    }

                    class Type @JsonCreator private constructor(
                        private val value: JsonField<String>,

                    ) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data that
                         * doesn't match any known member, and you want to know that value. For example, if
                         * the SDK is on an older version than the API, then the API may respond with new
                         * members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val JSON_SCHEMA = of("json_schema")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            JSON_SCHEMA,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         *
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API may
                         *   respond with new members that the SDK is unaware of.
                         *
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            JSON_SCHEMA,
                            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                                JSON_SCHEMA -> Value.JSON_SCHEMA
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always known and
                         * don't want to throw for the unknown case.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value is a not a
                         * known member.
                         */
                        fun known(): Known =
                            when (this) {
                                JSON_SCHEMA -> Known.JSON_SCHEMA
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily for
                         * debugging and generally doesn't throw.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value does not
                         * have the expected primitive type.
                         */
                        fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

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

                    override fun toString() = "JsonSchema{jsonSchema=$jsonSchema, type=$type, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class Text @JsonCreator private constructor(
                    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                ) {

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun _type(): JsonField<Type> = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Text =
                        apply {
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
                         *
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic
                        fun builder() = Builder()
                    }

                    /** A builder for [Text]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(text: Text) =
                            apply {
                                type = text.type
                                additionalProperties = text.additionalProperties.toMutableMap()
                            }

                        fun type(type: Type) = type(JsonField.of(type))

                        fun type(type: JsonField<Type>) =
                            apply {
                                this.type = type
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) =
                            apply {
                                additionalProperties.put(key, value)
                            }

                        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        fun removeAdditionalProperty(key: String) =
                            apply {
                                additionalProperties.remove(key)
                            }

                        fun removeAllAdditionalProperties(keys: Set<String>) =
                            apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                        fun build(): Text =
                            Text(
                              checkRequired(
                                "type", type
                              ), additionalProperties.toImmutable()
                            )
                    }

                    class Type @JsonCreator private constructor(
                        private val value: JsonField<String>,

                    ) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data that
                         * doesn't match any known member, and you want to know that value. For example, if
                         * the SDK is on an older version than the API, then the API may respond with new
                         * members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val TEXT = of("text")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            TEXT,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         *
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API may
                         *   respond with new members that the SDK is unaware of.
                         *
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            TEXT,
                            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                                TEXT -> Value.TEXT
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always known and
                         * don't want to throw for the unknown case.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value is a not a
                         * known member.
                         */
                        fun known(): Known =
                            when (this) {
                                TEXT -> Known.TEXT
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily for
                         * debugging and generally doesn't throw.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value does not
                         * have the expected primitive type.
                         */
                        fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

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

                    override fun toString() = "Text{type=$type, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class NullableVariant @JsonCreator private constructor(
                    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): NullableVariant =
                        apply {
                            if (validated) {
                              return@apply
                            }

                            validated = true
                        }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [NullableVariant]. */
                        @JvmStatic
                        fun builder() = Builder()
                    }

                    /** A builder for [NullableVariant]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(nullableVariant: NullableVariant) =
                            apply {
                                additionalProperties = nullableVariant.additionalProperties.toMutableMap()
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) =
                            apply {
                                additionalProperties.put(key, value)
                            }

                        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        fun removeAdditionalProperty(key: String) =
                            apply {
                                additionalProperties.remove(key)
                            }

                        fun removeAllAdditionalProperties(keys: Set<String>) =
                            apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                        fun build(): NullableVariant = NullableVariant(additionalProperties.toImmutable())
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

                    override fun toString() = "NullableVariant{additionalProperties=$additionalProperties}"
                }
            }

            @JsonDeserialize(using = ToolChoice.Deserializer::class)
            @JsonSerialize(using = ToolChoice.Serializer::class)
            class ToolChoice private constructor(
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

                fun validate(): ToolChoice =
                    apply {
                        if (validated) {
                          return@apply
                        }

                        accept(object : Visitor<Unit> {
                            override fun visitUnionMember0(unionMember0: UnionMember0) {

                            }

                            override fun visitFunction(function: Function) {
                              function.validate()
                            }
                        })
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
                    fun ofUnionMember0(unionMember0: UnionMember0) = ToolChoice(unionMember0 = unionMember0)

                    @JvmStatic
                    fun ofFunction(function: Function) = ToolChoice(function = function)
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
                     * deserialized from data that doesn't match any known variant. For example, if the
                     * SDK is on an older version than the API, then the API may respond with new
                     * variants that the SDK is unaware of.
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
                      tryDeserialize(node, jacksonTypeRef<Function>()){ it.validate() }?.let {
                          return ToolChoice(function = it, _json = json)
                      }

                      return ToolChoice(_json = json)
                    }
                }

                internal class Serializer : BaseSerializer<ToolChoice>(ToolChoice::class) {

                    override fun serialize(value: ToolChoice, generator: JsonGenerator, provider: SerializerProvider) {
                      when {
                          value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                          value.function != null -> generator.writeObject(value.function)
                          value._json != null -> generator.writeObject(value._json)
                          else -> throw IllegalStateException("Invalid ToolChoice")
                      }
                    }
                }

                class UnionMember0 @JsonCreator private constructor(
                    private val value: JsonField<String>,

                ) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example, if
                     * the SDK is on an older version than the API, then the API may respond with new
                     * members that the SDK is unaware of.
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
                     * An instance of [UnionMember0] can contain an unknown value in a couple of cases:
                     *
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     *
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        AUTO,
                        NONE,
                        REQUIRED,
                        /**
                         * An enum member indicating that [UnionMember0] was instantiated with an unknown
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
                            AUTO -> Value.AUTO
                            NONE -> Value.NONE
                            REQUIRED -> Value.REQUIRED
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known and
                     * don't want to throw for the unknown case.
                     *
                     * @throws BraintrustInvalidDataException if this class instance's value is a not a
                     * known member.
                     */
                    fun known(): Known =
                        when (this) {
                            AUTO -> Known.AUTO
                            NONE -> Known.NONE
                            REQUIRED -> Known.REQUIRED
                            else -> throw BraintrustInvalidDataException("Unknown UnionMember0: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws BraintrustInvalidDataException if this class instance's value does not
                     * have the expected primitive type.
                     */
                    fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

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
                class Function @JsonCreator private constructor(
                    @JsonProperty("function") @ExcludeMissing private val function: JsonField<InnerFunction> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                ) {

                    fun function(): InnerFunction = function.getRequired("function")

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("function")
                    @ExcludeMissing
                    fun _function(): JsonField<InnerFunction> = function

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun _type(): JsonField<Type> = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Function =
                        apply {
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
                         *
                         * ```java
                         * .function()
                         * .type()
                         * ```
                         */
                        @JvmStatic
                        fun builder() = Builder()
                    }

                    /** A builder for [Function]. */
                    class Builder internal constructor() {

                        private var function: JsonField<InnerFunction>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(function: Function) =
                            apply {
                                this.function = function.function
                                type = function.type
                                additionalProperties = function.additionalProperties.toMutableMap()
                            }

                        fun function(function: InnerFunction) = function(JsonField.of(function))

                        fun function(function: JsonField<InnerFunction>) =
                            apply {
                                this.function = function
                            }

                        fun type(type: Type) = type(JsonField.of(type))

                        fun type(type: JsonField<Type>) =
                            apply {
                                this.type = type
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) =
                            apply {
                                additionalProperties.put(key, value)
                            }

                        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        fun removeAdditionalProperty(key: String) =
                            apply {
                                additionalProperties.remove(key)
                            }

                        fun removeAllAdditionalProperties(keys: Set<String>) =
                            apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                        fun build(): Function =
                            Function(
                              checkRequired(
                                "function", function
                              ),
                              checkRequired(
                                "type", type
                              ),
                              additionalProperties.toImmutable(),
                            )
                    }

                    @NoAutoDetect
                    class InnerFunction @JsonCreator private constructor(
                        @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
                        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                    ) {

                        fun name(): String = name.getRequired("name")

                        @JsonProperty("name")
                        @ExcludeMissing
                        fun _name(): JsonField<String> = name

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): InnerFunction =
                            apply {
                                if (validated) {
                                  return@apply
                                }

                                name()
                                validated = true
                            }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of [InnerFunction].
                             *
                             * The following fields are required:
                             *
                             * ```java
                             * .name()
                             * ```
                             */
                            @JvmStatic
                            fun builder() = Builder()
                        }

                        /** A builder for [InnerFunction]. */
                        class Builder internal constructor() {

                            private var name: JsonField<String>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                            @JvmSynthetic
                            internal fun from(innerFunction: InnerFunction) =
                                apply {
                                    name = innerFunction.name
                                    additionalProperties = innerFunction.additionalProperties.toMutableMap()
                                }

                            fun name(name: String) = name(JsonField.of(name))

                            fun name(name: JsonField<String>) =
                                apply {
                                    this.name = name
                                }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) =
                                apply {
                                    additionalProperties.put(key, value)
                                }

                            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            fun removeAdditionalProperty(key: String) =
                                apply {
                                    additionalProperties.remove(key)
                                }

                            fun removeAllAdditionalProperties(keys: Set<String>) =
                                apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                            fun build(): InnerFunction =
                                InnerFunction(
                                  checkRequired(
                                    "name", name
                                  ), additionalProperties.toImmutable()
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

                        override fun toString() = "InnerFunction{name=$name, additionalProperties=$additionalProperties}"
                    }

                    class Type @JsonCreator private constructor(
                        private val value: JsonField<String>,

                    ) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data that
                         * doesn't match any known member, and you want to know that value. For example, if
                         * the SDK is on an older version than the API, then the API may respond with new
                         * members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val FUNCTION = of("function")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            FUNCTION,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         *
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API may
                         *   respond with new members that the SDK is unaware of.
                         *
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            FUNCTION,
                            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                                FUNCTION -> Value.FUNCTION
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always known and
                         * don't want to throw for the unknown case.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value is a not a
                         * known member.
                         */
                        fun known(): Known =
                            when (this) {
                                FUNCTION -> Known.FUNCTION
                                else -> throw BraintrustInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily for
                         * debugging and generally doesn't throw.
                         *
                         * @throws BraintrustInvalidDataException if this class instance's value does not
                         * have the expected primitive type.
                         */
                        fun asString(): String = _value().asString().orElseThrow { BraintrustInvalidDataException("Value is not a String") }

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

                    override fun toString() = "Function{function=$function, type=$type, additionalProperties=$additionalProperties}"
                }
            }

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is OpenAIModelParams && frequencyPenalty == other.frequencyPenalty && functionCall == other.functionCall && maxTokens == other.maxTokens && n == other.n && presencePenalty == other.presencePenalty && responseFormat == other.responseFormat && stop == other.stop && temperature == other.temperature && toolChoice == other.toolChoice && topP == other.topP && useCache == other.useCache && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(frequencyPenalty, functionCall, maxTokens, n, presencePenalty, responseFormat, stop, temperature, toolChoice, topP, useCache, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "OpenAIModelParams{frequencyPenalty=$frequencyPenalty, functionCall=$functionCall, maxTokens=$maxTokens, n=$n, presencePenalty=$presencePenalty, responseFormat=$responseFormat, stop=$stop, temperature=$temperature, toolChoice=$toolChoice, topP=$topP, useCache=$useCache, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class AnthropicModelParams @JsonCreator private constructor(
            @JsonProperty("max_tokens") @ExcludeMissing private val maxTokens: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("temperature") @ExcludeMissing private val temperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("max_tokens_to_sample") @ExcludeMissing private val maxTokensToSample: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("stop_sequences") @ExcludeMissing private val stopSequences: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("top_k") @ExcludeMissing private val topK: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("top_p") @ExcludeMissing private val topP: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("use_cache") @ExcludeMissing private val useCache: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

        ) {

            fun maxTokens(): Double = maxTokens.getRequired("max_tokens")

            fun temperature(): Double = temperature.getRequired("temperature")

            /** This is a legacy parameter that should not be used. */
            fun maxTokensToSample(): Optional<Double> = Optional.ofNullable(maxTokensToSample.getNullable("max_tokens_to_sample"))

            fun stopSequences(): Optional<List<String>> = Optional.ofNullable(stopSequences.getNullable("stop_sequences"))

            fun topK(): Optional<Double> = Optional.ofNullable(topK.getNullable("top_k"))

            fun topP(): Optional<Double> = Optional.ofNullable(topP.getNullable("top_p"))

            fun useCache(): Optional<Boolean> = Optional.ofNullable(useCache.getNullable("use_cache"))

            @JsonProperty("max_tokens")
            @ExcludeMissing
            fun _maxTokens(): JsonField<Double> = maxTokens

            @JsonProperty("temperature")
            @ExcludeMissing
            fun _temperature(): JsonField<Double> = temperature

            /** This is a legacy parameter that should not be used. */
            @JsonProperty("max_tokens_to_sample")
            @ExcludeMissing
            fun _maxTokensToSample(): JsonField<Double> = maxTokensToSample

            @JsonProperty("stop_sequences")
            @ExcludeMissing
            fun _stopSequences(): JsonField<List<String>> = stopSequences

            @JsonProperty("top_k")
            @ExcludeMissing
            fun _topK(): JsonField<Double> = topK

            @JsonProperty("top_p")
            @ExcludeMissing
            fun _topP(): JsonField<Double> = topP

            @JsonProperty("use_cache")
            @ExcludeMissing
            fun _useCache(): JsonField<Boolean> = useCache

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AnthropicModelParams =
                apply {
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
                 * Returns a mutable builder for constructing an instance of
                 * [AnthropicModelParams].
                 *
                 * The following fields are required:
                 *
                 * ```java
                 * .maxTokens()
                 * .temperature()
                 * ```
                 */
                @JvmStatic
                fun builder() = Builder()
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
                internal fun from(anthropicModelParams: AnthropicModelParams) =
                    apply {
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

                fun maxTokens(maxTokens: JsonField<Double>) =
                    apply {
                        this.maxTokens = maxTokens
                    }

                fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

                fun temperature(temperature: JsonField<Double>) =
                    apply {
                        this.temperature = temperature
                    }

                /** This is a legacy parameter that should not be used. */
                fun maxTokensToSample(maxTokensToSample: Double) = maxTokensToSample(JsonField.of(maxTokensToSample))

                /** This is a legacy parameter that should not be used. */
                fun maxTokensToSample(maxTokensToSample: JsonField<Double>) =
                    apply {
                        this.maxTokensToSample = maxTokensToSample
                    }

                fun stopSequences(stopSequences: List<String>) = stopSequences(JsonField.of(stopSequences))

                fun stopSequences(stopSequences: JsonField<List<String>>) =
                    apply {
                        this.stopSequences = stopSequences.map { it.toMutableList() }
                    }

                fun addStopSequence(stopSequence: String) =
                    apply {
                        stopSequences = (stopSequences ?: JsonField.of(mutableListOf())).also {
                            checkKnown("stopSequences", it).add(stopSequence)
                        }
                    }

                fun topK(topK: Double) = topK(JsonField.of(topK))

                fun topK(topK: JsonField<Double>) =
                    apply {
                        this.topK = topK
                    }

                fun topP(topP: Double) = topP(JsonField.of(topP))

                fun topP(topP: JsonField<Double>) =
                    apply {
                        this.topP = topP
                    }

                fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                fun useCache(useCache: JsonField<Boolean>) =
                    apply {
                        this.useCache = useCache
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                fun putAdditionalProperty(key: String, value: JsonValue) =
                    apply {
                        additionalProperties.put(key, value)
                    }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) =
                    apply {
                        additionalProperties.remove(key)
                    }

                fun removeAllAdditionalProperties(keys: Set<String>) =
                    apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                fun build(): AnthropicModelParams =
                    AnthropicModelParams(
                      checkRequired(
                        "maxTokens", maxTokens
                      ),
                      checkRequired(
                        "temperature", temperature
                      ),
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

            override fun toString() = "AnthropicModelParams{maxTokens=$maxTokens, temperature=$temperature, maxTokensToSample=$maxTokensToSample, stopSequences=$stopSequences, topK=$topK, topP=$topP, useCache=$useCache, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class GoogleModelParams @JsonCreator private constructor(
            @JsonProperty("maxOutputTokens") @ExcludeMissing private val maxOutputTokens: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("temperature") @ExcludeMissing private val temperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("topK") @ExcludeMissing private val topK: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("topP") @ExcludeMissing private val topP: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("use_cache") @ExcludeMissing private val useCache: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

        ) {

            fun maxOutputTokens(): Optional<Double> = Optional.ofNullable(maxOutputTokens.getNullable("maxOutputTokens"))

            fun temperature(): Optional<Double> = Optional.ofNullable(temperature.getNullable("temperature"))

            fun topK(): Optional<Double> = Optional.ofNullable(topK.getNullable("topK"))

            fun topP(): Optional<Double> = Optional.ofNullable(topP.getNullable("topP"))

            fun useCache(): Optional<Boolean> = Optional.ofNullable(useCache.getNullable("use_cache"))

            @JsonProperty("maxOutputTokens")
            @ExcludeMissing
            fun _maxOutputTokens(): JsonField<Double> = maxOutputTokens

            @JsonProperty("temperature")
            @ExcludeMissing
            fun _temperature(): JsonField<Double> = temperature

            @JsonProperty("topK")
            @ExcludeMissing
            fun _topK(): JsonField<Double> = topK

            @JsonProperty("topP")
            @ExcludeMissing
            fun _topP(): JsonField<Double> = topP

            @JsonProperty("use_cache")
            @ExcludeMissing
            fun _useCache(): JsonField<Boolean> = useCache

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): GoogleModelParams =
                apply {
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

                /** Returns a mutable builder for constructing an instance of [GoogleModelParams]. */
                @JvmStatic
                fun builder() = Builder()
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
                internal fun from(googleModelParams: GoogleModelParams) =
                    apply {
                        maxOutputTokens = googleModelParams.maxOutputTokens
                        temperature = googleModelParams.temperature
                        topK = googleModelParams.topK
                        topP = googleModelParams.topP
                        useCache = googleModelParams.useCache
                        additionalProperties = googleModelParams.additionalProperties.toMutableMap()
                    }

                fun maxOutputTokens(maxOutputTokens: Double) = maxOutputTokens(JsonField.of(maxOutputTokens))

                fun maxOutputTokens(maxOutputTokens: JsonField<Double>) =
                    apply {
                        this.maxOutputTokens = maxOutputTokens
                    }

                fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

                fun temperature(temperature: JsonField<Double>) =
                    apply {
                        this.temperature = temperature
                    }

                fun topK(topK: Double) = topK(JsonField.of(topK))

                fun topK(topK: JsonField<Double>) =
                    apply {
                        this.topK = topK
                    }

                fun topP(topP: Double) = topP(JsonField.of(topP))

                fun topP(topP: JsonField<Double>) =
                    apply {
                        this.topP = topP
                    }

                fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                fun useCache(useCache: JsonField<Boolean>) =
                    apply {
                        this.useCache = useCache
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                fun putAdditionalProperty(key: String, value: JsonValue) =
                    apply {
                        additionalProperties.put(key, value)
                    }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) =
                    apply {
                        additionalProperties.remove(key)
                    }

                fun removeAllAdditionalProperties(keys: Set<String>) =
                    apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

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

            override fun toString() = "GoogleModelParams{maxOutputTokens=$maxOutputTokens, temperature=$temperature, topK=$topK, topP=$topP, useCache=$useCache, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class WindowAiModelParams @JsonCreator private constructor(
            @JsonProperty("temperature") @ExcludeMissing private val temperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("topK") @ExcludeMissing private val topK: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("use_cache") @ExcludeMissing private val useCache: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

        ) {

            fun temperature(): Optional<Double> = Optional.ofNullable(temperature.getNullable("temperature"))

            fun topK(): Optional<Double> = Optional.ofNullable(topK.getNullable("topK"))

            fun useCache(): Optional<Boolean> = Optional.ofNullable(useCache.getNullable("use_cache"))

            @JsonProperty("temperature")
            @ExcludeMissing
            fun _temperature(): JsonField<Double> = temperature

            @JsonProperty("topK")
            @ExcludeMissing
            fun _topK(): JsonField<Double> = topK

            @JsonProperty("use_cache")
            @ExcludeMissing
            fun _useCache(): JsonField<Boolean> = useCache

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): WindowAiModelParams =
                apply {
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

                /** Returns a mutable builder for constructing an instance of [WindowAiModelParams]. */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [WindowAiModelParams]. */
            class Builder internal constructor() {

                private var temperature: JsonField<Double> = JsonMissing.of()
                private var topK: JsonField<Double> = JsonMissing.of()
                private var useCache: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(windowAiModelParams: WindowAiModelParams) =
                    apply {
                        temperature = windowAiModelParams.temperature
                        topK = windowAiModelParams.topK
                        useCache = windowAiModelParams.useCache
                        additionalProperties = windowAiModelParams.additionalProperties.toMutableMap()
                    }

                fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

                fun temperature(temperature: JsonField<Double>) =
                    apply {
                        this.temperature = temperature
                    }

                fun topK(topK: Double) = topK(JsonField.of(topK))

                fun topK(topK: JsonField<Double>) =
                    apply {
                        this.topK = topK
                    }

                fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                fun useCache(useCache: JsonField<Boolean>) =
                    apply {
                        this.useCache = useCache
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                fun putAdditionalProperty(key: String, value: JsonValue) =
                    apply {
                        additionalProperties.put(key, value)
                    }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) =
                    apply {
                        additionalProperties.remove(key)
                    }

                fun removeAllAdditionalProperties(keys: Set<String>) =
                    apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

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

            override fun toString() = "WindowAiModelParams{temperature=$temperature, topK=$topK, useCache=$useCache, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class JsCompletionParams @JsonCreator private constructor(
            @JsonProperty("use_cache") @ExcludeMissing private val useCache: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

        ) {

            fun useCache(): Optional<Boolean> = Optional.ofNullable(useCache.getNullable("use_cache"))

            @JsonProperty("use_cache")
            @ExcludeMissing
            fun _useCache(): JsonField<Boolean> = useCache

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): JsCompletionParams =
                apply {
                    if (validated) {
                      return@apply
                    }

                    useCache()
                    validated = true
                }

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [JsCompletionParams]. */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [JsCompletionParams]. */
            class Builder internal constructor() {

                private var useCache: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(jsCompletionParams: JsCompletionParams) =
                    apply {
                        useCache = jsCompletionParams.useCache
                        additionalProperties = jsCompletionParams.additionalProperties.toMutableMap()
                    }

                fun useCache(useCache: Boolean) = useCache(JsonField.of(useCache))

                fun useCache(useCache: JsonField<Boolean>) =
                    apply {
                        this.useCache = useCache
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                fun putAdditionalProperty(key: String, value: JsonValue) =
                    apply {
                        additionalProperties.put(key, value)
                    }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) =
                    apply {
                        additionalProperties.remove(key)
                    }

                fun removeAllAdditionalProperties(keys: Set<String>) =
                    apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                fun build(): JsCompletionParams =
                    JsCompletionParams(
                      useCache, additionalProperties.toImmutable()
                    )
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

            override fun toString() = "JsCompletionParams{useCache=$useCache, additionalProperties=$additionalProperties}"
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

    override fun toString() = "PromptOptions{model=$model, params=$params, position=$position, additionalProperties=$additionalProperties}"
}
