package service

import Pet
import io.qameta.allure.restassured.AllureRestAssured
import io.restassured.RestAssured.*
import io.restassured.builder.RequestSpecBuilder
import io.restassured.response.Response
import io.restassured.specification.RequestSpecification

class PetStoreService {
    private val baseUrl = "http://petstore.swagger.io/v2/"
    private val requestSpecification: RequestSpecification = RequestSpecBuilder()
        .setBaseUri(baseUrl)
        .addHeader("accept","application/json")
        .addHeader("Content-Type", "application/json")
        .addFilter(AllureRestAssured())
        .build()

    fun getPetById(id:Int): Response {
        return given()
                .spec(requestSpecification)
            .`when`()
                .get("pet/$id")
    }
}