package tests.webserviceTest;

import models.user.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class RestTemplateTests extends BaseTest {

    @Test
    public void statusCodeCheck() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<User[]> response = restTemplate.getForEntity("http://jsonplaceholder.typicode.com/users", User[].class);
        int actualStatusCode = response.getStatusCode().value();
        assertThat(actualStatusCode).isEqualTo(200);
    }

    @Test
    public void headerResponseCheck() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<User[]> response = restTemplate.getForEntity("http://jsonplaceholder.typicode.com/users", User[].class);
        HttpHeaders headers = response.getHeaders();

        String actualContentTypeValue = Objects.requireNonNull(headers.getContentType()).toString();
        assertThat(actualContentTypeValue).isEqualTo("application/json;charset=utf-8");
    }

    @Test()
    public void bodyResponseCheck() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<User[]> response = restTemplate.getForEntity("http://jsonplaceholder.typicode.com/users", User[].class);
        User[] userId = response.getBody();

        assert userId != null;
        assertThat(userId).hasSize(10);
    }
}