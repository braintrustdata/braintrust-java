// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.toImmutable
import com.braintrustdata.api.errors.BraintrustInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CrossObjectInsertResponse
private constructor(
    private val dataset: JsonField<Dataset>,
    private val experiment: JsonField<Experiment>,
    private val projectLogs: JsonField<ProjectLogs>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dataset") @ExcludeMissing dataset: JsonField<Dataset> = JsonMissing.of(),
        @JsonProperty("experiment")
        @ExcludeMissing
        experiment: JsonField<Experiment> = JsonMissing.of(),
        @JsonProperty("project_logs")
        @ExcludeMissing
        projectLogs: JsonField<ProjectLogs> = JsonMissing.of(),
    ) : this(dataset, experiment, projectLogs, mutableMapOf())

    /**
     * A mapping from dataset id to row ids for inserted `events`
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataset(): Optional<Dataset> = dataset.getOptional("dataset")

    /**
     * A mapping from experiment id to row ids for inserted `events`
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun experiment(): Optional<Experiment> = experiment.getOptional("experiment")

    /**
     * A mapping from project id to row ids for inserted `events`
     *
     * @throws BraintrustInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projectLogs(): Optional<ProjectLogs> = projectLogs.getOptional("project_logs")

    /**
     * Returns the raw JSON value of [dataset].
     *
     * Unlike [dataset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataset") @ExcludeMissing fun _dataset(): JsonField<Dataset> = dataset

    /**
     * Returns the raw JSON value of [experiment].
     *
     * Unlike [experiment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("experiment")
    @ExcludeMissing
    fun _experiment(): JsonField<Experiment> = experiment

    /**
     * Returns the raw JSON value of [projectLogs].
     *
     * Unlike [projectLogs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project_logs")
    @ExcludeMissing
    fun _projectLogs(): JsonField<ProjectLogs> = projectLogs

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
         * Returns a mutable builder for constructing an instance of [CrossObjectInsertResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CrossObjectInsertResponse]. */
    class Builder internal constructor() {

        private var dataset: JsonField<Dataset> = JsonMissing.of()
        private var experiment: JsonField<Experiment> = JsonMissing.of()
        private var projectLogs: JsonField<ProjectLogs> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(crossObjectInsertResponse: CrossObjectInsertResponse) = apply {
            dataset = crossObjectInsertResponse.dataset
            experiment = crossObjectInsertResponse.experiment
            projectLogs = crossObjectInsertResponse.projectLogs
            additionalProperties = crossObjectInsertResponse.additionalProperties.toMutableMap()
        }

        /** A mapping from dataset id to row ids for inserted `events` */
        fun dataset(dataset: Dataset?) = dataset(JsonField.ofNullable(dataset))

        /** Alias for calling [Builder.dataset] with `dataset.orElse(null)`. */
        fun dataset(dataset: Optional<Dataset>) = dataset(dataset.getOrNull())

        /**
         * Sets [Builder.dataset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataset] with a well-typed [Dataset] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dataset(dataset: JsonField<Dataset>) = apply { this.dataset = dataset }

        /** A mapping from experiment id to row ids for inserted `events` */
        fun experiment(experiment: Experiment?) = experiment(JsonField.ofNullable(experiment))

        /** Alias for calling [Builder.experiment] with `experiment.orElse(null)`. */
        fun experiment(experiment: Optional<Experiment>) = experiment(experiment.getOrNull())

        /**
         * Sets [Builder.experiment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.experiment] with a well-typed [Experiment] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun experiment(experiment: JsonField<Experiment>) = apply { this.experiment = experiment }

        /** A mapping from project id to row ids for inserted `events` */
        fun projectLogs(projectLogs: ProjectLogs?) = projectLogs(JsonField.ofNullable(projectLogs))

        /** Alias for calling [Builder.projectLogs] with `projectLogs.orElse(null)`. */
        fun projectLogs(projectLogs: Optional<ProjectLogs>) = projectLogs(projectLogs.getOrNull())

        /**
         * Sets [Builder.projectLogs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectLogs] with a well-typed [ProjectLogs] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun projectLogs(projectLogs: JsonField<ProjectLogs>) = apply {
            this.projectLogs = projectLogs
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
         * Returns an immutable instance of [CrossObjectInsertResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CrossObjectInsertResponse =
            CrossObjectInsertResponse(
                dataset,
                experiment,
                projectLogs,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CrossObjectInsertResponse = apply {
        if (validated) {
            return@apply
        }

        dataset().ifPresent { it.validate() }
        experiment().ifPresent { it.validate() }
        projectLogs().ifPresent { it.validate() }
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
        (dataset.asKnown().getOrNull()?.validity() ?: 0) +
            (experiment.asKnown().getOrNull()?.validity() ?: 0) +
            (projectLogs.asKnown().getOrNull()?.validity() ?: 0)

    /** A mapping from dataset id to row ids for inserted `events` */
    class Dataset
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

            /** Returns a mutable builder for constructing an instance of [Dataset]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Dataset]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dataset: Dataset) = apply {
                additionalProperties = dataset.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Dataset].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Dataset = Dataset(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Dataset = apply {
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

            return /* spotless:off */ other is Dataset && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Dataset{additionalProperties=$additionalProperties}"
    }

    /** A mapping from experiment id to row ids for inserted `events` */
    class Experiment
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

            /** Returns a mutable builder for constructing an instance of [Experiment]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Experiment]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(experiment: Experiment) = apply {
                additionalProperties = experiment.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Experiment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Experiment = Experiment(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Experiment = apply {
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

            return /* spotless:off */ other is Experiment && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Experiment{additionalProperties=$additionalProperties}"
    }

    /** A mapping from project id to row ids for inserted `events` */
    class ProjectLogs
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

            /** Returns a mutable builder for constructing an instance of [ProjectLogs]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ProjectLogs]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(projectLogs: ProjectLogs) = apply {
                additionalProperties = projectLogs.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ProjectLogs].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ProjectLogs = ProjectLogs(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ProjectLogs = apply {
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

            return /* spotless:off */ other is ProjectLogs && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "ProjectLogs{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CrossObjectInsertResponse && dataset == other.dataset && experiment == other.experiment && projectLogs == other.projectLogs && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(dataset, experiment, projectLogs, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CrossObjectInsertResponse{dataset=$dataset, experiment=$experiment, projectLogs=$projectLogs, additionalProperties=$additionalProperties}"
}
