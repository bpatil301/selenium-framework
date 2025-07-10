package apiTest;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostAPITest {

    @Test
    public void testCreateUser()
    {
        String requestBody = "{\name\":\"Bhagyashri\",\"job\":\"Tester\"}";
        Response response = given().contentType(contentType.JSON).body(requestBody).when().post("https://reqres.in/api/users");
        System.out.println(response.asString());
        response.then().statusCode(201);
    }
}
