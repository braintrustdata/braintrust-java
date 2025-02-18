// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.models

import com.braintrustdata.api.core.ExcludeMissing
import com.braintrustdata.api.core.JsonField
import com.braintrustdata.api.core.JsonMissing
import com.braintrustdata.api.core.JsonValue
import com.braintrustdata.api.core.NoAutoDetect
import com.braintrustdata.api.core.immutableEmptyMap
import com.braintrustdata.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class CrossObjectInsertResponse
@JsonCreator
private constructor(
    @JsonProperty("dataset")
    @ExcludeMissing
    private val dataset: JsonField<Dataset> = JsonMissing.of(),
    @JsonProperty("experiment")
    @ExcludeMissing
    private val experiment: JsonField<Experiment> = JsonMissing.of(),
    @JsonProperty("project_logs")
    @ExcludeMissing
    private val projectLogs: JsonField<ProjectLogs> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** A mapping from dataset id to row ids for inserted `events` */
    fun dataset(): Optional<Dataset> = Optional.ofNullable(dataset.getNullable("dataset"))

    /** A mapping from experiment id to row ids for inserted `events` */
    fun experiment(): Optional<Experiment> =
        Optional.ofNullable(experiment.getNullable("experiment"))

    /** A mapping from project id to row ids for inserted `events` */
    fun projectLogs(): Optional<ProjectLogs> =
        Optional.ofNullable(projectLogs.getNullable("project_logs"))

    /** A mapping from dataset id to row ids for inserted `events` */
    @JsonProperty("dataset") @ExcludeMissing fun _dataset(): JsonField<Dataset> = dataset

    /** A mapping from experiment id to row ids for inserted `events` */
    @JsonProperty("experiment")
    @ExcludeMissing
    fun _experiment(): JsonField<Experiment> = experiment

    /** A mapping from project id to row ids for inserted `events` */
    @JsonProperty("project_logs")
    @ExcludeMissing
    fun _projectLogs(): JsonField<ProjectLogs> = projectLogs

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

    fun toBuilder() = Builder().from(this)

    companion object {

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

        /** A mapping from dataset id to row ids for inserted `events` */
        fun dataset(dataset: Optional<Dataset>) = dataset(dataset.orElse(null))

        /** A mapping from dataset id to row ids for inserted `events` */
        fun dataset(dataset: JsonField<Dataset>) = apply { this.dataset = dataset }

        /** A mapping from experiment id to row ids for inserted `events` */
        fun experiment(experiment: Experiment?) = experiment(JsonField.ofNullable(experiment))

        /** A mapping from experiment id to row ids for inserted `events` */
        fun experiment(experiment: Optional<Experiment>) = experiment(experiment.orElse(null))

        /** A mapping from experiment id to row ids for inserted `events` */
        fun experiment(experiment: JsonField<Experiment>) = apply { this.experiment = experiment }

        /** A mapping from project id to row ids for inserted `events` */
        fun projectLogs(projectLogs: ProjectLogs?) = projectLogs(JsonField.ofNullable(projectLogs))

        /** A mapping from project id to row ids for inserted `events` */
        fun projectLogs(projectLogs: Optional<ProjectLogs>) = projectLogs(projectLogs.orElse(null))

        /** A mapping from project id to row ids for inserted `events` */
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

        fun build(): CrossObjectInsertResponse =
            CrossObjectInsertResponse(
                dataset,
                experiment,
                projectLogs,
                additionalProperties.toImmutable(),
            )
    }

    /** A mapping from dataset id to row ids for inserted `events` */
    @NoAutoDetect
    class Dataset
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Dataset = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun build(): Dataset = Dataset(additionalProperties.toImmutable())
        }

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
    @NoAutoDetect
    class Experiment
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Experiment = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun build(): Experiment = Experiment(additionalProperties.toImmutable())
        }

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
    @NoAutoDetect
    class ProjectLogs
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ProjectLogs = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun build(): ProjectLogs = ProjectLogs(additionalProperties.toImmutable())
        }

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
