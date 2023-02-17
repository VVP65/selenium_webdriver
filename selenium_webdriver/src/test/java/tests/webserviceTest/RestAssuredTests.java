package tests.webserviceTest;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import models.user.User;
import org.testng.annotations.Test;
import tests.BaseTest;

import static io.restassured.RestAssured.when;
import static org.assertj.core.api.Assertions.assertThat;

public class RestAssuredTests extends BaseTest {

    @Test
    public void statusCodeCheck() {
        Response response = when()
                .get("/users")
                .andReturn();
        assertThat(response.getStatusCode()).isEqualTo(200);
    }

    @Test
    public void headerResponseCheck() {
        Response response = when()
                .get("/users")
                .andReturn();
        String responseContentTypeHeader = response.getHeader("Content-Type");
        assertThat(responseContentTypeHeader).isEqualTo("application/json; charset=utf-8");
    }

    @Test
    public void bodyResponseCheck() {
        Response response = when()
                .get("/users")
                .andReturn();
        ResponseBody responseBody = response.getBody();
        User[] users = responseBody.as(User[].class);
        assertThat(users).hasSize(10);
    }
}