// File generated from our OpenAPI spec by Stainless.

package com.braintrustdata.api.services

import com.braintrustdata.api.client.BraintrustClient
import com.braintrustdata.api.client.okhttp.BraintrustOkHttpClient
import com.braintrustdata.api.core.JsonString
import com.braintrustdata.api.core.http.Headers
import com.braintrustdata.api.core.jsonMapper
import com.braintrustdata.api.errors.BadRequestException
import com.braintrustdata.api.errors.BraintrustError
import com.braintrustdata.api.errors.BraintrustException
import com.braintrustdata.api.errors.InternalServerException
import com.braintrustdata.api.errors.NotFoundException
import com.braintrustdata.api.errors.PermissionDeniedException
import com.braintrustdata.api.errors.RateLimitException
import com.braintrustdata.api.errors.UnauthorizedException
import com.braintrustdata.api.errors.UnexpectedStatusCodeException
import com.braintrustdata.api.errors.UnprocessableEntityException
import com.braintrustdata.api.models.*
import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.put
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val BRAINTRUST_ERROR: BraintrustError =
        BraintrustError.builder().putAdditionalProperty("key", JsonString.of("value")).build()

    private lateinit var client: BraintrustClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            BraintrustOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun projectsCreate200() {
        val params = ProjectCreateParams.builder().name("name").orgName("org_name").build()

        val expected =
            Project.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .orgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .settings(ProjectSettings.builder().comparisonKey("comparison_key").build())
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        stubFor(post(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.projects().create(params)).isEqualTo(expected)
    }

    @Test
    fun projectsCreate400() {
        val params = ProjectCreateParams.builder().name("name").orgName("org_name").build()

        stubFor(
            post(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(BRAINTRUST_ERROR)))
        )

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, Headers.builder().put("Foo", "Bar").build(), BRAINTRUST_ERROR)
            })
    }

    @Test
    fun projectsCreate401() {
        val params = ProjectCreateParams.builder().name("name").orgName("org_name").build()

        stubFor(
            post(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(BRAINTRUST_ERROR)))
        )

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertUnauthorized(e, Headers.builder().put("Foo", "Bar").build(), BRAINTRUST_ERROR)
            })
    }

    @Test
    fun projectsCreate403() {
        val params = ProjectCreateParams.builder().name("name").orgName("org_name").build()

        stubFor(
            post(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(BRAINTRUST_ERROR)))
        )

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertPermissionDenied(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    BRAINTRUST_ERROR
                )
            })
    }

    @Test
    fun projectsCreate404() {
        val params = ProjectCreateParams.builder().name("name").orgName("org_name").build()

        stubFor(
            post(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(BRAINTRUST_ERROR)))
        )

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertNotFound(e, Headers.builder().put("Foo", "Bar").build(), BRAINTRUST_ERROR)
            })
    }

    @Test
    fun projectsCreate422() {
        val params = ProjectCreateParams.builder().name("name").orgName("org_name").build()

        stubFor(
            post(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(BRAINTRUST_ERROR)))
        )

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    BRAINTRUST_ERROR
                )
            })
    }

    @Test
    fun projectsCreate429() {
        val params = ProjectCreateParams.builder().name("name").orgName("org_name").build()

        stubFor(
            post(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(BRAINTRUST_ERROR)))
        )

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertRateLimit(e, Headers.builder().put("Foo", "Bar").build(), BRAINTRUST_ERROR)
            })
    }

    @Test
    fun projectsCreate500() {
        val params = ProjectCreateParams.builder().name("name").orgName("org_name").build()

        stubFor(
            post(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(BRAINTRUST_ERROR)))
        )

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertInternalServer(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    BRAINTRUST_ERROR
                )
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params = ProjectCreateParams.builder().name("name").orgName("org_name").build()

        stubFor(
            post(anyUrl())
                .willReturn(status(999).withHeader("Foo", "Bar").withBody(toJson(BRAINTRUST_ERROR)))
        )

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    Headers.builder().put("Foo", "Bar").build(),
                    toJson(BRAINTRUST_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
        val params = ProjectCreateParams.builder().name("name").orgName("org_name").build()

        stubFor(post(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(BraintrustException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
        val params = ProjectCreateParams.builder().name("name").orgName("org_name").build()

        stubFor(post(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, Headers.builder().build(), BraintrustError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: Headers,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertBadRequest(throwable: Throwable, headers: Headers, error: BraintrustError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnauthorized(throwable: Throwable, headers: Headers, error: BraintrustError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: Headers,
        error: BraintrustError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertNotFound(throwable: Throwable, headers: Headers, error: BraintrustError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: Headers,
        error: BraintrustError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertRateLimit(throwable: Throwable, headers: Headers, error: BraintrustError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertInternalServer(
        throwable: Throwable,
        headers: Headers,
        error: BraintrustError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
