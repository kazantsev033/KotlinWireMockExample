import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.Test
import service.PetStoreService


@WireMockTest(proxyMode = true, httpsEnabled = true)
class PetStoreServiceTest {
    private val petStoreService: PetStoreService = PetStoreService()

    @Test
    fun `simple test`() {
        stubFor(get("/v2/pet/1")
            .withHost(equalTo("petstore.swagger.io"))
            .willReturn(aResponse()
                .withStatus(200)
                .withBody("{\"serviceStatus\": \"running\"}")
        ))

        val response = petStoreService.getPetById(1).body().asString()
    }
}