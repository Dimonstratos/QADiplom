package data;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.options;

public class RestApiHelper {
    public static RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri(System.getProperty("sut.url"))
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.JSON)
            .log(LogDetail.ALL)
            .build();

    public static String paymentRequestApproved (Card card, String path) {
        return given()
                .spec(requestSpec)
                .body(card)
                .when()
                .post(path)
                .then()
                .statusCode(200)
                .extract().response().asString();
    }

    public static String paymentRequestDeclined (Card card, String path) {
        return given()
                .spec(requestSpec)
                .body(card)
                .when()
                .post(path)
                .then()
                .statusCode(400)
                .extract().response().asString();
    }

}