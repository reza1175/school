package application;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class SchoolApplicationTest {

    @Test
    void simple_Rest_Assured() {
        given()
                .baseUri("https://google.apimetrics.xyz")
                .when()
                .get("/html")
                .then()
                .statusCode(200);
    }

}