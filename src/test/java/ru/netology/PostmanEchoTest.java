package ru.netology;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    void shouldPost(){
        given()
                .baseUri("https://postman-echo.com")
                .body("hello")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("post", equalTo("hello"));

    }
}






