package utils;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiUtils {

    public static Response getRequest(String endpoint) {
        return given().get(endpoint);
    }

    public static Response postRequest(String endpoint, String body) {
        return given().header("Content-Type", "application/json").body(body).post(endpoint);
    }
}
}
