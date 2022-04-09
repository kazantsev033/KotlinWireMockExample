import org.junit.jupiter.api.Test

class WireMockTest {
    private val petStoreService:PetStoreService = PetStoreService();

    @Test
    fun `simple test`() {
        val pet = petStoreService.getPetById(1);
    }
}