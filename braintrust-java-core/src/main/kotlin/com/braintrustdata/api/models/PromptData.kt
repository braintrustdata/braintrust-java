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

/** The prompt, model, and its parameters */
@NoAutoDetect
class PromptData @JsonCreator private constructor(
    @JsonProperty("options") @ExcludeMissing private val options: JsonField<PromptOptions> = JsonMissing.of(),
    @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<Origin> = JsonMissing.of(),
    @JsonProperty("parser") @ExcludeMissing private val parser: JsonField<Parser> = JsonMissing.of(),
    @JsonProperty("prompt") @ExcludeMissing private val prompt: JsonField<Prompt> = JsonMissing.of(),
    @JsonProperty("tool_functions") @ExcludeMissing private val toolFunctions: JsonField<List<ToolFunction>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    fun options(): Optional<PromptOptions> = Optional.ofNullable(options.getNullable("options"))

    fun origin(): Optional<Origin> = Optional.ofNullable(origin.getNullable("origin"))

    fun parser(): Optional<Parser> = Optional.ofNullable(parser.getNullable("parser"))

    fun prompt(): Optional<Prompt> = Optional.ofNullable(prompt.getNullable("prompt"))

    fun toolFunctions(): Optional<List<ToolFunction>> = Optional.ofNullable(toolFunctions.getNullable("tool_functions"))

    @JsonProperty("options")
    @ExcludeMissing
    fun _options(): JsonField<PromptOptions> = options

    @JsonProperty("origin")
    @ExcludeMissing
    fun _origin(): JsonField<Origin> = origin

    @JsonProperty("parser")
    @ExcludeMissing
    fun _parser(): JsonField<Parser> = parser

    @JsonProperty("prompt")
    @ExcludeMissing
    fun _prompt(): JsonField<Prompt> = prompt

    @JsonProperty("tool_functions")
    @ExcludeMissing
    fun _toolFunctions(): JsonField<List<ToolFunction>> = toolFunctions

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PromptData =
        apply {
            if (validated) {
              return@apply
            }

            options().ifPresent { it.validate() }
            origin().ifPresent { it.validate() }
            parser().ifPresent { it.validate() }
            prompt().ifPresent { it.validate() }
            toolFunctions().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [PromptData]. */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [PromptData]. */
    class Builder internal constructor() {

        private var options: JsonField<PromptOptions> = JsonMissing.of()
        private var origin: JsonField<Origin> = JsonMissing.of()
        private var parser: JsonField<Parser> = JsonMissing.of()
        private var prompt: JsonField<Prompt> = JsonMissing.of()
        private var toolFunctions: JsonField<MutableList<ToolFunction>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(promptData: PromptData) =
            apply {
                options = promptData.options
                origin = promptData.origin
                parser = promptData.parser
                prompt = promptData.prompt
                toolFunctions = promptData.toolFunctions.map { it.toMutableList() }
                additionalProperties = promptData.additionalProperties.toMutableMap()
            }

        fun options(options: PromptOptions?) = options(JsonField.ofNullable(options))

        fun options(options: Optional<PromptOptions>) = options(options.getOrNull())

        fun options(options: JsonField<PromptOptions>) =
            apply {
                this.options = options
            }

        fun origin(origin: Origin?) = origin(JsonField.ofNullable(origin))

        fun origin(origin: Optional<Origin>) = origin(origin.getOrNull())

        fun origin(origin: JsonField<Origin>) =
            apply {
                this.origin = origin
            }

        fun parser(parser: Parser?) = parser(JsonField.ofNullable(parser))

        fun parser(parser: Optional<Parser>) = parser(parser.getOrNull())

        fun parser(parser: JsonField<Parser>) =
            apply {
                this.parser = parser
            }

        fun prompt(prompt: Prompt) = prompt(JsonField.of(prompt))

        fun prompt(prompt: JsonField<Prompt>) =
            apply {
                this.prompt = prompt
            }

        fun prompt(completion: Prompt.Completion) = prompt(Prompt.ofCompletion(completion))

        fun prompt(chat: Prompt.Chat) = prompt(Prompt.ofChat(chat))

        fun prompt(nullableVariant: Prompt.NullableVariant) = prompt(Prompt.ofNullableVariant(nullableVariant))

        fun toolFunctions(toolFunctions: List<ToolFunction>?) = toolFunctions(JsonField.ofNullable(toolFunctions))

        fun toolFunctions(toolFunctions: Optional<List<ToolFunction>>) = toolFunctions(toolFunctions.getOrNull())

        fun toolFunctions(toolFunctions: JsonField<List<ToolFunction>>) =
            apply {
                this.toolFunctions = toolFunctions.map { it.toMutableList() }
            }

        fun addToolFunction(toolFunction: ToolFunction) =
            apply {
                toolFunctions = (toolFunctions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("toolFunctions", it).add(toolFunction)
                }
            }

        fun addToolFunction(function: ToolFunction.Function) = addToolFunction(ToolFunction.ofFunction(function))

        fun addToolFunction(global: ToolFunction.Global) = addToolFunction(ToolFunction.ofGlobal(global))

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

        fun build(): PromptData =
            PromptData(
              options,
              origin,
              parser,
              prompt,
              (toolFunctions ?: JsonMissing.of()).map { it.toImmutable() },
              additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Origin @JsonCreator private constructor(
        @JsonProperty("project_id") @ExcludeMissing private val projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_id") @ExcludeMissing private val promptId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_version") @ExcludeMissing private val promptVersion: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        fun projectId(): Optional<String> = Optional.ofNullable(projectId.getNullable("project_id"))

        fun promptId(): Optional<String> = Optional.ofNullable(promptId.getNullable("prompt_id"))

        fun promptVersion(): Optional<String> = Optional.ofNullable(promptVersion.getNullable("prompt_version"))

        @JsonProperty("project_id")
        @ExcludeMissing
        fun _projectId(): JsonField<String> = projectId

        @JsonProperty("prompt_id")
        @ExcludeMissing
        fun _promptId(): JsonField<String> = promptId

        @JsonProperty("prompt_version")
        @ExcludeMissing
        fun _promptVersion(): JsonField<String> = promptVersion

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Origin =
            apply {
                if (validated) {
                  return@apply
                }

                projectId()
                promptId()
                promptVersion()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Origin]. */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Origin]. */
        class Builder internal constructor() {

            private var projectId: JsonField<String> = JsonMissing.of()
            private var promptId: JsonField<String> = JsonMissing.of()
            private var promptVersion: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(origin: Origin) =
                apply {
                    projectId = origin.projectId
                    promptId = origin.promptId
                    promptVersion = origin.promptVersion
                    additionalProperties = origin.additionalProperties.toMutableMap()
                }

            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            fun projectId(projectId: JsonField<String>) =
                apply {
                    this.projectId = projectId
                }

            fun promptId(promptId: String) = promptId(JsonField.of(promptId))

            fun promptId(promptId: JsonField<String>) =
                apply {
                    this.promptId = promptId
                }

            fun promptVersion(promptVersion: String) = promptVersion(JsonField.of(promptVersion))

            fun promptVersion(promptVersion: JsonField<String>) =
                apply {
                    this.promptVersion = promptVersion
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

            fun build(): Origin =
                Origin(
                  projectId,
                  promptId,
                  promptVersion,
                  additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Origin && projectId == other.projectId && promptId == other.promptId && promptVersion == other.promptVersion && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(projectId, promptId, promptVersion, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Origin{projectId=$projectId, promptId=$promptId, promptVersion=$promptVersion, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Parser @JsonCreator private constructor(
        @JsonProperty("choice_scores") @ExcludeMissing private val choiceScores: JsonField<ChoiceScores> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("use_cot") @ExcludeMissing private val useCot: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        fun choiceScores(): ChoiceScores = choiceScores.getRequired("choice_scores")

        fun type(): Type = type.getRequired("type")

        fun useCot(): Boolean = useCot.getRequired("use_cot")

        @JsonProperty("choice_scores")
        @ExcludeMissing
        fun _choiceScores(): JsonField<ChoiceScores> = choiceScores

        @JsonProperty("type")
        @ExcludeMissing
        fun _type(): JsonField<Type> = type

        @JsonProperty("use_cot")
        @ExcludeMissing
        fun _useCot(): JsonField<Boolean> = useCot

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Parser =
            apply {
                if (validated) {
                  return@apply
                }

                choiceScores().validate()
                type()
                useCot()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Parser].
             *
             * The following fields are required:
             *
             * ```java
             * .choiceScores()
             * .type()
             * .useCot()
             * ```
             */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Parser]. */
        class Builder internal constructor() {

            private var choiceScores: JsonField<ChoiceScores>? = null
            private var type: JsonField<Type>? = null
            private var useCot: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(parser: Parser) =
                apply {
                    choiceScores = parser.choiceScores
                    type = parser.type
                    useCot = parser.useCot
                    additionalProperties = parser.additionalProperties.toMutableMap()
                }

            fun choiceScores(choiceScores: ChoiceScores) = choiceScores(JsonField.of(choiceScores))

            fun choiceScores(choiceScores: JsonField<ChoiceScores>) =
                apply {
                    this.choiceScores = choiceScores
                }

            fun type(type: Type) = type(JsonField.of(type))

            fun type(type: JsonField<Type>) =
                apply {
                    this.type = type
                }

            fun useCot(useCot: Boolean) = useCot(JsonField.of(useCot))

            fun useCot(useCot: JsonField<Boolean>) =
                apply {
                    this.useCot = useCot
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

            fun build(): Parser =
                Parser(
                  checkRequired(
                    "choiceScores", choiceScores
                  ),
                  checkRequired(
                    "type", type
                  ),
                  checkRequired(
                    "useCot", useCot
                  ),
                  additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class ChoiceScores @JsonCreator private constructor(
            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ChoiceScores =
                apply {
                    if (validated) {
                      return@apply
                    }

                    validated = true
                }

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [ChoiceScores]. */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [ChoiceScores]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(choiceScores: ChoiceScores) =
                    apply {
                        additionalProperties = choiceScores.additionalProperties.toMutableMap()
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

                fun build(): ChoiceScores = ChoiceScores(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is ChoiceScores && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "ChoiceScores{additionalProperties=$additionalProperties}"
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

                @JvmField val LLM_CLASSIFIER = of("llm_classifier")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                LLM_CLASSIFIER,
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
                LLM_CLASSIFIER,
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
                    LLM_CLASSIFIER -> Value.LLM_CLASSIFIER
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
                    LLM_CLASSIFIER -> Known.LLM_CLASSIFIER
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

          return /* spotless:off */ other is Parser && choiceScores == other.choiceScores && type == other.type && useCot == other.useCot && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(choiceScores, type, useCot, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Parser{choiceScores=$choiceScores, type=$type, useCot=$useCot, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Prompt.Deserializer::class)
    @JsonSerialize(using = Prompt.Serializer::class)
    class Prompt private constructor(
        private val completion: Completion? = null,
        private val chat: Chat? = null,
        private val nullableVariant: NullableVariant? = null,
        private val _json: JsonValue? = null,

    ) {

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

        private var validated: Boolean = false

        fun validate(): Prompt =
            apply {
                if (validated) {
                  return@apply
                }

                accept(object : Visitor<Unit> {
                    override fun visitCompletion(completion: Completion) {
                      completion.validate()
                    }

                    override fun visitChat(chat: Chat) {
                      chat.validate()
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

          return /* spotless:off */ other is Prompt && completion == other.completion && chat == other.chat && nullableVariant == other.nullableVariant /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(completion, chat, nullableVariant) /* spotless:on */

        override fun toString(): String =
            when {
                completion != null -> "Prompt{completion=$completion}"
                chat != null -> "Prompt{chat=$chat}"
                nullableVariant != null -> "Prompt{nullableVariant=$nullableVariant}"
                _json != null -> "Prompt{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Prompt")
            }

        companion object {

            @JvmStatic
            fun ofCompletion(completion: Completion) = Prompt(completion = completion)

            @JvmStatic
            fun ofChat(chat: Chat) = Prompt(chat = chat)

            @JvmStatic
            fun ofNullableVariant(nullableVariant: NullableVariant) = Prompt(nullableVariant = nullableVariant)
        }

        /**
         * An interface that defines how to map each variant of [Prompt] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitCompletion(completion: Completion): T

            fun visitChat(chat: Chat): T

            fun visitNullableVariant(nullableVariant: NullableVariant): T

            /**
             * Maps an unknown variant of [Prompt] to a value of type [T].
             *
             * An instance of [Prompt] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the
             * SDK is unaware of.
             *
             * @throws BraintrustInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
              throw BraintrustInvalidDataException("Unknown Prompt: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Prompt>(Prompt::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Prompt {
              val json = JsonValue.fromJsonNode(node)

              tryDeserialize(node, jacksonTypeRef<Completion>()){ it.validate() }?.let {
                  return Prompt(completion = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<Chat>()){ it.validate() }?.let {
                  return Prompt(chat = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<NullableVariant>()){ it.validate() }?.let {
                  return Prompt(nullableVariant = it, _json = json)
              }

              return Prompt(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Prompt>(Prompt::class) {

            override fun serialize(value: Prompt, generator: JsonGenerator, provider: SerializerProvider) {
              when {
                  value.completion != null -> generator.writeObject(value.completion)
                  value.chat != null -> generator.writeObject(value.chat)
                  value.nullableVariant != null -> generator.writeObject(value.nullableVariant)
                  value._json != null -> generator.writeObject(value._json)
                  else -> throw IllegalStateException("Invalid Prompt")
              }
            }
        }

        @NoAutoDetect
        class Completion @JsonCreator private constructor(
            @JsonProperty("content") @ExcludeMissing private val content: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

        ) {

            fun content(): String = content.getRequired("content")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("content")
            @ExcludeMissing
            fun _content(): JsonField<String> = content

            @JsonProperty("type")
            @ExcludeMissing
            fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Completion =
                apply {
                    if (validated) {
                      return@apply
                    }

                    content()
                    type()
                    validated = true
                }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Completion].
                 *
                 * The following fields are required:
                 *
                 * ```java
                 * .content()
                 * .type()
                 * ```
                 */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [Completion]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(completion: Completion) =
                    apply {
                        content = completion.content
                        type = completion.type
                        additionalProperties = completion.additionalProperties.toMutableMap()
                    }

                fun content(content: String) = content(JsonField.of(content))

                fun content(content: JsonField<String>) =
                    apply {
                        this.content = content
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

                fun build(): Completion =
                    Completion(
                      checkRequired(
                        "content", content
                      ),
                      checkRequired(
                        "type", type
                      ),
                      additionalProperties.toImmutable(),
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

                    @JvmField val COMPLETION = of("completion")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    COMPLETION,
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
                    COMPLETION,
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
                        COMPLETION -> Value.COMPLETION
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
                        COMPLETION -> Known.COMPLETION
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

              return /* spotless:off */ other is Completion && content == other.content && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(content, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Completion{content=$content, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Chat @JsonCreator private constructor(
            @JsonProperty("messages") @ExcludeMissing private val messages: JsonField<List<Message>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("tools") @ExcludeMissing private val tools: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

        ) {

            fun messages(): List<Message> = messages.getRequired("messages")

            fun type(): Type = type.getRequired("type")

            fun tools(): Optional<String> = Optional.ofNullable(tools.getNullable("tools"))

            @JsonProperty("messages")
            @ExcludeMissing
            fun _messages(): JsonField<List<Message>> = messages

            @JsonProperty("type")
            @ExcludeMissing
            fun _type(): JsonField<Type> = type

            @JsonProperty("tools")
            @ExcludeMissing
            fun _tools(): JsonField<String> = tools

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Chat =
                apply {
                    if (validated) {
                      return@apply
                    }

                    messages().forEach { it.validate() }
                    type()
                    tools()
                    validated = true
                }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Chat].
                 *
                 * The following fields are required:
                 *
                 * ```java
                 * .messages()
                 * .type()
                 * ```
                 */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [Chat]. */
            class Builder internal constructor() {

                private var messages: JsonField<MutableList<Message>>? = null
                private var type: JsonField<Type>? = null
                private var tools: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(chat: Chat) =
                    apply {
                        messages = chat.messages.map { it.toMutableList() }
                        type = chat.type
                        tools = chat.tools
                        additionalProperties = chat.additionalProperties.toMutableMap()
                    }

                fun messages(messages: List<Message>) = messages(JsonField.of(messages))

                fun messages(messages: JsonField<List<Message>>) =
                    apply {
                        this.messages = messages.map { it.toMutableList() }
                    }

                fun addMessage(message: Message) =
                    apply {
                        messages = (messages ?: JsonField.of(mutableListOf())).also {
                            checkKnown("messages", it).add(message)
                        }
                    }

                fun addMessage(system: Message.System) = addMessage(Message.ofSystem(system))

                fun addMessage(user: Message.User) = addMessage(Message.ofUser(user))

                fun addMessage(assistant: Message.Assistant) = addMessage(Message.ofAssistant(assistant))

                fun addMessage(tool: Message.Tool) = addMessage(Message.ofTool(tool))

                fun addMessage(function: Message.Function) = addMessage(Message.ofFunction(function))

                fun addMessage(fallback: Message.Fallback) = addMessage(Message.ofFallback(fallback))

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) =
                    apply {
                        this.type = type
                    }

                fun tools(tools: String) = tools(JsonField.of(tools))

                fun tools(tools: JsonField<String>) =
                    apply {
                        this.tools = tools
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

                fun build(): Chat =
                    Chat(
                      checkRequired(
                        "messages", messages
                      ).map { it.toImmutable() },
                      checkRequired(
                        "type", type
                      ),
                      tools,
                      additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(using = Message.Deserializer::class)
            @JsonSerialize(using = Message.Serializer::class)
            class Message private constructor(
                private val system: System? = null,
                private val user: User? = null,
                private val assistant: Assistant? = null,
                private val tool: Tool? = null,
                private val function: Function? = null,
                private val fallback: Fallback? = null,
                private val _json: JsonValue? = null,

            ) {

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

                private var validated: Boolean = false

                fun validate(): Message =
                    apply {
                        if (validated) {
                          return@apply
                        }

                        accept(object : Visitor<Unit> {
                            override fun visitSystem(system: System) {
                              system.validate()
                            }

                            override fun visitUser(user: User) {
                              user.validate()
                            }

                            override fun visitAssistant(assistant: Assistant) {
                              assistant.validate()
                            }

                            override fun visitTool(tool: Tool) {
                              tool.validate()
                            }

                            override fun visitFunction(function: Function) {
                              function.validate()
                            }

                            override fun visitFallback(fallback: Fallback) {
                              fallback.validate()
                            }
                        })
                        validated = true
                    }

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return /* spotless:off */ other is Message && system == other.system && user == other.user && assistant == other.assistant && tool == other.tool && function == other.function && fallback == other.fallback /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(system, user, assistant, tool, function, fallback) /* spotless:on */

                override fun toString(): String =
                    when {
                        system != null -> "Message{system=$system}"
                        user != null -> "Message{user=$user}"
                        assistant != null -> "Message{assistant=$assistant}"
                        tool != null -> "Message{tool=$tool}"
                        function != null -> "Message{function=$function}"
                        fallback != null -> "Message{fallback=$fallback}"
                        _json != null -> "Message{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Message")
                    }

                companion object {

                    @JvmStatic
                    fun ofSystem(system: System) = Message(system = system)

                    @JvmStatic
                    fun ofUser(user: User) = Message(user = user)

                    @JvmStatic
                    fun ofAssistant(assistant: Assistant) = Message(assistant = assistant)

                    @JvmStatic
                    fun ofTool(tool: Tool) = Message(tool = tool)

                    @JvmStatic
                    fun ofFunction(function: Function) = Message(function = function)

                    @JvmStatic
                    fun ofFallback(fallback: Fallback) = Message(fallback = fallback)
                }

                /**
                 * An interface that defines how to map each variant of [Message] to a value of
                 * type [T].
                 */
                interface Visitor<out T> {

                    fun visitSystem(system: System): T

                    fun visitUser(user: User): T

                    fun visitAssistant(assistant: Assistant): T

                    fun visitTool(tool: Tool): T

                    fun visitFunction(function: Function): T

                    fun visitFallback(fallback: Fallback): T

                    /**
                     * Maps an unknown variant of [Message] to a value of type [T].
                     *
                     * An instance of [Message] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on an
                     * older version than the API, then the API may respond with new variants that the
                     * SDK is unaware of.
                     *
                     * @throws BraintrustInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                      throw BraintrustInvalidDataException("Unknown Message: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Message>(Message::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Message {
                      val json = JsonValue.fromJsonNode(node)

                      tryDeserialize(node, jacksonTypeRef<System>()){ it.validate() }?.let {
                          return Message(system = it, _json = json)
                      }
                      tryDeserialize(node, jacksonTypeRef<User>()){ it.validate() }?.let {
                          return Message(user = it, _json = json)
                      }
                      tryDeserialize(node, jacksonTypeRef<Assistant>()){ it.validate() }?.let {
                          return Message(assistant = it, _json = json)
                      }
                      tryDeserialize(node, jacksonTypeRef<Tool>()){ it.validate() }?.let {
                          return Message(tool = it, _json = json)
                      }
                      tryDeserialize(node, jacksonTypeRef<Function>()){ it.validate() }?.let {
                          return Message(function = it, _json = json)
                      }
                      tryDeserialize(node, jacksonTypeRef<Fallback>()){ it.validate() }?.let {
                          return Message(fallback = it, _json = json)
                      }

                      return Message(_json = json)
                    }
                }

                internal class Serializer : BaseSerializer<Message>(Message::class) {

                    override fun serialize(value: Message, generator: JsonGenerator, provider: SerializerProvider) {
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

                @NoAutoDetect
                class System @JsonCreator private constructor(
                    @JsonProperty("role") @ExcludeMissing private val role: JsonField<Role> = JsonMissing.of(),
                    @JsonProperty("content") @ExcludeMissing private val content: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                ) {

                    fun role(): Role = role.getRequired("role")

                    fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

                    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                    @JsonProperty("role")
                    @ExcludeMissing
                    fun _role(): JsonField<Role> = role

                    @JsonProperty("content")
                    @ExcludeMissing
                    fun _content(): JsonField<String> = content

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun _name(): JsonField<String> = name

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): System =
                        apply {
                            if (validated) {
                              return@apply
                            }

                            role()
                            content()
                            name()
                            validated = true
                        }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [System].
                         *
                         * The following fields are required:
                         *
                         * ```java
                         * .role()
                         * ```
                         */
                        @JvmStatic
                        fun builder() = Builder()
                    }

                    /** A builder for [System]. */
                    class Builder internal constructor() {

                        private var role: JsonField<Role>? = null
                        private var content: JsonField<String> = JsonMissing.of()
                        private var name: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(system: System) =
                            apply {
                                role = system.role
                                content = system.content
                                name = system.name
                                additionalProperties = system.additionalProperties.toMutableMap()
                            }

                        fun role(role: Role) = role(JsonField.of(role))

                        fun role(role: JsonField<Role>) =
                            apply {
                                this.role = role
                            }

                        fun content(content: String) = content(JsonField.of(content))

                        fun content(content: JsonField<String>) =
                            apply {
                                this.content = content
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

                        fun build(): System =
                            System(
                              checkRequired(
                                "role", role
                              ),
                              content,
                              name,
                              additionalProperties.toImmutable(),
                            )
                    }

                    class Role @JsonCreator private constructor(
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

                            @JvmField val SYSTEM = of("system")

                            @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                        }

                        /** An enum containing [Role]'s known values. */
                        enum class Known {
                            SYSTEM,
                        }

                        /**
                         * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                         *
                         * An instance of [Role] can contain an unknown value in a couple of cases:
                         *
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API may
                         *   respond with new members that the SDK is unaware of.
                         *
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            SYSTEM,
                            /** An enum member indicating that [Role] was instantiated with an unknown value. */
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
                                SYSTEM -> Value.SYSTEM
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
                                SYSTEM -> Known.SYSTEM
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
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

                          return /* spotless:off */ other is Role && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                      if (this === other) {
                          return true
                      }

                      return /* spotless:off */ other is System && role == other.role && content == other.content && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(role, content, name, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "System{role=$role, content=$content, name=$name, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class User @JsonCreator private constructor(
                    @JsonProperty("role") @ExcludeMissing private val role: JsonField<Role> = JsonMissing.of(),
                    @JsonProperty("content") @ExcludeMissing private val content: JsonField<Content> = JsonMissing.of(),
                    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                ) {

                    fun role(): Role = role.getRequired("role")

                    fun content(): Optional<Content> = Optional.ofNullable(content.getNullable("content"))

                    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                    @JsonProperty("role")
                    @ExcludeMissing
                    fun _role(): JsonField<Role> = role

                    @JsonProperty("content")
                    @ExcludeMissing
                    fun _content(): JsonField<Content> = content

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun _name(): JsonField<String> = name

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): User =
                        apply {
                            if (validated) {
                              return@apply
                            }

                            role()
                            content().ifPresent { it.validate() }
                            name()
                            validated = true
                        }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [User].
                         *
                         * The following fields are required:
                         *
                         * ```java
                         * .role()
                         * ```
                         */
                        @JvmStatic
                        fun builder() = Builder()
                    }

                    /** A builder for [User]. */
                    class Builder internal constructor() {

                        private var role: JsonField<Role>? = null
                        private var content: JsonField<Content> = JsonMissing.of()
                        private var name: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(user: User) =
                            apply {
                                role = user.role
                                content = user.content
                                name = user.name
                                additionalProperties = user.additionalProperties.toMutableMap()
                            }

                        fun role(role: Role) = role(JsonField.of(role))

                        fun role(role: JsonField<Role>) =
                            apply {
                                this.role = role
                            }

                        fun content(content: Content) = content(JsonField.of(content))

                        fun content(content: JsonField<Content>) =
                            apply {
                                this.content = content
                            }

                        fun content(text: String) = content(Content.ofText(text))

                        fun contentOfArray(array: List<Content.ChatCompletionContentPart>) = content(Content.ofArray(array))

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

                        fun build(): User =
                            User(
                              checkRequired(
                                "role", role
                              ),
                              content,
                              name,
                              additionalProperties.toImmutable(),
                            )
                    }

                    class Role @JsonCreator private constructor(
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

                            @JvmField val USER = of("user")

                            @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                        }

                        /** An enum containing [Role]'s known values. */
                        enum class Known {
                            USER,
                        }

                        /**
                         * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                         *
                         * An instance of [Role] can contain an unknown value in a couple of cases:
                         *
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API may
                         *   respond with new members that the SDK is unaware of.
                         *
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            USER,
                            /** An enum member indicating that [Role] was instantiated with an unknown value. */
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
                                USER -> Value.USER
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
                                USER -> Known.USER
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
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

                          return /* spotless:off */ other is Role && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    @JsonDeserialize(using = Content.Deserializer::class)
                    @JsonSerialize(using = Content.Serializer::class)
                    class Content private constructor(
                        private val text: String? = null,
                        private val array: List<ChatCompletionContentPart>? = null,
                        private val _json: JsonValue? = null,

                    ) {

                        fun text(): Optional<String> = Optional.ofNullable(text)

                        fun array(): Optional<List<ChatCompletionContentPart>> = Optional.ofNullable(array)

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

                        private var validated: Boolean = false

                        fun validate(): Content =
                            apply {
                                if (validated) {
                                  return@apply
                                }

                                accept(object : Visitor<Unit> {
                                    override fun visitText(text: String) {

                                    }

                                    override fun visitArray(array: List<ChatCompletionContentPart>) {
                                      array.forEach { it.validate() }
                                    }
                                })
                                validated = true
                            }

                        override fun equals(other: Any?): Boolean {
                          if (this === other) {
                              return true
                          }

                          return /* spotless:off */ other is Content && text == other.text && array == other.array /* spotless:on */
                        }

                        override fun hashCode(): Int = /* spotless:off */ Objects.hash(text, array) /* spotless:on */

                        override fun toString(): String =
                            when {
                                text != null -> "Content{text=$text}"
                                array != null -> "Content{array=$array}"
                                _json != null -> "Content{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Content")
                            }

                        companion object {

                            @JvmStatic
                            fun ofText(text: String) = Content(text = text)

                            @JvmStatic
                            fun ofArray(array: List<ChatCompletionContentPart>) = Content(array = array)
                        }

                        /**
                         * An interface that defines how to map each variant of [Content] to a value of
                         * type [T].
                         */
                        interface Visitor<out T> {

                            fun visitText(text: String): T

                            fun visitArray(array: List<ChatCompletionContentPart>): T

                            /**
                             * Maps an unknown variant of [Content] to a value of type [T].
                             *
                             * An instance of [Content] can contain an unknown variant if it was deserialized
                             * from data that doesn't match any known variant. For example, if the SDK is on an
                             * older version than the API, then the API may respond with new variants that the
                             * SDK is unaware of.
                             *
                             * @throws BraintrustInvalidDataException in the default implementation.
                             */
                            fun unknown(json: JsonValue?): T {
                              throw BraintrustInvalidDataException("Unknown Content: $json")
                            }
                        }

                        internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): Content {
                              val json = JsonValue.fromJsonNode(node)

                              tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                  return Content(text = it, _json = json)
                              }
                              tryDeserialize(node, jacksonTypeRef<List<ChatCompletionContentPart>>()){ it.forEach { it.validate() } }?.let {
                                  return Content(array = it, _json = json)
                              }

                              return Content(_json = json)
                            }
                        }

                        internal class Serializer : BaseSerializer<Content>(Content::class) {

                            override fun serialize(value: Content, generator: JsonGenerator, provider: SerializerProvider) {
                              when {
                                  value.text != null -> generator.writeObject(value.text)
                                  value.array != null -> generator.writeObject(value.array)
                                  value._json != null -> generator.writeObject(value._json)
                                  else -> throw IllegalStateException("Invalid Content")
                              }
                            }
                        }

                        @JsonDeserialize(using = ChatCompletionContentPart.Deserializer::class)
                        @JsonSerialize(using = ChatCompletionContentPart.Serializer::class)
                        class ChatCompletionContentPart private constructor(
                            private val text: ChatCompletionContentPartText? = null,
                            private val image: ChatCompletionContentPartImage? = null,
                            private val _json: JsonValue? = null,

                        ) {

                            fun text(): Optional<ChatCompletionContentPartText> = Optional.ofNullable(text)

                            fun image(): Optional<ChatCompletionContentPartImage> = Optional.ofNullable(image)

                            fun isText(): Boolean = text != null

                            fun isImage(): Boolean = image != null

                            fun asText(): ChatCompletionContentPartText = text.getOrThrow("text")

                            fun asImage(): ChatCompletionContentPartImage = image.getOrThrow("image")

                            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                            fun <T> accept(visitor: Visitor<T>): T {
                              return when {
                                  text != null -> visitor.visitText(text)
                                  image != null -> visitor.visitImage(image)
                                  else -> visitor.unknown(_json)
                              }
                            }

                            private var validated: Boolean = false

                            fun validate(): ChatCompletionContentPart =
                                apply {
                                    if (validated) {
                                      return@apply
                                    }

                                    accept(object : Visitor<Unit> {
                                        override fun visitText(text: ChatCompletionContentPartText) {
                                          text.validate()
                                        }

                                        override fun visitImage(image: ChatCompletionContentPartImage) {
                                          image.validate()
                                        }
                                    })
                                    validated = true
                                }

                            override fun equals(other: Any?): Boolean {
                              if (this === other) {
                                  return true
                              }

                              return /* spotless:off */ other is ChatCompletionContentPart && text == other.text && image == other.image /* spotless:on */
                            }

                            override fun hashCode(): Int = /* spotless:off */ Objects.hash(text, image) /* spotless:on */

                            override fun toString(): String =
                                when {
                                    text != null -> "ChatCompletionContentPart{text=$text}"
                                    image != null -> "ChatCompletionContentPart{image=$image}"
                                    _json != null -> "ChatCompletionContentPart{_unknown=$_json}"
                                    else -> throw IllegalStateException("Invalid ChatCompletionContentPart")
                                }

                            companion object {

                                @JvmStatic
                                fun ofText(text: ChatCompletionContentPartText) = ChatCompletionContentPart(text = text)

                                @JvmStatic
                                fun ofImage(image: ChatCompletionContentPartImage) = ChatCompletionContentPart(image = image)
                            }

                            /**
                             * An interface that defines how to map each variant of [ChatCompletionContentPart]
                             * to a value of type [T].
                             */
                            interface Visitor<out T> {

                                fun visitText(text: ChatCompletionContentPartText): T

                                fun visitImage(image: ChatCompletionContentPartImage): T

                                /**
                                 * Maps an unknown variant of [ChatCompletionContentPart] to a value of type [T].
                                 *
                                 * An instance of [ChatCompletionContentPart] can contain an unknown variant if it
                                 * was deserialized from data that doesn't match any known variant. For example, if
                                 * the SDK is on an older version than the API, then the API may respond with new
                                 * variants that the SDK is unaware of.
                                 *
                                 * @throws BraintrustInvalidDataException in the default implementation.
                                 */
                                fun unknown(json: JsonValue?): T {
                                  throw BraintrustInvalidDataException("Unknown ChatCompletionContentPart: $json")
                                }
                            }

                            internal class Deserializer : BaseDeserializer<ChatCompletionContentPart>(ChatCompletionContentPart::class) {

                                override fun ObjectCodec.deserialize(node: JsonNode): ChatCompletionContentPart {
                                  val json = JsonValue.fromJsonNode(node)

                                  tryDeserialize(node, jacksonTypeRef<ChatCompletionContentPartText>()){ it.validate() }?.let {
                                      return ChatCompletionContentPart(text = it, _json = json)
                                  }
                                  tryDeserialize(node, jacksonTypeRef<ChatCompletionContentPartImage>()){ it.validate() }?.let {
                                      return ChatCompletionContentPart(image = it, _json = json)
                                  }

                                  return ChatCompletionContentPart(_json = json)
                                }
                            }

                            internal class Serializer : BaseSerializer<ChatCompletionContentPart>(ChatCompletionContentPart::class) {

                                override fun serialize(value: ChatCompletionContentPart, generator: JsonGenerator, provider: SerializerProvider) {
                                  when {
                                      value.text != null -> generator.writeObject(value.text)
                                      value.image != null -> generator.writeObject(value.image)
                                      value._json != null -> generator.writeObject(value._json)
                                      else -> throw IllegalStateException("Invalid ChatCompletionContentPart")
                                  }
                                }
                            }
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                      if (this === other) {
                          return true
                      }

                      return /* spotless:off */ other is User && role == other.role && content == other.content && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(role, content, name, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "User{role=$role, content=$content, name=$name, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class Assistant @JsonCreator private constructor(
                    @JsonProperty("role") @ExcludeMissing private val role: JsonField<Role> = JsonMissing.of(),
                    @JsonProperty("content") @ExcludeMissing private val content: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("function_call") @ExcludeMissing private val functionCall: JsonField<FunctionCall> = JsonMissing.of(),
                    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tool_calls") @ExcludeMissing private val toolCalls: JsonField<List<ChatCompletionMessageToolCall>> = JsonMissing.of(),
                    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                ) {

                    fun role(): Role = role.getRequired("role")

                    fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

                    fun functionCall(): Optional<FunctionCall> = Optional.ofNullable(functionCall.getNullable("function_call"))

                    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                    fun toolCalls(): Optional<List<ChatCompletionMessageToolCall>> = Optional.ofNullable(toolCalls.getNullable("tool_calls"))

                    @JsonProperty("role")
                    @ExcludeMissing
                    fun _role(): JsonField<Role> = role

                    @JsonProperty("content")
                    @ExcludeMissing
                    fun _content(): JsonField<String> = content

                    @JsonProperty("function_call")
                    @ExcludeMissing
                    fun _functionCall(): JsonField<FunctionCall> = functionCall

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun _name(): JsonField<String> = name

                    @JsonProperty("tool_calls")
                    @ExcludeMissing
                    fun _toolCalls(): JsonField<List<ChatCompletionMessageToolCall>> = toolCalls

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Assistant =
                        apply {
                            if (validated) {
                              return@apply
                            }

                            role()
                            content()
                            functionCall().ifPresent { it.validate() }
                            name()
                            toolCalls().ifPresent { it.forEach { it.validate() } }
                            validated = true
                        }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Assistant].
                         *
                         * The following fields are required:
                         *
                         * ```java
                         * .role()
                         * ```
                         */
                        @JvmStatic
                        fun builder() = Builder()
                    }

                    /** A builder for [Assistant]. */
                    class Builder internal constructor() {

                        private var role: JsonField<Role>? = null
                        private var content: JsonField<String> = JsonMissing.of()
                        private var functionCall: JsonField<FunctionCall> = JsonMissing.of()
                        private var name: JsonField<String> = JsonMissing.of()
                        private var toolCalls: JsonField<MutableList<ChatCompletionMessageToolCall>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(assistant: Assistant) =
                            apply {
                                role = assistant.role
                                content = assistant.content
                                functionCall = assistant.functionCall
                                name = assistant.name
                                toolCalls = assistant.toolCalls.map { it.toMutableList() }
                                additionalProperties = assistant.additionalProperties.toMutableMap()
                            }

                        fun role(role: Role) = role(JsonField.of(role))

                        fun role(role: JsonField<Role>) =
                            apply {
                                this.role = role
                            }

                        fun content(content: String?) = content(JsonField.ofNullable(content))

                        fun content(content: Optional<String>) = content(content.getOrNull())

                        fun content(content: JsonField<String>) =
                            apply {
                                this.content = content
                            }

                        fun functionCall(functionCall: FunctionCall?) = functionCall(JsonField.ofNullable(functionCall))

                        fun functionCall(functionCall: Optional<FunctionCall>) = functionCall(functionCall.getOrNull())

                        fun functionCall(functionCall: JsonField<FunctionCall>) =
                            apply {
                                this.functionCall = functionCall
                            }

                        fun name(name: String?) = name(JsonField.ofNullable(name))

                        fun name(name: Optional<String>) = name(name.getOrNull())

                        fun name(name: JsonField<String>) =
                            apply {
                                this.name = name
                            }

                        fun toolCalls(toolCalls: List<ChatCompletionMessageToolCall>?) = toolCalls(JsonField.ofNullable(toolCalls))

                        fun toolCalls(toolCalls: Optional<List<ChatCompletionMessageToolCall>>) = toolCalls(toolCalls.getOrNull())

                        fun toolCalls(toolCalls: JsonField<List<ChatCompletionMessageToolCall>>) =
                            apply {
                                this.toolCalls = toolCalls.map { it.toMutableList() }
                            }

                        fun addToolCall(toolCall: ChatCompletionMessageToolCall) =
                            apply {
                                toolCalls = (toolCalls ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("toolCalls", it).add(toolCall)
                                }
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

                        fun build(): Assistant =
                            Assistant(
                              checkRequired(
                                "role", role
                              ),
                              content,
                              functionCall,
                              name,
                              (toolCalls ?: JsonMissing.of()).map { it.toImmutable() },
                              additionalProperties.toImmutable(),
                            )
                    }

                    class Role @JsonCreator private constructor(
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

                            @JvmField val ASSISTANT = of("assistant")

                            @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                        }

                        /** An enum containing [Role]'s known values. */
                        enum class Known {
                            ASSISTANT,
                        }

                        /**
                         * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                         *
                         * An instance of [Role] can contain an unknown value in a couple of cases:
                         *
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API may
                         *   respond with new members that the SDK is unaware of.
                         *
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            ASSISTANT,
                            /** An enum member indicating that [Role] was instantiated with an unknown value. */
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
                                ASSISTANT -> Value.ASSISTANT
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
                                ASSISTANT -> Known.ASSISTANT
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
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

                          return /* spotless:off */ other is Role && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    @NoAutoDetect
                    class FunctionCall @JsonCreator private constructor(
                        @JsonProperty("arguments") @ExcludeMissing private val arguments: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
                        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                    ) {

                        fun arguments(): String = arguments.getRequired("arguments")

                        fun name(): String = name.getRequired("name")

                        @JsonProperty("arguments")
                        @ExcludeMissing
                        fun _arguments(): JsonField<String> = arguments

                        @JsonProperty("name")
                        @ExcludeMissing
                        fun _name(): JsonField<String> = name

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): FunctionCall =
                            apply {
                                if (validated) {
                                  return@apply
                                }

                                arguments()
                                name()
                                validated = true
                            }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of [FunctionCall].
                             *
                             * The following fields are required:
                             *
                             * ```java
                             * .arguments()
                             * .name()
                             * ```
                             */
                            @JvmStatic
                            fun builder() = Builder()
                        }

                        /** A builder for [FunctionCall]. */
                        class Builder internal constructor() {

                            private var arguments: JsonField<String>? = null
                            private var name: JsonField<String>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                            @JvmSynthetic
                            internal fun from(functionCall: FunctionCall) =
                                apply {
                                    arguments = functionCall.arguments
                                    name = functionCall.name
                                    additionalProperties = functionCall.additionalProperties.toMutableMap()
                                }

                            fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                            fun arguments(arguments: JsonField<String>) =
                                apply {
                                    this.arguments = arguments
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

                            fun build(): FunctionCall =
                                FunctionCall(
                                  checkRequired(
                                    "arguments", arguments
                                  ),
                                  checkRequired(
                                    "name", name
                                  ),
                                  additionalProperties.toImmutable(),
                                )
                        }

                        override fun equals(other: Any?): Boolean {
                          if (this === other) {
                              return true
                          }

                          return /* spotless:off */ other is FunctionCall && arguments == other.arguments && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(arguments, name, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() = "FunctionCall{arguments=$arguments, name=$name, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                      if (this === other) {
                          return true
                      }

                      return /* spotless:off */ other is Assistant && role == other.role && content == other.content && functionCall == other.functionCall && name == other.name && toolCalls == other.toolCalls && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(role, content, functionCall, name, toolCalls, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Assistant{role=$role, content=$content, functionCall=$functionCall, name=$name, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class Tool @JsonCreator private constructor(
                    @JsonProperty("role") @ExcludeMissing private val role: JsonField<Role> = JsonMissing.of(),
                    @JsonProperty("content") @ExcludeMissing private val content: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tool_call_id") @ExcludeMissing private val toolCallId: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                ) {

                    fun role(): Role = role.getRequired("role")

                    fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

                    fun toolCallId(): Optional<String> = Optional.ofNullable(toolCallId.getNullable("tool_call_id"))

                    @JsonProperty("role")
                    @ExcludeMissing
                    fun _role(): JsonField<Role> = role

                    @JsonProperty("content")
                    @ExcludeMissing
                    fun _content(): JsonField<String> = content

                    @JsonProperty("tool_call_id")
                    @ExcludeMissing
                    fun _toolCallId(): JsonField<String> = toolCallId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Tool =
                        apply {
                            if (validated) {
                              return@apply
                            }

                            role()
                            content()
                            toolCallId()
                            validated = true
                        }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Tool].
                         *
                         * The following fields are required:
                         *
                         * ```java
                         * .role()
                         * ```
                         */
                        @JvmStatic
                        fun builder() = Builder()
                    }

                    /** A builder for [Tool]. */
                    class Builder internal constructor() {

                        private var role: JsonField<Role>? = null
                        private var content: JsonField<String> = JsonMissing.of()
                        private var toolCallId: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(tool: Tool) =
                            apply {
                                role = tool.role
                                content = tool.content
                                toolCallId = tool.toolCallId
                                additionalProperties = tool.additionalProperties.toMutableMap()
                            }

                        fun role(role: Role) = role(JsonField.of(role))

                        fun role(role: JsonField<Role>) =
                            apply {
                                this.role = role
                            }

                        fun content(content: String) = content(JsonField.of(content))

                        fun content(content: JsonField<String>) =
                            apply {
                                this.content = content
                            }

                        fun toolCallId(toolCallId: String) = toolCallId(JsonField.of(toolCallId))

                        fun toolCallId(toolCallId: JsonField<String>) =
                            apply {
                                this.toolCallId = toolCallId
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

                        fun build(): Tool =
                            Tool(
                              checkRequired(
                                "role", role
                              ),
                              content,
                              toolCallId,
                              additionalProperties.toImmutable(),
                            )
                    }

                    class Role @JsonCreator private constructor(
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

                            @JvmField val TOOL = of("tool")

                            @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                        }

                        /** An enum containing [Role]'s known values. */
                        enum class Known {
                            TOOL,
                        }

                        /**
                         * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                         *
                         * An instance of [Role] can contain an unknown value in a couple of cases:
                         *
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API may
                         *   respond with new members that the SDK is unaware of.
                         *
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            TOOL,
                            /** An enum member indicating that [Role] was instantiated with an unknown value. */
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
                                TOOL -> Value.TOOL
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
                                TOOL -> Known.TOOL
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
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

                          return /* spotless:off */ other is Role && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                      if (this === other) {
                          return true
                      }

                      return /* spotless:off */ other is Tool && role == other.role && content == other.content && toolCallId == other.toolCallId && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(role, content, toolCallId, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Tool{role=$role, content=$content, toolCallId=$toolCallId, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class Function @JsonCreator private constructor(
                    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("role") @ExcludeMissing private val role: JsonField<Role> = JsonMissing.of(),
                    @JsonProperty("content") @ExcludeMissing private val content: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                ) {

                    fun name(): String = name.getRequired("name")

                    fun role(): Role = role.getRequired("role")

                    fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun _name(): JsonField<String> = name

                    @JsonProperty("role")
                    @ExcludeMissing
                    fun _role(): JsonField<Role> = role

                    @JsonProperty("content")
                    @ExcludeMissing
                    fun _content(): JsonField<String> = content

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
                            role()
                            content()
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
                         * .role()
                         * ```
                         */
                        @JvmStatic
                        fun builder() = Builder()
                    }

                    /** A builder for [Function]. */
                    class Builder internal constructor() {

                        private var name: JsonField<String>? = null
                        private var role: JsonField<Role>? = null
                        private var content: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(function: Function) =
                            apply {
                                name = function.name
                                role = function.role
                                content = function.content
                                additionalProperties = function.additionalProperties.toMutableMap()
                            }

                        fun name(name: String) = name(JsonField.of(name))

                        fun name(name: JsonField<String>) =
                            apply {
                                this.name = name
                            }

                        fun role(role: Role) = role(JsonField.of(role))

                        fun role(role: JsonField<Role>) =
                            apply {
                                this.role = role
                            }

                        fun content(content: String) = content(JsonField.of(content))

                        fun content(content: JsonField<String>) =
                            apply {
                                this.content = content
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
                              ),
                              checkRequired(
                                "role", role
                              ),
                              content,
                              additionalProperties.toImmutable(),
                            )
                    }

                    class Role @JsonCreator private constructor(
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

                            @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                        }

                        /** An enum containing [Role]'s known values. */
                        enum class Known {
                            FUNCTION,
                        }

                        /**
                         * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                         *
                         * An instance of [Role] can contain an unknown value in a couple of cases:
                         *
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API may
                         *   respond with new members that the SDK is unaware of.
                         *
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            FUNCTION,
                            /** An enum member indicating that [Role] was instantiated with an unknown value. */
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
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
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

                          return /* spotless:off */ other is Role && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                      if (this === other) {
                          return true
                      }

                      return /* spotless:off */ other is Function && name == other.name && role == other.role && content == other.content && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(name, role, content, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Function{name=$name, role=$role, content=$content, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class Fallback @JsonCreator private constructor(
                    @JsonProperty("role") @ExcludeMissing private val role: JsonField<Role> = JsonMissing.of(),
                    @JsonProperty("content") @ExcludeMissing private val content: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

                ) {

                    fun role(): Role = role.getRequired("role")

                    fun content(): Optional<String> = Optional.ofNullable(content.getNullable("content"))

                    @JsonProperty("role")
                    @ExcludeMissing
                    fun _role(): JsonField<Role> = role

                    @JsonProperty("content")
                    @ExcludeMissing
                    fun _content(): JsonField<String> = content

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Fallback =
                        apply {
                            if (validated) {
                              return@apply
                            }

                            role()
                            content()
                            validated = true
                        }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Fallback].
                         *
                         * The following fields are required:
                         *
                         * ```java
                         * .role()
                         * ```
                         */
                        @JvmStatic
                        fun builder() = Builder()
                    }

                    /** A builder for [Fallback]. */
                    class Builder internal constructor() {

                        private var role: JsonField<Role>? = null
                        private var content: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                        @JvmSynthetic
                        internal fun from(fallback: Fallback) =
                            apply {
                                role = fallback.role
                                content = fallback.content
                                additionalProperties = fallback.additionalProperties.toMutableMap()
                            }

                        fun role(role: Role) = role(JsonField.of(role))

                        fun role(role: JsonField<Role>) =
                            apply {
                                this.role = role
                            }

                        fun content(content: String?) = content(JsonField.ofNullable(content))

                        fun content(content: Optional<String>) = content(content.getOrNull())

                        fun content(content: JsonField<String>) =
                            apply {
                                this.content = content
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

                        fun build(): Fallback =
                            Fallback(
                              checkRequired(
                                "role", role
                              ),
                              content,
                              additionalProperties.toImmutable(),
                            )
                    }

                    class Role @JsonCreator private constructor(
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

                            @JvmField val MODEL = of("model")

                            @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                        }

                        /** An enum containing [Role]'s known values. */
                        enum class Known {
                            MODEL,
                        }

                        /**
                         * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
                         *
                         * An instance of [Role] can contain an unknown value in a couple of cases:
                         *
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API may
                         *   respond with new members that the SDK is unaware of.
                         *
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            MODEL,
                            /** An enum member indicating that [Role] was instantiated with an unknown value. */
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
                                MODEL -> Value.MODEL
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
                                MODEL -> Known.MODEL
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
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

                          return /* spotless:off */ other is Role && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                      if (this === other) {
                          return true
                      }

                      return /* spotless:off */ other is Fallback && role == other.role && content == other.content && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(role, content, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Fallback{role=$role, content=$content, additionalProperties=$additionalProperties}"
                }
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

                    @JvmField val CHAT = of("chat")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CHAT,
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
                    CHAT,
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
                        CHAT -> Value.CHAT
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
                        CHAT -> Known.CHAT
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

              return /* spotless:off */ other is Chat && messages == other.messages && type == other.type && tools == other.tools && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(messages, type, tools, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Chat{messages=$messages, type=$type, tools=$tools, additionalProperties=$additionalProperties}"
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

    @JsonDeserialize(using = ToolFunction.Deserializer::class)
    @JsonSerialize(using = ToolFunction.Serializer::class)
    class ToolFunction private constructor(
        private val function: Function? = null,
        private val global: Global? = null,
        private val _json: JsonValue? = null,

    ) {

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

        private var validated: Boolean = false

        fun validate(): ToolFunction =
            apply {
                if (validated) {
                  return@apply
                }

                accept(object : Visitor<Unit> {
                    override fun visitFunction(function: Function) {
                      function.validate()
                    }

                    override fun visitGlobal(global: Global) {
                      global.validate()
                    }
                })
                validated = true
            }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is ToolFunction && function == other.function && global == other.global /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(function, global) /* spotless:on */

        override fun toString(): String =
            when {
                function != null -> "ToolFunction{function=$function}"
                global != null -> "ToolFunction{global=$global}"
                _json != null -> "ToolFunction{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ToolFunction")
            }

        companion object {

            @JvmStatic
            fun ofFunction(function: Function) = ToolFunction(function = function)

            @JvmStatic
            fun ofGlobal(global: Global) = ToolFunction(global = global)
        }

        /**
         * An interface that defines how to map each variant of [ToolFunction] to a value
         * of type [T].
         */
        interface Visitor<out T> {

            fun visitFunction(function: Function): T

            fun visitGlobal(global: Global): T

            /**
             * Maps an unknown variant of [ToolFunction] to a value of type [T].
             *
             * An instance of [ToolFunction] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the
             * SDK is on an older version than the API, then the API may respond with new
             * variants that the SDK is unaware of.
             *
             * @throws BraintrustInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
              throw BraintrustInvalidDataException("Unknown ToolFunction: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ToolFunction>(ToolFunction::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ToolFunction {
              val json = JsonValue.fromJsonNode(node)

              tryDeserialize(node, jacksonTypeRef<Function>()){ it.validate() }?.let {
                  return ToolFunction(function = it, _json = json)
              }
              tryDeserialize(node, jacksonTypeRef<Global>()){ it.validate() }?.let {
                  return ToolFunction(global = it, _json = json)
              }

              return ToolFunction(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<ToolFunction>(ToolFunction::class) {

            override fun serialize(value: ToolFunction, generator: JsonGenerator, provider: SerializerProvider) {
              when {
                  value.function != null -> generator.writeObject(value.function)
                  value.global != null -> generator.writeObject(value.global)
                  value._json != null -> generator.writeObject(value._json)
                  else -> throw IllegalStateException("Invalid ToolFunction")
              }
            }
        }

        @NoAutoDetect
        class Function @JsonCreator private constructor(
            @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

        ) {

            fun id(): String = id.getRequired("id")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("id")
            @ExcludeMissing
            fun _id(): JsonField<String> = id

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

                    id()
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
                 * .id()
                 * .type()
                 * ```
                 */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [Function]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(function: Function) =
                    apply {
                        id = function.id
                        type = function.type
                        additionalProperties = function.additionalProperties.toMutableMap()
                    }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) =
                    apply {
                        this.id = id
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
                        "id", id
                      ),
                      checkRequired(
                        "type", type
                      ),
                      additionalProperties.toImmutable(),
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

              return /* spotless:off */ other is Function && id == other.id && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Function{id=$id, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Global @JsonCreator private constructor(
            @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

        ) {

            fun name(): String = name.getRequired("name")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("name")
            @ExcludeMissing
            fun _name(): JsonField<String> = name

            @JsonProperty("type")
            @ExcludeMissing
            fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Global =
                apply {
                    if (validated) {
                      return@apply
                    }

                    name()
                    type()
                    validated = true
                }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Global].
                 *
                 * The following fields are required:
                 *
                 * ```java
                 * .name()
                 * .type()
                 * ```
                 */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [Global]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(global: Global) =
                    apply {
                        name = global.name
                        type = global.type
                        additionalProperties = global.additionalProperties.toMutableMap()
                    }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) =
                    apply {
                        this.name = name
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

                fun build(): Global =
                    Global(
                      checkRequired(
                        "name", name
                      ),
                      checkRequired(
                        "type", type
                      ),
                      additionalProperties.toImmutable(),
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

                    @JvmField val GLOBAL = of("global")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    GLOBAL,
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
                    GLOBAL,
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
                        GLOBAL -> Value.GLOBAL
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
                        GLOBAL -> Known.GLOBAL
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

              return /* spotless:off */ other is Global && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(name, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Global{name=$name, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is PromptData && options == other.options && origin == other.origin && parser == other.parser && prompt == other.prompt && toolFunctions == other.toolFunctions && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(options, origin, parser, prompt, toolFunctions, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "PromptData{options=$options, origin=$origin, parser=$parser, prompt=$prompt, toolFunctions=$toolFunctions, additionalProperties=$additionalProperties}"
}
