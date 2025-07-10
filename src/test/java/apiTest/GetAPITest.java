package apiTest;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetAPITest {

    @Test
    public  void testGetUser()
    {
        Respose respose = RestAssured.get("https://reqres.in/api/user?page=2");

        //Print response

        System.out.println(response.asString());

        //Validation

        Assert.assertEquals(respose.getStatusCode(),200);

        Assert.assertTrue(response.asString().contains("total"));

    }
}

