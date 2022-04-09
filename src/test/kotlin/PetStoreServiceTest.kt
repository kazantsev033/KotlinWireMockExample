import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.Test
import service.PetStoreService


@WireMockTest(proxyMode = true)
class PetStoreServiceTest {
    private val petStoreService: PetStoreService = PetStoreService()

    @Test
    fun `simple test`() {
        stubFor(get(urlMatching("\\/v2\\/pet\\/\\d+\$"))
            .willReturn(aResponse()
                .withStatus(200)
                .withBody("{\"serviceStatus\": \"running\"}")
        ))

        val response = petStoreService.getPetById(1).body().asString()
    }
}