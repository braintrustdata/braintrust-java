// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.BaseDeserializer
import com.braintrustdata.api.core.BaseSerializer
import com.braintrustdata.api.core.Enum
import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.allMaxBy
import com.braintrustdata.api.core.checkKnown
import com.braintrustdata.api.core.checkRequired
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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The prompt, model, and its parameters */
class PromptData
private constructor(
    private val options: JsonField<PromptOptions>,
    private val origin: JsonField<Origin>,
    private val parser: JsonField<Parser>,
    private val prompt: JsonField<Prompt>,
    private val toolFunctions: JsonField<List<ToolFunction>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("options")
        @ExcludeMissing
        options: JsonField<PromptOptions> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<Origin> = JsonMissing.of(),
        @JsonProperty("parser") @ExcludeMissing parser: JsonField<Parser> = JsonMissing.of(),
        @JsonProperty("prompt") @ExcludeMissing prompt: JsonField<Prompt> = JsonMissing.of(),
        @JsonProperty("tool_functions")
        @ExcludeMissing
        toolFunctions: JsonField<List<ToolFunction>> = JsonMissing.of(),
    ) : this(options, origin, parser, prompt, toolFunctions, mutableMapOf())

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun options(): Optional<PromptOptions> = Optional.ofNullable(options.getNullable("options"))

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun origin(): Optional<Origin> = Optional.ofNullable(origin.getNullable("origin"))

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parser(): Optional<Parser> = Optional.ofNullable(parser.getNullable("parser"))

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prompt(): Optional<Prompt> = Optional.ofNullable(prompt.getNullable("prompt"))

    /**
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun toolFunctions(): Optional<List<ToolFunction>> =
        Optional.ofNullable(toolFunctions.getNullable("tool_functions"))

    /**
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<PromptOptions> = options

    /**
     * Returns the raw JSON value of [origin].
     *
     * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<Origin> = origin

    /**
     * Returns the raw JSON value of [parser].
     *
     * Unlike [parser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parser") @ExcludeMissing fun _parser(): JsonField<Parser> = parser

    /**
     * Returns the raw JSON value of [prompt].
     *
     * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<Prompt> = prompt

    /**
     * Returns the raw JSON value of [toolFunctions].
     *
     * Unlike [toolFunctions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_functions")
    @ExcludeMissing
    fun _toolFunctions(): JsonField<List<ToolFunction>> = toolFunctions

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

        /** Returns a mutable builder for constructing an instance of [PromptData]. */
        @JvmStatic fun builder() = Builder()
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
        internal fun from(promptData: PromptData) = apply {
            options = promptData.options
            origin = promptData.origin
            parser = promptData.parser
            prompt = promptData.prompt
            toolFunctions = promptData.toolFunctions.map { it.toMutableList() }
            additionalProperties = promptData.additionalProperties.toMutableMap()
        }

        fun options(options: PromptOptions?) = options(JsonField.ofNullable(options))

        /** Alias for calling [Builder.options] with `options.orElse(null)`. */
        fun options(options: Optional<PromptOptions>) = options(options.getOrNull())

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed [PromptOptions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun options(options: JsonField<PromptOptions>) = apply { this.options = options }

        fun origin(origin: Origin?) = origin(JsonField.ofNullable(origin))

        /** Alias for calling [Builder.origin] with `origin.orElse(null)`. */
        fun origin(origin: Optional<Origin>) = origin(origin.getOrNull())

        /**
         * Sets [Builder.origin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origin] with a well-typed [Origin] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun origin(origin: JsonField<Origin>) = apply { this.origin = origin }

        fun parser(parser: Parser?) = parser(JsonField.ofNullable(parser))

        /** Alias for calling [Builder.parser] with `parser.orElse(null)`. */
        fun parser(parser: Optional<Parser>) = parser(parser.getOrNull())

        /**
         * Sets [Builder.parser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parser] with a well-typed [Parser] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun parser(parser: JsonField<Parser>) = apply { this.parser = parser }

        fun prompt(prompt: Prompt?) = prompt(JsonField.ofNullable(prompt))

        /** Alias for calling [Builder.prompt] with `prompt.orElse(null)`. */
        fun prompt(prompt: Optional<Prompt>) = prompt(prompt.getOrNull())

        /**
         * Sets [Builder.prompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompt] with a well-typed [Prompt] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prompt(prompt: JsonField<Prompt>) = apply { this.prompt = prompt }

        /** Alias for calling [prompt] with `Prompt.ofCompletion(completion)`. */
        fun prompt(completion: Prompt.Completion) = prompt(Prompt.ofCompletion(completion))

        /** Alias for calling [prompt] with `Prompt.ofChat(chat)`. */
        fun prompt(chat: Prompt.Chat) = prompt(Prompt.ofChat(chat))

        fun toolFunctions(toolFunctions: List<ToolFunction>?) =
            toolFunctions(JsonField.ofNullable(toolFunctions))

        /** Alias for calling [Builder.toolFunctions] with `toolFunctions.orElse(null)`. */
        fun toolFunctions(toolFunctions: Optional<List<ToolFunction>>) =
            toolFunctions(toolFunctions.getOrNull())

        /**
         * Sets [Builder.toolFunctions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolFunctions] with a well-typed `List<ToolFunction>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun toolFunctions(toolFunctions: JsonField<List<ToolFunction>>) = apply {
            this.toolFunctions = toolFunctions.map { it.toMutableList() }
        }

        /**
         * Adds a single [ToolFunction] to [toolFunctions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addToolFunction(toolFunction: ToolFunction) = apply {
            toolFunctions =
                (toolFunctions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("toolFunctions", it).add(toolFunction)
                }
        }

        /** Alias for calling [addToolFunction] with `ToolFunction.ofFunction(function)`. */
        fun addToolFunction(function: ToolFunction.Function) =
            addToolFunction(ToolFunction.ofFunction(function))

        /** Alias for calling [addToolFunction] with `ToolFunction.ofGlobal(global)`. */
        fun addToolFunction(global: ToolFunction.Global) =
            addToolFunction(ToolFunction.ofGlobal(global))

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
         * Returns an immutable instance of [PromptData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PromptData =
            PromptData(
                options,
                origin,
                parser,
                prompt,
                (toolFunctions ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PromptData = apply {
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

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: BraintrustInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (options.asKnown().getOrNull()?.validity() ?: 0) +
            (origin.asKnown().getOrNull()?.validity() ?: 0) +
            (parser.asKnown().getOrNull()?.validity() ?: 0) +
            (prompt.asKnown().getOrNull()?.validity() ?: 0) +
            (toolFunctions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Origin
    private constructor(
        private val projectId: JsonField<String>,
        private val promptId: JsonField<String>,
        private val promptVersion: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("project_id")
            @ExcludeMissing
            projectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt_id")
            @ExcludeMissing
            promptId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt_version")
            @ExcludeMissing
            promptVersion: JsonField<String> = JsonMissing.of(),
        ) : this(projectId, promptId, promptVersion, mutableMapOf())

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun projectId(): Optional<String> = Optional.ofNullable(projectId.getNullable("project_id"))

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun promptId(): Optional<String> = Optional.ofNullable(promptId.getNullable("prompt_id"))

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun promptVersion(): Optional<String> =
            Optional.ofNullable(promptVersion.getNullable("prompt_version"))

        /**
         * Returns the raw JSON value of [projectId].
         *
         * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

        /**
         * Returns the raw JSON value of [promptId].
         *
         * Unlike [promptId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompt_id") @ExcludeMissing fun _promptId(): JsonField<String> = promptId

        /**
         * Returns the raw JSON value of [promptVersion].
         *
         * Unlike [promptVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("prompt_version")
        @ExcludeMissing
        fun _promptVersion(): JsonField<String> = promptVersion

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

            /** Returns a mutable builder for constructing an instance of [Origin]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Origin]. */
        class Builder internal constructor() {

            private var projectId: JsonField<String> = JsonMissing.of()
            private var promptId: JsonField<String> = JsonMissing.of()
            private var promptVersion: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(origin: Origin) = apply {
                projectId = origin.projectId
                promptId = origin.promptId
                promptVersion = origin.promptVersion
                additionalProperties = origin.additionalProperties.toMutableMap()
            }

            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /**
             * Sets [Builder.projectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            fun promptId(promptId: String) = promptId(JsonField.of(promptId))

            /**
             * Sets [Builder.promptId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promptId(promptId: JsonField<String>) = apply { this.promptId = promptId }

            fun promptVersion(promptVersion: String) = promptVersion(JsonField.of(promptVersion))

            /**
             * Sets [Builder.promptVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promptVersion(promptVersion: JsonField<String>) = apply {
                this.promptVersion = promptVersion
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
             * Returns an immutable instance of [Origin].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Origin =
                Origin(projectId, promptId, promptVersion, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Origin = apply {
            if (validated) {
                return@apply
            }

            projectId()
            promptId()
            promptVersion()
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
            (if (projectId.asKnown().isPresent) 1 else 0) +
                (if (promptId.asKnown().isPresent) 1 else 0) +
                (if (promptVersion.asKnown().isPresent) 1 else 0)

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

        override fun toString() =
            "Origin{projectId=$projectId, promptId=$promptId, promptVersion=$promptVersion, additionalProperties=$additionalProperties}"
    }

    class Parser
    private constructor(
        private val choiceScores: JsonField<ChoiceScores>,
        private val type: JsonField<Type>,
        private val useCot: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("choice_scores")
            @ExcludeMissing
            choiceScores: JsonField<ChoiceScores> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("use_cot") @ExcludeMissing useCot: JsonField<Boolean> = JsonMissing.of(),
        ) : this(choiceScores, type, useCot, mutableMapOf())

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun choiceScores(): ChoiceScores = choiceScores.getRequired("choice_scores")

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun useCot(): Boolean = useCot.getRequired("use_cot")

        /**
         * Returns the raw JSON value of [choiceScores].
         *
         * Unlike [choiceScores], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("choice_scores")
        @ExcludeMissing
        fun _choiceScores(): JsonField<ChoiceScores> = choiceScores

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [useCot].
         *
         * Unlike [useCot], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("use_cot") @ExcludeMissing fun _useCot(): JsonField<Boolean> = useCot

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
             * Returns a mutable builder for constructing an instance of [Parser].
             *
             * The following fields are required:
             * ```java
             * .choiceScores()
             * .type()
             * .useCot()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Parser]. */
        class Builder internal constructor() {

            private var choiceScores: JsonField<ChoiceScores>? = null
            private var type: JsonField<Type>? = null
            private var useCot: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(parser: Parser) = apply {
                choiceScores = parser.choiceScores
                type = parser.type
                useCot = parser.useCot
                additionalProperties = parser.additionalProperties.toMutableMap()
            }

            fun choiceScores(choiceScores: ChoiceScores) = choiceScores(JsonField.of(choiceScores))

            /**
             * Sets [Builder.choiceScores] to an arbitrary JSON value.
             *
             * You should usually call [Builder.choiceScores] with a well-typed [ChoiceScores] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun choiceScores(choiceScores: JsonField<ChoiceScores>) = apply {
                this.choiceScores = choiceScores
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun useCot(useCot: Boolean) = useCot(JsonField.of(useCot))

            /**
             * Sets [Builder.useCot] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useCot] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun useCot(useCot: JsonField<Boolean>) = apply { this.useCot = useCot }

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
             * Returns an immutable instance of [Parser].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .choiceScores()
             * .type()
             * .useCot()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Parser =
                Parser(
                    checkRequired("choiceScores", choiceScores),
                    checkRequired("type", type),
                    checkRequired("useCot", useCot),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Parser = apply {
            if (validated) {
                return@apply
            }

            choiceScores().validate()
            type().validate()
            useCot()
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
            (choiceScores.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (useCot.asKnown().isPresent) 1 else 0)

        class ChoiceScores
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

                /** Returns a mutable builder for constructing an instance of [ChoiceScores]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ChoiceScores]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(choiceScores: ChoiceScores) = apply {
                    additionalProperties = choiceScores.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [ChoiceScores].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ChoiceScores = ChoiceScores(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): ChoiceScores = apply {
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

                return /* spotless:off */ other is ChoiceScores && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "ChoiceScores{additionalProperties=$additionalProperties}"
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val LLM_CLASSIFIER = of("llm_classifier")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                LLM_CLASSIFIER
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             *   known member.
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
             * @throws BraintrustInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    BraintrustInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
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

        override fun toString() =
            "Parser{choiceScores=$choiceScores, type=$type, useCot=$useCot, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Prompt.Deserializer::class)
    @JsonSerialize(using = Prompt.Serializer::class)
    class Prompt
    private constructor(
        private val completion: Completion? = null,
        private val chat: Chat? = null,
        private val _json: JsonValue? = null,
    ) {

        fun completion(): Optional<Completion> = Optional.ofNullable(completion)

        fun chat(): Optional<Chat> = Optional.ofNullable(chat)

        fun isCompletion(): Boolean = completion != null

        fun isChat(): Boolean = chat != null

        fun asCompletion(): Completion = completion.getOrThrow("completion")

        fun asChat(): Chat = chat.getOrThrow("chat")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                completion != null -> visitor.visitCompletion(completion)
                chat != null -> visitor.visitChat(chat)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Prompt = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitCompletion(completion: Completion) {
                        completion.validate()
                    }

                    override fun visitChat(chat: Chat) {
                        chat.validate()
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
                    override fun visitCompletion(completion: Completion) = completion.validity()

                    override fun visitChat(chat: Chat) = chat.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Prompt && completion == other.completion && chat == other.chat /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(completion, chat) /* spotless:on */

        override fun toString(): String =
            when {
                completion != null -> "Prompt{completion=$completion}"
                chat != null -> "Prompt{chat=$chat}"
                _json != null -> "Prompt{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Prompt")
            }

        companion object {

            @JvmStatic fun ofCompletion(completion: Completion) = Prompt(completion = completion)

            @JvmStatic fun ofChat(chat: Chat) = Prompt(chat = chat)
        }

        /** An interface that defines how to map each variant of [Prompt] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitCompletion(completion: Completion): T

            fun visitChat(chat: Chat): T

            /**
             * Maps an unknown variant of [Prompt] to a value of type [T].
             *
             * An instance of [Prompt] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Completion>())?.let {
                                Prompt(completion = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Chat>())?.let {
                                Prompt(chat = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Prompt(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Prompt>(Prompt::class) {

            override fun serialize(
                value: Prompt,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.completion != null -> generator.writeObject(value.completion)
                    value.chat != null -> generator.writeObject(value.chat)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Prompt")
                }
            }
        }

        class Completion
        private constructor(
            private val content: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(content, type, mutableMapOf())

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): String = content.getRequired("content")

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [Completion].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Completion]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(completion: Completion) = apply {
                    content = completion.content
                    type = completion.type
                    additionalProperties = completion.additionalProperties.toMutableMap()
                }

                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Completion].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Completion =
                    Completion(
                        checkRequired("content", content),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Completion = apply {
                if (validated) {
                    return@apply
                }

                content()
                type().validate()
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
                (if (content.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val COMPLETION = of("completion")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    COMPLETION
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    COMPLETION,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                 *   known member.
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
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BraintrustInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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

            override fun toString() =
                "Completion{content=$content, type=$type, additionalProperties=$additionalProperties}"
        }

        class Chat
        private constructor(
            private val messages: JsonField<List<Message>>,
            private val type: JsonField<Type>,
            private val tools: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("messages")
                @ExcludeMissing
                messages: JsonField<List<Message>> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("tools") @ExcludeMissing tools: JsonField<String> = JsonMissing.of(),
            ) : this(messages, type, tools, mutableMapOf())

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun messages(): List<Message> = messages.getRequired("messages")

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun tools(): Optional<String> = Optional.ofNullable(tools.getNullable("tools"))

            /**
             * Returns the raw JSON value of [messages].
             *
             * Unlike [messages], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("messages")
            @ExcludeMissing
            fun _messages(): JsonField<List<Message>> = messages

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [tools].
             *
             * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonField<String> = tools

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
                 * Returns a mutable builder for constructing an instance of [Chat].
                 *
                 * The following fields are required:
                 * ```java
                 * .messages()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Chat]. */
            class Builder internal constructor() {

                private var messages: JsonField<MutableList<Message>>? = null
                private var type: JsonField<Type>? = null
                private var tools: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(chat: Chat) = apply {
                    messages = chat.messages.map { it.toMutableList() }
                    type = chat.type
                    tools = chat.tools
                    additionalProperties = chat.additionalProperties.toMutableMap()
                }

                fun messages(messages: List<Message>) = messages(JsonField.of(messages))

                /**
                 * Sets [Builder.messages] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.messages] with a well-typed `List<Message>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun messages(messages: JsonField<List<Message>>) = apply {
                    this.messages = messages.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Message] to [messages].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMessage(message: Message) = apply {
                    messages =
                        (messages ?: JsonField.of(mutableListOf())).also {
                            checkKnown("messages", it).add(message)
                        }
                }

                /** Alias for calling [addMessage] with `Message.ofSystem(system)`. */
                fun addMessage(system: Message.System) = addMessage(Message.ofSystem(system))

                /** Alias for calling [addMessage] with `Message.ofUser(user)`. */
                fun addMessage(user: Message.User) = addMessage(Message.ofUser(user))

                /** Alias for calling [addMessage] with `Message.ofAssistant(assistant)`. */
                fun addMessage(assistant: Message.Assistant) =
                    addMessage(Message.ofAssistant(assistant))

                /** Alias for calling [addMessage] with `Message.ofTool(tool)`. */
                fun addMessage(tool: Message.Tool) = addMessage(Message.ofTool(tool))

                /** Alias for calling [addMessage] with `Message.ofFunction(function)`. */
                fun addMessage(function: Message.Function) =
                    addMessage(Message.ofFunction(function))

                /** Alias for calling [addMessage] with `Message.ofFallback(fallback)`. */
                fun addMessage(fallback: Message.Fallback) =
                    addMessage(Message.ofFallback(fallback))

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun tools(tools: String) = tools(JsonField.of(tools))

                /**
                 * Sets [Builder.tools] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tools] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tools(tools: JsonField<String>) = apply { this.tools = tools }

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
                 * Returns an immutable instance of [Chat].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .messages()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Chat =
                    Chat(
                        checkRequired("messages", messages).map { it.toImmutable() },
                        checkRequired("type", type),
                        tools,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Chat = apply {
                if (validated) {
                    return@apply
                }

                messages().forEach { it.validate() }
                type().validate()
                tools()
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
                (messages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (tools.asKnown().isPresent) 1 else 0)

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

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        system != null -> visitor.visitSystem(system)
                        user != null -> visitor.visitUser(user)
                        assistant != null -> visitor.visitAssistant(assistant)
                        tool != null -> visitor.visitTool(tool)
                        function != null -> visitor.visitFunction(function)
                        fallback != null -> visitor.visitFallback(fallback)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Message = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
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
                            override fun visitSystem(system: System) = system.validity()

                            override fun visitUser(user: User) = user.validity()

                            override fun visitAssistant(assistant: Assistant) = assistant.validity()

                            override fun visitTool(tool: Tool) = tool.validity()

                            override fun visitFunction(function: Function) = function.validity()

                            override fun visitFallback(fallback: Fallback) = fallback.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

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

                    @JvmStatic fun ofSystem(system: System) = Message(system = system)

                    @JvmStatic fun ofUser(user: User) = Message(user = user)

                    @JvmStatic
                    fun ofAssistant(assistant: Assistant) = Message(assistant = assistant)

                    @JvmStatic fun ofTool(tool: Tool) = Message(tool = tool)

                    @JvmStatic fun ofFunction(function: Function) = Message(function = function)

                    @JvmStatic fun ofFallback(fallback: Fallback) = Message(fallback = fallback)
                }

                /**
                 * An interface that defines how to map each variant of [Message] to a value of type
                 * [T].
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
                     * An instance of [Message] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
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

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<System>())?.let {
                                        Message(system = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<User>())?.let {
                                        Message(user = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Assistant>())?.let {
                                        Message(assistant = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Tool>())?.let {
                                        Message(tool = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Function>())?.let {
                                        Message(function = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Fallback>())?.let {
                                        Message(fallback = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Message(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Message>(Message::class) {

                    override fun serialize(
                        value: Message,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
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

                class System
                private constructor(
                    private val role: JsonField<Role>,
                    private val content: JsonField<String>,
                    private val name: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("role")
                        @ExcludeMissing
                        role: JsonField<Role> = JsonMissing.of(),
                        @JsonProperty("content")
                        @ExcludeMissing
                        content: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                    ) : this(role, content, name, mutableMapOf())

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun role(): Role = role.getRequired("role")

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun content(): Optional<String> =
                        Optional.ofNullable(content.getNullable("content"))

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                    /**
                     * Returns the raw JSON value of [role].
                     *
                     * Unlike [role], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

                    /**
                     * Returns the raw JSON value of [content].
                     *
                     * Unlike [content], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("content")
                    @ExcludeMissing
                    fun _content(): JsonField<String> = content

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                         * Returns a mutable builder for constructing an instance of [System].
                         *
                         * The following fields are required:
                         * ```java
                         * .role()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [System]. */
                    class Builder internal constructor() {

                        private var role: JsonField<Role>? = null
                        private var content: JsonField<String> = JsonMissing.of()
                        private var name: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(system: System) = apply {
                            role = system.role
                            content = system.content
                            name = system.name
                            additionalProperties = system.additionalProperties.toMutableMap()
                        }

                        fun role(role: Role) = role(JsonField.of(role))

                        /**
                         * Sets [Builder.role] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.role] with a well-typed [Role] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun role(role: JsonField<Role>) = apply { this.role = role }

                        fun content(content: String) = content(JsonField.of(content))

                        /**
                         * Sets [Builder.content] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.content] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun content(content: JsonField<String>) = apply { this.content = content }

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
                         * Returns an immutable instance of [System].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .role()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): System =
                            System(
                                checkRequired("role", role),
                                content,
                                name,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): System = apply {
                        if (validated) {
                            return@apply
                        }

                        role().validate()
                        content()
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
                        (role.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (content.asKnown().isPresent) 1 else 0) +
                            (if (name.asKnown().isPresent) 1 else 0)

                    class Role
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

                            @JvmField val SYSTEM = of("system")

                            @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                        }

                        /** An enum containing [Role]'s known values. */
                        enum class Known {
                            SYSTEM
                        }

                        /**
                         * An enum containing [Role]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Role] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            SYSTEM,
                            /**
                             * An enum member indicating that [Role] was instantiated with an
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
                                SYSTEM -> Value.SYSTEM
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
                                SYSTEM -> Known.SYSTEM
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
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

                        private var validated: Boolean = false

                        fun validate(): Role = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                    override fun toString() =
                        "System{role=$role, content=$content, name=$name, additionalProperties=$additionalProperties}"
                }

                class User
                private constructor(
                    private val role: JsonField<Role>,
                    private val content: JsonField<Content>,
                    private val name: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("role")
                        @ExcludeMissing
                        role: JsonField<Role> = JsonMissing.of(),
                        @JsonProperty("content")
                        @ExcludeMissing
                        content: JsonField<Content> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                    ) : this(role, content, name, mutableMapOf())

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun role(): Role = role.getRequired("role")

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun content(): Optional<Content> =
                        Optional.ofNullable(content.getNullable("content"))

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                    /**
                     * Returns the raw JSON value of [role].
                     *
                     * Unlike [role], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

                    /**
                     * Returns the raw JSON value of [content].
                     *
                     * Unlike [content], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("content")
                    @ExcludeMissing
                    fun _content(): JsonField<Content> = content

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                         * Returns a mutable builder for constructing an instance of [User].
                         *
                         * The following fields are required:
                         * ```java
                         * .role()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [User]. */
                    class Builder internal constructor() {

                        private var role: JsonField<Role>? = null
                        private var content: JsonField<Content> = JsonMissing.of()
                        private var name: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(user: User) = apply {
                            role = user.role
                            content = user.content
                            name = user.name
                            additionalProperties = user.additionalProperties.toMutableMap()
                        }

                        fun role(role: Role) = role(JsonField.of(role))

                        /**
                         * Sets [Builder.role] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.role] with a well-typed [Role] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun role(role: JsonField<Role>) = apply { this.role = role }

                        fun content(content: Content) = content(JsonField.of(content))

                        /**
                         * Sets [Builder.content] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.content] with a well-typed [Content]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun content(content: JsonField<Content>) = apply { this.content = content }

                        /** Alias for calling [content] with `Content.ofText(text)`. */
                        fun content(text: String) = content(Content.ofText(text))

                        /** Alias for calling [content] with `Content.ofArray(array)`. */
                        fun contentOfArray(array: List<Content.ChatCompletionContentPart>) =
                            content(Content.ofArray(array))

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
                         * Returns an immutable instance of [User].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .role()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): User =
                            User(
                                checkRequired("role", role),
                                content,
                                name,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): User = apply {
                        if (validated) {
                            return@apply
                        }

                        role().validate()
                        content().ifPresent { it.validate() }
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
                        (role.asKnown().getOrNull()?.validity() ?: 0) +
                            (content.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (name.asKnown().isPresent) 1 else 0)

                    class Role
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

                            @JvmField val USER = of("user")

                            @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                        }

                        /** An enum containing [Role]'s known values. */
                        enum class Known {
                            USER
                        }

                        /**
                         * An enum containing [Role]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Role] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            USER,
                            /**
                             * An enum member indicating that [Role] was instantiated with an
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
                                USER -> Value.USER
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
                                USER -> Known.USER
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
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

                        private var validated: Boolean = false

                        fun validate(): Role = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
                    class Content
                    private constructor(
                        private val text: String? = null,
                        private val array: List<ChatCompletionContentPart>? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        fun text(): Optional<String> = Optional.ofNullable(text)

                        fun array(): Optional<List<ChatCompletionContentPart>> =
                            Optional.ofNullable(array)

                        fun isText(): Boolean = text != null

                        fun isArray(): Boolean = array != null

                        fun asText(): String = text.getOrThrow("text")

                        fun asArray(): List<ChatCompletionContentPart> = array.getOrThrow("array")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        fun <T> accept(visitor: Visitor<T>): T =
                            when {
                                text != null -> visitor.visitText(text)
                                array != null -> visitor.visitArray(array)
                                else -> visitor.unknown(_json)
                            }

                        private var validated: Boolean = false

                        fun validate(): Content = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitText(text: String) {}

                                    override fun visitArray(
                                        array: List<ChatCompletionContentPart>
                                    ) {
                                        array.forEach { it.validate() }
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitText(text: String) = 1

                                    override fun visitArray(
                                        array: List<ChatCompletionContentPart>
                                    ) = array.sumOf { it.validity().toInt() }

                                    override fun unknown(json: JsonValue?) = 0
                                }
                            )

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

                            @JvmStatic fun ofText(text: String) = Content(text = text)

                            @JvmStatic
                            fun ofArray(array: List<ChatCompletionContentPart>) =
                                Content(array = array)
                        }

                        /**
                         * An interface that defines how to map each variant of [Content] to a value
                         * of type [T].
                         */
                        interface Visitor<out T> {

                            fun visitText(text: String): T

                            fun visitArray(array: List<ChatCompletionContentPart>): T

                            /**
                             * Maps an unknown variant of [Content] to a value of type [T].
                             *
                             * An instance of [Content] can contain an unknown variant if it was
                             * deserialized from data that doesn't match any known variant. For
                             * example, if the SDK is on an older version than the API, then the API
                             * may respond with new variants that the SDK is unaware of.
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

                                val bestMatches =
                                    sequenceOf(
                                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                                Content(text = it, _json = json)
                                            },
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<
                                                        List<ChatCompletionContentPart>
                                                    >(),
                                                )
                                                ?.let { Content(array = it, _json = json) },
                                        )
                                        .filterNotNull()
                                        .allMaxBy { it.validity() }
                                        .toList()
                                return when (bestMatches.size) {
                                    // This can happen if what we're deserializing is completely
                                    // incompatible with all the possible variants (e.g.
                                    // deserializing from object).
                                    0 -> Content(_json = json)
                                    1 -> bestMatches.single()
                                    // If there's more than one match with the highest validity,
                                    // then use the first completely valid match, or simply the
                                    // first match if none are completely valid.
                                    else ->
                                        bestMatches.firstOrNull { it.isValid() }
                                            ?: bestMatches.first()
                                }
                            }
                        }

                        internal class Serializer : BaseSerializer<Content>(Content::class) {

                            override fun serialize(
                                value: Content,
                                generator: JsonGenerator,
                                provider: SerializerProvider,
                            ) {
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
                        class ChatCompletionContentPart
                        private constructor(
                            private val text: ChatCompletionContentPartText? = null,
                            private val image: ChatCompletionContentPartImage? = null,
                            private val _json: JsonValue? = null,
                        ) {

                            fun text(): Optional<ChatCompletionContentPartText> =
                                Optional.ofNullable(text)

                            fun image(): Optional<ChatCompletionContentPartImage> =
                                Optional.ofNullable(image)

                            fun isText(): Boolean = text != null

                            fun isImage(): Boolean = image != null

                            fun asText(): ChatCompletionContentPartText = text.getOrThrow("text")

                            fun asImage(): ChatCompletionContentPartImage =
                                image.getOrThrow("image")

                            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                            fun <T> accept(visitor: Visitor<T>): T =
                                when {
                                    text != null -> visitor.visitText(text)
                                    image != null -> visitor.visitImage(image)
                                    else -> visitor.unknown(_json)
                                }

                            private var validated: Boolean = false

                            fun validate(): ChatCompletionContentPart = apply {
                                if (validated) {
                                    return@apply
                                }

                                accept(
                                    object : Visitor<Unit> {
                                        override fun visitText(
                                            text: ChatCompletionContentPartText
                                        ) {
                                            text.validate()
                                        }

                                        override fun visitImage(
                                            image: ChatCompletionContentPartImage
                                        ) {
                                            image.validate()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                accept(
                                    object : Visitor<Int> {
                                        override fun visitText(
                                            text: ChatCompletionContentPartText
                                        ) = text.validity()

                                        override fun visitImage(
                                            image: ChatCompletionContentPartImage
                                        ) = image.validity()

                                        override fun unknown(json: JsonValue?) = 0
                                    }
                                )

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
                                    else ->
                                        throw IllegalStateException(
                                            "Invalid ChatCompletionContentPart"
                                        )
                                }

                            companion object {

                                @JvmStatic
                                fun ofText(text: ChatCompletionContentPartText) =
                                    ChatCompletionContentPart(text = text)

                                @JvmStatic
                                fun ofImage(image: ChatCompletionContentPartImage) =
                                    ChatCompletionContentPart(image = image)
                            }

                            /**
                             * An interface that defines how to map each variant of
                             * [ChatCompletionContentPart] to a value of type [T].
                             */
                            interface Visitor<out T> {

                                fun visitText(text: ChatCompletionContentPartText): T

                                fun visitImage(image: ChatCompletionContentPartImage): T

                                /**
                                 * Maps an unknown variant of [ChatCompletionContentPart] to a value
                                 * of type [T].
                                 *
                                 * An instance of [ChatCompletionContentPart] can contain an unknown
                                 * variant if it was deserialized from data that doesn't match any
                                 * known variant. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new variants that the
                                 * SDK is unaware of.
                                 *
                                 * @throws BraintrustInvalidDataException in the default
                                 *   implementation.
                                 */
                                fun unknown(json: JsonValue?): T {
                                    throw BraintrustInvalidDataException(
                                        "Unknown ChatCompletionContentPart: $json"
                                    )
                                }
                            }

                            internal class Deserializer :
                                BaseDeserializer<ChatCompletionContentPart>(
                                    ChatCompletionContentPart::class
                                ) {

                                override fun ObjectCodec.deserialize(
                                    node: JsonNode
                                ): ChatCompletionContentPart {
                                    val json = JsonValue.fromJsonNode(node)

                                    val bestMatches =
                                        sequenceOf(
                                                tryDeserialize(
                                                        node,
                                                        jacksonTypeRef<
                                                            ChatCompletionContentPartText
                                                        >(),
                                                    )
                                                    ?.let {
                                                        ChatCompletionContentPart(
                                                            text = it,
                                                            _json = json,
                                                        )
                                                    },
                                                tryDeserialize(
                                                        node,
                                                        jacksonTypeRef<
                                                            ChatCompletionContentPartImage
                                                        >(),
                                                    )
                                                    ?.let {
                                                        ChatCompletionContentPart(
                                                            image = it,
                                                            _json = json,
                                                        )
                                                    },
                                            )
                                            .filterNotNull()
                                            .allMaxBy { it.validity() }
                                            .toList()
                                    return when (bestMatches.size) {
                                        // This can happen if what we're deserializing is completely
                                        // incompatible with all the possible variants (e.g.
                                        // deserializing from boolean).
                                        0 -> ChatCompletionContentPart(_json = json)
                                        1 -> bestMatches.single()
                                        // If there's more than one match with the highest validity,
                                        // then use the first completely valid match, or simply the
                                        // first match if none are completely valid.
                                        else ->
                                            bestMatches.firstOrNull { it.isValid() }
                                                ?: bestMatches.first()
                                    }
                                }
                            }

                            internal class Serializer :
                                BaseSerializer<ChatCompletionContentPart>(
                                    ChatCompletionContentPart::class
                                ) {

                                override fun serialize(
                                    value: ChatCompletionContentPart,
                                    generator: JsonGenerator,
                                    provider: SerializerProvider,
                                ) {
                                    when {
                                        value.text != null -> generator.writeObject(value.text)
                                        value.image != null -> generator.writeObject(value.image)
                                        value._json != null -> generator.writeObject(value._json)
                                        else ->
                                            throw IllegalStateException(
                                                "Invalid ChatCompletionContentPart"
                                            )
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

                    override fun toString() =
                        "User{role=$role, content=$content, name=$name, additionalProperties=$additionalProperties}"
                }

                class Assistant
                private constructor(
                    private val role: JsonField<Role>,
                    private val content: JsonField<String>,
                    private val functionCall: JsonField<FunctionCall>,
                    private val name: JsonField<String>,
                    private val toolCalls: JsonField<List<ChatCompletionMessageToolCall>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("role")
                        @ExcludeMissing
                        role: JsonField<Role> = JsonMissing.of(),
                        @JsonProperty("content")
                        @ExcludeMissing
                        content: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("function_call")
                        @ExcludeMissing
                        functionCall: JsonField<FunctionCall> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("tool_calls")
                        @ExcludeMissing
                        toolCalls: JsonField<List<ChatCompletionMessageToolCall>> = JsonMissing.of(),
                    ) : this(role, content, functionCall, name, toolCalls, mutableMapOf())

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun role(): Role = role.getRequired("role")

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun content(): Optional<String> =
                        Optional.ofNullable(content.getNullable("content"))

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun functionCall(): Optional<FunctionCall> =
                        Optional.ofNullable(functionCall.getNullable("function_call"))

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun toolCalls(): Optional<List<ChatCompletionMessageToolCall>> =
                        Optional.ofNullable(toolCalls.getNullable("tool_calls"))

                    /**
                     * Returns the raw JSON value of [role].
                     *
                     * Unlike [role], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

                    /**
                     * Returns the raw JSON value of [content].
                     *
                     * Unlike [content], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("content")
                    @ExcludeMissing
                    fun _content(): JsonField<String> = content

                    /**
                     * Returns the raw JSON value of [functionCall].
                     *
                     * Unlike [functionCall], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("function_call")
                    @ExcludeMissing
                    fun _functionCall(): JsonField<FunctionCall> = functionCall

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [toolCalls].
                     *
                     * Unlike [toolCalls], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("tool_calls")
                    @ExcludeMissing
                    fun _toolCalls(): JsonField<List<ChatCompletionMessageToolCall>> = toolCalls

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
                         * Returns a mutable builder for constructing an instance of [Assistant].
                         *
                         * The following fields are required:
                         * ```java
                         * .role()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Assistant]. */
                    class Builder internal constructor() {

                        private var role: JsonField<Role>? = null
                        private var content: JsonField<String> = JsonMissing.of()
                        private var functionCall: JsonField<FunctionCall> = JsonMissing.of()
                        private var name: JsonField<String> = JsonMissing.of()
                        private var toolCalls:
                            JsonField<MutableList<ChatCompletionMessageToolCall>>? =
                            null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(assistant: Assistant) = apply {
                            role = assistant.role
                            content = assistant.content
                            functionCall = assistant.functionCall
                            name = assistant.name
                            toolCalls = assistant.toolCalls.map { it.toMutableList() }
                            additionalProperties = assistant.additionalProperties.toMutableMap()
                        }

                        fun role(role: Role) = role(JsonField.of(role))

                        /**
                         * Sets [Builder.role] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.role] with a well-typed [Role] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun role(role: JsonField<Role>) = apply { this.role = role }

                        fun content(content: String?) = content(JsonField.ofNullable(content))

                        /** Alias for calling [Builder.content] with `content.orElse(null)`. */
                        fun content(content: Optional<String>) = content(content.getOrNull())

                        /**
                         * Sets [Builder.content] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.content] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun content(content: JsonField<String>) = apply { this.content = content }

                        fun functionCall(functionCall: FunctionCall?) =
                            functionCall(JsonField.ofNullable(functionCall))

                        /**
                         * Alias for calling [Builder.functionCall] with
                         * `functionCall.orElse(null)`.
                         */
                        fun functionCall(functionCall: Optional<FunctionCall>) =
                            functionCall(functionCall.getOrNull())

                        /**
                         * Sets [Builder.functionCall] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.functionCall] with a well-typed
                         * [FunctionCall] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun functionCall(functionCall: JsonField<FunctionCall>) = apply {
                            this.functionCall = functionCall
                        }

                        fun name(name: String?) = name(JsonField.ofNullable(name))

                        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                        fun name(name: Optional<String>) = name(name.getOrNull())

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun toolCalls(toolCalls: List<ChatCompletionMessageToolCall>?) =
                            toolCalls(JsonField.ofNullable(toolCalls))

                        /** Alias for calling [Builder.toolCalls] with `toolCalls.orElse(null)`. */
                        fun toolCalls(toolCalls: Optional<List<ChatCompletionMessageToolCall>>) =
                            toolCalls(toolCalls.getOrNull())

                        /**
                         * Sets [Builder.toolCalls] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.toolCalls] with a well-typed
                         * `List<ChatCompletionMessageToolCall>` value instead. This method is
                         * primarily for setting the field to an undocumented or not yet supported
                         * value.
                         */
                        fun toolCalls(toolCalls: JsonField<List<ChatCompletionMessageToolCall>>) =
                            apply {
                                this.toolCalls = toolCalls.map { it.toMutableList() }
                            }

                        /**
                         * Adds a single [ChatCompletionMessageToolCall] to [toolCalls].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addToolCall(toolCall: ChatCompletionMessageToolCall) = apply {
                            toolCalls =
                                (toolCalls ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("toolCalls", it).add(toolCall)
                                }
                        }

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
                         * Returns an immutable instance of [Assistant].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .role()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Assistant =
                            Assistant(
                                checkRequired("role", role),
                                content,
                                functionCall,
                                name,
                                (toolCalls ?: JsonMissing.of()).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Assistant = apply {
                        if (validated) {
                            return@apply
                        }

                        role().validate()
                        content()
                        functionCall().ifPresent { it.validate() }
                        name()
                        toolCalls().ifPresent { it.forEach { it.validate() } }
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
                        (role.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (content.asKnown().isPresent) 1 else 0) +
                            (functionCall.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (name.asKnown().isPresent) 1 else 0) +
                            (toolCalls.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

                    class Role
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

                            @JvmField val ASSISTANT = of("assistant")

                            @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                        }

                        /** An enum containing [Role]'s known values. */
                        enum class Known {
                            ASSISTANT
                        }

                        /**
                         * An enum containing [Role]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Role] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            ASSISTANT,
                            /**
                             * An enum member indicating that [Role] was instantiated with an
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
                                ASSISTANT -> Value.ASSISTANT
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
                                ASSISTANT -> Known.ASSISTANT
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
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

                        private var validated: Boolean = false

                        fun validate(): Role = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Role && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class FunctionCall
                    private constructor(
                        private val arguments: JsonField<String>,
                        private val name: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("arguments")
                            @ExcludeMissing
                            arguments: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("name")
                            @ExcludeMissing
                            name: JsonField<String> = JsonMissing.of(),
                        ) : this(arguments, name, mutableMapOf())

                        /**
                         * @throws BraintrustInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun arguments(): String = arguments.getRequired("arguments")

                        /**
                         * @throws BraintrustInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun name(): String = name.getRequired("name")

                        /**
                         * Returns the raw JSON value of [arguments].
                         *
                         * Unlike [arguments], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("arguments")
                        @ExcludeMissing
                        fun _arguments(): JsonField<String> = arguments

                        /**
                         * Returns the raw JSON value of [name].
                         *
                         * Unlike [name], this method doesn't throw if the JSON field has an
                         * unexpected type.
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
                             * Returns a mutable builder for constructing an instance of
                             * [FunctionCall].
                             *
                             * The following fields are required:
                             * ```java
                             * .arguments()
                             * .name()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [FunctionCall]. */
                        class Builder internal constructor() {

                            private var arguments: JsonField<String>? = null
                            private var name: JsonField<String>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(functionCall: FunctionCall) = apply {
                                arguments = functionCall.arguments
                                name = functionCall.name
                                additionalProperties =
                                    functionCall.additionalProperties.toMutableMap()
                            }

                            fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                            /**
                             * Sets [Builder.arguments] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.arguments] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun arguments(arguments: JsonField<String>) = apply {
                                this.arguments = arguments
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
                             * Returns an immutable instance of [FunctionCall].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .arguments()
                             * .name()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): FunctionCall =
                                FunctionCall(
                                    checkRequired("arguments", arguments),
                                    checkRequired("name", name),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): FunctionCall = apply {
                            if (validated) {
                                return@apply
                            }

                            arguments()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (arguments.asKnown().isPresent) 1 else 0) +
                                (if (name.asKnown().isPresent) 1 else 0)

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

                        override fun toString() =
                            "FunctionCall{arguments=$arguments, name=$name, additionalProperties=$additionalProperties}"
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

                    override fun toString() =
                        "Assistant{role=$role, content=$content, functionCall=$functionCall, name=$name, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
                }

                class Tool
                private constructor(
                    private val role: JsonField<Role>,
                    private val content: JsonField<String>,
                    private val toolCallId: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("role")
                        @ExcludeMissing
                        role: JsonField<Role> = JsonMissing.of(),
                        @JsonProperty("content")
                        @ExcludeMissing
                        content: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("tool_call_id")
                        @ExcludeMissing
                        toolCallId: JsonField<String> = JsonMissing.of(),
                    ) : this(role, content, toolCallId, mutableMapOf())

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun role(): Role = role.getRequired("role")

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun content(): Optional<String> =
                        Optional.ofNullable(content.getNullable("content"))

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun toolCallId(): Optional<String> =
                        Optional.ofNullable(toolCallId.getNullable("tool_call_id"))

                    /**
                     * Returns the raw JSON value of [role].
                     *
                     * Unlike [role], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

                    /**
                     * Returns the raw JSON value of [content].
                     *
                     * Unlike [content], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("content")
                    @ExcludeMissing
                    fun _content(): JsonField<String> = content

                    /**
                     * Returns the raw JSON value of [toolCallId].
                     *
                     * Unlike [toolCallId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("tool_call_id")
                    @ExcludeMissing
                    fun _toolCallId(): JsonField<String> = toolCallId

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
                         * Returns a mutable builder for constructing an instance of [Tool].
                         *
                         * The following fields are required:
                         * ```java
                         * .role()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Tool]. */
                    class Builder internal constructor() {

                        private var role: JsonField<Role>? = null
                        private var content: JsonField<String> = JsonMissing.of()
                        private var toolCallId: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(tool: Tool) = apply {
                            role = tool.role
                            content = tool.content
                            toolCallId = tool.toolCallId
                            additionalProperties = tool.additionalProperties.toMutableMap()
                        }

                        fun role(role: Role) = role(JsonField.of(role))

                        /**
                         * Sets [Builder.role] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.role] with a well-typed [Role] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun role(role: JsonField<Role>) = apply { this.role = role }

                        fun content(content: String) = content(JsonField.of(content))

                        /**
                         * Sets [Builder.content] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.content] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun content(content: JsonField<String>) = apply { this.content = content }

                        fun toolCallId(toolCallId: String) = toolCallId(JsonField.of(toolCallId))

                        /**
                         * Sets [Builder.toolCallId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.toolCallId] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun toolCallId(toolCallId: JsonField<String>) = apply {
                            this.toolCallId = toolCallId
                        }

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
                         * Returns an immutable instance of [Tool].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .role()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Tool =
                            Tool(
                                checkRequired("role", role),
                                content,
                                toolCallId,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Tool = apply {
                        if (validated) {
                            return@apply
                        }

                        role().validate()
                        content()
                        toolCallId()
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
                        (role.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (content.asKnown().isPresent) 1 else 0) +
                            (if (toolCallId.asKnown().isPresent) 1 else 0)

                    class Role
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

                            @JvmField val TOOL = of("tool")

                            @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                        }

                        /** An enum containing [Role]'s known values. */
                        enum class Known {
                            TOOL
                        }

                        /**
                         * An enum containing [Role]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Role] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            TOOL,
                            /**
                             * An enum member indicating that [Role] was instantiated with an
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
                                TOOL -> Value.TOOL
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
                                TOOL -> Known.TOOL
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
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

                        private var validated: Boolean = false

                        fun validate(): Role = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                    override fun toString() =
                        "Tool{role=$role, content=$content, toolCallId=$toolCallId, additionalProperties=$additionalProperties}"
                }

                class Function
                private constructor(
                    private val name: JsonField<String>,
                    private val role: JsonField<Role>,
                    private val content: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("role")
                        @ExcludeMissing
                        role: JsonField<Role> = JsonMissing.of(),
                        @JsonProperty("content")
                        @ExcludeMissing
                        content: JsonField<String> = JsonMissing.of(),
                    ) : this(name, role, content, mutableMapOf())

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun role(): Role = role.getRequired("role")

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun content(): Optional<String> =
                        Optional.ofNullable(content.getNullable("content"))

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [role].
                     *
                     * Unlike [role], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

                    /**
                     * Returns the raw JSON value of [content].
                     *
                     * Unlike [content], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("content")
                    @ExcludeMissing
                    fun _content(): JsonField<String> = content

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
                         * Returns a mutable builder for constructing an instance of [Function].
                         *
                         * The following fields are required:
                         * ```java
                         * .name()
                         * .role()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Function]. */
                    class Builder internal constructor() {

                        private var name: JsonField<String>? = null
                        private var role: JsonField<Role>? = null
                        private var content: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(function: Function) = apply {
                            name = function.name
                            role = function.role
                            content = function.content
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

                        fun role(role: Role) = role(JsonField.of(role))

                        /**
                         * Sets [Builder.role] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.role] with a well-typed [Role] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun role(role: JsonField<Role>) = apply { this.role = role }

                        fun content(content: String) = content(JsonField.of(content))

                        /**
                         * Sets [Builder.content] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.content] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun content(content: JsonField<String>) = apply { this.content = content }

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
                         * .role()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Function =
                            Function(
                                checkRequired("name", name),
                                checkRequired("role", role),
                                content,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Function = apply {
                        if (validated) {
                            return@apply
                        }

                        name()
                        role().validate()
                        content()
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
                        (if (name.asKnown().isPresent) 1 else 0) +
                            (role.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (content.asKnown().isPresent) 1 else 0)

                    class Role
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

                            @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                        }

                        /** An enum containing [Role]'s known values. */
                        enum class Known {
                            FUNCTION
                        }

                        /**
                         * An enum containing [Role]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Role] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            FUNCTION,
                            /**
                             * An enum member indicating that [Role] was instantiated with an
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
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
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

                        private var validated: Boolean = false

                        fun validate(): Role = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                    override fun toString() =
                        "Function{name=$name, role=$role, content=$content, additionalProperties=$additionalProperties}"
                }

                class Fallback
                private constructor(
                    private val role: JsonField<Role>,
                    private val content: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("role")
                        @ExcludeMissing
                        role: JsonField<Role> = JsonMissing.of(),
                        @JsonProperty("content")
                        @ExcludeMissing
                        content: JsonField<String> = JsonMissing.of(),
                    ) : this(role, content, mutableMapOf())

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun role(): Role = role.getRequired("role")

                    /**
                     * @throws BraintrustInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun content(): Optional<String> =
                        Optional.ofNullable(content.getNullable("content"))

                    /**
                     * Returns the raw JSON value of [role].
                     *
                     * Unlike [role], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

                    /**
                     * Returns the raw JSON value of [content].
                     *
                     * Unlike [content], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("content")
                    @ExcludeMissing
                    fun _content(): JsonField<String> = content

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
                         * Returns a mutable builder for constructing an instance of [Fallback].
                         *
                         * The following fields are required:
                         * ```java
                         * .role()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Fallback]. */
                    class Builder internal constructor() {

                        private var role: JsonField<Role>? = null
                        private var content: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(fallback: Fallback) = apply {
                            role = fallback.role
                            content = fallback.content
                            additionalProperties = fallback.additionalProperties.toMutableMap()
                        }

                        fun role(role: Role) = role(JsonField.of(role))

                        /**
                         * Sets [Builder.role] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.role] with a well-typed [Role] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun role(role: JsonField<Role>) = apply { this.role = role }

                        fun content(content: String?) = content(JsonField.ofNullable(content))

                        /** Alias for calling [Builder.content] with `content.orElse(null)`. */
                        fun content(content: Optional<String>) = content(content.getOrNull())

                        /**
                         * Sets [Builder.content] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.content] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun content(content: JsonField<String>) = apply { this.content = content }

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
                         * Returns an immutable instance of [Fallback].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .role()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Fallback =
                            Fallback(
                                checkRequired("role", role),
                                content,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Fallback = apply {
                        if (validated) {
                            return@apply
                        }

                        role().validate()
                        content()
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
                        (role.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (content.asKnown().isPresent) 1 else 0)

                    class Role
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

                            @JvmField val MODEL = of("model")

                            @JvmStatic fun of(value: String) = Role(JsonField.of(value))
                        }

                        /** An enum containing [Role]'s known values. */
                        enum class Known {
                            MODEL
                        }

                        /**
                         * An enum containing [Role]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Role] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            MODEL,
                            /**
                             * An enum member indicating that [Role] was instantiated with an
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
                                MODEL -> Value.MODEL
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
                                MODEL -> Known.MODEL
                                else -> throw BraintrustInvalidDataException("Unknown Role: $value")
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

                        private var validated: Boolean = false

                        fun validate(): Role = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                    override fun toString() =
                        "Fallback{role=$role, content=$content, additionalProperties=$additionalProperties}"
                }
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val CHAT = of("chat")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CHAT
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CHAT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                 *   known member.
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
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BraintrustInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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

            override fun toString() =
                "Chat{messages=$messages, type=$type, tools=$tools, additionalProperties=$additionalProperties}"
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

        fun function(): Optional<Function> = Optional.ofNullable(function)

        fun global(): Optional<Global> = Optional.ofNullable(global)

        fun isFunction(): Boolean = function != null

        fun isGlobal(): Boolean = global != null

        fun asFunction(): Function = function.getOrThrow("function")

        fun asGlobal(): Global = global.getOrThrow("global")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                function != null -> visitor.visitFunction(function)
                global != null -> visitor.visitGlobal(global)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): ToolFunction = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitFunction(function: Function) {
                        function.validate()
                    }

                    override fun visitGlobal(global: Global) {
                        global.validate()
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
                    override fun visitFunction(function: Function) = function.validity()

                    override fun visitGlobal(global: Global) = global.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

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

            @JvmStatic fun ofFunction(function: Function) = ToolFunction(function = function)

            @JvmStatic fun ofGlobal(global: Global) = ToolFunction(global = global)
        }

        /**
         * An interface that defines how to map each variant of [ToolFunction] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitFunction(function: Function): T

            fun visitGlobal(global: Global): T

            /**
             * Maps an unknown variant of [ToolFunction] to a value of type [T].
             *
             * An instance of [ToolFunction] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Function>())?.let {
                                ToolFunction(function = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Global>())?.let {
                                ToolFunction(global = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> ToolFunction(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<ToolFunction>(ToolFunction::class) {

            override fun serialize(
                value: ToolFunction,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.function != null -> generator.writeObject(value.function)
                    value.global != null -> generator.writeObject(value.global)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ToolFunction")
                }
            }
        }

        class Function
        private constructor(
            private val id: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(id, type, mutableMapOf())

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [Function].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Function]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(function: Function) = apply {
                    id = function.id
                    type = function.type
                    additionalProperties = function.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Function].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Function =
                    Function(
                        checkRequired("id", id),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Function = apply {
                if (validated) {
                    return@apply
                }

                id()
                type().validate()
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
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val FUNCTION = of("function")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    FUNCTION
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FUNCTION,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                 *   known member.
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
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BraintrustInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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

            override fun toString() =
                "Function{id=$id, type=$type, additionalProperties=$additionalProperties}"
        }

        class Global
        private constructor(
            private val name: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(name, type, mutableMapOf())

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws BraintrustInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [Global].
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Global]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(global: Global) = apply {
                    name = global.name
                    type = global.type
                    additionalProperties = global.additionalProperties.toMutableMap()
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Global].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Global =
                    Global(
                        checkRequired("name", name),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Global = apply {
                if (validated) {
                    return@apply
                }

                name()
                type().validate()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val GLOBAL = of("global")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    GLOBAL
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GLOBAL,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                 *   known member.
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
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        BraintrustInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
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

            override fun toString() =
                "Global{name=$name, type=$type, additionalProperties=$additionalProperties}"
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

    override fun toString() =
        "PromptData{options=$options, origin=$origin, parser=$parser, prompt=$prompt, toolFunctions=$toolFunctions, additionalProperties=$additionalProperties}"
}
