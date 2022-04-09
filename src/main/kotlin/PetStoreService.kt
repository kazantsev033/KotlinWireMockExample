import io.restassured.RestAssured.*
import io.restassured.builder.RequestSpecBuilder
import io.restassured.specification.RequestSpecification

class PetStoreService {
    private val baseUrl = "https://petstore.swagger.io/v2/"
    private val requestSpecification: RequestSpecification = RequestSpecBuilder()
        .setBaseUri(baseUrl)
        .addHeader("accept","application/json")
        .addHeader("Content-Type", "application/json")
        .build()

    fun getPetById(id:Int):Pet {
        return given()
                .spec(requestSpecification)
            .`when`()
                .get("pet/$id")
                .body()
                .`as`(Pet::class.java)
    }
}