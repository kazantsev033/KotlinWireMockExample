import org.junit.jupiter.api.Test
import service.PetStoreService

class PetStoreServiceTest {
    private val petStoreService: PetStoreService = PetStoreService();

    @Test
    fun `simple test`() {
        val pet = petStoreService.getPetById(1);
    }
}