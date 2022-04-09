package service

import Pet
import io.restassured.RestAssured.*
import io.restassured.builder.RequestSpecBuilder
import io.restassured.response.Response
import io.restassured.specification.RequestSpecification

class PetStoreService {
    private val baseUrl = "https://petstore.swagger.io/v2/"
    private val requestSpecification: RequestSpecification = RequestSpecBuilder()
        .setBaseUri(baseUrl)
        .addHeader("accept","application/json")
        .addHeader("Content-Type", "application/json")
        .setRelaxedHTTPSValidation()
        .build()

    fun getPetById(id:Int): Response {
        return given()
                .spec(requestSpecification)
            .`when`()
                .get("pet/$id")
    }
}