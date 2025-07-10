package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class FirstApiTest {
    @Test
    public void getUsers(){
        Response res =
                RestAssured.get("https://reqres.in/api/users/2");
        res.then().statusCode(200).body("data.id",

                equalTo(2));
System.out.println(res.asString());
    }
}
